// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.coremedia.iso.boxes:
//            Box, ChunkOffsetBox, CompositionTimeToSample, SampleDependencyTypeBox, 
//            SampleDescriptionBox, SampleSizeBox, SampleToChunkBox, SyncSampleBox, 
//            TimeToSampleBox

public class SampleTableBox extends AbstractContainerBox
{

    public static final String TYPE = "stbl";
    private SampleToChunkBox sampleToChunkBox;

    public SampleTableBox()
    {
        super("stbl");
    }

    public ChunkOffsetBox getChunkOffsetBox()
    {
        Iterator iterator = getBoxes().iterator();
        Box box;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            box = (Box)iterator.next();
        } while (!(box instanceof ChunkOffsetBox));
        return (ChunkOffsetBox)box;
    }

    public CompositionTimeToSample getCompositionTimeToSample()
    {
        Iterator iterator = getBoxes().iterator();
        Box box;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            box = (Box)iterator.next();
        } while (!(box instanceof CompositionTimeToSample));
        return (CompositionTimeToSample)box;
    }

    public SampleDependencyTypeBox getSampleDependencyTypeBox()
    {
        Iterator iterator = getBoxes().iterator();
        Box box;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            box = (Box)iterator.next();
        } while (!(box instanceof SampleDependencyTypeBox));
        return (SampleDependencyTypeBox)box;
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        Iterator iterator = getBoxes().iterator();
        Box box;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            box = (Box)iterator.next();
        } while (!(box instanceof SampleDescriptionBox));
        return (SampleDescriptionBox)box;
    }

    public SampleSizeBox getSampleSizeBox()
    {
        Iterator iterator = getBoxes().iterator();
        Box box;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            box = (Box)iterator.next();
        } while (!(box instanceof SampleSizeBox));
        return (SampleSizeBox)box;
    }

    public SampleToChunkBox getSampleToChunkBox()
    {
        if (sampleToChunkBox != null)
        {
            return sampleToChunkBox;
        }
        Iterator iterator = getBoxes().iterator();
        Box box;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            box = (Box)iterator.next();
        } while (!(box instanceof SampleToChunkBox));
        sampleToChunkBox = (SampleToChunkBox)box;
        return sampleToChunkBox;
    }

    public SyncSampleBox getSyncSampleBox()
    {
        Iterator iterator = getBoxes().iterator();
        Box box;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            box = (Box)iterator.next();
        } while (!(box instanceof SyncSampleBox));
        return (SyncSampleBox)box;
    }

    public TimeToSampleBox getTimeToSampleBox()
    {
        Iterator iterator = getBoxes().iterator();
        Box box;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            box = (Box)iterator.next();
        } while (!(box instanceof TimeToSampleBox));
        return (TimeToSampleBox)box;
    }
}
