// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class igx
{

    public final int a = 20;
    public final HashMap b = new HashMap(20);
    public final List c = new ArrayList(20);
    public boolean d;

    public igx(int i)
    {
    }

    public void a()
    {
        b.clear();
        for (int i = 0; i < c.size(); i++)
        {
            String s = (String)c.get(i);
            b.put(s, Integer.valueOf(i + 1));
        }

    }

    public final String toString()
    {
        String s = String.valueOf(c);
        return (new StringBuilder(String.valueOf(s).length() + 30)).append("RecentAppLookup {recentList: ").append(s).append("}").toString();
    }
}
