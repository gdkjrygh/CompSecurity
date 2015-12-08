// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package org.chromium.content.browser:
//            ContentViewCore

class this._cls0
    implements istener
{

    private final ViewGroup mContainerViewAtCreation;
    final ContentViewCore this$0;

    public boolean onLongPress(View view, MotionEvent motionevent)
    {
        if (ContentViewCore.access$1200(ContentViewCore.this) != 0L)
        {
            ContentViewCore.access$1400(ContentViewCore.this, ContentViewCore.access$1200(ContentViewCore.this), motionevent.getEventTime(), motionevent.getX(), motionevent.getY());
        }
        return true;
    }

    public boolean onSingleTap(View view, MotionEvent motionevent)
    {
        mContainerViewAtCreation.requestFocus();
        if (ContentViewCore.access$1200(ContentViewCore.this) != 0L)
        {
            ContentViewCore.access$1300(ContentViewCore.this, ContentViewCore.access$1200(ContentViewCore.this), motionevent.getEventTime(), motionevent.getX(), motionevent.getY());
        }
        return true;
    }

    istener()
    {
        this$0 = ContentViewCore.this;
        super();
        mContainerViewAtCreation = ContentViewCore.access$000(ContentViewCore.this);
    }
}
