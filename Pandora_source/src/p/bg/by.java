// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.h;
import p.bh.u;

public class by extends h
{

    public by()
    {
    }

    public void a(String s)
    {
        if (s != null)
        {
            d.put("text", s);
            return;
        } else
        {
            d.remove("text");
            return;
        }
    }

    public void a(u u)
    {
        if (u != null)
        {
            d.put("type", u);
            return;
        } else
        {
            d.remove("type");
            return;
        }
    }
}
