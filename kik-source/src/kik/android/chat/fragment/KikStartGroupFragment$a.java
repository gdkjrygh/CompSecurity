// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import java.util.ArrayList;

// Referenced classes of package kik.android.chat.fragment:
//            KikStartGroupFragment

public static final class  extends 
{

    public final  a(ArrayList arraylist)
    {
        return c(arraylist);
    }

    public final c a(String s)
    {
        a("kik.android.chat.fragment.StartGroupFragment.UserBeingUpgraded", s);
        return this;
    }

    public final a c(ArrayList arraylist)
    {
        a("kik.android.chat.fragment.StartGroupFragment.PreselectedUsers", arraylist);
        return this;
    }

    public final ArrayList d()
    {
        return m("kik.android.chat.fragment.StartGroupFragment.PreselectedUsers");
    }

    public final m e()
    {
        a("kik.android.chat.fragment.StartGroupFragment.IsFromTalkTo", true);
        return this;
    }

    public final boolean f()
    {
        return f("kik.android.chat.fragment.StartGroupFragment.IsFromTalkTo").booleanValue();
    }

    public final String g()
    {
        return g("kik.android.chat.fragment.StartGroupFragment.UserBeingUpgraded");
    }

    public ()
    {
    }
}
