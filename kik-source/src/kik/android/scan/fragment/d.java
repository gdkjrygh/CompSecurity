// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import android.view.View;
import kik.android.scan.widget.ScannerViewFinder;
import kik.android.scan.widget.a;
import kik.android.util.cv;

// Referenced classes of package kik.android.scan.fragment:
//            ScanFragment

final class d
    implements Runnable
{

    final ScanFragment a;

    d(ScanFragment scanfragment)
    {
        a = scanfragment;
        super();
    }

    public final void run()
    {
        cv.e(new View[] {
            a._loadingContainer, a._progress
        });
        a a1 = new a(0);
        a1.a(ScanFragment.i(a), a._scanFinder.a());
        a._animationContainer.setBackgroundDrawable(a1);
    }
}
