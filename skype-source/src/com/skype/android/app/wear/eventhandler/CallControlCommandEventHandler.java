// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.eventhandler;

import android.content.Context;
import com.google.android.gms.common.api.c;
import com.skype.Conversation;
import com.skype.android.skylib.ObjectIdMap;

public abstract class CallControlCommandEventHandler extends com.skype.android.app.wear.EventHandler.EventHandlerAdapter
{

    private ObjectIdMap map;

    public CallControlCommandEventHandler(ObjectIdMap objectidmap)
    {
        map = objectidmap;
    }

    public abstract void execute(Conversation conversation);

    public void handle(Context context, c c, String s)
    {
        int i = Integer.parseInt(s.substring(s.lastIndexOf('/') + 1));
        context = (Conversation)map.a(i, com/skype/Conversation);
        if (context != null)
        {
            execute(context);
        }
    }
}
