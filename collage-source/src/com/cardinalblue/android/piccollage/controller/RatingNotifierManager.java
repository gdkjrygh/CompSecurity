// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.content.SharedPreferences;
import com.cardinalblue.android.a.a;
import com.cardinalblue.android.b.c;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.lib.d;
import com.cardinalblue.android.piccollage.model.gson.IGsonable;
import com.cardinalblue.android.piccollage.model.gson.PICDeviceConfig;

public class RatingNotifierManager
{
    public static class RequirementMetEvent
        implements IGsonable
    {

        public RequirementMetEvent()
        {
        }
    }

    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/cardinalblue/android/piccollage/controller/RatingNotifierManager$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("RATING_DIALOG_PROMPT", 0);
            b = new a("LAUNCH_APP", 1);
            c = new a("SHARE_OR_SAVE", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }

    public static class b
    {

        private a a;

        public a a()
        {
            return a;
        }

        public b(a a1)
        {
            a = a1;
        }
    }

    public static interface c
    {

        public abstract boolean a();

        public abstract void b();
    }

    public class d extends e
    {

        final RatingNotifierManager a;

        public boolean a()
        {
            boolean flag = super.a();
            int i = k.j().getInt("pref_rating_launch_count", -1);
            com.cardinalblue.android.piccollage.lib.d d1 = (com.cardinalblue.android.piccollage.lib.d)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/d);
            return flag && i >= d1.a().getRatePromptMinUses();
        }

        public void b()
        {
            super.b();
            android.content.SharedPreferences.Editor editor = k.j().edit();
            editor.remove("pref_rating_launch_count");
            editor.apply();
        }

        public d()
        {
            a = RatingNotifierManager.this;
            super();
        }
    }

    public class e
        implements c
    {

        final RatingNotifierManager b;

        public boolean a()
        {
            SharedPreferences sharedpreferences = k.j();
            return !com.cardinalblue.android.b.c.a(k.a()).equals(sharedpreferences.getString("pref_rating_prompt_version", null));
        }

        public void b()
        {
            android.content.SharedPreferences.Editor editor = k.j().edit();
            editor.remove("pref_rating_prompt_version");
            editor.apply();
        }

        public e()
        {
            b = RatingNotifierManager.this;
            super();
        }
    }


    private static RatingNotifierManager a;
    private c b;

    private RatingNotifierManager()
    {
        b = new d();
    }

    public static RatingNotifierManager a()
    {
        if (a == null)
        {
            a = new RatingNotifierManager();
        }
        return a;
    }

    private void c()
    {
        android.content.SharedPreferences.Editor editor = k.j().edit();
        editor.remove("pref_rating_launch_count");
        editor.remove("pref_rating_share_or_save");
        editor.putString("pref_rating_prompt_version", com.cardinalblue.android.b.c.a(k.a()));
        editor.apply();
    }

    private void d()
    {
        Object obj = k.j();
        int i = ((SharedPreferences) (obj)).getInt("pref_rating_launch_count", 0);
        if (i < ((com.cardinalblue.android.piccollage.lib.d)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/d)).a().getRatePromptMinUses())
        {
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putInt("pref_rating_launch_count", i + 1);
            ((android.content.SharedPreferences.Editor) (obj)).apply();
        }
    }

    private void e()
    {
        Object obj = k.j();
        if (((SharedPreferences) (obj)).getInt("pref_rating_launch_count", 1) >= ((com.cardinalblue.android.piccollage.lib.d)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/d)).a().getRatePromptMinUses())
        {
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putBoolean("pref_rating_share_or_save", true);
            ((android.content.SharedPreferences.Editor) (obj)).apply();
        }
    }

    public void b()
    {
        if (b != null)
        {
            b.b();
        }
    }

    public RequirementMetEvent checkRequirementMet()
    {
        if (b != null && b.a())
        {
            return new RequirementMetEvent();
        } else
        {
            return null;
        }
    }

    public void onConditionHit(b b1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[com.cardinalblue.android.piccollage.controller.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.controller.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.cardinalblue.android.piccollage.controller._cls1.a[b1.a().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            c();
            return;

        case 2: // '\002'
            d();
            return;

        case 3: // '\003'
            e();
            break;
        }
    }
}
