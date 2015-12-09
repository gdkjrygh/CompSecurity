// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import com.spotify.mobile.android.spotlets.tinkerbell.TooltipContainer;

public class fjm
    implements dmx
{

    public fjm()
    {
    }

    public static fjn a(Activity activity)
    {
        return new fjn(TooltipContainer.a(activity));
    }

    public static void a(TooltipContainer tooltipcontainer)
    {
        if (tooltipcontainer.c())
        {
            tooltipcontainer.a(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.aZ);
            tooltipcontainer.dismiss();
        }
    }
}
