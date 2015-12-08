// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public final class frf extends afn
{

    public frf(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.qb, viewgroup, false));
    }

    public static int a(Context context)
    {
        return context.getResources().getDimensionPixelSize(c.df);
    }
}
