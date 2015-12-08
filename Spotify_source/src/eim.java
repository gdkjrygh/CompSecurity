// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public final class eim extends fsx
{

    public eim(Context context, String s)
    {
        super(context, new String[] {
            s
        });
    }

    public final View a(Context context, int i, ViewGroup viewgroup)
    {
        return dds.a(c, viewgroup, 0x7fffffff).a();
    }

    public final void a(View view, Context context, int i)
    {
        context = (String)getItem(i);
        ((ddf)dds.a(view)).a(context);
    }

    public final boolean isEnabled(int i)
    {
        return false;
    }
}
