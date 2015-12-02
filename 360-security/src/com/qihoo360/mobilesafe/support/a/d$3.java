// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;

import android.util.Log;

// Referenced classes of package com.qihoo360.mobilesafe.support.a:
//            d

class b
    implements Runnable
{

    final d a;
    private final a b;

    public void run()
    {
        d.a(a, b);
_L1:
        return;
        Exception exception;
        exception;
        if (a.e)
        {
            Log.e("RootClient", "", exception);
            return;
        }
          goto _L1
    }

    (d d1,  )
    {
        a = d1;
        b = ;
        super();
    }
}
