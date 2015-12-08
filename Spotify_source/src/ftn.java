// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;

public final class ftn extends jz
{

    private View b;

    public ftn(View view)
    {
        b = (View)ctz.a(view);
    }

    public final Object a(ViewGroup viewgroup, int i)
    {
        viewgroup.addView(b);
        return b;
    }

    public final void a(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView(b);
    }

    public final boolean a(View view, Object obj)
    {
        return view == obj;
    }

    public final int b()
    {
        return 1;
    }
}
