// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class jae
{

    private final Context a;
    private final SQLiteOpenHelper b;
    private final fkt c;
    private final izs d;
    private final gbd e;
    private final izz f;
    private final izo g;
    private final izy h = new izy();
    private final noz i;
    private final noz j;

    public jae(Context context)
    {
        a = context;
        b = (SQLiteOpenHelper)olm.a(context, izr);
        c = (fkt)olm.a(context, fkt);
        d = (izs)olm.a(context, izs);
        e = (gbd)olm.a(context, gbd);
        f = (izz)olm.a(context, izz);
        g = (izo)olm.a(context, izo);
        i = noz.a(context, 3, "TrashMediaOperations", new String[] {
            "perf"
        });
        j = noz.a(context, 5, "TrashMediaOperations", new String[0]);
    }

    private static jaa a(Cursor cursor)
    {
        String s = cursor.getString(cursor.getColumnIndex("dedup_key"));
        String s1 = cursor.getString(cursor.getColumnIndex("local_path"));
        String s2 = cursor.getString(cursor.getColumnIndex("content_uri"));
        String s3 = cursor.getString(cursor.getColumnIndex("trash_file_name"));
        byte abyte0[];
        boolean flag;
        if (cursor.getInt(cursor.getColumnIndex("is_video")) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        abyte0 = cursor.getBlob(cursor.getColumnIndex("media_store_values"));
        cursor = new ContentValues();
        if (abyte0 != null)
        {
            cursor = b.b(abyte0);
        }
        return new jaa(s, s3, s2, s1, cursor, flag);
    }

    private jaa a(Uri uri, String s, String s1)
    {
        File file;
        file = d.a(UUID.randomUUID().toString());
        if (file.exists())
        {
            file = null;
        }
        if (file != null) goto _L2; else goto _L1
_L1:
        boolean flag;
        return null;
_L2:
        if (!(flag = fkt.a(new File(s), file))) goto _L1; else goto _L3
_L3:
        ContentValues contentvalues = new ContentValues();
        ContentValues contentvalues1 = f.a(uri);
        contentvalues = contentvalues1;
_L4:
        boolean flag1 = b.g(uri);
        return new jaa(s1, file.getName(), uri.toString(), s, contentvalues, flag1);
        uri;
        if (j.a())
        {
            noy.a("error", uri);
            return null;
        }
          goto _L1
        SQLiteException sqliteexception;
        sqliteexception;
          goto _L4
    }

    private boolean a(jaa jaa1)
    {
        File file = d.a(jaa1.b);
        fkt.a(file, new File(jaa1.d));
        boolean flag = true;
_L2:
        if (flag)
        {
            file.delete();
        }
        return flag;
        IOException ioexception;
        ioexception;
        if (j.a())
        {
            noy.a("originalPath", jaa1.d);
            noy.a("error", ioexception);
        }
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final jag a(List list)
    {
        long l = noy.a();
        List list1 = Collections.unmodifiableList(g.a(list));
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        SQLiteDatabase sqlitedatabase = b.getWritableDatabase();
        Iterator iterator1 = list1.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Object obj2 = (Uri)iterator1.next();
            Object obj1 = ((Uri) (obj2)).toString();
            String s = g.a(((Uri) (obj2)));
            if (TextUtils.isEmpty(s))
            {
                arraylist2.add(obj1);
            } else
            {
                Object obj = e.a(((String) (obj1)));
                if (obj != null)
                {
                    obj = ((nko) (obj)).b();
                } else
                {
                    obj = null;
                }
                if (TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    arraylist1.add(obj1);
                } else
                if ((new File(s)).length() > 0x7fffffffL)
                {
                    arraylist1.add(obj1);
                } else
                {
                    obj = a(((Uri) (obj2)), s, ((String) (obj)));
                    if (obj == null)
                    {
                        arraylist1.add(obj1);
                    } else
                    {
                        obj2 = Collections.singletonList(obj2);
                        boolean flag;
                        if (g.b(((List) (obj2))) == ((List) (obj2)).size())
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (!flag)
                        {
                            d.a(((jaa) (obj)).b).delete();
                            arraylist1.add(obj1);
                        } else
                        {
                            arraylist.add(obj1);
                            obj1 = new ContentValues();
                            ((ContentValues) (obj1)).put("dedup_key", ((jaa) (obj)).a);
                            ((ContentValues) (obj1)).put("trash_file_name", ((jaa) (obj)).b);
                            ((ContentValues) (obj1)).put("content_uri", ((jaa) (obj)).c);
                            ((ContentValues) (obj1)).put("local_path", ((jaa) (obj)).d);
                            ((ContentValues) (obj1)).put("is_video", Boolean.valueOf(((jaa) (obj)).f));
                            ((ContentValues) (obj1)).put("deleted_time", Long.valueOf(System.currentTimeMillis()));
                            ((ContentValues) (obj1)).put("media_store_values", b.a(((jaa) (obj)).e));
                            boolean flag1;
                            if (-1L != sqlitedatabase.insertOrThrow("local", null, ((ContentValues) (obj1))))
                            {
                                flag1 = true;
                            } else
                            {
                                flag1 = false;
                            }
                            if (flag1)
                            {
                                for (Iterator iterator = olm.c(a, izq).iterator(); iterator.hasNext(); ((izq)iterator.next()).a()) { }
                                a.getContentResolver().notifyChange(izx.a, null);
                            }
                        }
                    }
                }
            }
        } while (true);
        if (i.a())
        {
            noy.a("uris to remove ", Integer.valueOf(list.size()));
            noy.a("removed uris", Integer.valueOf(arraylist.size()));
            noy.a("duration", l);
        }
        list = new jah();
        if (!arraylist.isEmpty())
        {
            list.a(arraylist);
        }
        if (!arraylist1.isEmpty())
        {
            list.b(arraylist1);
        }
        if (!arraylist2.isEmpty())
        {
            list.c(arraylist2);
        }
        return list.a();
    }

    public jag a(List list, boolean flag)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        ArrayList arraylist2;
        ArrayList arraylist3;
        SQLiteDatabase sqlitedatabase;
        Object obj;
        ArrayList arraylist4;
        jaa jaa1;
        String s;
        Object obj1;
        long l;
        String as[];
        boolean flag1;
        if (!list.isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.a(flag1, "Can not remove empty uris.");
        l = noy.a();
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        arraylist2 = new ArrayList();
        arraylist3 = new ArrayList();
        obj = b.b("content_uri", list.size());
        as = (String[])list.toArray(new String[list.size()]);
        sqlitedatabase = b.getWritableDatabase();
        obj = sqlitedatabase.query("local", null, ((String) (obj)), as, null, null, null);
        arraylist4 = new ArrayList();
_L3:
        if (!((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        jaa1 = a(((Cursor) (obj)));
        s = jaa1.c;
        obj1 = d.a(jaa1.b);
        if (!((File) (obj1)).exists())
        {
            arraylist3.add(s);
            arraylist4.add(s);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_214;
        list;
        ((Cursor) (obj)).close();
        throw list;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_332;
        }
        boolean flag3 = a(jaa1);
        boolean flag2;
        flag2 = flag3;
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_305;
        }
        ContentValues contentvalues;
        obj1 = a;
        contentvalues = jaa1.e;
        contentvalues.remove("_id");
        contentvalues.put("_data", jaa1.d);
        flag2 = flag3;
        if (b.a(((Context) (obj1)).getContentResolver(), contentvalues, jaa1.f) == null)
        {
            break MISSING_BLOCK_LABEL_305;
        }
        arraylist1.add(s);
        flag2 = flag3;
_L1:
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        arraylist.add(s);
        arraylist4.add(s);
        continue; /* Loop/switch isn't completed */
        flag2 = ((File) (obj1)).delete();
          goto _L1
        arraylist2.add(s);
        if (true) goto _L3; else goto _L2
_L2:
        ((Cursor) (obj)).close();
        sqlitedatabase.delete("local", b.b("content_uri", arraylist4.size()), (String[])arraylist4.toArray(new String[arraylist4.size()]));
        if (i.a())
        {
            noy.a("uris to remove ", Integer.valueOf(list.size()));
            noy.a("removed uris", Integer.valueOf(arraylist4.size()));
            noy.a("duration", l);
        }
        for (list = olm.c(a, izt).iterator(); list.hasNext(); ((izt)list.next()).b()) { }
        a.getContentResolver().notifyChange(izx.a, null);
        list = new jah();
        if (!arraylist.isEmpty())
        {
            list.a(arraylist);
        }
        if (!arraylist2.isEmpty())
        {
            list.b(arraylist2);
        }
        if (!arraylist3.isEmpty())
        {
            list.c(arraylist3);
        }
        if (!arraylist1.isEmpty())
        {
            list.a(jai.d, arraylist1);
        }
        return list.a();
    }

    public final List a()
    {
        Cursor cursor;
        Object obj;
        cursor = b.getReadableDatabase().query("local", null, null, null, null, null, null);
        obj = new ArrayList();
        for (; cursor.moveToNext(); ((List) (obj)).add(a(cursor))) { }
        break MISSING_BLOCK_LABEL_60;
        obj;
        cursor.close();
        throw obj;
        cursor.close();
        return ((List) (obj));
    }

    public final List a(long l)
    {
        Cursor cursor;
        Object obj;
        cursor = b.getReadableDatabase().query("local", new String[] {
            "content_uri"
        }, "deleted_time < ?", new String[] {
            String.valueOf(l)
        }, null, null, null);
        obj = new ArrayList(cursor.getCount());
        for (; cursor.moveToNext(); ((List) (obj)).add(cursor.getString(cursor.getColumnIndex("content_uri")))) { }
        break MISSING_BLOCK_LABEL_100;
        obj;
        cursor.close();
        throw obj;
        cursor.close();
        if (((List) (obj)).isEmpty())
        {
            return ((List) (obj));
        } else
        {
            return a(((List) (obj)), false).a(jai.a);
        }
    }

    public final Long b(long l)
    {
        Cursor cursor = b.getReadableDatabase().query("local", new String[] {
            "deleted_time"
        }, "deleted_time > ?", new String[] {
            String.valueOf(l)
        }, null, null, "deleted_time ASC", "1");
        boolean flag = cursor.moveToNext();
        if (!flag)
        {
            cursor.close();
            return null;
        }
        l = cursor.getLong(cursor.getColumnIndex("deleted_time"));
        cursor.close();
        return Long.valueOf(l);
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    public final List b(List list)
    {
        SQLiteDatabase sqlitedatabase;
        ArrayList arraylist;
        boolean flag;
        if (!list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "uris cannot be empty");
        sqlitedatabase = b.getReadableDatabase();
        arraylist = new ArrayList();
        b.a(500, list.size(), new jaf(this, list, sqlitedatabase, arraylist));
        return arraylist;
    }
}
