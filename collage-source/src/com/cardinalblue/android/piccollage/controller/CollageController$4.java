// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import com.cardinalblue.android.piccollage.view.k;
import java.util.Comparator;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            CollageController, l

class a
    implements Comparator
{

    final CollageController a;

    public int a(l l1, l l2)
    {
        return l1.j().W() - l2.j().W();
    }

    public int compare(Object obj, Object obj1)
    {
        return a((l)obj, (l)obj1);
    }

    (CollageController collagecontroller)
    {
        a = collagecontroller;
        super();
    }
}
