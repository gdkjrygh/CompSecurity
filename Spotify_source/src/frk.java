// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class frk
{

    public frk()
    {
    }

    public static fri a(Context context, Flags flags, Reason reason)
    {
        Object obj = new fsf(Cosmos.getResolver(context), de.a(context));
        frx frx1 = new frx(context, flags);
        dmz.a(fsi);
        obj = new fri(((com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository) (obj)), frx1, fsi.a(context));
        boolean flag;
        if (reason == Reason.d && ((Boolean)flags.a(fys.ag)).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj.e = flag;
        if (frh.a(context, reason, flags))
        {
            context = frh.b(flags);
            int i = frh.c(flags);
            flags = frh.a(flags);
            obj.f = true;
            obj.g = flags;
            obj.i = i;
            obj.h = context;
        }
        return ((fri) (obj));
    }
}
