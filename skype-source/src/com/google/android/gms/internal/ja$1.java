// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal:
//            ja, jc

final class a
    implements Comparator
{

    final ja a;

    public final int compare(Object obj, Object obj1)
    {
        obj = (jc)obj;
        obj1 = (jc)obj1;
        return obj.getClass().getCanonicalName().compareTo(obj1.getClass().getCanonicalName());
    }

    (ja ja1)
    {
        a = ja1;
        super();
    }
}
