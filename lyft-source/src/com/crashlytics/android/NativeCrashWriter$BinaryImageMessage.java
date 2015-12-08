// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.models.BinaryImageData;

// Referenced classes of package com.crashlytics.android:
//            CodedOutputStream, ByteString

final class d extends d
{

    private final long a;
    private final long b;
    private final String c;
    private final String d;

    public int a()
    {
        int i = CodedOutputStream.b(1, a);
        int j = CodedOutputStream.b(2, b);
        return i + CodedOutputStream.b(3, ByteString.a(c)) + j + CodedOutputStream.b(4, ByteString.a(d));
    }

    public void a(CodedOutputStream codedoutputstream)
    {
        codedoutputstream.a(1, a);
        codedoutputstream.a(2, b);
        codedoutputstream.a(3, ByteString.a(c));
        codedoutputstream.a(4, ByteString.a(d));
    }

    public (BinaryImageData binaryimagedata)
    {
        super(4, new it>[0]);
        a = binaryimagedata.a;
        b = binaryimagedata.b;
        c = binaryimagedata.c;
        d = binaryimagedata.d;
    }
}
