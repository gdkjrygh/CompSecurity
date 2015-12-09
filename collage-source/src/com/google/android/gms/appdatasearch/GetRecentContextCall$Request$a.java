// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.accounts.Account;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            GetRecentContextCall

public static final class I
{

    private Account a;
    private boolean b;
    private boolean c;
    private boolean d;
    private String e;

    public I a(String s)
    {
        e = s;
        return this;
    }

    public e a(boolean flag)
    {
        c = flag;
        return this;
    }

    public c a()
    {
        return new nit>(a, b, c, d, e);
    }

    public I()
    {
    }
}
