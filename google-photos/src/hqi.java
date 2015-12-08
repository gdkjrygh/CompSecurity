// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hqi
    implements hqf
{

    private final noz a;
    private final Context b;
    private final muz c;
    private final hqh d;

    public hqi(Context context, muz muz1, hqh hqh1)
    {
        b = context;
        c = muz1;
        d = hqh1;
        a = noz.a(context, 3, "PeriodicJobWrapper", new String[] {
            "sync", "perf"
        });
    }

    public final String a()
    {
        String s = String.valueOf(d.a());
        if (s.length() != 0)
        {
            return "Periodic".concat(s);
        } else
        {
            return new String("Periodic");
        }
    }

    public final void a(int i, hqo hqo1)
    {
        if (i != -1) goto _L2; else goto _L1
_L1:
        if (a.a())
        {
            noy.a("wrapped job", d.a());
        }
_L4:
        return;
_L2:
        long l = ((mmv)olm.a(b, mmv)).a(i).d(d.b()).a("last_run_time", 0L);
        long l1 = c.a();
        if (l1 - l >= d.c())
        {
            break; /* Loop/switch isn't completed */
        }
        if (a.a())
        {
            noy.a("wrapped job", d.a());
            noy.a("last run time", Long.valueOf(l));
            noy.a("now", Long.valueOf(l1));
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        break; /* Loop/switch isn't completed */
        hqo1;
        if (a.a())
        {
            noy.a("wrapped job", d.a());
            noy.a(i);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        d.a(i, hqo1);
        if (!hqo1.c)
        {
            try
            {
                ((mmv)olm.a(b, mmv)).b(i).h(d.b()).b("last_run_time", c.a()).d();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (hqo hqo1) { }
            if (a.a())
            {
                noy.a("wrapped job", d.a());
                noy.a(i);
                return;
            }
        }
        if (true) goto _L4; else goto _L6
_L6:
    }
}
