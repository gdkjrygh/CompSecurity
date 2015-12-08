// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.util.ArrayList;
import java.util.HashMap;

class >
{

    ArrayList a;
    ArrayList b;
    ArrayList c;
    HashMap d;

    boolean a(ata.g g)
    {
        if (g != null)
        {
            ArrayList arraylist = g.d("update");
            a = arraylist;
            if (arraylist != null)
            {
                ArrayList arraylist1 = g.d("install");
                b = arraylist1;
                if (arraylist1 != null)
                {
                    g = g.d("session_start");
                    c = g;
                    if (g != null)
                    {
                        d.put("update", a);
                        d.put("install", b);
                        d.put("session_start", c);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    ata.g()
    {
        a = new ArrayList();
        b = new ArrayList();
        c = new ArrayList();
        d = new HashMap();
    }
}
