// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class eve
{

    public final String a;
    public final List b;

    private eve(String s, Collection collection)
    {
        a = s;
        b = new ArrayList(collection);
    }

    public transient eve(String s, String as[])
    {
        this(s, ((Collection) (Arrays.asList(as))));
    }
}
