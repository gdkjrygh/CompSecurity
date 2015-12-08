// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import java.util.Comparator;

// Referenced classes of package com.tinder.model:
//            ConnectionsGroup, CommonConnection

private static class <init>
    implements Comparator
{

    public int compare(CommonConnection commonconnection, CommonConnection commonconnection1)
    {
        int i = commonconnection.degree;
        int j = commonconnection1.degree;
        if (i > j)
        {
            return 1;
        }
        return i != j ? -1 : 0;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((CommonConnection)obj, (CommonConnection)obj1);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
