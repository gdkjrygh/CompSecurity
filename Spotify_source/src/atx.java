// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Hashtable;
import java.util.Vector;

public final class atx extends atk
{

    public atx()
    {
        super("AddCommand");
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
