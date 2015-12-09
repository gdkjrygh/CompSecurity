// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.collection.adapter.HeaderableAdapter;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class ems extends HeaderableAdapter
{

    private final String h;
    private fuj i;

    public ems(Context context, epf epf, Verified verified, Flags flags)
    {
        super(context, epf, verified, flags);
        i = new fuj() {

            private ems a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                obj = (enw)obj;
                fve.a(a.a).a(((enw) (obj)).getUri(), ((enw) (obj)).getName()).a(((HeaderableAdapter) (a)).b).a(true).a(true).a(true).a(false, null).a(((HeaderableAdapter) (a)).c).a(spotifycontextmenu);
            }

            
            {
                a = ems.this;
                super();
            }
        };
        h = context.getResources().getString(0x7f0803e1);
    }

    protected final void a(env env, dhu dhu1, int j)
    {
        enw enw1 = (enw)env;
        dhu1.b(enw1);
        dhu1.e(gex.a(super.c));
        dib dib1 = (dib)dhu1.u();
        dib1.d().setVisibility(8);
        String s;
        boolean flag;
        if (TextUtils.isEmpty(enw1.getName()))
        {
            env = "";
        } else
        {
            env = enw1.getName();
        }
        dib1.a(env);
        s = fiz.a(enw1);
        env = s;
        if (s == null)
        {
            env = h;
        }
        dib1.b(env);
        if (!TextUtils.isEmpty(super.d) && TextUtils.equals(super.d, enw1.getUri()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dhu1.c(flag);
        dhu1.b(enw1.isPlayable());
        gdb.a(a, dib1.b(), enw1.getOfflineState(), -1);
        gdg.a(a, dib1.b(), enw1.isExplicit());
        dhu1.a(gae.a(a, i, enw1));
        dhu1.c(new fxh(i, enw1));
    }
}
