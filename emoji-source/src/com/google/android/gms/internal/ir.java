// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.j;
import java.util.Arrays;
import java.util.Collections;

public class ir extends j
{

    public ir(int i)
    {
        super("customFileProperties", Collections.emptyList(), Arrays.asList(new String[] {
            "customPropertiesExtra"
        }), i);
    }

    protected Object b(DataHolder dataholder, int i, int k)
    {
        return j(dataholder, i, k);
    }

    protected AppVisibleCustomProperties j(DataHolder dataholder, int i, int k)
    {
        return (AppVisibleCustomProperties)dataholder.eU().getSparseParcelableArray("customPropertiesExtra").get(i, AppVisibleCustomProperties.JN);
    }
}
