// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class etq
{

    private int a;
    private List b;

    public etq(List list)
    {
        a = -1;
        b = new ArrayList();
        ho ho1;
        for (list = list.iterator(); list.hasNext(); b.add(ho.a(ho1.a, new eth((eth)ho1.b))))
        {
            ho1 = (ho)list.next();
        }

    }

    public final boolean a()
    {
        do
        {
            if (b.isEmpty())
            {
                return false;
            }
            a = (a + 1) % b.size();
            Object obj = (ho)b.get(a);
            if (((eth)((ho) (obj)).b).a == -1 || ((eth)((ho) (obj)).b).a > 0)
            {
                if (((eth)((ho) (obj)).b).a > 0)
                {
                    obj = (eth)((ho) (obj)).b;
                    obj.a = ((eth) (obj)).a - 1;
                }
                return true;
            }
            if (((eth)((ho) (obj)).b).a != 0)
            {
                break;
            }
            b.remove(a);
            if (a > b.size() - 1)
            {
                a = a - 1;
            }
        } while (true);
        return !b.isEmpty();
    }

    public final com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.Item b()
    {
        boolean flag;
        if (a >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "Invalid index. Did you call hasNextItemToDisplay?");
        return (com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.Item)((ho)b.get(a)).a;
    }
}
