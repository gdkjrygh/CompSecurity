// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.javabridge.ui.DeviceAccount;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserAgentStateManager

public static interface 
{

    public abstract void fetchAccountData();

    public abstract void initialized(int i);

    public abstract void profileActivated(String s, DeviceAccount deviceaccount);

    public abstract void profileInactive();

    public abstract void readyToSelectProfile();

    public abstract void selectProfileResult(int i);

    public abstract void switchWebUserProfile(String s);

    public abstract void userAccountActivated(DeviceAccount deviceaccount);

    public abstract void userAccountDataResult(int i);

    public abstract void userAccountDeactivated();

    public abstract void userAccountInactive();
}
