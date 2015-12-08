// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.onboarding;

import me.lyft.android.IUserSession;
import me.lyft.android.infrastructure.ats.DriverApplicationDTO;
import me.lyft.android.rx.SecureObserver;

// Referenced classes of package me.lyft.android.ui.onboarding:
//            BecomeLyftDriverView

class this._cls0 extends SecureObserver
{

    final BecomeLyftDriverView this$0;

    public void onSafeError(Throwable throwable)
    {
        super.onSafeError(throwable);
        handleError(throwable);
    }

    public volatile void onSafeNext(Object obj)
    {
        onSafeNext((DriverApplicationDTO)obj);
    }

    public void onSafeNext(DriverApplicationDTO driverapplicationdto)
    {
        userSession.setDriverApplication(driverapplicationdto);
        BecomeLyftDriverView.access$400(BecomeLyftDriverView.this);
    }

    TO()
    {
        this$0 = BecomeLyftDriverView.this;
        super();
    }
}
