// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class BundleSaveState extends android.view.View.BaseSavedState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private Bundle a;

    private BundleSaveState(Parcel parcel)
    {
        super(parcel);
        a = parcel.readBundle();
    }

    BundleSaveState(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public BundleSaveState(Parcelable parcelable)
    {
        super(parcelable);
    }

    public Bundle a()
    {
        return a;
    }

    public void a(Bundle bundle)
    {
        a = bundle;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(a);
    }


    /* member class not found */
    class _cls1 {}

}
