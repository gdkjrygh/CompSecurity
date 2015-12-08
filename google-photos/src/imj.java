// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class imj
{

    public final List a;

    public imj(Set set)
    {
        boolean flag;
        if (set.size() <= 31)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        a = new ArrayList(set);
        Collections.sort(a);
    }
}
