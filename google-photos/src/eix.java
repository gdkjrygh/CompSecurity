// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.MatrixCursor;

public final class eix
{

    public final MatrixCursor a;

    public eix(String as[])
    {
        a = new MatrixCursor(as);
    }

    public final eiy a()
    {
        return new eiy(this);
    }

    public final void a(eiy eiy1)
    {
        a.addRow(eiy1.a);
    }
}
