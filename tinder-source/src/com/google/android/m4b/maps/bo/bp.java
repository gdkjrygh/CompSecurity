// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.bw.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bq

public final class bp
{

    public final List a;
    private final byte b[];
    private b c;

    public bp(List list, byte abyte0[])
    {
        a = list;
        b = abyte0;
    }

    public final b a()
    {
        if (c == null && !a.isEmpty() && b.length != 0)
        {
            ArrayList arraylist = new ArrayList(a.size());
            for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add(((bq)iterator.next()).a)) { }
            c = new b(arraylist, b);
        }
        return c;
    }
}
