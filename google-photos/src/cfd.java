// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.moviemaker.MovieMakerActivity;

public final class cfd extends omn
    implements bpq
{

    private static final bpr ad = (bpr)ddz.a(bpr);
    private bpr ae;
    private bpl ai;

    public cfd()
    {
        ae = ad;
        b(false);
    }

    static bpr a(cfd cfd1)
    {
        return cfd1.ae;
    }

    public final void a(bpr bpr1)
    {
        ae = bpr1;
    }

    public final void ak_()
    {
        ai.a.d(this);
        ai = null;
        super.ak_();
    }

    public final Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(O_())).setTitle(c.aT).setIcon(b.fg).setMessage(c.aQ).setNegativeButton(c.aR, new cff(this)).setPositiveButton(c.aS, new cfe(this)).create();
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        ai = MovieMakerActivity.b(this).d.r.a;
        ai.a.c(this);
    }

}
