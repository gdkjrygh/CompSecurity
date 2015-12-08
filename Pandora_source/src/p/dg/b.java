// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;

import com.pandora.radio.data.d;
import p.cw.c;
import p.di.s;

// Referenced classes of package p.dg:
//            m, l, j

public class b extends m
{

    private boolean e;

    public b(c c, l l, d d, j j)
    {
        super(c, l, d, j);
    }

    private void w()
    {
        if (!e)
        {
            a("registering ad impression");
            (new s()).execute(new Object[] {
                h(), i()
            });
            b.r();
            e = true;
        }
    }

    public boolean a()
    {
        boolean flag = super.a();
        if (flag)
        {
            w();
        }
        return flag;
    }
}
