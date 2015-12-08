// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public final class fip
    implements hgo
{

    private final diy a;
    private final boolean b;

    public fip(diy diy1, boolean flag)
    {
        a = diy1;
        b = flag;
    }

    public final int a()
    {
        return q.Z;
    }

    public final int a(int i)
    {
        return 1;
    }

    public final void a(afn afn1)
    {
        fiq fiq1 = (fiq)afn1;
        afn1 = (egf)olm.a(afn1.a.getContext(), egf);
        int i;
        if (!TextUtils.isEmpty(a.d))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            afn1.a(a.d, fiq.a(fiq1));
        } else
        {
            android.widget.ImageView imageview = fiq.a(fiq1);
            ((egf) (afn1)).a.a(Integer.valueOf(b.la)).a(imageview);
        }
        fiq.b(fiq1).setText(a.b);
        afn1 = fiq.c(fiq1);
        if (b)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        afn1.setVisibility(i);
    }

    public final int b(int i)
    {
        return 0;
    }

    public final long b()
    {
        return -1L;
    }
}
