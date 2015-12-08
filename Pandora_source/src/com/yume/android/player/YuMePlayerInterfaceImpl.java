// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.widget.FrameLayout;
import com.yume.android.sdk.YuMeAdInfo;
import com.yume.android.sdk.YuMeAssetType;
import com.yume.android.sdk.YuMeClickType;
import com.yume.android.sdk.YuMePlayerException;
import com.yume.android.sdk.YuMePlayerInfo;
import com.yume.android.sdk.YuMePlayerInterface;
import com.yume.android.sdk.YuMeSDKPlayerInterface;
import com.yume.android.sdk.YuMeTransitionEffect;
import java.util.List;

// Referenced classes of package com.yume.android.player:
//            B, R, ag, J, 
//            ah, P

public class YuMePlayerInterfaceImpl
    implements YuMePlayerInterface
{

    static YuMeSDKPlayerInterface a;
    static boolean b = false;
    static R c;
    static J d;
    private B e;
    private int f;
    private int g;
    private int h;

    public YuMePlayerInterfaceImpl()
    {
        e = B.a();
        f = 60;
        g = 6;
        h = 3;
    }

    private String a(int i, boolean flag, boolean flag1)
    {
        if (i > f)
        {
            return (new StringBuilder("Invalid Progressive Download Timeout Value. It cannot exceed ")).append(f).append(".").toString();
        }
        R r = new R();
        c = r;
        r.a = i;
        if (i < h)
        {
            c.a = g;
        } else
        {
            c.a = i;
        }
        c.b = flag;
        c.c = flag1;
        if (c.b)
        {
            e.a(a.YuMeSDKPlayer_GetApplicationContext());
        }
        e.a(c.b);
        e.b(c.c);
        e.b("********** YUME PLAYER PARAMS - BEGIN **********");
        e.b((new StringBuilder("videoTimeout: ")).append(c.a).toString());
        e.b("********** YUME PLAYER PARAMS - END **********");
        return "";
    }

    public void YuMePlayer_AddEventToCalendar(String s)
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_AddEventToCalendar(): YuMe Player is not Initialized.");
        }
        d.c(s);
    }

    public void YuMePlayer_DeInit()
        throws YuMePlayerException
    {
        e.b("YuMePlayer_DeInit(): Invoked.");
        if (!b)
        {
            ag.f("YuMePlayer_DeInit(): YuMe Player is not Initialized.");
        }
        d.a();
        d = null;
        c = null;
        b = false;
        e.b("YuMePlayer_DeInit(): Successful.");
    }

    public YuMePlayerInfo YuMePlayer_GetPlayerInfo()
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_GetPlayerInfo(): YuMe Player is not Initialized.");
        }
        return d.f();
    }

    public int YuMePlayer_GetProgressiveDownloadTimeoutSec()
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_GetProgressiveDownloadTimeoutSec(): YuMe Player is not Initialized.");
        }
        if (c != null)
        {
            return c.a;
        } else
        {
            return 0;
        }
    }

    public List YuMePlayer_GetSupportedFileFormats()
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_GetSupportedFileFormats(): YuMe Player is not Initialized.");
        }
        return d.b();
    }

    public List YuMePlayer_GetSupportedMimeTypes()
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_GetSupportedMimeTypes(): YuMe Player is not Initialized.");
        }
        return d.c();
    }

    public String YuMePlayer_GetVersion()
        throws YuMePlayerException
    {
        String s = ah.a();
        e.b((new StringBuilder("YuMe Player Version: ")).append(s).toString());
        return s;
    }

    public void YuMePlayer_HandleBroadcastEvent(String s)
        throws YuMePlayerException
    {
        e.b("YuMePlayer_HandleBroadcastEvent(): Invoked.");
        if (!b)
        {
            ag.f("YuMePlayer_HandleBroadcastEvent(): YuMe Player is not Initialized.");
        }
        J.b(s);
        e.b("YuMePlayer_HandleBroadcastEvent(): Successful.");
    }

    public void YuMePlayer_HideImage(int i)
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_HideImage(): YuMe Player is not Initialized.");
        }
        J.c(i);
    }

    public void YuMePlayer_Init(int i, boolean flag, boolean flag1, YuMeSDKPlayerInterface yumesdkplayerinterface)
        throws YuMePlayerException
    {
        e.b("YuMePlayer_Init(): Invoked.");
        if (b)
        {
            ag.f("YuMePlayer_Init(): YuMe Player is already Initialized.");
        }
        if (yumesdkplayerinterface == null)
        {
            ag.f("YuMePlayer_Init(): Invalid YuMe SDK Interface object.");
        }
        a = yumesdkplayerinterface;
        yumesdkplayerinterface = a(i, flag, flag1);
        if (ag.a(yumesdkplayerinterface))
        {
            ag.f((new StringBuilder("YuMePlayer_Init(): ")).append(yumesdkplayerinterface).toString());
        }
        d = new J();
        b = true;
        e.b("YuMePlayer_Init(): Successful.");
    }

    public boolean YuMePlayer_IsCalendarOperationsSupported()
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_IsCalendarOperationsSupported(): YuMe Player is not Initialized.");
        }
        boolean flag = d.f;
        e.b((new StringBuilder("YuMePlayer_IsCalendarOperationsSupported(): ")).append(flag).toString());
        return flag;
    }

    public void YuMePlayer_ModifyParams(int i, boolean flag, boolean flag1)
        throws YuMePlayerException
    {
        e.b("YuMePlayer_ModifyParams(): Invoked.");
        if (!b)
        {
            ag.f("YuMePlayer_ModifyParams(): YuMe Player is not Initialized.");
        }
        String s = a(i, flag, flag1);
        if (ag.a(s))
        {
            ag.f((new StringBuilder("YuMePlayer_ModifyParams(): ")).append(s).toString());
        }
        e.b("YuMePlayer_ModifyParams(): Successful.");
    }

    public void YuMePlayer_OpenClickURL(String s, String s1, YuMeClickType yumeclicktype, String s2)
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_OpenClickURL(): YuMe Player is not Initialized.");
        }
        J.a(s);
    }

    public void YuMePlayer_PauseAd()
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_PauseAd(): YuMe Player is not Initialized.");
        }
        d.F();
    }

    public void YuMePlayer_ReplayAdVideo()
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_ReplayAdVideo(): YuMe Player is not Initialized.");
        }
        d.H();
    }

    public void YuMePlayer_ResumeAd()
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_ResumeAd(): YuMe Player is not Initialized.");
        }
        d.G();
    }

    public void YuMePlayer_SetAdInfo(YuMeAdInfo yumeadinfo, boolean flag, boolean flag1)
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_SetAdInfo(): YuMe Player is not Initialized.");
        }
        if (yumeadinfo == null)
        {
            ag.f("YuMePlayer_SetAdInfo(): Invalid YuMeAdInfo object.");
        }
        d.a(yumeadinfo, flag1);
        if (flag)
        {
            yumeadinfo = d.a(flag1);
            if (ag.a(yumeadinfo))
            {
                ag.f((new StringBuilder("YuMePlayer_SetAdInfo(): ")).append(yumeadinfo).toString());
            }
        }
    }

    public void YuMePlayer_SetControlBarVisibility(boolean flag, boolean flag1, boolean flag2)
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_SetControlBarVisibility(): YuMe Player is not Initialized.");
        }
        J.a(flag, flag1, flag2);
    }

    public void YuMePlayer_SetOverlaysVisibility(boolean flag)
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_SetOverlaysVisibility(): YuMe Player is not Initialized.");
        }
        J.b(flag);
    }

    public void YuMePlayer_SetParentView(FrameLayout framelayout)
        throws YuMePlayerException
    {
        e.b("YuMePlayer_SetParentView(): Invoked.");
        if (!b)
        {
            ag.f("YuMePlayer_SetParentView(): YuMe Player is not Initialized.");
        }
        if (framelayout == null)
        {
            ag.f("YuMePlayer_SetParentView(): fLayout is NULL.");
        }
        if (J.b == P.b)
        {
            ag.f("YuMePlayer_SetParentView(): Previous Play in Progress.");
        }
        try
        {
            d.a(framelayout);
        }
        // Misplaced declaration of an exception variable
        catch (FrameLayout framelayout)
        {
            throw framelayout;
        }
        e.b("YuMePlayer_SetParentView(): Successful.");
    }

    public void YuMePlayer_ShowCountdown(int i, YuMeAssetType yumeassettype)
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_ShowCountdown(): YuMe Player is not Initialized.");
        }
        J.a(i);
    }

    public void YuMePlayer_ShowImage(int i)
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_ShowImage(): YuMe Player is not Initialized.");
        }
        J.b(i);
    }

    public void YuMePlayer_ShowLinkedAd(int i, YuMeAdInfo yumeadinfo, boolean flag)
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_ShowLinkedAd(): YuMe Player is not Initialized.");
        }
        d.b(yumeadinfo, flag);
    }

    public void YuMePlayer_ShowTransitionEffect(YuMeTransitionEffect yumetransitioneffect)
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_ShowTransitionEffect(): YuMe Player is not Initialized.");
        }
        d.a(yumetransitioneffect);
    }

    public void YuMePlayer_StartPlay(boolean flag)
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_StartPlay(): YuMe Player is not Initialized.");
        }
        String s = d.a(flag);
        if (ag.a(s))
        {
            ag.f((new StringBuilder("YuMePlayer_StartPlay(): ")).append(s).toString());
        }
    }

    public void YuMePlayer_StopPlay()
        throws YuMePlayerException
    {
        if (!b)
        {
            ag.f("YuMePlayer_StopPlay(): YuMe Player is not Initialized.");
        }
        d.e();
    }

    public void YuMePlayer_TearDownAssets()
        throws YuMePlayerException
    {
        e.b("YuMePlayer_TearDownAssets(): Invoked.");
        if (!b)
        {
            ag.f("YuMePlayer_TearDownAssets(): YuMe Player is not Initialized.");
        }
        e.b("YuMePlayer_TearDownAssets(): Successful.");
    }

}
