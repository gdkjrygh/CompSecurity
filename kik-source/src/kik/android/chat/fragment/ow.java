// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import java.util.Calendar;
import kik.android.widget.cd;

// Referenced classes of package kik.android.chat.fragment:
//            KikRegistrationFragment

final class ow
    implements android.view.View.OnClickListener
{

    final KikRegistrationFragment a;

    ow(KikRegistrationFragment kikregistrationfragment)
    {
        a = kikregistrationfragment;
        super();
    }

    public final void onClick(View view)
    {
        int i = KikRegistrationFragment.b(a).get(1);
        int j = KikRegistrationFragment.b(a).get(2);
        int k = KikRegistrationFragment.b(a).get(5);
        KikRegistrationFragment.a(a, new cd(a.getActivity(), KikRegistrationFragment.c(a), i, j, k));
        KikRegistrationFragment.d(a).a(a._firstnameField.getResources().getString(0x7f090295));
        KikRegistrationFragment.d(a).show();
    }
}
