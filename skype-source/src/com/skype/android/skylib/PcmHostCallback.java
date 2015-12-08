// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.skylib;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class PcmHostCallback extends com.skype.pcmhost.PcmHost.clientCallback
{
    public static interface Listener
    {

        public abstract void onAudioRouteChanged(boolean flag, String s);

        public abstract void onStopRingoutRequested();
    }


    private Set a;

    public PcmHostCallback()
    {
        a = new CopyOnWriteArraySet();
    }

    private void a(boolean flag, String s)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((Listener)iterator.next()).onAudioRouteChanged(flag, s)) { }
    }

    public final boolean a(Listener listener)
    {
        if (listener != null)
        {
            return a.add(listener);
        } else
        {
            return false;
        }
    }

    public final boolean b(Listener listener)
    {
        if (listener != null)
        {
            return a.remove(listener);
        } else
        {
            return false;
        }
    }

    public void callbackStopRingoutTone()
    {
        super.callbackStopRingoutTone();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((Listener)iterator.next()).onStopRingoutRequested()) { }
    }

    public void callbackWithError(String s)
    {
        super.callbackWithError(s);
        a(false, s);
    }

    public void callbackWithoutError(String s)
    {
        super.callbackWithoutError(s);
        a(true, s);
    }
}
