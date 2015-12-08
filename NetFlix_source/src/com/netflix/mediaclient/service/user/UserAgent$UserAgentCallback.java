// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;


// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserAgent

public static interface 
{

    public abstract void onConnectWithFacebook(int i, String s);

    public abstract void onLoginComplete(int i, String s);

    public abstract void onLogoutComplete(int i);

    public abstract void onPinVerified(boolean flag, int i);
}
