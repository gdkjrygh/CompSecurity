// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.concurrent.TimeUnit;

class lxa
    implements lww
{

    public final Context a;

    public lxa(Context context)
    {
        a = context;
    }

    public final String a(String s, String s1)
    {
        try
        {
            s = jty.a(a, s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new lwx(((jtz) (s)).a, s.getMessage(), s.a(), s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new lwy(s.getMessage(), s.a());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new lwv(s);
        }
        return s;
    }

    public Account[] a(String s)
    {
        return AccountManager.get(a).getAccountsByType(s);
    }

    static 
    {
        TimeUnit.SECONDS.toMillis(2L);
    }
}
