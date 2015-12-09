// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;


// Referenced classes of package com.yume.android.player:
//            az, S, B

final class X
    implements Runnable
{

    private S a;

    X(S s)
    {
        a = s;
        super();
    }

    public final void run()
    {
        try
        {
            az.c();
            return;
        }
        catch (Exception exception)
        {
            a.a.c("Exception resetting WebView.");
            exception.printStackTrace();
            return;
        }
    }
}
