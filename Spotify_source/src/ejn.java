// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public final class ejn
{

    public final Context a;
    public final android.view.View.OnClickListener b;

    public ejn(Context context, android.view.View.OnClickListener onclicklistener)
    {
        a = context;
        b = onclicklistener;
    }

    public final dhu a(ViewGroup viewgroup)
    {
        viewgroup = dhv.b(a, viewgroup);
        viewgroup.v().setOnClickListener(b);
        ggp.a(viewgroup.v(), 0x7f0200df);
        return viewgroup;
    }

    public final dhu b(ViewGroup viewgroup)
    {
        viewgroup = dhv.e(a, viewgroup);
        viewgroup.v().setOnClickListener(b);
        ggp.a(viewgroup.v(), 0x7f0200df);
        return viewgroup;
    }
}
