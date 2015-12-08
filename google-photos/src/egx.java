// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.widget.ImageView;

final class egx
    implements Runnable
{

    private egv a;

    egx(egv egv1)
    {
        a = egv1;
        super();
    }

    public final void run()
    {
        egv.c(a).invalidate();
        egv.d(a);
        if (egv.e(a) < 30 && egv.f(a) == eha.a)
        {
            egv.h(a).postDelayed(egv.g(a), 50L);
        }
    }
}
