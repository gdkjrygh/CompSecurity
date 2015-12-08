// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;


public interface SyncJob
    extends Runnable
{

    public abstract Exception getException();

    public abstract void onQueued();

    public abstract boolean resultedInAChange();
}
