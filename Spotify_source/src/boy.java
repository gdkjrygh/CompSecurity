// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

final class boy
{

    int a;
    List b;
    SparseArray c;
    final box d;

    boy(box box)
    {
        d = box;
        super();
        a = 0;
        b = new ArrayList();
        c = new SparseArray();
    }

    final void a(bov abov[])
    {
        b.clear();
        c.clear();
        for (int i = 0; i < abov.length; i++)
        {
            bov bov1 = abov[i];
            b.add(bov1);
            c.put(bov1.b, Integer.valueOf(i));
        }

    }
}
