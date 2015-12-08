// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.charts.model.ChartArtist;
import com.spotify.mobile.android.spotlets.charts.model.ChartEntry;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.HashMap;
import java.util.Map;

public final class emf extends fsx
{

    public String a;
    private final Flags b;
    private final fuj e;
    private final Map f = new HashMap();

    public emf(Context context, Flags flags, fuj fuj1)
    {
        super(context);
        b = (Flags)ctz.a(flags);
        e = (fuj)ctz.a(fuj1);
        int i = dft.a(16F, c.getResources());
        context = new dfz(c, SpotifyIcon.be);
        context.a(gcg.b(c, 0x7f0f00c0));
        context.setBounds(0, 0, i, i);
        flags = new dfz(c, SpotifyIcon.bg);
        flags.a(gcg.b(c, 0x7f0f00c1));
        flags.setBounds(0, 0, i, i);
        fuj1 = new ShapeDrawable(new emj(c.getResources().getDimensionPixelSize(0x7f0c009d)));
        fuj1.getPaint().setColor(gcg.b(c, 0x7f0f00c2));
        fuj1.setBounds(0, 0, i, i);
        f.put(com.spotify.mobile.android.spotlets.charts.model.ChartEntry.Status.c, context);
        f.put(com.spotify.mobile.android.spotlets.charts.model.ChartEntry.Status.b, flags);
        f.put(com.spotify.mobile.android.spotlets.charts.model.ChartEntry.Status.d, fuj1);
    }

    public final View a(Context context, int i, ViewGroup viewgroup)
    {
        boolean flag;
        if (!gex.a(b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return dds.c(context, viewgroup, flag).a();
    }

    public final void a(View view, Context context, int i)
    {
        ChartEntry chartentry = (ChartEntry)getItem(i);
        view = (ddp)dds.a(view);
        view.a(chartentry.name);
        view.b(ctw.a(", ").a(cuv.a(chartentry.artists, new ctv() {

            public final volatile Object a(Object obj)
            {
                return ((ChartArtist)obj).name;
            }

        })));
        view.a(i + 1);
        view.a((Drawable)f.get(chartentry.status));
        view.a(gex.a(b));
        view.a(gae.a(context, e, chartentry));
        view.b(TextUtils.equals(a, chartentry.uri));
        view.a().setEnabled(chartentry.playable);
    }
}
