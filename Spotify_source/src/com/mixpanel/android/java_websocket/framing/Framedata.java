// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.framing;

import java.nio.ByteBuffer;

public interface Framedata
{

    public abstract ByteBuffer c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract Opcode f();
}
