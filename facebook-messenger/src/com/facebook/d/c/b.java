// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.d.c;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.base.Supplier;
import javax.inject.a;

// Referenced classes of package com.facebook.d.c:
//            a

class b
    implements a
{

    final Supplier a;
    final com.facebook.d.c.a b;

    b(com.facebook.d.c.a a1, Supplier supplier)
    {
        b = a1;
        a = supplier;
        super();
    }

    public SQLiteDatabase a()
    {
        return (SQLiteDatabase)a.get();
    }

    public Object b()
    {
        return a();
    }
}
