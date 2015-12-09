// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.micro;


public final class WireFormatMicro
{

    static final int MESSAGE_SET_ITEM_END_TAG = 12;
    static final int MESSAGE_SET_ITEM_TAG = 11;
    static final int MESSAGE_SET_MESSAGE_TAG = 26;
    static final int MESSAGE_SET_TYPE_ID_TAG = 16;

    public static int getTagFieldNumber(int i)
    {
        return i >>> 3;
    }

    static int getTagWireType(int i)
    {
        return i & 7;
    }

    static int makeTag(int i, int j)
    {
        return i << 3 | j;
    }

}
