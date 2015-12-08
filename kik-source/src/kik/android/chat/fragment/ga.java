// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.kik.android.a;
import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class ga extends r
{

    final int a;
    final FragmentActivity b;
    final String c;
    final KikChatFragment d;

    ga(KikChatFragment kikchatfragment, int i, FragmentActivity fragmentactivity, String s)
    {
        d = kikchatfragment;
        a = i;
        b = fragmentactivity;
        c = s;
        super();
    }

    public final void a(Object obj)
    {
        boolean flag = true;
        super.a((Bundle)obj);
        KikChatFragment.aV(d);
        KikChatFragment.j(d, true);
        obj = d.g.b("Media Tray Card Closed").a("Index", a);
        if (b.getResources().getConfiguration().orientation != 2)
        {
            flag = false;
        }
        ((com.kik.android.a.f) (obj)).a("Is Landscape", flag).a("Card URL", c).a("Reason", "Attached").b();
    }

    public final void b()
    {
        boolean flag = false;
        KikChatFragment.j(d, false);
        KikChatFragment.aV(d);
        com.kik.android.a.f f = d.g.b("Media Tray Card Closed").a("Index", a);
        if (b.getResources().getConfiguration().orientation == 2)
        {
            flag = true;
        }
        f.a("Is Landscape", flag).a("Card URL", c).a("Reason", "Closed").b();
    }
}
