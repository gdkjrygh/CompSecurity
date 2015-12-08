// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class noz
{

    private final int a;
    private final List b;
    private final List c;
    private final String d;

    private transient noz(int i, String s, List list, String as[])
    {
        a = i;
        b = list;
        d = a(s, as);
        c = new ArrayList(as.length + 1);
        c.add(s);
        Collections.addAll(c, as);
    }

    private static String a(String s, String as[])
    {
        StringBuilder stringbuilder = oqs.a();
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append(as[i]).append("_");
        }

        stringbuilder.append(s);
        return oqs.b(stringbuilder);
    }

    public static transient noz a(Context context, int i, String s, String as[])
    {
        return new noz(i, s, olm.c(context, npc), as);
    }

    public static transient noz a(Context context, String s, String as[])
    {
        return a(context, 6, s, as);
    }

    public final boolean a()
    {
        int j = b.size();
        for (int i = 0; i < j; i++)
        {
            if (((npc)b.get(i)).a(c, a))
            {
                return true;
            }
        }

        return false;
    }
}
