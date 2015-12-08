// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class myk
    implements ngo
{

    private final Context a;
    private final myf b;

    myk(Context context)
    {
        a = context;
        b = (myf)olm.a(context, myf);
    }

    static myf a(myk myk1)
    {
        return myk1.b;
    }

    static Context b(myk myk1)
    {
        return myk1.a;
    }

    public final int a()
    {
        return ngr.a;
    }

    public final ngp a(mmx mmx, boolean flag)
    {
        if (!flag)
        {
            return null;
        } else
        {
            return new myl(this);
        }
    }
}
