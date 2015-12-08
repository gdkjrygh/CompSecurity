// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.offline.flags.OfflineSyncSwitchVisibility;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class evw
{

    public evw()
    {
    }

    public static evv a(Flags flags, evs evs, evr evr)
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[OfflineSyncSwitchVisibility.values().length];
                try
                {
                    a[OfflineSyncSwitchVisibility.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[OfflineSyncSwitchVisibility.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[((OfflineSyncSwitchVisibility)flags.a(fys.aP)).ordinal()])
        {
        default:
            return new evu(evs, evr);

        case 1: // '\001'
            return new evu(evs, evr);

        case 2: // '\002'
            return new evt(evs, evr);
        }
    }
}
