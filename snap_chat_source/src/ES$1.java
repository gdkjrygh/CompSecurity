// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.snapchat.android.LandingPageActivity;

final class lang.Object
    implements android.view.OnClickListener
{

    private SR a;
    private ES b;

    public final void onClick(View view)
    {
        view = new Ot(a.a());
        ES.b(b).a(com.snapchat.android.analytics.iewEventAnalytics.EndReason.SWIPED_DOWN);
        ((LandingPageActivity)ES.a(b)).onSwitchToChatEvent(view);
    }

    >(ES es, SR sr)
    {
        b = es;
        a = sr;
        super();
    }
}
