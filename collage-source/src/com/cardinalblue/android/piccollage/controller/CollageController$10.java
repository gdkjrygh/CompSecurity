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
        l1 = l1.j();
        l2 = l2.j();
        int j = a.j() + 1;
        int i;
        if (l1.t() == -1)
        {
            i = l1.W() + j;
        } else
        {
            i = l1.W();
        }
        if (l2.t() == -1)
        {
            j = l2.W() + j;
        } else
        {
            j = l2.W();
        }
        return i - j;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((l)obj, (l)obj1);
    }

    I(CollageController collagecontroller)
    {
        a = collagecontroller;
        super();
    }
}
