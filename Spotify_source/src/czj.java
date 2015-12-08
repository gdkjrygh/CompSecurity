// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.HandlerThread;
import android.os.Message;
import android.util.DisplayMetrics;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import org.json.JSONArray;

public class czj
    implements czg, czi, dag
{

    private final cxi a;
    private final cxk b;
    private final cyp c;
    private final cyu d = new cyu();
    private final cyd e;
    private final Map f;
    private final czp g;
    private final float h;

    public czj(Context context, String s, cxk cxk1, cyd cyd1)
    {
        a = cxi.a(context);
        e = cyd1;
        f = cxk1.d;
        h = Resources.getSystem().getDisplayMetrics().scaledDensity;
        ((Application)context.getApplicationContext()).registerActivityLifecycleCallbacks(new czm(this));
        cyd1 = new HandlerThread(czj.getCanonicalName());
        cyd1.setPriority(10);
        cyd1.start();
        g = new czp(this, context, s, cyd1.getLooper(), this);
        c = new cyp(cxk1, g);
        b = cxk1;
        e.a(new cye() {

        });
    }

    static czp a(czj czj1)
    {
        return czj1.g;
    }

    static cyu b(czj czj1)
    {
        return czj1.d;
    }

    static cxi c(czj czj1)
    {
        return czj1.a;
    }

    static float d(czj czj1)
    {
        return czj1.h;
    }

    static Map e(czj czj1)
    {
        return czj1.f;
    }

    static cyd f(czj czj1)
    {
        return czj1.e;
    }

    static cyp g(czj czj1)
    {
        return czj1.c;
    }

    static cxk h(czj czj1)
    {
        return czj1.b;
    }

    public final void a()
    {
        g.a.unlock();
        g.sendMessage(g.obtainMessage(0));
    }

    public final void a(dac dac)
    {
        Message message = g.obtainMessage();
        message.what = 12;
        message.obj = dac;
        g.sendMessage(message);
    }

    public final void a(String s)
    {
        Message message = g.obtainMessage();
        message.what = 7;
        message.obj = s;
        g.sendMessage(message);
    }

    public final void a(JSONArray jsonarray)
    {
        Message message = g.obtainMessage(5);
        message.obj = jsonarray;
        g.sendMessage(message);
    }

    public final void b(JSONArray jsonarray)
    {
        Message message = g.obtainMessage(9);
        message.obj = jsonarray;
        g.sendMessage(message);
    }
}
