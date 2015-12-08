// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.moviemaker.MovieMakerActivity;

public class ceu extends al
{

    private cew ad;

    public ceu()
    {
    }

    static cew a(ceu ceu1)
    {
        return ceu1.ad;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(c.y, viewgroup, false);
        layoutinflater.setSaveEnabled(false);
        ((ImageView)layoutinflater.findViewById(b.fJ)).setOnClickListener(new cev(this));
        return layoutinflater;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a(1, 0x1030076);
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = super.c(bundle);
        bundle.setCanceledOnTouchOutside(false);
        return bundle;
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        ad = MovieMakerActivity.b(this).d.w;
    }

    static 
    {
        ceu.getSimpleName();
    }
}
