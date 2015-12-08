// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.fitbit.activity.ui.activitylog.LogNewExerciseFragment;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RecordExerciseActivity, PreRunScreen

private static class c extends FragmentPagerAdapter
{
    static final class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        private static final Type c[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/fitbit/runtrack/ui/RecordExerciseActivity$OptionsPager$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])c.clone();
        }

        static 
        {
            a = new Type("Tracking", 0);
            b = new Type("ManualLog", 1);
            c = (new Type[] {
                a, b
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    private PreRunScreen a;
    private LogNewExerciseFragment b;
    private final List c;

    private PreRunScreen a()
    {
        if (a == null)
        {
            PreRunScreen prerunscreen = new PreRunScreen();
            a = prerunscreen;
            return prerunscreen;
        } else
        {
            return a;
        }
    }

    static PreRunScreen a(a a1)
    {
        return a1.a();
    }

    private LogNewExerciseFragment b()
    {
        if (b == null)
        {
            LogNewExerciseFragment lognewexercisefragment = new LogNewExerciseFragment();
            b = lognewexercisefragment;
            return lognewexercisefragment;
        } else
        {
            return b;
        }
    }

    public int getCount()
    {
        return c.size();
    }

    public Fragment getItem(int i)
    {
        switch (c[((Type)c.get(i)).ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return a();

        case 2: // '\002'
            return b();
        }
    }

    public Type(FragmentManager fragmentmanager, boolean flag)
    {
        super(fragmentmanager);
        fragmentmanager = EnumSet.allOf(com/fitbit/runtrack/ui/RecordExerciseActivity$OptionsPager$Type);
        if (!flag)
        {
            fragmentmanager.remove(Type.a);
        }
        c = new LinkedList(fragmentmanager);
    }
}
