// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import android.widget.EditText;
import kik.android.e.d;

// Referenced classes of package kik.android.chat.fragment:
//            KikRegistrationFragment

final class ot
    implements Runnable
{

    final KikRegistrationFragment a;

    ot(KikRegistrationFragment kikregistrationfragment)
    {
        a = kikregistrationfragment;
        super();
    }

    public final void run()
    {
        a.b(a._firstnameField.getResources().getString(0x7f090348), false);
        (new kik.android.util.p.a(a.g, a.b, a.d, a.e)).a(new d[] {
            a
        });
    }
}
