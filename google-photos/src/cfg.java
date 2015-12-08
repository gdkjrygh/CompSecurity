// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.moviemaker.MovieMakerActivity;

public final class cfg extends omn
    implements bpx
{

    private static final bpy ad = (bpy)ddz.a(bpy);
    private bpy ae;
    private bps ai;
    private MovieMakerActivity aj;
    private cfk ak;
    private int al;

    public cfg()
    {
        ae = ad;
        b(false);
        al = c.bK;
        ak = cfk.a;
    }

    public static cfg a(cfk cfk1)
    {
        cfg cfg1 = new cfg();
        cfg1.al = b(cfk1);
        cfg1.ak = cfk1;
        return cfg1;
    }

    static cfk a(cfg cfg1)
    {
        return cfg1.ak;
    }

    private static final int b(cfk cfk1)
    {
        switch (cfj.a[cfk1.ordinal()])
        {
        default:
            cfk1 = String.valueOf(cfk1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(cfk1).length() + 20)).append("unknown error type: ").append(cfk1).toString());

        case 1: // '\001'
            return c.aQ;

        case 2: // '\002'
            return c.bK;
        }
    }

    static bpy b(cfg cfg1)
    {
        return cfg1.ae;
    }

    public final Context G_()
    {
        return O_();
    }

    public final boolean H_()
    {
        return super.e != null && super.e.isShowing();
    }

    public final void a(bpy bpy1)
    {
        bpy bpy2 = bpy1;
        if (bpy1 == null)
        {
            bpy2 = ad;
        }
        ae = bpy2;
    }

    public final void ak_()
    {
        ai = null;
        super.ak_();
    }

    public final Dialog c(Bundle bundle)
    {
        if (bundle != null && bundle.getSerializable("NetworkFailDialog.ErrorType") != null)
        {
            ak = (cfk)bundle.getSerializable("NetworkFailDialog.ErrorType");
            al = b(ak);
        }
        return (new android.app.AlertDialog.Builder(O_())).setTitle(c.aT).setIcon(b.fg).setMessage(al).setNegativeButton(c.aR, new cfi(this)).setPositiveButton(c.aS, new cfh(this)).create();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putSerializable("NetworkFailDialog.ErrorType", ak);
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        aj = (MovieMakerActivity)super.ag.a(com/google/android/apps/moviemaker/MovieMakerActivity);
    }

    public final void l()
    {
        super.l();
        ai = aj.d.o;
        ai.a.c(this);
    }

    public final void m()
    {
        super.m();
        if (ai != null)
        {
            ai.a.d(this);
        }
    }

}
