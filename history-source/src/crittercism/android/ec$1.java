// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            ec, dw, bk, aw, 
//            br

final class b
    implements Runnable
{

    final Throwable a;
    final long b;
    final ec c;

    public final void run()
    {
        bk bk1;
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
        bk1 = new bk(a, b);
        bk1.d = "he";
        try
        {
            bk1.e.put("app_version", "5.0.4");
        }
        catch (JSONException jsonexception) { }
        bk1.e.remove("logcat");
        c.a.p().a(bk1);
        return;
    }

    (ec ec1, Throwable throwable, long l)
    {
        c = ec1;
        a = throwable;
        b = l;
        super();
    }
}
