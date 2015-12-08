// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;

final class ang.Object
    implements an
{

    private ezf a;

    public final da a(Bundle bundle)
    {
        bundle = dtp.b;
        return new cu(a.k(), bundle, ezd.b, null, "time_added");
    }

    public final void a()
    {
        ezf.b(a).b(null);
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        ezf.b(a).b(((Cursor) (obj)));
        if (((Cursor) (obj)).getCount() == 0)
        {
            ezf.c(a).d(true);
        } else
        {
            ezf.c(a).b(null);
        }
        if (!ezf.d(a).d())
        {
            ezf.d(a).b();
        }
    }

    (ezf ezf1)
    {
        a = ezf1;
        super();
    }
}
