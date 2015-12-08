// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class ehx extends afn
{

    public final ImageView o;
    public final View p;
    public final TextView q;
    public final TextView r;
    public final ImageView s;

    private ehx(View view)
    {
        super(view);
        o = (ImageView)view.findViewById(p.m);
        p = view.findViewById(p.l);
        q = (TextView)view.findViewById(p.s);
        r = (TextView)view.findViewById(p.r);
        s = (ImageView)view.findViewById(p.t);
    }

    public static int a(Context context)
    {
        return context.getResources().getDimensionPixelSize(b.ls);
    }

    public static ehx a(ViewGroup viewgroup)
    {
        return new ehx(LayoutInflater.from(viewgroup.getContext()).inflate(b.lu, viewgroup, false));
    }
}
