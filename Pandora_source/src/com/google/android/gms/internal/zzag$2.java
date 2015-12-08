// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal:
//            zzag

class a
    implements Comparator
{

    final zzag a;

    public int a(a a1, a a2)
    {
        return (int)(a1.value - a2.value);
    }

    public int compare(Object obj, Object obj1)
    {
        return a((a)obj, (a)obj1);
    }

    a(zzag zzag1)
    {
        a = zzag1;
        super();
    }
}
