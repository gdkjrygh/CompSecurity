// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.webkit.ValueCallback;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkGeolocationPermissions

class val.finalAllowed
    implements Runnable
{

    final XWalkGeolocationPermissions this$0;
    final ValueCallback val$callback;
    final boolean val$finalAllowed;

    public void run()
    {
        val$callback.onReceiveValue(Boolean.valueOf(val$finalAllowed));
    }

    ()
    {
        this$0 = final_xwalkgeolocationpermissions;
        val$callback = valuecallback;
        val$finalAllowed = Z.this;
        super();
    }
}
