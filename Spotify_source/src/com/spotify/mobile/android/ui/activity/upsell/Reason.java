// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell;

import android.text.TextUtils;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class Reason extends Enum
{

    public static final Reason a;
    public static final Reason b;
    public static final Reason c;
    public static final Reason d;
    public static final Reason e;
    public static final Reason f;
    public static final Reason g;
    public static final Reason h;
    public static final Reason i;
    public static final Reason j;
    public static final Reason k;
    public static final Reason l;
    public static final Reason m;
    private static Map n;
    private static final Reason o[];
    public final String mAdSlotName;
    final boolean mFallbackToLegacy;
    public final boolean mImpressionOnLoad;
    public final String mMappedReason;
    public final com.spotify.mobile.android.util.viewuri.ViewUri.SubView mSubView;

    private Reason(String s, int i1, String s1)
    {
        super(s, i1);
        mMappedReason = s1;
        mAdSlotName = "";
        mSubView = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a;
        mImpressionOnLoad = false;
        mFallbackToLegacy = true;
    }

    private Reason(String s, int i1, String s1, String s2, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        this(s, i1, s1, s2, subview, false, true);
    }

    private Reason(String s, int i1, String s1, String s2, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, boolean flag, boolean flag1)
    {
        super(s, i1);
        mMappedReason = s1;
        if (s1 == null || !s1.equals(s2))
        {
            s1 = s2;
        }
        mAdSlotName = s1;
        mSubView = subview;
        mImpressionOnLoad = flag;
        mFallbackToLegacy = flag1;
    }

    public static Reason a(String s)
    {
        return (Reason)n.get(s);
    }

    public static Reason valueOf(String s)
    {
        return (Reason)Enum.valueOf(com/spotify/mobile/android/ui/activity/upsell/Reason, s);
    }

    public static Reason[] values()
    {
        return (Reason[])o.clone();
    }

    public final boolean a()
    {
        return !TextUtils.isEmpty(mAdSlotName);
    }

    static 
    {
        a = new Reason("NO_UPSELL", 0, "no upsell");
        b = new Reason("BAD_TYPE", 1, "bad type");
        c = new Reason("STUCK_IN_SHUFFLE", 2, "disable-shuffle", "disable-shuffle", com.spotify.mobile.android.util.viewuri.ViewUri.SubView.n);
        d = new Reason("OUT_OF_SKIPS", 3, "skip-limit-reached", "skip-limit-reached", com.spotify.mobile.android.util.viewuri.ViewUri.SubView.j);
        e = new Reason("NO_OFFLINE", 4, "offline-sync-content", "offline-sync-content", com.spotify.mobile.android.util.viewuri.ViewUri.SubView.l);
        f = new Reason("NO_QUEUE", 5, "add-to-queue", "add-to-queue", com.spotify.mobile.android.util.viewuri.ViewUri.SubView.m);
        g = new Reason("NO_ON_DEMAND", 6, "play-on-demand", "play-on-demand", com.spotify.mobile.android.util.viewuri.ViewUri.SubView.q);
        h = new Reason("CAPPING_REACHED", 7, "cap-limit-reached", "cap-limit-reached", com.spotify.mobile.android.util.viewuri.ViewUri.SubView.o);
        i = new Reason("EXTREME_QUALITY", 8, "enable-extreme-quality", "enable-extreme-quality", com.spotify.mobile.android.util.viewuri.ViewUri.SubView.p);
        j = new Reason("START_TRIAL", 9, "start_trial");
        k = new Reason("NO_STREAMING", 10, "no_streaming");
        l = new Reason("SHOWCASE", 11, "showcase", "showcase", com.spotify.mobile.android.util.viewuri.ViewUri.SubView.k, true, false);
        m = new Reason("USER_REQUEST", 12, "user-initiated");
        o = (new Reason[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m
        });
        n = new HashMap();
        Reason reason;
        for (Iterator iterator = EnumSet.allOf(com/spotify/mobile/android/ui/activity/upsell/Reason).iterator(); iterator.hasNext(); n.put(reason.mMappedReason, reason))
        {
            reason = (Reason)iterator.next();
        }

    }
}
