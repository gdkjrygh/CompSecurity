// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.view.View;
import android.widget.ImageView;
import com.pinterest.activity.nux.adapter.NUXInfiniteListAdapter;
import com.pinterest.kit.activity.BaseActivity;

// Referenced classes of package com.pinterest.activity.nux.view:
//            NUXAnimatedPinView

public class this._cls0
    implements Runnable
{

    final NUXAnimatedPinView this$0;

    public void run()
    {
        View view = getChildAt(0);
        if (view.getTranslationX() + (float)NUXAnimatedPinView.access$300(NUXAnimatedPinView.this) < 0.0F && (view instanceof ImageView))
        {
            View view1 = getChildAt(getChildCount() - 1);
            ImageView imageview = (ImageView)view;
            imageview.setTranslationX(view1.getTranslationX() + (float)NUXAnimatedPinView.access$300(NUXAnimatedPinView.this));
            imageview.setImageDrawable(_adapter.getItem(NUXAnimatedPinView.access$200() % NUXAnimatedPinView.access$400(NUXAnimatedPinView.this)));
            removeView(view);
            addView(imageview, getChildCount());
        }
        if (((BaseActivity)getContext()).isVisible() && _adapter != null)
        {
            NUXAnimatedPinView.access$208();
            NUXAnimatedPinView.access$100(NUXAnimatedPinView.this);
        }
    }

    public ()
    {
        this$0 = NUXAnimatedPinView.this;
        super();
    }
}
