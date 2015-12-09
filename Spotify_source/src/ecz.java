// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import com.spotify.mobile.android.service.session.SessionStateService;
import java.util.Set;

public final class ecz extends Binder
{

    final SessionStateService a;

    public ecz(SessionStateService sessionstateservice)
    {
        a = sessionstateservice;
        super();
    }

    public final void a(eda eda1)
    {
        SessionStateService sessionstateservice = a;
        sessionstateservice.a.add(eda1);
        if (sessionstateservice.b != null)
        {
            eda1.a(sessionstateservice.b);
        }
    }

    public final void b(eda eda1)
    {
        a.a.remove(eda1);
    }
}
