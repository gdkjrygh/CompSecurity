// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.crashlytics.android.core.CodedOutputStream;

final class ams extends amv
{

    private final long a;
    private final String b;
    private final String c;
    private final int d;

    public ams(ano ano1)
    {
        super(3, new amv[0]);
        a = ano1.a;
        b = ano1.b;
        c = ano1.c;
        d = ano1.d;
    }

    public final int a()
    {
        return CodedOutputStream.b(1, a) + CodedOutputStream.b(2, alr.a(b)) + CodedOutputStream.b(3, alr.a(c)) + CodedOutputStream.b(4, 0L) + CodedOutputStream.c(5, d);
    }

    public final void a(CodedOutputStream codedoutputstream)
    {
        codedoutputstream.a(1, a);
        codedoutputstream.a(2, alr.a(b));
        codedoutputstream.a(3, alr.a(c));
        codedoutputstream.a(4, 0L);
        codedoutputstream.a(5, d);
    }
}
