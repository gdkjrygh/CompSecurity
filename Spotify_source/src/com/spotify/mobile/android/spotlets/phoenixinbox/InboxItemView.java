// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.phoenixinbox;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import dff;
import dft;
import dfz;
import dgo;
import dmz;
import gae;
import gcg;
import gji;
import gjj;
import gms;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class InboxItemView extends RelativeLayout
{

    public final ImageView a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final Drawable f;
    public final dfz g;
    public final DateFormat h;
    public ViewGroup i;
    public String j;
    public String k;
    public final gji l;

    public InboxItemView(Context context)
    {
        this(context, null);
    }

    public InboxItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = dff.j(context);
        g = new dfz(context, SpotifyIcon.D);
        g.a(dgo.b(context, 0x7f0101d2));
        g.a(dft.a(20F, context.getResources()));
        h = new SimpleDateFormat("EEEE d MMMM y HH:mm", context.getResources().getConfiguration().locale);
        inflate(context, 0x7f030145, this);
        int i1 = dft.a(16F, context.getResources());
        setPadding(0, i1, 0, i1);
        a = (ImageView)findViewById(0x7f1104dc);
        b = (ImageView)findViewById(0x7f1104dd);
        c = (TextView)findViewById(0x7f1104df);
        d = (TextView)findViewById(0x7f11026e);
        e = (TextView)findViewById(0x7f1102a3);
        d.setCompoundDrawablePadding(dft.a(6F, context.getResources()));
        b.setOnClickListener(new android.view.View.OnClickListener() {

            private InboxItemView a;

            public final void onClick(View view)
            {
                if (!TextUtils.isEmpty(InboxItemView.a(a)))
                {
                    a.getContext().startActivity(gms.a(a.getContext(), InboxItemView.a(a)).a(InboxItemView.b(a)).a);
                }
            }

            
            {
                a = InboxItemView.this;
                super();
            }
        });
        attributeset = new ShapeDrawable(new OvalShape()) {

            private InboxItemView a;

            public final int getIntrinsicHeight()
            {
                return dft.b(8F, a.getResources());
            }

            public final int getIntrinsicWidth()
            {
                return dft.b(8F, a.getResources());
            }

            
            {
                a = InboxItemView.this;
                super(shape);
            }
        };
        attributeset.getPaint().setColor(gcg.b(context, 0x7f0f0087));
        a.setImageDrawable(attributeset);
        i = (ViewGroup)findViewById(0x7f1102f5);
        i.addView(gae.b(context));
        dmz.a(gjj);
        l = gjj.a(context);
    }

    static String a(InboxItemView inboxitemview)
    {
        return inboxitemview.k;
    }

    static String b(InboxItemView inboxitemview)
    {
        return inboxitemview.j;
    }
}
