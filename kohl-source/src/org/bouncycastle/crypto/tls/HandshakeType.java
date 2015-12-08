// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;


public class HandshakeType
{

    public static final short certificate = 11;
    public static final short certificate_request = 13;
    public static final short certificate_verify = 15;
    public static final short client_hello = 1;
    public static final short client_key_exchange = 16;
    public static final short finished = 20;
    public static final short hello_request = 0;
    public static final short server_hello = 2;
    public static final short server_hello_done = 14;
    public static final short server_key_exchange = 12;

    public HandshakeType()
    {
    }
}
