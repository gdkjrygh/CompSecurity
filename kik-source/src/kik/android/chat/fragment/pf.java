// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import java.util.Timer;

// Referenced classes of package kik.android.chat.fragment:
//            KikRegistrationFragment

final class pf
    implements android.view.View.OnFocusChangeListener
{

    final Resources a;
    final KikRegistrationFragment b;

    pf(KikRegistrationFragment kikregistrationfragment, Resources resources)
    {
        b = kikregistrationfragment;
        a = resources;
        super();
    }

    public final void onFocusChange(View view, boolean flag)
    {
        if (b._usernameField != null)
        {
            if (b._usernameField.getText() == null)
            {
                view = null;
            } else
            {
                view = b._usernameField.getText().toString();
            }
            if (!flag && view != null && view.length() > 1 && view.matches(a.getString(0x7f0901ee)))
            {
                KikRegistrationFragment.f(b).cancel();
                KikRegistrationFragment.a(b, view);
            }
        }
    }
}
