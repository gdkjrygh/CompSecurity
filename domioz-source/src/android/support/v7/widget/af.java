// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            bv

final class af
{

    boolean a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    int j;
    List k;

    af()
    {
        a = true;
        h = 0;
        i = false;
        k = null;
    }

    public final void a(bv bv1)
    {
        int k1 = k.size();
        bv bv2 = null;
        int l = 0x7fffffff;
        for (int i1 = 0; i1 < k1; i1++)
        {
            bv bv3 = (bv)k.get(i1);
            if (bv3 == bv1 || bv3.isRemoved())
            {
                continue;
            }
            int j1 = (bv3.getLayoutPosition() - d) * e;
            if (j1 < 0 || j1 >= l)
            {
                continue;
            }
            bv2 = bv3;
            if (j1 == 0)
            {
                break;
            }
            bv2 = bv3;
            l = j1;
        }

        if (bv2 == null)
        {
            l = -1;
        } else
        {
            l = bv2.getLayoutPosition();
        }
        d = l;
    }
}
