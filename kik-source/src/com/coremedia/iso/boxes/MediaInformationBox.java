// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.coremedia.iso.boxes:
//            Box, AbstractMediaHeaderBox, SampleTableBox

public class MediaInformationBox extends AbstractContainerBox
{

    public static final String TYPE = "minf";

    public MediaInformationBox()
    {
        super("minf");
    }

    public AbstractMediaHeaderBox getMediaHeaderBox()
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
        } while (!(box instanceof AbstractMediaHeaderBox));
        return (AbstractMediaHeaderBox)box;
    }

    public SampleTableBox getSampleTableBox()
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
        } while (!(box instanceof SampleTableBox));
        return (SampleTableBox)box;
    }
}
