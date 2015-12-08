// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.entitymanager;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.apps.wallet.datastore.Column;
import com.google.android.apps.wallet.datastore.Table;
import com.google.android.apps.wallet.datastore.WalletDatabaseHelper;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.base.entitymanager:
//            EntityUtil, EntityId, EntityCursor, TypedCursor

public abstract class AbstractProtoEntityManager
{

    private final WalletDatabaseHelper dbHelper;
    protected final EntityUtil entityUtil;
    protected final Table table;

    public AbstractProtoEntityManager(EntityUtil entityutil, Table table1, WalletDatabaseHelper walletdatabasehelper)
    {
        entityUtil = entityutil;
        table = table1;
        dbHelper = walletdatabasehelper;
    }

    private ContentValues buildRowContentValues(MessageNano messagenano, ContentValues contentvalues)
    {
        EntityId entityid = entityUtil.getId(messagenano);
        ContentValues contentvalues1 = new ContentValues();
        contentvalues1.put(Column.ID.getColumnName(), entityid.toKeyString());
        contentvalues1.put(Column.PROTO.getColumnName(), MessageNano.toByteArray(messagenano));
        if (contentvalues != null)
        {
            contentvalues1.putAll(contentvalues);
        }
        return contentvalues1;
    }

    private Cursor cursorWithOneEntry(Cursor cursor, EntityId entityid)
    {
        if (cursor == null)
        {
            return null;
        }
        cursor.getCount();
        JVM INSTR tableswitch 0 1: default 159
    //                   0 142
    //                   1 150;
           goto _L1 _L2 _L3
_L1:
        int i = cursor.getCount();
        String s = String.valueOf(table.getTableName());
        entityid = entityid.toKeyString();
        throw new IllegalStateException((new StringBuilder(String.valueOf(s).length() + 66 + String.valueOf(entityid).length())).append("Queried table \"").append(s).append("\" for ").append(entityid).append(" and found ").append(i).append(" rows. Expected 0 or 1.").toString());
        entityid;
        if (true)
        {
            cursor.close();
        }
        throw entityid;
_L2:
        cursor.close();
        return null;
_L3:
        cursor.moveToFirst();
        return cursor;
    }

    private Cursor getRowById(EntityId entityid)
    {
        SQLiteDatabase sqlitedatabase = dbHelper.getWritableDatabase();
        String s = table.getTableName();
        String as[] = getTableColumns();
        String s1 = String.valueOf(Column.ID.getColumnName()).concat("=?");
        String s2 = entityid.toKeyString();
        String s3 = String.valueOf(Column.ID.getColumnName()).concat(" ASC");
        return cursorWithOneEntry(sqlitedatabase.query(s, as, s1, new String[] {
            s2
        }, null, null, s3), entityid);
    }

    private TypedCursor getSelectedEntitiesCursor(String s, String as[], String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            s1 = String.valueOf(Column.ID.getColumnName()).concat(" ASC");
        }
        s = dbHelper.getWritableDatabase().query(table.getTableName(), getTableColumns(), s, as, null, null, s1);
        as = new EntityCursor(s, s.getColumnIndexOrThrow(Column.PROTO.getColumnName()), entityUtil);
        return as;
        as;
        if (true)
        {
            s.close();
        }
        throw as;
    }

    private String[] getTableColumns()
    {
        List list = table.getColumns();
        String as[] = new String[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            as[i] = ((Column)list.get(i)).getColumnName();
        }

        return as;
    }

    private void persist(MessageNano messagenano, ContentValues contentvalues)
    {
        EntityId entityid;
        entityid = entityUtil.getId(messagenano);
        contentvalues = buildRowContentValues(messagenano, contentvalues);
        messagenano = dbHelper.getWritableDatabase();
        messagenano.beginTransaction();
        if (messagenano.update(table.getTableName(), contentvalues, String.valueOf(Column.ID.getColumnName()).concat("=?"), new String[] {
    entityid.toKeyString()
}) == 0)
        {
            messagenano.insertOrThrow(table.getTableName(), null, contentvalues);
        }
        messagenano.setTransactionSuccessful();
        messagenano.endTransaction();
        return;
        contentvalues;
        messagenano.endTransaction();
        throw contentvalues;
    }

    public final boolean delete(MessageNano messagenano)
    {
        messagenano = entityUtil.getId(messagenano);
        return dbHelper.getWritableDatabase().delete(table.getTableName(), String.valueOf(Column.ID.getColumnName()).concat("=?"), new String[] {
            messagenano.toKeyString()
        }) > 0;
    }

    public final void deleteAllEntities()
    {
        dbHelper.getWritableDatabase().delete(table.getTableName(), null, null);
    }

    public final void deleteSelectedEntities(String s, String as[])
    {
        dbHelper.getWritableDatabase().delete(table.getTableName(), s, as);
    }

    public final List getAllEntities()
    {
        TypedCursor typedcursor = getSelectedEntitiesCursor(null, null, null);
        Object obj;
        obj = new ArrayList();
        for (; typedcursor.moveToNext(); ((List) (obj)).add(typedcursor.get())) { }
        break MISSING_BLOCK_LABEL_50;
        obj;
        typedcursor.close();
        throw obj;
        typedcursor.close();
        return ((List) (obj));
    }

    public final TypedCursor getAllEntitiesCursor()
    {
        return getSelectedEntitiesCursor(null, null, null);
    }

    public final MessageNano getEntityById(EntityId entityid)
    {
        entityid = getRowById(entityid);
        if (entityid != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        byte abyte0[] = entityid.getBlob(entityid.getColumnIndexOrThrow(Column.PROTO.getColumnName()));
        entityid.close();
        if (abyte0 == null) goto _L1; else goto _L3
_L3:
        Exception exception;
        try
        {
            entityid = entityUtil.parseFrom(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (EntityId entityid)
        {
            throw new IllegalStateException(entityid);
        }
        return entityid;
        exception;
        entityid.close();
        throw exception;
    }

    public final void insert(MessageNano messagenano)
    {
        SQLiteDatabase sqlitedatabase = dbHelper.getWritableDatabase();
        messagenano = buildRowContentValues(messagenano, newExtraContentValues(messagenano));
        sqlitedatabase.insertOrThrow(table.getTableName(), null, messagenano);
    }

    public ContentValues newExtraContentValues(MessageNano messagenano)
    {
        return new ContentValues();
    }

    public final void persist(MessageNano messagenano)
    {
        persist(messagenano, newExtraContentValues(messagenano));
    }
}
