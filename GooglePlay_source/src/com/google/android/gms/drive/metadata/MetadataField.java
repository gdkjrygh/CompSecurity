// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public interface MetadataField
{

    public abstract void copyToBundle(DataHolder dataholder, MetadataBundle metadatabundle, int i, int j);

    public abstract Object getFromBundle(Bundle bundle);

    public abstract Object getFromDataHolder(DataHolder dataholder, int i, int j);

    public abstract String getName();

    public abstract void putInBundle(Object obj, Bundle bundle);
}
