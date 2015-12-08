// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import com.c.a.a.af;
import com.kik.d.f;
import com.kik.g.p;
import com.kik.g.r;
import java.util.concurrent.TimeoutException;
import kik.a.h.j;
import kik.android.a.b;
import kik.android.chat.KikApplication;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment, cx, cy, cz, 
//            KikDialogFragment

final class cw extends r
{

    final p a;
    final String b;
    final KikChatFragment c;

    cw(KikChatFragment kikchatfragment, p p1, String s)
    {
        c = kikchatfragment;
        a = p1;
        b = s;
        super();
    }

    public final void a(Object obj)
    {
        obj = (kik.a.d.r)obj;
        if (((kik.a.d.r) (obj)).a())
        {
            KikDialogFragment.a a1 = new KikDialogFragment.a();
            a1.a(((kik.a.d.r) (obj)).c());
            StringBuilder stringbuilder = new StringBuilder(((kik.a.d.r) (obj)).d());
            if (!af.b(((kik.a.d.r) (obj)).e()))
            {
                stringbuilder.append(" (").append(((kik.a.d.r) (obj)).e()).append(")");
            }
            a1.b(stringbuilder.toString());
            a1.a(c.getResources().getString(0x7f090299), new cx(this));
            a1.a(new cy(this));
            a1.b(c.getResources().getString(0x7f0902a4), new cz(this));
            obj = a1.a;
            ((KikDialogFragment) (obj)).b();
            c.a(((KikDialogFragment) (obj)), KikScopedDialogFragment.a.a, "dialog");
            return;
        } else
        {
            a.a(Boolean.valueOf(true));
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        a.a(Boolean.valueOf(true));
        if (throwable instanceof TimeoutException)
        {
            KikApplication.i().c().a(com.kik.d.b.a.k.ag, j.b(), new Object[] {
                "url", b
            });
        }
    }
}
