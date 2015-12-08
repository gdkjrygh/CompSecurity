// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            DeactivateResourceProcessor, RenderResource, Pulse3DView

class val.serial
    implements Runnable
{

    final DeactivateResourceProcessor this$0;
    final RenderResource val$glResource;
    final int val$serial;

    public void run()
    {
        val$glResource.Deactivate();
        if (val$glResource.handle == 0)
        {
            viewController_.reportError(val$serial, "Could not deactivate resource");
            return;
        } else
        {
            viewController_.reportSuccess(val$serial, (new StringBuilder()).append("").append(val$glResource.handle).toString());
            return;
        }
    }

    ()
    {
        this$0 = final_deactivateresourceprocessor;
        val$glResource = renderresource;
        val$serial = I.this;
        super();
    }
}
