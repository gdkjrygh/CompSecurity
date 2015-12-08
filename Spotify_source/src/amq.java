// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.crashlytics.android.core.CodedOutputStream;

final class amq extends amv
{

    private final long a;
    private final String b;

    public transient amq(long l, String s, amv aamv[])
    {
        super(10, aamv);
        a = l;
        b = s;
    }

    public final int a()
    {
        return CodedOutputStream.b(1, a) + CodedOutputStream.b(2, alr.a(b));
    }

    public final void a(CodedOutputStream codedoutputstream)
    {
        codedoutputstream.a(1, a);
        codedoutputstream.a(2, alr.a(b));
    }
}
