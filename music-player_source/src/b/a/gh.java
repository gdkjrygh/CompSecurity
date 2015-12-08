// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class gh
{

    private Context a;
    private Set b;

    public gh(Context context)
    {
        b = new HashSet();
        a = context;
    }

    public final void a()
    {
        if (!b.isEmpty())
        {
            StringBuilder stringbuilder = new StringBuilder();
            for (Iterator iterator = b.iterator(); iterator.hasNext(); stringbuilder.append(','))
            {
                stringbuilder.append((String)iterator.next());
            }

            stringbuilder.deleteCharAt(stringbuilder.length() - 1);
            a.getSharedPreferences("umeng_general_config", 0).edit().putString("invld_id", stringbuilder.toString()).commit();
        }
    }

    public final boolean a(String s)
    {
        return !b.contains(s);
    }

    public final void b()
    {
        int i = 0;
        String s = a.getSharedPreferences("umeng_general_config", 0).getString("invld_id", null);
        if (!TextUtils.isEmpty(s))
        {
            String as[] = s.split(",");
            if (as != null)
            {
                for (int j = as.length; i < j; i++)
                {
                    String s1 = as[i];
                    if (!TextUtils.isEmpty(s1))
                    {
                        b.add(s1);
                    }
                }

            }
        }
    }

    public final void b(String s)
    {
        b.add(s);
    }
}
