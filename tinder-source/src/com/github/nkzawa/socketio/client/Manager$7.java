// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.socketio.client;

import com.github.nkzawa.f.a;

// Referenced classes of package com.github.nkzawa.socketio.client:
//            Manager

final class a
    implements com.github.nkzawa.socketio.a.er._cls7
{

    final Manager a;
    final Manager b;

    public final void a(Object aobj[])
    {
        int j = aobj.length;
        int i = 0;
        while (i < j) 
        {
            Object obj = aobj[i];
            if (obj instanceof String)
            {
                com.github.nkzawa.f.a.a(new com.github.nkzawa.engineio.client.<init>(a.h, (String)obj));
            } else
            if (obj instanceof byte[])
            {
                com.github.nkzawa.f.a.a(new com.github.nkzawa.engineio.client.<init>(a.h, (byte[])(byte[])obj));
            }
            i++;
        }
        Manager.j(a);
        Manager.k(a);
    }

    (Manager manager, Manager manager1)
    {
        b = manager;
        a = manager1;
        super();
    }
}
