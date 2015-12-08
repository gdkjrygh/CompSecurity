// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.e;

import android.content.Context;
import android.content.SharedPreferences;
import com.microsoft.onlineid.internal.c.d;
import com.microsoft.onlineid.internal.k;
import com.microsoft.onlineid.internal.o;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.microsoft.onlineid.internal.e:
//            a, d

public final class c
{
    public static final class a
    {

        private final android.content.SharedPreferences.Editor a;

        public final a a(String s)
        {
            a.remove(s);
            return this;
        }

        public final a a(String s, long l)
        {
            a.putLong(s, l);
            return this;
        }

        public final a a(String s, Object obj, com.microsoft.onlineid.internal.e.a a1)
            throws com.microsoft.onlineid.internal.e.d
        {
            if (obj != null)
            {
                try
                {
                    a.putString(s, a1.a(obj));
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw new com.microsoft.onlineid.internal.e.d(s);
                }
            }
            return this;
        }

        public final a a(String s, String s1)
        {
            a.putString(s, s1);
            return this;
        }

        public final a a(String s, Set set)
        {
            a.putStringSet(s, set);
            return this;
        }

        public final void a()
        {
            a.apply();
        }

        public a(android.content.SharedPreferences.Editor editor)
        {
            a = editor;
        }
    }


    private final SharedPreferences a;

    public c(Context context)
    {
        k.a(context, "applicationContext");
        a = context.getSharedPreferences("com.microsoft.onlineid", 0);
    }

    public c(Context context, String s)
    {
        k.a(context, "applicationContext");
        o.a(s, "name");
        a = context.getSharedPreferences(s, 0);
    }

    public final a a()
    {
        return new a(a.edit());
    }

    public final Object a(String s, com.microsoft.onlineid.internal.e.a a1)
    {
        Object obj;
        Object obj1;
        boolean flag;
        obj1 = null;
        obj = null;
        flag = false;
        String s1 = a(s, ((String) (null)));
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        obj = a1.a(s1);
        flag = true;
_L2:
        if (!flag)
        {
            a().a(s).a();
        }
        return obj;
        a1;
        d.b("Object in storage was not of expected type.", a1);
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        a1;
        d.b("Object in storage was corrupt.", a1);
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final String a(String s)
    {
        return a(s, ((String) (null)));
    }

    public final String a(String s, String s1)
    {
        return a.getString(s, s1);
    }

    public final Set b(String s)
    {
        return a.getStringSet(s, Collections.emptySet());
    }

    public final long c(String s)
    {
        return a.getLong(s, 0L);
    }
}
