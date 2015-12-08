// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.collection.adapter.HeaderableAdapter;
import com.spotify.mobile.android.spotlets.show.model.Covers;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class emp extends HeaderableAdapter
{

    private final gji h;
    private fuj i;

    public emp(Context context, epf epf, Verified verified, Flags flags)
    {
        super(context, epf, verified, flags);
        i = new fuj() {

            private emp a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                obj = (ent)obj;
                obj = fve.a(a.a).c(((ent) (obj)).getUri(), ((ent) (obj)).getName()).a(((HeaderableAdapter) (a)).b);
                boolean flag;
                if (!eom.c(((HeaderableAdapter) (a)).c))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((fuy) (obj)).a(flag).a(((HeaderableAdapter) (a)).c).a(spotifycontextmenu);
            }

            
            {
                a = emp.this;
                super();
            }
        };
        dmz.a(gjj);
        h = gjj.a(context);
    }

    protected final void a(env env, dhu dhu1, int j)
    {
        boolean flag1 = true;
        ent ent1 = (ent)env;
        dhu1.b(ent1);
        dhu1.e(true);
        dib dib1 = (dib)dhu1.u();
        TextView textview;
        boolean flag;
        if (TextUtils.isEmpty(ent1.getName()))
        {
            env = "";
        } else
        {
            env = ent1.getName();
        }
        dib1.a(env);
        env = fiz.a(a, ent1, super.c);
        if (env != null)
        {
            dib1.c(env);
        }
        textview = dib1.b();
        if (env == null)
        {
            j = 8;
        } else
        {
            j = 0;
        }
        textview.setVisibility(j);
        if (!TextUtils.isEmpty(super.d) && TextUtils.equals(super.d, ent1.getUri()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dhu1.c(flag);
        if (super.e != null && super.e.equals(ent1.getCollectionUri()))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        dhu1.d(flag);
        if (ent1.getCovers() != null)
        {
            env = ent1.getCovers().getImageUri(com.spotify.mobile.android.spotlets.show.model.Covers.Size.a);
        } else
        {
            env = "";
        }
        h.d(dib1.d(), dto.a(env));
        dib1.d().setVisibility(0);
        gdb.a(a, dib1.b(), ent1.getOfflineState(), ent1.getSyncProgress());
        dhu1.a(gae.a(a, i, ent1));
        dhu1.c(new fxh(i, ent1));
    }
}
