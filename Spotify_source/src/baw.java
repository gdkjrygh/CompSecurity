// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.List;

public final class baw
{

    public final List a;

    public baw(List list)
    {
        a = Collections.unmodifiableList(list);
    }

    public final int a(int i)
    {
        int k = a.size();
        for (int j = 0; j < k; j++)
        {
            if (((baq)a.get(j)).a == i)
            {
                return j;
            }
        }

        return -1;
    }
}
