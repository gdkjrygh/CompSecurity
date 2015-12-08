// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            KikRegistrationFragment

final class ok
    implements android.view.View.OnClickListener
{

    final KikRegistrationFragment a;

    ok(KikRegistrationFragment kikregistrationfragment)
    {
        a = kikregistrationfragment;
        super();
    }

    public final void onClick(View view)
    {
        KikRegistrationFragment.a(a);
    }
}
