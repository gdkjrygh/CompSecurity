// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            aw, dg, dw, bk, 
//            br

public final class ec
{

    aw a;
    ExecutorService b;
    dg c;
    dw d;

    public ec()
    {
    }

    public ec(aw aw, ExecutorService executorservice, dg dg, dw dw)
    {
        a = aw;
        b = executorservice;
        c = dg;
        d = dw;
    }

    // Unreferenced inner class crittercism/android/ec$1

/* anonymous class */
    final class _cls1
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

            
            {
                c = ec.this;
                a = throwable;
                b = l;
                super();
            }
    }

}
