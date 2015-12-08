// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.monitor;

import com.conviva.StreamerError;
import java.util.Map;

public interface IMonitorNotifier
{

    public abstract void Log(String s);

    public abstract void OnError(StreamerError streamererror);

    public abstract void OnMetadata(Map map);

    public abstract void SetPlayingState(int i);

    public abstract void SetStream(int i, String s, String s1);
}
