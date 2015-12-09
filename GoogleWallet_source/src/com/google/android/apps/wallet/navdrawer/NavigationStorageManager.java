// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import com.google.android.apps.wallet.datastore.KeyValueStore;
import com.google.android.apps.wallet.rpc.persistence.RpcResponseCache;

public class NavigationStorageManager extends RpcResponseCache
{

    NavigationStorageManager(KeyValueStore keyvaluestore)
    {
        super(keyvaluestore);
    }
}
