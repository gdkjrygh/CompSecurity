// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class i extends a
{

    private static final i b = new i();
    private static final String c = "KEY_CONTACTS_EVER_SCANNED_FOR_FIND_FRIENDS";
    private static final String d = "KEY_FACEBOOK_EVER_SCANNED_FOR_FIND_FRIENDS";
    private static final String e = "KEY_FACEBOOK_LINKED_TO_FITBIT";
    private static final String f = "KEY_CONTACTS_EVER_STARTED_SCAN";
    private static final String g = "KEY_FACEBOOK_EVER_STARTED_SCAN";

    i()
    {
        super("FriendsSavedState");
    }

    public static void a(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = m().edit();
        editor.putBoolean("KEY_CONTACTS_EVER_SCANNED_FOR_FIND_FRIENDS", flag);
        editor.apply();
    }

    public static void b(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = m().edit();
        editor.putBoolean("KEY_FACEBOOK_LINKED_TO_FITBIT", flag);
        editor.apply();
    }

    public static void c(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = m().edit();
        editor.putBoolean("KEY_FACEBOOK_EVER_SCANNED_FOR_FIND_FRIENDS", flag);
        editor.apply();
    }

    public static void d(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = m().edit();
        editor.putBoolean("KEY_CONTACTS_EVER_STARTED_SCAN", flag);
        editor.apply();
    }

    public static void e(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = m().edit();
        editor.putBoolean("KEY_FACEBOOK_EVER_STARTED_SCAN", flag);
        editor.apply();
    }

    protected static a g()
    {
        return b;
    }

    public static boolean h()
    {
        return m().getBoolean("KEY_CONTACTS_EVER_SCANNED_FOR_FIND_FRIENDS", false);
    }

    public static boolean i()
    {
        return m().getBoolean("KEY_FACEBOOK_LINKED_TO_FITBIT", false);
    }

    public static boolean j()
    {
        return m().getBoolean("KEY_FACEBOOK_EVER_SCANNED_FOR_FIND_FRIENDS", false);
    }

    public static boolean k()
    {
        return m().getBoolean("KEY_CONTACTS_EVER_STARTED_SCAN", false);
    }

    public static boolean l()
    {
        return m().getBoolean("KEY_FACEBOOK_EVER_STARTED_SCAN", false);
    }

    private static SharedPreferences m()
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

    public volatile void a(Context context, int i1, int j1, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, i1, j1, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int i1, int j1, android.content.SharedPreferences.Editor editor)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        android.content.SharedPreferences.Editor editor1 = context.edit();
        if (context.contains("SavedState.KEY_CONTACTS_EVER_SCANNED_FOR_FIND_FRIENDS"))
        {
            editor.putBoolean("KEY_CONTACTS_EVER_SCANNED_FOR_FIND_FRIENDS", context.getBoolean("SavedState.KEY_CONTACTS_EVER_SCANNED_FOR_FIND_FRIENDS", false));
            editor1.remove("SavedState.KEY_CONTACTS_EVER_SCANNED_FOR_FIND_FRIENDS");
        }
        if (context.contains("SavedState.KEY_FACEBOOK_LINKED_TO_FITBIT"))
        {
            editor.putBoolean("KEY_FACEBOOK_LINKED_TO_FITBIT", context.getBoolean("SavedState.KEY_FACEBOOK_LINKED_TO_FITBIT", false));
            editor1.remove("SavedState.KEY_FACEBOOK_LINKED_TO_FITBIT");
        }
        if (context.contains("SavedState.KEY_FACEBOOK_EVER_SCANNED_FOR_FIND_FRIENDS"))
        {
            editor.putBoolean("KEY_FACEBOOK_EVER_SCANNED_FOR_FIND_FRIENDS", context.getBoolean("SavedState.KEY_FACEBOOK_EVER_SCANNED_FOR_FIND_FRIENDS", false));
            editor1.remove("SavedState.KEY_FACEBOOK_EVER_SCANNED_FOR_FIND_FRIENDS");
        }
        if (context.contains("SavedState.KEY_CONTACTS_EVER_STARTED_SCAN"))
        {
            editor.putBoolean("KEY_CONTACTS_EVER_STARTED_SCAN", context.getBoolean("SavedState.KEY_CONTACTS_EVER_STARTED_SCAN", false));
            editor1.remove("SavedState.KEY_CONTACTS_EVER_STARTED_SCAN");
        }
        if (context.contains("SavedState.KEY_FACEBOOK_EVER_STARTED_SCAN"))
        {
            editor.putBoolean("KEY_FACEBOOK_EVER_STARTED_SCAN", context.getBoolean("SavedState.KEY_FACEBOOK_EVER_STARTED_SCAN", false));
            editor1.remove("SavedState.KEY_FACEBOOK_EVER_STARTED_SCAN");
        }
        editor1.apply();
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
        android.content.SharedPreferences.Editor editor = m().edit();
        editor.remove("KEY_CONTACTS_EVER_SCANNED_FOR_FIND_FRIENDS");
        editor.remove("KEY_FACEBOOK_EVER_SCANNED_FOR_FIND_FRIENDS");
        editor.remove("KEY_CONTACTS_EVER_STARTED_SCAN");
        editor.remove("KEY_FACEBOOK_EVER_STARTED_SCAN");
        editor.apply();
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
