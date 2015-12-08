// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;

public interface MetadataField
{

    public abstract Object a(DataHolder dataholder, int i, int j);

    public abstract void a(DataHolder dataholder, MetadataBundle metadatabundle, int i, int j);

    public abstract void a(Object obj, Bundle bundle);

    public abstract Object e(Bundle bundle);

    public abstract Collection gC();

    public abstract String getName();
}
