// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import MT;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android:
//            LandingPageActivity

final class a
    implements android.view.balLayoutListener
{

    private LandingPageActivity a;

    public final void onGlobalLayout()
    {
        a.g.a(new MT());
    }

    tListener(LandingPageActivity landingpageactivity)
    {
        a = landingpageactivity;
        super();
    }
}
