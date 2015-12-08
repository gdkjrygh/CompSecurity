// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import Bt;
import Jo;
import KO;
import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.GregorianCalendar;
import java.util.Locale;
import mI;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            SignupFragment

final class a
    implements android.content.lickListener
{

    private View a;
    private ctivity b;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        Jo.a(SignupFragment.a(b.b), a);
        b.b.getActivity().onBackPressed();
    }

    ( , View view)
    {
        b = ;
        a = view;
        super();
    }

    // Unreferenced inner class com/snapchat/android/fragments/signup/SignupFragment$4

/* anonymous class */
    final class SignupFragment._cls4
        implements android.view.View.OnClickListener
    {

        final SignupFragment a;

        public final void onClick(View view)
        {
            GregorianCalendar gregoriancalendar = (GregorianCalendar)GregorianCalendar.getInstance();
            gregoriancalendar.add(1, -13);
            if (!SignupFragment.m(a).before(gregoriancalendar))
            {
                (new android.app.AlertDialog.Builder(a.getActivity())).setMessage(a.getString(0x7f0802b7)).setCancelable(false).setPositiveButton(0x7f0801bc, new SignupFragment._cls4._cls1(this, view)).show();
            } else
            {
                view = a;
                Bt.af();
                if (view.o_())
                {
                    ((SignupFragment) (view)).f.setVisibility(0);
                    ((SignupFragment) (view)).g.setClickable(false);
                    ((SignupFragment) (view)).g.setText("");
                    String s = ((SignupFragment) (view)).c.getText().toString().trim().toLowerCase(Locale.US);
                    String s1 = ((SignupFragment) (view)).d.getText().toString().trim();
                    view.i = ((SignupFragment) (view)).i + 1;
                    ((SignupFragment) (view)).j.e();
                    (new mI(s, s1, ((SignupFragment) (view)).e, view)).execute();
                    return;
                }
            }
        }

            
            {
                a = signupfragment;
                super();
            }
    }

}
