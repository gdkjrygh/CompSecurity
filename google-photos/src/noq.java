// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

public final class noq
{

    public final ConcurrentHashMap a = new ConcurrentHashMap();
    private final Context b;

    public noq(Context context)
    {
        b = context;
    }

    public final void a(int i)
    {
        a(20, null, true);
    }

    public final void a(int i, int j)
    {
        if (a.get(Integer.valueOf(i)) != null)
        {
            (new StringBuilder(54)).append("Failing to start staged event: ").append(i).append(",").append(j);
            return;
        } else
        {
            a.put(Integer.valueOf(i), new nor(this, oby.c(), j));
            return;
        }
    }

    public final void a(int i, String s, boolean flag)
    {
        Object obj = (nor)a.get(Integer.valueOf(i));
        if (obj != null) goto _L2; else goto _L1
_L1:
        (new StringBuilder(66)).append("Trying to stop a duration event which was not started: ").append(i);
_L4:
        return;
_L2:
        boolean flag1;
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        int j = ((nor) (obj)).b - 1;
        obj.b = j;
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = false;
_L5:
        if (flag1)
        {
            a.remove(Integer.valueOf(i));
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        s = new oby(i, ((nor) (obj)).a);
        s.a();
        s.b = null;
        s.b(((nor) (obj)).c.b);
        obj = ((nor) (obj)).c;
        s = String.valueOf(s.toString());
        if (s.length() != 0)
        {
            "Duration event recorded: ".concat(s);
        } else
        {
            new String("Duration event recorded: ");
        }
        flag1 = true;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final void a(int ai[])
    {
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            int k = ai[i];
            if (a.containsKey(Integer.valueOf(k)))
            {
                b(k);
            }
        }

    }

    public final void b(int i)
    {
        if (a.get(Integer.valueOf(i)) == null)
        {
            (new StringBuilder(68)).append("Trying to cancel a duration event which was not started: ").append(i);
            return;
        } else
        {
            a.remove(Integer.valueOf(i));
            (new StringBuilder(36)).append("Cancel a duration event: ").append(i);
            return;
        }
    }

    public final void b(int ai[])
    {
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            int k = ai[i];
            if (a.containsKey(Integer.valueOf(k)))
            {
                a(k, null, false);
            }
        }

    }

    static 
    {
        noq.getSimpleName();
    }
}
