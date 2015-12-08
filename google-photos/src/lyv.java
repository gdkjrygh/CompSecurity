// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.text.TextUtils;

public final class lyv
    implements lyo
{

    private jvl a;

    public lyv()
    {
        a = new jvl();
    }

    public final ds a()
    {
        jvl jvl1 = a;
        if (jvl1.a.a != null)
        {
            if (!TextUtils.isEmpty(jvl1.a.c))
            {
                throw new IllegalArgumentException("notificationTitle requires using the default notification");
            }
            if (!TextUtils.isEmpty(jvl1.a.d))
            {
                throw new IllegalArgumentException("notificationText requires using the default notification");
            }
            if (jvl1.a.b != null)
            {
                throw new IllegalArgumentException("notificationPendingIntent requires using the default notification");
            }
        } else
        if (TextUtils.isEmpty(jvl1.a.c) && TextUtils.isEmpty(jvl1.a.d) && jvl1.a.b == null)
        {
            throw new IllegalArgumentException("At least an argument must be provided");
        }
        return new lyu(jvl1.a);
    }

    public final lyo a(PendingIntent pendingintent)
    {
        a.a.b = pendingintent;
        return this;
    }
}
