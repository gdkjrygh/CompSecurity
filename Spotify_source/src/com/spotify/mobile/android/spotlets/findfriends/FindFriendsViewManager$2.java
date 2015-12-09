// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.findfriends;

import android.widget.RadioGroup;
import com.spotify.mobile.android.util.Assertion;

// Referenced classes of package com.spotify.mobile.android.spotlets.findfriends:
//            FindFriendsViewManager

final class a
    implements android.widget.eListener
{

    private FindFriendsViewManager a;

    public final void onCheckedChanged(RadioGroup radiogroup, int i)
    {
        i;
        JVM INSTR tableswitch 2131821374 2131821375: default 24
    //                   2131821374 30
    //                   2131821375 68;
           goto _L1 _L2 _L3
_L1:
        Assertion.a("If you end up here, FindFriends tab architecture is b0rken");
_L5:
        return;
_L2:
        radiogroup = a;
        if (((FindFriendsViewManager) (radiogroup)).b != bType.a)
        {
            radiogroup.b = bType.a;
            radiogroup.a(bType.a.mState);
            radiogroup.a(true);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        radiogroup = a;
        if (((FindFriendsViewManager) (radiogroup)).b != bType.b)
        {
            radiogroup.b = bType.b;
            radiogroup.a(bType.b.mState);
            radiogroup.a(false);
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    bType(FindFriendsViewManager findfriendsviewmanager)
    {
        a = findfriendsviewmanager;
        super();
    }
}
