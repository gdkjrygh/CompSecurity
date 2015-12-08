// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.DataEntryUrlBox;
import com.coremedia.iso.boxes.DataInformationBox;
import com.coremedia.iso.boxes.DataReferenceBox;
import com.coremedia.iso.boxes.EditBox;
import com.coremedia.iso.boxes.EditListBox;
import com.coremedia.iso.boxes.FileTypeBox;
import com.coremedia.iso.boxes.HandlerBox;
import com.coremedia.iso.boxes.HintMediaHeaderBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.NullMediaHeaderBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.SubtitleMediaHeaderBox;
import com.coremedia.iso.boxes.SyncSampleBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.Edit;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack;
import com.googlecode.mp4parser.boxes.dece.SampleEncryptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Path;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox;
import com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.googlecode.mp4parser.authoring.builder:
//            Mp4Builder, TwoSecondIntersectionFinder, FragmentIntersectionFinder

public class DefaultMp4Builder
    implements Mp4Builder
{
    private class InterleaveChunkMdat
        implements Box
    {

        List chunkList;
        long contentSize;
        Container parent;
        final DefaultMp4Builder this$0;
        List tracks;

        private boolean isSmallBox(long l)
        {
            return 8L + l < 0x100000000L;
        }

        public void getBox(WritableByteChannel writablebytechannel)
        {
            Object obj = ByteBuffer.allocate(16);
            long l = getSize();
            if (isSmallBox(l))
            {
                IsoTypeWriter.writeUInt32(((ByteBuffer) (obj)), l);
            } else
            {
                IsoTypeWriter.writeUInt32(((ByteBuffer) (obj)), 1L);
            }
            ((ByteBuffer) (obj)).put(IsoFile.fourCCtoBytes("mdat"));
            if (isSmallBox(l))
            {
                ((ByteBuffer) (obj)).put(new byte[8]);
            } else
            {
                IsoTypeWriter.writeUInt64(((ByteBuffer) (obj)), l);
            }
            ((ByteBuffer) (obj)).rewind();
            writablebytechannel.write(((ByteBuffer) (obj)));
            obj = chunkList.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    return;
                }
                Iterator iterator = ((List)((Iterator) (obj)).next()).iterator();
                while (iterator.hasNext()) 
                {
                    ((Sample)iterator.next()).writeTo(writablebytechannel);
                }
            } while (true);
        }

        public long getDataOffset()
        {
            Object obj;
            long l;
            l = 16L;
            obj = this;
_L3:
            Iterator iterator;
            if (!(obj instanceof Box))
            {
                return l;
            }
            iterator = ((Box)obj).getParent().getBoxes().iterator();
_L5:
            if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
            Box box;
            obj = ((Box)obj).getParent();
              goto _L3
_L2:
            if (obj == (box = (Box)iterator.next())) goto _L1; else goto _L4
_L4:
            l += box.getSize();
              goto _L5
        }

        public long getOffset()
        {
            throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
        }

        public Container getParent()
        {
            return parent;
        }

        public long getSize()
        {
            return 16L + contentSize;
        }

        public String getType()
        {
            return "mdat";
        }

        public void parse(DataSource datasource, ByteBuffer bytebuffer, long l, BoxParser boxparser)
        {
        }

        public void setParent(Container container)
        {
            parent = container;
        }

        private InterleaveChunkMdat(Movie movie, Map map, long l)
        {
            int i;
            this$0 = DefaultMp4Builder.this;
            super();
            chunkList = new ArrayList();
            contentSize = l;
            tracks = movie.getTracks();
            i = 0;
_L2:
            if (i >= ((int[])map.values().iterator().next()).length)
            {
                return;
            }
            movie = tracks.iterator();
_L3:
label0:
            {
                if (movie.hasNext())
                {
                    break label0;
                }
                i++;
            }
            if (true) goto _L2; else goto _L1
_L1:
            Object obj;
            int ai[];
            int j;
            obj = (Track)movie.next();
            ai = (int[])map.get(obj);
            l = 0L;
            j = 0;
_L4:
label1:
            {
                if (j < i)
                {
                    break label1;
                }
                obj = ((List)track2Sample.get(obj)).subList(CastUtils.l2i(l), CastUtils.l2i(l + (long)ai[i]));
                chunkList.add(obj);
            }
              goto _L3
            l += ai[j];
            j++;
              goto _L4
        }

        InterleaveChunkMdat(Movie movie, Map map, long l, InterleaveChunkMdat interleavechunkmdat)
        {
            this(movie, map, l);
        }
    }


    static final boolean $assertionsDisabled;
    private static Logger LOG = Logger.getLogger(com/googlecode/mp4parser/authoring/builder/DefaultMp4Builder.getName());
    Set chunkOffsetBoxes;
    private FragmentIntersectionFinder intersectionFinder;
    Set sampleAuxiliaryInformationOffsetsBoxes;
    HashMap track2Sample;
    HashMap track2SampleSizes;

    public DefaultMp4Builder()
    {
        chunkOffsetBoxes = new HashSet();
        sampleAuxiliaryInformationOffsetsBoxes = new HashSet();
        track2Sample = new HashMap();
        track2SampleSizes = new HashMap();
    }

    public static long gcd(long l, long l1)
    {
        do
        {
            long l2 = l;
            if (l1 == 0L)
            {
                return l2;
            }
            l = l1;
            l1 = l2 % l1;
        } while (true);
    }

    private static long sum(int ai[])
    {
        long l = 0L;
        int j = ai.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return l;
            }
            l += ai[i];
            i++;
        } while (true);
    }

    private static long sum(long al[])
    {
        long l = 0L;
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

    public Container build(Movie movie)
    {
        Object obj;
        if (intersectionFinder == null)
        {
            intersectionFinder = new TwoSecondIntersectionFinder(movie, 2);
        }
        LOG.fine((new StringBuilder("Creating movie ")).append(movie).toString());
        obj = movie.getTracks().iterator();
_L4:
        Object obj1;
        Object obj2;
        long l;
        BasicContainer basiccontainer;
        if (!((Iterator) (obj)).hasNext())
        {
            basiccontainer = new BasicContainer();
            basiccontainer.addBox(createFileTypeBox(movie));
            obj = new HashMap();
            obj1 = movie.getTracks().iterator();
            break MISSING_BLOCK_LABEL_98;
        }
        obj1 = (Track)((Iterator) (obj)).next();
        list = ((Track) (obj1)).getSamples();
        putSamples(((Track) (obj1)), list);
        obj2 = new long[list.size()];
        i = 0;
_L2:
label0:
        {
            if (i < obj2.length)
            {
                break label0;
            }
            track2SampleSizes.put(obj1, obj2);
        }
        continue; /* Loop/switch isn't completed */
        obj2[i] = ((Sample)list.get(i)).getSize();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        do
        {
            List list;
            int i;
            if (!((Iterator) (obj1)).hasNext())
            {
                obj1 = createMovieBox(movie, ((Map) (obj)));
                basiccontainer.addBox(((Box) (obj1)));
                obj1 = Path.getPaths(((Box) (obj1)), "trak/mdia/minf/stbl/stsz");
                l = 0L;
                obj1 = ((List) (obj1)).iterator();
                break MISSING_BLOCK_LABEL_137;
            }
            obj2 = (Track)((Iterator) (obj1)).next();
            ((Map) (obj)).put(obj2, getChunkSizes(((Track) (obj2)), movie));
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                movie = new InterleaveChunkMdat(movie, ((Map) (obj)), l, null);
                basiccontainer.addBox(movie);
                l = movie.getDataOffset();
                movie = chunkOffsetBoxes.iterator();
                break MISSING_BLOCK_LABEL_182;
            }
            l += sum(((SampleSizeBox)((Iterator) (obj1)).next()).getSampleSizes());
        } while (true);
        do
        {
            if (!movie.hasNext())
            {
                obj2 = sampleAuxiliaryInformationOffsetsBoxes.iterator();
                break MISSING_BLOCK_LABEL_202;
            }
            long al[] = ((StaticChunkOffsetBox)movie.next()).getChunkOffsets();
            int j = 0;
            while (j < al.length) 
            {
                al[j] = al[j] + l;
                j++;
            }
        } while (true);
_L7:
        if (!((Iterator) (obj2)).hasNext())
        {
            return basiccontainer;
        }
        al = (SampleAuxiliaryInformationOffsetsBox)((Iterator) (obj2)).next();
        l = al.getSize() + 44L;
        movie = al;
_L11:
        Iterator iterator;
        obj1 = ((Box)movie).getParent();
        iterator = ((Container)obj1).getBoxes().iterator();
_L9:
        if (iterator.hasNext()) goto _L6; else goto _L5
_L5:
        int k;
        if (obj1 instanceof Box)
        {
            break MISSING_BLOCK_LABEL_546;
        }
        movie = al.getOffsets();
        k = 0;
_L10:
        Box box;
        if (k < movie.length)
        {
            break MISSING_BLOCK_LABEL_526;
        }
        al.setOffsets(movie);
          goto _L7
_L6:
        if ((box = (Box)iterator.next()) == movie) goto _L5; else goto _L8
_L8:
        l += box.getSize();
          goto _L9
        movie[k] = movie[k] + l;
        k++;
          goto _L10
        movie = ((Movie) (obj1));
          goto _L11
    }

    protected void createCencBoxes(CencEncryptedTrack cencencryptedtrack, SampleTableBox sampletablebox, int ai[])
    {
        SampleAuxiliaryInformationSizesBox sampleauxiliaryinformationsizesbox;
        List list;
        sampleauxiliaryinformationsizesbox = new SampleAuxiliaryInformationSizesBox();
        sampleauxiliaryinformationsizesbox.setAuxInfoType("cenc");
        sampleauxiliaryinformationsizesbox.setFlags(1);
        list = cencencryptedtrack.getSampleEncryptionEntries();
        if (!cencencryptedtrack.hasSubSampleEncryption()) goto _L2; else goto _L1
_L1:
        Object obj;
        int i;
        obj = new short[list.size()];
        i = 0;
_L9:
        if (i < obj.length) goto _L4; else goto _L3
_L3:
        sampleauxiliaryinformationsizesbox.setSampleInfoSizes(((short []) (obj)));
_L6:
        SampleEncryptionBox sampleencryptionbox;
        int j;
        long l;
        obj = new SampleAuxiliaryInformationOffsetsBox();
        sampleencryptionbox = new SampleEncryptionBox();
        sampleencryptionbox.setSubSampleEncryption(cencencryptedtrack.hasSubSampleEncryption());
        sampleencryptionbox.setEntries(list);
        l = sampleencryptionbox.getOffsetToFirstIV();
        cencencryptedtrack = new long[ai.length];
        i = 0;
        j = 0;
          goto _L5
_L4:
        obj[i] = (short)((CencSampleAuxiliaryDataFormat)list.get(i)).getSize();
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        sampleauxiliaryinformationsizesbox.setDefaultSampleInfoSize(8);
        sampleauxiliaryinformationsizesbox.setSampleCount(cencencryptedtrack.getSamples().size());
          goto _L6
_L5:
        if (j >= ai.length)
        {
            ((SampleAuxiliaryInformationOffsetsBox) (obj)).setOffsets(cencencryptedtrack);
            sampletablebox.addBox(sampleauxiliaryinformationsizesbox);
            sampletablebox.addBox(((Box) (obj)));
            sampletablebox.addBox(sampleencryptionbox);
            sampleAuxiliaryInformationOffsetsBoxes.add(obj);
            return;
        }
        cencencryptedtrack[j] = l;
        int k = 0;
        do
        {
label0:
            {
                if (k < ai[j])
                {
                    break label0;
                }
                j++;
            }
            if (true)
            {
                continue;
            }
            l += ((CencSampleAuxiliaryDataFormat)list.get(i)).getSize();
            k++;
            i++;
        } while (true);
        if (true) goto _L5; else goto _L7
_L7:
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected void createCtts(Track track, SampleTableBox sampletablebox)
    {
        track = track.getCompositionTimeEntries();
        if (track != null && !track.isEmpty())
        {
            CompositionTimeToSample compositiontimetosample = new CompositionTimeToSample();
            compositiontimetosample.setEntries(track);
            sampletablebox.addBox(compositiontimetosample);
        }
    }

    protected Box createEdts(Track track, Movie movie)
    {
        if (track.getEdits() != null && track.getEdits().size() > 0)
        {
            EditListBox editlistbox = new EditListBox();
            editlistbox.setVersion(1);
            ArrayList arraylist = new ArrayList();
            Iterator iterator = track.getEdits().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    editlistbox.setEntries(arraylist);
                    track = new EditBox();
                    track.addBox(editlistbox);
                    return track;
                }
                Edit edit = (Edit)iterator.next();
                arraylist.add(new com.coremedia.iso.boxes.EditListBox.Entry(editlistbox, (long)edit.getSegmentDuration() * movie.getTimescale(), (edit.getMediaTime() * track.getTrackMetaData().getTimescale()) / edit.getTimeScale(), edit.getMediaRate()));
            } while (true);
        } else
        {
            return null;
        }
    }

    protected FileTypeBox createFileTypeBox(Movie movie)
    {
        movie = new LinkedList();
        movie.add("isom");
        movie.add("iso2");
        movie.add("avc1");
        return new FileTypeBox("isom", 0L, movie);
    }

    protected MovieBox createMovieBox(Movie movie, Map map)
    {
        MovieBox moviebox;
        Object obj;
        Iterator iterator;
        long l;
        long l2;
        moviebox = new MovieBox();
        obj = new MovieHeaderBox();
        ((MovieHeaderBox) (obj)).setCreationTime(new Date());
        ((MovieHeaderBox) (obj)).setModificationTime(new Date());
        ((MovieHeaderBox) (obj)).setMatrix(movie.getMatrix());
        l2 = getTimescale(movie);
        iterator = movie.getTracks().iterator();
        l = 0L;
_L5:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        ((MovieHeaderBox) (obj)).setDuration(l);
        ((MovieHeaderBox) (obj)).setTimescale(l2);
        iterator = movie.getTracks().iterator();
        l = 0L;
_L6:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        ((MovieHeaderBox) (obj)).setNextTrackId(1L + l);
        moviebox.addBox(((Box) (obj)));
        obj = movie.getTracks().iterator();
_L7:
        if (!((Iterator) (obj)).hasNext())
        {
            movie = createUdta(movie);
            if (movie != null)
            {
                moviebox.addBox(movie);
            }
            return moviebox;
        }
        break MISSING_BLOCK_LABEL_268;
_L2:
        Track track = (Track)iterator.next();
        long l1 = (track.getDuration() * l2) / track.getTrackMetaData().getTimescale();
        if (l1 > l)
        {
            l = l1;
        }
          goto _L5
_L4:
        Track track1 = (Track)iterator.next();
        if (l < track1.getTrackMetaData().getTrackId())
        {
            l = track1.getTrackMetaData().getTrackId();
        }
          goto _L6
        moviebox.addBox(createTrackBox((Track)((Iterator) (obj)).next(), movie, map));
          goto _L7
    }

    protected void createSdtp(Track track, SampleTableBox sampletablebox)
    {
        if (track.getSampleDependencies() != null && !track.getSampleDependencies().isEmpty())
        {
            SampleDependencyTypeBox sampledependencytypebox = new SampleDependencyTypeBox();
            sampledependencytypebox.setEntries(track.getSampleDependencies());
            sampletablebox.addBox(sampledependencytypebox);
        }
    }

    protected Box createStbl(Track track, Movie movie, Map map)
    {
        Object obj;
        SampleTableBox sampletablebox;
        sampletablebox = new SampleTableBox();
        createStsd(track, sampletablebox);
        createStts(track, sampletablebox);
        createCtts(track, sampletablebox);
        createStss(track, sampletablebox);
        createSdtp(track, sampletablebox);
        createStsc(track, map, sampletablebox);
        createStsz(track, sampletablebox);
        createStco(track, movie, map, sampletablebox);
        HashMap hashmap = new HashMap();
        Iterator iterator = track.getSampleGroups().entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                obj = hashmap.entrySet().iterator();
                break MISSING_BLOCK_LABEL_119;
            }
            java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
            String s = ((GroupEntry)entry1.getKey()).getType();
            obj = (List)hashmap.get(s);
            movie = ((Movie) (obj));
            if (obj == null)
            {
                movie = new ArrayList();
                hashmap.put(s, movie);
            }
            movie.add((GroupEntry)entry1.getKey());
        } while (true);
_L2:
        java.util.Map.Entry entry;
        SampleGroupDescriptionBox samplegroupdescriptionbox;
        SampleToGroupBox sampletogroupbox;
        int i;
        if (!((Iterator) (obj)).hasNext())
        {
            if (track instanceof CencEncryptedTrack)
            {
                createCencBoxes((CencEncryptedTrack)track, sampletablebox, (int[])map.get(track));
            }
            createSubs(track, sampletablebox);
            return sampletablebox;
        }
        entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        samplegroupdescriptionbox = new SampleGroupDescriptionBox();
        movie = (String)entry.getKey();
        samplegroupdescriptionbox.setGroupEntries((List)entry.getValue());
        sampletogroupbox = new SampleToGroupBox();
        sampletogroupbox.setGroupingType(movie);
        movie = null;
        i = 0;
_L3:
label0:
        {
            if (i < track.getSamples().size())
            {
                break label0;
            }
            sampletablebox.addBox(samplegroupdescriptionbox);
            sampletablebox.addBox(sampletogroupbox);
        }
        if (true) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        k = 0;
        j = 0;
_L4:
label1:
        {
            if (j < ((List)entry.getValue()).size())
            {
                break label1;
            }
            GroupEntry groupentry;
            if (movie == null || movie.getGroupDescriptionIndex() != k)
            {
                movie = new com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.Entry(1L, k);
                sampletogroupbox.getEntries().add(movie);
            } else
            {
                movie.setSampleCount(movie.getSampleCount() + 1L);
            }
            i++;
        }
          goto _L3
        groupentry = (GroupEntry)((List)entry.getValue()).get(j);
        if (Arrays.binarySearch((long[])track.getSampleGroups().get(groupentry), i) >= 0)
        {
            k = j + 1;
        }
        j++;
          goto _L4
    }

    protected void createStco(Track track, Movie movie, Map map, SampleTableBox sampletablebox)
    {
        int ai[];
        StaticChunkOffsetBox staticchunkoffsetbox;
        long al[];
        int i;
        long l;
        ai = (int[])map.get(track);
        staticchunkoffsetbox = new StaticChunkOffsetBox();
        chunkOffsetBoxes.add(staticchunkoffsetbox);
        l = 0L;
        al = new long[ai.length];
        if (LOG.isLoggable(Level.FINE))
        {
            LOG.fine((new StringBuilder("Calculating chunk offsets for track_")).append(track.getTrackMetaData().getTrackId()).toString());
        }
        i = 0;
_L2:
        Iterator iterator;
        if (i >= ai.length)
        {
            staticchunkoffsetbox.setChunkOffsets(al);
            sampletablebox.addBox(staticchunkoffsetbox);
            return;
        }
        if (LOG.isLoggable(Level.FINER))
        {
            LOG.finer((new StringBuilder("Calculating chunk offsets for track_")).append(track.getTrackMetaData().getTrackId()).append(" chunk ").append(i).toString());
        }
        iterator = movie.getTracks().iterator();
_L4:
label0:
        {
            if (iterator.hasNext())
            {
                break label0;
            }
            i++;
        }
        if (true) goto _L2; else goto _L1
_L1:
        Track track1;
        int ai1[];
        int j;
        long l1;
        track1 = (Track)iterator.next();
        if (LOG.isLoggable(Level.FINEST))
        {
            LOG.finest((new StringBuilder("Adding offsets of track_")).append(track1.getTrackMetaData().getTrackId()).toString());
        }
        ai1 = (int[])map.get(track1);
        l1 = 0L;
        j = 0;
_L6:
        long l2;
        if (j < i)
        {
            break MISSING_BLOCK_LABEL_351;
        }
        if (track1 == track)
        {
            al[i] = l;
        }
        j = CastUtils.l2i(l1);
        l2 = l;
_L5:
        l = l2;
        if ((long)j >= (long)ai1[i] + l1) goto _L4; else goto _L3
_L3:
        l2 += ((long[])track2SampleSizes.get(track1))[j];
        j++;
          goto _L5
          goto _L4
        l1 += ai1[j];
        j++;
          goto _L6
    }

    protected void createStsc(Track track, Map map, SampleTableBox sampletablebox)
    {
        track = (int[])map.get(track);
        map = new SampleToChunkBox();
        map.setEntries(new LinkedList());
        long l = 0xffffffff80000000L;
        int i = 0;
        do
        {
            if (i >= track.length)
            {
                sampletablebox.addBox(map);
                return;
            }
            long l1 = l;
            if (l != (long)track[i])
            {
                map.getEntries().add(new com.coremedia.iso.boxes.SampleToChunkBox.Entry(i + 1, track[i], 1L));
                l1 = track[i];
            }
            i++;
            l = l1;
        } while (true);
    }

    protected void createStsd(Track track, SampleTableBox sampletablebox)
    {
        sampletablebox.addBox(track.getSampleDescriptionBox());
    }

    protected void createStss(Track track, SampleTableBox sampletablebox)
    {
        track = track.getSyncSamples();
        if (track != null && track.length > 0)
        {
            SyncSampleBox syncsamplebox = new SyncSampleBox();
            syncsamplebox.setSampleNumber(track);
            sampletablebox.addBox(syncsamplebox);
        }
    }

    protected void createStsz(Track track, SampleTableBox sampletablebox)
    {
        SampleSizeBox samplesizebox = new SampleSizeBox();
        samplesizebox.setSampleSizes((long[])track2SampleSizes.get(track));
        sampletablebox.addBox(samplesizebox);
    }

    protected void createStts(Track track, SampleTableBox sampletablebox)
    {
        Object obj = null;
        ArrayList arraylist = new ArrayList();
        long al[] = track.getSampleDurations();
        int j = al.length;
        int i = 0;
        track = obj;
        do
        {
            if (i >= j)
            {
                track = new TimeToSampleBox();
                track.setEntries(arraylist);
                sampletablebox.addBox(track);
                return;
            }
            long l = al[i];
            if (track != null && track.getDelta() == l)
            {
                track.setCount(track.getCount() + 1L);
            } else
            {
                track = new com.coremedia.iso.boxes.TimeToSampleBox.Entry(1L, l);
                arraylist.add(track);
            }
            i++;
        } while (true);
    }

    protected void createSubs(Track track, SampleTableBox sampletablebox)
    {
        if (track.getSubsampleInformationBox() != null)
        {
            sampletablebox.addBox(track.getSubsampleInformationBox());
        }
    }

    protected TrackBox createTrackBox(Track track, Movie movie, Map map)
    {
        TrackBox trackbox;
        Object obj;
        Object obj1;
        trackbox = new TrackBox();
        obj = new TrackHeaderBox();
        ((TrackHeaderBox) (obj)).setEnabled(true);
        ((TrackHeaderBox) (obj)).setInMovie(true);
        ((TrackHeaderBox) (obj)).setInPreview(true);
        ((TrackHeaderBox) (obj)).setInPoster(true);
        ((TrackHeaderBox) (obj)).setMatrix(track.getTrackMetaData().getMatrix());
        ((TrackHeaderBox) (obj)).setAlternateGroup(track.getTrackMetaData().getGroup());
        ((TrackHeaderBox) (obj)).setCreationTime(track.getTrackMetaData().getCreationTime());
        ((TrackHeaderBox) (obj)).setDuration((track.getDuration() * getTimescale(movie)) / track.getTrackMetaData().getTimescale());
        ((TrackHeaderBox) (obj)).setHeight(track.getTrackMetaData().getHeight());
        ((TrackHeaderBox) (obj)).setWidth(track.getTrackMetaData().getWidth());
        ((TrackHeaderBox) (obj)).setLayer(track.getTrackMetaData().getLayer());
        ((TrackHeaderBox) (obj)).setModificationTime(new Date());
        ((TrackHeaderBox) (obj)).setTrackId(track.getTrackMetaData().getTrackId());
        ((TrackHeaderBox) (obj)).setVolume(track.getTrackMetaData().getVolume());
        trackbox.addBox(((Box) (obj)));
        trackbox.addBox(createEdts(track, movie));
        obj = new MediaBox();
        trackbox.addBox(((Box) (obj)));
        obj1 = new MediaHeaderBox();
        ((MediaHeaderBox) (obj1)).setCreationTime(track.getTrackMetaData().getCreationTime());
        ((MediaHeaderBox) (obj1)).setDuration(track.getDuration());
        ((MediaHeaderBox) (obj1)).setTimescale(track.getTrackMetaData().getTimescale());
        ((MediaHeaderBox) (obj1)).setLanguage(track.getTrackMetaData().getLanguage());
        ((MediaBox) (obj)).addBox(((Box) (obj1)));
        obj1 = new HandlerBox();
        ((MediaBox) (obj)).addBox(((Box) (obj1)));
        ((HandlerBox) (obj1)).setHandlerType(track.getHandler());
        obj1 = new MediaInformationBox();
        if (!track.getHandler().equals("vide")) goto _L2; else goto _L1
_L1:
        ((MediaInformationBox) (obj1)).addBox(new VideoMediaHeaderBox());
_L4:
        DataInformationBox datainformationbox = new DataInformationBox();
        DataReferenceBox datareferencebox = new DataReferenceBox();
        datainformationbox.addBox(datareferencebox);
        DataEntryUrlBox dataentryurlbox = new DataEntryUrlBox();
        dataentryurlbox.setFlags(1);
        datareferencebox.addBox(dataentryurlbox);
        ((MediaInformationBox) (obj1)).addBox(datainformationbox);
        ((MediaInformationBox) (obj1)).addBox(createStbl(track, movie, map));
        ((MediaBox) (obj)).addBox(((Box) (obj1)));
        return trackbox;
_L2:
        if (track.getHandler().equals("soun"))
        {
            ((MediaInformationBox) (obj1)).addBox(new SoundMediaHeaderBox());
        } else
        if (track.getHandler().equals("text"))
        {
            ((MediaInformationBox) (obj1)).addBox(new NullMediaHeaderBox());
        } else
        if (track.getHandler().equals("subt"))
        {
            ((MediaInformationBox) (obj1)).addBox(new SubtitleMediaHeaderBox());
        } else
        if (track.getHandler().equals("hint"))
        {
            ((MediaInformationBox) (obj1)).addBox(new HintMediaHeaderBox());
        } else
        if (track.getHandler().equals("sbtl"))
        {
            ((MediaInformationBox) (obj1)).addBox(new NullMediaHeaderBox());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected Box createUdta(Movie movie)
    {
        return null;
    }

    int[] getChunkSizes(Track track, Movie movie)
    {
        movie = intersectionFinder.sampleNumbers(track);
        int ai[] = new int[movie.length];
        int i = 0;
        do
        {
            long l;
            long l1;
            if (i >= movie.length)
            {
                if (!$assertionsDisabled && (long)((List)track2Sample.get(track)).size() != sum(ai))
                {
                    throw new AssertionError("The number of samples and the sum of all chunk lengths must be equal");
                } else
                {
                    return ai;
                }
            }
            l1 = movie[i];
            if (movie.length == i + 1)
            {
                l = track.getSamples().size();
            } else
            {
                l = movie[i + 1] - 1L;
            }
            ai[i] = CastUtils.l2i(l - (l1 - 1L));
            i++;
        } while (true);
    }

    public long getTimescale(Movie movie)
    {
        long l = ((Track)movie.getTracks().iterator().next()).getTrackMetaData().getTimescale();
        movie = movie.getTracks().iterator();
        do
        {
            if (!movie.hasNext())
            {
                return l;
            }
            l = gcd(((Track)movie.next()).getTrackMetaData().getTimescale(), l);
        } while (true);
    }

    protected List putSamples(Track track, List list)
    {
        return (List)track2Sample.put(track, list);
    }

    public void setIntersectionFinder(FragmentIntersectionFinder fragmentintersectionfinder)
    {
        intersectionFinder = fragmentintersectionfinder;
    }

    static 
    {
        boolean flag;
        if (!com/googlecode/mp4parser/authoring/builder/DefaultMp4Builder.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
