// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.json.JSONException;
import org.json.JSONObject;

final class ang.Object
    implements Runnable
{

    private Throwable a;
    private long b;
    private abo c;

    public final void run()
    {
        aaa aaa1;
        try
        {
            if (c.d.b())
            {
                return;
            }
        }
        catch (ThreadDeath threaddeath)
        {
            return;
        }
        catch (Throwable throwable)
        {
            return;
        }
        aaa1 = new aaa(a, b);
        aaa1.f = "he";
        try
        {
            aaa1.g.put("app_version", "5.2.0");
        }
        catch (JSONException jsonexception) { }
        aaa1.g.remove("logcat");
        c.a.p().a(aaa1);
        return;
    }

    (abo abo1, Throwable throwable, long l)
    {
        c = abo1;
        a = throwable;
        b = l;
        super();
    }
}
