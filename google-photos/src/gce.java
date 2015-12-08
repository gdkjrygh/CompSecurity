// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;

public final class gce
    implements hdq
{

    private final erj a;
    private final noz b;
    private final noz c;

    public gce(Context context, erj erj1)
    {
        a = erj1;
        b = noz.a(context, 3, "AllSyncManager", new String[] {
            "sync"
        });
        c = noz.a(context, "AllSyncManager", new String[] {
            "sync"
        });
    }

    public final void a(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Integer integer = (Integer)list.next();
            if (b.a())
            {
                noy.a(integer.intValue());
            }
            try
            {
                a.a(integer.intValue(), "local media sync complete", null);
            }
            catch (mmy mmy1)
            {
                if (c.a())
                {
                    noy.a(integer.intValue());
                }
            }
        } while (true);
    }
}
