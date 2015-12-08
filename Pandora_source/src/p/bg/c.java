// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.e;

public class c extends e
{

    public c()
    {
        super("AddSubMenu");
    }

    public void a(String s)
    {
        if (s != null)
        {
            b.put("menuName", s);
            return;
        } else
        {
            b.remove("menuName");
            return;
        }
    }

    public void b(Integer integer)
    {
        if (integer != null)
        {
            b.put("menuID", integer);
            return;
        } else
        {
            b.remove("menuID");
            return;
        }
    }

    public void c(Integer integer)
    {
        if (integer != null)
        {
            b.put("position", integer);
            return;
        } else
        {
            b.remove("position");
            return;
        }
    }
}
