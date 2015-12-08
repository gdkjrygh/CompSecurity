// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.c.a.o;
import com.ford.syncV4.e.h;
import java.util.Hashtable;

// Referenced classes of package com.ford.syncV4.e.c:
//            y

public final class bl extends h
{

    public bl()
    {
    }

    public final void a(o o)
    {
        if (o != null)
        {
            d.put("type", o);
            return;
        } else
        {
            d.remove("type");
            return;
        }
    }

    public final void a(y y)
    {
        if (y != null)
        {
            d.put("image", y);
            return;
        } else
        {
            d.remove("image");
            return;
        }
    }

    public final void a(Integer integer)
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

    public final void a(String s)
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
}
