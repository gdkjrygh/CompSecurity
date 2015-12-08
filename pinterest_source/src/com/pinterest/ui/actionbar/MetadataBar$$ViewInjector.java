// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actionbar;

import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.ui.actionbar:
//            MetadataBar

public class 
{

    public static void inject(butterknife. , MetadataBar metadatabar, Object obj)
    {
        metadatabar._iconIv = (ImageView)._iconIv(obj, 0x7f0f0076, "field '_iconIv'");
        metadatabar._titleTv = (PTextView)._titleTv(obj, 0x7f0f0077, "field '_titleTv'");
        metadatabar._headerTv = (PTextView)._headerTv(obj, 0x7f0f0075, "field '_headerTv'");
        metadatabar._addonsLl = (LinearLayout)._addonsLl(obj, 0x7f0f0078, "field '_addonsLl'");
        metadatabar._shadowUp = ._shadowUp(obj, 0x7f0f0074, "field '_shadowUp'");
        metadatabar._shadowDown = ._shadowDown(obj, 0x7f0f0079, "field '_shadowDown'");
    }

    public static void reset(MetadataBar metadatabar)
    {
        metadatabar._iconIv = null;
        metadatabar._titleTv = null;
        metadatabar._headerTv = null;
        metadatabar._addonsLl = null;
        metadatabar._shadowUp = null;
        metadatabar._shadowDown = null;
    }

    public ()
    {
    }
}
