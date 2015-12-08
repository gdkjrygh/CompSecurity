// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;

public final class duv
{

    static final Uri a = Uri.parse("content://com.google.android.apps.photos.assistant.onboarding");
    final noz b;
    private final Context c;
    private final noz d;
    private final mmv e;

    public duv(Context context)
    {
        c = context;
        d = noz.a(context, "OnboardingCardHelper", new String[0]);
        b = noz.a(context, 3, "OnboardingCardHelper", new String[0]);
        e = (mmv)olm.a(context, mmv);
    }

    public static duy a(Context context, String s, String s1, dux dux1, String s2, int i)
    {
        return new duy(context, s, s1, s2, i, dux1, new duw(), dul.b);
    }

    static String a(String s)
    {
        return String.format("is_%s_dismissed", new Object[] {
            s
        });
    }

    static String b(String s)
    {
        return String.format("is_%s_seen", new Object[] {
            s
        });
    }

    public final Account a(int i)
    {
        Account account;
        try
        {
            account = new Account(e.a(i).b("account_name"), "com.google");
        }
        catch (mmy mmy1)
        {
            if (d.a())
            {
                (new StringBuilder(48)).append("No account found for given accountId:").append(i);
            }
            return null;
        }
        return account;
    }

    public final void a(dui dui1, dux dux1)
    {
        b(dui1.a(), a(dui1.b()), dux1);
    }

    boolean a(int i, String s, dux dux1)
    {
        boolean flag = false;
        if (dux1 != dux.a) goto _L2; else goto _L1
_L1:
        boolean flag1;
        try
        {
            flag1 = e.a(i).d("PhotosAssistantCard").a(s, false);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (d.a())
            {
                (new StringBuilder(48)).append("No account found for given accountId:").append(i);
                return false;
            }
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
_L4:
        return flag;
_L2:
        if (dux1 == dux.b)
        {
            return PreferenceManager.getDefaultSharedPreferences(c).getBoolean(s, false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void b(int i, String s, dux dux1)
    {
        if (dux1 != dux.a) goto _L2; else goto _L1
_L1:
        try
        {
            e.b(i).h("PhotosAssistantCard").c(s, true).d();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (d.a())
            {
                (new StringBuilder(48)).append("No account found for given accountId:").append(i);
            }
            continue; /* Loop/switch isn't completed */
        }
_L4:
        c.getContentResolver().notifyChange(a, null);
        return;
_L2:
        if (dux1 == dux.b)
        {
            PreferenceManager.getDefaultSharedPreferences(c).edit().putBoolean(s, true).apply();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
