// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package com.ford.syncV4.e.c:
//            y

public final class h extends com.ford.syncV4.e.h
{

    public h()
    {
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
            d.put("choiceID", integer);
        }
    }

    public final void a(String s)
    {
        if (s != null)
        {
            d.put("menuName", s);
        }
    }

    public final void a(Vector vector)
    {
        if (vector != null)
        {
            d.put("vrCommands", vector);
        }
    }
}
