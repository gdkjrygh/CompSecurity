// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;

public class AbstractPeopleCallbacks extends IPeopleCallbacks.Stub
{

    public AbstractPeopleCallbacks()
    {
    }

    public void onBundleLoaded(int i, Bundle bundle, Bundle bundle1)
    {
    }

    public void onDataHolderLoaded(int i, Bundle bundle, DataHolder dataholder)
    {
    }

    public final void onDataHoldersLoaded(int i, Bundle bundle, DataHolder adataholder[])
    {
    }

    public void onParcelFileDescriptorLoaded(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor, Bundle bundle1)
    {
    }

    public final void onParcelFileDescriptorLoaded_old(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor)
    {
        throw new RuntimeException("Shouldn't be called");
    }
}
