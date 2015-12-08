// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import rx.functions.Action0;

// Referenced classes of package me.lyft.android.services:
//            LyftDriverToggleService

class this._cls0
    implements Action0
{

    final LyftDriverToggleService this$0;

    public void call()
    {
        LyftDriverToggleService.access$300(LyftDriverToggleService.this).setVisibility(0);
        LyftDriverToggleService.access$400(LyftDriverToggleService.this).setVisibility(0);
        LyftDriverToggleService.access$500(LyftDriverToggleService.this).setVisibility(0);
        LyftDriverToggleService.access$500(LyftDriverToggleService.this).setText(0x7f07017b);
    }

    ()
    {
        this$0 = LyftDriverToggleService.this;
        super();
    }
}
