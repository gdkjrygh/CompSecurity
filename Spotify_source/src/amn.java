// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.crashlytics.android.core.CodedOutputStream;

final class amn extends amv
{

    private final long a;
    private final long b;
    private final String c;
    private final String d;

    public amn(ani ani1)
    {
        super(4, new amv[0]);
        a = ani1.a;
        b = ani1.b;
        c = ani1.c;
        d = ani1.d;
    }

    public final int a()
    {
        int i = CodedOutputStream.b(1, a);
        int j = CodedOutputStream.b(2, b);
        return i + CodedOutputStream.b(3, alr.a(c)) + j + CodedOutputStream.b(4, alr.a(d));
    }

    public final void a(CodedOutputStream codedoutputstream)
    {
        codedoutputstream.a(1, a);
        codedoutputstream.a(2, b);
        codedoutputstream.a(3, alr.a(c));
        codedoutputstream.a(4, alr.a(d));
    }
}
