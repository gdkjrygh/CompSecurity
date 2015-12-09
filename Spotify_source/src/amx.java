// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.crashlytics.android.core.CodedOutputStream;

final class amx extends amv
{

    private final String a;
    private final String b;
    private final long c;

    public amx(anm anm1)
    {
        super(3, new amv[0]);
        a = anm1.a;
        b = anm1.b;
        c = anm1.c;
    }

    public final int a()
    {
        return CodedOutputStream.b(1, alr.a(a)) + CodedOutputStream.b(2, alr.a(b)) + CodedOutputStream.b(3, c);
    }

    public final void a(CodedOutputStream codedoutputstream)
    {
        codedoutputstream.a(1, alr.a(a));
        codedoutputstream.a(2, alr.a(b));
        codedoutputstream.a(3, c);
    }
}
