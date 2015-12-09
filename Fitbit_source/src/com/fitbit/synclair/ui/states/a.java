// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.ui.states;

import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.synclair.ui.SynclairActivity;
import com.fitbit.synclair.ui.a.b;
import com.fitbit.synclair.ui.a.d;
import com.fitbit.synclair.ui.a.e;
import com.fitbit.synclair.ui.a.f;
import com.fitbit.synclair.ui.a.g;
import com.fitbit.synclair.ui.controller.SynclairType;
import com.fitbit.synclair.ui.states.b.c;

public class a
{

    public a()
    {
    }

    public static f a(SynclairActivity synclairactivity, SynclairType synclairtype, String s)
    {
    /* anonymous class not found */
    class _anm1 {}

        switch (com.fitbit.synclair.ui.states._cls1.b[synclairtype.ordinal()])
        {
        default:
            throw new IllegalArgumentException("No default operation resolvers");

        case 1: // '\001'
            synclairtype = GalileoTrackerType.a(s);
            switch (_cls1.a[synclairtype.ordinal()])
            {
            default:
                return new b(synclairactivity);

            case 1: // '\001'
                return new e(synclairactivity);

            case 2: // '\002'
                return new g(synclairactivity);
            }

        case 2: // '\002'
            return new d(synclairactivity);
        }
    }

    public static com.fitbit.synclair.ui.states.b.d a(SynclairType synclairtype, String s)
    {
        s = GalileoTrackerType.a(s);
        switch (com.fitbit.synclair.ui.states._cls1.b[synclairtype.ordinal()])
        {
        default:
            throw new IllegalArgumentException("No default device states");

        case 1: // '\001'
            switch (_cls1.a[s.ordinal()])
            {
            default:
                return new com.fitbit.synclair.ui.states.b.b();

            case 1: // '\001'
                return new c();

            case 2: // '\002'
                return new com.fitbit.synclair.ui.states.b.e();
            }

        case 2: // '\002'
            return new com.fitbit.synclair.ui.states.b.a();
        }
    }

    public static com.fitbit.synclair.ui.states.a.d b(SynclairType synclairtype, String s)
    {
        s = GalileoTrackerType.a(s);
        switch (com.fitbit.synclair.ui.states._cls1.b[synclairtype.ordinal()])
        {
        default:
            throw new IllegalArgumentException("No default Flows");

        case 1: // '\001'
            switch (_cls1.a[s.ordinal()])
            {
            default:
                return new com.fitbit.synclair.ui.states.a.b();

            case 1: // '\001'
                return new com.fitbit.synclair.ui.states.a.c();

            case 2: // '\002'
                return new com.fitbit.synclair.ui.states.a.e();
            }

        case 2: // '\002'
            return new com.fitbit.synclair.ui.states.a.a();
        }
    }
}
