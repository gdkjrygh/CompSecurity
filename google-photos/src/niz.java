// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

final class niz extends njc
{

    niz(niy niy)
    {
        super(niy);
    }

    public final int a()
    {
        return 0;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return layoutinflater.inflate(b.Gy, viewgroup, false);
    }

    public final void a(View view, int i)
    {
        ((TextView)view.findViewById(aa.Q)).setText(f);
        ((TextView)view.findViewById(aa.M)).setText(e);
    }
}
