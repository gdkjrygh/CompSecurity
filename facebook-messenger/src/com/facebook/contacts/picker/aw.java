// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.facebook.contacts.picker:
//            as

class aw
    implements android.view.View.OnTouchListener
{

    final as a;

    aw(as as1)
    {
        a = as1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return as.a(a, motionevent);
    }
}
