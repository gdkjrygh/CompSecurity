// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.unveil.g;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.google.android.apps.unveil.env:
//            af, ac, aa, ae, 
//            ab, ad, z

public class UnveilContentProvider extends ContentProvider
{

    private static final af a = new af();
    private static HashMap b;
    private static HashMap c;
    private static HashMap d;
    private static HashMap e;
    private static HashMap f;
    private UriMatcher g;
    private SQLiteOpenHelper h;

    public UnveilContentProvider()
    {
    }

    static af a()
    {
        return a;
    }

    public int delete(Uri uri, String s, String as[])
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = h.getWritableDatabase();
        if (sqlitedatabase == null)
        {
            return 0;
        }
        g.match(uri);
        JVM INSTR tableswitch 1 10: default 80
    //                   1 122
    //                   2 148
    //                   3 282
    //                   4 296
    //                   5 430
    //                   6 444
    //                   7 578
    //                   8 592
    //                   9 726
    //                   10 740;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        uri = String.valueOf(uri);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(uri).length() + 12)).append("Unknown URI ").append(uri).toString());
_L2:
        int i = sqlitedatabase.delete("queries", s, as);
_L13:
        getContext().getContentResolver().notifyChange(uri, null);
        return i;
_L3:
        String s1 = (String)uri.getPathSegments().get(1);
        String s6 = String.valueOf("_id=");
        if (!TextUtils.isEmpty(s))
        {
            s = (new StringBuilder(String.valueOf(s).length() + 7)).append(" AND (").append(s).append(")").toString();
        } else
        {
            s = "";
        }
        i = sqlitedatabase.delete("queries", (new StringBuilder(String.valueOf(s6).length() + 0 + String.valueOf(s1).length() + String.valueOf(s).length())).append(s6).append(s1).append(s).toString(), as);
        continue; /* Loop/switch isn't completed */
_L4:
        i = sqlitedatabase.delete("last_image", s, as);
        continue; /* Loop/switch isn't completed */
_L5:
        String s2 = (String)uri.getPathSegments().get(1);
        String s7 = String.valueOf("_id=");
        if (!TextUtils.isEmpty(s))
        {
            s = (new StringBuilder(String.valueOf(s).length() + 7)).append(" AND (").append(s).append(")").toString();
        } else
        {
            s = "";
        }
        i = sqlitedatabase.delete("last_image", (new StringBuilder(String.valueOf(s7).length() + 0 + String.valueOf(s2).length() + String.valueOf(s).length())).append(s7).append(s2).append(s).toString(), as);
        continue; /* Loop/switch isn't completed */
_L6:
        i = sqlitedatabase.delete("thumbnail", s, as);
        continue; /* Loop/switch isn't completed */
_L7:
        String s3 = (String)uri.getPathSegments().get(1);
        String s8 = String.valueOf("_id=");
        if (!TextUtils.isEmpty(s))
        {
            s = (new StringBuilder(String.valueOf(s).length() + 7)).append(" AND (").append(s).append(")").toString();
        } else
        {
            s = "";
        }
        i = sqlitedatabase.delete("thumbnail", (new StringBuilder(String.valueOf(s8).length() + 0 + String.valueOf(s3).length() + String.valueOf(s).length())).append(s8).append(s3).append(s).toString(), as);
        continue; /* Loop/switch isn't completed */
_L8:
        i = sqlitedatabase.delete("last_text_restrict", s, as);
        continue; /* Loop/switch isn't completed */
_L9:
        String s4 = (String)uri.getPathSegments().get(1);
        String s9 = String.valueOf("_id=");
        if (!TextUtils.isEmpty(s))
        {
            s = (new StringBuilder(String.valueOf(s).length() + 7)).append(" AND (").append(s).append(")").toString();
        } else
        {
            s = "";
        }
        i = sqlitedatabase.delete("last_text_restrict", (new StringBuilder(String.valueOf(s9).length() + 0 + String.valueOf(s4).length() + String.valueOf(s).length())).append(s9).append(s4).append(s).toString(), as);
        continue; /* Loop/switch isn't completed */
_L10:
        i = sqlitedatabase.delete("sfc_results", s, as);
        continue; /* Loop/switch isn't completed */
_L11:
        String s5 = (String)uri.getPathSegments().get(1);
        String s10 = String.valueOf("_id=");
        if (!TextUtils.isEmpty(s))
        {
            s = (new StringBuilder(String.valueOf(s).length() + 7)).append(" AND (").append(s).append(")").toString();
        } else
        {
            s = "";
        }
        i = sqlitedatabase.delete("sfc_results", (new StringBuilder(String.valueOf(s10).length() + 0 + String.valueOf(s5).length() + String.valueOf(s).length())).append(s10).append(s5).append(s).toString(), as);
        if (true) goto _L13; else goto _L12
_L12:
    }

    public String getType(Uri uri)
    {
        switch (g.match(uri))
        {
        default:
            uri = String.valueOf(uri);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(uri).length() + 12)).append("Unknown URI ").append(uri).toString());

        case 1: // '\001'
            return "vnd.android.cursor.dir/vnd.google.unveil";

        case 2: // '\002'
            return "vnd.android.cursor.item/vnd.google.unveil";

        case 3: // '\003'
            return "vnd.android.cursor.dir/vnd.google.unveil";

        case 4: // '\004'
            return "vnd.android.cursor.item/vnd.google.unveil";

        case 5: // '\005'
            return "vnd.android.cursor.dir/vnd.google.unveil";

        case 6: // '\006'
            return "vnd.android.cursor.item/vnd.google.unveil";

        case 7: // '\007'
            return "vnd.android.cursor.dir/vnd.google.unveil";

        case 8: // '\b'
            return "vnd.android.cursor.item/vnd.google.unveil";

        case 9: // '\t'
            return "vnd.android.cursor.dir/vnd.google.unveil";

        case 10: // '\n'
            return "vnd.android.cursor.item/vnd.google.unveil";
        }
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        SQLiteDatabase sqlitedatabase;
        Long long1;
        sqlitedatabase = h.getWritableDatabase();
        if (sqlitedatabase == null)
        {
            return null;
        }
        if (contentvalues != null)
        {
            contentvalues = new ContentValues(contentvalues);
        } else
        {
            contentvalues = new ContentValues();
        }
        long1 = Long.valueOf(System.currentTimeMillis());
        g.match(uri);
        JVM INSTR tableswitch 1 9: default 92
    //                   1 145
    //                   2 92
    //                   3 204
    //                   4 92
    //                   5 248
    //                   6 92
    //                   7 292
    //                   8 92
    //                   9 336;
           goto _L1 _L2 _L1 _L3 _L1 _L4 _L1 _L5 _L1 _L6
_L6:
        break MISSING_BLOCK_LABEL_336;
_L1:
        uri = String.valueOf(uri);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(uri).length() + 12)).append("Unknown URI ").append(uri).toString());
_L2:
        if (!contentvalues.containsKey("created"))
        {
            contentvalues.put("created", long1);
        }
        long l = sqlitedatabase.insert("queries", "thumbnail", contentvalues);
        contentvalues = ContentUris.withAppendedId(ac.a(getContext()), l);
_L7:
        long l1;
        if (contentvalues != null)
        {
            getContext().getContentResolver().notifyChange(contentvalues, null);
            return contentvalues;
        } else
        {
            uri = String.valueOf(uri);
            throw new SQLException((new StringBuilder(String.valueOf(uri).length() + 26)).append("Failed to insert row into ").append(uri).toString());
        }
_L3:
        if (!contentvalues.containsKey("created"))
        {
            contentvalues.put("created", long1);
        }
        l1 = sqlitedatabase.insert("last_image", "data", contentvalues);
        contentvalues = ContentUris.withAppendedId(aa.a(getContext()), l1);
          goto _L7
_L4:
        if (!contentvalues.containsKey("created"))
        {
            contentvalues.put("created", long1);
        }
        long l2 = sqlitedatabase.insert("thumbnail", "data", contentvalues);
        contentvalues = ContentUris.withAppendedId(ae.a(getContext()), l2);
          goto _L7
_L5:
        if (!contentvalues.containsKey("created"))
        {
            contentvalues.put("created", long1);
        }
        long l3 = sqlitedatabase.insert("last_text_restrict", "text_restrict", contentvalues);
        contentvalues = ContentUris.withAppendedId(ab.a(getContext()), l3);
          goto _L7
        if (!contentvalues.containsKey("created"))
        {
            contentvalues.put("created", long1);
        }
        long l4 = sqlitedatabase.insert("sfc_results", "query_image", contentvalues);
        contentvalues = ContentUris.withAppendedId(ad.a(getContext()), l4);
          goto _L7
    }

    public boolean onCreate()
    {
        String s = getContext().getString(g.unveil_content_provider_authority);
        g = new UriMatcher(-1);
        g.addURI(s, "queries", 1);
        g.addURI(s, "queries/#", 2);
        g.addURI(s, "last_image", 3);
        g.addURI(s, "last_image/#", 4);
        g.addURI(s, "thumbnail", 5);
        g.addURI(s, "thumbnail/#", 6);
        g.addURI(s, "last_text_restrict", 7);
        g.addURI(s, "last_text_restrict/#", 8);
        g.addURI(s, "sfc_results", 9);
        g.addURI(s, "sfc_results/#", 10);
        h = new z(getContext());
        return true;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        Object obj;
        SQLiteDatabase sqlitedatabase;
        obj = null;
        sqlitedatabase = h.getReadableDatabase();
        if (sqlitedatabase != null) goto _L2; else goto _L1
_L1:
        as = obj;
_L15:
        return as;
_L2:
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        g.match(uri);
        JVM INSTR tableswitch 1 10: default 92
    //                   1 183
    //                   2 134
    //                   3 315
    //                   4 266
    //                   5 412
    //                   6 363
    //                   7 509
    //                   8 460
    //                   9 606
    //                   10 557;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L12:
        break MISSING_BLOCK_LABEL_606;
_L7:
        break; /* Loop/switch isn't completed */
_L3:
        uri = String.valueOf(uri);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(uri).length() + 12)).append("Unknown URI ").append(uri).toString());
_L5:
        String s2 = String.valueOf("_id=");
        String s7 = String.valueOf((String)uri.getPathSegments().get(1));
        if (s7.length() != 0)
        {
            s2 = s2.concat(s7);
        } else
        {
            s2 = new String(s2);
        }
        sqlitequerybuilder.appendWhere(s2);
_L4:
        sqlitequerybuilder.setTables("queries");
        sqlitequerybuilder.setProjectionMap(b);
        if (TextUtils.isEmpty(s1))
        {
            s1 = "created DESC";
        }
_L16:
        s = sqlitequerybuilder.query(sqlitedatabase, as, s, as1, null, null, s1);
        as = s;
        if (s != null)
        {
            s.setNotificationUri(getContext().getContentResolver(), uri);
            return s;
        }
        if (true) goto _L15; else goto _L14
_L14:
        String s3 = String.valueOf("_id=");
        String s8 = String.valueOf((String)uri.getPathSegments().get(1));
        if (s8.length() != 0)
        {
            s3 = s3.concat(s8);
        } else
        {
            s3 = new String(s3);
        }
        sqlitequerybuilder.appendWhere(s3);
_L6:
        sqlitequerybuilder.setTables("last_image");
        sqlitequerybuilder.setProjectionMap(c);
        if (TextUtils.isEmpty(s1))
        {
            s1 = "created DESC";
        }
          goto _L16
_L9:
        String s4 = String.valueOf("_id=");
        String s9 = String.valueOf((String)uri.getPathSegments().get(1));
        if (s9.length() != 0)
        {
            s4 = s4.concat(s9);
        } else
        {
            s4 = new String(s4);
        }
        sqlitequerybuilder.appendWhere(s4);
_L8:
        sqlitequerybuilder.setTables("thumbnail");
        sqlitequerybuilder.setProjectionMap(d);
        if (TextUtils.isEmpty(s1))
        {
            s1 = "created DESC";
        }
          goto _L16
_L11:
        String s5 = String.valueOf("_id=");
        String s10 = String.valueOf((String)uri.getPathSegments().get(1));
        if (s10.length() != 0)
        {
            s5 = s5.concat(s10);
        } else
        {
            s5 = new String(s5);
        }
        sqlitequerybuilder.appendWhere(s5);
_L10:
        sqlitequerybuilder.setTables("last_text_restrict");
        sqlitequerybuilder.setProjectionMap(e);
        if (TextUtils.isEmpty(s1))
        {
            s1 = "created DESC";
        }
          goto _L16
_L13:
        String s6 = String.valueOf("_id=");
        String s11 = String.valueOf((String)uri.getPathSegments().get(1));
        if (s11.length() != 0)
        {
            s6 = s6.concat(s11);
        } else
        {
            s6 = new String(s6);
        }
        sqlitequerybuilder.appendWhere(s6);
        sqlitequerybuilder.setTables("sfc_results");
        sqlitequerybuilder.setProjectionMap(f);
        if (TextUtils.isEmpty(s1))
        {
            s1 = "created DESC";
        }
          goto _L16
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = h.getWritableDatabase();
        if (sqlitedatabase == null)
        {
            return 0;
        }
        g.match(uri);
        JVM INSTR tableswitch 1 10: default 80
    //                   1 122
    //                   2 150
    //                   3 286
    //                   4 302
    //                   5 438
    //                   6 454
    //                   7 590
    //                   8 606
    //                   9 742
    //                   10 758;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        uri = String.valueOf(uri);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(uri).length() + 12)).append("Unknown URI ").append(uri).toString());
_L2:
        int i = sqlitedatabase.update("queries", contentvalues, s, as);
_L13:
        getContext().getContentResolver().notifyChange(uri, null);
        return i;
_L3:
        String s1 = (String)uri.getPathSegments().get(1);
        String s6 = String.valueOf("_id=");
        if (!TextUtils.isEmpty(s))
        {
            s = (new StringBuilder(String.valueOf(s).length() + 7)).append(" AND (").append(s).append(")").toString();
        } else
        {
            s = "";
        }
        i = sqlitedatabase.update("queries", contentvalues, (new StringBuilder(String.valueOf(s6).length() + 0 + String.valueOf(s1).length() + String.valueOf(s).length())).append(s6).append(s1).append(s).toString(), as);
        continue; /* Loop/switch isn't completed */
_L4:
        i = sqlitedatabase.update("last_image", contentvalues, s, as);
        continue; /* Loop/switch isn't completed */
_L5:
        String s2 = (String)uri.getPathSegments().get(1);
        String s7 = String.valueOf("_id=");
        if (!TextUtils.isEmpty(s))
        {
            s = (new StringBuilder(String.valueOf(s).length() + 7)).append(" AND (").append(s).append(")").toString();
        } else
        {
            s = "";
        }
        i = sqlitedatabase.update("last_image", contentvalues, (new StringBuilder(String.valueOf(s7).length() + 0 + String.valueOf(s2).length() + String.valueOf(s).length())).append(s7).append(s2).append(s).toString(), as);
        continue; /* Loop/switch isn't completed */
_L6:
        i = sqlitedatabase.update("thumbnail", contentvalues, s, as);
        continue; /* Loop/switch isn't completed */
_L7:
        String s3 = (String)uri.getPathSegments().get(1);
        String s8 = String.valueOf("_id=");
        if (!TextUtils.isEmpty(s))
        {
            s = (new StringBuilder(String.valueOf(s).length() + 7)).append(" AND (").append(s).append(")").toString();
        } else
        {
            s = "";
        }
        i = sqlitedatabase.update("thumbnail", contentvalues, (new StringBuilder(String.valueOf(s8).length() + 0 + String.valueOf(s3).length() + String.valueOf(s).length())).append(s8).append(s3).append(s).toString(), as);
        continue; /* Loop/switch isn't completed */
_L8:
        i = sqlitedatabase.update("last_text_restrict", contentvalues, s, as);
        continue; /* Loop/switch isn't completed */
_L9:
        String s4 = (String)uri.getPathSegments().get(1);
        String s9 = String.valueOf("_id=");
        if (!TextUtils.isEmpty(s))
        {
            s = (new StringBuilder(String.valueOf(s).length() + 7)).append(" AND (").append(s).append(")").toString();
        } else
        {
            s = "";
        }
        i = sqlitedatabase.update("last_text_restrict", contentvalues, (new StringBuilder(String.valueOf(s9).length() + 0 + String.valueOf(s4).length() + String.valueOf(s).length())).append(s9).append(s4).append(s).toString(), as);
        continue; /* Loop/switch isn't completed */
_L10:
        i = sqlitedatabase.update("sfc_results", contentvalues, s, as);
        continue; /* Loop/switch isn't completed */
_L11:
        String s5 = (String)uri.getPathSegments().get(1);
        String s10 = String.valueOf("_id=");
        if (!TextUtils.isEmpty(s))
        {
            s = (new StringBuilder(String.valueOf(s).length() + 7)).append(" AND (").append(s).append(")").toString();
        } else
        {
            s = "";
        }
        i = sqlitedatabase.update("sfc_results", contentvalues, (new StringBuilder(String.valueOf(s10).length() + 0 + String.valueOf(s5).length() + String.valueOf(s).length())).append(s10).append(s5).append(s).toString(), as);
        if (true) goto _L13; else goto _L12
_L12:
    }

    static 
    {
        b = new HashMap();
        String as[] = ac.a;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            b.put(s, s);
        }

        HashMap hashmap = new HashMap();
        c = hashmap;
        hashmap.put("_id", "_id");
        c.put("data", "data");
        c.put("created", "created");
        hashmap = new HashMap();
        d = hashmap;
        hashmap.put("_id", "_id");
        d.put("key", "key");
        d.put("data", "data");
        d.put("created", "created");
        hashmap = new HashMap();
        e = hashmap;
        hashmap.put("_id", "_id");
        e.put("text_restrict", "text_restrict");
        e.put("created", "created");
        hashmap = new HashMap();
        f = hashmap;
        hashmap.put("_id", "_id");
        f.put("query_response", "query_response");
        f.put("query_image", "query_image");
        f.put("orientation", "orientation");
        f.put("moment_id", "moment_id");
        f.put("created", "created");
    }
}
