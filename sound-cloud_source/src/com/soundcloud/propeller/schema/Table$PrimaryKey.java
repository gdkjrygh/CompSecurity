// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.schema;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.propeller.schema:
//            Table

public static final class columns
    implements Iterable
{

    private final List columns;

    public static transient columns of(String as[])
    {
        return new <init>(as);
    }

    public final Iterator iterator()
    {
        return columns.iterator();
    }

    transient (String as[])
    {
        columns = Arrays.asList(as);
    }
}
