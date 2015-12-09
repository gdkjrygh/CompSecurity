// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.view.ScaleGestureDetector;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AviaryImageRestoreSwitcher

class a
    implements android.view.estureListener
{

    final AviaryImageRestoreSwitcher a;

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        AviaryImageRestoreSwitcher.a.a("onScale");
        return false;
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        AviaryImageRestoreSwitcher.a.a("onScaleBegin");
        return false;
    }

    public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
        AviaryImageRestoreSwitcher.a.a("onScaleEnd");
    }

    (AviaryImageRestoreSwitcher aviaryimagerestoreswitcher)
    {
        a = aviaryimagerestoreswitcher;
        super();
    }
}
