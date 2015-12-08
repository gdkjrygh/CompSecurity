// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.model.Artist;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public final class emq extends os
{

    public String c;
    private final Flags d;
    private gji e;
    private final fuj f = new fuj() {

        private emq a;

        public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
        {
            obj = (Artist)obj;
            obj = fve.a(emq.b(a)).c(((Artist) (obj)).e, ((Artist) (obj)).d).a(ViewUri.bn);
            boolean flag;
            if (!eom.c(emq.a(a)))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((fuy) (obj)).a(flag).a(emq.a(a)).a(spotifycontextmenu);
        }

            
            {
                a = emq.this;
                super();
            }
    };

    public emq(Context context, Flags flags)
    {
        super(context);
        d = flags;
        dmz.a(gjj);
        e = gjj.a(context);
    }

    static Flags a(emq emq1)
    {
        return emq1.d;
    }

    static Context b(emq emq1)
    {
        return emq1.b;
    }

    public final View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return dhv.e(context, viewgroup).v();
    }

    public final void a(View view, Context context, Cursor cursor)
    {
        byte byte0 = 0;
        view = dhu.b(view);
        cursor = dnx.a(cursor);
        dib dib1 = (dib)view.u();
        dib1.a(((Artist) (cursor)).d);
        view.b(cursor);
        view.c(((Artist) (cursor)).h);
        view.b(true);
        view.e(true);
        TextView textview;
        int i;
        boolean flag;
        if (c != null && c.equals(((Artist) (cursor)).f))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.d(flag);
        e.d(dib1.d(), dto.a(((Artist) (cursor)).g));
        i = ((Artist) (cursor)).c;
        if (((Artist) (cursor)).i && i == 0)
        {
            dib1.c(b.getString(0x7f08018f));
        } else
        if (((Artist) (cursor)).i)
        {
            dib1.c(b.getResources().getQuantityString(0x7f090008, i, new Object[] {
                Integer.valueOf(i)
            }));
        } else
        {
            dib1.c(b.getResources().getQuantityString(0x7f090007, i, new Object[] {
                Integer.valueOf(i)
            }));
        }
        textview = dib1.b();
        if (eom.c(d))
        {
            byte0 = 8;
        }
        textview.setVisibility(byte0);
        gdb.a(context, dib1.b(), ((Artist) (cursor)).a, ((Artist) (cursor)).b);
        view.a(gae.a(b, f, cursor));
        view.c(new fxh(f, cursor));
    }
}
