// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.moviemaker.MovieMakerActivity;

public final class cek extends omn
    implements bmk
{

    private static final bml ad = (bml)ddz.a(bml);
    private bml ae;
    private bmg ai;

    public cek()
    {
        ae = ad;
        b(false);
    }

    static bml a(cek cek1)
    {
        return cek1.ae;
    }

    public static cek r()
    {
        return new cek();
    }

    public final void a(bml bml1)
    {
        bml bml2 = bml1;
        if (bml1 == null)
        {
            bml2 = ad;
        }
        ae = bml2;
    }

    public final void ak_()
    {
        ai.a.d(this);
        ai = null;
        super.ak_();
    }

    public final Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(O_())).setTitle(c.au).setMessage(c.ar).setNegativeButton(c.as, new cem(this)).setPositiveButton(c.at, new cel(this)).create();
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        ai = MovieMakerActivity.b(this).d.m;
        ai.a.c(this);
    }

}
