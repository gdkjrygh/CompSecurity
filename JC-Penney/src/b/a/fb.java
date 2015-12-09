// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package b.a:
//            fa, et, au, n, 
//            be

final class fb
    implements Runnable
{

    final Throwable a;
    final long b;
    final fa c;

    fb(fa fa1, Throwable throwable, long l)
    {
        c = fa1;
        a = throwable;
        b = l;
        super();
    }

    public final void run()
    {
        au au1;
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
            Object obj = c;
            obj = a;
            return;
        }
        au1 = new au(a, b);
        au1.e = "he";
        try
        {
            au1.f.put("app_version", "5.3.3");
        }
        catch (JSONException jsonexception) { }
        au1.f.remove("logcat");
        c.a.p().a(au1);
        return;
    }
}
