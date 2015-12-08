// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hannesdorfmann.parcelableplease;

import android.os.Parcel;

public interface ParcelBagger
{

    public abstract Object read(Parcel parcel);

    public abstract void write(Object obj, Parcel parcel, int i);
}
