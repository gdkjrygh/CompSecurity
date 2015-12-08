// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;

public final class hyc extends mvc
{

    private final hsw l;
    private final hrz m;
    private final ej n = new ej(this);
    private final int o;

    public hyc(Context context, int i, hsw hsw)
    {
        super(context);
        o = i;
        l = hsw;
        m = new hrz(context);
    }

    public final Object d()
    {
        return m.a(o, l);
    }

    protected final boolean q()
    {
        hrz hrz1 = m;
        int i = o;
        ej ej1 = n;
        hrz1.b.getContentResolver().registerContentObserver(hrz.a(i), false, ej1);
        return true;
    }

    protected final boolean r()
    {
        hrz hrz1 = m;
        ej ej1 = n;
        hrz1.b.getContentResolver().unregisterContentObserver(ej1);
        return true;
    }
}
