// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.support.v4.app.FragmentActivity;
import com.soundcloud.android.profile.BirthdayInfo;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            SignupBasicsLayout

public static interface 
{

    public abstract FragmentActivity getFragmentActivity();

    public abstract void onCancelSignUp();

    public abstract void onShowPrivacyPolicy();

    public abstract void onShowTermsOfUse();

    public abstract void onSignUp(String s, String s1, BirthdayInfo birthdayinfo, String s2);
}
