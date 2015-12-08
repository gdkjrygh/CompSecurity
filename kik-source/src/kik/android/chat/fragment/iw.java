// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.graphics.Point;
import android.view.View;
import kik.android.chat.KikApplication;
import kik.android.scan.widget.a;
import kik.android.util.cv;
import kik.android.widget.KikFinderCodeImageView;

// Referenced classes of package kik.android.chat.fragment:
//            KikCodeFragment

final class iw
    implements Runnable
{

    final KikCodeFragment a;

    iw(KikCodeFragment kikcodefragment)
    {
        a = kikcodefragment;
        super();
    }

    public final void run()
    {
        if (a._drawArea == null || a._wipeContainer == null)
        {
            return;
        } else
        {
            a a1 = new a(0);
            int ai[] = new int[2];
            a._drawArea.getLocationInWindow(ai);
            int i = ai[0];
            int j = a._drawArea.getWidth() / 2;
            int k = ai[1];
            int l = a._drawArea.getHeight() / 2;
            a1.a(KikApplication.e(0x7f0c000c), new Point(i + j, k + l));
            a._wipeContainer.setBackgroundDrawable(a1);
            cv.b(new View[] {
                a._wipeContainer
            });
            return;
        }
    }
}
