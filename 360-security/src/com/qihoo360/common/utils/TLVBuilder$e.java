// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;


// Referenced classes of package com.qihoo360.common.utils:
//            TLVBuilder

private class d extends d
{

    final TLVBuilder c;
    private String d;

    public taType b()
    {
        return taType.DT_STRING;
    }

    public byte[] c()
    {
        if (d == null)
        {
            return null;
        } else
        {
            return d.getBytes();
        }
    }

    public int d()
    {
        if (d == null)
        {
            return 0;
        } else
        {
            return d.getBytes().length;
        }
    }

    public String e()
    {
        return d;
    }

    public String toString()
    {
        return (new StringBuilder("TLVItemString [mString=")).append(d).append(", mId=").append(a).append("]").toString();
    }

    public taType(TLVBuilder tlvbuilder, int i, String s)
    {
        c = tlvbuilder;
        super(tlvbuilder, null);
        d = null;
        a = i;
        d = s;
    }

    public d(TLVBuilder tlvbuilder, int i, byte abyte0[])
    {
        c = tlvbuilder;
        super(tlvbuilder, null);
        d = null;
        a = i;
        d = new String(abyte0);
    }
}
