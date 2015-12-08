// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment.settings;

import kik.android.util.an;

// Referenced classes of package kik.android.chat.fragment.settings:
//            PreferenceFragment

public static class  extends an
{

    static int a( )
    {
        return .b("PreferenceFragment.PREFERENCE_LIST_XML_ID", 0);
    }

    public final b a()
    {
        a("PreferenceFragment.PREFERENCE_TOPBAR_ICON", 0);
        return this;
    }

    public final a a(int i)
    {
        a("PreferenceFragment.PREFERENCE_LIST_XML_ID", i);
        return this;
    }

    public final a a(String s)
    {
        a("PreferenceFragment.PREFERENCE_CALLOUT_SHOWN", s);
        return this;
    }

    public final int b()
    {
        return b("PreferenceFragment.PREFERENCE_BACK_BUTTON", 0);
    }

    public final b b(int i)
    {
        a("PreferenceFragment.PREFERENCE_BACK_BUTTON", i);
        return this;
    }

    public final String c()
    {
        String s = g("PreferenceFragment.PREFERENCE_CALLOUT_SHOWN");
        if (s != null)
        {
            return s;
        } else
        {
            return "";
        }
    }

    public final g d()
    {
        a("PreferenceFragment.PREFERENCE_SHOW_SHADOW", true);
        return this;
    }

    public final boolean e()
    {
        return f("PreferenceFragment.PREFERENCE_SHOW_SHADOW").booleanValue();
    }

    public ()
    {
    }
}
