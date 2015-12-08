// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import kik.android.util.p;

// Referenced classes of package kik.android.chat.fragment:
//            KikRegistrationFragment

final class pe
    implements android.view.View.OnClickListener
{

    final KikRegistrationFragment a;

    pe(KikRegistrationFragment kikregistrationfragment)
    {
        a = kikregistrationfragment;
        super();
    }

    public final void onClick(View view)
    {
        p.a().a(a, a.getActivity());
    }
}
