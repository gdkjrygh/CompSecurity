// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package org.chromium.content.browser:
//            PopupZoomer

public static interface 
{

    public abstract boolean onLongPress(View view, MotionEvent motionevent);

    public abstract boolean onSingleTap(View view, MotionEvent motionevent);
}
