// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

// Referenced classes of package b.a:
//            be, bc

public final class ba
{

    public JSONArray a;

    public ba(be be1)
    {
        a = new JSONArray();
        be1 = be1.c().iterator();
        do
        {
            if (!be1.hasNext())
            {
                break;
            }
            Object obj = ((bc)be1.next()).a();
            if (obj != null)
            {
                a.put(obj);
            }
        } while (true);
    }
}
