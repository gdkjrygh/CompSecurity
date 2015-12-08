// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.view.View;
import com.spotify.mobile.android.service.flow.login.GenderSelectionHelper;

final class ang.Object
    implements android.view.nClickListener
{

    private dyc a;

    public final void onClick(View view)
    {
        boolean flag = false;
        dyc.a(a);
        if (!dyl.b(dyc.w(a)))
        {
            dyc.a(a, dyc.e(a), 0x7f08028d);
            flag = true;
        }
        dyc.a(a);
        if (dyl.a(dyc.h(a)))
        {
            dyc.a(a, dyc.f(a), 0x7f080293);
            flag = true;
        }
        if (TextUtils.isEmpty(dyc.m(a)))
        {
            dyc.a(a, dyc.n(a), 0x7f08017c);
            flag = true;
        }
        if (dyc.x(a) == null)
        {
            dyc.a(a, dyc.c(a), 0x7f080503);
            flag = true;
        } else
        {
            dyc.a(a).a(dyc.x(a));
        }
        if (dyc.v(a).a == null)
        {
            dyc.a(a, dyc.r(a), 0x7f080180);
            flag = true;
        }
        if (flag)
        {
            return;
        } else
        {
            dyc.a(a, true);
            dyc.a(dyc.y(a));
            dyc.a(a, dyc.a(a, new dye(a, true)));
            return;
        }
    }

    (dyc dyc1)
    {
        a = dyc1;
        super();
    }
}
