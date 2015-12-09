// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.crashlytics.android.core.CodedOutputStream;

final class amt extends amv
{

    private alr a;

    public amt(alr alr)
    {
        super(6, new amv[0]);
        a = alr;
    }

    public final int a()
    {
        return CodedOutputStream.b(1, a);
    }

    public final void a(CodedOutputStream codedoutputstream)
    {
        codedoutputstream.a(1, a);
    }
}
