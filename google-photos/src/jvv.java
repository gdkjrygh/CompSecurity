// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

final class jvv
{

    int a;
    List b;
    SparseArray c;
    final jvu d;

    jvv(jvu jvu)
    {
        d = jvu;
        super();
        a = 0;
        b = new ArrayList();
        c = new SparseArray();
    }

    void a(jvs ajvs[])
    {
        b.clear();
        c.clear();
        for (int i = 0; i < ajvs.length; i++)
        {
            jvs jvs1 = ajvs[i];
            b.add(jvs1);
            c.put(jvs1.b, Integer.valueOf(i));
        }

    }
}
