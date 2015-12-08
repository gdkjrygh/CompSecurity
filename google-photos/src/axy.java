// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class axy
{

    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final List b = new ArrayList();
    public boolean c;

    public axy()
    {
    }

    public final void a()
    {
        for (Iterator iterator = bag.a(a).iterator(); iterator.hasNext(); a((ayo)iterator.next())) { }
        b.clear();
    }

    public final boolean a(ayo ayo1)
    {
        boolean flag;
        if (ayo1 != null && (a.remove(ayo1) || b.remove(ayo1)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            ayo1.d();
            ayo1.i();
        }
        return flag;
    }

    public final String toString()
    {
        String s = String.valueOf(super.toString());
        int i = a.size();
        boolean flag = c;
        return (new StringBuilder(String.valueOf(s).length() + 41)).append(s).append("{numRequests=").append(i).append(", isPaused=").append(flag).append("}").toString();
    }
}
