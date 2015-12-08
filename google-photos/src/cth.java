// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;

final class cth extends DataSetObserver
{

    private ctg a;

    cth(ctg ctg1)
    {
        a = ctg1;
        super();
    }

    public final void onChanged()
    {
        ctg.a(a, -1);
        ctg.a(a);
    }

    public final void onInvalidated()
    {
        ctg.b(a, -1);
        ctg.a(a);
    }
}
