// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.api;

import android.os.Bundle;
import com.adobe.adobepass.accessenabler.utils.Log;

// Referenced classes of package com.adobe.adobepass.accessenabler.api:
//            AccessEnablerService

private class opCode extends Thread
{

    private int opCode;
    private Bundle params;
    final AccessEnablerService this$0;

    public void run()
    {
        if (AccessEnablerService.access$1100(AccessEnablerService.this) == null)
        {
            Log.e("AccessEnablerService", "No implementation for the IAccessEnablerDelegate was provided.");
            return;
        }
        if (AccessEnablerService.access$1200(AccessEnablerService.this) == null)
        {
            Log.e("AccessEnablerService", "AccessEnabler context not initialized.");
            return;
        }
        try
        {
            AccessEnablerService.access$1300(AccessEnablerService.this)[opCode].opCode(params);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            runtimeexception.printStackTrace();
            Log.e("AccessEnablerService", (new StringBuilder()).append("Exception in the worker thread. ").append(runtimeexception.getClass().getSimpleName()).append(" | ").append(runtimeexception.getMessage()).toString());
            return;
        }
    }

    public (int i, Bundle bundle)
    {
        this$0 = AccessEnablerService.this;
        super();
        params = bundle;
        opCode = i;
    }
}
