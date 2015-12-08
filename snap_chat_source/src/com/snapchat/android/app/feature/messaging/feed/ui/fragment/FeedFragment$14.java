// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import android.view.View;
import android.view.animation.TranslateAnimation;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedFragment

final class b
    implements Runnable
{

    private View a;
    private TranslateAnimation b;

    public final void run()
    {
        a.startAnimation(b);
    }

    Q(View view, TranslateAnimation translateanimation)
    {
        a = view;
        b = translateanimation;
        super();
    }
}
