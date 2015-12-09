// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;

import b.a.ae;
import b.a.ag;
import b.a.eu;
import b.a.q;

public abstract class Transaction
{

    public q a;

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
            break MISSING_BLOCK_LABEL_37;
        }
        if (s.length() != 0)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        eu.b("Transaction was created with a null/zero-length name. Returning no-op transaction", new IllegalStateException("Transaction created with null/zero-length name"));
        return new ae();
        q q1;
        q1 = q.A();
        if (!q1.b)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (!q1.D())
        {
            break MISSING_BLOCK_LABEL_68;
        }
        s = new ae();
        return s;
        try
        {
            s = new ag(q1, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            eu.a(s);
            return new ae();
        }
        return s;
        eu.b("Transaction was created before Crittercism.initialize() was called. Returning no-op transaction", new IllegalStateException("Transaction created before Crittercism.initialize()"));
        s = new ae();
        return s;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();
}
