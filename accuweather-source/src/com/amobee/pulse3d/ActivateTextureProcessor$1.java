// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            ActivateTextureProcessor, Pulse3DView, TextureResource

class val.format
    implements Runnable
{

    final ActivateTextureProcessor this$0;
    final int val$format;
    final int val$handle;
    final int val$serial;

    public void run()
    {
        if (viewController_.resources == null)
        {
            return;
        }
        TextureResource textureresource = (TextureResource)viewController_.resources.get(val$handle);
        if (textureresource == null)
        {
            viewController_.reportError(val$serial, "handle not found!");
            return;
        }
        textureresource.setFormatRequest(val$format);
        textureresource.Activate();
        if (textureresource.handle != 0)
        {
            viewController_.reportSuccess(val$serial, Integer.toString(val$handle));
            return;
        } else
        {
            viewController_.reportError(val$serial, "could not activate texture with this format");
            return;
        }
    }

    ()
    {
        this$0 = final_activatetextureprocessor;
        val$handle = i;
        val$serial = j;
        val$format = I.this;
        super();
    }
}
