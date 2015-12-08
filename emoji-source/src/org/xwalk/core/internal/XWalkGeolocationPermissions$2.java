// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.webkit.ValueCallback;
import java.util.Set;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkGeolocationPermissions

class val.origins
    implements Runnable
{

    final XWalkGeolocationPermissions this$0;
    final ValueCallback val$callback;
    final Set val$origins;

    public void run()
    {
        val$callback.onReceiveValue(val$origins);
    }

    ()
    {
        this$0 = final_xwalkgeolocationpermissions;
        val$callback = valuecallback;
        val$origins = Set.this;
        super();
    }
}
