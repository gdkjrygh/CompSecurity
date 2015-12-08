// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package wei.mark.standout;

import android.view.WindowManager;
import android.view.animation.Animation;
import wei.mark.standout.ui.Window;

// Referenced classes of package wei.mark.standout:
//            StandOutWindow

final class a
    implements android.view.animation.onListener
{

    final Window a;
    final StandOutWindow b;

    public final void onAnimationEnd(Animation animation)
    {
        b.mWindowManager.removeView(a);
        a.c = 0;
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    imationListener(StandOutWindow standoutwindow, Window window)
    {
        b = standoutwindow;
        a = window;
        super();
    }
}
