// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            rf, rl, rj

public final class rh
{

    public static rl a(List list)
    {
        rf rf1 = new rf();
        int i = list.size();
        AtomicInteger atomicinteger = new AtomicInteger(0);
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ((rl)iterator.next()).a(new rj(atomicinteger, i, rf1, list))) { }
        return rf1;
    }
}
