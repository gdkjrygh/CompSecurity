// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;

final class mki extends mkd
{

    private Handler a;

    public mki(Looper looper)
    {
        a = new Handler(looper);
    }

    public final void a(mkf mkf1)
    {
        a.postDelayed(mkf1.c(), 0L);
    }

    public final void b(mkf mkf1)
    {
        a.removeCallbacks(mkf1.c());
    }
}
