// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

final class nit> extends aG
{

    private bJ b;

    public final void a(View view, bk bk)
    {
        super.a(view, bk);
        if (!b.a() && b.b.e != null)
        {
            b.b.e.a(view, bk);
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
                if (b.b.e != null)
                {
                    view = b.b.e;
                    bundle = ((android.support.v7.widget.lerView.i) (view)).h.a;
                    view = ((android.support.v7.widget.lerView.i) (view)).h.o;
                    return false;
                }
            }
        }
        return flag;
    }

    >(bJ bj)
    {
        b = bj;
        super();
    }
}
