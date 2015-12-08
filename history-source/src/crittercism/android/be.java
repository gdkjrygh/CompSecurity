// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import com.crittercism.app.Transaction;

// Referenced classes of package crittercism.android:
//            dx

public final class be extends Transaction
{

    public be()
    {
        dx.c("Crittercism", "Creating no-op transaction");
    }

    public final void a()
    {
        dx.b("Crittercism", "No-op transaction. Ignoring Transaction.start() call.", new IllegalStateException("No-op transaction"));
    }

    public final void a(int i)
    {
        dx.b("Crittercism", "No-op transaction. Ignoring Transaction.setValue(double) call.", new IllegalStateException("No-op transaction"));
    }

    public final void b()
    {
        dx.b("Crittercism", "No-op transaction. Ignoring Transaction.stop() call.", new IllegalStateException("No-op transaction"));
    }

    public final void c()
    {
        dx.b("Crittercism", "No-op transaction. Ignoring Transaction.fail() call.", new IllegalStateException("No-op transaction"));
    }

    public final int d()
    {
        dx.b("Crittercism", "No-op transaction. Ignoring Transaction.getValue() call.", new IllegalStateException("No-op transaction"));
        return -1;
    }
}
