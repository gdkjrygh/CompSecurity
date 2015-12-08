// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tinder.managers.ManagerApp;
import com.tinder.utils.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tinder.b:
//            f

public final class l
{

    private static final l b = new l();
    public SQLiteDatabase a;

    private l()
    {
        a = (new f(ManagerApp.c())).getWritableDatabase();
    }

    public static l a()
    {
        return b;
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (a.isOpen())
        {
            a.endTransaction();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final Cursor a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s = a.query(s, new String[] {
            "*"
        }, null, null, null, null, s1);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public final Cursor a(String s, String s1, int i)
    {
        this;
        JVM INSTR monitorenter ;
        s = a.query(s, new String[] {
            "*"
        }, null, null, null, null, s1, String.valueOf(i));
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public final void a(String s, ContentValues contentvalues, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!a.isOpen()) goto _L2; else goto _L1
_L1:
        a.update(s, contentvalues, s1, null);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        v.a("Update not performed, DB closed");
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public final void a(String s, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        if (!a.isOpen()) goto _L2; else goto _L1
_L1:
        int i = a.delete(s, (new StringBuilder()).append(s1).append('=').append('\'').append(s2).append('\'').toString(), null);
        (new StringBuilder("deleted ")).append(i).append(" from table ").append(s);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        v.a("DB closed, nothing deleted");
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public final void a(String s, String s1, ArrayList arraylist)
    {
        this;
        JVM INSTR monitorenter ;
        int j;
        s1 = new StringBuilder((new StringBuilder()).append(s1).append(" in (").toString());
        j = arraylist.size();
        int i = 0;
_L9:
        if (i >= j) goto _L2; else goto _L1
_L1:
        s1.append(arraylist.get(i));
        if (i >= j - 1) goto _L4; else goto _L3
_L3:
        s1.append(", ");
          goto _L4
_L2:
        boolean flag;
        s1.append(')');
        flag = a.isOpen();
        if (!flag) goto _L6; else goto _L5
_L5:
        i = a.delete(s, s1.toString(), null);
        (new StringBuilder("deleted ")).append(i).append(" from table ").append(s);
_L7:
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        v.b(s.getMessage());
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
_L6:
        v.a("Delete not performed, DB closed");
        if (true) goto _L7; else goto _L4
_L4:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final boolean a(String s)
    {
        String s1 = null;
        s = a.query(s, new String[] {
            "*"
        }, null, null, null, null, null);
        s1 = s;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        s = s1;
        int i = s1.getCount();
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        if (s1 != null)
        {
            s1.close();
        }
        return false;
        if (s1 != null)
        {
            s1.close();
        }
        return true;
        Object obj;
        obj;
        s1 = null;
_L4:
        s = s1;
        v.b(((Exception) (obj)).getMessage());
        if (s1 != null)
        {
            s1.close();
        }
        return false;
        s;
_L2:
        if (s1 != null)
        {
            s1.close();
        }
        throw s;
        obj;
        s1 = s;
        s = ((String) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a(String s, ContentValues contentvalues)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = 0L;
        if (!a.isOpen() || a.isReadOnly())
        {
            break MISSING_BLOCK_LABEL_51;
        }
        l1 = a.replace(s, null, contentvalues);
_L1:
        boolean flag;
        if (l1 != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        v.a("Insert not performed, DB closed");
          goto _L1
        s;
        throw s;
    }

    public final boolean a(String s, List list)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        a.beginTransaction();
        list = list.iterator();
        boolean flag = true;
_L3:
        if (!list.hasNext()) goto _L2; else goto _L1
_L1:
        long l1;
        ContentValues contentvalues = (ContentValues)list.next();
        l1 = a.replace(s, null, contentvalues);
        if (flag && l1 != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (true) goto _L3; else goto _L2
_L2:
        a.setTransactionSuccessful();
        c();
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        v.b((new StringBuilder("Failure inserting bulk SQLite records: ")).append(s).toString());
        c();
        flag = flag1;
        if (true) goto _L5; else goto _L4
_L4:
        s;
        throw s;
        s;
        c();
        throw s;
    }

    public final boolean a(String s, List list, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        a.beginTransaction();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ContentValues contentvalues = (ContentValues)list.next();
            StringBuilder stringbuilder = new StringBuilder(s1);
            stringbuilder.append("='").append(contentvalues.get(s1)).append('\'');
            if (a.update(s, contentvalues, stringbuilder.toString(), null) == 0)
            {
                a.insert(s, null, contentvalues);
            }
        } while (true);
          goto _L1
        s;
        v.b((new StringBuilder("Failure inserting bulk SQLite records (with updating enabled): ")).append(s).toString());
        c();
        boolean flag = false;
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L1:
        a.setTransactionSuccessful();
        c();
        flag = true;
        if (true) goto _L3; else goto _L2
_L2:
        s;
        c();
        throw s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final Cursor b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = a.query(s, new String[] {
            "*"
        }, null, null, null, null, null);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public final Cursor b(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s = a.query(s, new String[] {
            "*"
        }, s1, null, null, null, null);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        a = (new f(ManagerApp.c())).getWritableDatabase();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (a.isOpen() && !a.isReadOnly())
        {
            a.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(s).toString());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

}
