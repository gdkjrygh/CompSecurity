// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.auth.a.a;
import com.facebook.prefs.shared.ac;
import com.facebook.prefs.shared.ad;
import com.facebook.prefs.shared.j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class bk extends a
{

    private final j a;
    private final Set b;
    private final Set c;

    public bk(j j1, Set set, Set set1)
    {
        a = j1;
        b = set;
        c = set1;
    }

    public void e()
    {
        HashSet hashset = new HashSet();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); hashset.addAll(((ad)iterator.next()).a())) { }
        a.a(hashset);
    }

    public void f()
    {
        HashSet hashset = new HashSet();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); hashset.addAll(((ac)iterator.next()).a())) { }
        a.a(hashset);
    }
}
