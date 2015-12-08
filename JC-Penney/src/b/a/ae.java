// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import com.crittercism.app.Transaction;

// Referenced classes of package b.a:
//            eu

public final class ae extends Transaction
{

    public ae()
    {
        eu.c("Creating no-op transaction");
    }

    public final void a()
    {
        eu.b("No-op transaction. Ignoring Transaction.start() call.", new IllegalStateException("No-op transaction"));
    }

    public final void b()
    {
        eu.b("No-op transaction. Ignoring Transaction.stop() call.", new IllegalStateException("No-op transaction"));
    }

    public final void c()
    {
        eu.b("No-op transaction. Ignoring Transaction.fail() call.", new IllegalStateException("No-op transaction"));
    }
}
