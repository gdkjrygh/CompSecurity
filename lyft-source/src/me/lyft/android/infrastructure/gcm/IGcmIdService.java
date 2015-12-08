// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.gcm;


public interface IGcmIdService
{

    public abstract String getRegistrationId();

    public abstract void removeStoredRegistrationId();
}
