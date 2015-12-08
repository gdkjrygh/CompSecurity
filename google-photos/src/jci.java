// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;

public final class jci extends omn
    implements android.content.DialogInterface.OnClickListener, mso
{

    public jci()
    {
        new dsu(ah);
    }

    private void a(msp msp)
    {
        mry.a(af, 4, (new msn()).a(new msm(msp)).a(af));
    }

    private int t()
    {
        return super.q.getInt("extra_days_until_required", 0);
    }

    public final Dialog c(Bundle bundle)
    {
        int j = t();
        bundle = (new android.app.AlertDialog.Builder(af)).setTitle(b.BS).setPositiveButton(b.BU, this);
        if (j > 0)
        {
            bundle.setMessage(g().getQuantityString(b.BQ, j, new Object[] {
                Integer.valueOf(j)
            })).setNegativeButton(b.BT, this);
        } else
        {
            bundle.setMessage(b.BR).setCancelable(false).setOnKeyListener(new jcj(this));
        }
        bundle = bundle.create();
        bundle.setCanceledOnTouchOutside(false);
        return bundle;
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ag.a(mso, this);
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        if (j == -1)
        {
            a(pwt.R);
            b.a(af, "update_dialog");
            return;
        } else
        {
            a(pwt.t);
            return;
        }
    }

    public final msm r()
    {
        msp msp;
        if (t() > 0)
        {
            msp = pwt.S;
        } else
        {
            msp = pwt.w;
        }
        return new msm(msp);
    }
}
