// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public final class edi extends ftv
{

    public edi(Context context)
    {
        super(context, true);
    }

    protected final ddd a(Context context, ViewGroup viewgroup)
    {
        return dds.c(context, viewgroup);
    }

    protected final volatile void a(ddd ddd, Object obj)
    {
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (getItemViewType(i) != 0)
        {
            ddh ddh1 = (ddh)dds.a(view);
            view = ddh1;
            if (ddh1 == null)
            {
                view = dds.b(a, viewgroup);
            }
            view.a(a.getString(0x7f08044c));
            view.a(true);
            return view.a();
        } else
        {
            return super.getView(i, view, viewgroup);
        }
    }
}
