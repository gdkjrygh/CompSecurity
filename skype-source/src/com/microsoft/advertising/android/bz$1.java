// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


// Referenced classes of package com.microsoft.advertising.android:
//            bz, ai

final class c
    implements Runnable
{

    final bz a;
    private final String b;
    private final ai c;

    public final void run()
    {
        a.loadUrl(String.format("javascript:%s", new Object[] {
            b
        }));
_L1:
        return;
        Exception exception;
        exception;
        if (c != null)
        {
            c.a(exception);
            return;
        }
          goto _L1
    }

    (bz bz1, String s, ai ai1)
    {
        a = bz1;
        b = s;
        c = ai1;
        super();
    }
}
