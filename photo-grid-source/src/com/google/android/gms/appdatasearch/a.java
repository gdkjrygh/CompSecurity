// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.accounts.Account;

public final class a
{

    private Account a;
    private boolean b;
    private boolean c;
    private boolean d;
    private String e;

    public a()
    {
    }

    public final a a()
    {
        c = true;
        return this;
    }

    public final a a(String s)
    {
        e = s;
        return this;
    }

    public final GetRecentContextCall.Request b()
    {
        return new GetRecentContextCall.Request(a, b, c, d, e);
    }
}
