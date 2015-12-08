// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

// Referenced classes of package com.soundcloud.android.image:
//            ImageOperations

public class ImageOperationsController extends DefaultActivityLightCycle
{

    private final ImageOperations imageOperations;

    public ImageOperationsController(ImageOperations imageoperations)
    {
        imageOperations = imageoperations;
    }

    public volatile void onResume(Activity activity)
    {
        onResume((AppCompatActivity)activity);
    }

    public void onResume(AppCompatActivity appcompatactivity)
    {
        imageOperations.resume();
    }
}
