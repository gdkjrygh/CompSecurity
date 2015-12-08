// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;


// Referenced classes of package com.crashlytics.android:
//            CodedOutputStream, ByteString

final class eData.e extends ge
{

    private final long a;
    private final String b;
    private final String c;
    private final long d;
    private final int e;

    public int a()
    {
        return CodedOutputStream.b(1, a) + CodedOutputStream.b(2, ByteString.a(b)) + CodedOutputStream.b(3, ByteString.a(c)) + CodedOutputStream.b(4, d) + CodedOutputStream.d(5, e);
    }

    public void a(CodedOutputStream codedoutputstream)
    {
        codedoutputstream.a(1, a);
        codedoutputstream.a(2, ByteString.a(b));
        codedoutputstream.a(3, ByteString.a(c));
        codedoutputstream.a(4, d);
        codedoutputstream.a(5, e);
    }

    public ge(com.crashlytics.android.internal.models. )
    {
        super(3, new ge[0]);
        a = .;
        b = .;
        c = .;
        d = .;
        e = .;
    }
}
