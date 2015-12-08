// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.event;

import android.os.Bundle;

public class MediaSyncEvent
{

    public final int errorCode;
    public final String errorMessage;
    public final int status;
    public final Bundle syncExtras;
    public final String syncType;

    public MediaSyncEvent(String s, Bundle bundle, int i)
    {
        this(s, bundle, i, -1, null);
        if (i != 1)
        {
            throw new IllegalArgumentException("This MediaSyncEvent constructor should only be called with a successful status.");
        } else
        {
            return;
        }
    }

    public MediaSyncEvent(String s, Bundle bundle, int i, int j, String s1)
    {
        syncType = s;
        syncExtras = bundle;
        status = i;
        errorCode = j;
        errorMessage = s1;
    }
}
