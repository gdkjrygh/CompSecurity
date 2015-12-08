// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class e extends a
{

    private static final e b = new e();
    private static final String c = "CHALLENGES_SET_KEY";
    private static final String d = "ENTERED_END_OF_CHALLENGE_SET_KEY";

    e()
    {
        super("ChallengesSavedState");
    }

    private static android.content.SharedPreferences.Editor a(SharedPreferences sharedpreferences)
    {
        return sharedpreferences.edit();
    }

    private static Set a(Set set)
    {
        Object obj = set;
        if (set == null)
        {
            obj = new HashSet();
        }
        return ((Set) (obj));
    }

    public static void a(String s)
    {
        SharedPreferences sharedpreferences = h();
        Set set = a(sharedpreferences.getStringSet("ENTERED_END_OF_CHALLENGE_SET_KEY", null));
        set.add(s);
        s = a(sharedpreferences);
        s.putStringSet("ENTERED_END_OF_CHALLENGE_SET_KEY", set);
        s.apply();
    }

    public static void a(Collection collection)
    {
        SharedPreferences sharedpreferences = h();
        Set set = a(sharedpreferences.getStringSet("CHALLENGES_SET_KEY", null));
        set.retainAll(collection);
        collection = a(sharedpreferences);
        collection.putStringSet("CHALLENGES_SET_KEY", set);
        collection.apply();
    }

    public static boolean b(String s)
    {
        return !h().getStringSet("ENTERED_END_OF_CHALLENGE_SET_KEY", Collections.emptySet()).contains(s);
    }

    public static void c(String s)
    {
        if (s == null)
        {
            return;
        } else
        {
            SharedPreferences sharedpreferences = h();
            Set set = a(sharedpreferences.getStringSet("CHALLENGES_SET_KEY", null));
            set.add(s);
            s = a(sharedpreferences);
            s.putStringSet("CHALLENGES_SET_KEY", set);
            s.apply();
            return;
        }
    }

    public static boolean d(String s)
    {
        return !h().getStringSet("CHALLENGES_SET_KEY", Collections.emptySet()).contains(s);
    }

    protected static a g()
    {
        return b;
    }

    private static SharedPreferences h()
    {
        return b.b();
    }

    public volatile int a()
    {
        return super.a();
    }

    public volatile SharedPreferences a(Context context)
    {
        return super.a(context);
    }

    public volatile void a(Context context, int i, int j, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, i, j, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int i, int j, android.content.SharedPreferences.Editor editor)
    {
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
    }

    public volatile void e()
    {
        super.e();
    }

    public volatile String f()
    {
        return super.f();
    }

}
