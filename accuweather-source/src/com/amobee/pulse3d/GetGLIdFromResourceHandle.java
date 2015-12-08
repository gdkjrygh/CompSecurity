// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            FloatArgProcessor, Pulse3DView, RenderResource

class GetGLIdFromResourceHandle extends FloatArgProcessor
{

    Pulse3DView viewController_;

    GetGLIdFromResourceHandle(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
    }

    void execute()
    {
        Object obj = viewController_.resources.get((int)value_);
        if (obj instanceof RenderResource)
        {
            obj = (RenderResource)obj;
            viewController_.reportSuccess(serial_, (new StringBuilder()).append("").append(((RenderResource) (obj)).handle).toString());
            return;
        } else
        {
            viewController_.reportError(serial_, "Id given is not an alias for a resource");
            return;
        }
    }
}
