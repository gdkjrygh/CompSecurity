// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.os.Bundle;

public class SyncFailedException extends Exception
{

    public SyncFailedException(Bundle bundle)
    {
        super((new StringBuilder("Sync failed with result ")).append(bundle.getParcelable("com.soundcloud.android.sync.extra.SYNC_RESULT")).toString());
    }
}
