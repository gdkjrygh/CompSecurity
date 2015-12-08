// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.session;

import java.util.HashMap;

public interface IPlaybackSession
{

    public abstract void notify(String s, HashMap hashmap);

    public abstract void notifyClick();

    public abstract void notifyComplete();

    public abstract void notifyError(RuntimeException runtimeexception);

    public abstract void notifyPause();

    public abstract void notifyProgress(int i, int j);

    public abstract void notifyResume();

    public abstract void notifySkip();

    public abstract void notifyStart();

    public abstract void notifyStop();
}
