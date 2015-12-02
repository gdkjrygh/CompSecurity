// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.view.MotionEvent;

// Referenced classes of package com.qihoo.security.widget:
//            MaterialRippleLayout

class ner extends android.view.nGestureListener
{

    final MaterialRippleLayout a;

    public void onLongPress(MotionEvent motionevent)
    {
        a.performLongClick();
    }

    ner(MaterialRippleLayout materialripplelayout)
    {
        a = materialripplelayout;
        super();
    }
}
