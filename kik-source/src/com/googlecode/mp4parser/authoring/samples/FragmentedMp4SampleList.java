// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.samples;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Path;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FragmentedMp4SampleList extends AbstractList
{

    private List allTrafs;
    private int firstSamples[];
    IsoFile fragments[];
    private SoftReference sampleCache[];
    private int size_;
    Container topLevel;
    TrackBox trackBox;
    TrackExtendsBox trex;
    private Map trunDataCache;

    public transient FragmentedMp4SampleList(long l, Container container, IsoFile aisofile[])
    {
        trackBox = null;
        trex = null;
        trunDataCache = new HashMap();
        size_ = -1;
        topLevel = container;
        fragments = aisofile;
        aisofile = Path.getPaths(container, "moov[0]/trak").iterator();
        do
        {
            if (!aisofile.hasNext())
            {
                if (trackBox == null)
                {
                    throw new RuntimeException((new StringBuilder("This MP4 does not contain track ")).append(l).toString());
                }
                break;
            }
            TrackBox trackbox = (TrackBox)aisofile.next();
            if (trackbox.getTrackHeaderBox().getTrackId() == l)
            {
                trackBox = trackbox;
            }
        } while (true);
        container = Path.getPaths(container, "moov[0]/mvex[0]/trex").iterator();
        do
        {
            do
            {
                if (!container.hasNext())
                {
                    sampleCache = (SoftReference[])Array.newInstance(java/lang/ref/SoftReference, size());
                    initAllFragments();
                    return;
                }
                aisofile = (TrackExtendsBox)container.next();
            } while (aisofile.getTrackId() != trackBox.getTrackHeaderBox().getTrackId());
            trex = aisofile;
        } while (true);
    }

    private int getTrafSize(TrackFragmentBox trackfragmentbox)
    {
        trackfragmentbox = trackfragmentbox.getBoxes();
        int i = 0;
        int j = 0;
        do
        {
            if (i >= trackfragmentbox.size())
            {
                return j;
            }
            Box box = (Box)trackfragmentbox.get(i);
            int k = j;
            if (box instanceof TrackRunBox)
            {
                k = j + CastUtils.l2i(((TrackRunBox)box).getSampleCount());
            }
            i++;
            j = k;
        } while (true);
    }

    private List initAllFragments()
    {
        ArrayList arraylist;
        Object obj;
        boolean flag;
        flag = false;
        if (allTrafs != null)
        {
            return allTrafs;
        }
        arraylist = new ArrayList();
        obj = topLevel.getBoxes(com/coremedia/iso/boxes/fragment/MovieFragmentBox).iterator();
_L6:
        if (((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        if (fragments == null) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        obj = fragments;
        j = obj.length;
        i = 0;
_L7:
        if (i < j) goto _L5; else goto _L4
_L4:
        allTrafs = arraylist;
        firstSamples = new int[allTrafs.size()];
        j = 1;
        i = ((flag) ? 1 : 0);
_L9:
        if (i >= allTrafs.size())
        {
            return arraylist;
        }
        break MISSING_BLOCK_LABEL_302;
_L2:
        Iterator iterator = ((MovieFragmentBox)((Iterator) (obj)).next()).getBoxes(com/coremedia/iso/boxes/fragment/TrackFragmentBox).iterator();
        while (iterator.hasNext()) 
        {
            TrackFragmentBox trackfragmentbox = (TrackFragmentBox)iterator.next();
            if (trackfragmentbox.getTrackFragmentHeaderBox().getTrackId() == trackBox.getTrackHeaderBox().getTrackId())
            {
                arraylist.add(trackfragmentbox);
            }
        }
          goto _L6
_L5:
        Iterator iterator1 = obj[i].getBoxes(com/coremedia/iso/boxes/fragment/MovieFragmentBox).iterator();
_L8:
label0:
        {
            if (iterator1.hasNext())
            {
                break label0;
            }
            i++;
        }
          goto _L7
        Iterator iterator2 = ((MovieFragmentBox)iterator1.next()).getBoxes(com/coremedia/iso/boxes/fragment/TrackFragmentBox).iterator();
        while (iterator2.hasNext()) 
        {
            TrackFragmentBox trackfragmentbox1 = (TrackFragmentBox)iterator2.next();
            if (trackfragmentbox1.getTrackFragmentHeaderBox().getTrackId() == trackBox.getTrackHeaderBox().getTrackId())
            {
                arraylist.add(trackfragmentbox1);
            }
        }
          goto _L8
        firstSamples[i] = j;
        j += getTrafSize((TrackFragmentBox)allTrafs.get(i));
        i++;
          goto _L9
    }

    public Sample get(int i)
    {
        int j;
        int k;
        if (sampleCache[i] != null)
        {
            Sample sample = (Sample)sampleCache[i].get();
            if (sample != null)
            {
                return sample;
            }
        }
        k = i + 1;
        j = firstSamples.length - 1;
_L3:
        if (k - firstSamples[j] < 0) goto _L2; else goto _L1
_L1:
        Object obj;
        Iterator iterator;
        Object obj1;
        int i1;
        obj = (TrackFragmentBox)allTrafs.get(j);
        i1 = k - firstSamples[j];
        obj1 = (MovieFragmentBox)((TrackFragmentBox) (obj)).getParent();
        iterator = ((TrackFragmentBox) (obj)).getBoxes().iterator();
        k = 0;
_L4:
        if (!iterator.hasNext())
        {
            throw new RuntimeException("Couldn't find sample in the traf I was looking");
        }
        break MISSING_BLOCK_LABEL_132;
_L2:
        j--;
          goto _L3
        Object obj2;
        obj2 = (Box)iterator.next();
        if (obj2 instanceof TrackRunBox)
        {
label0:
            {
                obj2 = (TrackRunBox)obj2;
                if (((TrackRunBox) (obj2)).getEntries().size() >= i1 - k)
                {
                    break label0;
                }
                k = ((TrackRunBox) (obj2)).getEntries().size() + k;
            }
        }
          goto _L4
        List list = ((TrackRunBox) (obj2)).getEntries();
        TrackFragmentHeaderBox trackfragmentheaderbox = ((TrackFragmentBox) (obj)).getTrackFragmentHeaderBox();
        boolean flag = ((TrackRunBox) (obj2)).isSampleSizePresent();
        boolean flag1 = trackfragmentheaderbox.hasDefaultSampleSize();
        IOException ioexception;
        final Object finalTrunData;
        final int finalOffset;
        int l;
        final long sampleSize;
        long l1;
        long l2;
        if (!flag)
        {
            if (flag1)
            {
                sampleSize = trackfragmentheaderbox.getDefaultSampleSize();
            } else
            {
                if (trex == null)
                {
                    throw new RuntimeException("File doesn't contain trex box but track fragments aren't fully self contained. Cannot determine sample size.");
                }
                sampleSize = trex.getDefaultSampleSize();
            }
        } else
        {
            sampleSize = 0L;
        }
        obj = (SoftReference)trunDataCache.get(obj2);
        if (obj != null)
        {
            obj = (ByteBuffer)((SoftReference) (obj)).get();
        } else
        {
            obj = null;
        }
        finalTrunData = obj;
        if (obj != null) goto _L6; else goto _L5
_L5:
        l1 = 0L;
        obj = obj1;
        if (trackfragmentheaderbox.hasBaseDataOffset())
        {
            l1 = 0L + trackfragmentheaderbox.getBaseDataOffset();
            obj = ((MovieFragmentBox) (obj1)).getParent();
        }
        l2 = l1;
        if (((TrackRunBox) (obj2)).isDataOffsetPresent())
        {
            l2 = l1 + (long)((TrackRunBox) (obj2)).getDataOffset();
        }
        finalTrunData = list.iterator();
        finalOffset = 0;
_L9:
        if (((Iterator) (finalTrunData)).hasNext()) goto _L8; else goto _L7
_L7:
        l1 = finalOffset;
        try
        {
            finalTrunData = ((Container) (obj)).getByteBuffer(l2, l1);
            trunDataCache.put(obj2, new SoftReference(finalTrunData));
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
_L6:
        finalOffset = 0;
        l = 0;
_L10:
        if (l >= i1 - k)
        {
            if (flag)
            {
                sampleSize = ((com.coremedia.iso.boxes.fragment.TrackRunBox.Entry)list.get(i1 - k)).getSampleSize();
            }
            obj = new _cls1();
            sampleCache[i] = new SoftReference(obj);
            return ((Sample) (obj));
        }
        break MISSING_BLOCK_LABEL_537;
_L8:
        obj1 = (com.coremedia.iso.boxes.fragment.TrackRunBox.Entry)((Iterator) (finalTrunData)).next();
        if (flag)
        {
            finalOffset = (int)((long)finalOffset + ((com.coremedia.iso.boxes.fragment.TrackRunBox.Entry) (obj1)).getSampleSize());
        } else
        {
            finalOffset = (int)((long)finalOffset + sampleSize);
        }
          goto _L9
        if (flag)
        {
            finalOffset = (int)((long)finalOffset + ((com.coremedia.iso.boxes.fragment.TrackRunBox.Entry)list.get(l)).getSampleSize());
        } else
        {
            finalOffset = (int)((long)finalOffset + sampleSize);
        }
        l++;
          goto _L10
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public int size()
    {
        Object obj;
        int i;
        if (size_ != -1)
        {
            return size_;
        }
        obj = topLevel.getBoxes(com/coremedia/iso/boxes/fragment/MovieFragmentBox).iterator();
        i = 0;
_L2:
        Iterator iterator;
        int j;
        int l;
        if (!((Iterator) (obj)).hasNext())
        {
            obj = fragments;
            l = obj.length;
            j = 0;
            break MISSING_BLOCK_LABEL_54;
        }
        iterator = ((MovieFragmentBox)((Iterator) (obj)).next()).getBoxes(com/coremedia/iso/boxes/fragment/TrackFragmentBox).iterator();
        j = i;
_L3:
        i = j;
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        TrackFragmentBox trackfragmentbox = (TrackFragmentBox)iterator.next();
        if (trackfragmentbox.getTrackFragmentHeaderBox().getTrackId() == trackBox.getTrackHeaderBox().getTrackId())
        {
            long l1 = j;
            j = (int)(((TrackRunBox)trackfragmentbox.getBoxes(com/coremedia/iso/boxes/fragment/TrackRunBox).get(0)).getSampleCount() + l1);
        }
          goto _L3
_L5:
        if (j >= l)
        {
            size_ = i;
            return i;
        }
        iterator = obj[j].getBoxes(com/coremedia/iso/boxes/fragment/MovieFragmentBox).iterator();
_L7:
label0:
        {
            if (iterator.hasNext())
            {
                break label0;
            }
            j++;
        }
        if (true) goto _L5; else goto _L4
_L4:
        Iterator iterator1;
        int k;
        iterator1 = ((MovieFragmentBox)iterator.next()).getBoxes(com/coremedia/iso/boxes/fragment/TrackFragmentBox).iterator();
        k = i;
_L8:
        i = k;
        if (!iterator1.hasNext()) goto _L7; else goto _L6
_L6:
        TrackFragmentBox trackfragmentbox1 = (TrackFragmentBox)iterator1.next();
        if (trackfragmentbox1.getTrackFragmentHeaderBox().getTrackId() == trackBox.getTrackHeaderBox().getTrackId())
        {
            long l2 = k;
            k = (int)(((TrackRunBox)trackfragmentbox1.getBoxes(com/coremedia/iso/boxes/fragment/TrackRunBox).get(0)).getSampleCount() + l2);
        }
          goto _L8
    }

    private class _cls1
        implements Sample
    {

        final FragmentedMp4SampleList this$0;
        private final int val$finalOffset;
        private final ByteBuffer val$finalTrunData;
        private final long val$sampleSize;

        public ByteBuffer asByteBuffer()
        {
            return (ByteBuffer)((ByteBuffer)finalTrunData.position(finalOffset)).slice().limit(CastUtils.l2i(sampleSize));
        }

        public long getSize()
        {
            return sampleSize;
        }

        public void writeTo(WritableByteChannel writablebytechannel)
        {
            writablebytechannel.write(asByteBuffer());
        }

        _cls1()
        {
            this$0 = FragmentedMp4SampleList.this;
            sampleSize = l;
            finalTrunData = bytebuffer;
            finalOffset = i;
            super();
        }
    }

}
