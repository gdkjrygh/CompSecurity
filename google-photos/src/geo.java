// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class geo
    implements gev
{

    private final Context a;

    geo(Context context)
    {
        a = context;
    }

    public final geu a(int i, get get1)
    {
        switch (gep.a[get1.ordinal()])
        {
        default:
            return new geq(i, get1, true);

        case 1: // '\001'
            return new gen(a, i);

        case 2: // '\002'
            return new gex(i);

        case 3: // '\003'
            return new gew(a, i);

        case 4: // '\004'
        case 5: // '\005'
            return new geq(i, get1, false);

        case 6: // '\006'
            return new gem(a, i);
        }
    }
}
