// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import bolts.j;
import com.cardinalblue.android.piccollage.view.k;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            CollageController

public abstract class l
{

    protected final k a;
    protected final CollageController b;

    public l(k k, CollageController collagecontroller)
    {
        a = k;
        b = collagecontroller;
    }

    public j b()
    {
        return bolts.j.a(null);
    }

    public void c()
    {
    }

    public boolean d()
    {
        return true;
    }

    public k j()
    {
        return a;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[").append(getClass().getSimpleName()).append("]").append(" scrap: ").append(a);
        return stringbuilder.toString();
    }
}
