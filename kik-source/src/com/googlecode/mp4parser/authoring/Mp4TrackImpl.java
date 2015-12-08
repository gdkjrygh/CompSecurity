// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.EditListBox;
import com.coremedia.iso.boxes.HandlerBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.SyncSampleBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.SampleFlags;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.coremedia.iso.boxes.mdat.SampleList;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.googlecode.mp4parser.authoring:
//            AbstractTrack, TrackMetaData, Edit

public class Mp4TrackImpl extends AbstractTrack
{

    private List compositionTimeEntries;
    private long decodingTimes[];
    IsoFile fragments[];
    private String handler;
    private List sampleDependencies;
    private SampleDescriptionBox sampleDescriptionBox;
    private List samples;
    private SubSampleInformationBox subSampleInformationBox;
    private long syncSamples[];
    TrackBox trackBox;
    private TrackMetaData trackMetaData;

    public transient Mp4TrackImpl(String s, TrackBox trackbox, IsoFile aisofile[])
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        int i;
        int j;
        long l2;
        super(s);
        syncSamples = new long[0];
        trackMetaData = new TrackMetaData();
        subSampleInformationBox = null;
        l2 = trackbox.getTrackHeaderBox().getTrackId();
        samples = new SampleList(trackbox, aisofile);
        s = trackbox.getMediaBox().getMediaInformationBox().getSampleTableBox();
        handler = trackbox.getMediaBox().getHandlerBox().getHandlerType();
        arraylist = new ArrayList();
        compositionTimeEntries = new ArrayList();
        sampleDependencies = new ArrayList();
        arraylist.addAll(s.getTimeToSampleBox().getEntries());
        if (s.getCompositionTimeToSample() != null)
        {
            compositionTimeEntries.addAll(s.getCompositionTimeToSample().getEntries());
        }
        if (s.getSampleDependencyTypeBox() != null)
        {
            sampleDependencies.addAll(s.getSampleDependencyTypeBox().getEntries());
        }
        if (s.getSyncSampleBox() != null)
        {
            syncSamples = s.getSyncSampleBox().getSampleNumber();
        }
        subSampleInformationBox = (SubSampleInformationBox)Path.getPath(s, "subs");
        arraylist1 = new ArrayList();
        arraylist1.addAll(((Box)trackbox.getParent()).getParent().getBoxes(com/coremedia/iso/boxes/fragment/MovieFragmentBox));
        j = aisofile.length;
        i = 0;
_L11:
        if (i < j) goto _L2; else goto _L1
_L1:
        sampleDescriptionBox = s.getSampleDescriptionBox();
        aisofile = trackbox.getParent().getBoxes(com/coremedia/iso/boxes/fragment/MovieExtendsBox);
        if (aisofile.size() <= 0) goto _L4; else goto _L3
_L3:
        aisofile = aisofile.iterator();
_L13:
        if (aisofile.hasNext()) goto _L6; else goto _L5
_L5:
        new ArrayList();
        new ArrayList();
        s = arraylist1.iterator();
_L27:
        if (s.hasNext()) goto _L8; else goto _L7
_L7:
        decodingTimes = TimeToSampleBox.blowupTimeToSamples(arraylist);
        s = trackbox.getMediaBox().getMediaHeaderBox();
        aisofile = trackbox.getTrackHeaderBox();
        trackMetaData.setTrackId(aisofile.getTrackId());
        trackMetaData.setCreationTime(s.getCreationTime());
        trackMetaData.setLanguage(s.getLanguage());
        trackMetaData.setModificationTime(s.getModificationTime());
        trackMetaData.setTimescale(s.getTimescale());
        trackMetaData.setHeight(aisofile.getHeight());
        trackMetaData.setWidth(aisofile.getWidth());
        trackMetaData.setLayer(aisofile.getLayer());
        trackMetaData.setMatrix(aisofile.getMatrix());
        aisofile = (EditListBox)Path.getPath(trackbox, "edts/elst");
        trackbox = (MovieHeaderBox)Path.getPath(trackbox, "../mvhd");
        if (aisofile == null) goto _L10; else goto _L9
_L9:
        aisofile = aisofile.getEntries().iterator();
_L28:
        if (aisofile.hasNext())
        {
            break MISSING_BLOCK_LABEL_1528;
        }
_L10:
        return;
_L2:
        arraylist1.addAll(aisofile[i].getBoxes(com/coremedia/iso/boxes/fragment/MovieFragmentBox));
        i++;
          goto _L11
_L6:
        Iterator iterator = ((MovieExtendsBox)aisofile.next()).getBoxes(com/coremedia/iso/boxes/fragment/TrackExtendsBox).iterator();
_L15:
        if (!iterator.hasNext()) goto _L13; else goto _L12
_L12:
        TrackExtendsBox trackextendsbox = (TrackExtendsBox)iterator.next();
        if (trackextendsbox.getTrackId() != l2) goto _L15; else goto _L14
_L14:
        Object obj;
        Iterator iterator1;
        long l1;
        if (Path.getPaths(((Box)trackbox.getParent()).getParent(), "/moof/traf/subs").size() > 0)
        {
            subSampleInformationBox = new SubSampleInformationBox();
        }
        obj = new LinkedList();
        l1 = 1L;
        iterator1 = arraylist1.iterator();
_L17:
label0:
        {
            if (iterator1.hasNext())
            {
                break label0;
            }
            s = syncSamples;
            syncSamples = new long[syncSamples.length + ((List) (obj)).size()];
            System.arraycopy(s, 0, syncSamples, 0, s.length);
            obj = ((List) (obj)).iterator();
            i = s.length;
            while (((Iterator) (obj)).hasNext()) 
            {
                s = (Long)((Iterator) (obj)).next();
                syncSamples[i] = s.longValue();
                i++;
            }
        }
          goto _L15
          goto _L13
        Iterator iterator2;
        long l;
        iterator2 = ((MovieFragmentBox)iterator1.next()).getBoxes(com/coremedia/iso/boxes/fragment/TrackFragmentBox).iterator();
        l = l1;
_L19:
        l1 = l;
        if (!iterator2.hasNext()) goto _L17; else goto _L16
_L16:
        s = (TrackFragmentBox)iterator2.next();
        if (s.getTrackFragmentHeaderBox().getTrackId() != l2) goto _L19; else goto _L18
_L18:
        Object obj1 = (SubSampleInformationBox)Path.getPath(s, "subs");
        if (obj1 == null) goto _L21; else goto _L20
_L20:
        l1 = l - 0L - 1L;
        obj1 = ((SubSampleInformationBox) (obj1)).getEntries().iterator();
_L26:
        if (((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_1142;
        }
_L21:
        obj1 = s.getBoxes(com/coremedia/iso/boxes/fragment/TrackRunBox).iterator();
        l1 = l;
_L24:
        l = l1;
        if (!((Iterator) (obj1)).hasNext()) goto _L19; else goto _L22
_L22:
        Object obj2;
        Object obj3;
        Iterator iterator3;
        obj2 = (TrackRunBox)((Iterator) (obj1)).next();
        obj3 = ((TrackFragmentBox)((TrackRunBox) (obj2)).getParent()).getTrackFragmentHeaderBox();
        iterator3 = ((TrackRunBox) (obj2)).getEntries().iterator();
        i = 1;
        l = l1;
_L25:
        l1 = l;
        if (!iterator3.hasNext()) goto _L24; else goto _L23
_L23:
        s = (com.coremedia.iso.boxes.fragment.TrackRunBox.Entry)iterator3.next();
        if (((TrackRunBox) (obj2)).isSampleDurationPresent())
        {
            if (arraylist.size() == 0 || ((com.coremedia.iso.boxes.TimeToSampleBox.Entry)arraylist.get(arraylist.size() - 1)).getDelta() != s.getSampleDuration())
            {
                arraylist.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(1L, s.getSampleDuration()));
            } else
            {
                com.coremedia.iso.boxes.TimeToSampleBox.Entry entry1 = (com.coremedia.iso.boxes.TimeToSampleBox.Entry)arraylist.get(arraylist.size() - 1);
                entry1.setCount(entry1.getCount() + 1L);
            }
        } else
        if (((TrackFragmentHeaderBox) (obj3)).hasDefaultSampleDuration())
        {
            arraylist.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(1L, ((TrackFragmentHeaderBox) (obj3)).getDefaultSampleDuration()));
        } else
        {
            arraylist.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(1L, trackextendsbox.getDefaultSampleDuration()));
        }
        if (((TrackRunBox) (obj2)).isSampleCompositionTimeOffsetPresent())
        {
            if (compositionTimeEntries.size() == 0 || (long)((com.coremedia.iso.boxes.CompositionTimeToSample.Entry)compositionTimeEntries.get(compositionTimeEntries.size() - 1)).getOffset() != s.getSampleCompositionTimeOffset())
            {
                compositionTimeEntries.add(new com.coremedia.iso.boxes.CompositionTimeToSample.Entry(1, CastUtils.l2i(s.getSampleCompositionTimeOffset())));
            } else
            {
                com.coremedia.iso.boxes.CompositionTimeToSample.Entry entry2 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry)compositionTimeEntries.get(compositionTimeEntries.size() - 1);
                entry2.setCount(entry2.getCount() + 1);
            }
        }
        if (((TrackRunBox) (obj2)).isSampleFlagsPresent())
        {
            s = s.getSampleFlags();
        } else
        if (i && ((TrackRunBox) (obj2)).isFirstSampleFlagsPresent())
        {
            s = ((TrackRunBox) (obj2)).getFirstSampleFlags();
        } else
        if (((TrackFragmentHeaderBox) (obj3)).hasDefaultSampleFlags())
        {
            s = ((TrackFragmentHeaderBox) (obj3)).getDefaultSampleFlags();
        } else
        {
            s = trackextendsbox.getDefaultSampleFlags();
        }
        if (s != null && !s.isSampleIsDifferenceSample())
        {
            ((List) (obj)).add(Long.valueOf(l));
        }
        l++;
        i = 0;
          goto _L25
          goto _L24
        obj2 = (com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry)((Iterator) (obj1)).next();
        obj3 = new com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry();
        ((com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry) (obj3)).getSubsampleEntries().addAll(((com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry) (obj2)).getSubsampleEntries());
        if (l1 != 0L)
        {
            ((com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry) (obj3)).setSampleDelta(l1 + ((com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry) (obj2)).getSampleDelta());
            l1 = 0L;
        } else
        {
            ((com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry) (obj3)).setSampleDelta(((com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry) (obj2)).getSampleDelta());
        }
        subSampleInformationBox.getEntries().add(obj3);
          goto _L26
_L8:
        aisofile = ((MovieFragmentBox)s.next()).getBoxes(com/coremedia/iso/boxes/fragment/TrackFragmentBox).iterator();
        while (aisofile.hasNext()) 
        {
            TrackFragmentBox trackfragmentbox = (TrackFragmentBox)aisofile.next();
            if (trackfragmentbox.getTrackFragmentHeaderBox().getTrackId() == l2)
            {
                sampleGroups = getSampleGroups(Path.getPaths(trackfragmentbox, "sgpd"), Path.getPaths(trackfragmentbox, "sbgp"), sampleGroups);
            }
        }
          goto _L27
_L4:
        sampleGroups = getSampleGroups(s.getBoxes(com/googlecode/mp4parser/boxes/mp4/samplegrouping/SampleGroupDescriptionBox), s.getBoxes(com/googlecode/mp4parser/boxes/mp4/samplegrouping/SampleToGroupBox), sampleGroups);
          goto _L7
        com.coremedia.iso.boxes.EditListBox.Entry entry = (com.coremedia.iso.boxes.EditListBox.Entry)aisofile.next();
        edits.add(new Edit(entry.getMediaTime(), s.getTimescale(), entry.getMediaRate(), (double)entry.getSegmentDuration() / (double)trackbox.getTimescale()));
          goto _L28
    }

    private Map getSampleGroups(List list, List list1, Map map)
    {
        Iterator iterator = list.iterator();
_L2:
        SampleGroupDescriptionBox samplegroupdescriptionbox;
        Iterator iterator1;
        int i;
        if (!iterator.hasNext())
        {
            return map;
        }
        samplegroupdescriptionbox = (SampleGroupDescriptionBox)iterator.next();
        iterator1 = list1.iterator();
        i = 0;
_L4:
label0:
        {
            if (iterator1.hasNext())
            {
                break label0;
            }
            if (i == 0)
            {
                throw new RuntimeException((new StringBuilder("Could not find SampleToGroupBox for ")).append(((GroupEntry)samplegroupdescriptionbox.getGroupEntries().get(0)).getType()).append(".").toString());
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        list = (SampleToGroupBox)iterator1.next();
        if (!list.getGroupingType().equals(((GroupEntry)samplegroupdescriptionbox.getGroupEntries().get(0)).getType())) goto _L4; else goto _L3
_L3:
        Iterator iterator2;
        iterator2 = list.getEntries().iterator();
        i = 0;
_L7:
label1:
        {
            if (iterator2.hasNext())
            {
                break label1;
            }
            i = 1;
        }
          goto _L4
        com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.Entry entry = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.Entry)iterator2.next();
        if (entry.getGroupDescriptionIndex() <= 0) goto _L6; else goto _L5
_L5:
        long al[];
        GroupEntry groupentry;
        int j;
        groupentry = (GroupEntry)samplegroupdescriptionbox.getGroupEntries().get(entry.getGroupDescriptionIndex() - 1);
        al = (long[])map.get(groupentry);
        list = al;
        if (al == null)
        {
            list = new long[0];
        }
        al = new long[CastUtils.l2i(entry.getSampleCount()) + list.length];
        System.arraycopy(list, 0, al, 0, list.length);
        j = 0;
_L8:
        if ((long)j < entry.getSampleCount())
        {
            break MISSING_BLOCK_LABEL_306;
        }
        map.put(groupentry, al);
_L6:
        i = (int)((long)i + entry.getSampleCount());
          goto _L7
        al[list.length + j] = i + j;
        j++;
          goto _L8
    }

    public void close()
    {
        Container container = trackBox.getParent();
        if (container instanceof BasicContainer)
        {
            ((BasicContainer)container).close();
        }
        IsoFile aisofile[] = fragments;
        int j = aisofile.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            aisofile[i].close();
            i++;
        } while (true);
    }

    public List getCompositionTimeEntries()
    {
        return compositionTimeEntries;
    }

    public String getHandler()
    {
        return handler;
    }

    public List getSampleDependencies()
    {
        return sampleDependencies;
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        return sampleDescriptionBox;
    }

    public long[] getSampleDurations()
    {
        this;
        JVM INSTR monitorenter ;
        long al[] = decodingTimes;
        this;
        JVM INSTR monitorexit ;
        return al;
        Exception exception;
        exception;
        throw exception;
    }

    public List getSamples()
    {
        return samples;
    }

    public SubSampleInformationBox getSubsampleInformationBox()
    {
        return subSampleInformationBox;
    }

    public long[] getSyncSamples()
    {
        if (syncSamples.length == samples.size())
        {
            return null;
        } else
        {
            return syncSamples;
        }
    }

    public TrackMetaData getTrackMetaData()
    {
        return trackMetaData;
    }
}
