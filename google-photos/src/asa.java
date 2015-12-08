// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

final class asa extends arz
{

    asa(String s, int i)
    {
        super(s, 1, (byte)0);
    }

    protected final void a(Throwable throwable)
    {
        if (throwable != null && Log.isLoggable("GlideExecutor", 6))
        {
            Log.e("GlideExecutor", "Request threw uncaught throwable", throwable);
        }
    }
}
