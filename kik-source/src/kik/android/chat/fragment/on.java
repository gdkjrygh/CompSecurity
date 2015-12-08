// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import com.kik.view.adapters.v;
import kik.android.widget.KikAutoCompleteTextView;

// Referenced classes of package kik.android.chat.fragment:
//            KikRegistrationFragment, oo

final class on
    implements android.view.View.OnFocusChangeListener
{

    final KikRegistrationFragment a;

    on(KikRegistrationFragment kikregistrationfragment)
    {
        a = kikregistrationfragment;
        super();
    }

    public final void onFocusChange(View view, boolean flag)
    {
label0:
        {
            if (flag && a.isVisible())
            {
                int i = ((v)a._emailField.getAdapter()).a();
                int j = a._registerButton.getBottom();
                int k = a._emailField.getBottom();
                int l = KikRegistrationFragment.j(a);
                a._emailField.setDropDownHeight(Math.min(i, (j - k) + l));
                if (a.getResources().getConfiguration().orientation != 1)
                {
                    break label0;
                }
                a._emailField.showDropDown();
            }
            return;
        }
        (new Handler()).postDelayed(new oo(this), 500L);
    }
}
