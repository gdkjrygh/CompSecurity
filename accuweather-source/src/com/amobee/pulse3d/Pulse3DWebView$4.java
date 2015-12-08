// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.view.ViewGroup;
import android.widget.FrameLayout;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DWebView

class this._cls0
    implements Runnable
{

    final Pulse3DWebView this$0;

    public void run()
    {
        try
        {
            ((ViewGroup)mFullScreenHolder.getParent()).removeView(mFullScreenHolder);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    ()
    {
        this$0 = Pulse3DWebView.this;
        super();
    }
}
