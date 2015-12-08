// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class gqa extends omp
{

    private final mxg a;

    public gqa()
    {
        a = new mxg(af);
    }

    public static gqa r()
    {
        Bundle bundle = new Bundle();
        gqa gqa1 = new gqa();
        gqa1.f(bundle);
        return gqa1;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(b.sW, null);
    }

    public final void au_()
    {
        super.au_();
        a.c();
    }
}
