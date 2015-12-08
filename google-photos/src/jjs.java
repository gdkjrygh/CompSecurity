// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioTrack;
import android.os.ConditionVariable;

final class jjs extends Thread
{

    private AudioTrack a;
    private jjr b;

    jjs(jjr jjr1, AudioTrack audiotrack)
    {
        b = jjr1;
        a = audiotrack;
        super();
    }

    public final void run()
    {
        a.flush();
        a.release();
        jjr.a(b).open();
        return;
        Exception exception;
        exception;
        jjr.a(b).open();
        throw exception;
    }
}
