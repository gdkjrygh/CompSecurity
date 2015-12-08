// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;

// Referenced classes of package com.google.zxing.client.android:
//            ViewfinderView

final class ViewfinderResultPointCallback
    implements ResultPointCallback
{

    private final ViewfinderView viewfinderView;

    ViewfinderResultPointCallback(ViewfinderView viewfinderview)
    {
        viewfinderView = viewfinderview;
    }

    public void foundPossibleResultPoint(ResultPoint resultpoint)
    {
        viewfinderView.addPossibleResultPoint(resultpoint);
    }
}
