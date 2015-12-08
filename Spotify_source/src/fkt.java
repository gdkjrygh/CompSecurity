// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import com.spotify.mobile.android.util.SpotifyLink;

public final class fkt
{

    private static String g[] = {
        "name", "icon_uri"
    };
    private static String h[] = {
        "unseen_count"
    };
    public String a;
    public fku b;
    public fky c;
    public final fkh d;
    public fkz e;
    public fkz f;

    public fkt(fky fky1, edk edk)
    {
        e = new fkz() {

            private fkt a;

            public final void a(Cursor cursor)
            {
                if (fkt.a(a) != null)
                {
                    fkt.a(a).a(cursor.getString(0), cursor.getString(1));
                }
            }

            
            {
                a = fkt.this;
                super();
            }
        };
        f = new fkz() {

            private fkt a;

            public final void a(Cursor cursor)
            {
                if (fkt.a(a) == null)
                {
                    return;
                } else
                {
                    fkt.b(a).a(fkt.a(a), cursor.getInt(0));
                    return;
                }
            }

            
            {
                a = fkt.this;
                super();
            }
        };
        c = fky1;
        if (edk == null)
        {
            fky1 = new fkj();
        } else
        {
            fky1 = new fki(edk);
        }
        d = fky1;
    }

    static fku a(fkt fkt1)
    {
        return fkt1.b;
    }

    static fkh b(fkt fkt1)
    {
        return fkt1.d;
    }

    public final void a()
    {
        c.a(e);
        c.a(f);
        android.net.Uri uri = dub.a(SpotifyLink.a(a).d());
        c.a(uri, g, e);
        c.a(dtp.a, h, f);
    }

}
