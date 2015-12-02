// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.bi;

import android.content.ContentValues;
import android.text.TextUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class d
{

    public int a;
    public String b;
    public long c;
    public int d;

    public d(boolean flag, String s, long l)
    {
        this(flag, s, l, -1);
    }

    public d(boolean flag, String s, long l, int i)
    {
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 2;
        }
        a = j;
        b = s;
        c = l;
        d = i;
    }

    public ContentValues a()
    {
        if (!TextUtils.isEmpty(b)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        ContentValues contentvalues = new ContentValues();
        if (1 != a) goto _L4; else goto _L3
_L3:
        if (-1 == d || 0L == c) goto _L1; else goto _L5
_L5:
        contentvalues.put("tp", Integer.valueOf(a));
        contentvalues.put("pn", b);
        contentvalues.put("ts", Long.valueOf(c));
        contentvalues.put("rn", Integer.valueOf(d));
_L7:
        if (contentvalues.size() <= 0)
        {
            contentvalues = null;
        }
        return contentvalues;
_L4:
        if (2 != a) goto _L7; else goto _L6
_L6:
        if (0L == c) goto _L1; else goto _L8
_L8:
        contentvalues.put("tp", Integer.valueOf(a));
        contentvalues.put("pn", b);
        contentvalues.put("ts", Long.valueOf(c));
          goto _L7
    }

    public String toString()
    {
        DateFormat dateformat = SimpleDateFormat.getInstance();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{mType:");
        stringbuilder.append(a);
        stringbuilder.append(", mPackName:");
        stringbuilder.append(b);
        stringbuilder.append(", mTimeStamp:");
        stringbuilder.append(c);
        stringbuilder.append("(");
        stringbuilder.append(dateformat.format(Long.valueOf(c)));
        stringbuilder.append(")");
        stringbuilder.append(", mLine:");
        stringbuilder.append(d);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
