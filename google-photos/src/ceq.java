// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.moviemaker.MovieMakerActivity;

public final class ceq extends omn
{

    private cet ad;

    public ceq()
    {
        b(false);
    }

    static cet a(ceq ceq1)
    {
        return ceq1.ad;
    }

    public final void ak_()
    {
        ad = null;
        super.ak_();
    }

    public final Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(O_())).setTitle(c.aA).setMessage(c.ax).setNegativeButton(c.ay, new ces(this)).setPositiveButton(c.az, new cer(this)).create();
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        ad = MovieMakerActivity.b(this).d.t;
    }
}
