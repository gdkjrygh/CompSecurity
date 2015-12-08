// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.microsoft.advertising.android:
//            a, d, l

abstract class ao extends a
    implements d
{

    protected final ArrayList a;
    protected final ArrayList b;

    ao(ArrayList arraylist, ArrayList arraylist1, l l)
    {
        super(l);
        a = arraylist;
        b = arraylist1;
    }

    public final volatile List b()
    {
        return b;
    }

    public boolean f()
    {
        return false;
    }

    final ArrayList g()
    {
        return a;
    }
}
