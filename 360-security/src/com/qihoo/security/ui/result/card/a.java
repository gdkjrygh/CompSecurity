// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.card;


public class a
{

    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public Object f;
    public Object g;
    public Object h;

    public a()
    {
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("priority:").append(d).append(",needOptimized:").append(e).append(",type:").append(a).append(",title:");
        Object obj;
        if (f == null)
        {
            obj = "";
        } else
        {
            obj = f;
        }
        stringbuilder = stringbuilder.append(obj).append(",description:");
        if (g == null)
        {
            obj = "";
        } else
        {
            obj = g.toString();
        }
        stringbuilder = stringbuilder.append(((String) (obj))).append(",operation:");
        if (h == null)
        {
            obj = "";
        } else
        {
            obj = h.toString();
        }
        return stringbuilder.append(((String) (obj))).append(",iconBgColorId:").append(b).append(",iconId:").append(c).toString();
    }
}
