// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            KikCodeFragment, iq

final class ip
    implements Runnable
{

    final KikCodeFragment a;

    ip(KikCodeFragment kikcodefragment)
    {
        a = kikcodefragment;
        super();
    }

    public final void run()
    {
        cv.e(new View[] {
            a._retryImage
        });
        if (cv.d(a._codeInfo))
        {
            KikCodeFragment.m(a).postDelayed(new iq(this), 300L);
        }
    }
}
