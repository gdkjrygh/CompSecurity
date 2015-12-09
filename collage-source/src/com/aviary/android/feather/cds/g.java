// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.utils.c;
import com.aviary.android.feather.common.utils.d;

// Referenced classes of package com.aviary.android.feather.cds:
//            o, q, r, c

final class g extends SQLiteOpenHelper
{

    private static final com.aviary.android.feather.common.a.a.c a;
    private static Context b;
    private static volatile g c;

    g(Context context)
    {
        super(context, "aviarycds.sqlite", null, 6);
        b = context;
    }

    private int a(String s, boolean flag)
    {
        a.c("getTrayFeaturedCount: packType: %s, freeOnly: %b", new Object[] {
            s, Boolean.valueOf(flag)
        });
        StringBuilder stringbuilder = (new StringBuilder()).append("SELECT COUNT(pack_id) as _count  FROM packs_table, content_table WHERE pack_id=content_packId AND pack_visible=1 AND pack_finishedDownloading=1");
        String s1;
        int i;
        if (flag)
        {
            s1 = " AND content_isFree=1";
        } else
        {
            s1 = "";
        }
        s = stringbuilder.append(s1).append(" AND ").append("content_iconPath").append(" NOT NULL").append(" AND ").append("content_purchased").append("=0").append(" AND ").append("pack_type").append("='").append(s).append("' ").append(" ORDER BY ").append("pack_displayOrder").append(" ASC").toString();
        s = getReadableDatabase().rawQuery(s, null);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_170;
        }
        i = s.getInt(0);
        com.aviary.android.feather.common.utils.d.a(s);
        return i;
        com.aviary.android.feather.common.utils.d.a(s);
_L2:
        return 0;
        Object obj;
        obj;
        a.d((new StringBuilder()).append("handled: ").append(obj).toString());
        com.aviary.android.feather.common.utils.d.a(s);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        com.aviary.android.feather.common.utils.d.a(s);
        throw obj;
    }

    static long a(String s, ContentValues contentvalues, SQLiteDatabase sqlitedatabase)
    {
        long l = sqlitedatabase.insertWithOnConflict(s, null, contentvalues, 4);
        if (l == -1L)
        {
            a.c((new StringBuilder()).append("Error occurred inserting ").append(contentvalues.toString()).append(" into ").append(s).toString());
        }
        return l;
    }

    public static g a(Context context)
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        com/aviary/android/feather/cds/g;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = new g(context);
        }
        com/aviary/android/feather/cds/g;
        JVM INSTR monitorexit ;
_L2:
        return c;
        context;
        com/aviary/android/feather/cds/g;
        JVM INSTR monitorexit ;
        throw context;
    }

    private int c(String s)
    {
        int i;
        i = 0;
        s = (new StringBuilder()).append("SELECT count(pack_id) as _count FROM packs_table, content_table WHERE pack_id=content_packId AND pack_type='").append(s).append("'").append(" AND ").append("content_purchased").append("=1").append(" AND ").append("content_contentPath").append(" NOT NULL").toString();
        s = getReadableDatabase().rawQuery(s, null);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_94;
        }
        i = s.getInt(0);
        com.aviary.android.feather.common.utils.d.a(s);
        return i;
        com.aviary.android.feather.common.utils.d.a(s);
        return 0;
        Object obj;
        obj;
        a.d((new StringBuilder()).append("handled: ").append(obj).toString());
        com.aviary.android.feather.common.utils.d.a(s);
        return 0;
        obj;
        com.aviary.android.feather.common.utils.d.a(s);
        throw obj;
    }

    int a(int i, int j)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("subscriptions_content_purchased", Integer.valueOf(j));
        return getWritableDatabase().update("subscriptions_content_table", contentvalues, "subscriptions_subscription_id=?", new String[] {
            String.valueOf(i)
        });
    }

    int a(long l)
    {
        return getWritableDatabase().delete("packs_download_table", "download_packId=?", new String[] {
            String.valueOf(l)
        });
    }

    int a(long l, int i)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("download_status", Integer.valueOf(i));
        return getWritableDatabase().update("packs_download_table", contentvalues, "download_refId=?", new String[] {
            String.valueOf(l)
        });
    }

    int a(long l, long l1, int i, String s)
    {
        a.c("updatePackContentPurchasedstatus: %d, content: %s", new Object[] {
            Long.valueOf(l), s
        });
        ContentValues contentvalues = new ContentValues();
        if (s != null)
        {
            contentvalues.put("content_contentPath", s);
            contentvalues.put("content_installDate", com.aviary.android.feather.common.utils.c.a(System.currentTimeMillis()));
        } else
        {
            contentvalues.putNull("content_contentPath");
        }
        contentvalues.put("content_purchased", Integer.valueOf(i));
        return getWritableDatabase().update("content_table", contentvalues, "content_id=? AND content_packId=?", new String[] {
            String.valueOf(l1), String.valueOf(l)
        });
    }

    int a(long l, long l1, ContentValues contentvalues)
    {
        return a(l, l1, contentvalues, getWritableDatabase());
    }

    int a(long l, long l1, ContentValues contentvalues, SQLiteDatabase sqlitedatabase)
    {
        return sqlitedatabase.update("content_table", contentvalues, "content_id=? AND content_packId=?", new String[] {
            String.valueOf(l1), String.valueOf(l)
        });
    }

    int a(long l, ContentValues contentvalues)
    {
        return a(l, contentvalues, getWritableDatabase());
    }

    int a(long l, ContentValues contentvalues, SQLiteDatabase sqlitedatabase)
    {
        return sqlitedatabase.update("packs_table", contentvalues, "pack_id=?", new String[] {
            String.valueOf(l)
        });
    }

    int a(SQLiteDatabase sqlitedatabase, String s, String s1, String as[])
    {
        return sqlitedatabase.delete(s, s1, as);
    }

    long a(ContentValues contentvalues)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = getWritableDatabase();
        sqlitedatabase.beginTransaction();
        long l;
        a(sqlitedatabase, "permission_table", ((String) (null)), ((String []) (null)));
        l = a("permission_table", contentvalues, sqlitedatabase);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return l;
        contentvalues;
        sqlitedatabase.setTransactionSuccessful();
        throw contentvalues;
    }

    long a(String s, ContentValues contentvalues)
    {
        return a(s, contentvalues, getWritableDatabase());
    }

    Context a()
    {
        return b;
    }

    Cursor a(int i, String as[])
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("packs_table JOIN content_table ON (packs_table.pack_id = content_table.content_packId)");
        return sqlitequerybuilder.query(getReadableDatabase(), as, "packs_table.pack_id=?", new String[] {
            String.valueOf(i)
        }, null, null, null);
    }

    Cursor a(long l, String as[])
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("items_table");
        return sqlitequerybuilder.query(getReadableDatabase(), as, "item_id=?", new String[] {
            String.valueOf(l)
        }, null, null, null);
    }

    Cursor a(String s)
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("subscription_table");
        return sqlitequerybuilder.query(getReadableDatabase(), null, "subscription_identifier=?", new String[] {
            s
        }, null, null, null);
    }

    Cursor a(String s, int i, boolean flag, boolean flag1)
    {
        int j = a(s, flag);
        int k = c(s);
        Object obj;
        StringBuffer stringbuffer;
        StringBuilder stringbuilder;
        boolean flag2;
        boolean flag3;
        if (j > 1 || k > 1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (j > 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        a.c("getTray, packType: %s, featuredCount: %d, freeOnly: %b, showItems: %b", new Object[] {
            s, Integer.valueOf(i), Boolean.valueOf(flag), Boolean.valueOf(flag1)
        });
        a.b("availableFeatured: %d", new Object[] {
            Integer.valueOf(j)
        });
        a.b("installedCount: %d", new Object[] {
            Integer.valueOf(k)
        });
        stringbuffer = new StringBuffer();
        if (flag2)
        {
            stringbuffer.append("SELECT -1 as _id, -1 as _order, '' as packagename, '' as identifier, 5 as type, '' as displayName, '' as path, '' as installDate, 0 as isFree UNION ALL ");
        }
        stringbuilder = (new StringBuilder()).append(" SELECT * from ( SELECT * from (SELECT pack_id as _id, pack_displayOrder as _order, pack_identifier as packagename, pack_identifier as identifier, 1 as type, content_displayName as displayName, content_iconPath as path, content_installDate as installDate, content_isFree as isFree FROM packs_table, content_table WHERE pack_id=content_packId AND pack_visible=1 AND pack_finishedDownloading=1");
        if (flag)
        {
            obj = " AND content_isFree=1";
        } else
        {
            obj = "";
        }
        stringbuffer.append(stringbuilder.append(((String) (obj))).append("\tAND ").append("content_iconPath").append(" NOT NULL ").append(" AND ").append("content_purchased").append("=0 ").append(" AND ").append("pack_type").append("=? ").append(" ORDER BY ").append("pack_displayOrder").append(" ASC LIMIT ").append(i).append(" )").append(" ORDER BY ").append("_order").append(" DESC )").toString());
        if (flag3)
        {
            stringbuffer.append(" UNION ALL SELECT -1 as _id, -1 as _order, '' as packagename, '' as identifier, 3 as type, '' as displayName, '' as path, '' as installDate, 0 as isFree");
        }
        stringbuffer.append(" UNION ALL SELECT * from (SELECT DISTINCT pack_id as _id, (pack_id * 10000) as _order, pack_identifier as packagename, pack_identifier as identifier, 2 as type, content_displayName as displayName, content_iconPath as path, content_installDate as installDate, content_isFree as isFree FROM packs_table, content_table, items_table WHERE pack_id=content_packId  AND pack_id=item_packId AND pack_type=? \tAND content_purchased=1 \tAND content_contentPath NOT NULL");
        if (flag1)
        {
            stringbuffer.append(" UNION ALL SELECT item_id as _id, ((pack_id * 10000) + item_id ) as _order, pack_identifier as packagename, item_identifier as identifier, 0 as type, item_displayName as displayName, content_contentPath as path, content_installDate as installDate, content_isFree as isFree FROM packs_table, content_table, items_table WHERE pack_id=content_packId AND pack_id=item_packId AND pack_type=? \tAND content_purchased=1  AND content_contentPath NOT NULL  ORDER BY installDate DESC, _order ASC)");
        } else
        {
            stringbuffer.append(" ORDER BY installDate DESC, _order ASC)");
        }
        if (flag3)
        {
            stringbuffer.append(" UNION ALL SELECT -1 as _id, -1 as _order, '' as packagename, '' as identifier, 4 as type, '' as displayName, '' as path, '' as installDate, 0 as isFree");
        }
        if (flag2)
        {
            stringbuffer.append(" UNION ALL SELECT -1 as _id, -1 as _order, '' as packagename, '' as identifier, 6 as type, '' as displayName, '' as path, '' as installDate, 0 as isFree");
        }
        if (flag1)
        {
            obj = new String[3];
            obj[0] = s;
            obj[1] = s;
            obj[2] = s;
            s = ((String) (obj));
        } else
        {
            String as[] = new String[2];
            as[0] = s;
            as[1] = s;
            s = as;
        }
        return getReadableDatabase().rawQuery(stringbuffer.toString(), s);
    }

    Cursor a(String s, String s1, String as[], String s2, String as1[])
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("packs_table, content_table, items_table");
        sqlitequerybuilder.appendWhere("pack_id= content_packId AND item_packId=pack_id");
        sqlitequerybuilder.appendWhere(" AND pack_identifier=");
        sqlitequerybuilder.appendWhereEscapeString(s);
        sqlitequerybuilder.appendWhere(" AND item_identifier=");
        sqlitequerybuilder.appendWhereEscapeString(s1);
        return sqlitequerybuilder.query(getReadableDatabase(), as, s2, as1, null, null, null);
    }

    Cursor a(String s, String as[])
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("packs_download_table");
        return sqlitequerybuilder.query(getReadableDatabase(), as, "download_packId=?", new String[] {
            String.valueOf(s)
        }, null, null, null);
    }

    Cursor a(String s, String as[], String s1)
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("packs_table JOIN content_table ON (packs_table.pack_id = content_table.content_packId)");
        return sqlitequerybuilder.query(getReadableDatabase(), as, "(content_purchased=0 OR ifnull(length(content_contentPath), 0) < 1 ) AND pack_type=? AND pack_markedForDeletion=0", new String[] {
            s
        }, null, null, s1);
    }

    Cursor a(String s, String as[], String s1, String as1[], String s2)
    {
        s1 = new SQLiteQueryBuilder();
        s1.setTables("packs_table JOIN content_table ON (packs_table.pack_id = content_table.content_packId)");
        s1.appendWhere("pack_finishedDownloading=1 AND ");
        s1.appendWhere((new StringBuilder()).append("pack_type='").append(s).append("' AND ").toString());
        s1.appendWhere("(pack_visible=1 OR (pack_visible=0 AND content_purchased=1)) AND ");
        s1.appendWhere("pack_markedForDeletion=0 ");
        return s1.query(getReadableDatabase(), as, null, null, null, null, s2);
    }

    public Cursor a(boolean flag, int i)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (flag)
        {
            stringbuffer.append("SELECT * FROM ( SELECT pack_id as _id, pack_identifier as identifier, pack_type as packType, content_displayName as displayName, content_iconPath as iconPath, content_isFree as free, content_purchased as purchased, content_contentPath as contentPath, '' as featuredIconPath, 0 as type FROM packs_table JOIN content_table ON ( packs_table.pack_id = content_table.content_packId) WHERE pack_type='effect' AND pack_visible=1 AND pack_finishedDownloading=1 AND pack_markedForDeletion=0 ORDER BY content_purchased ASC, pack_displayOrder ASC LIMIT 0,1 )");
            stringbuffer.append(" UNION ALL ");
        }
        stringbuffer.append("SELECT * FROM (  SELECT -1 as _id, '' as identifier, 'effect' as packType, 'Featured Effects' as displayName, '' as iconPath, '' as free, '' as purchased, '' as contentPath, '' as featuredIconPath, 1 as type)");
        stringbuffer.append(" UNION ALL ");
        stringbuffer.append((new StringBuilder()).append("SELECT * FROM ( SELECT pack_id as _id, pack_identifier as identifier, pack_type as packType, content_displayName as displayName, content_iconPath as iconPath, content_isFree as free, content_purchased as purchased, content_contentPath as contentPath, '' as featuredIconPath, 2 as type FROM packs_table JOIN content_table ON ( packs_table.pack_id = content_table.content_packId) WHERE pack_type='effect' AND pack_visible=1 AND pack_finishedDownloading=1 AND pack_markedForDeletion=0 ORDER BY content_purchased ASC, pack_displayOrder ASC LIMIT ").append(0).append(",").append(i).append(" )").toString());
        stringbuffer.append(" UNION ALL ");
        stringbuffer.append("SELECT * FROM (  SELECT -1 as _id, '' as identifier, 'frame' as packType, 'Featured Frames' as displayName, '' as iconPath, '' as free, '' as purchased, '' as contentPath, '' as featuredIconPath, 1 as type)");
        stringbuffer.append(" UNION ALL ");
        stringbuffer.append((new StringBuilder()).append("SELECT * FROM ( SELECT pack_id as _id, pack_identifier as identifier, pack_type as packType, content_displayName as displayName, content_iconPath as iconPath, content_isFree as free, content_purchased as purchased, content_contentPath as contentPath, '' as featuredIconPath, 2 as type FROM packs_table JOIN content_table ON ( packs_table.pack_id = content_table.content_packId) WHERE pack_type='frame' AND pack_visible=1 AND pack_finishedDownloading=1 AND pack_markedForDeletion=0 ORDER BY content_purchased ASC, pack_displayOrder ASC LIMIT 0,").append(i).append(" )").toString());
        stringbuffer.append(" UNION ALL ");
        stringbuffer.append("SELECT * FROM (  SELECT -1 as _id, '' as identifier, 'sticker' as packType, 'Featured Stickers' as displayName, '' as iconPath, '' as free, '' as purchased, '' as contentPath, '' as featuredIconPath, 1 as type)");
        stringbuffer.append(" UNION ALL ");
        stringbuffer.append((new StringBuilder()).append("SELECT * FROM ( SELECT pack_id as _id, pack_identifier as identifier, pack_type as packType, content_displayName as displayName, content_iconPath as iconPath, content_isFree as free, content_purchased as purchased, content_contentPath as contentPath, '' as featuredIconPath, 2 as type FROM packs_table JOIN content_table ON ( packs_table.pack_id = content_table.content_packId) WHERE pack_type='sticker' AND pack_visible=1 AND pack_finishedDownloading=1 AND pack_markedForDeletion=0 ORDER BY content_purchased ASC, pack_displayOrder ASC LIMIT 0,").append(i).append(" )").toString());
        return getReadableDatabase().rawQuery(stringbuffer.toString(), null);
    }

    Cursor a(String as[])
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("version_table");
        return sqlitequerybuilder.query(getReadableDatabase(), as, null, null, null, null, "version_id DESC");
    }

    Cursor a(String as[], String s)
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("packs_table JOIN content_table ON (packs_table.pack_id = content_table.content_packId)");
        return sqlitequerybuilder.query(getReadableDatabase(), as, "content_purchased=1  AND pack_markedForDeletion=0 AND content_contentPath NOT NULL ", null, null, null, s);
    }

    Cursor a(String as[], String s, String as1[])
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("packs_table JOIN content_table ON (packs_table.pack_id = content_table.content_packId)");
        return sqlitequerybuilder.query(getReadableDatabase(), as, s, as1, null, null, null);
    }

    Cursor a(String as[], String s, String as1[], String s1)
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("subscription_table");
        return sqlitequerybuilder.query(getReadableDatabase(), as, s, as1, null, null, s1);
    }

    int b(long l)
    {
        return getWritableDatabase().delete("packs_table", "pack_id=?", new String[] {
            String.valueOf(l)
        });
    }

    int b(long l, int i)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("content_downloadRequested", Integer.valueOf(i));
        return getWritableDatabase().update("content_table", contentvalues, "content_packId=?", new String[] {
            String.valueOf(l)
        });
    }

    int b(long l, long l1, ContentValues contentvalues)
    {
        return getWritableDatabase().update("messages_content_table", contentvalues, "msgcnt_messageId=? AND msgcnt_id=?", new String[] {
            String.valueOf(l), String.valueOf(l1)
        });
    }

    int b(long l, ContentValues contentvalues)
    {
        return getWritableDatabase().update("messages_table", contentvalues, "msg_id=?", new String[] {
            String.valueOf(l)
        });
    }

    Cursor b(int i, String as[])
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("packs_table JOIN items_table ON (packs_table.pack_id = items_table.item_packId)");
        return sqlitequerybuilder.query(getReadableDatabase(), as, "pack_id=?", new String[] {
            String.valueOf(i)
        }, null, null, null);
    }

    Cursor b(long l, String as[])
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("packs_table");
        return sqlitequerybuilder.query(getReadableDatabase(), as, "pack_id=?", new String[] {
            String.valueOf(l)
        }, null, null, null);
    }

    Cursor b(String s)
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("subscriptions_content_table");
        return sqlitequerybuilder.query(getReadableDatabase(), null, (new StringBuilder()).append("subscriptions_content_purchased=1 AND subscriptions_content_unlock_type LIKE '%").append(s).append("%'").toString(), null, null, null, null);
    }

    Cursor b(String s, String as[])
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("packs_download_table");
        return sqlitequerybuilder.query(getReadableDatabase(), as, "download_refId=?", new String[] {
            String.valueOf(s)
        }, null, null, null);
    }

    Cursor b(String s, String as[], String s1)
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("packs_table JOIN content_table ON (packs_table.pack_id = content_table.content_packId)");
        return sqlitequerybuilder.query(getReadableDatabase(), as, "content_purchased=1  AND pack_type=? AND pack_markedForDeletion=0 AND content_contentPath NOT NULL ", new String[] {
            s
        }, null, null, s1);
    }

    Cursor b(String s, String as[], String s1, String as1[], String s2)
    {
        as1 = new SQLiteQueryBuilder();
        as1.setTables("packs_table JOIN content_table ON (packs_table.pack_id = content_table.content_packId)");
        as1.appendWhere("pack_finishedDownloading=1 AND ");
        as1.appendWhere((new StringBuilder()).append("pack_type='").append(s).append("' AND ").toString());
        s = new StringBuilder();
        s.append("pack_visible=0 AND content_purchased=0");
        if (s1 != null)
        {
            s.append(" AND ");
            s.append(s1);
        }
        s.append(" AND ");
        as1.appendWhere(s);
        as1.appendWhere("pack_markedForDeletion=0 ");
        return as1.query(getReadableDatabase(), as, null, null, null, null, s2);
    }

    Cursor b(String as[])
    {
        return getReadableDatabase().query("permission_table", as, null, null, null, null, "perm_id DESC");
    }

    Cursor b(String as[], String s, String as1[])
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("packs_table");
        return sqlitequerybuilder.query(getReadableDatabase(), as, s, as1, null, null, null);
    }

    Cursor b(String as[], String s, String as1[], String s1)
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("subscription_table JOIN subscriptions_content_table ON (subscription_table.subscription_id = subscriptions_content_table.subscriptions_subscription_id)");
        return sqlitequerybuilder.query(getReadableDatabase(), as, s, as1, null, null, s1);
    }

    int c(long l)
    {
        return getWritableDatabase().delete("messages_table", "msg_id=?", new String[] {
            String.valueOf(l)
        });
    }

    int c(long l, int i)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("msgcnt_visited", Integer.valueOf(i));
        return getWritableDatabase().update("messages_content_table", contentvalues, "msgcnt_id=?", new String[] {
            String.valueOf(l)
        });
    }

    int c(long l, long l1, ContentValues contentvalues)
    {
        return getWritableDatabase().update("subscriptions_content_table", contentvalues, "subscriptions_content_id=? AND subscriptions_subscription_id=?", new String[] {
            String.valueOf(l1), String.valueOf(l)
        });
    }

    int c(long l, ContentValues contentvalues)
    {
        return getWritableDatabase().update("subscription_table", contentvalues, "subscription_id=?", new String[] {
            String.valueOf(l)
        });
    }

    Cursor c(long l, String as[])
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("messages_table JOIN messages_content_table ON (messages_table.msg_id = messages_content_table.msgcnt_messageId)");
        return sqlitequerybuilder.query(getReadableDatabase(), as, "msg_id=?", new String[] {
            String.valueOf(l)
        }, null, null, null);
    }

    Cursor c(String s, String as[])
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("packs_table JOIN content_table ON (packs_table.pack_id = content_table.content_packId)");
        return sqlitequerybuilder.query(getReadableDatabase(), as, "packs_table.pack_identifier=?", new String[] {
            s
        }, null, null, null);
    }

    Cursor c(String as[], String s, String as1[])
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("messages_table");
        return sqlitequerybuilder.query(getReadableDatabase(), as, s, as1, null, null, null);
    }

    Cursor d(String s, String as[])
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("packs_table");
        return sqlitequerybuilder.query(getReadableDatabase(), as, "pack_identifier=?", new String[] {
            s
        }, null, null, null);
    }

    Cursor e(String s, String as[])
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("messages_table");
        return sqlitequerybuilder.query(getReadableDatabase(), as, "msg_identifier=?", new String[] {
            s
        }, null, null, null);
    }

    Cursor f(String s, String as[])
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("messages_table JOIN messages_content_table ON (messages_table.msg_id = messages_content_table.msgcnt_messageId), packs_table, content_table");
        return sqlitequerybuilder.query(getReadableDatabase(), as, "msg_type=? AND msgcnt_visited=0 AND msgcnt_contentPath NOT NULL AND (strftime('%s', datetime('now')) BETWEEN strftime('%s',msgcnt_beginDate) AND strftime('%s', msgcnt_endDate)) AND pack_id=content_packId AND pack_identifier=msgcnt_contentIdentifier AND content_purchased=0", new String[] {
            s
        }, null, null, "msgcnt_beginDate DESC");
    }

    Cursor g(String s, String as[])
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("messages_table JOIN messages_content_table ON (messages_table.msg_id = messages_content_table.msgcnt_messageId), packs_table, content_table");
        return sqlitequerybuilder.query(getReadableDatabase(), as, "msg_type=? AND msgcnt_visited=0 AND msgcnt_contentPath IS NULL AND ( strftime('%s', datetime('now')) BETWEEN strftime('%s',msgcnt_beginDate) AND strftime('%s', msgcnt_endDate) ) AND pack_id=content_packId AND pack_identifier=msgcnt_contentIdentifier AND content_purchased=0", new String[] {
            s
        }, null, null, "msgcnt_beginDate DESC");
    }

    Cursor h(String s, String as[])
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("subscription_table JOIN subscriptions_content_table ON (subscription_table.subscription_id = subscriptions_content_table.subscriptions_subscription_id)");
        return sqlitequerybuilder.query(getReadableDatabase(), as, "subscription_table.subscription_identifier=?", new String[] {
            s
        }, null, null, null);
    }

    public void onConfigure(SQLiteDatabase sqlitedatabase)
    {
        a.b("onConfigure");
        if (!sqlitedatabase.isReadOnly())
        {
            sqlitedatabase.execSQL("PRAGMA foreign_keys=ON;");
            sqlitedatabase.execSQL("PRAGMA encoding=\"UTF-8\";");
            sqlitedatabase.execSQL("PRAGMA page_size=4096;");
            sqlitedatabase.execSQL("PRAGMA cache_size=5000;");
        }
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        a.b("onCreate");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS version_table (version_id INTEGER PRIMARY KEY AUTOINCREMENT, version_versionKey VARCHAR(255) NOT NULL, version_assetsBaseURL VARCHAR(255) NOT NULL );");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS packs_table (pack_id INTEGER PRIMARY KEY AUTOINCREMENT, pack_identifier VARCHAR(255) NOT NULL UNIQUE, pack_type VARCHAR(255) NOT NULL, pack_finishedDownloading INTEGER NOT NULL DEFAULT 0, pack_markedForDeletion INTEGER NOT NULL DEFAULT 0, pack_visible INTEGER NOT NULL DEFAULT 1, pack_displayOrder INTEGER NOT NULL DEFAULT 0 ,pack_creationDate DATETIME DEFAULT (datetime('now','localtime')), pack_versionKey VARCHAR(255) NOT NULL);");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS messages_table (msg_id INTEGER PRIMARY KEY AUTOINCREMENT, msg_type VARCHAR(255) NOT NULL, msg_identifier VARCHAR(255) NOT NULL UNIQUE, msg_versionKey VARCHAR(255) NOT NULL);");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS messages_content_table ( msgcnt_id INTEGER PRIMARY KEY AUTOINCREMENT, msgcnt_messageId INTEGER NOT NULL, msgcnt_contentIdentifier VARCHAR(255), msgcnt_beginDate DATETIME, msgcnt_endDate DATETIME, msgcnt_contentURL TEXT NOT NULL, msgcnt_actionButton VARCHAR(255), msgcnt_dismissButton VARCHAR(255) NOT NULL, msgcnt_layoutStyle VARCHAR(255), msgcnt_paragraph TEXT NOT NULL, msgcnt_showNewBanner INTEGER NOT NULL DEFAULT 1, msgcnt_contentPath TEXT DEFAULT NULL, msgcnt_visited INTEGER NOT NULL DEFAULT 0, msgcnt_title VARCHAR(255),  FOREIGN KEY( msgcnt_messageId ) REFERENCES messages_table( msg_id ) ON DELETE CASCADE );");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS content_table (content_id INTEGER PRIMARY KEY AUTOINCREMENT, content_packId INTEGER NOT NULL, content_contentVersion VARCHAR(255) NOT NULL, content_previewVersion VARCHAR(255) NOT NULL, content_iconVersion VARCHAR(255) NOT NULL,content_previewURL VARCHAR(255) NOT NULL, content_contentURL VARCHAR(255) NOT NULL, content_iconUrl VARCHAR(255) NOT NULL, content_isFree INTEGER DEFAULT 0, content_displayName VARCHAR(255) NOT NULL, content_displayDescription VARCHAR(255), content_downloadRequested INTEGER NOT NULL DEFAULT 0, content_purchased INTEGER NOT NULL DEFAULT 0, content_previewPath VARCHAR(255), content_contentPath VARCHAR(255), content_iconPath VARCHAR(255), content_iconNeedDownload INTEGER NOT NULL DEFAULT 0, content_previewNeedDownload INTEGER NOT NULL DEFAULT 0, content_contentNeedDownload INTEGER NOT NULL DEFAULT 0, content_installDate DATETIME NOT NULL DEFAULT (datetime(current_timestamp)), content_numItems INTEGER DEFAULT 0, FOREIGN KEY(content_packId) REFERENCES packs_table(pack_id) ON DELETE CASCADE);");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS items_table (item_id INTEGER PRIMARY KEY AUTOINCREMENT, item_identifier VARCHAR(255) NOT NULL, item_displayName VARCHAR(255), item_contentPath VARCHAR(255), item_options BLOB, item_packId INTEGER NOT NULL, FOREIGN KEY(item_packId) REFERENCES packs_table(pack_id) ON DELETE CASCADE);");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS packs_download_table (downloadId INTEGER PRIMARY KEY AUTOINCREMENT, download_packId INTEGER NOT NULL UNIQUE, download_refId INTEGER, download_status INTEGER DEFAULT 0, FOREIGN KEY(download_packId) REFERENCES packs_table(pack_id) ON DELETE CASCADE);");
        com.aviary.android.feather.cds.o.a(sqlitedatabase);
        com.aviary.android.feather.cds.q.a(sqlitedatabase);
        com.aviary.android.feather.cds.r.a(sqlitedatabase);
        sqlitedatabase.execSQL("CREATE TRIGGER notify_download_finished AFTER UPDATE OF content_iconPath ON content_table BEGIN UPDATE packs_table SET pack_finishedDownloading = 1 WHERE packs_table.pack_id = OLD.content_packId; END;");
    }

    public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        a.c("onDowngrade from %d to %d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        if (a().deleteDatabase("aviarycds.sqlite"))
        {
            onCreate(sqlitedatabase);
        }
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        a.c("onOpen, isReadOnly: %b", new Object[] {
            Boolean.valueOf(sqlitedatabase.isReadOnly())
        });
        if (!sqlitedatabase.isReadOnly())
        {
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                onConfigure(sqlitedatabase);
            }
            (new com.aviary.android.feather.cds.c(b)).a(sqlitedatabase);
        }
        super.onOpen(sqlitedatabase);
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (sqlitedatabase.isReadOnly())
        {
            a.c("Could not upgrade table, db is read only");
        } else
        {
            a.c("onUpgrade: %d >> %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            });
            if (i <= 3)
            {
                com.aviary.android.feather.cds.o.a(sqlitedatabase);
            }
            if (i <= 4)
            {
                com.aviary.android.feather.cds.q.a(sqlitedatabase);
                com.aviary.android.feather.cds.r.a(sqlitedatabase);
            }
            if (i == 5)
            {
                sqlitedatabase.execSQL("DROP TABLE IF EXISTS subscription_table");
                sqlitedatabase.execSQL("DROP TABLE IF EXISTS subscriptions_content_table");
                com.aviary.android.feather.cds.q.a(sqlitedatabase);
                com.aviary.android.feather.cds.r.a(sqlitedatabase);
                return;
            }
        }
    }

    static 
    {
        a = com.aviary.android.feather.common.a.a.a("CdsDatabaseHelper", com.aviary.android.feather.common.a.a.d.a);
    }
}
