// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.listview;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.pinterest.ui.listview:
//            DismissingOverscrollListView

class this._cls0
    implements android.view.llListView._cls1
{

    final DismissingOverscrollListView this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return DismissingOverscrollListView.access$000(DismissingOverscrollListView.this) != null && DismissingOverscrollListView.access$000(DismissingOverscrollListView.this).onTouchEvent(motionevent);
    }

    ()
    {
        this$0 = DismissingOverscrollListView.this;
        super();
    }
}
