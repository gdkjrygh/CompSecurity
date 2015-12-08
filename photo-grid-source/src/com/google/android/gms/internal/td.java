// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

public interface td
    extends IInterface
{

    public abstract void a(com.google.android.gms.appdatasearch.GetRecentContextCall.Response response);

    public abstract void a(Status status);

    public abstract void a(Status status, ParcelFileDescriptor parcelfiledescriptor);

    public abstract void a(Status status, boolean flag);
}
