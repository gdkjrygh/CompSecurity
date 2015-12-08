// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import CU;
import Dn;
import Eh;
import Ei;
import IJ;
import Ur;
import android.support.v4.app.FragmentActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.snapchat.android.util.AlertDialogUtils;
import java.util.Set;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            TwoFactorCodeVerificationFragment

final class a
    implements Eh
{

    private TwoFactorCodeVerificationFragment a;

    public final void a(CU cu)
    {
label0:
        {
            int i = Ei.a(cu);
            if (TwoFactorCodeVerificationFragment.a(a).contains(Integer.valueOf(i)) && (cu instanceof Dn))
            {
                TwoFactorCodeVerificationFragment.a(a).remove(Integer.valueOf(i));
                cu = (Dn)cu;
                if (!((Dn) (cu)).b)
                {
                    break label0;
                }
                a.getActivity().onBackPressed();
            }
            return;
        }
        cu = ((Dn) (cu)).a;
        a.c.setVisibility(8);
        a.b.setClickable(true);
        a.a.setEnabled(true);
        if (IJ.a(cu.a()))
        {
            a.a.setText("");
            a.a.requestFocus();
            a.s();
        } else
        {
            AlertDialogUtils.a(a.getActivity(), cu.b());
        }
        a.t();
    }

    (TwoFactorCodeVerificationFragment twofactorcodeverificationfragment)
    {
        a = twofactorcodeverificationfragment;
        super();
    }
}
