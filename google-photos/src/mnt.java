// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class mnt
    implements mnd
{

    mnt(mnn mnn)
    {
    }

    public final String a()
    {
        return "upgrade:account_status";
    }

    public final void a(Context context, mmz mmz1)
    {
        if (mmz1.c("non_google_plus"))
        {
            mmz1.e("non_google_plus");
            mmz1.b("account_status", 2);
            return;
        }
        if (mmz1.c("notifications_only"))
        {
            mmz1.e("notifications_only");
            mmz1.b("account_status", 3);
            return;
        }
        if (mmz1.c("logged_in"))
        {
            mmz1.e("logged_in");
            mmz1.b("account_status", 4);
            return;
        } else
        {
            mmz1.b("account_status", 5);
            return;
        }
    }
}
