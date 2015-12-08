// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;


final class p extends Enum
{

    public static final p AudioContent;
    public static final p None;
    public static final p VideoContent;
    private static final p a[];

    private p(String s, int i)
    {
        super(s, i);
    }

    public static p valueOf(String s)
    {
        return (p)Enum.valueOf(com/comscore/streaming/p, s);
    }

    public static p[] values()
    {
        return (p[])a.clone();
    }

    static 
    {
        None = new p("None", 0);
        AudioContent = new p("AudioContent", 1);
        VideoContent = new p("VideoContent", 2);
        a = (new p[] {
            None, AudioContent, VideoContent
        });
    }
}
