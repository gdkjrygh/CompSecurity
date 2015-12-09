// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.provider.PaymentState;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository;
import java.lang.ref.WeakReference;

public final class frz extends fri
{

    boolean j;
    long k;
    private frx l;

    public frz(frx frx1, UserEligibilityRepository usereligibilityrepository, fsg fsg)
    {
        super(usereligibilityrepository, frx1, fsg);
        l = frx1;
    }

    public final void a()
    {
        super.a();
        l.a.clear();
        l = null;
    }

    public final void a(SessionState sessionstate)
    {
        super.a(sessionstate);
        sessionstate = sessionstate.l;
        if (sessionstate.c())
        {
            j = true;
            k = sessionstate.e() * 1000L;
        }
    }
}
