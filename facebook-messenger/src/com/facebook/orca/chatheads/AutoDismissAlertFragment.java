// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.facebook.base.b.a;
import com.facebook.p;

// Referenced classes of package com.facebook.orca.chatheads:
//            a, b, c

public class AutoDismissAlertFragment extends DialogFragment
{

    private int Z;
    private int aa;
    private int ab;
    private c ac;
    private c ad;
    private View ae;

    public AutoDismissAlertFragment()
    {
    }

    public static AutoDismissAlertFragment a(int i, int j, c c1, int k, c c2, View view)
    {
        AutoDismissAlertFragment autodismissalertfragment = new AutoDismissAlertFragment();
        autodismissalertfragment.Z = i;
        autodismissalertfragment.aa = j;
        autodismissalertfragment.ab = k;
        autodismissalertfragment.ac = c1;
        autodismissalertfragment.ad = c2;
        autodismissalertfragment.ae = view;
        return autodismissalertfragment;
    }

    static c a(AutoDismissAlertFragment autodismissalertfragment)
    {
        return autodismissalertfragment.ac;
    }

    static c b(AutoDismissAlertFragment autodismissalertfragment)
    {
        return autodismissalertfragment.ad;
    }

    public void B()
    {
        super.B();
        b();
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            b();
        }
    }

    public Dialog c(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(new ContextThemeWrapper(n(), p.Theme_Orca));
        bundle.setView(ae);
        if (Z > 0)
        {
            bundle.setTitle(Z);
        }
        if (aa > 0)
        {
            bundle.setPositiveButton(aa, new com.facebook.orca.chatheads.a(this));
        }
        if (ab > 0)
        {
            bundle.setNegativeButton(ab, new b(this));
        }
        bundle = bundle.create();
        com.facebook.base.b.a.a(bundle);
        return bundle;
    }
}
