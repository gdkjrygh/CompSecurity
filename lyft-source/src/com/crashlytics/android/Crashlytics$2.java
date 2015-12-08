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

    public Void a()
    {
        Crashlytics.a(a).createNewFile();
        Fabric.g().a("Fabric", "Initialization marker file created.");
        return null;
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
