// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx.events;

import android.content.Intent;
import com.netflix.mediaclient.ui.mdx.RemotePlaybackListener;

public interface MdxEventHandler
{

    public abstract String getAction();

    public abstract void handle(RemotePlaybackListener remoteplaybacklistener, Intent intent);
}
