// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

static final class 
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (acK)obj;
        obj1 = (acK)obj1;
        int i = acK.a(((acK) (obj))).c();
        int j = acK.a(((acK) (obj1))).c();
        if (i < j)
        {
            return -1;
        }
        return i <= j ? 0 : 1;
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
