// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.paypal.android.sdk.g;

public class byu
{

    private static final String a = byu.getSimpleName();

    byu()
    {
    }

    public static String a()
    {
        String s = bun.a().c().a();
        if (bwq.c(s) || s.equalsIgnoreCase("US"))
        {
            return "https://www.paypal.com/webapps/accountrecovery/passwordrecovery";
        } else
        {
            String s1 = bux.c(s);
            return String.format("https://www.paypal.com/%s/cgi-bin/webscr?cmd=_account-recovery&from=%s&locale.x=%s", new Object[] {
                s.toLowerCase(), "PayPalMPL", s1
            });
        }
    }

}
