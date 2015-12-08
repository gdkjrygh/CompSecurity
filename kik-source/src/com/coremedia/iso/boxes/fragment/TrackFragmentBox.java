// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.boxes.Box;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.coremedia.iso.boxes.fragment:
//            TrackFragmentHeaderBox

public class TrackFragmentBox extends AbstractContainerBox
{

    public static final String TYPE = "traf";

    public TrackFragmentBox()
    {
        super("traf");
    }

    public TrackFragmentHeaderBox getTrackFragmentHeaderBox()
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
        } while (!(box instanceof TrackFragmentHeaderBox));
        return (TrackFragmentHeaderBox)box;
    }
}
