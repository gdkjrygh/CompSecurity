// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package org.chromium.content.browser:
//            ContentViewCore

public static interface I
{

    public abstract boolean awakenScrollBars();

    public abstract boolean drawChild(Canvas canvas, View view, long l);

    public abstract void onScrollChanged(int i, int j, int k, int l);

    public abstract boolean super_awakenScrollBars(int i, boolean flag);

    public abstract boolean super_dispatchKeyEvent(KeyEvent keyevent);

    public abstract boolean super_dispatchKeyEventPreIme(KeyEvent keyevent);

    public abstract void super_onConfigurationChanged(Configuration configuration);

    public abstract boolean super_onGenericMotionEvent(MotionEvent motionevent);

    public abstract boolean super_onKeyUp(int i, KeyEvent keyevent);
}
