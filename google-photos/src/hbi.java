// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class hbi
    implements had, haz, hhg
{

    private final Context a;
    private final int b[];
    private final HashMap c;

    public hbi(Context context, List list)
    {
        a = context;
        b = new int[list.size()];
        c = new HashMap(list.size());
        context = list.iterator();
        for (int i = 0; context.hasNext(); i++)
        {
            list = (hbl)context.next();
            b[i] = ((hbl) (list)).a;
            c.put(Integer.valueOf(((hbl) (list)).a), list);
        }

    }

    public transient hbi(Context context, hbl ahbl[])
    {
        this(context, Arrays.asList(ahbl));
    }

    public static int a(Context context, int i)
    {
        context = context.getResources().getDisplayMetrics();
        int j = ((DisplayMetrics) (context)).widthPixels / i;
        return (int)((float)((((DisplayMetrics) (context)).heightPixels / j) * i) * 3.5F);
    }

    public final int a(int i)
    {
        return ((hbl)c.get(Integer.valueOf(i))).b;
    }

    public final afn a(ViewGroup viewgroup, int i)
    {
        if (Log.isLoggable("PhotoGridViewProvider", 2))
        {
            String s = String.valueOf(a.getResources().getResourceEntryName(i));
            if (s.length() != 0)
            {
                "create view id: ".concat(s);
            } else
            {
                new String("create view id: ");
            }
        }
        if (c.containsKey(Integer.valueOf(i)))
        {
            return ((hbl)c.get(Integer.valueOf(i))).a(viewgroup);
        } else
        {
            viewgroup = a.getResources().getResourceEntryName(i);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(viewgroup).length() + 34)).append("Invalid viewType: ").append(i).append(" id: ").append(viewgroup).toString());
        }
    }

    public final int[] a()
    {
        return b;
    }

    public final int b(int i)
    {
        return ((hbl)c.get(Integer.valueOf(i))).a();
    }
}
