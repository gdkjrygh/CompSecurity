// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;

final class jrs
    implements Runnable
{

    private ComponentName a;
    private jrq b;

    jrs(jrq jrq1, ComponentName componentname)
    {
        b = jrq1;
        a = componentname;
        super();
    }

    public final void run()
    {
        jro.a(b.a, a);
    }
}
