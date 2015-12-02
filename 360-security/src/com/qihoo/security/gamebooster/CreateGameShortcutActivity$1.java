// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.gamebooster:
//            CreateGameShortcutActivity

class a
    implements Runnable
{

    final CreateGameShortcutActivity a;

    public void run()
    {
        SharedPref.a(CreateGameShortcutActivity.a(a), "sp_key_last_recommend_create_shortcut_time", System.currentTimeMillis());
        int i = SharedPref.b(CreateGameShortcutActivity.a(a), "sp_key_last_recommend_create_shortcut_times", 0);
        SharedPref.a(CreateGameShortcutActivity.a(a), "sp_key_last_recommend_create_shortcut_times", i + 1);
    }

    A(CreateGameShortcutActivity creategameshortcutactivity)
    {
        a = creategameshortcutactivity;
        super();
    }
}
