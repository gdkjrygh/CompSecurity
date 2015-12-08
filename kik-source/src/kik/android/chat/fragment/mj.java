// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import com.kik.d.f;
import kik.a.d.j;
import kik.a.e.w;
import kik.android.a.b;
import kik.android.chat.KikApplication;

// Referenced classes of package kik.android.chat.fragment:
//            KikLoginFragment

final class mj
    implements Runnable
{

    final j a;
    final KikLoginFragment b;

    mj(KikLoginFragment kikloginfragment, j j1)
    {
        b = kikloginfragment;
        a = j1;
        super();
    }

    public final void run()
    {
        Toast.makeText(KikLoginFragment.a(b).getContext(), 0x7f090151, 0).show();
        KikApplication.i().c().a(a.c());
        KikApplication.i().a();
        b.b(KikLoginFragment.a(b));
        b.c.e();
        b.a(new Bundle());
        b.J();
        b.a(new KikConversationsFragment.a());
    }
}
