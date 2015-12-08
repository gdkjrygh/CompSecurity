// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.e;
import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package com.ford.syncV4.e.c:
//            aa, y

public final class a extends e
{

    public a()
    {
        super("AddCommand");
    }

    public final void a(aa aa)
    {
        b.put("menuParams", aa);
    }

    public final void a(y y)
    {
        b.put("cmdIcon", y);
    }

    public final void a(Vector vector)
    {
        if (vector != null)
        {
            b.put("vrCommands", vector);
            return;
        } else
        {
            b.remove("vrCommands");
            return;
        }
    }

    public final void b(Integer integer)
    {
        if (integer != null)
        {
            b.put("cmdID", integer);
            return;
        } else
        {
            b.remove("cmdID");
            return;
        }
    }
}
