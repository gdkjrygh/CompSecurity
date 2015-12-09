// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.logging.Logger;

final class ang.Object
    implements dzb
{

    private dza a;

    public final void a(String s)
    {
        String s1 = "";
        if (s != null)
        {
            s1 = s;
        }
        s = (String)s1;
        if (!s.isEmpty() && !s.equals(a.f))
        {
            Logger.a("Got user: %s", new Object[] {
                "anonymized"
            });
            a.f = s;
            dza.a(a);
        } else
        if (s.isEmpty() && !a.f.isEmpty())
        {
            Logger.a("Detected log out", new Object[0]);
            a.f = s;
            dza.a(a);
            return;
        }
    }

    public final void a(boolean flag)
    {
        if (a.e != null && a.e.booleanValue() == flag)
        {
            return;
        } else
        {
            a.e = Boolean.valueOf(flag);
            Boolean boolean1 = a.e;
            dza.a(a);
            return;
        }
    }

    (dza dza1)
    {
        a = dza1;
        super();
    }
}
