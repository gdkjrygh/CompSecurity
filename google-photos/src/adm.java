// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.List;

final class adm
{

    boolean a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    List j;

    adm()
    {
        a = true;
        h = 0;
        j = null;
    }

    final View a(afe afe1)
    {
        if (j != null)
        {
            int l = j.size();
            for (int k = 0; k < l; k++)
            {
                afe1 = ((afn)j.get(k)).a;
                aez aez1 = (aez)afe1.getLayoutParams();
                if (!aez1.c.o() && d == aez1.c.d())
                {
                    a(((View) (afe1)));
                    return afe1;
                }
            }

            return null;
        } else
        {
            afe1 = afe1.a(d, false);
            d = d + e;
            return afe1;
        }
    }

    public final void a(View view)
    {
        int j1 = j.size();
        View view1 = null;
        int k = 0x7fffffff;
        for (int l = 0; l < j1; l++)
        {
            View view2 = ((afn)j.get(l)).a;
            aez aez1 = (aez)view2.getLayoutParams();
            if (view2 == view || aez1.c.o())
            {
                continue;
            }
            int i1 = (aez1.c.d() - d) * e;
            if (i1 < 0 || i1 >= k)
            {
                continue;
            }
            view1 = view2;
            if (i1 == 0)
            {
                break;
            }
            view1 = view2;
            k = i1;
        }

        if (view1 == null)
        {
            d = -1;
            return;
        } else
        {
            d = ((aez)view1.getLayoutParams()).c.d();
            return;
        }
    }

    final boolean a(afl afl1)
    {
        return d >= 0 && d < afl1.b();
    }
}
