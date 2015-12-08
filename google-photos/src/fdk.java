// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;

public final class fdk extends omn
{

    private static final msm ad;
    private static final msm ae;
    private fda ai;

    public fdk()
    {
        (new msi(pws.f)).a(ag);
        new dsu(ah);
    }

    public static fdk a(fcm fcm1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("arg_batch", fcm1);
        fcm1 = new fdk();
        fcm1.f(bundle);
        return fcm1;
    }

    static olq a(fdk fdk1)
    {
        return fdk1.af;
    }

    static olq b(fdk fdk1)
    {
        return fdk1.af;
    }

    static fda c(fdk fdk1)
    {
        return fdk1.ai;
    }

    static olq d(fdk fdk1)
    {
        return fdk1.af;
    }

    static olq e(fdk fdk1)
    {
        return fdk1.af;
    }

    static msm r()
    {
        return ae;
    }

    static msm s()
    {
        return ad;
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(af);
        fcm fcm1 = (fcm)super.q.getParcelable("arg_batch");
        bundle.setMessage(af.getResources().getQuantityString(b.nO, fcm1.d, new Object[] {
            Integer.valueOf(fcm1.d)
        })).setPositiveButton(s.w, new fdm(this, fcm1)).setNegativeButton(s.v, new fdl(this));
        return bundle.create();
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ai = (fda)olm.a(af, fda);
    }

    static 
    {
        ad = new msm(pws.g);
        ae = new msm(pws.d);
    }
}
