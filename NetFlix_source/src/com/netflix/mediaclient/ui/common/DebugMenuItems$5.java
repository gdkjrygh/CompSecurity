// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.os.Debug;
import android.widget.Toast;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            DebugMenuItems

class this._cls0
    implements Runnable
{

    final DebugMenuItems this$0;

    public void run()
    {
        Debug.stopMethodTracing();
        Log.i(DebugMenuItems.access$000(DebugMenuItems.this), "Trace complete.  Get with: adb pull /sdcard/nflx.trace");
        Toast.makeText(DebugMenuItems.access$100(DebugMenuItems.this), "Trace: /sdcard/nflx.trace", 1).show();
    }

    ()
    {
        this$0 = DebugMenuItems.this;
        super();
    }
}
