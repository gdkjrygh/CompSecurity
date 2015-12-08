// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.ws;

import java.io.IOException;
import okio.c;

public interface WebSocket
{
    public static final class PayloadType extends Enum
    {

        public static final PayloadType a;
        public static final PayloadType b;
        private static final PayloadType c[];

        public static PayloadType valueOf(String s)
        {
            return (PayloadType)Enum.valueOf(com/squareup/okhttp/ws/WebSocket$PayloadType, s);
        }

        public static PayloadType[] values()
        {
            return (PayloadType[])c.clone();
        }

        static 
        {
            a = new PayloadType("TEXT", 0);
            b = new PayloadType("BINARY", 1);
            c = (new PayloadType[] {
                a, b
            });
        }

        private PayloadType(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void a(PayloadType payloadtype, c c)
        throws IOException;

    public abstract void a(String s)
        throws IOException;
}
