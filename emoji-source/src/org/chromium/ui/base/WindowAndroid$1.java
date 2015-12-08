// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.base;

import org.chromium.ui.VSyncMonitor;

// Referenced classes of package org.chromium.ui.base:
//            WindowAndroid

class this._cls0
    implements org.chromium.ui.tener
{

    final WindowAndroid this$0;

    public void onVSync(VSyncMonitor vsyncmonitor, long l)
    {
        if (WindowAndroid.access$000(WindowAndroid.this) != 0L)
        {
            WindowAndroid.access$100(WindowAndroid.this, WindowAndroid.access$000(WindowAndroid.this), l);
        }
    }

    ()
    {
        this$0 = WindowAndroid.this;
        super();
    }
}
