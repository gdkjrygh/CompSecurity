// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.Adapter;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.ListView;

// Referenced classes of package com.arist.Adapter:
//            NetMusicAdapter

class val.lvNetMusics
    implements com.arist.util.allback
{

    final NetMusicAdapter this$0;
    private final ListView val$lvNetMusics;

    public void imageLoaded(String s, Bitmap bitmap)
    {
        s = (ImageView)val$lvNetMusics.findViewWithTag(s);
        if (s != null)
        {
            s.setImageBitmap(bitmap);
        }
    }

    back()
    {
        this$0 = final_netmusicadapter;
        val$lvNetMusics = ListView.this;
        super();
    }
}
