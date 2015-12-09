// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.micro;

import java.io.IOException;

// Referenced classes of package com.google.protobuf.micro:
//            CodedOutputStreamMicro

public static final class  extends IOException
{

    ()
    {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
