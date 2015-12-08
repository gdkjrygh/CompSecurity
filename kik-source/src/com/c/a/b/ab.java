// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import com.c.a.a.u;
import com.c.a.g.a;
import java.util.ArrayList;
import java.util.Collections;

// Referenced classes of package com.c.a.b:
//            d

public final class ab
{

    public static transient ArrayList a(Object aobj[])
    {
        u.a(((Object) (aobj)));
        com.c.a.b.d.a(1, "arraySize");
        ArrayList arraylist = new ArrayList(com.c.a.g.a.a());
        Collections.addAll(arraylist, aobj);
        return arraylist;
    }
}
