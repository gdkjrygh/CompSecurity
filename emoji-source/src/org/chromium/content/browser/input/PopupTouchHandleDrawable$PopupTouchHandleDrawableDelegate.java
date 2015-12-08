// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import android.view.MotionEvent;
import android.view.View;
import org.chromium.content.browser.PositionObserver;

// Referenced classes of package org.chromium.content.browser.input:
//            PopupTouchHandleDrawable

public static interface 
{

    public abstract View getParent();

    public abstract PositionObserver getParentPositionObserver();

    public abstract boolean isScrollInProgress();

    public abstract boolean onTouchHandleEvent(MotionEvent motionevent);
}
