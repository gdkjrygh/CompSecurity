// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class ng.Object
    implements Runnable
{

    private a a;

    public final void run()
    {
        if (!a.a || a.a == null)
        {
            return;
        } else
        {
            a.a.b();
            a.a.post(a.a);
            return;
        }
    }

    dler(dler dler)
    {
        a = dler;
        super();
    }
}
