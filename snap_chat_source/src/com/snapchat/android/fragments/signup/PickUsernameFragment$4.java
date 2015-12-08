// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.view.View;
import android.widget.EditText;
import com.snapchat.android.analytics.RegistrationAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import js;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            PickUsernameFragment

final class a
    implements android.view.ner
{

    private PickUsernameFragment a;

    public final void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            RegistrationAnalytics registrationanalytics = PickUsernameFragment.g(a);
            js js1;
            if (a.h())
            {
                view = PickUsernameFragment.f(a).getText().toString();
            } else
            {
                view = null;
            }
            js1 = new js();
            js1.usernameSuggestion = view;
            registrationanalytics.mBlizzardEventLogger.a(js1);
            return;
        } else
        {
            PickUsernameFragment.b(a, false);
            return;
        }
    }

    (PickUsernameFragment pickusernamefragment)
    {
        a = pickusernamefragment;
        super();
    }
}
