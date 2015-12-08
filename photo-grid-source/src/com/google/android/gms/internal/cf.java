// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal:
//            ce

final class cf
    implements Comparator
{

    final ce a;

    cf(ce ce)
    {
        a = ce;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (String)obj;
        return ((String)obj1).length() - ((String) (obj)).length();
    }
}
