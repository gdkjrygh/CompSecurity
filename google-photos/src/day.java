// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;

final class day extends DataSetObserver
{

    private daw a;

    day(daw daw1)
    {
        a = daw1;
        super();
    }

    public final void onChanged()
    {
        a.c();
    }

    public final void onInvalidated()
    {
        daw.b(a);
        a.c();
    }
}
