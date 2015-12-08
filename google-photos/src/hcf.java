// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class hcf
    implements Runnable
{

    private List a;
    private hce b;

    hcf(hce hce1, List list)
    {
        b = hce1;
        a = list;
        super();
    }

    public final void run()
    {
        hci hci1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); hce.a(b, hci1))
        {
            hci1 = (hci)iterator.next();
        }

        b.a.remove(a);
    }
}
