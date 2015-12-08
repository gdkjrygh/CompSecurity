// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;


// Referenced classes of package com.crashlytics.android:
//            CodedOutputStream, ByteString

final class b extends ge
{

    private final long a;
    private final String b;

    public int a()
    {
        return CodedOutputStream.b(1, a) + CodedOutputStream.b(2, ByteString.a(b));
    }

    public void a(CodedOutputStream codedoutputstream)
    {
        codedoutputstream.a(1, a);
        codedoutputstream.a(2, ByteString.a(b));
    }

    public ge(long l, String s, ssage ssage,  )
    {
        super(10, new ge[] {
            ssage, 
        });
        a = l;
        b = s;
    }
}
