// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.content.res.Resources;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.appboy.enums.inappmessage.SlideFrom;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageSlideup;
import com.appboy.ui.support.AnimationUtils;

// Referenced classes of package com.appboy.ui.inappmessage:
//            IInAppMessageAnimationFactory, AppboyInAppMessageManager

class this._cls0
    implements IInAppMessageAnimationFactory
{

    private final int mShortAnimationDurationMillis = Resources.getSystem().getInteger(0x10e0000);
    private final long sSlideupAnimationDurationMillis = 400L;
    final AppboyInAppMessageManager this$0;

    public Animation getClosingAnimation(IInAppMessage iinappmessage)
    {
        if (iinappmessage instanceof InAppMessageSlideup)
        {
            if (((InAppMessageSlideup)iinappmessage).getSlideFrom() == SlideFrom.TOP)
            {
                iinappmessage = AnimationUtils.createVerticalAnimation(0.0F, -1F, 400L, false);
            } else
            {
                iinappmessage = AnimationUtils.createVerticalAnimation(0.0F, 1.0F, 400L, false);
            }
        } else
        {
            iinappmessage = new AlphaAnimation(1.0F, 0.0F);
        }
        return AnimationUtils.setAnimationParams(iinappmessage, mShortAnimationDurationMillis, false);
    }

    public Animation getOpeningAnimation(IInAppMessage iinappmessage)
    {
        if (iinappmessage instanceof InAppMessageSlideup)
        {
            if (((InAppMessageSlideup)iinappmessage).getSlideFrom() == SlideFrom.TOP)
            {
                iinappmessage = AnimationUtils.createVerticalAnimation(-1F, 0.0F, 400L, false);
            } else
            {
                iinappmessage = AnimationUtils.createVerticalAnimation(1.0F, 0.0F, 400L, false);
            }
        } else
        {
            iinappmessage = new AlphaAnimation(0.0F, 1.0F);
        }
        return AnimationUtils.setAnimationParams(iinappmessage, mShortAnimationDurationMillis, true);
    }

    ()
    {
        this$0 = AppboyInAppMessageManager.this;
        super();
    }
}
