// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import fs;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.coremedia.iso.boxes:
//            Box, HandlerBox, MediaHeaderBox, MediaInformationBox

public class MediaBox extends fs
{

    public static final String TYPE = "mdia";

    public MediaBox()
    {
        super("mdia");
    }

    public HandlerBox getHandlerBox()
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
        } while (!(box instanceof HandlerBox));
        return (HandlerBox)box;
    }

    public MediaHeaderBox getMediaHeaderBox()
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
        } while (!(box instanceof MediaHeaderBox));
        return (MediaHeaderBox)box;
    }

    public MediaInformationBox getMediaInformationBox()
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
        } while (!(box instanceof MediaInformationBox));
        return (MediaInformationBox)box;
    }
}
