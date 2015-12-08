// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.ky;
import com.google.android.gms.internal.pi;

public interface b
    extends IInterface
{

    public abstract void a(int i, Bundle bundle, Bundle bundle1);

    public abstract void a(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor);

    public abstract void a(int i, Bundle bundle, ky ky);

    public abstract void a(int i, pi pi);

    public abstract void a(DataHolder dataholder, String s);

    public abstract void a(DataHolder dataholder, String s, String s1);

    public abstract void aA(Status status);

    public abstract void ch(String s);

    public abstract void ci(String s);

    public abstract void h(int i, Bundle bundle);
}
