// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class eux extends eql
{

    private eux(View view)
    {
        super(view);
    }

    public static eux a(ViewGroup viewgroup)
    {
        return new eux(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300dd, viewgroup, false));
    }

    public final volatile void a(Object obj, int i)
    {
    }
}
