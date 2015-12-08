// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.h;
import p.bh.t;

// Referenced classes of package p.bg:
//            z

public class bn extends h
{

    public bn()
    {
    }

    public void a(Boolean boolean1)
    {
        if (boolean1 != null)
        {
            d.put("isHighlighted", boolean1);
            return;
        } else
        {
            d.remove("isHighlighted");
            return;
        }
    }

    public void a(Integer integer)
    {
        if (integer != null)
        {
            d.put("softButtonID", integer);
            return;
        } else
        {
            d.remove("softButtonID");
            return;
        }
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

    public void a(z z)
    {
        if (z != null)
        {
            d.put("image", z);
            return;
        } else
        {
            d.remove("image");
            return;
        }
    }

    public void a(t t)
    {
        if (t != null)
        {
            d.put("type", t);
            return;
        } else
        {
            d.remove("type");
            return;
        }
    }
}
