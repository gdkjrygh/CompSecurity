// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.util.Collection;
import java.util.concurrent.Callable;

// Referenced classes of package crittercism.android:
//            l, v

final class a
    implements Callable
{

    final l a;

    private Boolean a()
    {
        try
        {
            l.i().j = v.a(a.t);
            (new StringBuilder("pendingNdkCrashes.getPendingDataVector().size = ")).append(l.i().j.f().size());
        }
        catch (Exception exception)
        {
            (new StringBuilder("Exception in startNdkSendingThreads boolean callable: ")).append(exception.getClass().getName());
            exception.printStackTrace();
        }
        if (l.i().j.f().size() == 0)
        {
            return Boolean.valueOf(true);
        }
        break MISSING_BLOCK_LABEL_94;
        Exception exception1;
        exception1;
        return Boolean.valueOf(l.i().l());
    }

    public final Object call()
    {
        return a();
    }

    lable(l l1)
    {
        a = l1;
        super();
    }
}
