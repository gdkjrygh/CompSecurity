// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.h;
import p.bh.k;

public class z extends h
{

    public z()
    {
    }

    public void a(String s)
    {
        if (s != null)
        {
            d.put("value", s);
            return;
        } else
        {
            d.remove("value");
            return;
        }
    }

    public void a(k k)
    {
        if (k != null)
        {
            d.put("imageType", k);
            return;
        } else
        {
            d.remove("imageType");
            return;
        }
    }
}
