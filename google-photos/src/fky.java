// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class fky
{

    private final Context a;

    fky(Context context)
    {
        a = context;
    }

    final Set a()
    {
        b.v();
        Object obj = neh.a(a);
        if (obj == null)
        {
            return null;
        }
        HashSet hashset = new HashSet();
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); hashset.add(String.valueOf((Integer)((Iterator) (obj)).next()))) { }
        return hashset;
    }
}
