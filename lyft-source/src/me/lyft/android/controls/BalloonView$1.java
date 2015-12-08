// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import java.util.ArrayList;
import me.lyft.android.rx.SecureObserver;

// Referenced classes of package me.lyft.android.controls:
//            BalloonView

class > extends SecureObserver
{

    final BalloonView this$0;

    public void onSafeNext(Long long1)
    {
        BalloonView.access$600(BalloonView.this);
        BalloonView.access$700(BalloonView.this);
        if (!BalloonView.access$800(BalloonView.this).isEmpty())
        {
            invalidate();
        }
    }

    public volatile void onSafeNext(Object obj)
    {
        onSafeNext((Long)obj);
    }

    ()
    {
        this$0 = BalloonView.this;
        super();
    }
}
