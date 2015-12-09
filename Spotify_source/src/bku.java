// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

public final class bku
{

    final Handler a;

    public bku(Handler handler)
    {
        a = handler;
    }

    public final void a(Runnable runnable)
    {
        a.removeCallbacks(runnable);
    }
}
