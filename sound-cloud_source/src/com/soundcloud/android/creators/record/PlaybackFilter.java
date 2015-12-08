// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.os.Parcelable;
import java.nio.ByteBuffer;

public interface PlaybackFilter
    extends Parcelable
{

    public abstract ByteBuffer apply(ByteBuffer bytebuffer, long l, long l1);
}
