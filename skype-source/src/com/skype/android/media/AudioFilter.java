// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import java.nio.ByteBuffer;

public interface AudioFilter
{

    public abstract ByteBuffer a(ByteBuffer bytebuffer, int i, int j);
}
