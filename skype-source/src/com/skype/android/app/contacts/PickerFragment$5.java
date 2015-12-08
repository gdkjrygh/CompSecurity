// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.OvershootInterpolator;
import android.widget.ScrollView;
import com.skype.android.widget.ParticipantsDisplayText;

// Referenced classes of package com.skype.android.app.contacts:
//            PickerFragment

final class 
    implements android.view.OnGlobalLayoutListener
{

    final PickerFragment this$0;
    final ParticipantsDisplayText val$participantsDisplayText;

    public final void onGlobalLayout()
    {
        val$participantsDisplayText.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        int i = participantViewContainer.getHeight();
        int j = val$participantsDisplayText.getHeight();
        final android.view.arams layoutParams = participantViewContainer.getLayoutParams();
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            i, j
        });
        valueanimator.setInterpolator(new OvershootInterpolator(3F));
        valueanimator.setDuration(333L);
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final PickerFragment._cls5 this$1;
            final android.view.ViewGroup.LayoutParams val$layoutParams;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                layoutParams.height = ((Integer)valueanimator1.getAnimatedValue()).intValue();
                layoutParams.width = -1;
                participantViewContainer.setLayoutParams(layoutParams);
                participantsScrollView.fullScroll(130);
                if (participantsScrollView.getHeight() > PickerFragment.access$100(this$0))
                {
                    PickerFragment.access$202(this$0, participantsDisplayText.getHeight());
                    valueanimator1 = participantsScrollView.getLayoutParams();
                    valueanimator1.height = PickerFragment.access$100(this$0);
                    participantsScrollView.setLayoutParams(valueanimator1);
                }
            }

            
            {
                this$1 = PickerFragment._cls5.this;
                layoutParams = layoutparams;
                super();
            }
        });
        valueanimator.start();
    }

    ()
    {
        this$0 = final_pickerfragment;
        val$participantsDisplayText = ParticipantsDisplayText.this;
        super();
    }
}
