// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import android.view.ScaleGestureDetector;

// Referenced classes of package com.snapchat.android.ui.caption:
//            FatCaptionEditText

final class a
    implements android.view.OnScaleGestureListener
{

    private FatCaptionEditText a;

    public final boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        a.z = true;
        a.A = true;
        a.p = false;
        FatCaptionEditText.a(a, a.x * (double)scalegesturedetector.getScaleFactor());
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        FatCaptionEditText.a(a, true);
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
        FatCaptionEditText.a(a, false);
    }

    ner(FatCaptionEditText fatcaptionedittext)
    {
        a = fatcaptionedittext;
        super();
    }
}
