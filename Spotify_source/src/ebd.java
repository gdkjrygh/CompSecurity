// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.ArrayList;

public abstract class ebd
    implements ebi
{

    final dzs a;
    public final eay b;
    public final ecb c;
    public final Context d;
    boolean e;
    an f;

    public ebd(dzs dzs1, eay eay, ecb ecb, Context context)
    {
        a = dzs1;
        b = eay;
        c = ecb;
        d = context;
        e = false;
    }

    public abstract MediaBrowserItem a(Cursor cursor);

    public abstract da a(Context context, String s);

    public final void a()
    {
        e = true;
        if (f != null)
        {
            a.b(f);
            f = null;
        }
    }

    public final void a(String s, ebg ebg1, Flags flags)
    {
        if (e)
        {
            ebg1.a(new IllegalStateException("loadItems can not be called after stop()"));
            return;
        }
        if (!a(s))
        {
            ebg1.a(new IllegalArgumentException());
            return;
        }
        if (f != null)
        {
            a.b(f);
        }
        f = new an(s, ebg1) {

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
                        MediaBrowserItem mediabrowseritem = c.a(((Cursor) (obj)));
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

            
            {
                c = ebd.this;
                a = s;
                b = ebg1;
                super();
            }
        };
        a.a(f);
    }
}
