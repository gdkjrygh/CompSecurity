// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.Box;
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
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.SubtitleMediaHeaderBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox;
import com.coremedia.iso.boxes.fragment.SampleFlags;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.googlecode.mp4parser.BasicContainer;
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
import com.mp4parser.iso23001.part7.TrackEncryptionBox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.googlecode.mp4parser.authoring.builder:
//            Mp4Builder, SyncSampleIntersectFinderImpl, FragmentIntersectionFinder

public class FragmentedMp4Builder
    implements Mp4Builder
{

    static final boolean $assertionsDisabled;
    private static final Logger LOG = Logger.getLogger(com/googlecode/mp4parser/authoring/builder/FragmentedMp4Builder.getName());
    protected FragmentIntersectionFinder intersectionFinder;

    public FragmentedMp4Builder()
    {
    }

    private long getTrackDuration(Movie movie, Track track)
    {
        return (track.getDuration() * movie.getTimescale()) / track.getTrackMetaData().getTimescale();
    }

    public Container build(Movie movie)
    {
        LOG.fine((new StringBuilder("Creating movie ")).append(movie).toString());
        if (intersectionFinder != null) goto _L2; else goto _L1
_L1:
        Iterator iterator = movie.getTracks().iterator();
_L6:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj = null;
_L5:
        intersectionFinder = new SyncSampleIntersectFinderImpl(movie, ((Track) (obj)), -1);
_L2:
        obj = new BasicContainer();
        ((BasicContainer) (obj)).addBox(createFtyp(movie));
        ((BasicContainer) (obj)).addBox(createMoov(movie));
        iterator = createMoofMdat(movie).iterator();
        break MISSING_BLOCK_LABEL_101;
_L4:
        obj = (Track)iterator.next();
        if (!((Track) (obj)).getHandler().equals("vide")) goto _L6; else goto _L5
        do
        {
            if (!iterator.hasNext())
            {
                ((BasicContainer) (obj)).addBox(createMfra(movie, ((Container) (obj))));
                return ((Container) (obj));
            }
            ((BasicContainer) (obj)).addBox((Box)iterator.next());
        } while (true);
    }

    protected DataInformationBox createDinf(Movie movie, Track track)
    {
        movie = new DataInformationBox();
        track = new DataReferenceBox();
        movie.addBox(track);
        DataEntryUrlBox dataentryurlbox = new DataEntryUrlBox();
        dataentryurlbox.setFlags(1);
        track.addBox(dataentryurlbox);
        return movie;
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

    protected int createFragment(List list, Track track, long al[], int i, int j)
    {
        int k = j;
        if (i < al.length)
        {
            long l1 = al[i];
            long l;
            if (i + 1 < al.length)
            {
                l = al[i + 1];
            } else
            {
                l = track.getSamples().size() + 1;
            }
            k = j;
            if (l1 != l)
            {
                list.add(createMoof(l1, l, track, j));
                list.add(createMdat(l1, l, track, j));
                k = j + 1;
            }
        }
        return k;
    }

    public Box createFtyp(Movie movie)
    {
        movie = new LinkedList();
        movie.add("isom");
        movie.add("iso2");
        movie.add("avc1");
        return new FileTypeBox("isom", 0L, movie);
    }

    protected Box createMdat(final long startSample, final long endSample, final Track track, final int i)
    {
        return new _cls1Mdat();
    }

    protected Box createMdhd(Movie movie, Track track)
    {
        movie = new MediaHeaderBox();
        movie.setCreationTime(track.getTrackMetaData().getCreationTime());
        movie.setModificationTime(getDate());
        movie.setDuration(0L);
        movie.setTimescale(track.getTrackMetaData().getTimescale());
        movie.setLanguage(track.getTrackMetaData().getLanguage());
        return movie;
    }

    protected Box createMdia(Track track, Movie movie)
    {
        MediaBox mediabox = new MediaBox();
        mediabox.addBox(createMdhd(movie, track));
        mediabox.addBox(createMdiaHdlr(track, movie));
        mediabox.addBox(createMinf(track, movie));
        return mediabox;
    }

    protected Box createMdiaHdlr(Track track, Movie movie)
    {
        movie = new HandlerBox();
        movie.setHandlerType(track.getHandler());
        return movie;
    }

    protected void createMfhd(long l, long l1, Track track, int i, MovieFragmentBox moviefragmentbox)
    {
        track = new MovieFragmentHeaderBox();
        track.setSequenceNumber(i);
        moviefragmentbox.addBox(track);
    }

    protected Box createMfra(Movie movie, Container container)
    {
        MovieFragmentRandomAccessBox moviefragmentrandomaccessbox = new MovieFragmentRandomAccessBox();
        movie = movie.getTracks().iterator();
        do
        {
            if (!movie.hasNext())
            {
                movie = new MovieFragmentRandomAccessOffsetBox();
                moviefragmentrandomaccessbox.addBox(movie);
                movie.setMfraSize(moviefragmentrandomaccessbox.getSize());
                return moviefragmentrandomaccessbox;
            }
            moviefragmentrandomaccessbox.addBox(createTfra((Track)movie.next(), container));
        } while (true);
    }

    protected Box createMinf(Track track, Movie movie)
    {
        MediaInformationBox mediainformationbox = new MediaInformationBox();
        if (!track.getHandler().equals("vide")) goto _L2; else goto _L1
_L1:
        mediainformationbox.addBox(new VideoMediaHeaderBox());
_L4:
        mediainformationbox.addBox(createDinf(movie, track));
        mediainformationbox.addBox(createStbl(movie, track));
        return mediainformationbox;
_L2:
        if (track.getHandler().equals("soun"))
        {
            mediainformationbox.addBox(new SoundMediaHeaderBox());
        } else
        if (track.getHandler().equals("text"))
        {
            mediainformationbox.addBox(new NullMediaHeaderBox());
        } else
        if (track.getHandler().equals("subt"))
        {
            mediainformationbox.addBox(new SubtitleMediaHeaderBox());
        } else
        if (track.getHandler().equals("hint"))
        {
            mediainformationbox.addBox(new HintMediaHeaderBox());
        } else
        if (track.getHandler().equals("sbtl"))
        {
            mediainformationbox.addBox(new NullMediaHeaderBox());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected Box createMoof(long l, long l1, Track track, int i)
    {
        MovieFragmentBox moviefragmentbox = new MovieFragmentBox();
        createMfhd(l, l1, track, i, moviefragmentbox);
        createTraf(l, l1, track, i, moviefragmentbox);
        track = (TrackRunBox)moviefragmentbox.getTrackRunBoxes().get(0);
        track.setDataOffset(1);
        track.setDataOffset((int)(8L + moviefragmentbox.getSize()));
        return moviefragmentbox;
    }

    protected List createMoofMdat(Movie movie)
    {
        LinkedList linkedlist;
        HashMap hashmap;
        int j;
        int k;
        linkedlist = new LinkedList();
        hashmap = new HashMap();
        Iterator iterator = movie.getTracks().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                k = 1;
                j = 0;
                break MISSING_BLOCK_LABEL_46;
            }
            Track track = (Track)iterator.next();
            long al[] = intersectionFinder.sampleNumbers(track);
            hashmap.put(track, al);
            i = Math.max(i, al.length);
        } while (true);
_L2:
        Iterator iterator1;
        if (j >= i)
        {
            return linkedlist;
        }
        iterator1 = sortTracksInSequence(movie.getTracks(), j, hashmap).iterator();
_L3:
label0:
        {
            if (iterator1.hasNext())
            {
                break label0;
            }
            j++;
        }
        if (true) goto _L2; else goto _L1
_L1:
        Track track1 = (Track)iterator1.next();
        k = createFragment(linkedlist, track1, (long[])hashmap.get(track1), j, k);
          goto _L3
    }

    protected Box createMoov(Movie movie)
    {
        MovieBox moviebox = new MovieBox();
        moviebox.addBox(createMvhd(movie));
        Iterator iterator = movie.getTracks().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                moviebox.addBox(createMvex(movie));
                return moviebox;
            }
            moviebox.addBox(createTrak((Track)iterator.next(), movie));
        } while (true);
    }

    protected Box createMvex(Movie movie)
    {
        MovieExtendsBox movieextendsbox;
        Object obj;
        Iterator iterator;
        movieextendsbox = new MovieExtendsBox();
        obj = new MovieExtendsHeaderBox();
        ((MovieExtendsHeaderBox) (obj)).setVersion(1);
        iterator = movie.getTracks().iterator();
_L3:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        movieextendsbox.addBox(((Box) (obj)));
        obj = movie.getTracks().iterator();
_L4:
        if (!((Iterator) (obj)).hasNext())
        {
            return movieextendsbox;
        }
        break MISSING_BLOCK_LABEL_104;
_L2:
        long l = getTrackDuration(movie, (Track)iterator.next());
        if (((MovieExtendsHeaderBox) (obj)).getFragmentDuration() < l)
        {
            ((MovieExtendsHeaderBox) (obj)).setFragmentDuration(l);
        }
          goto _L3
        movieextendsbox.addBox(createTrex(movie, (Track)((Iterator) (obj)).next()));
          goto _L4
    }

    protected Box createMvhd(Movie movie)
    {
        long l = 0L;
        MovieHeaderBox movieheaderbox = new MovieHeaderBox();
        movieheaderbox.setVersion(1);
        movieheaderbox.setCreationTime(getDate());
        movieheaderbox.setModificationTime(getDate());
        movieheaderbox.setDuration(0L);
        movieheaderbox.setTimescale(movie.getTimescale());
        movie = movie.getTracks().iterator();
        do
        {
            Track track;
            do
            {
                if (!movie.hasNext())
                {
                    movieheaderbox.setNextTrackId(1L + l);
                    return movieheaderbox;
                }
                track = (Track)movie.next();
            } while (l >= track.getTrackMetaData().getTrackId());
            l = track.getTrackMetaData().getTrackId();
        } while (true);
    }

    protected void createSaio(long l, long l1, CencEncryptedTrack cencencryptedtrack, int i, TrackFragmentBox trackfragmentbox)
    {
        Object obj;
        Path.getPath(cencencryptedtrack.getSampleDescriptionBox(), "enc.[0]/sinf[0]/schm[0]");
        cencencryptedtrack = new SampleAuxiliaryInformationOffsetsBox();
        trackfragmentbox.addBox(cencencryptedtrack);
        if (!$assertionsDisabled && trackfragmentbox.getBoxes(com/coremedia/iso/boxes/fragment/TrackRunBox).size() != 1)
        {
            throw new AssertionError("Don't know how to deal with multiple Track Run Boxes when encrypting");
        }
        cencencryptedtrack.setAuxInfoType("cenc");
        cencencryptedtrack.setFlags(1);
        obj = trackfragmentbox.getBoxes().iterator();
        l = 8L;
_L3:
        Box box;
        if (((Iterator) (obj)).hasNext())
        {
label0:
            {
                box = (Box)((Iterator) (obj)).next();
                if (!(box instanceof SampleEncryptionBox))
                {
                    break label0;
                }
                l += ((SampleEncryptionBox)box).getOffsetToFirstIV();
            }
        }
        obj = (MovieFragmentBox)trackfragmentbox.getParent();
        l += 16L;
        obj = ((MovieFragmentBox) (obj)).getBoxes().iterator();
_L5:
        if (((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        cencencryptedtrack.setOffsets(new long[] {
            l
        });
        return;
        l = box.getSize() + l;
          goto _L3
_L2:
        if ((box = (Box)((Iterator) (obj)).next()) == trackfragmentbox) goto _L1; else goto _L4
_L4:
        l = box.getSize() + l;
          goto _L5
    }

    protected void createSaiz(long l, long l1, CencEncryptedTrack cencencryptedtrack, int i, TrackFragmentBox trackfragmentbox)
    {
        Object obj;
        short aword0[];
        obj = cencencryptedtrack.getSampleDescriptionBox();
        Path.getPath(((com.googlecode.mp4parser.AbstractContainerBox) (obj)), "enc.[0]/sinf[0]/schm[0]");
        aword0 = (TrackEncryptionBox)Path.getPath(((com.googlecode.mp4parser.AbstractContainerBox) (obj)), "enc.[0]/sinf[0]/schi[0]/tenc[0]");
        obj = new SampleAuxiliaryInformationSizesBox();
        ((SampleAuxiliaryInformationSizesBox) (obj)).setAuxInfoType("cenc");
        ((SampleAuxiliaryInformationSizesBox) (obj)).setFlags(1);
        if (!cencencryptedtrack.hasSubSampleEncryption())
        {
            break MISSING_BLOCK_LABEL_156;
        }
        aword0 = new short[CastUtils.l2i(l1 - l)];
        cencencryptedtrack = cencencryptedtrack.getSampleEncryptionEntries().subList(CastUtils.l2i(l - 1L), CastUtils.l2i(l1 - 1L));
        i = 0;
_L3:
        if (i < aword0.length) goto _L2; else goto _L1
_L1:
        ((SampleAuxiliaryInformationSizesBox) (obj)).setSampleInfoSizes(aword0);
_L4:
        trackfragmentbox.addBox(((Box) (obj)));
        return;
_L2:
        aword0[i] = (short)((CencSampleAuxiliaryDataFormat)cencencryptedtrack.get(i)).getSize();
        i++;
          goto _L3
        ((SampleAuxiliaryInformationSizesBox) (obj)).setDefaultSampleInfoSize(aword0.getDefaultIvSize());
        ((SampleAuxiliaryInformationSizesBox) (obj)).setSampleCount(CastUtils.l2i(l1 - l));
          goto _L4
    }

    protected void createSenc(long l, long l1, CencEncryptedTrack cencencryptedtrack, int i, TrackFragmentBox trackfragmentbox)
    {
        SampleEncryptionBox sampleencryptionbox = new SampleEncryptionBox();
        sampleencryptionbox.setSubSampleEncryption(cencencryptedtrack.hasSubSampleEncryption());
        sampleencryptionbox.setEntries(cencencryptedtrack.getSampleEncryptionEntries().subList(CastUtils.l2i(l - 1L), CastUtils.l2i(l1 - 1L)));
        trackfragmentbox.addBox(sampleencryptionbox);
    }

    protected Box createStbl(Movie movie, Track track)
    {
        movie = new SampleTableBox();
        createStsd(track, movie);
        movie.addBox(new TimeToSampleBox());
        movie.addBox(new SampleToChunkBox());
        movie.addBox(new SampleSizeBox());
        movie.addBox(new StaticChunkOffsetBox());
        return movie;
    }

    protected void createStsd(Track track, SampleTableBox sampletablebox)
    {
        sampletablebox.addBox(track.getSampleDescriptionBox());
    }

    protected void createTfdt(long l, Track track, TrackFragmentBox trackfragmentbox)
    {
        int i = 1;
        TrackFragmentBaseMediaDecodeTimeBox trackfragmentbasemediadecodetimebox = new TrackFragmentBaseMediaDecodeTimeBox();
        trackfragmentbasemediadecodetimebox.setVersion(1);
        long l1 = 0L;
        track = track.getSampleDurations();
        do
        {
            if ((long)i >= l)
            {
                trackfragmentbasemediadecodetimebox.setBaseMediaDecodeTime(l1);
                trackfragmentbox.addBox(trackfragmentbasemediadecodetimebox);
                return;
            }
            l1 += track[i - 1];
            i++;
        } while (true);
    }

    protected void createTfhd(long l, long l1, Track track, int i, TrackFragmentBox trackfragmentbox)
    {
        TrackFragmentHeaderBox trackfragmentheaderbox = new TrackFragmentHeaderBox();
        trackfragmentheaderbox.setDefaultSampleFlags(new SampleFlags());
        trackfragmentheaderbox.setBaseDataOffset(-1L);
        trackfragmentheaderbox.setTrackId(track.getTrackMetaData().getTrackId());
        trackfragmentheaderbox.setDefaultBaseIsMoof(true);
        trackfragmentbox.addBox(trackfragmentheaderbox);
    }

    protected Box createTfra(Track track, Container container)
    {
        Object obj;
        TrackFragmentRandomAccessBox trackfragmentrandomaccessbox;
        LinkedList linkedlist;
        Object obj2;
        trackfragmentrandomaccessbox = new TrackFragmentRandomAccessBox();
        trackfragmentrandomaccessbox.setVersion(1);
        linkedlist = new LinkedList();
        obj2 = Path.getPaths(container, "moov/mvex/trex").iterator();
        obj = null;
_L4:
        if (((Iterator) (obj2)).hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        long l;
        long l1;
        l1 = 0L;
        l = 0L;
        obj1 = container.getBoxes().iterator();
_L9:
        long l2;
        if (!((Iterator) (obj1)).hasNext())
        {
            trackfragmentrandomaccessbox.setEntries(linkedlist);
            trackfragmentrandomaccessbox.setTrackId(track.getTrackMetaData().getTrackId());
            return trackfragmentrandomaccessbox;
        }
        obj2 = (Box)((Iterator) (obj1)).next();
        l2 = l;
          goto _L3
_L2:
        obj1 = (TrackExtendsBox)((Iterator) (obj2)).next();
        if (((TrackExtendsBox) (obj1)).getTrackId() == track.getTrackMetaData().getTrackId())
        {
            obj = obj1;
        }
          goto _L4
_L3:
        if (!(obj2 instanceof MovieFragmentBox)) goto _L6; else goto _L5
_L5:
        List list;
        int i;
        list = ((MovieFragmentBox)obj2).getBoxes(com/coremedia/iso/boxes/fragment/TrackFragmentBox);
        i = 0;
_L14:
        if (i < list.size()) goto _L8; else goto _L7
_L7:
        l2 = l;
_L6:
        l1 += ((Box) (obj2)).getSize();
        l = l2;
          goto _L9
_L8:
        container = (TrackFragmentBox)list.get(i);
        l2 = l;
        if (container.getTrackFragmentHeaderBox().getTrackId() != track.getTrackMetaData().getTrackId()) goto _L11; else goto _L10
_L10:
        List list1;
        int j;
        list1 = container.getBoxes(com/coremedia/iso/boxes/fragment/TrackRunBox);
        j = 0;
_L15:
        if (j < list1.size()) goto _L13; else goto _L12
_L12:
        l2 = l;
_L11:
        i++;
        l = l2;
          goto _L14
_L13:
        LinkedList linkedlist1;
        TrackRunBox trackrunbox;
        int k;
        linkedlist1 = new LinkedList();
        trackrunbox = (TrackRunBox)list1.get(j);
        k = 0;
_L16:
label0:
        {
            if (k < trackrunbox.getEntries().size())
            {
                break label0;
            }
            com.coremedia.iso.boxes.fragment.TrackRunBox.Entry entry;
            if (linkedlist1.size() == trackrunbox.getEntries().size() && trackrunbox.getEntries().size() > 0)
            {
                linkedlist.add((com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry)linkedlist1.get(0));
            } else
            {
                linkedlist.addAll(linkedlist1);
            }
            j++;
        }
          goto _L15
        entry = (com.coremedia.iso.boxes.fragment.TrackRunBox.Entry)trackrunbox.getEntries().get(k);
        if (k == 0 && trackrunbox.isFirstSampleFlagsPresent())
        {
            container = trackrunbox.getFirstSampleFlags();
        } else
        if (trackrunbox.isSampleFlagsPresent())
        {
            container = entry.getSampleFlags();
        } else
        {
            container = ((TrackExtendsBox) (obj)).getDefaultSampleFlags();
        }
        if (container == null && track.getHandler().equals("vide"))
        {
            throw new RuntimeException("Cannot find SampleFlags for video track but it's required to build tfra");
        }
        if (container == null || container.getSampleDependsOn() == 2)
        {
            linkedlist1.add(new com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry(l, l1, i + 1, j + 1, k + 1));
        }
        l += entry.getSampleDuration();
        k++;
          goto _L16
    }

    protected Box createTkhd(Movie movie, Track track)
    {
        movie = new TrackHeaderBox();
        movie.setVersion(1);
        movie.setFlags(7);
        movie.setAlternateGroup(track.getTrackMetaData().getGroup());
        movie.setCreationTime(track.getTrackMetaData().getCreationTime());
        movie.setDuration(0L);
        movie.setHeight(track.getTrackMetaData().getHeight());
        movie.setWidth(track.getTrackMetaData().getWidth());
        movie.setLayer(track.getTrackMetaData().getLayer());
        movie.setModificationTime(getDate());
        movie.setTrackId(track.getTrackMetaData().getTrackId());
        movie.setVolume(track.getTrackMetaData().getVolume());
        return movie;
    }

    protected void createTraf(long l, long l1, Track track, int i, MovieFragmentBox moviefragmentbox)
    {
        TrackFragmentBox trackfragmentbox;
        Object obj;
        trackfragmentbox = new TrackFragmentBox();
        moviefragmentbox.addBox(trackfragmentbox);
        createTfhd(l, l1, track, i, trackfragmentbox);
        createTfdt(l, track, trackfragmentbox);
        createTrun(l, l1, track, i, trackfragmentbox);
        if (track instanceof CencEncryptedTrack)
        {
            createSaiz(l, l1, (CencEncryptedTrack)track, i, trackfragmentbox);
            createSenc(l, l1, (CencEncryptedTrack)track, i, trackfragmentbox);
            createSaio(l, l1, (CencEncryptedTrack)track, i, trackfragmentbox);
        }
        obj = new HashMap();
        Iterator iterator = track.getSampleGroups().entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                obj = ((Map) (obj)).entrySet().iterator();
                break MISSING_BLOCK_LABEL_154;
            }
            java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
            String s = ((GroupEntry)entry1.getKey()).getType();
            moviefragmentbox = (List)((Map) (obj)).get(s);
            if (moviefragmentbox == null)
            {
                moviefragmentbox = new ArrayList();
                ((Map) (obj)).put(s, moviefragmentbox);
            }
            moviefragmentbox.add((GroupEntry)entry1.getKey());
        } while (true);
_L2:
        java.util.Map.Entry entry;
        SampleGroupDescriptionBox samplegroupdescriptionbox;
        SampleToGroupBox sampletogroupbox;
        if (!((Iterator) (obj)).hasNext())
        {
            return;
        }
        entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        samplegroupdescriptionbox = new SampleGroupDescriptionBox();
        moviefragmentbox = (String)entry.getKey();
        samplegroupdescriptionbox.setGroupEntries((List)entry.getValue());
        sampletogroupbox = new SampleToGroupBox();
        sampletogroupbox.setGroupingType(moviefragmentbox);
        moviefragmentbox = null;
        i = CastUtils.l2i(l - 1L);
_L3:
label0:
        {
            if (i < CastUtils.l2i(l1 - 1L))
            {
                break label0;
            }
            trackfragmentbox.addBox(samplegroupdescriptionbox);
            trackfragmentbox.addBox(sampletogroupbox);
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
            if (moviefragmentbox == null || moviefragmentbox.getGroupDescriptionIndex() != k)
            {
                moviefragmentbox = new com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.Entry(1L, k);
                sampletogroupbox.getEntries().add(moviefragmentbox);
            } else
            {
                moviefragmentbox.setSampleCount(moviefragmentbox.getSampleCount() + 1L);
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

    protected Box createTrak(Track track, Movie movie)
    {
        LOG.fine((new StringBuilder("Creating Track ")).append(track).toString());
        TrackBox trackbox = new TrackBox();
        trackbox.addBox(createTkhd(movie, track));
        Box box = createEdts(track, movie);
        if (box != null)
        {
            trackbox.addBox(box);
        }
        trackbox.addBox(createMdia(track, movie));
        return trackbox;
    }

    protected Box createTrex(Movie movie, Track track)
    {
        movie = new TrackExtendsBox();
        movie.setTrackId(track.getTrackMetaData().getTrackId());
        movie.setDefaultSampleDescriptionIndex(1L);
        movie.setDefaultSampleDuration(0L);
        movie.setDefaultSampleSize(0L);
        SampleFlags sampleflags = new SampleFlags();
        if ("soun".equals(track.getHandler()) || "subt".equals(track.getHandler()))
        {
            sampleflags.setSampleDependsOn(2);
            sampleflags.setSampleIsDependedOn(2);
        }
        movie.setDefaultSampleFlags(sampleflags);
        return movie;
    }

    protected void createTrun(long l, long l1, Track track, int i, TrackFragmentBox trackfragmentbox)
    {
        com.coremedia.iso.boxes.CompositionTimeToSample.Entry aentry[];
        long al[];
        ArrayList arraylist;
        int j;
        long l2;
        long l3;
        boolean flag1;
        TrackRunBox trackrunbox = new TrackRunBox();
        trackrunbox.setVersion(1);
        al = getSampleSizes(l, l1, track, i);
        trackrunbox.setSampleDurationPresent(true);
        trackrunbox.setSampleSizePresent(true);
        arraylist = new ArrayList(CastUtils.l2i(l1 - l));
        List list = track.getCompositionTimeEntries();
        boolean flag;
        if (list != null && list.size() > 0)
        {
            aentry = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry[])list.toArray(new com.coremedia.iso.boxes.CompositionTimeToSample.Entry[list.size()]);
        } else
        {
            aentry = null;
        }
        if (aentry != null)
        {
            i = aentry[0].getCount();
        } else
        {
            i = -1;
        }
        l2 = i;
        if (l2 > 0L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        trackrunbox.setSampleCompositionTimeOffsetPresent(flag1);
        i = 0;
        l3 = 1L;
_L3:
        if (l3 < l) goto _L2; else goto _L1
_L1:
        if ((track.getSampleDependencies() == null || track.getSampleDependencies().isEmpty()) && (track.getSyncSamples() == null || track.getSyncSamples().length == 0))
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        trackrunbox.setSampleFlagsPresent(flag1);
        flag = false;
        j = i;
        i = ((flag) ? 1 : 0);
_L4:
        if (i >= al.length)
        {
            trackrunbox.setEntries(arraylist);
            trackfragmentbox.addBox(trackrunbox);
            return;
        }
        break MISSING_BLOCK_LABEL_344;
_L2:
        l1 = l2;
        j = i;
        if (aentry != null)
        {
            l2--;
            l1 = l2;
            j = i;
            if (l2 == 0L)
            {
                l1 = l2;
                j = i;
                if (aentry.length - i > 1)
                {
                    j = i + 1;
                    l1 = aentry[j].getCount();
                }
            }
        }
        l3++;
        l2 = l1;
        i = j;
          goto _L3
        com.coremedia.iso.boxes.fragment.TrackRunBox.Entry entry = new com.coremedia.iso.boxes.fragment.TrackRunBox.Entry();
        entry.setSampleSize(al[i]);
        if (flag1)
        {
            SampleFlags sampleflags = new SampleFlags();
            if (track.getSampleDependencies() != null && !track.getSampleDependencies().isEmpty())
            {
                com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry entry1 = (com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry)track.getSampleDependencies().get(i);
                sampleflags.setSampleDependsOn(entry1.getSampleDependsOn());
                sampleflags.setSampleIsDependedOn(entry1.getSampleIsDependentOn());
                sampleflags.setSampleHasRedundancy(entry1.getSampleHasRedundancy());
            }
            int k;
            if (track.getSyncSamples() != null && track.getSyncSamples().length > 0)
            {
                if (Arrays.binarySearch(track.getSyncSamples(), (long)i + l) >= 0)
                {
                    sampleflags.setSampleIsDifferenceSample(false);
                    sampleflags.setSampleDependsOn(2);
                } else
                {
                    sampleflags.setSampleIsDifferenceSample(true);
                    sampleflags.setSampleDependsOn(1);
                }
            }
            entry.setSampleFlags(sampleflags);
        }
        entry.setSampleDuration(track.getSampleDurations()[CastUtils.l2i(((long)i + l) - 1L)]);
        k = j;
        l1 = l2;
        if (aentry != null)
        {
            entry.setSampleCompositionTimeOffset(aentry[j].getOffset());
            l2--;
            k = j;
            l1 = l2;
            if (l2 == 0L)
            {
                k = j;
                l1 = l2;
                if (aentry.length - j > 1)
                {
                    k = j + 1;
                    l1 = aentry[k].getCount();
                }
            }
        }
        arraylist.add(entry);
        i++;
        j = k;
        l2 = l1;
          goto _L4
    }

    public Date getDate()
    {
        return new Date();
    }

    public FragmentIntersectionFinder getFragmentIntersectionFinder()
    {
        return intersectionFinder;
    }

    protected long[] getSampleSizes(long l, long l1, Track track, int i)
    {
        track = getSamples(l, l1, track, i);
        long al[] = new long[track.size()];
        i = 0;
        do
        {
            if (i >= al.length)
            {
                return al;
            }
            al[i] = ((Sample)track.get(i)).getSize();
            i++;
        } while (true);
    }

    protected List getSamples(long l, long l1, Track track, int i)
    {
        return track.getSamples().subList(CastUtils.l2i(l) - 1, CastUtils.l2i(l1) - 1);
    }

    public void setIntersectionFinder(FragmentIntersectionFinder fragmentintersectionfinder)
    {
        intersectionFinder = fragmentintersectionfinder;
    }

    protected List sortTracksInSequence(List list, final int cycle, final Map intersectionMap)
    {
        list = new LinkedList(list);
        Collections.sort(list, new _cls1());
        return list;
    }

    static 
    {
        boolean flag;
        if (!com/googlecode/mp4parser/authoring/builder/FragmentedMp4Builder.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    private class _cls1Mdat
        implements Box
    {

        Container parent;
        long size_;
        final FragmentedMp4Builder this$0;
        private final long val$endSample;
        private final int val$i;
        private final long val$startSample;
        private final Track val$track;

        public void getBox(WritableByteChannel writablebytechannel)
        {
            Object obj = ByteBuffer.allocate(8);
            IsoTypeWriter.writeUInt32(((ByteBuffer) (obj)), CastUtils.l2i(getSize()));
            ((ByteBuffer) (obj)).put(IsoFile.fourCCtoBytes(getType()));
            ((ByteBuffer) (obj)).rewind();
            writablebytechannel.write(((ByteBuffer) (obj)));
            obj = getSamples(startSample, endSample, track, i).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    return;
                }
                ((Sample)((Iterator) (obj)).next()).writeTo(writablebytechannel);
            } while (true);
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
            if (size_ != -1L)
            {
                return size_;
            }
            Iterator iterator = getSamples(startSample, endSample, track, i).iterator();
            long l = 8L;
            do
            {
                if (!iterator.hasNext())
                {
                    size_ = l;
                    return l;
                }
                l = ((Sample)iterator.next()).getSize() + l;
            } while (true);
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

        _cls1Mdat()
        {
            this$0 = FragmentedMp4Builder.this;
            startSample = l;
            endSample = l1;
            track = track1;
            i = j;
            super();
            size_ = -1L;
        }
    }


    private class _cls1
        implements Comparator
    {

        final FragmentedMp4Builder this$0;
        private final int val$cycle;
        private final Map val$intersectionMap;

        public int compare(Track track, Track track1)
        {
            long al[];
            long al1[];
            int i;
            long l;
            long l1;
            long l2;
            long l3;
            l3 = ((long[])intersectionMap.get(track))[cycle];
            l2 = ((long[])intersectionMap.get(track1))[cycle];
            al = track.getSampleDurations();
            al1 = track1.getSampleDurations();
            l = 0L;
            l1 = 0L;
            i = 1;
_L3:
            if ((long)i < l3) goto _L2; else goto _L1
_L1:
            i = 1;
_L4:
            if ((long)i >= l2)
            {
                return (int)(((double)l / (double)track.getTrackMetaData().getTimescale() - (double)l1 / (double)track1.getTrackMetaData().getTimescale()) * 100D);
            }
            break MISSING_BLOCK_LABEL_140;
_L2:
            l += al[i - 1];
            i++;
              goto _L3
            l1 += al1[i - 1];
            i++;
              goto _L4
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((Track)obj, (Track)obj1);
        }

        _cls1()
        {
            this$0 = FragmentedMp4Builder.this;
            intersectionMap = map;
            cycle = i;
            super();
        }
    }

}
