// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;

import android.content.Context;
import com.google.android.gms.common.api.c;
import com.google.android.gms.wearable.f;

public interface EventHandler
{
    public static class EventHandlerAdapter
        implements EventHandler
    {

        public void handle(Context context, c c, f f)
        {
        }

        public void handle(Context context, c c, String s)
        {
        }

        public EventHandlerAdapter()
        {
        }
    }


    public static final EventHandler NULL_HANDLER = new EventHandler() {

        public final void handle(Context context, c c, f f)
        {
        }

        public final void handle(Context context, c c, String s)
        {
        }

    };
    public static final String TAG = "EventHandler";

    public abstract void handle(Context context, c c, f f);

    public abstract void handle(Context context, c c, String s);

}
