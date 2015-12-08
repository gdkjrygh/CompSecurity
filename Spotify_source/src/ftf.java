// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.squareup.picasso.Picasso;

public final class ftf extends os
{

    private final fuj c;
    private String d;
    private String e;
    private Drawable f;
    private Drawable g;

    public ftf(Context context, fuj fuj1)
    {
        super(context);
        e = context.getString(0x7f0803e1);
        f = dff.a(context, SpotifyIcon.G);
        g = dff.i(context);
        c = (fuj)ctz.a(fuj1);
    }

    public final View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        cursor = dhv.e(context, viewgroup);
        cursor.a(gae.b(context));
        return cursor.v();
    }

    public final void a(View view, Context context, Cursor cursor)
    {
        boolean flag1 = true;
        view = dhu.b(view);
        dib dib1 = (dib)view.u();
        dny dny1 = new dny();
        dny1.a(cursor, e);
        view.b(dny1);
        cursor = view.x();
        byte byte0;
        boolean flag;
        if (dny1.f)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        cursor.setVisibility(byte0);
        cursor = dib1.d();
        if (!dny1.f)
        {
            gwb gwb1 = ((gft)dmz.a(gft)).a().a(dto.a(dny1.d));
            gwb1.a(g);
            gwb1.a(cursor, null);
            cursor.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        } else
        {
            ((gft)dmz.a(gft)).a().a(cursor);
            cursor.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            if (dny1.e)
            {
                cursor.setImageResource(0x7f020214);
            } else
            if (dny1.f)
            {
                cursor.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                cursor.setImageDrawable(f);
            } else
            {
                cursor.setImageResource(0x7f020213);
            }
        }
        view.e(true);
        dib1.a(dny1.b);
        cursor = new StringBuilder();
        if (!dny1.n() && !TextUtils.isEmpty(dny1.c()))
        {
            cursor.append(b.getString(0x7f0803fb, new Object[] {
                dny1.c()
            }));
            cursor.append(" \u2022 ");
        }
        if (dny1.m())
        {
            cursor.append(b.getResources().getQuantityString(0x7f090015, dny1.e(), new Object[] {
                Integer.valueOf(dny1.e())
            }));
            if (dny1.f() > 0)
            {
                cursor.append(", ").append(b.getResources().getQuantityString(0x7f090014, dny1.f(), new Object[] {
                    Integer.valueOf(dny1.f())
                }));
            }
        } else
        {
            cursor.append(b.getResources().getQuantityString(0x7f090016, dny1.e(), new Object[] {
                Integer.valueOf(dny1.e())
            }));
        }
        dib1.b(cursor.toString());
        gdb.a(context, dib1.b(), dny1.i, dny1.j);
        if (dny1.h && !TextUtils.isEmpty(dny1.c))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.b(flag);
        if (d != null && d.equals(dny1.c))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        view.d(flag);
        view.c(dny1.g);
        if (!dny1.f)
        {
            view.a(gae.a(b, c, dny1));
            view.c(new fxh(c, dny1));
        }
    }

    public final void a(String s)
    {
        d = s;
        notifyDataSetChanged();
    }
}
