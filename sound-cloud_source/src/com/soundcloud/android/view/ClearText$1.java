// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.soundcloud.android.view:
//            ClearText

class val.x
    implements android.view.Listener
{

    final ClearText this$0;
    final Drawable val$x;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (getCompoundDrawables()[2] != null && motionevent.getAction() == 1 && motionevent.getX() > (float)(getWidth() - getPaddingRight() - val$x.getIntrinsicWidth()))
        {
            if (TextUtils.isEmpty(getText()))
            {
                if (ClearText.access$000(ClearText.this) != null)
                {
                    ClearText.access$000(ClearText.this).onClick(ClearText.this);
                    return false;
                }
            } else
            {
                setText("");
                setCompoundDrawables(null, null, ClearText.access$100(ClearText.this), null);
                return false;
            }
        }
        return false;
    }

    ()
    {
        this$0 = final_cleartext;
        val$x = Drawable.this;
        super();
    }
}
