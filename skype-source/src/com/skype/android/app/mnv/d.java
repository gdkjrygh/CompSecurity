// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


interface d
{

    public abstract void processAsyncError(Throwable throwable);

    public abstract void processServiceError(ProfileServicesResponse.ProfileError profileerror);

    public abstract void processSuccess(ProfileServicesResponse.ProfileData profiledata);
}
