// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.service;


public interface ServiceCallback
{

    public abstract void onError(String s, Exception exception);

    public abstract void onResult(Object obj);
}
