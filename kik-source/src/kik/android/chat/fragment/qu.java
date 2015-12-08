// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import kik.android.util.cv;
import kik.android.widget.VelocityControlledViewPager;

// Referenced classes of package kik.android.chat.fragment:
//            ScanCodeTabFragment

final class qu
    implements Runnable
{

    final ScanCodeTabFragment a;

    qu(ScanCodeTabFragment scancodetabfragment)
    {
        a = scancodetabfragment;
        super();
    }

    public final void run()
    {
        a._viewPager.a(true);
        cv.e(new View[] {
            a._scanToggle, a._cameraIcon, a._codeIcon
        });
    }
}
