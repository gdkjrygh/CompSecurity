// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.a;

import com.qihoo.security.engine.AdPluginInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class e
{
    class a
    {

        public Set a;
        public String b;
        final e c;

        a()
        {
            c = e.this;
            super();
        }
    }


    private int a;
    private int b;
    private int c;
    private int d;
    private HashMap e;
    private int f;

    public e()
    {
        e = new HashMap();
        b = 0;
        a = 0;
        f = 0;
        c = 0;
        d = 0;
    }

    public void a(int i)
    {
        a = i;
    }

    public boolean a()
    {
        return a != 0;
    }

    public boolean a(AdPluginInfo adplugininfo)
    {
        adplugininfo.AdAllRisk = b;
        adplugininfo.AdAllType = a;
        com.qihoo.security.engine.AdPluginInfo.AdPlugin aadplugin[] = new com.qihoo.security.engine.AdPluginInfo.AdPlugin[f];
        Iterator iterator = e.entrySet().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext() || i >= f)
            {
                adplugininfo.AdPlugins = aadplugin;
                return true;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            Object obj1 = ((a)((java.util.Map.Entry) (obj)).getValue()).a;
            obj = ((a)((java.util.Map.Entry) (obj)).getValue()).b;
            obj1 = ((Set) (obj1)).iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                String s = (String)((Iterator) (obj1)).next();
                com.qihoo.security.engine.AdPluginInfo.AdPlugin adplugin = new com.qihoo.security.engine.AdPluginInfo.AdPlugin();
                adplugin.name = s;
                adplugin.description = ((String) (obj));
                aadplugin[i] = adplugin;
                i++;
            }
        } while (true);
    }

    public boolean a(String s, Set set, String s1)
    {
        a a1 = new a();
        a1.b = s1;
        a1.a = set;
        if (e.put(s, a1) != null)
        {
            return false;
        } else
        {
            f = f + set.size();
            return true;
        }
    }

    public void b(int i)
    {
        b = i;
    }
}
