// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.d;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.microsoft.onlineid.a.a;
import com.microsoft.onlineid.a.b;
import com.microsoft.onlineid.internal.e;

// Referenced classes of package com.microsoft.onlineid.d:
//            e, a, c

public final class d
{

    private final com.microsoft.onlineid.d.e a;
    private final com.microsoft.onlineid.d.a b;
    private final c c;
    private final c.a d;

    public d(Context context)
    {
        this(new com.microsoft.onlineid.d.e(context), new com.microsoft.onlineid.d.a(context), new c(context));
    }

    private d(com.microsoft.onlineid.d.e e1, com.microsoft.onlineid.d.a a1, c c1)
    {
        a = e1;
        b = a1;
        c = c1;
        e1 = c;
        a1 = e1.a(new String[] {
            "data2", "data3"
        }, "vnd.android.cursor.item/name");
        boolean flag;
        if (a1 != null && a1.moveToFirst())
        {
            e1 = new c.a(e1, a1.getString(a1.getColumnIndex("data2")), a1.getString(a1.getColumnIndex("data3")));
        } else
        {
            e1 = new c.a(e1, "", "");
        }
        com.microsoft.onlineid.internal.e.a(true);
        if (a1 != null)
        {
            a1.close();
        }
        c1 = com.microsoft.onlineid.a.a.a();
        if (TextUtils.isEmpty(e1.a()))
        {
            a1 = "Does not exist in Me Contact";
        } else
        {
            a1 = "Exists in Me Contact";
        }
        c1.a("User data", "First name", a1);
        c1 = com.microsoft.onlineid.a.a.a();
        if (TextUtils.isEmpty(e1.b()))
        {
            a1 = "Does not exist in Me Contact";
        } else
        {
            a1 = "Exists in Me Contact";
        }
        c1.a("User data", "Last name", a1);
        d = e1;
        if (d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.microsoft.onlineid.internal.e.a(flag);
    }

    public final String a()
    {
        return d.a();
    }

    public final String b()
    {
        return d.b();
    }

    public final String c()
    {
        return b.c();
    }

    public final String d()
    {
        Object obj1 = null;
        Object obj = null;
        Object obj2 = a.a();
        if (TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            obj2 = c.a(new String[] {
                "data2", "data1"
            }, "vnd.android.cursor.item/phone_v2");
            b b1;
            if (obj2 != null)
            {
                obj1 = null;
                do
                {
                    if (!((Cursor) (obj2)).moveToNext())
                    {
                        break;
                    }
                    int i = ((Cursor) (obj2)).getInt(((Cursor) (obj2)).getColumnIndex("data2"));
                    if (i == 2)
                    {
                        if (TextUtils.isEmpty(((CharSequence) (obj1))))
                        {
                            obj1 = ((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("data1"));
                        }
                    } else
                    if (i == 1 && TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        obj = ((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("data1"));
                    }
                } while (true);
                ((Cursor) (obj2)).close();
            } else
            {
                Object obj3 = null;
                obj = obj1;
                obj1 = obj3;
            }
            b1 = com.microsoft.onlineid.a.a.a();
            if (TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                obj2 = "Does not exist in Me Contact";
            } else
            {
                obj2 = "Exists in Me Contact";
            }
            b1.a("User data", "Mobile phone number", ((String) (obj2)));
            b1 = com.microsoft.onlineid.a.a.a();
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj2 = "Does not exist in Me Contact";
            } else
            {
                obj2 = "Exists in Me Contact";
            }
            b1.a("User data", "Home phone number", ((String) (obj2)));
            if (TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                return ((String) (obj));
            } else
            {
                return ((String) (obj1));
            }
        } else
        {
            return ((String) (obj2));
        }
    }

    public final String e()
    {
        return a.b();
    }
}
