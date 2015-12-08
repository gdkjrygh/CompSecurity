// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.vungle.log.Logger;
import com.vungle.publisher.db.DatabaseHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.vungle.publisher:
//            bi, bg, de

public static abstract class tabaseHelper
{

    public DatabaseHelper c;

    private List a(Cursor cursor)
    {
        ArrayList arraylist = new ArrayList(cursor.getCount());
        for (; cursor.moveToNext(); arraylist.add(b(c_(), cursor))) { }
        return arraylist;
    }

    public static transient void a(bi abi[])
    {
        if (abi != null)
        {
            int j = abi.length;
            for (int i = 0; i < j; i++)
            {
                abi[i].r();
            }

        }
    }

    public int a(List list)
    {
        int i = 0;
        Object aobj[];
        if (list == null)
        {
            list = null;
        } else
        {
            list = (bi[])list.toArray(c(list.size()));
        }
        if (list != null)
        {
            Object aobj1[] = b(list.length);
            int k = list.length;
            int j = 0;
            do
            {
                aobj = aobj1;
                if (j >= k)
                {
                    break;
                }
                aobj1[i] = list[j].s();
                j++;
                i++;
            } while (true);
        } else
        {
            aobj = null;
        }
        return a(aobj);
    }

    public final transient int a(Object aobj[])
    {
        int l = 0;
        int i;
        if (aobj == null)
        {
            i = 0;
        } else
        {
            i = aobj.length;
        }
        if (i == 0)
        {
            Logger.d("VungleDatabase", (new StringBuilder("no ")).append(e_()).append(" records requested for delete").toString());
            return 0;
        }
        c_();
        boolean flag = aobj instanceof String[];
        String as[];
        if (flag)
        {
            as = (String[])(String[])aobj;
        } else
        {
            as = new String[i];
        }
        if (!flag)
        {
            int i1 = aobj.length;
            for (int j = 0; l < i1; j++)
            {
                as[j] = String.valueOf(aobj[l]);
                l++;
            }

        }
        int k = c.getWritableDatabase().delete(e_(), (new StringBuilder()).append(bi.a()).append(" IN (").append(bg.a(i)).append(")").toString(), as);
        if (k == i)
        {
            Logger.d("VungleDatabase", (new StringBuilder("deleted ")).append(k).append(" ").append(e_()).append(" records by ").append(bi.a()).append(" in ").append(de.b(aobj)).toString());
            return k;
        } else
        {
            Logger.w("VungleDatabase", (new StringBuilder("deleted ")).append(k).append(" of ").append(i).append(" requested records by ").append(bi.a()).append(" in ").append(de.b(aobj)).toString());
            return k;
        }
    }

    public abstract bi a(bi bi1, Cursor cursor);

    final bi a(bi bi1, String s, String as[])
    {
        if (bi1 == null)
        {
            throw new IllegalArgumentException("null model");
        }
        Object obj1 = bi.a();
        Object obj = bi1.s();
        if (obj == null)
        {
            throw new IllegalArgumentException((new StringBuilder("null ")).append(((String) (obj1))).toString());
        }
        obj1 = (new StringBuilder()).append(((String) (obj1))).append(" = ?");
        bi1 = new ArrayList();
        bi1.add(String.valueOf(obj));
        if (s != null)
        {
            ((StringBuilder) (obj1)).append(" AND ").append(s);
            if (as != null)
            {
                bi1.addAll(Arrays.asList(as));
            }
        }
        s = ((StringBuilder) (obj1)).toString();
        as = a(s, (String[])bi1.toArray(new String[bi1.size()]), null, null);
        int i = as.size();
        switch (i)
        {
        default:
            throw new SQLException((new StringBuilder()).append(i).append(" ").append(e_()).append(" records found for query: ").append(s).append(", parameters: ").append(de.a(bi1)).toString());

        case 0: // '\0'
            return null;

        case 1: // '\001'
            return (bi)as.get(0);
        }
    }

    public final bi a(Object obj)
    {
        return a(obj, ((String) (null)), ((String []) (null)));
    }

    public final bi a(Object obj, String s, String as[])
    {
        bi bi1 = c_();
        bi1.a(obj);
        return a(bi1, s, as);
    }

    public final List a(String s, String as[], String s1)
    {
        return a(s, as, s1, null);
    }

    public final List a(String s, String as[], String s1, String s2)
    {
        String s3;
        StringBuilder stringbuilder;
        s3 = e_();
        stringbuilder = new StringBuilder("fetching ");
        if (s != null) goto _L2; else goto _L1
_L1:
        Object obj = (new StringBuilder("all ")).append(s3).append(" records").toString();
_L10:
        Logger.d("VungleDatabase", stringbuilder.append(((String) (obj))).toString());
        s2 = c.getReadableDatabase().query(s3, null, s, as, null, null, s1, s2);
        int i;
        i = s2.getCount();
        obj = new StringBuilder();
        if (i != 0) goto _L4; else goto _L3
_L3:
        s1 = "no ";
_L6:
        Logger.v("VungleDatabase", ((StringBuilder) (obj)).append(s1).append(s3).append(" records by ").append(s).append(" ").append(de.b(as)).toString());
        s = a(((Cursor) (s2)));
        if (s2 != null)
        {
            s2.close();
        }
        return s;
_L2:
        obj = (new StringBuilder()).append(s3).append(" records by ").append(s).append(" ").append(de.b(as)).toString();
        continue; /* Loop/switch isn't completed */
_L4:
        s1 = (new StringBuilder("fetched ")).append(i).append(" ").toString();
        if (true) goto _L6; else goto _L5
_L5:
        s;
        as = null;
_L8:
        if (as != null)
        {
            as.close();
        }
        throw s;
        s;
        as = s2;
        if (true) goto _L8; else goto _L7
_L7:
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final boolean a(String s, String as[])
    {
        String s1;
        boolean flag1;
        flag1 = false;
        s1 = null;
        s = c.getWritableDatabase().rawQuery((new StringBuilder("SELECT EXISTS (SELECT 1 FROM ")).append(e_()).append(" WHERE ").append(s).append(" LIMIT 1)").toString(), as);
        boolean flag;
        flag = flag1;
        s1 = s;
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_88;
        }
        s1 = s;
        int i = s.getInt(0);
        flag = flag1;
        if (i != 0)
        {
            flag = true;
        }
        if (s != null)
        {
            s.close();
        }
        return flag;
        s;
        if (s1 != null)
        {
            s1.close();
        }
        throw s;
    }

    public final bi b(bi bi1, Cursor cursor)
    {
        a(bi1, cursor);
        Logger.v("VungleDatabase", (new StringBuilder("fetched ")).append(bi1).toString());
        return bi1;
    }

    public abstract Object[] b(int i);

    public abstract bi[] c(int i);

    public abstract bi c_();

    public List d()
    {
        return a(((String) (null)), ((String []) (null)), ((String) (null)));
    }

    public List d(int i)
    {
        return a(null, null, null, Integer.toString(i));
    }

    public final int e()
    {
        Cursor cursor;
        int i;
        cursor = null;
        i = 0;
        Cursor cursor1 = c.getReadableDatabase().rawQuery((new StringBuilder("SELECT COUNT(*) FROM ")).append(e_()).toString(), null);
        cursor = cursor1;
        if (!cursor1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_57;
        }
        cursor = cursor1;
        i = cursor1.getInt(0);
        if (cursor1 != null)
        {
            cursor1.close();
        }
        return i;
        Exception exception;
        exception;
        if (cursor != null)
        {
            cursor.close();
        }
        throw exception;
    }

    public abstract String e_();

    public tabaseHelper()
    {
    }
}
