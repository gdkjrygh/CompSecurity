// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public final class eis extends fsx
{

    private final ejr a;
    private final ejn b;

    public eis(Context context, String s, ejr ejr, ejn ejn1)
    {
        super(context, new String[] {
            s.substring(0, Math.min(300, s.length()))
        });
        a = ejr;
        b = ejn1;
    }

    public final View a(Context context, int i, ViewGroup viewgroup)
    {
        context = b;
        viewgroup = dds.a(((ejn) (context)).a, viewgroup, 2);
        viewgroup.a().setOnClickListener(((ejn) (context)).b);
        ggp.a(viewgroup.a(), 0x7f0200df);
        viewgroup.a(true);
        return viewgroup.a();
    }

    public final void a(View view, Context context, int i)
    {
        context = (String)getItem(i);
        view = (ddf)dds.a(view);
        view.a(context);
        view.a().setTag(a);
    }
}
