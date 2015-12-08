// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.mobile.android.ui.activity.upsell.consumables.ConsumablePeriod;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import frh;
import gin;

// Referenced classes of package com.spotify.mobile.android.ui.activity.upsell:
//            Reason

final class nit> extends nit>
{

    public final String a(Context context, Flags flags, String s)
    {
        s = frh.a(flags);
        ConsumablePeriod consumableperiod = frh.b(flags);
        int i = frh.c(flags);
        context = context.getResources();
        if (i == 1)
        {
            return context.getString(consumableperiod.mDescriptionOneId, new Object[] {
                s
            });
        } else
        {
            return context.getQuantityString(consumableperiod.mDescriptionId, i, new Object[] {
                Integer.valueOf(i), s
            });
        }
    }

    protected final boolean a(Reason reason, Flags flags, gin gin)
    {
        return frh.a(gin, reason, flags);
    }

    (String s, com.spotify.mobile.android.util.viewuri.tem._cls2 _pcls2)
    {
        super(s, 2, _pcls2);
    }
}
