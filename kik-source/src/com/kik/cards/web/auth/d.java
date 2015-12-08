// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.auth;

import java.io.IOException;
import java.security.GeneralSecurityException;
import kik.android.util.bf;

// Referenced classes of package com.kik.cards.web.auth:
//            l, a

final class d extends bf
{

    final a a;

    d(a a1)
    {
        a = a1;
        super();
    }

    private transient Void a()
    {
        java.security.KeyPair keypair = l.a();
        try
        {
            com.kik.cards.web.auth.a.a(a, keypair);
        }
        catch (GeneralSecurityException generalsecurityexception)
        {
            generalsecurityexception.printStackTrace();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        super.onPostExecute((Void)obj);
        com.kik.cards.web.auth.a.c(a);
        com.kik.cards.web.auth.a.d(a);
    }
}
