// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class jqn
    implements Runnable
{

    private jso a;
    private Handler b;
    private int c;
    private jql d;

    jqn(jql jql1, jso jso, Handler handler, int i)
    {
        d = jql1;
        a = jso;
        b = handler;
        c = i;
        super();
    }

    public final void run()
    {
        d.a(a, b, c);
    }
}
