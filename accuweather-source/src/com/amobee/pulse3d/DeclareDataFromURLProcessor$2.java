// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.content.Context;

// Referenced classes of package com.amobee.pulse3d:
//            FetchTask, DeclareDataFromURLProcessor, TextureResource, Log, 
//            Pulse3DView, Pulse3DJavaScriptInterface

class val.reservedHandle extends FetchTask
{

    final DeclareDataFromURLProcessor this$0;
    final int val$reservedHandle;
    final int val$reservedSerial;
    final TextureResource val$texture;

    public void callBack(Object obj)
    {
        if (obj == null)
        {
            Log.d("BinInterpreter", (new StringBuilder()).append("download failed! ").append(val$texture.url).toString());
            if (viewController_.jsInterface3D != null)
            {
                viewController_.jsInterface3D.reportBackToJS(val$reservedSerial, false, (new StringBuilder()).append("").append(ultCode.GENERIC_ERROR).toString());
            }
        } else
        {
            val$texture.obj = obj;
            if (viewController_.jsInterface3D != null)
            {
                viewController_.jsInterface3D.reportBackToJS(val$reservedSerial, true, (new StringBuilder()).append("").append(val$reservedHandle).toString());
                return;
            }
        }
    }

    public void prepare(Object obj)
    {
    }

    ultCode(int j)
    {
        this$0 = final_declaredatafromurlprocessor;
        val$texture = textureresource;
        val$reservedSerial = I.this;
        val$reservedHandle = j;
        super(final_context);
    }
}
