// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media;

import android.content.Context;
import android.view.Surface;
import com.netflix.mediaclient.javabridge.ui.IMedia;
import org.json.JSONObject;

public interface MediaPlayerHelper
{

    public abstract void prepare(IMedia imedia, Surface surface, Context context);

    public abstract void prepareJPlayer(IMedia imedia, Surface surface, com.netflix.mediaclient.media.JPlayer.JPlayer.JplayerListener jplayerlistener, boolean flag, JSONObject jsonobject);

    public abstract void release();
}
