// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;

final class fag
    implements Runnable
{

    private final fai a;
    private final List b;
    private final noz c;

    public fag(Context context, fai fai1, List list)
    {
        a = fai1;
        b = list;
        c = noz.a(context, 3, "DatabaseProcessorExecut", new String[0]);
    }

    public final void run()
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ezz ezz1 = (ezz)iterator.next();
            long l = noy.a();
            if (c.a())
            {
                noy.a("DatabaseProcessor", ezz1);
            }
            ezz1.c();
            a.b(ezz1.a());
            if (c.a())
            {
                noy.a("duration", l);
            }
        } while (true);
    }
}
