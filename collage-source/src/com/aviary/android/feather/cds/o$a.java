// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.database.Cursor;

// Referenced classes of package com.aviary.android.feather.cds:
//            o

static final class <init> extends <init>
{

    private String a;
    private String b;

    public static <init> a(Cursor cursor)
    {
        if (b(cursor))
        {
            <init> <init>1 = new <init>(cursor.getLong(0));
            int i = cursor.getColumnIndex("perm_value");
            if (i > -1)
            {
                <init>1.b = cursor.getString(i);
            }
            i = cursor.getColumnIndex("perm_hash");
            if (i > -1)
            {
                <init>1.a = cursor.getString(i);
            }
            return <init>1;
        } else
        {
            return null;
        }
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public Object clone()
    {
        b b1 = new <init>(p());
        b1.a = a;
        b1.b = b;
        return b1;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PermissionColumns.Permission{").append(b).append(", ").append(a).append("}").toString();
    }

    public (long l)
    {
        super(l);
    }
}
