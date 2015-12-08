// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.braintree.view;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.kit.activity.BaseActivity;

// Referenced classes of package com.pinterest.activity.commerce.braintree.view:
//            CardEditText

class this._cls0
    implements android.view.tener
{

    final CardEditText this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0 && getText().length() == 0)
        {
            Drawable adrawable[] = getCompoundDrawables();
            if (adrawable != null && adrawable.length == 4)
            {
                Drawable drawable = adrawable[2];
                int i = view.getWidth();
                int j = view.getPaddingRight();
                int k = drawable.getIntrinsicWidth();
                if (motionevent.getX() > (float)(i - j - k))
                {
                    motionevent.setAction(3);
                    ActivityHelper.goCardScan((BaseActivity)getContext());
                    return true;
                }
            }
        }
        return false;
    }

    ()
    {
        this$0 = CardEditText.this;
        super();
    }
}
