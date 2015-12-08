// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class est
{

    public static final String a;
    public final Context b;
    private final mmv c;
    private final muz d;
    private final eum e;
    private final noz f;

    est(Context context, mmv mmv1, muz muz1, eum eum1)
    {
        b = context;
        c = mmv1;
        d = muz1;
        e = eum1;
        f = noz.a(context, "EnvelopeDataStore", new String[0]);
    }

    public static List a(SQLiteDatabase sqlitedatabase, long l)
    {
        Object obj;
        obj = new ArrayList();
        sqlitedatabase = new mvu(sqlitedatabase);
        sqlitedatabase.a = "envelopes";
        sqlitedatabase.b = (new String[] {
            "media_key"
        });
        sqlitedatabase.c = "write_time_ms IS NOT NULL AND write_time_ms < ? AND is_joined = 1";
        sqlitedatabase.d = (new String[] {
            Long.toString(l)
        });
        sqlitedatabase = sqlitedatabase.a();
        while (sqlitedatabase.moveToNext()) 
        {
            ((List) (obj)).add(sqlitedatabase.getString(sqlitedatabase.getColumnIndexOrThrow("media_key")));
        }
        break MISSING_BLOCK_LABEL_104;
        obj;
        sqlitedatabase.close();
        throw obj;
        sqlitedatabase.close();
        return ((List) (obj));
    }

    private static void a(SQLiteDatabase sqlitedatabase, long l, List list)
    {
        p.b(sqlitedatabase.inTransaction());
        ContentValues contentvalues;
        for (list = list.iterator(); list.hasNext(); sqlitedatabase.insertWithOnConflict("shared_media", null, contentvalues, 5))
        {
            qgg qgg1 = (qgg)list.next();
            contentvalues = eui.a(qgg1, qgg1.c.l.a, new byte[qgg1.d()]).c;
            contentvalues.put("owner_media_key", qgg1.c.b.a);
            contentvalues.put("write_time_ms", Long.valueOf(l));
        }

    }

    private void a(SQLiteDatabase sqlitedatabase, long l, qfz qfz1)
    {
        p.b(sqlitedatabase.inTransaction());
        if (qfz1 != null && qfz1.e != null && qfz1.e.length != 0 && qfz1.e[0] != null && qfz1.e[0].a != null)
        {
            String s = qfz1.a.a;
            String s1 = qfz1.b.a.a;
            qfz1 = qfz1.e[0].a;
            int j = qfz1.length;
            int i = 0;
            while (i < j) 
            {
                Object obj = qfz1[i];
                if (obj == null || ((qci) (obj)).a == null || TextUtils.isEmpty(((qci) (obj)).a.a))
                {
                    if (f.a())
                    {
                        noy.a("recipient", obj);
                    }
                } else
                {
                    ContentValues contentvalues = new ContentValues();
                    String s2 = ((qci) (obj)).a.a;
                    contentvalues.put("actor_id", ((qci) (obj)).a.a);
                    contentvalues.put("envelope_media_key", s);
                    if (s1.equals(s2))
                    {
                        contentvalues.put("is_owner", Integer.valueOf(1));
                    }
                    if (l > 0L)
                    {
                        contentvalues.put("write_time_ms", Long.valueOf(l));
                    }
                    sqlitedatabase.insertWithOnConflict("envelope_members", null, contentvalues, 5);
                }
                i++;
            }
        }
    }

    private void a(SQLiteDatabase sqlitedatabase, List list)
    {
        p.b(sqlitedatabase.inTransaction());
        for (list = list.iterator(); list.hasNext();)
        {
            qfu qfu1 = (qfu)list.next();
            if (qfu1.a == null || TextUtils.isEmpty(qfu1.a.a))
            {
                if (!f.a());
            } else
            {
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("media_key", qfu1.a.a);
                contentvalues.put("gaia_id", qfu1.a.b);
                if (qfu1.e != null)
                {
                    contentvalues.put("display_name", qfu1.e.a);
                }
                contentvalues.put("profile_photo_url", qfu1.c);
                sqlitedatabase.insertWithOnConflict("actors", null, contentvalues, 5);
            }
        }

    }

    private void b(int i, String s, String s1)
    {
        Object obj;
        obj = new mvu(mvj.b(b, i));
        obj.a = "shared_media";
        obj.b = (new String[] {
            "media_key"
        });
        obj.c = DatabaseUtils.concatenateWhere("collection_id = ?", "owner_media_key = ?");
        obj.d = (new String[] {
            s, s1
        });
        s1 = ((mvu) (obj)).a();
        obj = new ArrayList();
        for (; s1.moveToNext(); ((List) (obj)).add(s1.getString(s1.getColumnIndexOrThrow("media_key")))) { }
        break MISSING_BLOCK_LABEL_127;
        s;
        s1.close();
        throw s;
        s1.close();
        a(i, s, ((List) (obj)), false);
        return;
    }

    private String f(int i, String s)
    {
        mvu mvu1 = new mvu(mvj.a(b, i));
        mvu1.a = "actors";
        mvu1.b = (new String[] {
            "media_key"
        });
        mvu1.c = "gaia_id = ?";
        mvu1.d = (new String[] {
            s
        });
        s = mvu1.a();
        boolean flag = s.moveToFirst();
        if (!flag)
        {
            s.close();
            return null;
        }
        String s1 = s.getString(s.getColumnIndexOrThrow("media_key"));
        s.close();
        return s1;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    public final int a(int i, String s)
    {
        return (int)DatabaseUtils.queryNumEntries(mvj.b(b, i), "shared_media", "collection_id = ?", new String[] {
            s
        });
    }

    public int a(int i, String s, List list, boolean flag)
    {
        SQLiteDatabase sqlitedatabase = mvj.a(b, i);
        sqlitedatabase.beginTransactionNonExclusive();
        int j;
        int k;
        k = 0;
        j = 0;
_L3:
        List list1;
        if (k >= list.size())
        {
            break MISSING_BLOCK_LABEL_244;
        }
        list1 = list.subList(k, Math.min(k + 500, list.size()));
        String s1;
        String s2;
        int l;
        boolean flag1;
        if (!list1.isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.a(flag1, "mediaKeys must be non-empty");
        if (list1.size() <= 500)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.a(flag1, "mediaKeys must have size < 500");
        s1 = String.valueOf("collection_id = ? AND ");
        s2 = String.valueOf(b.b("media_key", list1.size()));
        if (s2.length() == 0)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        s1 = s1.concat(s2);
_L1:
        ArrayList arraylist = new ArrayList(list1.size() + 1);
        arraylist.add(s);
        arraylist.addAll(list1);
        l = sqlitedatabase.delete("shared_media", s1, (String[])arraylist.toArray(new String[arraylist.size()]));
        k += 500;
        j += l;
        continue; /* Loop/switch isn't completed */
        s1 = new String(s1);
          goto _L1
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        if (flag)
        {
            a(i, s, "removeMediasInEnvelope");
        }
        return j;
        s;
        sqlitedatabase.endTransaction();
        throw s;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public final void a(int i, long l, qfz qfz1, List list, List list1)
    {
        SQLiteDatabase sqlitedatabase;
        boolean flag;
        flag = true;
        sqlitedatabase = mvj.a(b, i);
        sqlitedatabase.beginTransactionNonExclusive();
        qci qci1;
        a(sqlitedatabase, list1);
        p.b(sqlitedatabase.inTransaction());
        list1 = new ContentValues();
        list1.put("media_key", qfz1.a.a);
        list1.put("owner_actor_id", qfz1.b.a.a);
        if (!TextUtils.isEmpty(qfz1.b.h))
        {
            list1.put("auth_key", qfz1.b.h);
        }
        qci1 = qfz1.f;
        if (qci1 == null) goto _L2; else goto _L1
_L1:
        if (qci1.c != 1) goto _L2; else goto _L3
_L3:
        int j = 1;
          goto _L4
_L20:
        list1.put("is_pinned", Integer.valueOf(j));
        if (qci1 == null) goto _L6; else goto _L5
_L5:
        if (!b.a(qci1.b, false)) goto _L6; else goto _L7
_L7:
        j = 1;
          goto _L8
_L21:
        list1.put("is_joined", Integer.valueOf(j));
        list1.put("title", qfz1.b.b);
        if (qfz1.b.i != null)
        {
            list1.put("cover_item_media_key", qfz1.b.i.a);
        }
        if (qfz1.b.c == null) goto _L10; else goto _L9
_L9:
        list1.put("total_item_count", qfz1.b.c);
_L22:
        if (qfz1.e == null || qfz1.e[0] == null || qfz1.e[0].b == null) goto _L12; else goto _L11
_L11:
        list1.put("total_recipient_count", qfz1.e[0].b);
_L23:
        pzh apzh[];
        int k;
        if (qfz1.b.l != null && qfz1.b.l.a != null && qfz1.b.l.a.booleanValue())
        {
            j = 1;
        } else
        {
            j = 0;
        }
          goto _L13
_L24:
        list1.put("is_collaborative", Integer.valueOf(j));
        if (qfz1.b.d != null)
        {
            list1.put("start_time_ms", qfz1.b.d.a);
            list1.put("end_time_ms", qfz1.b.d.b);
            list1.put("created_time_ms", qfz1.b.d.c);
        }
        if (qfz1.b.e == null) goto _L15; else goto _L14
_L14:
        apzh = qfz1.b.e;
        k = apzh.length;
        j = 0;
_L25:
        if (j >= k) goto _L15; else goto _L16
_L16:
        if (apzh[j].a != 11) goto _L18; else goto _L17
_L17:
        j = 1;
          goto _L19
_L26:
        list1.put("can_add_content", Integer.valueOf(j));
        if (qfz1.b.j != null)
        {
            list1.put("short_url", qfz1.b.j.a);
        }
        list1.put("protobuf", qlw.a(qfz1));
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_562;
        }
        list1.put("write_time_ms", Long.valueOf(l));
        sqlitedatabase.insertWithOnConflict("envelopes", null, list1, 5);
        a(sqlitedatabase, l, qfz1);
        a(sqlitedatabase, l, list);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        a(i, qfz1.a.a, "saveEnvelopeContents");
        return;
_L2:
        j = 0;
          goto _L4
_L28:
        j = 0;
          goto _L20
_L6:
        j = 0;
          goto _L8
_L30:
        j = 0;
          goto _L21
_L10:
        list1.put("total_item_count", Integer.valueOf(0));
          goto _L22
        qfz1;
        sqlitedatabase.endTransaction();
        throw qfz1;
_L12:
        list1.put("total_recipient_count", Integer.valueOf(0));
          goto _L23
_L32:
        j = 0;
          goto _L24
_L18:
        j++;
          goto _L25
_L34:
        j = 0;
          goto _L26
_L15:
        j = 0;
        continue; /* Loop/switch isn't completed */
_L4:
        if (j == 0) goto _L28; else goto _L27
_L27:
        j = 1;
          goto _L20
_L8:
        if (j == 0) goto _L30; else goto _L29
_L29:
        j = 1;
          goto _L21
_L13:
        if (j == 0) goto _L32; else goto _L31
_L31:
        j = 1;
          goto _L24
_L19:
        if (j == 0) goto _L34; else goto _L33
_L33:
        j = ((flag) ? 1 : 0);
          goto _L26
    }

    public void a(int i, String s, String s1)
    {
        e.a(i, s1, null);
        e.a(i, s1, s);
    }

    public final void a(int i, List list)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = mvj.a(b, i);
        sqlitedatabase.beginTransactionNonExclusive();
        a(sqlitedatabase, list);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        list;
        sqlitedatabase.endTransaction();
        throw list;
    }

    public final int b(int i, String s)
    {
        SQLiteDatabase sqlitedatabase = mvj.a(b, i);
        int j;
        sqlitedatabase.beginTransactionNonExclusive();
        j = sqlitedatabase.delete("shared_media", "collection_id = ?", new String[] {
            s
        });
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        a(i, s, "removeAllMediasInEnvelope");
        return j;
        s;
        sqlitedatabase.endTransaction();
        throw s;
    }

    public final qgg c(int i, String s)
    {
        mvu mvu1 = new mvu(mvj.b(b, i));
        mvu1.a = "shared_media";
        mvu1.b = (new String[] {
            "protobuf"
        });
        mvu1.c = "media_key = ?";
        mvu1.d = (new String[] {
            s
        });
        s = mvu1.a();
        boolean flag = s.moveToFirst();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        qgg qgg1 = (qgg)qlw.a(new qgg(), s.getBlob(s.getColumnIndexOrThrow("protobuf")));
        s.close();
        return qgg1;
        Object obj;
        obj;
        s.close();
        return null;
        obj;
        s.close();
        throw obj;
    }

    public final boolean d(int i, String s)
    {
        boolean flag = true;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("is_joined", Integer.valueOf(1));
        SQLiteDatabase sqlitedatabase = mvj.a(b, i);
        sqlitedatabase.update("envelopes", contentvalues, "media_key = ?", new String[] {
            s
        });
        String s1 = f(i, c.a(i).b("gaia_id"));
        if (TextUtils.isEmpty(s1))
        {
            return false;
        }
        contentvalues.clear();
        contentvalues.put("actor_id", s1);
        contentvalues.put("envelope_media_key", s);
        contentvalues.put("write_time_ms", Long.valueOf(d.a()));
        if (sqlitedatabase.insertWithOnConflict("envelope_members", null, contentvalues, 4) <= 0L)
        {
            flag = false;
        }
        a(i, s, "joinEnvelope");
        return flag;
    }

    public final void e(int i, String s)
    {
        Object obj = new ContentValues();
        ((ContentValues) (obj)).put("is_joined", Integer.valueOf(0));
        SQLiteDatabase sqlitedatabase = mvj.a(b, i);
        sqlitedatabase.update("envelopes", ((ContentValues) (obj)), "media_key = ?", new String[] {
            s
        });
        obj = f(i, c.a(i).b("gaia_id"));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return;
        } else
        {
            sqlitedatabase.delete("envelope_members", String.valueOf(DatabaseUtils.concatenateWhere("envelope_media_key =? ", "actor_id")).concat(" =? "), new String[] {
                s, obj
            });
            b(i, s, ((String) (obj)));
            a(i, s, "leaveEnvelope");
            return;
        }
    }

    static 
    {
        String s = String.valueOf("SELECT count(distinct dedup_key) FROM remote_media WHERE state = ");
        int i = eun.a.c;
        String s1 = String.valueOf("dedup_key");
        String s2 = String.valueOf("dedup_key");
        String s3 = String.valueOf("shared_media");
        String s4 = String.valueOf("collection_id");
        a = (new StringBuilder(String.valueOf(s).length() + 46 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s).append(i).append(" AND ").append(s1).append(" IN (SELECT ").append(s2).append(" FROM ").append(s3).append(" WHERE ").append(s4).append(" = ?)").toString();
    }
}
