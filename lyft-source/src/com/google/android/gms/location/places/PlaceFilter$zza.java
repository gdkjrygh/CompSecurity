// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceFilter

public final class <init>
{

    private Collection a;
    private boolean b;
    private Collection c;
    private String d[];

    public PlaceFilter a()
    {
        java.util.List list = null;
        ArrayList arraylist;
        ArrayList arraylist1;
        if (a != null)
        {
            arraylist = new ArrayList(a);
        } else
        {
            arraylist = null;
        }
        if (c != null)
        {
            arraylist1 = new ArrayList(c);
        } else
        {
            arraylist1 = null;
        }
        if (d != null)
        {
            list = Arrays.asList(d);
        }
        return new PlaceFilter(arraylist, b, list, arraylist1);
    }

    private ()
    {
        a = null;
        b = false;
        c = null;
        d = null;
    }

    d(d d1)
    {
        this();
    }
}
