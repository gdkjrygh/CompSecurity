// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class dyl
{

    dym a;

    public dyl(dym dym1)
    {
        a = dym1;
    }

    public static boolean a(String s)
    {
        return s.length() < 4;
    }

    public static boolean b(String s)
    {
        return !TextUtils.isEmpty(s);
    }

    public final void a(Calendar calendar)
    {
        ctz.a(calendar);
        long l = calendar.getTimeInMillis();
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.util.SignupUtil.AgeVerification.values().length];
                try
                {
                    a[com.spotify.mobile.android.util.SignupUtil.AgeVerification.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.util.SignupUtil.AgeVerification.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (l < (new GregorianCalendar(Calendar.getInstance().get(1) - 112, 0, 1)).getTimeInMillis())
        {
            calendar = com.spotify.mobile.android.util.SignupUtil.AgeVerification.b;
        } else
        if (l > (new GregorianCalendar(Calendar.getInstance().get(1) - 13, 11, 31)).getTimeInMillis())
        {
            calendar = com.spotify.mobile.android.util.SignupUtil.AgeVerification.c;
        } else
        {
            calendar = com.spotify.mobile.android.util.SignupUtil.AgeVerification.a;
        }
        switch (_cls1.a[calendar.ordinal()])
        {
        default:
            a.f();
            return;

        case 1: // '\001'
            a.h();
            return;

        case 2: // '\002'
            a.g();
            break;
        }
    }
}
