// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

final class ifs
    implements mpj
{

    private ifr a;

    ifs(ifr ifr1)
    {
        a = ifr1;
        super();
    }

    public final void a(int i, Intent intent)
    {
        ifr.a(a, false);
        if (i == -1)
        {
            ifr.a(a).b();
            if (intent != null)
            {
                intent = (ihk)intent.getParcelableExtra("share_details");
                if (intent != null)
                {
                    ifr.a(a, intent);
                    ifr.b(a);
                }
            }
        }
    }
}
