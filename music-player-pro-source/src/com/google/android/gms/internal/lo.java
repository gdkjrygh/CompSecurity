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

public class lo extends j
{

    public lo(int i)
    {
        super("customProperties", Collections.singleton("customProperties"), Arrays.asList(new String[] {
            "customPropertiesExtra"
        }), i);
    }

    protected Object c(DataHolder dataholder, int i, int k)
    {
        return l(dataholder, i, k);
    }

    protected AppVisibleCustomProperties l(DataHolder dataholder, int i, int k)
    {
        return (AppVisibleCustomProperties)dataholder.gV().getSparseParcelableArray("customPropertiesExtra").get(i, AppVisibleCustomProperties.Rd);
    }
}
