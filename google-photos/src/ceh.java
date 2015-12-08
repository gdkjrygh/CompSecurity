// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.moviemaker.MovieMakerActivity;

public final class ceh extends omn
    implements bly
{

    private static final blz ad = (blz)ddz.a(blz);
    private brl ae;
    private blz ai;

    public ceh()
    {
        ai = ad;
    }

    static blz a(ceh ceh1)
    {
        return ceh1.ai;
    }

    public final void a(blz blz1)
    {
        if (blz1 == null)
        {
            ai = ad;
            return;
        } else
        {
            ai = blz1;
            return;
        }
    }

    public final void ak_()
    {
        ae.a.b.d(this);
        ae = null;
        super.ak_();
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = (new android.app.AlertDialog.Builder(O_())).setCancelable(true).setTitle(c.ak).setMessage(c.aj).setPositiveButton(c.am, new cej(this)).setNegativeButton(c.al, new cei(this)).create();
        bundle.setCanceledOnTouchOutside(true);
        return bundle;
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        ae = MovieMakerActivity.b(this).d.k;
        ae.a.b.c(this);
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        ai.b();
        super.onCancel(dialoginterface);
    }

}
