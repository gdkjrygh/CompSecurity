// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.pub;

import android.hardware.Camera;
import android.util.Log;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.pub:
//            FeaturePrerequisiteCheckerUtil

final class 
    implements Provider
{

    private static Integer get()
    {
        int i;
        try
        {
            i = Camera.getNumberOfCameras();
        }
        catch (RuntimeException runtimeexception)
        {
            Log.e("FeaturePrerequisiteCheckerUtil", "Exception getting camera count", runtimeexception);
            return Integer.valueOf(0);
        }
        return Integer.valueOf(i);
    }

    public final volatile Object get()
    {
        return get();
    }

    ()
    {
    }
}
