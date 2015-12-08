// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.vungle.log.Logger;
import com.vungle.publisher.db.DatabaseHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.vungle.publisher:
//            bl, bg, de

public abstract class bi
    implements bl
{
    public static abstract class a
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

        final bi a(bi bi1, String s1, String as[])
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
            if (s1 != null)
            {
                ((StringBuilder) (obj1)).append(" AND ").append(s1);
                if (as != null)
                {
                    bi1.addAll(Arrays.asList(as));
                }
            }
            s1 = ((StringBuilder) (obj1)).toString();
            as = a(s1, (String[])bi1.toArray(new String[bi1.size()]), null, null);
            int i = as.size();
            switch (i)
            {
            default:
                throw new SQLException((new StringBuilder()).append(i).append(" ").append(e_()).append(" records found for query: ").append(s1).append(", parameters: ").append(de.a(bi1)).toString());

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

        public final bi a(Object obj, String s1, String as[])
        {
            bi bi1 = c_();
            bi1.a(obj);
            return a(bi1, s1, as);
        }

        public final List a(String s1, String as[], String s2)
        {
            return a(s1, as, s2, null);
        }

        public final List a(String s1, String as[], String s2, String s3)
        {
            String s4;
            StringBuilder stringbuilder;
            s4 = e_();
            stringbuilder = new StringBuilder("fetching ");
            if (s1 != null) goto _L2; else goto _L1
_L1:
            Object obj = (new StringBuilder("all ")).append(s4).append(" records").toString();
_L10:
            Logger.d("VungleDatabase", stringbuilder.append(((String) (obj))).toString());
            s3 = c.getReadableDatabase().query(s4, null, s1, as, null, null, s2, s3);
            int i;
            i = s3.getCount();
            obj = new StringBuilder();
            if (i != 0) goto _L4; else goto _L3
_L3:
            s2 = "no ";
_L6:
            Logger.v("VungleDatabase", ((StringBuilder) (obj)).append(s2).append(s4).append(" records by ").append(s1).append(" ").append(de.b(as)).toString());
            s1 = a(((Cursor) (s3)));
            if (s3 != null)
            {
                s3.close();
            }
            return s1;
_L2:
            obj = (new StringBuilder()).append(s4).append(" records by ").append(s1).append(" ").append(de.b(as)).toString();
            continue; /* Loop/switch isn't completed */
_L4:
            s2 = (new StringBuilder("fetched ")).append(i).append(" ").toString();
            if (true) goto _L6; else goto _L5
_L5:
            s1;
            as = null;
_L8:
            if (as != null)
            {
                as.close();
            }
            throw s1;
            s1;
            as = s3;
            if (true) goto _L8; else goto _L7
_L7:
            if (true) goto _L10; else goto _L9
_L9:
        }

        public final boolean a(String s1, String as[])
        {
            String s2;
            boolean flag1;
            flag1 = false;
            s2 = null;
            s1 = c.getWritableDatabase().rawQuery((new StringBuilder("SELECT EXISTS (SELECT 1 FROM ")).append(e_()).append(" WHERE ").append(s1).append(" LIMIT 1)").toString(), as);
            boolean flag;
            flag = flag1;
            s2 = s1;
            if (!s1.moveToFirst())
            {
                break MISSING_BLOCK_LABEL_88;
            }
            s2 = s1;
            int i = s1.getInt(0);
            flag = flag1;
            if (i != 0)
            {
                flag = true;
            }
            if (s1 != null)
            {
                s1.close();
            }
            return flag;
            s1;
            if (s2 != null)
            {
                s2.close();
            }
            throw s1;
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

        public a()
        {
        }
    }


    public Class s;
    public Object t;
    public DatabaseHelper u;

    public bi()
    {
    }

    protected static String a()
    {
        return "id";
    }

    public static void a(StringBuilder stringbuilder, String s1, Object obj)
    {
        a(stringbuilder, s1, obj, false);
    }

    public static void a(StringBuilder stringbuilder, String s1, Object obj, boolean flag)
    {
        if (!flag)
        {
            stringbuilder.append(", ");
        }
        stringbuilder.append(s1).append(": ").append(obj);
    }

    public abstract ContentValues a(boolean flag);

    protected final void a(Object obj)
    {
        t = obj;
    }

    public abstract a a_();

    public abstract String b();

    public boolean f_()
    {
        return true;
    }

    public int m()
    {
        Object obj = s();
        if (obj == null)
        {
            throw new IllegalArgumentException((new StringBuilder("null ")).append("id").toString());
        }
        String s1 = b();
        String s2 = (new StringBuilder()).append("id").append(" ").append(obj).toString();
        int i = u.getWritableDatabase().updateWithOnConflict(s1, a(false), "id = ?", new String[] {
            obj.toString()
        }, 3);
        switch (i)
        {
        default:
            Logger.w("VungleDatabase", (new StringBuilder("updated ")).append(i).append(" ").append(s1).append(" records for ").append(s2).toString());
            return i;

        case 0: // '\0'
            Logger.d("VungleDatabase", (new StringBuilder("no ")).append(s1).append(" rows updated by ").append(s2).toString());
            return i;

        case 1: // '\001'
            Logger.d("VungleDatabase", (new StringBuilder("update successful ")).append(y()).toString());
            break;
        }
        return i;
    }

    public int n()
    {
        return a_().a(new Object[] {
            s()
        });
    }

    public StringBuilder o()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append('{').append(z()).append(":: ");
        a(stringbuilder, "id", s(), true);
        return stringbuilder;
    }

    public StringBuilder p()
    {
        return o();
    }

    public Object r()
    {
        long l;
        Object obj = s();
        if (f_() && obj != null)
        {
            throw new SQLException((new StringBuilder("attempt to insert with non-auto generated id ")).append(y()).toString());
        }
        Logger.d("VungleDatabase", (new StringBuilder("inserting ")).append(this).toString());
        l = u.getWritableDatabase().insertOrThrow(b(), null, a(true));
        if (s != null && !java/lang/Integer.equals(s)) goto _L2; else goto _L1
_L1:
        t = Integer.valueOf((int)l);
_L4:
        Logger.v("VungleDatabase", (new StringBuilder("inserted ")).append(this).toString());
        return s();
_L2:
        if (java/lang/Long.equals(s))
        {
            t = Long.valueOf(l);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Object s()
    {
        return t;
    }

    public String toString()
    {
        return p().append('}').toString();
    }

    public final void w()
    {
        a_().a(this, null, null);
    }

    public final Object x()
    {
        Object obj = s();
        if (obj == null)
        {
            return r();
        } else
        {
            m();
            return obj;
        }
    }

    public final String y()
    {
        return o().append('}').toString();
    }

    public String z()
    {
        return b();
    }
}
