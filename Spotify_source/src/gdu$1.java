// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.logging.Logger;

final class 
    implements dmi
{

    public final volatile void a(int i, Object obj)
    {
    }

    public final void a(Throwable throwable, String s)
    {
        Logger.b(throwable, "Exception when logging over https: %s", new Object[] {
            throwable.getMessage()
        });
        Logger.c("Log message: %s", new Object[] {
            s
        });
    }

    ()
    {
    }
}
