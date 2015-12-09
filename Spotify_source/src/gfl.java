// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class gfl
{

    private static String f[] = {
        "permissions", "access_token", "post_open_graph", "enabled"
    };
    Set a;
    public String b[];
    public boolean c;
    public Context d;
    public gfi e;
    private gfk g;

    public gfl(Context context)
    {
        a = new HashSet();
        g = new gfk() {

            private gfl a;

            public final void a(gfi gfi1, Cursor cursor)
            {
                if (cursor.moveToFirst())
                {
                    gfi1 = a;
                    String as[] = gcw.a(cursor, 0, "").split(",");
                    cursor.getString(1);
                    cursor.getInt(2);
                    gfl.a(gfi1, as, gcw.a(cursor, 3));
                    gfi1 = a;
                    cursor = ((gfl) (gfi1)).a.iterator();
                    while (cursor.hasNext()) 
                    {
                        ((gfm)cursor.next()).a(gfi1);
                    }
                }
            }

            
            {
                a = gfl.this;
                super();
            }
        };
        d = context;
        e = new gfi(d, g);
    }

    public static void a(Context context, int i)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("post_open_graph", String.valueOf(i));
        context.getContentResolver().update(dty.a, contentvalues, null, null);
    }

    public static void a(Context context, String s)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("access_token", s);
        context.getContentResolver().update(dty.a, contentvalues, null, null);
    }

    public static void a(Context context, boolean flag, String s)
    {
        ContentValues contentvalues = new ContentValues();
        if (!flag)
        {
            s = "";
        }
        contentvalues.put("update_user_state", s);
        context.getContentResolver().update(dty.a, contentvalues, null, null);
    }

    public static void a(Context context, String as[])
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("permissions", TextUtils.join(",", as));
        context.getContentResolver().update(dty.a, contentvalues, null, null);
    }

    static void a(gfl gfl1, String as[], boolean flag)
    {
        gfl1.b = as;
        gfl1.c = flag;
    }

    public final void a()
    {
        e.a(dty.a, f);
    }

    public final void a(int i)
    {
        a(d, i);
    }

    public final void a(gfm gfm)
    {
        a.add(gfm);
    }

    public final void b(gfm gfm)
    {
        a.remove(gfm);
    }

}
