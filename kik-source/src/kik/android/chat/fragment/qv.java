// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import kik.android.util.cv;
import kik.android.widget.VelocityControlledViewPager;

// Referenced classes of package kik.android.chat.fragment:
//            ScanCodeTabFragment

final class qv
    implements Runnable
{

    final ScanCodeTabFragment a;

    qv(ScanCodeTabFragment scancodetabfragment)
    {
        a = scancodetabfragment;
        super();
    }

    public final void run()
    {
        a._viewPager.a(false);
        cv.b(new View[] {
            a._scanToggle, a._cameraIcon, a._codeIcon
        });
    }
}
