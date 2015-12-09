// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.spotify.mobile.android.util.SpotifyLink;

public final class gcn
{

    public static final String a[] = {
        "album_uri"
    };
    public final SpotifyLink b;
    public gfi c;
    private final boolean d;
    private gco e;

    public gcn(Context context, SpotifyLink spotifylink, int i, gco gco1)
    {
        boolean flag = true;
        super();
        b = spotifylink;
        e = gco1;
        if (i != 1)
        {
            flag = false;
        }
        d = flag;
        c = new gfi(context, new gfk() {

            private gcn a;

            public final void a(gfi gfi1, Cursor cursor)
            {
                if (cursor.moveToFirst() && gcn.a(a) != null)
                {
                    if (!TextUtils.isEmpty(cursor = cursor.getString(0)))
                    {
                        gfi1 = cursor;
                        if (gcn.b(a))
                        {
                            gfi1 = gcn.a(a, cursor);
                        }
                        gcn.a(a).a(gfi1);
                        a.a();
                        return;
                    }
                }
            }

            
            {
                a = gcn.this;
                super();
            }
        });
    }

    static gco a(gcn gcn1)
    {
        return gcn1.e;
    }

    static String a(gcn gcn1, String s)
    {
        gcn1 = gcn1.b.a(1);
        if (TextUtils.isEmpty(gcn1))
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(s).append(":play:").append(gcn1).toString();
        }
    }

    static boolean b(gcn gcn1)
    {
        return gcn1.d;
    }

    public final void a()
    {
        if (c != null)
        {
            c.b();
            c = null;
        }
        e.a();
        e = null;
    }

}
