// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputtools;

import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.google.android.apps.translate.inputtools:
//            d, g

final class h
    implements Comparator
{

    final d a;
    final g b;

    h(g g, d d1)
    {
        b = g;
        a = d1;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (String)obj;
        obj1 = (String)obj1;
        return a.a.indexOf(obj) - a.a.indexOf(obj1);
    }
}
