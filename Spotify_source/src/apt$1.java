// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.util.concurrent.atomic.AtomicLong;

final class ang.Object
    implements apz
{

    private long a;
    private File b;
    private String c;
    private apt d;

    public final void a()
    {
        if (a < apt.a(d).get())
        {
            b.delete();
            return;
        } else
        {
            apt.a(d, c, b);
            return;
        }
    }

    (apt apt1, long l, File file, String s)
    {
        d = apt1;
        a = l;
        b = file;
        c = s;
        super();
    }
}
