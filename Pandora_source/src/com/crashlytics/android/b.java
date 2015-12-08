// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.cj;
import com.crashlytics.android.internal.cm;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android:
//            bc

final class b
    implements Callable
{

    private bc a;

    b(bc bc1)
    {
        a = bc1;
        super();
    }

    private Boolean a()
        throws Exception
    {
        boolean flag;
        try
        {
            flag = bc.d(a).delete();
            cm.a().b().a("Crashlytics", (new StringBuilder("Initialization marker file removed: ")).append(flag).toString());
        }
        catch (Exception exception)
        {
            cm.a().b().a("Crashlytics", "Problem encountered deleting Crashlytics initialization marker.", exception);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public final Object call()
        throws Exception
    {
        return a();
    }
}
