// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.widget.DatePicker;
import android.widget.EditText;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            SignupFragment

final class a
    implements android.app.OnDateSetListener
{

    private SignupFragment a;

    public final void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
label0:
        {
            boolean flag1 = false;
            datepicker = new GregorianCalendar(i, j, k);
            SignupFragment signupfragment = a;
            boolean flag;
            if (SignupFragment.l(a) || SignupFragment.m(a).get(1) != datepicker.get(1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            SignupFragment.c(signupfragment, flag);
            signupfragment = a;
            if (SignupFragment.n(a) || SignupFragment.m(a).get(2) != datepicker.get(2))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            SignupFragment.d(signupfragment, flag);
            signupfragment = a;
            if (!SignupFragment.o(a))
            {
                flag = flag1;
                if (SignupFragment.m(a).get(5) == datepicker.get(5))
                {
                    break label0;
                }
            }
            flag = true;
        }
        SignupFragment.e(signupfragment, flag);
        if (SignupFragment.m(a).get(1) != datepicker.get(1) || SignupFragment.m(a).get(2) != datepicker.get(2) || SignupFragment.m(a).get(5) != datepicker.get(5))
        {
            SignupFragment.a(a, datepicker);
            SignupFragment.p(a).setText((new SimpleDateFormat("MM/dd/yyyy")).format(SignupFragment.m(a).getTime()));
            SignupFragment.d(a);
        }
    }

    (SignupFragment signupfragment)
    {
        a = signupfragment;
        super();
    }
}
