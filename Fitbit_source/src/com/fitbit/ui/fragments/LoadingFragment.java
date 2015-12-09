// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.fragments;

import android.view.View;

// Referenced classes of package com.fitbit.ui.fragments:
//            FitbitFragment

public abstract class LoadingFragment extends FitbitFragment
{
    protected static final class VisibilityState extends Enum
    {

        public static final VisibilityState a;
        public static final VisibilityState b;
        public static final VisibilityState c;
        private static final VisibilityState d[];

        public static VisibilityState valueOf(String s)
        {
            return (VisibilityState)Enum.valueOf(com/fitbit/ui/fragments/LoadingFragment$VisibilityState, s);
        }

        public static VisibilityState[] values()
        {
            return (VisibilityState[])d.clone();
        }

        static 
        {
            a = new VisibilityState("PROGRESS", 0);
            b = new VisibilityState("CONTENT", 1);
            c = new VisibilityState("PLACEHOLDER", 2);
            d = (new VisibilityState[] {
                a, b, c
            });
        }

        private VisibilityState(String s, int i)
        {
            super(s, i);
        }
    }


    public LoadingFragment()
    {
    }

    protected abstract View a();

    protected void a(VisibilityState visibilitystate)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[VisibilityState.values().length];
                try
                {
                    a[VisibilityState.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[VisibilityState.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[VisibilityState.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[visibilitystate.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 44
    //                   2 86
    //                   3 128;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException();
_L2:
        a().setVisibility(0);
        d().setVisibility(8);
        e().setVisibility(8);
        if (v_() != null)
        {
            v_().setVisibility(0);
        }
_L6:
        return;
_L3:
        a().setVisibility(8);
        d().setVisibility(8);
        e().setVisibility(0);
        if (v_() != null)
        {
            v_().setVisibility(0);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        a().setVisibility(8);
        d().setVisibility(0);
        e().setVisibility(8);
        if (v_() != null)
        {
            v_().setVisibility(8);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected abstract View d();

    protected abstract View e();

    protected View v_()
    {
        return null;
    }
}
