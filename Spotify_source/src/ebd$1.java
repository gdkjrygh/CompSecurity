// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import java.util.ArrayList;

final class ang.Object
    implements an
{

    private String a;
    private ebg b;
    private ebd c;

    public final da a(Bundle bundle)
    {
        return c.a(c.d, a);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (!c.e)
        {
            ArrayList arraylist = new ArrayList();
            do
            {
                if (!((Cursor) (obj)).moveToNext())
                {
                    break;
                }
                com.spotify.mobile.android.service.media.browser.MediaBrowserItem mediabrowseritem = c.a(((Cursor) (obj)));
                if (mediabrowseritem != null)
                {
                    arraylist.add(mediabrowseritem);
                }
            } while (true);
            if (!arraylist.isEmpty())
            {
                c.a.b(this);
                b.a(arraylist);
                c.f = null;
            }
        }
    }

    (ebd ebd1, String s, ebg ebg1)
    {
        c = ebd1;
        a = s;
        b = ebg1;
        super();
    }
}
