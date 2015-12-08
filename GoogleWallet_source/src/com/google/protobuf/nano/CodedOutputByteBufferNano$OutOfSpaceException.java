// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;

// Referenced classes of package com.google.protobuf.nano:
//            CodedOutputByteBufferNano

public static final class  extends IOException
{

    (int i, int j)
    {
        String s = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
        super((new StringBuilder(String.valueOf(s).length() + 31)).append(s).append(i).append(" limit ").append(j).append(").").toString());
    }
}
