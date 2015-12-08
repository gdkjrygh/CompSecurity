// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            ActivateProgramProcessor, ShaderResource, Pulse3DView

class val.serial
    implements Runnable
{

    final ActivateProgramProcessor this$0;
    final ShaderResource val$program;
    final int val$serial;

    public void run()
    {
        val$program.Activate();
        if (val$program.handle != 0)
        {
            String s = val$program.getUniformLocations();
            viewController_.reportSuccess(val$serial, s);
            return;
        } else
        {
            viewController_.reportError(val$serial, "Error while activating program");
            return;
        }
    }

    ()
    {
        this$0 = final_activateprogramprocessor;
        val$program = shaderresource;
        val$serial = I.this;
        super();
    }
}
