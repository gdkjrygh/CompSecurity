// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.storage;

import com.apptentive.android.sdk.model.Payload;

public interface PayloadStore
{

    public transient abstract void addPayload(Payload apayload[]);

    public abstract void deleteAllPayloads();

    public abstract void deletePayload(Payload payload);

    public abstract Payload getOldestUnsentPayload();
}
