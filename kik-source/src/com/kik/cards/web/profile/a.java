// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.profile;

import android.content.Context;
import android.content.res.Resources;
import com.kik.g.r;
import kik.a.d.k;
import kik.a.f.q;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package com.kik.cards.web.profile:
//            ProfilePlugin

final class a extends r
{

    final ProfilePlugin a;

    a(ProfilePlugin profileplugin)
    {
        a = profileplugin;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (k)obj;
        ProfilePlugin.a(a).a(null);
        ProfilePlugin.a(a, ((k) (obj)));
        super.a(obj);
    }

    public final void a(Throwable throwable)
    {
        kik.android.chat.fragment.KikDialogFragment.a a1;
        if ((throwable instanceof q) && ((q)throwable).a() == 101)
        {
            a1 = (new kik.android.chat.fragment.KikDialogFragment.a()).a("Error").b(ProfilePlugin.b(a).getResources().getString(0x7f09017a)).a(true).a(ProfilePlugin.b(a).getResources().getString(0x7f090193), null);
        } else
        {
            a1 = (new kik.android.chat.fragment.KikDialogFragment.a()).a("Error").b(ProfilePlugin.b(a).getResources().getString(0x7f0900a2, new Object[] {
                ProfilePlugin.c(a)
            })).a(true).a(ProfilePlugin.b(a).getResources().getString(0x7f090193), null);
        }
        ProfilePlugin.a(a).a(a1.a());
        super.a(throwable);
    }
}
