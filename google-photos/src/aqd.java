// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class aqd
{

    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new aqe());

    aqd()
    {
    }

    public final void a(aqa aqa1)
    {
        bag.a();
        if (a)
        {
            b.obtainMessage(1, aqa1).sendToTarget();
            return;
        } else
        {
            a = true;
            aqa1.d();
            a = false;
            return;
        }
    }
}
