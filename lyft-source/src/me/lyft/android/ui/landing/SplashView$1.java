// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.landing:
//            SplashView

class this._cls0
    implements Runnable
{

    final SplashView this$0;

    public void run()
    {
        if (SplashView.access$000(SplashView.this) != null)
        {
            SplashView.access$000(SplashView.this).call(Unit.create());
        }
    }

    ()
    {
        this$0 = SplashView.this;
        super();
    }
}
