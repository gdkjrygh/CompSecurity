// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.table;

import Br;
import Qa;
import TT;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.content.SnapchatProvider;
import com.snapchat.android.database.DataType;
import com.snapchat.android.database.DatabaseHelper;
import com.snapchat.android.database.table.DbTable;
import java.util.Collection;
import java.util.HashMap;
import tA;
import tt;

// Referenced classes of package com.snapchat.android.discover.model.database.table:
//            EditionStatus

public final class EditionChunkTable extends DbTable
{
    public static final class EditionChunkSchema extends Enum
        implements tt
    {

        private static final EditionChunkSchema $VALUES[];
        public static final EditionChunkSchema AD_KEY;
        public static final EditionChunkSchema AD_LINE_ITEM_ID;
        public static final EditionChunkSchema AD_PLACEMENT_ID;
        public static final EditionChunkSchema AD_POSITION;
        public static final EditionChunkSchema AD_TARGETING;
        public static final EditionChunkSchema AD_TYPE;
        public static final EditionChunkSchema AD_UNIT_ID;
        public static final EditionChunkSchema COLOR;
        public static final EditionChunkSchema EDITION_ID;
        public static final EditionChunkSchema HASH;
        public static final EditionChunkSchema ID;
        public static final EditionChunkSchema POSITION;
        public static final EditionChunkSchema STATUS;
        public static final EditionChunkSchema URL;
        private String a;
        private DataType b;
        private String c;

        static String a(EditionChunkSchema editionchunkschema)
        {
            return editionchunkschema.a;
        }

        static DataType b(EditionChunkSchema editionchunkschema)
        {
            return editionchunkschema.b;
        }

        public static EditionChunkSchema valueOf(String s)
        {
            return (EditionChunkSchema)Enum.valueOf(com/snapchat/android/discover/model/database/table/EditionChunkTable$EditionChunkSchema, s);
        }

        public static EditionChunkSchema[] values()
        {
            return (EditionChunkSchema[])$VALUES.clone();
        }

        public final String getColumnName()
        {
            return a;
        }

        public final int getColumnNumber()
        {
            return ordinal();
        }

        public final String getConstraints()
        {
            return c;
        }

        public final DataType getDataType()
        {
            return b;
        }

        static 
        {
            ID = new EditionChunkSchema("ID", "_id", DataType.TEXT, "PRIMARY KEY");
            EDITION_ID = new EditionChunkSchema("EDITION_ID", 1, "edition_id", DataType.TEXT);
            URL = new EditionChunkSchema("URL", 2, "url", DataType.TEXT);
            HASH = new EditionChunkSchema("HASH", 3, "hash", DataType.TEXT);
            AD_KEY = new EditionChunkSchema("AD_KEY", 4, "ad_key", DataType.TEXT);
            AD_PLACEMENT_ID = new EditionChunkSchema("AD_PLACEMENT_ID", 5, "ad_placement_id", DataType.TEXT);
            AD_LINE_ITEM_ID = new EditionChunkSchema("AD_LINE_ITEM_ID", 6, "ad_line_item_id", DataType.TEXT);
            COLOR = new EditionChunkSchema("COLOR", 7, "color", DataType.TEXT);
            AD_TYPE = new EditionChunkSchema("AD_TYPE", 8, "ad_type", DataType.INTEGER);
            AD_POSITION = new EditionChunkSchema("AD_POSITION", 9, "ad_position", DataType.INTEGER);
            POSITION = new EditionChunkSchema("POSITION", 10, "position", DataType.INTEGER);
            STATUS = new EditionChunkSchema("STATUS", 11, "status", DataType.TEXT);
            AD_UNIT_ID = new EditionChunkSchema("AD_UNIT_ID", 12, "ad_unit_id", DataType.TEXT);
            AD_TARGETING = new EditionChunkSchema("AD_TARGETING", 13, "targeting_parameters", DataType.MAP);
            $VALUES = (new EditionChunkSchema[] {
                ID, EDITION_ID, URL, HASH, AD_KEY, AD_PLACEMENT_ID, AD_LINE_ITEM_ID, COLOR, AD_TYPE, AD_POSITION, 
                POSITION, STATUS, AD_UNIT_ID, AD_TARGETING
            });
        }

        private EditionChunkSchema(String s, int i, String s1, DataType datatype)
        {
            super(s, i);
            a = s1;
            b = datatype;
        }

        private EditionChunkSchema(String s, String s1, DataType datatype, String s2)
        {
            this(s, 0, s1, datatype);
            c = s2;
        }
    }


    private static String a[];
    private static HashMap b;
    private static EditionChunkTable c;

    protected EditionChunkTable()
    {
    }

    public static int a(SQLiteDatabase sqlitedatabase)
    {
        return sqlitedatabase.updateWithOnConflict("EditionChunk", (new tA()).a(EditionChunkSchema.STATUS, EditionStatus.INACTIVE.toString()).a, (new StringBuilder()).append(EditionChunkSchema.STATUS.getColumnName()).append("!=?").toString(), new String[] {
            EditionStatus.ARCHIVED.toString()
        }, 5);
    }

    private static ContentValues a(TT tt)
    {
        if (tt == null)
        {
            return null;
        }
        tA ta = new tA();
        ta.a(EditionChunkSchema.ID, tt.b().longValue());
        ta.a(EditionChunkSchema.COLOR, tt.d());
        ta.a(EditionChunkSchema.AD_TYPE, tt.e().intValue());
        ta.a(EditionChunkSchema.URL, tt.a());
        ta.a(EditionChunkSchema.HASH, tt.c());
        tt = tt.f();
        if (tt != null)
        {
            java.util.Map map = tt.b();
            ta.a(EditionChunkSchema.AD_UNIT_ID, tt.a());
            ta.a(EditionChunkSchema.AD_TARGETING, map);
        } else
        {
            ta.a(EditionChunkSchema.AD_UNIT_ID, null);
            ta.a(EditionChunkSchema.AD_TARGETING, null);
        }
        return ta.a;
    }

    public static EditionChunkTable a()
    {
        com/snapchat/android/discover/model/database/table/EditionChunkTable;
        JVM INSTR monitorenter ;
        EditionChunkTable editionchunktable;
        if (c == null)
        {
            c = new EditionChunkTable();
        }
        editionchunktable = c;
        com/snapchat/android/discover/model/database/table/EditionChunkTable;
        JVM INSTR monitorexit ;
        return editionchunktable;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(Context context, String s, String s1, String s2, String s3, String s4, String s5)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = DatabaseHelper.a(context).getWritableDatabase();
        Timber.c("EditionChunkTable", "safeUpdate - beginTransaction", new Object[0]);
        sqlitedatabase.beginTransaction();
        int i = sqlitedatabase.updateWithOnConflict("EditionChunk", (new tA()).a(EditionChunkSchema.URL, s1).a(EditionChunkSchema.HASH, s2).a(EditionChunkSchema.AD_KEY, s3).b(EditionChunkSchema.AD_PLACEMENT_ID, s4).b(EditionChunkSchema.AD_LINE_ITEM_ID, s5).a, (new StringBuilder()).append(EditionChunkSchema.ID.getColumnName()).append("=?").toString(), new String[] {
            String.valueOf(s)
        }, 5);
        Timber.c("EditionChunkTable", (new StringBuilder("updateUrlSaveToDatabase numRowsAffected: ")).append(i).toString(), new Object[0]);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        Timber.c("EditionChunkTable", "safeUpdate - endTransaction", new Object[0]);
_L1:
        if (i > 0)
        {
            context.getContentResolver().notifyChange(SnapchatProvider.c, null);
        }
        return;
        s;
        i = 0;
_L2:
        Timber.e("EditionChunk", "Error while writing to database: %s", new Object[] {
            s.getMessage()
        });
        sqlitedatabase.endTransaction();
        Timber.c("EditionChunkTable", "safeUpdate - endTransaction", new Object[0]);
          goto _L1
        context;
        sqlitedatabase.endTransaction();
        Timber.c("EditionChunkTable", "safeUpdate - endTransaction", new Object[0]);
        throw context;
        s;
          goto _L2
    }

    protected static void a(SQLiteDatabase sqlitedatabase, TT tt, int i, int j, String s, EditionStatus editionstatus)
    {
        if (tt != null)
        {
            a(sqlitedatabase, a(tt), i, j, s, tt.e().intValue(), tt.b().toString(), editionstatus);
        }
    }

    private static void a(SQLiteDatabase sqlitedatabase, ContentValues contentvalues)
    {
        if (sqlitedatabase.insertWithOnConflict("EditionChunk", null, contentvalues, 5) == -1L)
        {
            throw new SQLiteException("Insertion in DB failed for EditionChunk");
        } else
        {
            return;
        }
    }

    static void a(SQLiteDatabase sqlitedatabase, ContentValues contentvalues, int i, int j, String s, int k, String s1, EditionStatus editionstatus)
    {
        if (contentvalues != null)
        {
            contentvalues.put(EditionChunkSchema.EDITION_ID.getColumnName(), s);
            contentvalues.put(EditionChunkSchema.POSITION.getColumnName(), Integer.valueOf(i));
            contentvalues.put(EditionChunkSchema.AD_POSITION.getColumnName(), Integer.valueOf(j));
            contentvalues.put(EditionChunkSchema.STATUS.getColumnName(), editionstatus.toString());
            if (k != 0)
            {
                if (sqlitedatabase.update("EditionChunk", (new tA()).a(EditionChunkSchema.STATUS, EditionStatus.ACTIVE.toString()).a, (new StringBuilder()).append(EditionChunkSchema.ID.getColumnName()).append("=?").toString(), new String[] {
    s1
}) <= 0)
                {
                    a(sqlitedatabase, contentvalues);
                    return;
                }
            } else
            {
                a(sqlitedatabase, contentvalues);
                return;
            }
        }
    }

    protected final volatile ContentValues a(Object obj)
    {
        return a((TT)obj);
    }

    protected final Collection a(Br br)
    {
        return null;
    }

    public final void b(Br br)
    {
    }

    public final tt[] b()
    {
        return EditionChunkSchema.values();
    }

    public final String c()
    {
        return "EditionChunk";
    }

    public final void c(Br br)
    {
    }

    public final String d()
    {
        StringBuilder stringbuilder = new StringBuilder();
        EditionChunkSchema aeditionchunkschema[] = EditionChunkSchema.values();
        int j = aeditionchunkschema.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = aeditionchunkschema[i];
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((new StringBuilder()).append(EditionChunkSchema.a(((EditionChunkSchema) (obj)))).append(" ").append(EditionChunkSchema.b(((EditionChunkSchema) (obj))).toString()).toString());
            obj = ((EditionChunkSchema) (obj)).getConstraints();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                stringbuilder.append(" ");
                stringbuilder.append(((String) (obj)));
            }
        }

        return stringbuilder.toString();
    }

    public final boolean l()
    {
        return false;
    }

    static 
    {
        EditionChunkSchema aeditionchunkschema[] = EditionChunkSchema.values();
        int j = aeditionchunkschema.length;
        a = new String[j];
        b = new HashMap(j);
        for (int i = 0; i < j; i++)
        {
            EditionChunkSchema editionchunkschema = aeditionchunkschema[i];
            a[i] = aeditionchunkschema[i].getColumnName();
            b.put(editionchunkschema.getColumnName(), editionchunkschema.getColumnName());
        }

    }
}
