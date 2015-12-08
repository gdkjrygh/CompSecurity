// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.service;


public interface Callback
{

    public abstract void onComplete(Object obj);

    public abstract void onFailure(Throwable throwable);
}
