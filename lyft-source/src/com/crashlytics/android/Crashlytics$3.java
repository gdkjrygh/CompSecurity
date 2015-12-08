// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android:
//            Crashlytics

class a
    implements Callable
{

    final Crashlytics a;

    public Boolean a()
    {
        boolean flag;
        try
        {
            flag = Crashlytics.a(a).delete();
            Fabric.g().a("Fabric", (new StringBuilder()).append("Initialization marker file removed: ").append(flag).toString());
        }
        catch (Exception exception)
        {
            Fabric.g().d("Fabric", "Problem encountered deleting Crashlytics initialization marker.", exception);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public Object call()
    {
        return a();
    }

    (Crashlytics crashlytics)
    {
        a = crashlytics;
        super();
    }
}
