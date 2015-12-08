// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.a;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

// Referenced classes of package com.microsoft.onlineid.internal.a:
//            d

public abstract class com.microsoft.onlineid.internal.a.a
{
    public static class a
    {

        protected final android.content.SharedPreferences.Editor a;

        protected a a(d d1, int i)
        {
            a.putInt(d1.a(), i);
            return this;
        }

        protected a a(d d1, String s)
        {
            a.putString(d1.a(), s);
            return this;
        }

        protected a a(d d1, Set set)
        {
            a.putStringSet(d1.a(), set);
            return this;
        }

        public final boolean a()
        {
            return a.commit();
        }

        protected a b()
        {
            a.clear();
            return this;
        }

        protected a(android.content.SharedPreferences.Editor editor)
        {
            a = editor;
        }
    }


    protected final SharedPreferences a;

    protected com.microsoft.onlineid.internal.a.a(Context context, String s)
    {
        a = context.getSharedPreferences(s, 0);
    }

    protected int a(d d1)
    {
        return a.getInt(d1.a(), ((Integer)d1.b()).intValue());
    }

    protected String b(d d1)
    {
        return a.getString(d1.a(), (String)d1.b());
    }

    protected Set c(d d1)
    {
        return a.getStringSet(d1.a(), (Set)d1.b());
    }
}
