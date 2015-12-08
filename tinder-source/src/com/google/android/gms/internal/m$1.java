// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal:
//            m

final class a
    implements Comparator
{

    final m a;

    public final int compare(Object obj, Object obj1)
    {
        obj = (String)obj;
        return ((String)obj1).length() - ((String) (obj)).length();
    }

    (m m1)
    {
        a = m1;
        super();
    }
}
