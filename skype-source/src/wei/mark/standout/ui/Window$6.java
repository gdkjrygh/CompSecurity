// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package wei.mark.standout.ui;

import android.view.MotionEvent;
import android.view.View;
import wei.mark.standout.StandOutWindow;

// Referenced classes of package wei.mark.standout.ui:
//            Window

final class a
    implements android.view.uchListener
{

    final Window a;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        return Window.a(a).onTouchHandleMove(a.b, a, view, motionevent);
    }

    ow(Window window)
    {
        a = window;
        super();
    }
}
