// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor;


public interface SeekMap
{

    public static final SeekMap f = new _cls1();

    public abstract boolean a();

    public abstract long b(long l);


    private class _cls1
        implements SeekMap
    {

        public final boolean a()
        {
            return false;
        }

        public final long b(long l)
        {
            return 0L;
        }

        _cls1()
        {
        }
    }

}
