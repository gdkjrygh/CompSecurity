// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;

public abstract class fvd
{

    private final SpotifyContextMenu a;
    private final fxu b = new fxu() {

        private fvd a;

        public final void a(Object obj)
        {
            obj = (fxr)obj;
            a.b(((fxr) (obj)));
        }

            
            {
                a = fvd.this;
                super();
            }
    };

    protected fvd(SpotifyContextMenu spotifycontextmenu)
    {
        a = spotifycontextmenu;
    }

    protected abstract fui a(String s, fxu fxu);

    protected abstract fxn a(String s);

    public final void a(fxr fxr1)
    {
        if (fxr1.a())
        {
            b(fxr1);
            return;
        } else
        {
            a.a();
            a.a = a(fxr1.b);
            a.a(a(fxr1.a, b));
            return;
        }
    }

    protected abstract void b(fxr fxr1);
}
