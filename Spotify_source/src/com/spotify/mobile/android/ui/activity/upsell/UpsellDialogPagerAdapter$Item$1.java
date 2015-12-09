// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyPrice;
import frh;
import gin;

// Referenced classes of package com.spotify.mobile.android.ui.activity.upsell:
//            Reason

final class nit> extends nit>
{

    public final String a(Context context, Flags flags, String s)
    {
        String s1 = SpotifyPrice.a(s, com.spotify.mobile.android.util.dapter.Item._fld1);
        if (s1 == null)
        {
            return super.nit>(context, flags, s);
        } else
        {
            return context.getString(0x7f0805cb, new Object[] {
                context.getString(0x7f0805cd, new Object[] {
                    s1
                })
            });
        }
    }

    protected final boolean a(Reason reason, Flags flags, gin gin)
    {
        return !frh.a(gin, reason, flags) && nit>(reason, flags);
    }

    (String s, com.spotify.mobile.android.util.viewuri.tem._cls1 _pcls1)
    {
        super(s, 1, _pcls1);
    }
}
