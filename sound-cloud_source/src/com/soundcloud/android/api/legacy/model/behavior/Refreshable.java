// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model.behavior;


public interface Refreshable
{

    public abstract Refreshable getRefreshableResource();

    public abstract boolean isIncomplete();

    public abstract boolean isStale();
}
