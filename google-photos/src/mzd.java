// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class mzd
{

    private static final Set a = Collections.newSetFromMap(new WeakHashMap());

    static Set a()
    {
        return a;
    }

    static void a(mzc mzc)
    {
        if (b.t())
        {
            a.add(mzc);
            return;
        } else
        {
            b.a(new mze(mzc));
            return;
        }
    }

}
