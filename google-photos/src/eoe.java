// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import java.util.ArrayList;

final class eoe
    implements mpj
{

    private eod a;

    eoe(eod eod1)
    {
        a = eod1;
        super();
    }

    public final void a(int i, Intent intent)
    {
        if (i == -1 && eod.a(a).b(s.j))
        {
            intent = new ArrayList(eod.a(a).a(s.j));
            eod.b(a).a(intent);
            eod.c(a);
        }
    }
}
