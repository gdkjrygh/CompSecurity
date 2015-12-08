// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class gci
    implements hqf
{

    private final noz a;
    private final gcf b;
    private final gdn c;

    gci(Context context, gcf gcf1, gdn gdn1)
    {
        b = gcf1;
        c = gdn1;
        a = noz.a(context, 3, "BootstrapBgJob", new String[] {
            "sync"
        });
    }

    public final String a()
    {
        return "BootstrapBgJob";
    }

    public final void a(int i, hqo hqo)
    {
        while (i == -1 || c.b(i) == gcp.d) 
        {
            return;
        }
        b.b(i);
    }
}
