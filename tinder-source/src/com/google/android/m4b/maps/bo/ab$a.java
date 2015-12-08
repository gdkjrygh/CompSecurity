// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import java.io.DataInput;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            ab

public static final class nit> extends ab
{

    public static final a c = new <init>();

    public static nit> b(DataInput datainput)
    {
        return new <init>(datainput.readUnsignedByte());
    }

    public final int d()
    {
        return a >> 4 & 0xf;
    }


    private ()
    {
        super(80);
    }

    private nit>(int i)
    {
        super(i);
    }
}
