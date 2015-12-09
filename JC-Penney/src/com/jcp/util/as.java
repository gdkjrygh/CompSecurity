// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.jcp.c.af;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jcp.util:
//            bh

public final class as
{

    public static List a(Context context)
    {
        String as1[] = context.getResources().getStringArray(0x7f0c0017);
        TypedArray typedarray = context.getResources().obtainTypedArray(0x7f0c0015);
        ArrayList arraylist = new ArrayList();
        arraylist.add(new bh(as1[0], typedarray.getResourceId(0, -1)));
        arraylist.add(new bh(as1[1], typedarray.getResourceId(1, -1)));
        arraylist.add(new bh(as1[2], typedarray.getResourceId(2, -1)));
        if (af.b(context).d())
        {
            arraylist.add(new bh(as1[3], typedarray.getResourceId(3, -1)));
        }
        arraylist.add(new bh(as1[4], typedarray.getResourceId(4, -1)));
        arraylist.add(new bh(as1[5], typedarray.getResourceId(5, -1)));
        typedarray.recycle();
        return arraylist;
    }
}
