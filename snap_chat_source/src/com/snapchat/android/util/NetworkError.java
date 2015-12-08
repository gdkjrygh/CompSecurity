// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import MA;
import android.app.Application;
import android.content.res.Resources;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.notification.AndroidNotificationManager;
import com.snapchat.android.util.debug.FeatureFlagManager;
import com.squareup.otto.Bus;
import java.util.Map;
import kB;

public final class NetworkError extends Enum
{

    private static final NetworkError $VALUES[];
    public static final NetworkError CHECK_CONNECTION;
    public static final NetworkError COULD_NOT_REFRESH;
    public static final NetworkError COULD_NOT_REFRESH_TRY_AGAIN;
    public static final NetworkError COULD_NOT_SEND;
    public static final NetworkError NO_INTERNET_CONNECTION;
    private int mBackgroundColorRes;
    private int mTextRes;

    private NetworkError(String s, int i, int j)
    {
        this(s, i, j, 0x7f0c0067);
    }

    private NetworkError(String s, int i, int j, int k)
    {
        super(s, i);
        mTextRes = j;
        mBackgroundColorRes = k;
    }

    public static NetworkError valueOf(String s)
    {
        return (NetworkError)Enum.valueOf(com/snapchat/android/util/NetworkError, s);
    }

    public static NetworkError[] values()
    {
        return (NetworkError[])$VALUES.clone();
    }

    public final void notifyInStatusBar()
    {
        Object obj = SnapchatApplication.get().getResources();
        kB kb = kB.a();
        String s = ((Resources) (obj)).getString(mTextRes);
        int j = ((Resources) (obj)).getColor(mBackgroundColorRes);
        MA ma;
        int i;
        if (FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.CHAT_V2))
        {
            kB.a a = null;
            if (kb.c != null)
            {
                a = (kB.a)kb.b.get(kb.c);
            }
            obj = a;
            i = j;
            if (a == null)
            {
                obj = kb.b();
                i = j;
            }
        } else
        {
            obj = kb.b();
            i = AndroidNotificationManager.a;
        }
        ma = new MA(s, ((kB.a) (obj)).c, i);
        ma.alternateNotificationPanel = ((kB.a) (obj)).a;
        ma.hideTitleBar = ((kB.a) (obj)).b;
        ma.dismissCurrentNotification = true;
        kb.a.a(ma);
    }

    static 
    {
        NO_INTERNET_CONNECTION = new NetworkError("NO_INTERNET_CONNECTION", 0, 0x7f08019a, 0x7f0c0068);
        COULD_NOT_SEND = new NetworkError("COULD_NOT_SEND", 1, 0x7f0800e9);
        COULD_NOT_REFRESH_TRY_AGAIN = new NetworkError("COULD_NOT_REFRESH_TRY_AGAIN", 2, 0x7f0800e8);
        COULD_NOT_REFRESH = new NetworkError("COULD_NOT_REFRESH", 3, 0x7f0800e5);
        CHECK_CONNECTION = new NetworkError("CHECK_CONNECTION", 4, 0x7f0800cb);
        $VALUES = (new NetworkError[] {
            NO_INTERNET_CONNECTION, COULD_NOT_SEND, COULD_NOT_REFRESH_TRY_AGAIN, COULD_NOT_REFRESH, CHECK_CONNECTION
        });
    }
}
