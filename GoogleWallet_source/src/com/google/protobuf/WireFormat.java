// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;


public final class WireFormat
{

    static final int MESSAGE_SET_ITEM_END_TAG = makeTag(1, 4);
    static final int MESSAGE_SET_ITEM_TAG = makeTag(1, 3);
    static final int MESSAGE_SET_MESSAGE_TAG = makeTag(3, 2);
    static final int MESSAGE_SET_TYPE_ID_TAG = makeTag(2, 0);

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
