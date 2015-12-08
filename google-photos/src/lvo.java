// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.identity.accounts.api.AccountData;

class lvo
    implements lvm
{

    lvo()
    {
    }

    public lvn a(Context context, Intent intent)
    {
        if (krb.a(context, intent))
        {
            context = krb.b(context, intent);
            return new lvn(((AccountData) (context)).b, ((AccountData) (context)).c);
        } else
        {
            return null;
        }
    }
}
