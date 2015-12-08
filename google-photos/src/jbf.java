// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;

public final class jbf extends omn
    implements android.content.DialogInterface.OnClickListener
{

    private jbg ad;

    public jbf()
    {
    }

    public static jbf b(int j)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("extra_num_items", j);
        jbf jbf1 = new jbf();
        jbf1.f(bundle);
        return jbf1;
    }

    public final Dialog c(Bundle bundle)
    {
        int j = super.q.getInt("extra_num_items");
        bundle = (new android.app.AlertDialog.Builder(O_())).setPositiveButton(b.BJ, this).setNegativeButton(b.BI, this);
        if (j == 0)
        {
            bundle.setMessage(b.BK);
        } else
        {
            bundle.setMessage(g().getQuantityString(b.BH, j, new Object[] {
                Integer.valueOf(j)
            }));
        }
        return bundle.create();
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ad = (jbg)ag.a(jbg);
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        dialoginterface = ad;
        boolean flag;
        if (j == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dialoginterface.a(flag);
    }
}
