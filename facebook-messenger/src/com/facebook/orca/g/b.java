// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.common.w.k;
import com.facebook.d.d.e;
import com.facebook.d.d.j;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.g;
import com.google.common.a.es;
import com.google.common.a.gb;
import com.google.common.a.hq;
import com.google.common.a.ik;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.orca.g:
//            s, y, aa, d, 
//            c

public class b
{

    private static final String e[] = {
        "thread_id", "action_id", "last_visible_action_id"
    };
    private final aa a;
    private final y b;
    private final g c;
    private volatile boolean d;

    b(aa aa1, y y1, g g1)
    {
        a = aa1;
        b = y1;
        c = g1;
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    public boolean a()
    {
        return d;
    }

    public boolean a(FolderName foldername)
    {
        if (c.a(foldername))
        {
            for (foldername = c.c(foldername).iterator(); foldername.hasNext();)
            {
                if (!a((FolderName)foldername.next()))
                {
                    return false;
                }
            }

            return true;
        } else
        {
            boolean flag;
            if (!b.a(s.c(foldername), true))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;
        }
    }

    public boolean a(String s1)
    {
        SQLiteDatabase sqlitedatabase = a.e();
        j j1 = com.facebook.d.d.e.a("msg_id", s1);
        s1 = j1.a();
        String as[] = j1.b();
        String s2 = Integer.toString(1);
        s1 = sqlitedatabase.query("messages", new String[] {
            "msg_id"
        }, s1, as, null, null, null, s2);
        boolean flag = s1.moveToNext();
        if (flag)
        {
            s1.close();
            return true;
        } else
        {
            s1.close();
            return false;
        }
        Exception exception;
        exception;
        s1.close();
        throw exception;
    }

    public List b(FolderName foldername)
    {
        Object obj;
        SQLiteDatabase sqlitedatabase;
        obj = ik.a();
        sqlitedatabase = a.e();
        String as[] = e;
        foldername = foldername.b();
        String s2 = Integer.toString(25);
        foldername = sqlitedatabase.query("threads", as, "folder=?", new String[] {
            foldername
        }, null, null, "timestamp_ms DESC", s2);
        break MISSING_BLOCK_LABEL_54;
        obj;
        foldername.close();
        throw obj;
        do
        {
            if (!foldername.moveToNext())
            {
                break;
            }
            String s1 = foldername.getString(0);
            if (!"0".equals(s1))
            {
                ((Map) (obj)).put(s1, new d(s1, foldername.getLong(1), foldername.getLong(2)));
            }
        } while (true);
        foldername.close();
        foldername = (new StringBuilder()).append("action_id IN ").append(k.a(gb.a(((Map) (obj)).values(), new c(this)))).toString();
        foldername = sqlitedatabase.query("messages", new String[] {
            "thread_id"
        }, foldername, null, null, null, null);
        while (foldername.moveToNext()) 
        {
            ((Map) (obj)).remove(foldername.getString(0));
        }
        break MISSING_BLOCK_LABEL_227;
        obj;
        foldername.close();
        throw obj;
        foldername.close();
        foldername = ((Map) (obj)).entrySet().iterator();
        do
        {
            if (!foldername.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)foldername.next();
            if (b.a(s.a((String)entry.getKey()), -1L) == ((d)entry.getValue()).a())
            {
                foldername.remove();
            }
        } while (true);
        return hq.a(((Map) (obj)).keySet());
    }

}
