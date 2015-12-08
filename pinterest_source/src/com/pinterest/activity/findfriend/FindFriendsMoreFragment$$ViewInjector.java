// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import com.pinterest.ui.text.PButton;

// Referenced classes of package com.pinterest.activity.findfriend:
//            FindFriendsMoreFragment

public class 
{

    public static void inject(butterknife.ragment ragment, FindFriendsMoreFragment findfriendsmorefragment, Object obj)
    {
        findfriendsmorefragment._smsBtn = (PButton)ragment._smsBtn(obj, 0x7f0f0250, "field '_smsBtn'");
        findfriendsmorefragment._emailBtn = (PButton)ragment._emailBtn(obj, 0x7f0f0251, "field '_emailBtn'");
        findfriendsmorefragment._facebookBtn = (PButton)ragment._facebookBtn(obj, 0x7f0f0252, "field '_facebookBtn'");
        findfriendsmorefragment._whatsappBtn = (PButton)ragment._whatsappBtn(obj, 0x7f0f0253, "field '_whatsappBtn'");
        findfriendsmorefragment._lineBtn = (PButton)ragment._lineBtn(obj, 0x7f0f0254, "field '_lineBtn'");
    }

    public static void reset(FindFriendsMoreFragment findfriendsmorefragment)
    {
        findfriendsmorefragment._smsBtn = null;
        findfriendsmorefragment._emailBtn = null;
        findfriendsmorefragment._facebookBtn = null;
        findfriendsmorefragment._whatsappBtn = null;
        findfriendsmorefragment._lineBtn = null;
    }

    public ()
    {
    }
}
