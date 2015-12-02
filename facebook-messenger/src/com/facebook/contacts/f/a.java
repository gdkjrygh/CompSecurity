// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.f;

import com.google.common.a.ev;
import com.google.common.a.ew;

// Referenced classes of package com.facebook.contacts.f:
//            b

public class a
{

    private static final ev a;

    public a()
    {
    }

    public int a(b b1)
    {
        return ((Integer)a.get(b1)).intValue();
    }

    static 
    {
        a = (new ew()).b(b.SMALL, Integer.valueOf(100)).b(b.BIG, Integer.valueOf(200)).b(b.HUGE, Integer.valueOf(800)).b();
    }
}
