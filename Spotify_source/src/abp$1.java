// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

final class it> extends hv
{

    private abp b;

    public final void a(View view, nb nb)
    {
        super.a(view, nb);
        if (!b.a() && b.b.f != null)
        {
            b.b.f.a(view, nb);
        }
    }

    public final boolean a(View view, int i, Bundle bundle)
    {
        boolean flag1 = false;
        boolean flag;
        if (super.a(view, i, bundle))
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (!b.a())
            {
                flag = flag1;
                if (b.b.f != null)
                {
                    view = b.b.f;
                    bundle = ((abd) (view)).k.a;
                    view = ((abd) (view)).k.q;
                    return false;
                }
            }
        }
        return flag;
    }

    (abp abp1)
    {
        b = abp1;
        super();
    }
}
