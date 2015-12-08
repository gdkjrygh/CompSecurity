// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.List;

public final class baq
{

    public final int a;
    public final List b;
    public final List c;

    public baq(int i, List list, List list1)
    {
        a = i;
        b = Collections.unmodifiableList(list);
        if (list1 == null)
        {
            c = Collections.emptyList();
            return;
        } else
        {
            c = Collections.unmodifiableList(list1);
            return;
        }
    }

    public final boolean a()
    {
        return !c.isEmpty();
    }
}
