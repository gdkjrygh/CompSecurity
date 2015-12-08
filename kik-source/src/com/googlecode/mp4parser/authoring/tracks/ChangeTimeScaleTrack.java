// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class ChangeTimeScaleTrack
    implements Track
{

    private static final Logger LOG = Logger.getLogger(com/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack.getName());
    List ctts;
    long decodingTimes[];
    Track source;
    long timeScale;

    public ChangeTimeScaleTrack(Track track, long l, long al[])
    {
        source = track;
        timeScale = l;
        double d = (double)l / (double)track.getTrackMetaData().getTimescale();
        ctts = adjustCtts(track.getCompositionTimeEntries(), d);
        decodingTimes = adjustTts(track.getSampleDurations(), d, al, getTimes(track, al, l));
    }

    static List adjustCtts(List list, double d)
    {
        if (list != null)
        {
            ArrayList arraylist = new ArrayList(list.size());
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    return arraylist;
                }
                com.coremedia.iso.boxes.CompositionTimeToSample.Entry entry = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry)list.next();
                arraylist.add(new com.coremedia.iso.boxes.CompositionTimeToSample.Entry(entry.getCount(), (int)Math.round((double)entry.getOffset() * d)));
            } while (true);
        } else
        {
            return null;
        }
    }

    static long[] adjustTts(long al[], double d, long al1[], long al2[])
    {
        long l = 0L;
        long al3[] = new long[al.length];
        int i = 1;
        do
        {
            if (i > al.length)
            {
                return al3;
            }
            long l2 = Math.round((double)al[i - 1] * d);
            int j = Arrays.binarySearch(al1, i + 1);
            long l1 = l2;
            if (j >= 0)
            {
                l1 = l2;
                if (al2[j] != l)
                {
                    l1 = al2[j] - (l + l2);
                    LOG.finest(String.format("Sample %d %d / %d - correct by %d", new Object[] {
                        Integer.valueOf(i), Long.valueOf(l), Long.valueOf(al2[j]), Long.valueOf(l1)
                    }));
                    l1 = l2 + l1;
                }
            }
            l += l1;
            al3[i - 1] = l1;
            i++;
        } while (true);
    }

    private static long[] getTimes(Track track, long al[], long l)
    {
        long al1[] = new long[al.length];
        int i = 1;
        long l1 = 0L;
        int j = 0;
        do
        {
            if ((long)i > al[al.length - 1])
            {
                return al1;
            }
            int k = j;
            if ((long)i == al[j])
            {
                al1[j] = (l1 * l) / track.getTrackMetaData().getTimescale();
                k = j + 1;
            }
            l1 += track.getSampleDurations()[i - 1];
            i++;
            j = k;
        } while (true);
    }

    public void close()
    {
        source.close();
    }

    public List getCompositionTimeEntries()
    {
        return ctts;
    }

    public long getDuration()
    {
        long l = 0L;
        long al[] = decodingTimes;
        int j = al.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return l;
            }
            l += al[i];
            i++;
        } while (true);
    }

    public List getEdits()
    {
        return source.getEdits();
    }

    public String getHandler()
    {
        return source.getHandler();
    }

    public String getName()
    {
        return (new StringBuilder("timeScale(")).append(source.getName()).append(")").toString();
    }

    public List getSampleDependencies()
    {
        return source.getSampleDependencies();
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        return source.getSampleDescriptionBox();
    }

    public long[] getSampleDurations()
    {
        return decodingTimes;
    }

    public Map getSampleGroups()
    {
        return source.getSampleGroups();
    }

    public List getSamples()
    {
        return source.getSamples();
    }

    public SubSampleInformationBox getSubsampleInformationBox()
    {
        return source.getSubsampleInformationBox();
    }

    public long[] getSyncSamples()
    {
        return source.getSyncSamples();
    }

    public TrackMetaData getTrackMetaData()
    {
        TrackMetaData trackmetadata = (TrackMetaData)source.getTrackMetaData().clone();
        trackmetadata.setTimescale(timeScale);
        return trackmetadata;
    }

    public String toString()
    {
        return (new StringBuilder("ChangeTimeScaleTrack{source=")).append(source).append('}').toString();
    }

}
