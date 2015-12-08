// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.speech.s3;

import com.google.android.apps.gsa.a.a.d;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.languages.Language;
import com.google.f.e.j;
import com.google.f.e.k;
import com.google.f.e.l;
import com.google.f.e.o;
import com.google.f.f.a.e;
import com.google.f.f.a.m;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class h
    implements d
{

    public Language a;
    private final String b;
    private final List c;
    private final int d;
    private final String e;
    private final boolean f;
    private final boolean g;

    public h(String s, List list, boolean flag, String s1, boolean flag1, boolean flag2)
    {
        b = s;
        c = list;
        int i;
        if (flag)
        {
            i = 2;
        } else
        {
            i = 0;
        }
        d = i;
        e = s1;
        f = flag1;
        g = flag2;
    }

    private static j a(String s)
    {
        j j1 = new j();
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            j1.b = s;
            j1.a = j1.a | 1;
            j1.c = 1;
            j1.a = j1.a | 2;
            return j1;
        }
    }

    public final void a(l l1)
    {
        Object obj = new e();
        obj.f = true;
        obj.b = ((e) (obj)).b | 2;
        obj.j = false;
        obj.b = ((e) (obj)).b | 0x1000;
        obj.g = true;
        obj.b = ((e) (obj)).b | 4;
        obj.h = d;
        obj.b = ((e) (obj)).b | 0x80;
        obj.k = true;
        obj.b = ((e) (obj)).b | 0x80000;
        obj.d = 5;
        obj.b = ((e) (obj)).b | 1;
        l1.setExtension(e.a, obj);
        obj = (new o()).a(e);
        obj.c = a(b);
        ((o) (obj)).a(com.google.android.libraries.translate.e.o.b());
        if (c != null)
        {
            j aj[] = new j[c.size()];
            for (Iterator iterator = c.iterator(); iterator.hasNext();)
            {
                aj[0] = a((String)iterator.next());
            }

            obj.d = aj;
        }
        l1.setExtension(o.a, obj);
        obj = new k();
        ((k) (obj)).d("atrans");
        l1.setExtension(k.a, obj);
        if (f)
        {
            m m1 = new m();
            if (a != null)
            {
                String s = a.getShortName();
                if (s == null)
                {
                    throw new NullPointerException();
                }
                m1.c = s;
                m1.b = m1.b | 8;
                a.getShortName();
            }
            String s1 = Singleton.c();
            if (s1 == null)
            {
                throw new NullPointerException();
            }
            m1.e = s1;
            m1.b = m1.b | 0x20;
            s1 = Locale.getDefault().toString();
            if (s1 == null)
            {
                throw new NullPointerException();
            }
            m1.f = s1;
            m1.b = m1.b | 0x40;
            if (g)
            {
                m1.d = true;
                m1.b = m1.b | 0x10;
            }
            l1.setExtension(m.a, m1);
        }
    }
}
