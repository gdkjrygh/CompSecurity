// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class mnr
    implements mnd
{

    mnr(mnn mnn)
    {
    }

    public final String a()
    {
        return "upgrade_direct_login_to_managed_login";
    }

    public final void a(Context context, mmz mmz1)
    {
        boolean flag;
        if (mmz1.a("is_direct_login"))
        {
            boolean flag1 = mmz1.a("is_direct_login", false);
            if (!flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mmz1.b("is_managed_account", flag);
            mmz1.e("is_direct_login");
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (mmz1.a("is_plus_page", false) && !flag)
        {
            mmz1.b("is_managed_account", true);
        }
    }
}
