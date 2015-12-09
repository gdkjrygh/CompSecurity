// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.ui.activity.upsell.ondemand.OnDemandUpsellVariationFlag;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class fts extends os
{

    private final ftt c;
    private final fuj d;
    private final Flags e;
    private final String f;
    private final String g;
    private final String h;

    public fts(Context context, ftt ftt1, fuj fuj, Flags flags)
    {
        super(context);
        c = ftt1;
        d = fuj;
        e = flags;
        f = context.getResources().getString(0x7f0803e1);
        g = context.getString(0x7f0803b9);
        h = context.getString(0x7f0803ba);
    }

    public final View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        dmz.a(ftz);
        return ftz.a(context, viewgroup, e).a();
    }

    public final void a(View view, Context context, Cursor cursor)
    {
        view = (ddl)dds.a(view);
        context = new dnz();
        context.a(cursor, f, g, h);
        cursor = b;
        ftt ftt1 = c;
        Flags flags = e;
        view.a(gae.b(cursor));
        view.a().setTag(context);
        Object obj = new StringBuilder();
        if (ftt1.b() && !TextUtils.isEmpty(((dnz) (context)).g))
        {
            ((StringBuilder) (obj)).append(((dnz) (context)).g);
            ((StringBuilder) (obj)).append(" \u2022 ");
        }
        if (ftt1.a())
        {
            ((StringBuilder) (obj)).append(((dnz) (context)).d);
            ((StringBuilder) (obj)).append(" \u2022 ");
            ((StringBuilder) (obj)).append(((dnz) (context)).c);
        } else
        {
            ((StringBuilder) (obj)).append(((dnz) (context)).d);
        }
        view.a(((dnz) (context)).b);
        view.b(((StringBuilder) (obj)).toString());
        view.b(((dnz) (context)).j);
        view.a().setEnabled(((dnz) (context)).k);
        view.a(gex.a(flags));
        if (!gex.a(flags) && flags.a(fys.aK) != OnDemandUpsellVariationFlag.a)
        {
            ddm ddm1 = (ddm)view;
            int i = gcg.b(cursor, 0x7f0f010e);
            dfz dfz1 = new dfz(cursor, SpotifyIcon.x);
            obj = ddm1.e();
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)((ImageView) (obj)).getLayoutParams();
            layoutparams.height = -2;
            layoutparams.width = -2;
            layoutparams.gravity = 17;
            ((ImageView) (obj)).setImageDrawable(dfz1);
            ((ImageView) (obj)).setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
            ddm1.c().setTextColor(i);
            ddm1.d().setTextColor(i);
        }
        gdb.a(cursor, view.d(), ((dnz) (context)).i, -1);
        gdg.a(cursor, view.d(), ((dnz) (context)).l);
        if (d != null)
        {
            view.a(gae.a(b, d, context));
            view.a().setTag(0x7f110041, new fxh(d, context));
        }
    }
}
