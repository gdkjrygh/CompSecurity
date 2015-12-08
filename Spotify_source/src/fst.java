// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.activity.upsell.Reason;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class fst
{

    public static boolean a(Reason reason, String s, String s1)
    {
        if (!Arrays.asList(new String[] {
    "cross-promo", "info", "paywall"
}).contains(s))
        {
            String.format(Locale.US, "Attempted to log invalid offer promotional display type: %s", new Object[] {
                s
            });
        }
        if (!Arrays.asList(new String[] {
    "add-to-queue", "play-on-demand", "enable-extreme-quality", "disable-shuffle", "ad-is-playing", "content-unavailable", "skip-limit-reached", "cap-limit-reached", "offline-sync-content", "offline-sync-quality", 
    "offline-sync-cellular", "offline-mode", "listen-offline", "trial-ended", "showcase", "user-initiated"
}).contains(reason.mMappedReason))
        {
            String.format(Locale.US, "Attempted to log invalid reason type for upsell: %s", new Object[] {
                reason.mMappedReason
            });
        }
        if (!Arrays.asList(new String[] {
    "banner", "full-page", "inline", "popup", "tooltip"
}).contains(s1))
        {
            String.format(Locale.US, "Attempted to log invalid style for upsell: %s", new Object[] {
                s1
            });
        }
        return true;
    }
}
