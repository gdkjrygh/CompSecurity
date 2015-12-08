// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;

import crittercism.android.az;
import crittercism.android.be;
import crittercism.android.bg;
import crittercism.android.dx;

public abstract class Transaction
{

    public az a;

    public Transaction()
    {
    }

    public static Transaction a(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (s.length() != 0)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        dx.b("Crittercism", "Transaction was created with a null/zero-length name. Returning no-op transaction", new IllegalStateException("Transaction created with null/zero-length name"));
        return new be();
        az az1;
        az1 = az.A();
        if (!az1.b)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        if (!az1.B())
        {
            break MISSING_BLOCK_LABEL_70;
        }
        s = new be();
        return s;
        try
        {
            s = new bg(az1, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            dx.a(s);
            return new be();
        }
        return s;
        dx.b("Crittercism", "Transaction was created before Crittercism.initialize() was called. Returning no-op transaction", new IllegalStateException("Transaction created before Crittercism.initialize()"));
        s = new be();
        return s;
    }

    public abstract void a();

    public abstract void a(int i);

    public abstract void b();

    public abstract void c();

    public abstract int d();
}
