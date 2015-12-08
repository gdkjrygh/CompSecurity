// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import android.widget.ImageView;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.services:
//            LyftDriverToggleService

class this._cls0
    implements Action1
{

    final LyftDriverToggleService this$0;

    public volatile void call(Object obj)
    {
        call((String)obj);
    }

    public void call(String s)
    {
        ImageView imageview = LyftDriverToggleService.access$100(LyftDriverToggleService.this);
        int i;
        if (s.equals("driver"))
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
    }

    ()
    {
        this$0 = LyftDriverToggleService.this;
        super();
    }
}
