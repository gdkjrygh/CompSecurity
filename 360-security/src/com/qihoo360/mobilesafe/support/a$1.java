// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support;

import android.content.Context;
import com.qihoo360.mobilesafe.support.a.b;

// Referenced classes of package com.qihoo360.mobilesafe.support:
//            a

class a extends Thread
{

    private final Context a;

    public void run()
    {
        Object aobj[];
        com.qihoo360.mobilesafe.support.a.a(true);
        aobj = new Object[2];
        com.qihoo360.mobilesafe.support.a.f f = com.qihoo360.mobilesafe.support.a.a(a, aobj);
        if (f != null)
        {
            try
            {
                f.a(20000L);
            }
            catch (Exception exception) { }
        }
        b(a, aobj);
        com.qihoo360.mobilesafe.support.a.a(false);
        return;
    }

    (Context context)
    {
        a = context;
        super();
    }
}
