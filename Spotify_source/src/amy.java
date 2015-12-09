// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.crashlytics.android.core.CodedOutputStream;

final class amy extends amv
{

    private final String a;
    private final int b;

    public amy(ann ann1, amw amw)
    {
        super(1, new amv[] {
            amw
        });
        a = ann1.a;
        b = ann1.b;
    }

    private boolean c()
    {
        return a != null && a.length() > 0;
    }

    public final int a()
    {
        int i;
        if (c())
        {
            i = CodedOutputStream.b(1, alr.a(a));
        } else
        {
            i = 0;
        }
        return i + CodedOutputStream.c(2, b);
    }

    public final void a(CodedOutputStream codedoutputstream)
    {
        if (c())
        {
            codedoutputstream.a(1, alr.a(a));
        }
        codedoutputstream.a(2, b);
    }
}
