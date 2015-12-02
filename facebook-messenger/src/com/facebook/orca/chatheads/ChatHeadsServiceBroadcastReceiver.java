// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.c.k;
import com.google.common.a.ew;
import java.util.Map;

// Referenced classes of package com.facebook.orca.chatheads:
//            db

public class ChatHeadsServiceBroadcastReceiver extends k
{

    private static final Class a = com/facebook/orca/chatheads/ChatHeadsServiceBroadcastReceiver;

    public ChatHeadsServiceBroadcastReceiver()
    {
        super(a());
    }

    private static Map a()
    {
        db db1 = new db(null);
        return (new ew()).b("com.facebook.orca.chatheads.ACTION_NEW_MESSAGE_NOTIFICATION", db1).b("com.facebook.orca.chatheads.ACTION_POPUP_CHAT_HEAD", db1).b("com.facebook.orca.chatheads.ACTION_OPEN_CHAT_HEAD", db1).b("com.facebook.orca.chatheads.ACTION_REMOVE_CHAT_HEAD", db1).b("com.facebook.orca.chatheads.ACTION_CLEAR_UNREAD_THREAD", db1).b("com.facebook.orca.chatheads.ACTION_CLEAR_ALL_UNREAD_THREADS", db1).b("com.facebook.orca.chatheads.ACTION_SHOW_CHATHEADS", db1).b("com.facebook.orca.chatheads.ACTION_HIDE_CHATHEADS", db1).b("com.facebook.orca.chatheads.ACTION_SET_CHATHEADS_POLICY", db1).b("com.facebook.orca.chatheads.ACTION_QUERY_CHATHEADS_ENABLED", db1).b();
    }

}
