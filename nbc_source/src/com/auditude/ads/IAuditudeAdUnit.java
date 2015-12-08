// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads;

import com.auditude.ads.event.AuditudePluginEventListener;
import java.util.HashMap;

public interface IAuditudeAdUnit
{

    public abstract void cancel();

    public abstract Object getProperty(String s);

    public abstract boolean hasBreak();

    public abstract boolean hasBreak(int i);

    public abstract void init(String s, Object obj, int i);

    public abstract void init(String s, Object obj, int i, HashMap hashmap);

    public abstract void init(String s, Object obj, int i, HashMap hashmap, int j);

    public abstract void notify(String s);

    public abstract void notify(String s, HashMap hashmap);

    public abstract void setAuditudeHandlesChapterBreaks(boolean flag);

    public abstract void setBitRate(int i);

    public abstract void setPluginEventListener(AuditudePluginEventListener auditudeplugineventlistener);

    public abstract void setProperty(String s, Object obj);

    public abstract void setPublisherVersion(String s);

    public abstract void setSize(int i, int j);

    public abstract void setVolume(float f, float f1);
}
