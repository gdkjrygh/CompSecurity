// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class mnu
    implements mnd
{

    mnu(mnn mnn)
    {
    }

    public final String a()
    {
        return "upgrade:remove_account_status";
    }

    public final void a(Context context, mmz mmz1)
    {
        switch (mmz1.a("account_status", 0))
        {
        case 0: // '\0'
        case 2: // '\002'
        default:
            return;

        case 1: // '\001'
            mmz1.b("is_bad", true);
            return;

        case 3: // '\003'
            mmz1.b("gplus_no_mobile_tos", true);
            return;

        case 4: // '\004'
            mmz1.b("is_google_plus", true);
            mmz1.b("logged_in", true);
            return;

        case 5: // '\005'
            mmz1.b("is_google_plus", true);
            break;
        }
        mmz1.b("logged_out", true);
    }
}
