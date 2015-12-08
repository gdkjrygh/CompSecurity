// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.bo.bb;
import com.google.android.m4b.maps.br.d;
import java.util.Comparator;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            t

final class a
    implements Comparator
{

    private t a;

    public final int compare(Object obj, Object obj1)
    {
        obj = (d)obj;
        return ((d)obj1).a.e() - ((d) (obj)).a.e();
    }

    (t t1)
    {
        a = t1;
        super();
    }
}
