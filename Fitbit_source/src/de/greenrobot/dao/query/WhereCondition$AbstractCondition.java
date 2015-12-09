// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.dao.query;

import java.util.List;

// Referenced classes of package de.greenrobot.dao.query:
//            WhereCondition

public static abstract class values
    implements WhereCondition
{

    protected final boolean hasSingleValue;
    protected final Object value;
    protected final Object values[];

    public void appendValuesTo(List list)
    {
        if (hasSingleValue)
        {
            list.add(value);
        }
        if (values != null)
        {
            Object aobj[] = values;
            int j = aobj.length;
            for (int i = 0; i < j; i++)
            {
                list.add(aobj[i]);
            }

        }
    }

    public ()
    {
        hasSingleValue = false;
        value = null;
        values = null;
    }

    public values(Object obj)
    {
        value = obj;
        hasSingleValue = true;
        values = null;
    }

    public values(Object aobj[])
    {
        value = null;
        hasSingleValue = false;
        values = aobj;
    }
}
