// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package com.pandora.android.coachmark:
//            c, a

public abstract class d
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/android/coachmark/d$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("STANDARD", 0);
            b = new a("APP_COMPAT", 1);
            c = new a("ACTIONBAR_SHERLOCK", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public d()
    {
    }

    public static d a(Activity activity)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[b(activity).ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return new c(activity);

        case 2: // '\002'
            return new com.pandora.android.coachmark.a(activity);
        }
    }

    private static a b(Activity activity)
    {
        for (activity = activity.getClass(); activity != android/app/Activity; activity = activity.getSuperclass())
        {
            if (activity.getSimpleName().equals("ActionBarActivity"))
            {
                return a.b;
            }
        }

        return a.a;
    }

    public abstract View a();

    public ViewParent b()
    {
        return a().getParent().getParent();
    }
}
