// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.storage;

import com.apptentive.android.sdk.model.StoredFile;

public interface FileStore
{

    public abstract void deleteStoredFile(String s);

    public abstract StoredFile getStoredFile(String s);

    public abstract boolean putStoredFile(StoredFile storedfile);
}
