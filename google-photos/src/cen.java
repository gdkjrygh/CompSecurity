// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.moviemaker.MovieMakerActivity;

public final class cen extends omn
{

    private cep ad;

    public cen()
    {
        b(false);
    }

    static cep a(cen cen1)
    {
        return cen1.ad;
    }

    public final Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(O_())).setTitle(c.aw).setMessage(c.av).setPositiveButton(c.bX, new ceo(this)).create();
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        ad = MovieMakerActivity.b(this).d.u;
    }
}
