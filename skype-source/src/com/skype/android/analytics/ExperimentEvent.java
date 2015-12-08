// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;


public final class ExperimentEvent extends Enum
{

    public static final ExperimentEvent a;
    public static final ExperimentEvent b;
    public static final ExperimentEvent c;
    public static final ExperimentEvent d;
    public static final ExperimentEvent e;
    public static final ExperimentEvent f;
    public static final ExperimentEvent g;
    public static final ExperimentEvent h;
    public static final ExperimentEvent i;
    public static final ExperimentEvent j;
    public static final ExperimentEvent k;
    private static final ExperimentEvent l[];

    private ExperimentEvent(String s, int i1)
    {
        super(s, i1);
    }

    public static ExperimentEvent valueOf(String s)
    {
        return (ExperimentEvent)Enum.valueOf(com/skype/android/analytics/ExperimentEvent, s);
    }

    public static ExperimentEvent[] values()
    {
        return (ExperimentEvent[])l.clone();
    }

    static 
    {
        a = new ExperimentEvent("exp_add_friends_from_contact_list", 0);
        b = new ExperimentEvent("exp_calendar_integration", 1);
        c = new ExperimentEvent("exp_calendar_integration_selected", 2);
        d = new ExperimentEvent("exp_calendar_integration_cancelled_from_outlook_upsell_screen", 3);
        e = new ExperimentEvent("exp_signout_hidden", 4);
        f = new ExperimentEvent("exp_signout_hidden_active_user", 5);
        g = new ExperimentEvent("exp_signout_hidden_logout", 6);
        h = new ExperimentEvent("exp_spex_moji_forward", 7);
        i = new ExperimentEvent("exp_spex_moji_forward_success", 8);
        j = new ExperimentEvent("exp_spex_moji_title", 9);
        k = new ExperimentEvent("exp_spex_moji_title_success", 10);
        l = (new ExperimentEvent[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
