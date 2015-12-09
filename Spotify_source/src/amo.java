// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.crashlytics.android.core.CodedOutputStream;

final class amo extends amv
{

    private final String a;
    private final String b;

    public amo(anj anj1)
    {
        super(2, new amv[0]);
        a = anj1.a;
        b = anj1.b;
    }

    public final int a()
    {
        int i = CodedOutputStream.b(1, alr.a(a));
        String s;
        if (b == null)
        {
            s = "";
        } else
        {
            s = b;
        }
        return CodedOutputStream.b(2, alr.a(s)) + i;
    }

    public final void a(CodedOutputStream codedoutputstream)
    {
        codedoutputstream.a(1, alr.a(a));
        String s;
        if (b == null)
        {
            s = "";
        } else
        {
            s = b;
        }
        codedoutputstream.a(2, alr.a(s));
    }
}
