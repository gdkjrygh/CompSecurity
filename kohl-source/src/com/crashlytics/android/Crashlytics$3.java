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

    public Boolean call()
        throws Exception
    {
        boolean flag;
        try
        {
            flag = Crashlytics.access$000(Crashlytics.this).delete();
            Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Initialization marker file removed: ").append(flag).toString());
        }
        catch (Exception exception)
        {
            Fabric.getLogger().e("Fabric", "Problem encountered deleting Crashlytics initialization marker.", exception);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = Crashlytics.this;
        super();
    }
}
