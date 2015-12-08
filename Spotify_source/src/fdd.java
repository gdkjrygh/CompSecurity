// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.collection.adapter.HeaderableAdapter;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class fdd extends HeaderableAdapter
{

    private final Drawable h;
    private fuj i;

    public fdd(Context context, epf epf, Verified verified, Flags flags)
    {
        super(context, epf, verified, flags);
        i = new fuj() {

            private fdd a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                obj = (fdj)obj;
                fve.a(fdd.a(a)).d(((fdj) (obj)).a(), ((fdj) (obj)).b()).a(((HeaderableAdapter) (a)).b).a(true).a(true).a(((HeaderableAdapter) (a)).c).a(spotifycontextmenu);
            }

            
            {
                a = fdd.this;
                super();
            }
        };
        h = dff.i(context);
    }

    static Context a(fdd fdd1)
    {
        return fdd1.a;
    }

    protected final void a(env env, dhu dhu1, int j)
    {
        boolean flag1 = true;
        fdj fdj1 = (fdj)env;
        dhu1.b(fdj1);
        dhu1.e(true);
        dib dib1 = (dib)dhu1.u();
        boolean flag;
        if (TextUtils.isEmpty(fdj1.b()))
        {
            env = "";
        } else
        {
            env = fdj1.b();
        }
        dib1.a(env);
        if (!TextUtils.isEmpty(super.d) && TextUtils.equals(super.d, fdj1.a()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dhu1.c(flag);
        if (super.e != null && super.e.equals(fdj1.a()))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        dhu1.d(flag);
        dib1.d().setImageDrawable(h);
        dib1.d().setVisibility(0);
        dhu1.a(gae.a(a, i, fdj1));
        dhu1.c(new fxh(i, fdj1));
    }
}
