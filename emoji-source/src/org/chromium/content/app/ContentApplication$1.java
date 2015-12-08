// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.app;

import org.chromium.base.library_loader.LibraryLoader;
import org.chromium.content.browser.TracingControllerAndroid;

// Referenced classes of package org.chromium.content.app:
//            ContentApplication

class this._cls0
    implements android.os.ler
{

    final ContentApplication this$0;

    public boolean queueIdle()
    {
        if (!LibraryLoader.isInitialized())
        {
            return true;
        }
        try
        {
            getTracingController().registerReceiver(ContentApplication.this);
        }
        catch (SecurityException securityexception) { }
        return false;
    }

    Android()
    {
        this$0 = ContentApplication.this;
        super();
    }
}
