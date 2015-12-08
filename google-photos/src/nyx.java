// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class nyx extends nyu
{

    private final List a = new ArrayList();

    public nyx(Context context, nyg nyg)
    {
        super(context, nyg, "batchfetch", new ows(), new owt(), "plusdatamixer", "oauth2:https://www.googleapis.com/auth/plus.native");
    }

    public static int a(qlr qlr1)
    {
        return qmb.b(qlr1.b);
    }

    public final qlw a(int i, qlr qlr1)
    {
        oxa oxa1 = ((owt)t()).a[i].a;
        if (oxa1 != null)
        {
            return (qlw)oxa1.a(qlr1);
        } else
        {
            return null;
        }
    }

    public void a(int i, owz owz, int j)
    {
        owy owy1 = new owy();
        owy1.a = Integer.valueOf(i);
        owy1.c = Integer.valueOf(j);
        owy1.b = owz;
        a.add(owy1);
    }

    protected final void a(qlw qlw1)
    {
        qlw1 = (ows)qlw1;
        qlw1.b = new owy[a.size()];
        a.toArray(((ows) (qlw1)).b);
        qlw1.a = b.a(h, g);
    }

    public final boolean a(int i)
    {
        return ((owt)t()).a[0].b != null;
    }

    public final int b(int i)
    {
        if (t() != null)
        {
            oxb aoxb[] = ((owt)t()).a;
            for (int j = 0; j < aoxb.length; j++)
            {
                oxa oxa1 = aoxb[j].a;
                if (oxa1 != null && oxa1.a != null && oxa1.a.intValue() == i)
                {
                    return j;
                }
            }

        }
        return -1;
    }

    protected final void b(qlw qlw1)
    {
        qlw1 = (owt)qlw1;
        oxb aoxb[] = ((owt) (qlw1)).a;
        int j = aoxb.length;
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    if (aoxb[i].b == null)
                    {
                        break label0;
                    }
                    a(0, null, null);
                }
                b.a(g, ((owt) (qlw1)).b);
                return;
            }
            i++;
        } while (true);
    }
}
