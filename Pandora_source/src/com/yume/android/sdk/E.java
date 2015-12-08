// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


// Referenced classes of package com.yume.android.sdk:
//            YuMeAdEvent, YuMeSDKInterfaceImpl, ak, YuMeAdBlockType, 
//            YuMePlaybackStatus

final class E
{

    static boolean a = false;
    static boolean b = false;
    static boolean c = false;
    private static YuMeAdBlockType d;
    private static boolean e = false;

    public E()
    {
    }

    public static YuMeAdBlockType a()
    {
        return d;
    }

    public static void a(YuMeAdBlockType yumeadblocktype)
    {
        d = yumeadblocktype;
    }

    private static void a(YuMeAdBlockType yumeadblocktype, YuMeAdEvent yumeadevent, YuMeAdEvent yumeadevent1, String s)
    {
        if (yumeadevent == YuMeAdEvent.AD_COMPLETED || yumeadevent1 == YuMeAdEvent.AD_COMPLETED)
        {
            YuMeSDKInterfaceImpl.a(yumeadblocktype, e);
        }
        YuMeSDKInterfaceImpl.o.a(yumeadblocktype, yumeadevent, yumeadevent1, s);
        if (yumeadevent == YuMeAdEvent.AD_COMPLETED || yumeadevent1 == YuMeAdEvent.AD_COMPLETED)
        {
            d = YuMeAdBlockType.NONE;
            e = false;
            a = false;
            b = false;
        }
    }

    public static void a(YuMeAdBlockType yumeadblocktype, String s)
    {
        a(yumeadblocktype, YuMeAdEvent.AD_NOT_READY, YuMeAdEvent.NONE, s);
    }

    public static void a(YuMeAdBlockType yumeadblocktype, boolean flag)
    {
        if (flag)
        {
            a(yumeadblocktype, YuMeAdEvent.AD_AND_ASSETS_READY, YuMeAdEvent.NONE, null);
            return;
        } else
        {
            a(yumeadblocktype, YuMeAdEvent.AD_READY, YuMeAdEvent.NONE, null);
            return;
        }
    }

    public static void a(YuMePlaybackStatus yumeplaybackstatus)
    {
        String s = "";
        if (yumeplaybackstatus != YuMePlaybackStatus.COMPLETED) goto _L2; else goto _L1
_L1:
        s = "Ad Playback Successful.";
_L4:
        a(d, YuMeAdEvent.AD_COMPLETED, YuMeAdEvent.NONE, s);
        return;
_L2:
        if (yumeplaybackstatus == YuMePlaybackStatus.FAILED)
        {
            s = "Ad Playback Failed.";
        } else
        if (yumeplaybackstatus == YuMePlaybackStatus.TIMED_OUT)
        {
            s = "Ad Playback Timed Out.";
        } else
        if (yumeplaybackstatus == YuMePlaybackStatus.INTERRUPTED)
        {
            s = "Ad Playback Interrupted.";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(String s)
    {
        if (!c)
        {
            a(d, YuMeAdEvent.AD_ERROR, YuMeAdEvent.NONE, s);
        }
        c = true;
    }

    public static void a(boolean flag)
    {
        e = flag;
    }

    public static void b(YuMeAdBlockType yumeadblocktype)
    {
        a(yumeadblocktype, YuMeAdEvent.AD_EXPIRED, YuMeAdEvent.NONE, null);
    }

    public static boolean b()
    {
        return e;
    }

    public static void c()
    {
        if (!a)
        {
            a(d, YuMeAdEvent.AD_PRESENT, YuMeAdEvent.NONE, null);
        }
        a = true;
    }

    public static void d()
    {
        if (!b)
        {
            a(d, YuMeAdEvent.AD_PLAYING, YuMeAdEvent.NONE, null);
        }
        b = true;
    }

    public static void e()
    {
        a(d, YuMeAdEvent.AD_ABSENT, YuMeAdEvent.AD_COMPLETED, null);
    }

}
