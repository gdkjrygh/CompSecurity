// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            InlineVideoView, MMLayout, MMLog

class this._cls0
    implements android.view.er
{

    final InlineVideoView this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            view = (MMLayout)InlineVideoView.access$600(InlineVideoView.this).get();
            if (view == null)
            {
                MMLog.e("InlineVideoView", "Unable to handle touch event, MMLayout weak reference broken");
                return false;
            }
            if (!TextUtils.isEmpty(InlineVideoView.access$000(InlineVideoView.this).touchCallBack))
            {
                view.loadUrl(String.format((new StringBuilder()).append("javascript:").append(InlineVideoView.access$000(InlineVideoView.this).touchCallBack).append("(%f,%f)").toString(), new Object[] {
                    Float.valueOf(motionevent.getX()), Float.valueOf(motionevent.getY())
                }));
            }
            if (InlineVideoView.access$900(InlineVideoView.this) != null && !InlineVideoView.access$900(InlineVideoView.this).isShowing())
            {
                InlineVideoView.access$900(InlineVideoView.this).show();
                return true;
            }
        }
        return true;
    }

    diaController()
    {
        this$0 = InlineVideoView.this;
        super();
    }
}
