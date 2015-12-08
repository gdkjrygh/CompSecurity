// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.Closeable;

public interface FrameReader
    extends Closeable
{

    public abstract boolean nextFrame(Handler handler);

    public abstract void readConnectionPreface();
}
