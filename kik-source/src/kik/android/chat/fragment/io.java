// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import kik.android.util.av;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            KikCodeFragment

final class io
    implements Runnable
{

    final KikCodeFragment a;

    io(KikCodeFragment kikcodefragment)
    {
        a = kikcodefragment;
        super();
    }

    public final void run()
    {
        cv.b(new View[] {
            a._fakeCode
        });
        cv.e(new View[] {
            a._spinner, a._drawArea
        });
        av.b(new View[] {
            a._codeInfo, a._scanText
        });
        av.a(new View[] {
            a._errorHolder, a._retryImage
        });
    }
}
