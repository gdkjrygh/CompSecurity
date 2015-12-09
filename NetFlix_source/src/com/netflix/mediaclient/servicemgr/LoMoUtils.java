// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import android.content.res.Resources;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.webclient.model.client.SocialConnectPlaceholder;
import com.netflix.mediaclient.service.webclient.model.client.SocialFriendPlaceholder;
import com.netflix.mediaclient.service.webclient.model.client.SocialGroupPlaceholder;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            LoMo, LoMoType, BasicLoMo

public class LoMoUtils
{

    private static int INJECTED_PAGE_INDEX = 0;
    private static final String TAG = "LoMoUtils";
    private static int VIDEO_INJECT_COUNT = 1;

    private LoMoUtils()
    {
    }

    public static int getClientInjectedVideoCount(BasicLoMo basiclomo, boolean flag, int i)
    {
        if (isClientModifiedRow(basiclomo, flag) && i == INJECTED_PAGE_INDEX)
        {
            return VIDEO_INJECT_COUNT;
        } else
        {
            return 0;
        }
    }

    public static int getLomoFragOffsetLeftPx(NetflixActivity netflixactivity)
    {
        if (netflixactivity.isForKids())
        {
            return (int)(0.667F * (float)netflixactivity.getResources().getDimensionPixelOffset(0x7f0a007b));
        } else
        {
            return netflixactivity.getResources().getDimensionPixelOffset(0x7f0a0050);
        }
    }

    public static int getLomoFragOffsetRightPx(NetflixActivity netflixactivity)
    {
        if (netflixactivity.isForKids())
        {
            return (int)(1.333F * (float)netflixactivity.getResources().getDimensionPixelOffset(0x7f0a007b));
        } else
        {
            return netflixactivity.getResources().getDimensionPixelOffset(0x7f0a0050);
        }
    }

    public static void injectSocialData(LoMo lomo, List list)
    {
        Object obj = null;
        LoMoType lomotype = lomo.getType();
        Log.d("LoMoUtils", (new StringBuilder()).append("Injecting social data for type: ").append(lomotype).toString());
        if (lomotype == LoMoType.SOCIAL_GROUP)
        {
            lomo = new SocialGroupPlaceholder(lomo);
        } else
        if (lomotype == LoMoType.SOCIAL_FRIEND)
        {
            lomo = new SocialFriendPlaceholder(lomo);
        } else
        if (lomotype == LoMoType.SOCIAL_POPULAR)
        {
            lomo = new SocialConnectPlaceholder(lomo);
        } else
        {
            Log.w("LoMoUtils", (new StringBuilder()).append("Unrecognized type for social data injection: ").append(lomotype).toString());
            lomo = obj;
        }
        list.add(0, lomo);
    }

    private static boolean isClientModifiedRow(BasicLoMo basiclomo, boolean flag)
    {
        return shouldInjectSocialData(basiclomo, flag);
    }

    private static boolean shouldInjectConnectToFacebook(LoMoType lomotype, boolean flag)
    {
        return !flag && lomotype == LoMoType.SOCIAL_POPULAR;
    }

    public static boolean shouldInjectSocialData(BasicLoMo basiclomo, boolean flag)
    {
        basiclomo = basiclomo.getType();
        return shouldInjectConnectToFacebook(basiclomo, flag) || basiclomo == LoMoType.SOCIAL_FRIEND || basiclomo == LoMoType.SOCIAL_GROUP;
    }

    static 
    {
        INJECTED_PAGE_INDEX = 0;
    }
}
