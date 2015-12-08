// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.support.v4.app.FragmentActivity;
import java.io.File;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            SignupDetailsLayout

public static interface 
{

    public abstract FragmentActivity getFragmentActivity();

    public abstract void onSkipUserDetails();

    public abstract void onSubmitUserDetails(String s, File file);
}
