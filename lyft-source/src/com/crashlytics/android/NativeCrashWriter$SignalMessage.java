// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.models.SignalData;

// Referenced classes of package com.crashlytics.android:
//            ByteString, CodedOutputStream

final class c extends e
{

    private final String a;
    private final String b;
    private final long c;

    public int a()
    {
        return CodedOutputStream.b(1, ByteString.a(a)) + CodedOutputStream.b(2, ByteString.a(b)) + CodedOutputStream.b(3, c);
    }

    public void a(CodedOutputStream codedoutputstream)
    {
        codedoutputstream.a(1, ByteString.a(a));
        codedoutputstream.a(2, ByteString.a(b));
        codedoutputstream.a(3, c);
    }

    public e(SignalData signaldata)
    {
        super(3, new e[0]);
        a = signaldata.a;
        b = signaldata.b;
        c = signaldata.c;
    }
}
