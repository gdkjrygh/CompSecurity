// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class lqv
{

    jqt a;
    private jqp b;
    private Context c;

    public lqv(Context context)
    {
        c = context;
    }

    void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = jqp.a(c);
            jqp jqp1 = b;
            jtj.a(new lqw());
            if (!jqp1.f)
            {
                jsl.b.a();
                (new StringBuilder("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.")).append((String)jsl.b.a()).append(" DEBUG");
                jqp1.f = true;
            }
            a = b.a(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
