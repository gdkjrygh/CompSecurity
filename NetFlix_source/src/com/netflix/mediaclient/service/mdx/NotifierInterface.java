// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;


public interface NotifierInterface
{

    public abstract void abortPinVerification(String s, boolean flag);

    public abstract void audiosub(String s, String s1);

    public abstract void capability(String s, String s1);

    public abstract void dialogCancel(String s, String s1);

    public abstract void dialogShow(String s, String s1);

    public abstract void error(String s, int i, String s1);

    public abstract void metaData(String s, String s1);

    public abstract void movieMetaData(String s, String s1, String s2, int i);

    public abstract void movieMetaDataAvailable(String s);

    public abstract void notready();

    public abstract void playbackEnd(String s, String s1);

    public abstract void playbackStart(String s);

    public abstract void postplayState(String s, String s1);

    public abstract void ready();

    public abstract void requestPinVerification(String s, String s1, int i, int j, String s2);

    public abstract void simplePlaybackState(String s, boolean flag, boolean flag1, String s1);

    public abstract void state(String s, String s1, int i, int j);

    public abstract void targetList();
}
