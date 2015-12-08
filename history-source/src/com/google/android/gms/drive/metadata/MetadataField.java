// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public interface MetadataField
{

    public abstract Object a(DataHolder dataholder, int i, int j);

    public abstract void a(DataHolder dataholder, MetadataBundle metadatabundle, int i, int j);

    public abstract void a(Object obj, Bundle bundle);

    public abstract String getName();

    public abstract Object h(Bundle bundle);
}
