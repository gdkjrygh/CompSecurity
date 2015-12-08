// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import java.util.Iterator;
import java.util.List;

final class ang.Object
    implements an
{

    private fzq a;

    public final da a(Bundle bundle)
    {
        return new cu(a.k(), dtw.a, new String[] {
            "connected"
        }, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (((Cursor) (obj)).moveToFirst())
        {
            boolean flag;
            if (((Cursor) (obj)).getLong(0) != 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!fzq.a(a).isEmpty())
            {
                ((ddi)((Pair)fzq.a(a).get(0)).first).b(flag);
            }
            for (obj = fzq.a(a).iterator(); ((Iterator) (obj)).hasNext(); ((ddi)((Pair)((Iterator) (obj)).next()).first).a().setEnabled(flag)) { }
        }
    }

    (fzq fzq1)
    {
        a = fzq1;
        super();
    }
}
