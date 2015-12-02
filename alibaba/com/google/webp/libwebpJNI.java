// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.webp;


public class libwebpJNI
{

    public static final native int WebPDecodeARGBFast(byte abyte0[], long l, int ai[], int ai1[], byte abyte1[]);

    public static final native int WebPDecodeRGB565Fast(byte abyte0[], long l, int ai[], int ai1[], byte abyte1[]);

    public static final native int WebPGetFeatures(byte abyte0[], long l, int ai[], int ai1[], int ai2[]);

    public static final native boolean testLibraryLoaded();
}
