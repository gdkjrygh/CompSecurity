// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.animation.ValueAnimator;
import android.media.MediaPlayer;

// Referenced classes of package com.snapchat.android.ui:
//            CashSwiperView

public final class a
    implements android.media.paredListener
{

    private CashSwiperView a;

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        CashSwiperView.l(a);
        CashSwiperView.m(a).start();
        if (CashSwiperView.b(a) != null)
        {
            CashSwiperView.b(a).start();
            if (CashSwiperView.b(a).getDuration() > 5000)
            {
                CashSwiperView.n(a);
            }
        }
    }

    public ner(CashSwiperView cashswiperview)
    {
        a = cashswiperview;
        super();
    }
}
