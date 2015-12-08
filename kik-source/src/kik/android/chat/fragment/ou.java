// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.Toast;
import kik.android.widget.KikAutoCompleteTextView;

// Referenced classes of package kik.android.chat.fragment:
//            KikRegistrationFragment

final class ou
    implements Runnable
{

    final KikRegistrationFragment a;

    ou(KikRegistrationFragment kikregistrationfragment)
    {
        a = kikregistrationfragment;
        super();
    }

    public final void run()
    {
        a.b(a._emailField);
        Toast.makeText(a._emailField.getContext(), 0x7f0902f7, 0).show();
    }
}
