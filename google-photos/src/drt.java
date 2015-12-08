// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class drt extends afn
{

    private final TextView o;

    public drt(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.iY, viewgroup, false));
        o = (TextView)a.findViewById(c.cf);
    }

    public static int a(Context context)
    {
        return context.getResources().getDimensionPixelSize(b.iS);
    }

    static TextView a(drt drt1)
    {
        return drt1.o;
    }
}
