// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import com.google.a.d.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            bl, y

public final class by
{

    public static ArrayList a(Iterator iterator)
    {
        ArrayList arraylist = new ArrayList();
        com.google.a.b.bl.a(arraylist, iterator);
        return arraylist;
    }

    public static transient ArrayList a(Object aobj[])
    {
        ad.a(((Object) (aobj)));
        int i = aobj.length;
        com.google.a.b.y.a(i, "arraySize");
        long l = i;
        ArrayList arraylist = new ArrayList(com.google.a.d.a.a((long)(i / 10) + (5L + l)));
        Collections.addAll(arraylist, aobj);
        return arraylist;
    }
}
