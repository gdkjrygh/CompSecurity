// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import p.cw.c;
import p.df.a;
import p.dg.e;
import p.dg.i;

public class n extends i
{

    private AssetFileDescriptor b;

    public n(c c)
    {
        super(c);
    }

    public void a(AssetFileDescriptor assetfiledescriptor, String s, Context context)
    {
        b = assetfiledescriptor;
        super.a(" ", s, context, null);
    }

    protected void a(e e1, String s, String s1)
    {
        try
        {
            e1.setAudioStreamType(3);
            e1.setOnCompletionListener(this);
            e1.setOnErrorListener(this);
            e1.setOnPreparedListener(this);
            e1.setLooping(true);
            p.df.a.a("LoopingSampleTrack", (new StringBuilder()).append("setting MediaPlayer datasource: ").append(b).toString());
            e1.setDataSource(b.getFileDescriptor(), b.getStartOffset(), b.getLength());
            p.df.a.a("LoopingSampleTrack", "Sample.LoadRunnable: calling MediaPlayer.prepareAsync()");
            e1.prepareAsync();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            p.df.a.b("LoopingSampleTrack", (new StringBuilder()).append("Exception during mediaplayer load - ").append(s.getMessage()).toString(), s);
        }
        onCompletion(e1);
    }
}
