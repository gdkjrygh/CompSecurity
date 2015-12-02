// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.installreport;

import android.content.ContentValues;
import android.text.TextUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class d
{

    public int a;
    public int b;
    public String c;
    public long d;
    public int e;
    public int f;
    public int g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;

    public d(int i1, int j1, String s, long l1, int k1, int i2, 
            int j2, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        a = i1;
        b = j1;
        c = s;
        d = l1;
        e = k1;
        f = i2;
        g = j2;
        h = s1;
        i = s2;
        j = s3;
        k = s4;
        l = s5;
        m = s6;
    }

    public ContentValues a()
    {
        if (TextUtils.isEmpty(c))
        {
            return null;
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("tp", Integer.valueOf(b));
        contentvalues.put("pn", c);
        contentvalues.put("ts", Long.valueOf(d));
        contentvalues.put("rn", Integer.valueOf(e));
        contentvalues.put("mid", Integer.valueOf(f));
        contentvalues.put("pid", Integer.valueOf(g));
        contentvalues.put("adid", h);
        contentvalues.put("p1", i);
        contentvalues.put("p2", j);
        contentvalues.put("c1", k);
        contentvalues.put("c2", l);
        contentvalues.put("c3", m);
        if (contentvalues.size() <= 0)
        {
            contentvalues = null;
        }
        return contentvalues;
    }

    public String toString()
    {
        DateFormat dateformat = SimpleDateFormat.getInstance();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{mType:");
        stringbuilder.append(b);
        stringbuilder.append(", mPackName:");
        stringbuilder.append(c);
        stringbuilder.append(", mTimeStamp:");
        stringbuilder.append(d);
        stringbuilder.append("(");
        stringbuilder.append(dateformat.format(Long.valueOf(d)));
        stringbuilder.append(")");
        stringbuilder.append(", mLine:");
        stringbuilder.append(e);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
