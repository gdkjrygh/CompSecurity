// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hks extends nzc
{

    private final String a;
    private final String b;

    public hks(Context context, int i, String s, String s1)
    {
        super(context, new nyg(context, i), "collectionupdate", new pdl(), new pdm());
        a = s;
        b = s1;
    }

    protected final void a(qlw qlw)
    {
        qlw = (pdl)qlw;
        pix pix1 = new pix();
        pix1.a = new piq();
        pix1.a.b = 3;
        pix1.a.a = b;
        pix1.b = (new int[] {
            27
        });
        qeo qeo1 = new qeo();
        qeo1.a = a;
        pix1.c = new pja();
        pix1.c.a = qeo1;
        qlw.a = pix1;
    }
}
