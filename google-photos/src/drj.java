// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class drj
    implements hac
{

    private final int a;
    private final int b;
    private drc c;

    public drj(drc drc1, int i, int j)
    {
        c = drc1;
        super();
        a = i;
        b = j;
    }

    private int a(int i)
    {
        View view = a();
        if (view != null)
        {
            int j = view.getWidth() / a;
            i -= drc.b(c).a().b(i);
            if (drc.g(c).a(i))
            {
                return (int)Math.ceil((float)drc.g(c).b(i) / (float)j) * a + b;
            }
        }
        return 0;
    }

    private View a()
    {
        View view = ((am) (c)).R;
        if (view != null)
        {
            return view.findViewById(c.cc);
        } else
        {
            return null;
        }
    }

    public final int a(int i, int j)
    {
        boolean flag;
        int l;
        l = 0;
        flag = false;
        if (a() != null) goto _L2; else goto _L1
_L1:
        l = ((flag) ? 1 : 0);
_L4:
        return l;
_L2:
        int k = i + 1;
        i = l;
        do
        {
            l = i;
            if (k > j)
            {
                continue;
            }
            l = a(k);
            k++;
            i = l + i;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final int b(int i, int j)
    {
        return a(i, j - 1);
    }

    public final int c(int i, int j)
    {
        int k;
        int l;
        k = 0;
        l = 0;
        if (a() != null) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        l = 0;
label0:
        do
        {
label1:
            {
                if (k >= drc.f(c).a() - i)
                {
                    break label1;
                }
                int i1 = l + a(k);
                l = k;
                if (j <= i1)
                {
                    break label0;
                }
                k++;
                l = i1;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return drc.f(c).a() - i - 1;
    }
}
