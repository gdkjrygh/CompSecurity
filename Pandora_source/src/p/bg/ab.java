// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.h;

public class ab extends h
{

    public ab()
    {
    }

    public void a(Integer integer)
    {
        if (integer != null)
        {
            d.put("parentID", integer);
            return;
        } else
        {
            d.remove("parentID");
            return;
        }
    }

    public void a(String s)
    {
        if (s != null)
        {
            d.put("menuName", s);
            return;
        } else
        {
            d.remove("menuName");
            return;
        }
    }

    public void b(Integer integer)
    {
        if (integer != null)
        {
            d.put("position", integer);
            return;
        } else
        {
            d.remove("position");
            return;
        }
    }
}
