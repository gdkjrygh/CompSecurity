// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import org.chromium.base.ThreadUtils;

// Referenced classes of package org.chromium.content.browser:
//            ScreenOrientationListener

class val.self
    implements Runnable
{

    final val.self this$1;
    final val.self val$self;

    public void run()
    {
        val$self.ConfigurationChanged(null);
        if (cess._mth100(val$self) < 1)
        {
            return;
        } else
        {
            ThreadUtils.postOnUiThreadDelayed(this, 500L);
            return;
        }
    }

    ()
    {
        this$1 = final_;
        val$self = val.self.this;
        super();
    }
}
