// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.coremedia.iso.boxes:
//            Box, MediaBox, MediaInformationBox, TrackHeaderBox, 
//            SampleTableBox

public class TrackBox extends AbstractContainerBox
{

    public static final String TYPE = "trak";
    private SampleTableBox sampleTableBox;

    public TrackBox()
    {
        super("trak");
    }

    public MediaBox getMediaBox()
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
        } while (!(box instanceof MediaBox));
        return (MediaBox)box;
    }

    public SampleTableBox getSampleTableBox()
    {
        if (sampleTableBox != null)
        {
            return sampleTableBox;
        }
        Object obj = getMediaBox();
        if (obj != null)
        {
            obj = ((MediaBox) (obj)).getMediaInformationBox();
            if (obj != null)
            {
                sampleTableBox = ((MediaInformationBox) (obj)).getSampleTableBox();
                return sampleTableBox;
            }
        }
        return null;
    }

    public TrackHeaderBox getTrackHeaderBox()
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
        } while (!(box instanceof TrackHeaderBox));
        return (TrackHeaderBox)box;
    }

    public void setBoxes(List list)
    {
        super.setBoxes(list);
        sampleTableBox = null;
    }
}
