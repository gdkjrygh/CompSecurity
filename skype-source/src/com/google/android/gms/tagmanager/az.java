// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bf, cl, ck

abstract class az extends bf
{

    public az(String s)
    {
        super(s);
    }

    protected final boolean a(com.google.android.gms.internal.h.a a1, com.google.android.gms.internal.h.a a2, Map map)
    {
        a1 = cl.b(a1);
        a2 = cl.b(a2);
        if (a1 == cl.d() || a2 == cl.d())
        {
            return false;
        } else
        {
            return a(((ck) (a1)), ((ck) (a2)));
        }
    }

    protected abstract boolean a(ck ck, ck ck1);
}
