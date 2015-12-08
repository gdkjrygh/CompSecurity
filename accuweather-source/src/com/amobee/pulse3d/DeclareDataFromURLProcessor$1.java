// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.content.Context;
import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            FetchTask, DeclareDataFromURLProcessor, Pulse3DView, Pulse3DJavaScriptInterface

class val.reservedSerial extends FetchTask
{

    final DeclareDataFromURLProcessor this$0;
    final int val$reservedSerial;

    public void callBack(Object obj)
    {
        if (obj == null)
        {
            if (viewController_.jsInterface3D != null)
            {
                viewController_.jsInterface3D.reportBackToJS(val$reservedSerial, false, (new StringBuilder()).append("").append(ultCode.GENERIC_ERROR).toString());
            }
        } else
        if (viewController_.resources != null)
        {
            viewController_.resources.add(obj);
            int i = viewController_.resources.indexOf(obj);
            if (viewController_.jsInterface3D != null)
            {
                viewController_.jsInterface3D.reportBackToJS(val$reservedSerial, true, (new StringBuilder()).append("").append(i).toString());
                return;
            }
        }
    }

    public void prepare(Object obj)
    {
    }

    ultCode(int i)
    {
        this$0 = final_declaredatafromurlprocessor;
        val$reservedSerial = i;
        super(Context.this);
    }
}
