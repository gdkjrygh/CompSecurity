// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.query.internal.Operator;
import com.google.android.gms.drive.query.internal.f;
import java.util.Iterator;
import java.util.List;

public class c
    implements f
{

    public c()
    {
    }

    public String a(b b1, Object obj)
    {
        return String.format("contains(%s,%s)", new Object[] {
            b1.getName(), obj
        });
    }

    public String a(Operator operator, MetadataField metadatafield, Object obj)
    {
        return String.format("cmp(%s,%s,%s)", new Object[] {
            operator.getTag(), metadatafield.getName(), obj
        });
    }

    public String a(Operator operator, List list)
    {
        StringBuilder stringbuilder = new StringBuilder((new StringBuilder()).append(operator.getTag()).append("(").toString());
        list = list.iterator();
        for (operator = ""; list.hasNext(); operator = ",")
        {
            String s = (String)list.next();
            stringbuilder.append(operator);
            stringbuilder.append(s);
        }

        return stringbuilder.append(")").toString();
    }

    public Object b(b b1, Object obj)
    {
        return a(b1, obj);
    }

    public Object b(Operator operator, MetadataField metadatafield, Object obj)
    {
        return a(operator, metadatafield, obj);
    }

    public Object b(Operator operator, List list)
    {
        return a(operator, list);
    }

    public String bq(String s)
    {
        return String.format("not(%s)", new Object[] {
            s
        });
    }

    public String c(MetadataField metadatafield)
    {
        return String.format("fieldOnly(%s)", new Object[] {
            metadatafield.getName()
        });
    }

    public String c(MetadataField metadatafield, Object obj)
    {
        return String.format("has(%s,%s)", new Object[] {
            metadatafield.getName(), obj
        });
    }

    public Object d(MetadataField metadatafield)
    {
        return c(metadatafield);
    }

    public Object d(MetadataField metadatafield, Object obj)
    {
        return c(metadatafield, obj);
    }

    public Object j(Object obj)
    {
        return bq((String)obj);
    }

    public String jc()
    {
        return "all()";
    }

    public Object jd()
    {
        return jc();
    }
}
