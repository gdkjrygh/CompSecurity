// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import android.view.View;
import kik.android.util.av;
import kik.android.util.cv;

// Referenced classes of package kik.android.scan.fragment:
//            ScanFragment

final class b
    implements Runnable
{

    final String a;
    final String b;
    final ScanFragment c;

    b(ScanFragment scanfragment, String s, String s1)
    {
        c = scanfragment;
        a = s;
        b = s1;
        super();
    }

    public final void run()
    {
        cv.a(a, c._errorText);
        cv.a(b, c._errorTitle);
        cv.e(new View[] {
            c._progress, c._cameraErrorCover
        });
        av.a(new View[] {
            c._loadingContainer, c._errorImage, c._errorRetryButton, c._errorText, c._errorTitle
        });
    }
}
