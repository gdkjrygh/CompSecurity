// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bi.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            w, ad, v

public final class ac
{

    boolean a;
    private final List b = new ArrayList();
    private int c;
    private float d[];

    public ac()
    {
        c = -1;
        a = true;
    }

    public final boolean a(float f, float f1, b b1, List list)
    {
        int i;
        boolean flag;
        flag = false;
        i = (int)(b1.j * 30F);
        if (a || d == null) goto _L2; else goto _L1
_L1:
        float f2;
        float f4;
        f2 = d[0];
        f4 = d[1];
        if ((int)((f2 - f) * (f2 - f) + (f4 - f1) * (f4 - f1)) <= i * i) goto _L3; else goto _L2
_L2:
        a = false;
        b.clear();
        if (d == null)
        {
            d = new float[2];
        }
        d[0] = f;
        d[1] = f1;
        int j = (int)(b1.j * 30F);
        for (list = list.iterator(); list.hasNext(); ((w)list.next()).a(b, f, f1, b1, j * j)) { }
          goto _L4
_L3:
        list = b.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ad ad1 = (ad)list.next();
            ad1.b = ad1.a.a(f, f1, b1);
            if (ad1.b < 0x7fffffff)
            {
                float f3 = b1.j * 5F;
                int k = ad1.b;
                ad1.b = (int)(f3 * f3) * 1 + k;
            }
        } while (true);
          goto _L4
_L11:
        if (c != -1)
        {
            ((ad)b.get(c)).c = true;
        }
_L4:
        if (b.size() != 0) goto _L6; else goto _L5
_L5:
        int i1 = -1;
_L8:
        c = i1;
        if (c != -1)
        {
            b1 = (ad)b.get(c);
            b1.c = true;
            flag = b1.a();
        }
        return flag;
_L6:
        if (b.size() != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = 0;
        if (true) goto _L8; else goto _L7
_L7:
        i1 = 0;
        int j1 = 0x7fffffff;
        int l = -1;
        while (i1 < b.size()) 
        {
            b1 = (ad)b.get(i1);
            int k1;
            if (!((ad) (b1)).c && ((ad) (b1)).b < j1)
            {
                l = ((ad) (b1)).b;
                j1 = i1;
            } else
            {
                int l1 = l;
                l = j1;
                j1 = l1;
            }
            i1++;
            k1 = j1;
            j1 = l;
            l = k1;
        }
        i1 = l;
        if (l != -1) goto _L8; else goto _L9
_L9:
        b1 = b.iterator();
        while (b1.hasNext()) 
        {
            ((ad)b1.next()).c = false;
        }
        if (true) goto _L11; else goto _L10
_L10:
    }
}
