// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.ave.dejavu;


public class DalvikClass
{

    public static final int DIRECT_METHOD = 1;
    public static final int VIRTUAL_METHOD = 0;
    private long c;
    private long f;

    public DalvikClass()
    {
    }

    public native int findMethod(String s, String s1, int i, int j, int k);

    public native int getCount(char c1);

    public native int invokeMethod(int i, int j, byte abyte0[], byte abyte1[], int k);

    public native void release();
}
