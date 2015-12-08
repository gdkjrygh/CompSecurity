// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class fao
{

    public final noz a;
    public final List b;

    public fao(Context context, List list)
    {
        p.b(a(list), "duplicate or out of order upgrade steps.");
        b = Collections.unmodifiableList(list);
        a = noz.a(context, 4, "Upgrader", new String[0]);
    }

    private static boolean a(List list)
    {
        Iterator iterator = list.iterator();
        fan fan1;
        for (list = null; iterator.hasNext(); list = fan1)
        {
            fan1 = (fan)iterator.next();
            if (list != null && list.a() >= fan1.a())
            {
                return false;
            }
        }

        return true;
    }
}
