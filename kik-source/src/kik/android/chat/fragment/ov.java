// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.EditText;

// Referenced classes of package kik.android.chat.fragment:
//            KikRegistrationFragment

final class ov
    implements Runnable
{

    final KikRegistrationFragment a;

    ov(KikRegistrationFragment kikregistrationfragment)
    {
        a = kikregistrationfragment;
        super();
    }

    public final void run()
    {
        a._usernameField.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    }
}
