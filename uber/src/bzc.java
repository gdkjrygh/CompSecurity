// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.EditText;

public final class bzc
    implements Runnable
{

    private EditText a;

    public bzc(EditText edittext)
    {
        a = edittext;
        super();
    }

    public final void run()
    {
        a.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, 9999F, 0.0F, 0));
        a.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, 9999F, 0.0F, 0));
    }
}
