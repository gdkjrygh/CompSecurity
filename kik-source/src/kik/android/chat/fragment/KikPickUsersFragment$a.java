// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import java.util.ArrayList;

// Referenced classes of package kik.android.chat.fragment:
//            KikPickUsersFragment

public static class .a extends .a
{

    public final int a()
    {
        return b("KikPickUsersFragment.EXTRA_MIN_RESULTS", 1);
    }

    public b a(ArrayList arraylist)
    {
        a("KikPickUsersFragment.EXTRA_PRESELECTED_USERS", arraylist);
        return this;
    }

    public final a a(boolean flag)
    {
        a("KikPickUsersFragment.EXTRA_FILTER_SELF", flag);
        return this;
    }

    public final int b()
    {
        return b("KikPickUsersFragment.EXTRA_MAX_RESULTS", b("KikPickUsersFragment.EXTRA_MIN_RESULTS", 1));
    }

    public final b b(int i)
    {
        a("KikPickUsersFragment.EXTRA_MIN_RESULTS", i);
        return this;
    }

    public final a b(ArrayList arraylist)
    {
        a("KikPickUsersFragment.EXTRA_FILTERED_USERS", arraylist);
        return this;
    }

    public final a c(int i)
    {
        a("KikPickUsersFragment.EXTRA_MAX_RESULTS", i);
        return this;
    }

    public final boolean c()
    {
        return b("KikPickUsersFragment.EXTRA_FILTER_SELF", true).booleanValue();
    }

    public ArrayList d()
    {
        return m("KikPickUsersFragment.EXTRA_PRESELECTED_USERS");
    }

    public .a()
    {
    }
}
