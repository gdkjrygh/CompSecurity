// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

final class ang.Object
    implements an
{

    private fyj a;

    public final da a(Bundle bundle)
    {
        return new cu(a.k(), dtw.a, fyj.G(), null, null);
    }

    public final void a()
    {
        fyj.b(a);
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        ((Cursor) (obj)).moveToFirst();
        if (((Cursor) (obj)).isAfterLast())
        {
            fyj.b(a);
            return;
        }
        fyj.d(gcw.a(((Cursor) (obj)), 0));
        fyj.e(gcw.a(((Cursor) (obj)), 1));
        obj = fyj.c(a);
        int i;
        if (fyj.H())
        {
            i = 0x7f080339;
        } else
        {
            i = 0x7f08033a;
        }
        ((TextView) (obj)).setText(i);
        if (fyj.I())
        {
            fyj.b(a);
            return;
        } else
        {
            fyj.f(a).postDelayed(fyj.d(a), fyj.e(a));
            return;
        }
    }

    (fyj fyj1)
    {
        a = fyj1;
        super();
    }
}
