// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import android.widget.TextView;
import kik.android.chat.KikApplication;
import kik.android.util.cv;

// Referenced classes of package kik.android.scan.fragment:
//            ScanFragment, v

final class u
    implements Runnable
{

    final ScanFragment a;

    u(ScanFragment scanfragment)
    {
        a = scanfragment;
        super();
    }

    public final void run()
    {
        cv.a(KikApplication.f(0x7f09020e), a._errorRetryButton);
        a._errorRetryButton.setOnClickListener(new v(this));
        ScanFragment.a(a, "", KikApplication.f(0x7f09020f));
    }
}
