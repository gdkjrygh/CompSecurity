// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.Context;

final class lxc extends lxa
{

    public lxc(Context context)
    {
        super(context);
    }

    public final Account[] a(String s)
    {
        if (android.os.Build.VERSION.SDK_INT <= 22)
        {
            return super.a(s);
        }
        try
        {
            s = jty.b(a, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new lzj(((jyb) (s)).a, s.getMessage(), s.a(), s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new lzi(((jya) (s)).a, s);
        }
        return s;
    }
}
