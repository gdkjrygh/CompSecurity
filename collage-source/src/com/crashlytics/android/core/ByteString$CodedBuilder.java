// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//            ByteString, CodedOutputStream

static final class <init>
{

    private final byte buffer[];
    private final CodedOutputStream output;

    public ByteString build()
    {
        output.checkNoSpaceLeft();
        return new ByteString(buffer, null);
    }

    public CodedOutputStream getCodedOutput()
    {
        return output;
    }

    private (int i)
    {
        buffer = new byte[i];
        output = CodedOutputStream.newInstance(buffer);
    }

    buffer(int i, buffer buffer1)
    {
        this(i);
    }
}
