// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;


// Referenced classes of package com.google.protobuf.nano:
//            b, d

public final class f
{

    public static final Object a = new Object();

    public static void a(b b1, b b2)
    {
        if (b1.unknownFieldData != null)
        {
            b2.unknownFieldData = b1.unknownFieldData.b();
        }
    }

}
