// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;

final class djn extends jz
{

    private View b;

    public djn(View view)
    {
        b = view;
    }

    public final Object a(ViewGroup viewgroup, int i)
    {
        if (b.getParent() != viewgroup)
        {
            viewgroup.addView(b);
        }
        return b;
    }

    public final void a(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView(b);
    }

    public final boolean a(View view, Object obj)
    {
        return view == b;
    }

    public final int b()
    {
        return 1;
    }
}
