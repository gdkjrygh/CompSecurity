// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//            x, ae

public static final class b
{

    private final List a = new ArrayList();
    private final String b;
    private ae c;
    private PendingIntent d;
    private PendingIntent e;
    private long f;

    public final b a(long l)
    {
        f = l;
        return this;
    }

    public final f a(PendingIntent pendingintent)
    {
        d = pendingintent;
        return this;
    }

    public final d a(PendingIntent pendingintent, ae ae)
    {
        c = ae;
        e = pendingintent;
        return this;
    }

    public final e a(String s)
    {
        a.add(s);
        return this;
    }

    public final a a()
    {
        String as[] = (String[])a.toArray(new String[a.size()]);
        String s = b;
        ae ae = c;
        PendingIntent pendingintent = e;
        PendingIntent pendingintent1 = d;
        long l = f;
        return new nit>(as, ae, pendingintent, pendingintent1, new String[] {
            s
        }, l);
    }

    public (String s)
    {
        b = s;
    }
}
