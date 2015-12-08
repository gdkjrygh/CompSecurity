// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.e;

import com.brightcove.player.event.Event;
import com.brightcove.player.model.Video;

public interface q
{

    public abstract void a(int i, Event event);

    public abstract void a(Event event);

    public abstract void a(Video video, int i, Event event);

    public abstract void a(String s);

    public abstract void b(int i, Event event);

    public abstract void c(int i, Event event);
}
