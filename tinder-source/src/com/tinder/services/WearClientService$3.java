// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.services;

import com.tinder.e.l;
import com.tinder.e.u;
import com.tinder.managers.ab;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

// Referenced classes of package com.tinder.services:
//            WearClientService

final class b
    implements Runnable
{

    final boolean a;
    final String b;
    final WearClientService c;

    public final void run()
    {
        ab ab1;
        java.util.LinkedList linkedlist;
        Object obj;
        LinkedHashSet linkedhashset;
        boolean flag;
        if (a)
        {
            l l = new l() {

                final WearClientService._cls3 a;

                public final void a(int i)
                {
                }

                public final void c()
                {
                }

                public final void d()
                {
                }

            
            {
                a = WearClientService._cls3.this;
                super();
            }
            };
            c.b.a(b, l);
        } else
        {
            u u = new u() {

                final WearClientService._cls3 a;

                public final void c()
                {
                }

                public final void d()
                {
                }

                public final void f()
                {
                }

            
            {
                a = WearClientService._cls3.this;
                super();
            }
            };
            c.b.a(b, u);
        }
        ab1 = c.b;
        obj = b;
        linkedlist = ab1.a;
        obj = Arrays.asList(new String[] {
            obj
        });
        linkedhashset = new LinkedHashSet(linkedlist.size() + ((Collection) (obj)).size());
        flag = linkedhashset.addAll(linkedlist);
        if (linkedhashset.addAll(((Collection) (obj))) | flag)
        {
            ab1.g();
        }
        new ArrayList(linkedhashset);
    }

    _cls2.a(WearClientService wearclientservice, boolean flag, String s)
    {
        c = wearclientservice;
        a = flag;
        b = s;
        super();
    }
}
