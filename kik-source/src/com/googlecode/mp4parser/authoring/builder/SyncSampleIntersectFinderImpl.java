// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.OriginalFormatBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.SampleEntry;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.util.Math;
import com.googlecode.mp4parser.util.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

// Referenced classes of package com.googlecode.mp4parser.authoring.builder:
//            FragmentIntersectionFinder

public class SyncSampleIntersectFinderImpl
    implements FragmentIntersectionFinder
{
    public static class CacheTuple
    {

        Movie movie;
        Track track;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (CacheTuple)obj;
                if (movie == null ? ((CacheTuple) (obj)).movie != null : !movie.equals(((CacheTuple) (obj)).movie))
                {
                    return false;
                }
                if (track == null ? ((CacheTuple) (obj)).track != null : !track.equals(((CacheTuple) (obj)).track))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (track != null)
            {
                i = track.hashCode();
            } else
            {
                i = 0;
            }
            if (movie != null)
            {
                j = movie.hashCode();
            }
            return i * 31 + j;
        }

        public CacheTuple(Track track1, Movie movie1)
        {
            track = track1;
            movie = movie1;
        }
    }


    private static Logger LOG = Logger.getLogger(com/googlecode/mp4parser/authoring/builder/SyncSampleIntersectFinderImpl.getName());
    private static Map getSampleNumbersCache = new ConcurrentHashMap();
    private static Map getTimesCache = new ConcurrentHashMap();
    private final int minFragmentDurationSeconds;
    private Movie movie;
    private Track referenceTrack;

    public SyncSampleIntersectFinderImpl(Movie movie1, Track track, int i)
    {
        movie = movie1;
        referenceTrack = track;
        minFragmentDurationSeconds = i;
    }

    private static long calculateTracktimesScalingFactor(Movie movie1, Track track)
    {
        movie1 = movie1.getTracks().iterator();
        long l = 1L;
        do
        {
            Track track1;
            do
            {
                if (!movie1.hasNext())
                {
                    return l;
                }
                track1 = (Track)movie1.next();
            } while (!track1.getHandler().equals(track.getHandler()) || track1.getTrackMetaData().getTimescale() == track.getTrackMetaData().getTimescale());
            l = Math.lcm(l, track1.getTrackMetaData().getTimescale());
        } while (true);
    }

    static String getFormat(Track track)
    {
label0:
        {
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry abstractsampleentry = track.getSampleDescriptionBox().getSampleEntry();
            String s = abstractsampleentry.getType();
            if (!s.equals("encv") && !s.equals("enca"))
            {
                track = s;
                if (!s.equals("encv"))
                {
                    break label0;
                }
            }
            track = ((OriginalFormatBox)Path.getPath(abstractsampleentry, "sinf/frma")).getDataFormat();
        }
        return track;
    }

    public static List getSyncSamplesTimestamps(Movie movie1, Track track)
    {
        LinkedList linkedlist = new LinkedList();
        Iterator iterator = movie1.getTracks().iterator();
        do
        {
            Track track1;
            long al[];
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        return linkedlist;
                    }
                    track1 = (Track)iterator.next();
                } while (!track1.getHandler().equals(track.getHandler()));
                al = track1.getSyncSamples();
            } while (al == null || al.length <= 0);
            linkedlist.add(getTimes(track1, movie1));
        } while (true);
    }

    private static long[] getTimes(Track track, Movie movie1)
    {
        long al[] = track.getSyncSamples();
        long al1[] = new long[al.length];
        int i = 1;
        long l = 0L;
        int j = 0;
        long l1 = calculateTracktimesScalingFactor(movie1, track);
        do
        {
            if ((long)i >= al[al.length - 1])
            {
                return al1;
            }
            int k = j;
            if ((long)i == al[j])
            {
                al1[j] = l * l1;
                k = j + 1;
            }
            l += track.getSampleDurations()[i];
            i++;
            j = k;
        } while (true);
    }

    public transient long[] getCommonIndices(long al[], long al1[], long l, long al2[][])
    {
        LinkedList linkedlist;
        LinkedList linkedlist1;
        int i;
        linkedlist = new LinkedList();
        linkedlist1 = new LinkedList();
        i = 0;
_L5:
        if (i < al1.length) goto _L2; else goto _L1
_L1:
        if ((double)linkedlist.size() >= (double)al.length * 0.25D)
        {
            break MISSING_BLOCK_LABEL_430;
        }
        al1 = (new StringBuilder(String.valueOf(""))).append(String.format("%5d - Common:  [", new Object[] {
            Integer.valueOf(linkedlist.size())
        })).toString();
        al2 = linkedlist.iterator();
_L7:
        if (al2.hasNext()) goto _L4; else goto _L3
_L3:
        int j;
        al1 = (new StringBuilder(String.valueOf(al1))).append("]").toString();
        LOG.warning(al1);
        al1 = (new StringBuilder(String.valueOf(""))).append(String.format("%5d - In    :  [", new Object[] {
            Integer.valueOf(al.length)
        })).toString();
        j = al.length;
        i = 0;
_L8:
        if (i >= j)
        {
            al = (new StringBuilder(String.valueOf(al1))).append("]").toString();
            LOG.warning(al);
            LOG.warning("There are less than 25% of common sync samples in the given track.");
            throw new RuntimeException("There are less than 25% of common sync samples in the given track.");
        }
        break MISSING_BLOCK_LABEL_382;
_L2:
        boolean flag;
        int k;
        k = al2.length;
        flag = true;
        j = 0;
_L6:
label0:
        {
            if (j < k)
            {
                break label0;
            }
            if (flag)
            {
                linkedlist.add(Long.valueOf(al[i]));
                linkedlist1.add(Long.valueOf(al1[i]));
            }
            i++;
        }
          goto _L5
        boolean flag1;
        if (Arrays.binarySearch(al2[j], al1[i]) >= 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag &= flag1;
        j++;
          goto _L6
_L4:
        l = ((Long)al2.next()).longValue();
        al1 = (new StringBuilder(String.valueOf(al1))).append(String.format("%10d,", new Object[] {
            Long.valueOf(l)
        })).toString();
          goto _L7
        l = al[i];
        al1 = (new StringBuilder(String.valueOf(al1))).append(String.format("%10d,", new Object[] {
            Long.valueOf(l)
        })).toString();
        i++;
          goto _L8
        long l1;
        if ((double)linkedlist.size() < (double)al.length * 0.5D)
        {
            LOG.fine("There are less than 50% of common sync samples in the given track. This is implausible but I'm ok to continue.");
        } else
        if (linkedlist.size() < al.length)
        {
            LOG.finest((new StringBuilder("Common SyncSample positions vs. this tracks SyncSample positions: ")).append(linkedlist.size()).append(" vs. ").append(al.length).toString());
        }
        al = new LinkedList();
        if (minFragmentDurationSeconds <= 0) goto _L10; else goto _L9
_L9:
        al1 = linkedlist.iterator();
        al2 = linkedlist1.iterator();
        l1 = -1L;
_L13:
        if (al1.hasNext() && al2.hasNext()) goto _L12; else goto _L11
_L11:
        al1 = new long[al.size()];
        i = 0;
_L14:
        if (i >= al1.length)
        {
            return al1;
        }
        break MISSING_BLOCK_LABEL_666;
_L12:
        long l3 = ((Long)al1.next()).longValue();
        long l2 = ((Long)al2.next()).longValue();
        if (l1 == -1L || (l2 - l1) / l >= (long)minFragmentDurationSeconds)
        {
            al.add(Long.valueOf(l3));
            l1 = l2;
        }
          goto _L13
_L10:
        al = linkedlist;
          goto _L11
        al1[i] = ((Long)al.get(i)).longValue();
        i++;
          goto _L14
    }

    public long[] sampleNumbers(Track track)
    {
        CacheTuple cachetuple;
        cachetuple = new CacheTuple(track, movie);
        long al[] = (long[])getSampleNumbersCache.get(cachetuple);
        if (al != null)
        {
            return al;
        }
        if ("vide".equals(track.getHandler()))
        {
            if (track.getSyncSamples() != null && track.getSyncSamples().length > 0)
            {
                List list = getSyncSamplesTimestamps(movie, track);
                track = getCommonIndices(track.getSyncSamples(), getTimes(track, movie), track.getTrackMetaData().getTimescale(), (long[][])list.toArray(new long[list.size()][]));
                getSampleNumbersCache.put(cachetuple, track);
                return track;
            } else
            {
                throw new RuntimeException("Video Tracks need sync samples. Only tracks other than video may have no sync samples.");
            }
        }
        if (!"soun".equals(track.getHandler())) goto _L2; else goto _L1
_L1:
        if (referenceTrack != null) goto _L4; else goto _L3
_L3:
        long al1[] = movie.getTracks().iterator();
_L16:
        if (al1.hasNext()) goto _L5; else goto _L4
_L4:
        if (referenceTrack == null) goto _L7; else goto _L6
_L6:
        Object obj;
        Iterator iterator1;
        int i;
        long l;
        obj = sampleNumbers(referenceTrack);
        i = referenceTrack.getSamples().size();
        al1 = new long[obj.length];
        l = 0x2ee00L;
        iterator1 = movie.getTracks().iterator();
_L11:
        if (iterator1.hasNext()) goto _L9; else goto _L8
_L5:
        obj = (Track)al1.next();
        if (((Track) (obj)).getSyncSamples() != null && "vide".equals(((Track) (obj)).getHandler()) && ((Track) (obj)).getSyncSamples().length > 0)
        {
            referenceTrack = ((Track) (obj));
        }
        continue; /* Loop/switch isn't completed */
_L9:
        track2 = (Track)iterator1.next();
        if (!getFormat(track).equals(getFormat(track2))) goto _L11; else goto _L10
_L10:
        audiosampleentry = (AudioSampleEntry)track2.getSampleDescriptionBox().getSampleEntry();
        if (audiosampleentry.getSampleRate() >= 0x2ee00L) goto _L11; else goto _L12
_L12:
        l1 = audiosampleentry.getSampleRate();
        d = (double)(long)track2.getSamples().size() / (double)i;
        l2 = track2.getSampleDurations()[0];
        i = 0;
_L14:
        l = l1;
        if (i >= al1.length) goto _L8; else goto _L13
_L13:
        al1[i] = (long)Math.ceil((double)(obj[i] - 1L) * d * (double)l2);
        i++;
          goto _L14
_L8:
        obj = (AudioSampleEntry)track.getSampleDescriptionBox().getSampleEntry();
        long l1 = track.getSampleDurations()[0];
        double d = (double)((AudioSampleEntry) (obj)).getSampleRate() / (double)l;
        Track track2;
        AudioSampleEntry audiosampleentry;
        long l2;
        if (d != Math.rint(d))
        {
            throw new RuntimeException("Sample rates must be a multiple of the lowest sample rate to create a correct file!");
        }
        i = 0;
        do
        {
            if (i >= al1.length)
            {
                getSampleNumbersCache.put(cachetuple, al1);
                return al1;
            }
            al1[i] = (long)(1.0D + ((double)al1[i] * d) / (double)l1);
            i++;
        } while (true);
_L7:
        throw new RuntimeException("There was absolutely no Track with sync samples. I can't work with that!");
_L2:
        Iterator iterator = movie.getTracks().iterator();
        Track track1;
        do
        {
            if (!iterator.hasNext())
            {
                throw new RuntimeException("There was absolutely no Track with sync samples. I can't work with that!");
            }
            track1 = (Track)iterator.next();
        } while (track1.getSyncSamples() == null || track1.getSyncSamples().length <= 0);
        long al3[] = sampleNumbers(track1);
        int j = track1.getSamples().size();
        long al2[] = new long[al3.length];
        double d1 = (double)(long)track.getSamples().size() / (double)j;
        j = 0;
        do
        {
            if (j >= al2.length)
            {
                getSampleNumbersCache.put(cachetuple, al2);
                return al2;
            }
            al2[j] = (long)Math.ceil((double)(al3[j] - 1L) * d1) + 1L;
            j++;
        } while (true);
        if (true) goto _L16; else goto _L15
_L15:
    }

}
