// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


// Referenced classes of package com.yume.android.sdk:
//            M, YuMeSDKInterfaceImpl, ah, p, 
//            YuMeAdBlockType

final class ai
{

    private M a;

    public ai()
    {
        a = M.a();
    }

    public final String a(YuMeAdBlockType yumeadblocktype)
    {
        a.b("framePlaylistRequest - Start.");
        YuMeSDKInterfaceImpl.j.a(yumeadblocktype);
        org.json.JSONObject jsonobject = YuMeSDKInterfaceImpl.j.a(yumeadblocktype, false);
        String s = YuMeSDKInterfaceImpl.j.b();
        YuMeSDKInterfaceImpl.j.c();
        a.b("framePlaylistRequest - End.");
        if (s != null && jsonobject != null)
        {
            YuMeSDKInterfaceImpl.k.a(s, jsonobject, yumeadblocktype, false, false);
            return null;
        } else
        {
            return "Error framing Playlist Url.";
        }
    }
}
