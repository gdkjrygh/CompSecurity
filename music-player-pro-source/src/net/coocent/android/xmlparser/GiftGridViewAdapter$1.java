// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.coocent.android.xmlparser;

import android.graphics.Bitmap;
import android.widget.GridView;
import android.widget.ImageView;

// Referenced classes of package net.coocent.android.xmlparser:
//            GiftGridViewAdapter

class val.lvNetMusics
    implements allback
{

    final GiftGridViewAdapter this$0;
    private final GridView val$lvNetMusics;

    public void imageLoaded(String s, Bitmap bitmap)
    {
        s = (ImageView)val$lvNetMusics.findViewWithTag(s);
        if (s != null)
        {
            s.setImageBitmap(bitmap);
        }
    }

    allback()
    {
        this$0 = final_giftgridviewadapter;
        val$lvNetMusics = GridView.this;
        super();
    }
}
