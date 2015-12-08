// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.analytics;

import com.snapchat.android.discover.model.MediaState;

// Referenced classes of package com.snapchat.android.discover.analytics:
//            DiscoverUsageAnalytics

public static final class 
{

    public static final int a[];
    public static final int b[];
    static final int c[];

    static 
    {
        c = new int[com.snapchat.android.discover.model.es().length];
        try
        {
            c[com.snapchat.android.discover.model.E.nal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            c[com.snapchat.android.discover.model.O.nal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            c[com.snapchat.android.discover.model.L_WEBPAGE.nal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            c[com.snapchat.android.discover.model.TE_VIDEO.nal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        b = new int[MediaState.values().length];
        try
        {
            b[MediaState.AD_RESOLVE_ERROR_CODE_INTERNAL_ERROR.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            b[MediaState.AD_RESOLVE_ERROR_CODE_INVALID_REQUEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            b[MediaState.AD_RESOLVE_ERROR_CODE_NETWORK_ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            b[MediaState.AD_RESOLVE_ERROR_CODE_NO_FILL.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            b[MediaState.AD_RESOLVE_ERROR_CODE_UNKNOWN.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            b[MediaState.AD_RESOLVE_CONTENT_NO_FILL.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            b[MediaState.AD_RESOLVE_TIMEOUT.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            b[MediaState.AD_RESOLVE_CLIENT_ERROR.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        a = new int[com.snapchat.android.ui.itMethod.values().length];
        try
        {
            a[com.snapchat.android.ui.itMethod.SWIPE_BEGINNING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[com.snapchat.android.ui.itMethod.SWIPE_END.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[com.snapchat.android.ui.itMethod.ENTER_BACKGROUND.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.snapchat.android.ui.itMethod.SWIPE_DOWN.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.snapchat.android.ui.itMethod.AUTO_ADVANCE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.snapchat.android.ui.itMethod.BACK_PRESSED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
