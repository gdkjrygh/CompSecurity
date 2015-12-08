// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ipc
    implements ipo
{

    private ipb a;

    public ipc(ipb ipb1)
    {
        a = ipb1;
        super();
    }

    public final void a(int i, int j, float f)
    {
        Object obj = a;
        String s = ipb.a(i, j);
        if (((ipb) (obj)).c.containsKey(s))
        {
            for (obj = ((List)((ipb) (obj)).c.get(s)).iterator(); ((Iterator) (obj)).hasNext(); ((ipp)((Iterator) (obj)).next()).a(f)) { }
        }
    }
}
