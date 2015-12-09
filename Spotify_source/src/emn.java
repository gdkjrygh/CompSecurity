// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.collection.adapter.HeaderableAdapter;
import com.spotify.mobile.android.spotlets.show.model.Covers;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class emn extends HeaderableAdapter
{

    private final String h;
    private fuj i;

    public emn(Context context, epf epf, Verified verified, Flags flags)
    {
        super(context, epf, verified, flags);
        i = new fuj() {

            private emn a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                obj = (enr)obj;
                fve.a(a.a).b(((enr) (obj)).getUri(), ((enr) (obj)).getName()).a(((HeaderableAdapter) (a)).b).a(true).a().b(true).a(((HeaderableAdapter) (a)).c).a(spotifycontextmenu);
            }

            
            {
                a = emn.this;
                super();
            }
        };
        h = context.getResources().getString(0x7f0803e1);
    }

    protected final void a(env env, dhu dhu1, int j)
    {
        boolean flag1 = true;
        enr enr1 = (enr)env;
        dhu1.b(enr1);
        dhu1.e(true);
        dib dib1 = (dib)dhu1.u();
        gji gji1;
        boolean flag;
        if (TextUtils.isEmpty(enr1.getName()))
        {
            env = "";
        } else
        {
            env = enr1.getName();
        }
        dib1.a(env);
        if (enr1.getArtist() == null || TextUtils.isEmpty(enr1.getArtist().getName()))
        {
            env = h;
        } else
        {
            env = enr1.getArtist().getName();
        }
        dib1.b(env);
        if (!TextUtils.isEmpty(super.d) && TextUtils.equals(super.d, enr1.getUri()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dhu1.c(flag);
        if (super.e != null && super.e.equals(enr1.getCollectionUri()))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        dhu1.d(flag);
        if (enr1.getCovers() != null)
        {
            env = enr1.getCovers().getImageUri(com.spotify.mobile.android.spotlets.show.model.Covers.Size.a);
        } else
        {
            env = "";
        }
        gji1 = g;
        gji1.a(dib1.d(), dto.a(env), dff.h(gji1.a), null);
        dib1.d().setVisibility(0);
        gdb.a(a, dib1.b(), enr1.getOfflineState(), enr1.getSyncProgress());
        dhu1.a(gae.a(a, i, enr1));
        dhu1.c(new fxh(i, enr1));
    }
}
