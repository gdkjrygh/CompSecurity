// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobile.android.ui.activity.upsell.ondemand.OnDemandUpsellVariationFlag;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public class ftz
    implements dmx
{

    public ftz()
    {
    }

    public static ddl a(Context context, ViewGroup viewgroup, Flags flags)
    {
        boolean flag2 = true;
        boolean flag = true;
        if (!gex.a(flags) && flags.a(fys.aK) != OnDemandUpsellVariationFlag.a)
        {
            if (gex.a(flags))
            {
                flag = false;
            }
            viewgroup = dds.b(context, viewgroup, flag);
        } else
        {
            boolean flag1;
            if (!gex.a(flags))
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            viewgroup = dds.a(context, viewgroup, flag1);
        }
        viewgroup.a(gae.b(context));
        return viewgroup;
    }
}
