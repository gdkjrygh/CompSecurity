// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;

final class ang.Object
    implements hbx
{

    private alu a;

    public final Object a(hbz hbz1)
    {
        boolean flag = false;
        if (hbz1.d.a)
        {
            if (!(new hbe(a)).a().getBoolean("always_send_reports_opt_in", false))
            {
                flag = true;
            }
            return Boolean.valueOf(flag);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    (alu alu1)
    {
        a = alu1;
        super();
    }
}
