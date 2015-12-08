// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AuthenticatorException;
import android.content.Context;

class lwz
    implements lwu
{

    lwz()
    {
    }

    public final String a(Context context, String s, String s1)
    {
        try
        {
            context = jty.a(context, s, s1, null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new AuthenticatorException("Cannot get Oauth2 token from GMS", context);
        }
        return context;
    }

    public final void a(Context context, String s)
    {
        try
        {
            jty.a(context, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new AuthenticatorException("Cannot invalidate token", context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new AuthenticatorException("Cannot invalidate token", context);
        }
    }
}
