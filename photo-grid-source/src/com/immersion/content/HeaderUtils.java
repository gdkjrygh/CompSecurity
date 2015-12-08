// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.immersion.content;

import java.nio.ByteBuffer;

public abstract class HeaderUtils
{

    public static int b044A044A044A044A044A044A = 1;
    public static int b044A044A044A044A044A044A = 2;
    public static int b044A044A044A044A044A044A = 86;

    public HeaderUtils()
    {
    }

    public static int b044A044A044A044A044A044A()
    {
        return 34;
    }

    public abstract int calculateBlockRate();

    public abstract int calculateBlockSize();

    public abstract int calculateByteOffsetIntoHapticData(int i);

    public abstract void dispose();

    public abstract String getContentUUID();

    public abstract int getEncryption();

    public abstract int getMajorVersionNumber();

    public abstract int getMinorVersionNumber();

    public abstract int getNumChannels();

    public abstract void setEncryptedHSI(ByteBuffer bytebuffer, int i);
}
