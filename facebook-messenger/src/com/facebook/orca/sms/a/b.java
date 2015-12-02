// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms.a;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android_src.c.j;
import com.facebook.orca.g.aa;
import com.facebook.orca.notify.at;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.m;
import java.util.HashSet;
import java.util.Set;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.sms.a:
//            a

public class b extends ContentObserver
{

    private final ContentResolver a;
    private final aa b;
    private final a c;
    private final a d;
    private final at e;
    private final com.facebook.orca.sms.a.a f;

    public b(ContentResolver contentresolver, aa aa1, at at1, a a1, a a2, com.facebook.orca.sms.a.a a3)
    {
        super(null);
        a = contentresolver;
        b = aa1;
        c = a1;
        d = a2;
        e = at1;
        f = a3;
    }

    private Set a()
    {
        Object obj;
        Object obj1;
        obj = new HashSet();
        obj1 = j.b.buildUpon().appendQueryParameter("simple", "true").build();
        obj1 = a.query(((Uri) (obj1)), new String[] {
            "_id"
        }, null, null, null);
        while (((Cursor) (obj1)).moveToNext()) 
        {
            ((Set) (obj)).add(Long.valueOf(((Cursor) (obj1)).getLong(((Cursor) (obj1)).getColumnIndex("_id"))));
        }
        break MISSING_BLOCK_LABEL_91;
        obj;
        ((Cursor) (obj1)).close();
        throw obj;
        HashSet hashset;
        ((Cursor) (obj1)).close();
        obj1 = b.e().rawQuery("SELECT thread_id FROM threads WHERE folder=? ORDER BY thread_id", new String[] {
            FolderName.d.b()
        });
        hashset = new HashSet();
        for (; ((Cursor) (obj1)).moveToNext(); hashset.add(Long.valueOf(m.c(((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndex("thread_id")))))) { }
        break MISSING_BLOCK_LABEL_179;
        obj;
        ((Cursor) (obj1)).close();
        throw obj;
        ((Cursor) (obj1)).close();
        hashset.removeAll(((java.util.Collection) (obj)));
        return hashset;
    }

    public boolean deliverSelfNotifications()
    {
        return false;
    }

    public void onChange(boolean flag)
    {
        if (((Boolean)c.b()).booleanValue() && ((Boolean)d.b()).booleanValue() && e.a() == null)
        {
            Set set = a();
            if (!set.isEmpty())
            {
                f.a(set);
                return;
            }
        }
    }
}
