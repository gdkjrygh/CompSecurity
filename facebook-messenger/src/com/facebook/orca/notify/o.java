// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import com.facebook.orca.activity.d;

// Referenced classes of package com.facebook.orca.notify:
//            j

class o
    implements d
{

    final String a;
    final j b;

    o(j j1, String s)
    {
        b = j1;
        a = s;
        super();
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            j.a(b, a);
            return;
        } else
        {
            j.c(b);
            return;
        }
    }
}
