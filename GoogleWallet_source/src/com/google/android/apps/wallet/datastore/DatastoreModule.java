// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.datastore;

import com.google.android.apps.wallet.app.filenames.Filenames;

// Referenced classes of package com.google.android.apps.wallet.datastore:
//            KeyValueStore, Table, WalletDatabaseHelper

public class DatastoreModule
{

    public DatastoreModule()
    {
    }

    static String getDatabaseName(String s)
    {
        return Filenames.getWalletDatabaseName(s);
    }

    static KeyValueStore getImageUploadTable(WalletDatabaseHelper walletdatabasehelper)
    {
        return new KeyValueStore(Table.IMAGE_UPLOAD, walletdatabasehelper);
    }

    static KeyValueStore getMetadataTable(WalletDatabaseHelper walletdatabasehelper)
    {
        return new KeyValueStore(Table.METADATA, walletdatabasehelper);
    }

    static KeyValueStore getSyncGenerationNumberTable(WalletDatabaseHelper walletdatabasehelper)
    {
        return new KeyValueStore(Table.SYNC_GENERATION_MANAGER, walletdatabasehelper);
    }
}
