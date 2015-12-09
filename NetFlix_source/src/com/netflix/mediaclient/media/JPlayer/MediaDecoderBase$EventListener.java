// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;


// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            MediaDecoderBase

public static interface 
{

    public abstract void onDecoderReady(boolean flag);

    public abstract void onDecoderStarted(boolean flag);

    public abstract void onEndOfStream(boolean flag);

    public abstract void onFlushed(boolean flag);

    public abstract void onPasued(boolean flag);

    public abstract void onSampleRendered(boolean flag, long l, long l1);
}
