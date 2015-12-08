// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.service.session.SessionStateService;
import com.spotify.mobile.android.util.Assertion;
import java.util.Iterator;
import java.util.LinkedList;

public final class edb extends dwj
{

    private final LinkedList f = new LinkedList();

    public edb(Context context)
    {
        super(context, com/spotify/mobile/android/service/session/SessionStateService);
    }

    public static edb a(Activity activity)
    {
        Assertion.a(activity instanceof edc, "Activity must be instance of SessionStateClientAware!");
        return ((edc)activity).c();
    }

    public final void a(eda eda1)
    {
        f.add(eda1);
        if (c())
        {
            ((ecz)f()).a(eda1);
        }
    }

    public final void b()
    {
        if (c())
        {
            eda eda1;
            for (Iterator iterator = f.iterator(); iterator.hasNext(); ((ecz)f()).b(eda1))
            {
                eda1 = (eda)iterator.next();
            }

        }
        super.b();
    }

    public final void b(eda eda1)
    {
        f.remove(eda1);
        if (c())
        {
            ((ecz)f()).b(eda1);
        }
    }

    protected final void e()
    {
        super.e();
        eda eda1;
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((ecz)f()).a(eda1))
        {
            eda1 = (eda)iterator.next();
        }

    }

    public final String g()
    {
        SessionStateService sessionstateservice = ((ecz)f()).a;
        if (sessionstateservice.b != null)
        {
            return sessionstateservice.b.b;
        } else
        {
            return null;
        }
    }

    public final SessionState h()
    {
        return ((ecz)f()).a.b;
    }
}
