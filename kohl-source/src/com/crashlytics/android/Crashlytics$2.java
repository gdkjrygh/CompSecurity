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

class this._cls0
    implements Callable
{

    final Crashlytics this$0;

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
        Crashlytics.access$000(Crashlytics.this).createNewFile();
        Fabric.getLogger().d("Fabric", "Initialization marker file created.");
        return null;
    }

    ()
    {
        this$0 = Crashlytics.this;
        super();
    }
}
