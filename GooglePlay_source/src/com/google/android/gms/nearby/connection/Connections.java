// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.connection;

import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface Connections
{

    public static final List APP_COLLECTION_VALUES = Collections.unmodifiableList(arraylist);

    public abstract void stopCrossAppDiscoveryRestricted(GoogleApiClient googleapiclient);

    
    {
        ArrayList arraylist = new ArrayList(2);
        arraylist.add(Integer.valueOf(1));
        arraylist.add(Integer.valueOf(2));
    }
}
