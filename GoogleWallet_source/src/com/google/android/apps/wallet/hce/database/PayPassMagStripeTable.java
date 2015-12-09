// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.apps.wallet.hce.emv.paypass.PayPassMagStripe;
import com.google.android.apps.wallet.hce.emv.paypass.PayPassPersonalization;
import com.google.android.apps.wallet.hce.iso7816.Aid;
import com.google.android.apps.wallet.hce.util.Hex;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.wallet.common.hce.emv.paypass.PayPassCrypto;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.hce.database:
//            AbstractDatabaseTable, RotatingAtcTable, HcePaymentAppletWithRowKey, HceWalletDatabaseHelper

public class PayPassMagStripeTable extends AbstractDatabaseTable
{

    private static final String SELECT_ALL;
    private static final String TAG = com/google/android/apps/wallet/hce/database/PayPassMagStripeTable.getSimpleName();
    private final RotatingAtcTable atcTable;

    public PayPassMagStripeTable(RotatingAtcTable rotatingatctable, HceWalletDatabaseHelper hcewalletdatabasehelper)
    {
        super("HcePpms", hcewalletdatabasehelper);
        atcTable = rotatingatctable;
    }

    private static String atcColumnsToSelect(String as[])
    {
        int i = 0;
        StringBuilder stringbuilder;
        boolean flag;
        if (as.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        stringbuilder = new StringBuilder();
        for (int j = as.length; i < j; i++)
        {
            String s = as[i];
            stringbuilder.append("AtcTable");
            stringbuilder.append('.');
            stringbuilder.append(s);
            stringbuilder.append(',');
        }

        stringbuilder.deleteCharAt(stringbuilder.length() - 1);
        return stringbuilder.toString();
    }

    private static PayPassPersonalization buildPayPassPersonalization(Cursor cursor)
        throws GeneralSecurityException
    {
        byte abyte0[] = getBytes(cursor, "ivCvc3Track1");
        byte abyte1[] = getBytes(cursor, "ivCvc3Track2");
        Object obj = PayPassCrypto.makeWithIvs(getBytes(cursor, "kdcvc3"), abyte0, abyte1);
        obj = PayPassPersonalization.newBuilder().setApplicationPriorityIndicator(getByte(cursor, "appPriority")).setIssuerCodeTableIndex(getByte(cursor, "issuerCode")).setAip(getBytes(cursor, "aip")).setAfl(getBytes(cursor, "afl")).setAvn(getShort(cursor, "avn")).setPcvc3Track1(getBytes(cursor, "pcvc3Track1")).setPunatcTrack1(getBytes(cursor, "punatcTrack1")).setTrack1Data(getBytes(cursor, "track1data")).setNatcTrack1(getByte(cursor, "natcTrack1")).setPcvc3Track2(getBytes(cursor, "pcvc3Track2")).setPunatcTrack2(getBytes(cursor, "punatcTrack2")).setTrack2Data(getBytes(cursor, "track2data")).setNatcTrack2(getByte(cursor, "natcTrack2")).setPayPassCrypto(((PayPassCrypto) (obj)));
        int i = cursor.getColumnIndexOrThrow("udol");
        if (!cursor.isNull(i))
        {
            ((com.google.android.apps.wallet.hce.emv.paypass.PayPassPersonalization.Builder) (obj)).setUdol(Hex.decode(cursor.getString(i)));
        }
        return ((com.google.android.apps.wallet.hce.emv.paypass.PayPassPersonalization.Builder) (obj)).build();
    }

    public static void createTable(SQLiteDatabase sqlitedatabase)
    {
        WLog.ifmt(TAG, "createTable", new Object[0]);
        sqlitedatabase.execSQL(String.format("create table %s (%s integer primary key, %s integer references %s(%s) ON UPDATE CASCADE ON DELETE CASCADE, %s integer, %s integer, %s text, %s text, %s integer, %s text, %s text, %s text, %s integer, %s text, %s text, %s text, %s integer, %s text, %s text, %s text, %s text, %s integer, %s integer)", new Object[] {
            "HcePpms", "_id", "atcKey", "AtcTable", "_id", "appPriority", "issuerCode", "aip", "afl", "avn", 
            "pcvc3Track1", "punatcTrack1", "track1data", "natcTrack1", "pcvc3Track2", "punatcTrack2", "track2data", "natcTrack2", "udol", "kdcvc3", 
            "ivCvc3Track1", "ivCvc3Track2", "sequenceCounter", "transactionSuccess"
        }));
    }

    private PayPassMagStripe ppmsFromCursor(Cursor cursor)
        throws GeneralSecurityException
    {
        com.google.android.apps.wallet.hce.emv.RotatingAtc rotatingatc = atcTable.getAtc(cursor);
        cursor = buildPayPassPersonalization(cursor);
        return new PayPassMagStripe(Aid.MASTERCARD_AID_PREFIX_CREDIT_OR_DEBIT, rotatingatc, cursor);
    }

    final List getAllPpms()
        throws GeneralSecurityException
    {
        Cursor cursor = helper.getWritableDatabase().rawQuery(SELECT_ALL, null);
        Object obj;
        obj = Lists.newArrayListWithCapacity(cursor.getCount());
        long l;
        for (; cursor.moveToNext(); ((List) (obj)).add(new HcePaymentAppletWithRowKey(ppmsFromCursor(cursor), l)))
        {
            l = getLong(cursor, "_id");
        }

        break MISSING_BLOCK_LABEL_73;
        obj;
        cursor.close();
        throw obj;
        cursor.close();
        return ((List) (obj));
    }

    final long insert(PayPassMagStripe paypassmagstripe)
    {
        ContentValues contentvalues;
        Object obj;
        obj = paypassmagstripe.getPayPassPersonalization();
        contentvalues = new ContentValues();
        contentvalues.putNull("_id");
        contentvalues.put("appPriority", Byte.valueOf(((PayPassPersonalization) (obj)).getApplicationPriorityIndicator()));
        contentvalues.put("issuerCode", Byte.valueOf(((PayPassPersonalization) (obj)).getIssuerCodeTableIndex()));
        if (((PayPassPersonalization) (obj)).getAip() != null)
        {
            contentvalues.put("aip", Hex.encode(((PayPassPersonalization) (obj)).getAip()));
        }
        if (((PayPassPersonalization) (obj)).getAfl() != null)
        {
            contentvalues.put("afl", Hex.encode(((PayPassPersonalization) (obj)).getAfl()));
        }
        contentvalues.put("avn", Short.valueOf(((PayPassPersonalization) (obj)).getAvn()));
        if (((PayPassPersonalization) (obj)).getPcvc3Track1() != null)
        {
            contentvalues.put("pcvc3Track1", Hex.encode(((PayPassPersonalization) (obj)).getPcvc3Track1()));
        }
        if (((PayPassPersonalization) (obj)).getPunatcTrack1() != null)
        {
            contentvalues.put("punatcTrack1", Hex.encode(((PayPassPersonalization) (obj)).getPunatcTrack1()));
        }
        contentvalues.put("track1data", Hex.encode(((PayPassPersonalization) (obj)).getTrack1Data()));
        contentvalues.put("natcTrack1", Byte.valueOf(((PayPassPersonalization) (obj)).getNatcTrack1()));
        if (((PayPassPersonalization) (obj)).getPcvc3Track2() != null)
        {
            contentvalues.put("pcvc3Track2", Hex.encode(((PayPassPersonalization) (obj)).getPcvc3Track2()));
        }
        if (((PayPassPersonalization) (obj)).getPunatcTrack2() != null)
        {
            contentvalues.put("punatcTrack2", Hex.encode(((PayPassPersonalization) (obj)).getPunatcTrack2()));
        }
        contentvalues.put("track2data", Hex.encode(((PayPassPersonalization) (obj)).getTrack2Data()));
        contentvalues.put("natcTrack2", Byte.valueOf(((PayPassPersonalization) (obj)).getNatcTrack2()));
        byte abyte0[] = ((PayPassPersonalization) (obj)).getUdol();
        if (abyte0 != null)
        {
            contentvalues.put("udol", Hex.encode(abyte0));
        }
        obj = ((PayPassPersonalization) (obj)).getPayPassCrypto();
        if (obj != null)
        {
            contentvalues.put("kdcvc3", Hex.encode(((PayPassCrypto) (obj)).getKdCvc3()));
            contentvalues.put("ivCvc3Track1", Hex.encode(((PayPassCrypto) (obj)).getIvCvc3Track1()));
            contentvalues.put("ivCvc3Track2", Hex.encode(((PayPassCrypto) (obj)).getIvCvc3Track2()));
        }
        obj = helper.getWritableDatabase();
        ((SQLiteDatabase) (obj)).beginTransaction();
        long l;
        paypassmagstripe = paypassmagstripe.getAtc();
        contentvalues.put("atcKey", Long.valueOf(atcTable.insert(paypassmagstripe)));
        l = ((SQLiteDatabase) (obj)).insertOrThrow("HcePpms", null, contentvalues);
        ((SQLiteDatabase) (obj)).setTransactionSuccessful();
        ((SQLiteDatabase) (obj)).endTransaction();
        return l;
        paypassmagstripe;
        ((SQLiteDatabase) (obj)).endTransaction();
        throw paypassmagstripe;
    }

    final void nextAtcs(Collection collection)
    {
        SQLiteDatabase sqlitedatabase;
        Object obj;
        String as[];
        int k;
        k = collection.size();
        Character acharacter[] = new Character[k];
        Arrays.fill(acharacter, Character.valueOf('?'));
        obj = String.format("%s in (%s)", new Object[] {
            "_id", Joiner.on(',').join(acharacter)
        });
        as = new String[k];
        int i = 0;
        for (collection = collection.iterator(); collection.hasNext();)
        {
            as[i] = ((Long)collection.next()).toString();
            i++;
        }

        sqlitedatabase = helper.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        collection = new Long[k];
        String s = NO_GROUP_BY;
        String s1 = NO_HAVING;
        String s2 = NO_ORDER_BY;
        obj = sqlitedatabase.query("HcePpms", new String[] {
            "atcKey"
        }, ((String) (obj)), as, s, s1, s2);
        int j;
        boolean flag;
        if (((Cursor) (obj)).getCount() == k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "cursor.getCount() %s; numrows %s", new Object[] {
            Integer.valueOf(((Cursor) (obj)).getCount()), Integer.valueOf(k)
        });
        j = 0;
_L2:
        flag = ((Cursor) (obj)).moveToNext();
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        collection[j] = Long.valueOf(getLong(((Cursor) (obj)), "atcKey"));
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        ((Cursor) (obj)).close();
        atcTable.nextAtcs(collection);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        collection;
_L6:
        ((Cursor) (obj)).close();
        throw collection;
        collection;
_L4:
        sqlitedatabase.endTransaction();
        throw collection;
        collection;
        if (true) goto _L4; else goto _L3
_L3:
        collection;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        SELECT_ALL = String.format("SELECT %s.*, %s FROM %s INNER JOIN %s ON %s.%s = %s.%s", new Object[] {
            "HcePpms", atcColumnsToSelect(RotatingAtcTable.NON_ID_COLUMNS), "HcePpms", "AtcTable", "HcePpms", "atcKey", "AtcTable", "_id"
        });
    }
}
