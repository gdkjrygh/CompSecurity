// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;


// Referenced classes of package com.qihoo360.common.utils:
//            TLVParseHelper, TLVBuilder

class r extends TLVParseHelper
{

    final TLVBuilder a;

    public taType getDataTypeFromId(int i)
    {
        switch (i % 10)
        {
        default:
            return null;

        case 1: // '\001'
            return taType.DT_INT;

        case 2: // '\002'
            return taType.DT_LONG;

        case 3: // '\003'
            return taType.DT_STRING;

        case 4: // '\004'
            return taType.DT_BYTES;
        }
    }

    taType(TLVBuilder tlvbuilder)
    {
        a = tlvbuilder;
        super();
    }
}
