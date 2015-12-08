// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class jqe extends lja
{

    public final jrk a;
    public boolean b;

    public jqe(jrk jrk1)
    {
        super(jrk1.b(), jrk1.c);
        a = jrk1;
    }

    public final liy a()
    {
        liy liy1 = super.h.a();
        liy1.a(a.h().b());
        liy1.a(a.h.b());
        b(liy1);
        return liy1;
    }

    protected final void a(liy liy1)
    {
        liy1 = (jqz)liy1.b(jqz);
        if (TextUtils.isEmpty(((jqz) (liy1)).b))
        {
            liy1.b = a.g().b();
        }
        if (b && TextUtils.isEmpty(((jqz) (liy1)).d))
        {
            jrd jrd1 = a.f();
            liy1.d = jrd1.c();
            liy1.e = jrd1.b();
        }
    }
}
