// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nyh
{

    public String a;
    public String b;
    public boolean c;
    public nxq d;
    public boolean e;
    public nxy f;

    public nyh()
    {
    }

    public final nyg a()
    {
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "Authenticated request requires account name");
        p.b(true, "Unauthenticated request should not specify account name");
        return new nyg(this);
    }

    public final nyh a(Context context, int i)
    {
        context = ((mmv)olm.a(context, mmv)).a(i);
        boolean flag;
        if (context != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Account id %s not found", new Object[] {
            Integer.valueOf(i)
        });
        a = context.b("account_name");
        b = context.b("effective_gaia_id");
        return this;
    }
}
