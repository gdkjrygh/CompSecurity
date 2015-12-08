// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.glue.organisms.header;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.spotify.android.glue.organisms.header.transformations.TransformationSet;
import dco;
import dek;
import del;
import det;
import dew;
import dex;
import dey;
import dez;
import dfa;
import dfb;
import dgm;
import java.util.Arrays;
import jz;
import km;

// Referenced classes of package com.spotify.android.glue.organisms.header:
//            GlueBaseHeaderView

public class GlueCoverArtHeaderView extends GlueBaseHeaderView
{

    public ImageView c;
    private final TransformationSet d;
    private LinearLayout e;
    private Context f;

    public GlueCoverArtHeaderView(Context context)
    {
        this(context, null);
    }

    public GlueCoverArtHeaderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        findViewById(0x7f1103e4);
        e = (LinearLayout)findViewById(0x7f1103e7);
        c = (ImageView)findViewById(0x7f1103e6);
        f = new ContextThemeWrapper(context, 0x7f0b018d);
        d = ((dex)dew.a(0.1F, 0.8F).a().a(1.0F, 0.0F).a(dco.a).a(new dfb[] {
            det.a(a, View.ALPHA)
        }).a().a(1.0F, 0.5F).a(new dfb[] {
            det.a(a, Arrays.asList(new Property[] {
                View.SCALE_X, View.SCALE_Y
            }))
        }).a(0.0F, -128F).a(new dfb[] {
            det.a(a, View.TRANSLATION_Y)
        }).b()).b().c();
    }

    static ImageView a(GlueCoverArtHeaderView gluecoverartheaderview)
    {
        return gluecoverartheaderview.c;
    }

    protected final int a()
    {
        return 0x7f0300ac;
    }

    public final volatile void a(int i)
    {
        super.a(i);
    }

    public final void a(int i, float f1)
    {
        super.a(i, f1);
        d.a(f1);
        km.d(this);
    }

    public final volatile void a(Button button)
    {
        super.a(button);
    }

    public final void a(del del1)
    {
        e.addView(del1.a(), new android.widget.LinearLayout.LayoutParams(-2, -2));
    }

    public final volatile ViewGroup b()
    {
        return super.b();
    }

    public final volatile void b(int i)
    {
        super.b(i);
    }

    public final ImageView c()
    {
        return c;
    }

    public final volatile void c(int i)
    {
        super.c(i);
    }

    public final Context d()
    {
        return f;
    }

    public final volatile void d(int i)
    {
        super.d(i);
    }

    public final dgm e()
    {
        return new dgm() {

            private GlueCoverArtHeaderView a;

            public final View a()
            {
                return a;
            }

            public final void a(View view)
            {
                throw new UnsupportedOperationException("setContentView is not supported in GlueCoverArtHeaderView.");
            }

            public final void a(CharSequence charsequence)
            {
                a.a(charsequence);
            }

            public final void a(jz jz)
            {
                throw new UnsupportedOperationException("setAdapter is not supported in GlueCoverArtHeaderView.");
            }

            public final ImageView b()
            {
                return GlueCoverArtHeaderView.a(a);
            }

            public final void b(View view)
            {
                throw new UnsupportedOperationException("setImageOverlay is not supported in GlueCoverArtHeaderView.");
            }

            
            {
                a = GlueCoverArtHeaderView.this;
                super();
            }
        };
    }

    public final volatile void e(int i)
    {
        super.e(i);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        b.a(canvas);
    }
}
