// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import java.util.Vector;
import p.bd.h;

public class j extends h
{

    public j()
    {
    }

    public void a(Integer integer)
    {
        if (integer != null)
        {
            d.put("choiceID", integer);
            return;
        } else
        {
            d.remove("choiceID");
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

    public void a(Vector vector)
    {
        if (vector != null)
        {
            d.put("vrCommands", vector);
            return;
        } else
        {
            d.remove("vrCommands");
            return;
        }
    }
}
