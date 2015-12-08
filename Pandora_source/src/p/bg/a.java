// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import java.util.Vector;
import p.bd.e;

// Referenced classes of package p.bg:
//            ab

public class a extends e
{

    public a()
    {
        super("AddCommand");
    }

    public void a(Vector vector)
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

    public void a(ab ab)
    {
        if (ab != null)
        {
            b.put("menuParams", ab);
            return;
        } else
        {
            b.remove("menuParams");
            return;
        }
    }

    public void b(Integer integer)
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
