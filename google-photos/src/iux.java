// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public final class iux extends al
{

    public iux()
    {
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = super.e;
        viewgroup.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        viewgroup.setCanceledOnTouchOutside(false);
        viewgroup.requestWindowFeature(1);
        return layoutinflater.inflate(b.AX, null);
    }

    public final void a(am am1, int i)
    {
        super.a(am1, i);
        if (am1 != null && super.q != null)
        {
            super.q.putString("target_fragment_tag", am1.H);
        }
    }

    public final void au_()
    {
        super.au_();
        Dialog dialog = super.e;
        if (dialog != null)
        {
            dialog.getWindow().setLayout(-1, -1);
        }
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        am am1 = super.r;
        dialoginterface = am1;
        if (am1 == null)
        {
            dialoginterface = am1;
            if (super.q != null)
            {
                String s = super.q.getString("target_fragment_tag");
                dialoginterface = am1;
                if (s != null)
                {
                    dialoginterface = super.B.a(s);
                }
            }
        }
        if (dialoginterface instanceof iuv)
        {
            ((iuv)dialoginterface).a_(super.q);
        }
    }
}
