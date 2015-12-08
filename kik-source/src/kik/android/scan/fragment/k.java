// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import android.view.View;
import kik.android.util.cv;

// Referenced classes of package kik.android.scan.fragment:
//            ScanFragment

final class k
    implements Runnable
{

    final ScanFragment a;

    k(ScanFragment scanfragment)
    {
        a = scanfragment;
        super();
    }

    public final void run()
    {
        ScanFragment.l(a);
        ScanFragment.m(a);
        cv.e(new View[] {
            a._progress, a._animationContainer, a._errorImage, a._errorRetryButton, a._errorText, a._errorTitle, a._cameraErrorCover
        });
        cv.b(new View[] {
            a._callToActionTextView
        });
    }
}
