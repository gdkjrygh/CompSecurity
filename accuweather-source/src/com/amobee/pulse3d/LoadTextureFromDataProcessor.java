// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            MultipleArgProcessor, IntArgProcessor, Pulse3DView, TextureResource, 
//            Pulse3DJavaScriptInterface

class LoadTextureFromDataProcessor extends MultipleArgProcessor
{

    Pulse3DView viewController_;

    LoadTextureFromDataProcessor(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
        processors_.add(new IntArgProcessor());
    }

    void execute()
    {
        int i = ((IntArgProcessor)processors_.get(0)).value_;
        TextureResource textureresource = (TextureResource)viewController_.resources.get(i);
        TextureResource textureresource1 = new TextureResource();
        viewController_.resources.add(textureresource1);
        i = viewController_.resources.indexOf(textureresource1);
        int j = serial_;
        textureresource1.obj = textureresource.obj;
        textureresource1.url = textureresource.url;
        viewController_.jsInterface3D.reportBackToJS(j, true, (new StringBuilder()).append("").append(i).toString());
    }
}
