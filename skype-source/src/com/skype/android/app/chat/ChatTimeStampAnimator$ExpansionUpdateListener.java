// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app.chat:
//            ChatTimeStampAnimator, j

public class end
    implements android.animation.Listener
{

    private int end;
    private j holder;
    private int start;
    final ChatTimeStampAnimator this$0;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f = ((Float)valueanimator.getAnimatedValue()).floatValue();
        valueanimator = holder.getTimestampContainer().getLayoutParams();
        valueanimator.holder = start + (int)((float)(end - start) * f);
        holder.getTimestampContainer().setLayoutParams(valueanimator);
        valueanimator = holder.getTimestampView();
        if (end <= start)
        {
            f = 1.0F - f;
        }
        valueanimator.setAlpha(f);
    }

    public (j j1, int i, int k)
    {
        this$0 = ChatTimeStampAnimator.this;
        super();
        holder = j1;
        start = i;
        end = k;
    }
}
