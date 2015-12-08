// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Property;

final class ang.Class extends Property
{

    public final Object get(Object obj)
    {
        return Float.valueOf(diu.a((diu)obj));
    }

    public final void set(Object obj, Object obj1)
    {
        diu.a((diu)obj, ((Float)obj1).floatValue());
    }

    (Class class1, String s)
    {
        super(class1, s);
    }
}
