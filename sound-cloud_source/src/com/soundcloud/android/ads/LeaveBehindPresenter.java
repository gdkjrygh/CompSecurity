// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import android.view.View;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.ads:
//            AdOverlayPresenter, LeaveBehindProperty

public class LeaveBehindPresenter extends AdOverlayPresenter
{

    public LeaveBehindPresenter(View view, AdOverlayPresenter.Listener listener, EventBus eventbus, ImageOperations imageoperations)
    {
        super(view, 0x7f0f01f5, 0x7f0f01f4, 0x7f0f00a1, 0x7f0f00a0, 0x7f0f009f, listener, imageoperations, eventbus);
    }

    public boolean isFullScreen()
    {
        return false;
    }

    public boolean shouldDisplayOverlay(PropertySet propertyset, boolean flag, boolean flag1, boolean flag2)
    {
        boolean flag3;
        if (((Boolean)propertyset.getOrElse(LeaveBehindProperty.META_AD_COMPLETED, Boolean.valueOf(false))).booleanValue() && !((Boolean)propertyset.getOrElse(LeaveBehindProperty.META_AD_CLICKED, Boolean.valueOf(false))).booleanValue())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        return flag1 && flag3;
    }
}
