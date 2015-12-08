// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.soundcloud.android.util.AnimUtils;
import java.lang.ref.WeakReference;

// Referenced classes of package com.soundcloud.android.onboarding:
//            OnboardActivity

class PhotoLoadHandler extends Handler
{

    private final WeakReference onboardActivityRef;
    private final WeakReference splashRef;

    public PhotoLoadHandler(OnboardActivity onboardactivity, View view)
    {
        onboardActivityRef = new WeakReference(onboardactivity);
        splashRef = new WeakReference(view);
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown msg.what: ")).append(message.what).toString());

        case 1: // '\001'
        case 2: // '\002'
            message = (OnboardActivity)onboardActivityRef.get();
            break;
        }
        View view = (View)splashRef.get();
        if (message != null && view != null)
        {
            AnimUtils.hideView(view, true);
        }
    }
}
