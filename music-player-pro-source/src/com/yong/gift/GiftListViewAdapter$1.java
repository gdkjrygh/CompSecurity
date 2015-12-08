// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.gift;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.ListView;

// Referenced classes of package com.yong.gift:
//            GiftListViewAdapter

class val.lvNetMusics
    implements allback
{

    final GiftListViewAdapter this$0;
    private final ListView val$lvNetMusics;

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
        this$0 = final_giftlistviewadapter;
        val$lvNetMusics = ListView.this;
        super();
    }
}
