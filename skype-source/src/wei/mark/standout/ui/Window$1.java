// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package wei.mark.standout.ui;

import android.view.MotionEvent;
import android.view.View;
import wei.mark.standout.StandOutWindow;

// Referenced classes of package wei.mark.standout.ui:
//            Window

final class b
    implements android.view.uchListener
{

    final StandOutWindow a;
    final int b;
    final Window c;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag1 = false;
        boolean flag;
        if (a.onTouchHandleMove(b, c, view, motionevent))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a.onTouchBody(b, c, view, motionevent) || flag)
        {
            flag1 = true;
        }
        return flag1;
    }

    ow(Window window, StandOutWindow standoutwindow, int i)
    {
        c = window;
        a = standoutwindow;
        b = i;
        super();
    }
}
