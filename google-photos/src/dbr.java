// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Property;

final class dbr extends Property
{

    dbr(Class class1, String s)
    {
        super(class1, s);
    }

    public final Object get(Object obj)
    {
        return Float.valueOf(dbq.c((dbq)obj));
    }

    public final void set(Object obj, Object obj1)
    {
        obj = (dbq)obj;
        obj1 = (Float)obj1;
        if (dbq.c(((dbq) (obj))) != ((Float) (obj1)).floatValue())
        {
            dbq.a(((dbq) (obj)), ((Float) (obj1)).floatValue());
            ((dbq) (obj)).invalidate();
        }
    }
}
