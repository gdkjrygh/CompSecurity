// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.os.Bundle;
import com.soundcloud.android.api.legacy.model.PublicApiUser;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            AuthTaskFragment, SignupVia

public static interface 
{

    public abstract void onAuthTaskComplete(PublicApiUser publicapiuser, SignupVia signupvia, boolean flag, boolean flag1);

    public abstract void onBlocked();

    public abstract void onDeviceConflict(Bundle bundle);

    public abstract void onEmailInvalid();

    public abstract void onEmailTaken();

    public abstract void onError(String s, boolean flag);

    public abstract void onSpam();

    public abstract void onUsernameInvalid(String s);
}
