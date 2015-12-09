// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.onboarding.premium.offline.OfflineSyncFeatureOnboarding;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class ewb
{

    public static Optional a(Context context, Flags flags, Verified verified)
    {
        flags = (OfflineSyncFeatureOnboarding)flags.a(fys.aO);
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[OfflineSyncFeatureOnboarding.values().length];
                try
                {
                    a[OfflineSyncFeatureOnboarding.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls1.a[flags.ordinal()])
        {
        default:
            return Optional.e();

        case 1: // '\001'
            return Optional.c(new ewc(context, verified));
        }
    }
}
