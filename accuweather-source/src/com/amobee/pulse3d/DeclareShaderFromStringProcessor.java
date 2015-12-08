// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            StringArgProcessor, Pulse3DView, Pulse3DJavaScriptInterface

class DeclareShaderFromStringProcessor extends StringArgProcessor
{

    Pulse3DView viewController_;

    DeclareShaderFromStringProcessor(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
    }

    void execute()
    {
        viewController_.resources.add(string_);
        int i = viewController_.resources.indexOf(string_);
        viewController_.jsInterface3D.reportBackToJS(serial_, true, (new StringBuilder()).append("").append(i).toString());
    }
}
