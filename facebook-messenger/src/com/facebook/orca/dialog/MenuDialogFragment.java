// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.base.b.a;
import com.facebook.i;
import com.facebook.k;
import com.facebook.p;
import com.google.common.a.es;
import com.google.common.base.Preconditions;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.dialog:
//            MenuDialogParams, MenuDialogItem, h, d, 
//            e

public class MenuDialogFragment extends DialogFragment
{

    private MenuDialogParams Z;
    private e aa;

    public MenuDialogFragment()
    {
    }

    public MenuDialogFragment(MenuDialogParams menudialogparams)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("menu_dialog_params", menudialogparams);
        g(bundle);
    }

    static e a(MenuDialogFragment menudialogfragment)
    {
        return menudialogfragment.aa;
    }

    static MenuDialogParams b(MenuDialogFragment menudialogfragment)
    {
        return menudialogfragment.Z;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(k.orca_dialog_menu, viewgroup, false);
        viewgroup = (LinearLayout)layoutinflater.findViewById(i.dialog_menu_list);
        bundle = (TextView)layoutinflater.findViewById(i.dialog_menu_title);
        int j = Z.a();
        String s = Z.b();
        if (j == 0)
        {
            bundle.setText(s);
        } else
        {
            bundle.setText(j);
        }
        bundle = Z.c().iterator();
        j = 1;
        h h1;
        for (; bundle.hasNext(); viewgroup.addView(h1))
        {
            MenuDialogItem menudialogitem = (MenuDialogItem)bundle.next();
            h1 = new h(n());
            h1.setMenuDialogItem(menudialogitem);
            h1.setOnClickListener(new d(this, menudialogitem));
            if (j != 0)
            {
                h1.setDividerVisibility(8);
                j = 0;
            }
        }

        return layoutinflater;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        a(2, p.Theme_OrcaDialog);
    }

    protected void a(MenuDialogParams menudialogparams)
    {
        Z = menudialogparams;
    }

    public void a(e e)
    {
        aa = e;
    }

    public Dialog c(Bundle bundle)
    {
        Bundle bundle1 = k();
        if (bundle1 != null)
        {
            a((MenuDialogParams)bundle1.getParcelable("menu_dialog_params"));
        }
        Preconditions.checkNotNull(Z);
        bundle = super.c(bundle);
        bundle.setCanceledOnTouchOutside(true);
        com.facebook.base.b.a.a(bundle);
        return bundle;
    }
}
