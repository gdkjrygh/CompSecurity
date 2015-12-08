// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.database;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.hce.emv.HcePaymentApplet;
import com.google.android.apps.wallet.hce.emv.paypass.PayPassMagStripe;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import java.io.Closeable;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.hce.database:
//            HceWalletDatabaseHelper, RotatingAtcTable, PayPassMagStripeTable, HcePaymentAppletWithRowKey

public class HceLibraryDatabase
    implements Closeable
{

    private final RotatingAtcTable atcTable;
    private final FeatureManager featureManager;
    private final HceWalletDatabaseHelper hceLibrarySQLiteOpenHelper;
    private final PayPassMagStripeTable ppmsTable;

    public HceLibraryDatabase(HceWalletDatabaseHelper hcewalletdatabasehelper, PayPassMagStripeTable paypassmagstripetable, RotatingAtcTable rotatingatctable, FeatureManager featuremanager)
    {
        hceLibrarySQLiteOpenHelper = hcewalletdatabasehelper;
        featureManager = featuremanager;
        ppmsTable = paypassmagstripetable;
        atcTable = rotatingatctable;
    }

    public void close()
    {
        hceLibrarySQLiteOpenHelper.close();
    }

    public final void delete()
    {
        hceLibrarySQLiteOpenHelper.delete();
    }

    public final List getAllAtcs()
    {
        return atcTable.getAllAtcs();
    }

    public final List getAllPaymentApplets()
        throws GeneralSecurityException
    {
        return ppmsTable.getAllPpms();
    }

    public final HcePaymentApplet getSoleCard()
    {
        boolean flag = true;
        Object obj = getAllPaymentApplets();
        if (((List) (obj)).size() != 1)
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        obj = ((HcePaymentAppletWithRowKey)((List) (obj)).get(0)).getPaymentApplet();
        return ((HcePaymentApplet) (obj));
        GeneralSecurityException generalsecurityexception;
        generalsecurityexception;
        throw Throwables.propagate(generalsecurityexception);
    }

    public final void moveToNextPaymentAppletAtcs(Collection collection)
    {
        if (collection.isEmpty())
        {
            return;
        } else
        {
            ppmsTable.nextAtcs(collection);
            return;
        }
    }

    public final long setSolePpms(PayPassMagStripe paypassmagstripe)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = hceLibrarySQLiteOpenHelper.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        long l;
        ppmsTable.deleteAllRows();
        atcTable.deleteAllRows();
        l = ppmsTable.insert(paypassmagstripe);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return l;
        paypassmagstripe;
        sqlitedatabase.endTransaction();
        throw paypassmagstripe;
    }
}
