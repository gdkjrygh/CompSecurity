// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;

// Referenced classes of package kik.android.widget:
//            RobotoEditText

public class BackDelegatingRobotoEditText extends RobotoEditText
{
    public static abstract class a
    {

        public abstract boolean a();
    }


    private a a;

    public BackDelegatingRobotoEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public BackDelegatingRobotoEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyevent)
    {
        android.view.KeyEvent.DispatcherState dispatcherstate;
        if (a == null || keyevent.getKeyCode() != 4)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        dispatcherstate = getKeyDispatcherState();
        if (dispatcherstate == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        if (keyevent.getAction() != 0 || keyevent.getRepeatCount() != 0) goto _L2; else goto _L1
_L1:
        dispatcherstate.startTracking(keyevent, this);
        if (!a.a()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return super.dispatchKeyEventPreIme(keyevent);
_L2:
        if (keyevent.getAction() != 1 || keyevent.isCanceled() || !dispatcherstate.isTracking(keyevent))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        if (a.a()) goto _L3; else goto _L5
_L5:
        return super.dispatchKeyEventPreIme(keyevent);
        return super.dispatchKeyEventPreIme(keyevent);
    }
}
