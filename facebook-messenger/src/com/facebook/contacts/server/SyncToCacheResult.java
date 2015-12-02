// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;

public class SyncToCacheResult extends a
    implements Parcelable
{

    public SyncToCacheResult(b b, long l)
    {
        super(b, l);
    }

    public int describeContents()
    {
        return 0;
    }
}
