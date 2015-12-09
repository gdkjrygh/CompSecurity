// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.database.Cursor;

// Referenced classes of package com.aviary.android.feather.cds:
//            t

public static class <init> extends <init>
{

    private String a;
    private String b;

    public static <init> a(Cursor cursor)
    {
        if (b(cursor))
        {
            <init> <init>1 = new <init>(cursor.getLong(cursor.getColumnIndex("version_id")));
            int i = cursor.getColumnIndex("version_versionKey");
            if (i > -1)
            {
                <init>1.a = cursor.getString(i);
            }
            i = cursor.getColumnIndex("version_assetsBaseURL");
            if (i > -1)
            {
                <init>1.b = cursor.getString(i);
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
        b b1 = new <init>(s);
        b1.b = b;
        b1.a = a;
        return b1;
    }

    public String toString()
    {
        return (new StringBuilder()).append("VersionColumns.Version{ id: ").append(s).append(", versionKey: ").append(a).append(", assetsBaseURL: ").append(b).append(" }").toString();
    }

    public (long l)
    {
        super(l);
    }
}
