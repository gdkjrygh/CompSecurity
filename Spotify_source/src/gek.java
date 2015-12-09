// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class gek
{

    public static final String e[] = {
        "is_syncing", "done_count", "total_count", "progress"
    };
    public Set a;
    public int b;
    public int c;
    public int d;
    public gfi f;
    private gfk g;

    public gek(Context context)
    {
        a = new HashSet();
        g = new gfk() {

            private gek a;

            public final void a(gfi gfi1, Cursor cursor)
            {
                boolean flag = false;
                if (cursor.moveToFirst())
                {
                    if (cursor.getInt(0) != 0)
                    {
                        flag = true;
                    }
                    gek.a(flag);
                    gek.a(a, cursor.getInt(1));
                    gek.b(a, cursor.getInt(2));
                    gek.c(a, cursor.getInt(3));
                    gfi1 = a.a.iterator();
                    while (gfi1.hasNext()) 
                    {
                        ((gel)gfi1.next()).e();
                    }
                }
            }

            
            {
                a = gek.this;
                super();
            }
        };
        f = new gfi(context, g);
    }

    static int a(gek gek1, int i)
    {
        gek1.b = i;
        return i;
    }

    static boolean a(boolean flag)
    {
        return flag;
    }

    static int b(gek gek1, int i)
    {
        gek1.c = i;
        return i;
    }

    static int c(gek gek1, int i)
    {
        gek1.d = i;
        return i;
    }

}
