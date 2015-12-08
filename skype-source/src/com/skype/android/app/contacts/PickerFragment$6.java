// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.ScrollView;
import com.skype.android.widget.ParticipantsDisplayText;
import java.util.List;

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
        int j = participantViewContainer.getHeight();
        final android.view.arams layoutParams;
        ValueAnimator valueanimator;
        int i;
        if (val$participantsDisplayText.a().size() == 0)
        {
            i = 0;
        } else
        {
            i = val$participantsDisplayText.getHeight();
        }
        layoutParams = participantViewContainer.getLayoutParams();
        valueanimator = ValueAnimator.ofInt(new int[] {
            j, i
        });
        valueanimator.setInterpolator(new AnticipateOvershootInterpolator(0.0F));
        valueanimator.setDuration(333L);
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final PickerFragment._cls6 this$1;
            final android.view.ViewGroup.LayoutParams val$layoutParams;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                layoutParams.height = ((Integer)valueanimator1.getAnimatedValue()).intValue();
                layoutParams.width = -1;
                participantViewContainer.setLayoutParams(layoutParams);
                if (participantsDisplayText.getHeight() < PickerFragment.access$200(this$0))
                {
                    valueanimator1 = participantsScrollView.getLayoutParams();
                    if (((android.view.ViewGroup.LayoutParams) (valueanimator1)).height != -2)
                    {
                        valueanimator1.height = -2;
                        participantsScrollView.setLayoutParams(valueanimator1);
                    }
                }
            }

            
            {
                this$1 = PickerFragment._cls6.this;
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
