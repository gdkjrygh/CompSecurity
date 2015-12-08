// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;

public final class hor extends omn
    implements android.content.DialogInterface.OnClickListener
{

    private SparseArray ad;
    private hou ae;
    private int ai;

    public hor()
    {
        ai = -1;
    }

    static int a(hor hor1)
    {
        return hor1.ai;
    }

    static int a(hor hor1, int j)
    {
        hor1.ai = j;
        return j;
    }

    private String[] r()
    {
        SparseArray sparsearray = ad;
        String as[] = new String[sparsearray.size()];
        for (int j = 0; j < sparsearray.size(); j++)
        {
            as[j] = a(sparsearray.keyAt(j));
        }

        return as;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            ai = bundle.getInt("selected_item", -1);
        }
    }

    public final Dialog c(Bundle bundle)
    {
        ad = new SparseArray();
        ad.put(b.wZ, hoo.a);
        ad.put(b.wW, hoo.b);
        ad.put(b.wV, hoo.c);
        ad.put(b.wU, hoo.d);
        bundle = new android.app.AlertDialog.Builder(af);
        bundle.setTitle(b.xb).setPositiveButton(b.wY, this).setNegativeButton(b.wS, this).setSingleChoiceItems(r(), -1, new hos(this));
        bundle = bundle.create();
        bundle.setOnShowListener(new hot(this));
        return bundle;
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putInt("selected_item", ai);
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ae = (hou)ag.a(hou);
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        if (j != -2)
        {
            ae.a((hoo)ad.valueAt(ai));
        }
    }
}
