// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;

import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.qihoo360.mobilesafe.support.a:
//            e, c, a

class e extends Thread
{

    final e a;
    private final String b;
    private final List c;
    private final List d;
    private final a e;

    public void run()
    {
        c c1 = a.d();
        if (c1 != null)
        {
            c1.b(b, c, d, e);
        } else
        if (e != null)
        {
            try
            {
                e.a(2, false, null);
                return;
            }
            catch (RemoteException remoteexception)
            {
                return;
            }
        }
    }

    (e e1, String s, List list, List list1, a a1)
    {
        a = e1;
        b = s;
        c = list;
        d = list1;
        e = a1;
        super();
    }
}
