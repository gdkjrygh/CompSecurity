// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.EditText;

// Referenced classes of package kik.android.chat.fragment:
//            KikRegistrationFragment

final class os
    implements Runnable
{

    final boolean a;
    final KikRegistrationFragment b;

    os(KikRegistrationFragment kikregistrationfragment, boolean flag)
    {
        b = kikregistrationfragment;
        a = flag;
        super();
    }

    public final void run()
    {
        if (a)
        {
            b._usernameField.setCompoundDrawablesWithIntrinsicBounds(null, null, KikRegistrationFragment.i(b), null);
            return;
        } else
        {
            b._usernameField.setCompoundDrawablesWithIntrinsicBounds(null, null, KikRegistrationFragment.g(b), null);
            return;
        }
    }
}
