// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import com.kik.android.a;
import com.kik.g.r;
import kik.a.d.n;
import kik.a.f.f.ag;
import kik.a.f.q;

// Referenced classes of package kik.android.chat.fragment:
//            ProgressDialogFragment, KikChatInfoFragment, go

final class gn extends r
{

    final ProgressDialogFragment a;
    final KikChatInfoFragment b;

    gn(KikChatInfoFragment kikchatinfofragment, ProgressDialogFragment progressdialogfragment)
    {
        b = kikchatinfofragment;
        a = progressdialogfragment;
        super();
    }

    public final void a(Object obj)
    {
        obj = (ag)obj;
        a.dismissAllowingStateLoss();
        obj = b.s.a(((ag) (obj)).e(), false);
        if (obj != null && (obj instanceof n))
        {
            b.o.b("Admin Promoted").a("Admin Count", ((n)obj).C()).b();
        }
        b.b.post(new go(this));
    }

    public final void a(Throwable throwable)
    {
        a.dismissAllowingStateLoss();
        if (throwable instanceof q)
        {
            b.a(b.P, b.Q);
        }
    }
}
