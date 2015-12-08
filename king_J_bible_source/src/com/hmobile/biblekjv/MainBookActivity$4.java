// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.hmobile.biblekjv:
//            MainBookActivity

class this._cls0
    implements android.view.r
{

    final MainBookActivity this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return MainBookActivity.access$27(MainBookActivity.this).onTouchEvent(motionevent);
    }

    ()
    {
        this$0 = MainBookActivity.this;
        super();
    }
}
