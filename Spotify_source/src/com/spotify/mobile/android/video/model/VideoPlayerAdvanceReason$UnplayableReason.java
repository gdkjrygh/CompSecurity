// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.model;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class mReasonString extends Enum
{

    public static final mReasonString a;
    public static final mReasonString b;
    public static final mReasonString c;
    private static mReasonString d;
    private static mReasonString e;
    private static mReasonString f;
    private static mReasonString g;
    private static mReasonString h;
    private static mReasonString i;
    private static mReasonString j;
    private static mReasonString k;
    private static mReasonString l;
    private static mReasonString m;
    private static Map n;
    private static final mReasonString o[];
    String mReasonString;

    public static mReasonString valueOf(String s)
    {
        return (mReasonString)Enum.valueOf(com/spotify/mobile/android/video/model/VideoPlayerAdvanceReason$UnplayableReason, s);
    }

    public static mReasonString[] values()
    {
        return (mReasonString[])o.clone();
    }

    static 
    {
        d = new <init>("NOT_AVAILABLE", 0, "not_available");
        a = new <init>("NOT_AVAILABLE_OFFLINE", 1, "not_available_offline");
        e = new <init>("NOT_AVAILABLE_IN_CURRENT_REGION", 2, "not_available_in_current_region");
        f = new <init>("NOT_AVAILABLE_IN_NON_PREMIUM", 3, "not_available_in_non_premium");
        g = new <init>("NOT_AVAILABLE_BY_ARTIST_BAN", 4, "not_available_by_artist_ban");
        h = new <init>("LOCAL_FILE_NOT_FOUND", 5, "local_file_not_found");
        i = new <init>("LOCAL_FILE_BAD_FORMAT", 6, "local_file_bad_format");
        j = new <init>("LOCAL_FILE_DRM_PROTECTED", 7, "local_file_drm_protected");
        k = new <init>("USER_STREAMING_DISALLOWED", 8, "user_streaming_disallowed");
        l = new <init>("USER_CAPPING_REACHED", 9, "user_capping_reached");
        b = new <init>("APP_IN_BACKGROUND", 10, "background");
        c = new <init>("DRIVER_DISTRACTED", 11, "driver_distracted");
        m = new <init>("MISSING_MANIFEST_ID", 12, "missing_manifest_id");
        o = (new o[] {
            d, a, e, f, g, h, i, j, k, l, 
            b, c, m
        });
        n = new HashMap();
        n_3B_.clone clone;
        for (Iterator iterator = EnumSet.allOf(com/spotify/mobile/android/video/model/VideoPlayerAdvanceReason$UnplayableReason).iterator(); iterator.hasNext(); n.put(clone.mReasonString, clone))
        {
            clone = (mReasonString)iterator.next();
        }

    }

    private (String s, int i1, String s1)
    {
        super(s, i1);
        mReasonString = s1;
    }
}
