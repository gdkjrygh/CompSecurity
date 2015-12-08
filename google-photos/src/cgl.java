// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.moviemaker.MovieMakerActivity;

public final class cgl extends omn
{

    private static final msm ad;
    private static final msm ae;
    private cgo ai;

    public cgl()
    {
        (new msi(pwp.l)).a(ag);
    }

    static olq a(cgl cgl1)
    {
        return cgl1.af;
    }

    static olq b(cgl cgl1)
    {
        return cgl1.af;
    }

    static olq c(cgl cgl1)
    {
        return cgl1.af;
    }

    static olq d(cgl cgl1)
    {
        return cgl1.af;
    }

    static cgo e(cgl cgl1)
    {
        return cgl1.ai;
    }

    static msm r()
    {
        return ad;
    }

    static msm s()
    {
        return ae;
    }

    public final void ak_()
    {
        ai = null;
        super.ak_();
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(O_());
        bundle.setMessage(c.ag).setTitle(c.ah).setPositiveButton(c.bi, new cgn(this)).setNegativeButton(c.aU, new cgm(this));
        return bundle.create();
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        ai = MovieMakerActivity.b(this).d.v;
    }

    static 
    {
        ad = new msm(pwp.a);
        ae = new msm(pwp.k);
    }
}
