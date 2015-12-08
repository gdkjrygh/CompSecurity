// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fht extends mtf
{

    private final int a;
    private final String b;
    private final String c;
    private final boolean j;

    public fht(int i, String s, String s1, boolean flag)
    {
        super("remotemedia.tasks.JoinOrPinEnvelope");
        boolean flag1;
        if (i != -1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.a(flag1);
        a = i;
        c = s1;
        b = s;
        j = flag;
    }

    protected final mue a(Context context)
    {
        hpz hpz1 = (hpz)olm.a(context, hpz);
        noz noz1 = noz.a(context, "JoinOrPinEnvelope", new String[0]);
        fhs fhs1;
        if (j)
        {
            fhs1 = fhs.a(context, c, b);
        } else
        {
            fhs1 = fhs.b(context, c, b);
        }
        hpz1.a(a, fhs1);
        if (!fhs1.a && noz1.a())
        {
            noy.a("tag", "remotemedia.tasks.JoinOrPinEnvelope");
        }
        ((est)olm.a(context, est)).d(a, b);
        return new mue(fhs1.a);
    }
}
