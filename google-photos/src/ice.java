// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;

public final class ice
    implements nug
{

    private final Context a;
    private final idi b;

    ice(Context context, idi idi1)
    {
        a = context;
        b = idi1;
        idi1.a.a(this, false);
    }

    public final ich a(int i)
    {
        nwc nwc1 = b.a(i);
        if (nwc1 == null || !nwc1.g)
        {
            return ich.a;
        }
        if (nwc1.h)
        {
            return ich.b;
        } else
        {
            return ich.c;
        }
    }

    public final void b_(Object obj)
    {
        a.getContentResolver().notifyChange(nsw.a, null);
    }
}
