// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.graphics.Point;
import android.view.View;
import kik.android.scan.widget.a;

// Referenced classes of package kik.android.chat.fragment:
//            KikCodeFragment

final class ij
    implements Runnable
{

    final int a;
    final KikCodeFragment b;

    ij(KikCodeFragment kikcodefragment, int i)
    {
        b = kikcodefragment;
        a = i;
        super();
    }

    public final void run()
    {
        if (KikCodeFragment.m(b) != null && (KikCodeFragment.m(b).getBackground() instanceof a))
        {
            ((a)KikCodeFragment.m(b).getBackground()).a(a, new Point(0, 0));
        }
    }
}
