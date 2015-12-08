// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

final class ang.Object
    implements fhb
{

    private esa a;

    public final void a(String s)
    {
        esc esc1 = a.Y;
        if (esc1.g == null)
        {
            esc1.g = esc1.e.a(new hgo(TimeUnit.MILLISECONDS, ((dup)dmz.a(dup)).b())).a(esc1.f).a(esc1.h);
        }
        esc1.e.onNext(s);
    }

    public final void a(boolean flag)
    {
    }

    public final void b(String s)
    {
        esc esc1 = a.Y;
        esc1.j = s;
        if (!TextUtils.isEmpty(esc1.j))
        {
            esc1.a.L();
            esc1.a.J();
            esc1.b.a(esc1.l, s);
        }
    }

    (esa esa1)
    {
        a = esa1;
        super();
    }
}
