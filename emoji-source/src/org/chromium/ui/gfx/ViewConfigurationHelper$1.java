// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.gfx;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

// Referenced classes of package org.chromium.ui.gfx:
//            ViewConfigurationHelper

class this._cls0
    implements ComponentCallbacks
{

    final ViewConfigurationHelper this$0;

    public void onConfigurationChanged(Configuration configuration)
    {
        ViewConfigurationHelper.access$000(ViewConfigurationHelper.this);
    }

    public void onLowMemory()
    {
    }

    ()
    {
        this$0 = ViewConfigurationHelper.this;
        super();
    }
}
