// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan;


public interface ICloudHttpClient
{

    public abstract boolean Cancel();

    public abstract byte[] RequestCallback(String s, String s1, byte abyte0[], int i, int ai[]);
}
