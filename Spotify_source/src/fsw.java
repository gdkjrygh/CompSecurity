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

public final class fsw extends os
{

    private String c;
    private Drawable d;

    public fsw(Context context)
    {
        super(context);
        c = context.getString(0x7f0803e1);
        d = dff.a(context, SpotifyIcon.G);
    }

    public final View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return dhv.e(context, viewgroup).v();
    }

    public final void a(View view, Context context, Cursor cursor)
    {
        view = dhu.b(view);
        view.e(true);
        dib dib1 = (dib)view.u();
        dny dny1 = new dny();
        dny1.a(cursor, c);
        view.b(dny1);
        cursor = dib1.d();
        if (dny1.f)
        {
            ((gft)dmz.a(gft)).a().a(cursor);
            cursor.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            cursor.setImageDrawable(d);
        } else
        {
            dmz.a(gjj);
            gji gji1 = gjj.a(b);
            gji1.a(cursor, dto.a(dny1.d), dff.i(gji1.a), null);
            cursor.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        dib1.a(dny1.b);
        cursor = new StringBuilder();
        if (!dny1.n() && !TextUtils.isEmpty(dny1.c()))
        {
            cursor.append(b.getString(0x7f0803fb, new Object[] {
                dny1.c()
            }));
            cursor.append(" \u2014 ");
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
        view.b(true);
    }
}
