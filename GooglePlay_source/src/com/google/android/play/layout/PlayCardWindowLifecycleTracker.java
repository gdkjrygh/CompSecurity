// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.layout;

import java.util.ArrayList;
import java.util.List;

public final class PlayCardWindowLifecycleTracker
{

    private static PlayCardWindowLifecycleTracker INSTANCE = new PlayCardWindowLifecycleTracker();
    private List mListenerList;

    private PlayCardWindowLifecycleTracker()
    {
        mListenerList = new ArrayList();
    }

    public static PlayCardWindowLifecycleTracker getInstance()
    {
        return INSTANCE;
    }

    final void cardAttachedToWindow$372d3f20()
    {
        this;
        JVM INSTR monitorenter ;
        int i = mListenerList.size() - 1;
_L2:
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        mListenerList.get(i);
        i--;
        if (true) goto _L2; else goto _L1
_L1:
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void cardDetachedFromWindow$372d3f20()
    {
        this;
        JVM INSTR monitorenter ;
        int i = mListenerList.size() - 1;
_L2:
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        mListenerList.get(i);
        i--;
        if (true) goto _L2; else goto _L1
_L1:
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
