// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.CursorAdapter;
import com.aviary.android.feather.common.utils.l;
import com.aviary.android.feather.headless.filters.INativeFilter;
import com.aviary.android.feather.headless.filters.NativeFilterProxy;
import com.aviary.android.feather.headless.filters.impl.EffectFilter;
import com.aviary.android.feather.headless.moa.MoaResult;
import com.aviary.android.feather.headless.moa.d;
import com.aviary.android.feather.library.filters.a;
import com.aviary.android.feather.library.services.ConfigService;
import com.aviary.android.feather.library.services.IAviaryController;
import it.sephiroth.android.library.picasso.f;
import java.io.IOException;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            f

public class k extends com.aviary.android.feather.sdk.panels.f
{
    class a extends f.b
    {

        final k p;

        protected f a(long l1, int i1, String s, String s1)
        {
            if (s != null)
            {
                return p. new c(p.v);
            } else
            {
                return null;
            }
        }

        public a(Context context, int i1, int j1, int l1, int i2, Cursor cursor)
        {
            p = k.this;
            super(k.this, context, i1, j1, l1, i2, cursor);
        }
    }

    protected class b extends f.c
    {

        final k g;

        public b(int i1)
        {
            g = k.this;
            super(k.this, i1);
        }
    }

    class c
        implements f
    {

        INativeFilter a;
        Bitmap b;
        final k c;

        private INativeFilter a(CharSequence charsequence)
        {
            EffectFilter effectfilter = (EffectFilter)com.aviary.android.feather.library.filters.a.d(com.aviary.android.feather.library.filters.a.a.e);
            effectfilter.a((String)charsequence);
            effectfilter.a(b.getWidth(), b.getHeight());
            return effectfilter;
        }

        public Bitmap a(Uri uri)
            throws IOException
        {
            try
            {
                uri = a(uri.getPath());
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw new IOException(uri);
            }
            return uri;
        }

        public Bitmap a(String s)
            throws Exception
        {
            if (a != null) goto _L2; else goto _L1
_L1:
            boolean flag;
            try
            {
                a = a(((CharSequence) (s)));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                flag = false;
                continue; /* Loop/switch isn't completed */
            }
            flag = true;
_L4:
            s = NativeFilterProxy.a(a(flag, a), b, null, 1, 1);
            s.execute();
            return ((MoaResult) (s)).outputBitmap;
_L2:
            flag = true;
            if (true) goto _L4; else goto _L3
_L3:
        }

        d a(boolean flag, INativeFilter inativefilter)
        {
            d d1 = com.aviary.android.feather.headless.moa.c.a();
            if (inativefilter != null)
            {
                d1.addAll(inativefilter.a());
            }
            if (com.aviary.android.feather.sdk.panels.k.a(c) != 1.0D)
            {
                inativefilter = com.aviary.android.feather.headless.moa.c.a("resize");
                inativefilter.a("size", c.u);
                inativefilter.a("force", true);
                d1.a(inativefilter);
            }
            inativefilter = com.aviary.android.feather.headless.moa.c.a("ext-roundedborders");
            inativefilter.a("padding", k.b(c));
            inativefilter.a("roundPx", k.c(c));
            inativefilter.a("strokeColor", com.aviary.android.feather.sdk.panels.k.d(c));
            inativefilter.a("strokeWeight", k.e(c));
            if (!flag)
            {
                inativefilter.a("overlaycolor", 0x99000000);
            }
            d1.a(inativefilter);
            return d1;
        }

        public c(Bitmap bitmap)
        {
            c = k.this;
            super();
            b = bitmap;
        }
    }


    private int E;
    private int F;
    private int G;
    private int H;
    private double I;

    public k(IAviaryController iaviarycontroller, com.aviary.android.feather.library.a.a a1)
    {
        super(iaviarycontroller, a1, com.aviary.android.feather.cds.a.b.b);
    }

    static double a(k k1)
    {
        return k1.I;
    }

    static int b(k k1)
    {
        return k1.E;
    }

    static int c(k k1)
    {
        return k1.F;
    }

    static int d(k k1)
    {
        return k1.G;
    }

    static int e(k k1)
    {
        return k1.H;
    }

    protected Bitmap a(Bitmap bitmap, int i1, int j1)
    {
        return ThumbnailUtils.extractThumbnail(bitmap, (int)((double)i1 / I), (int)((double)j1 / I));
    }

    protected CursorAdapter a(Context context, Cursor cursor)
    {
        return b(context, cursor);
    }

    protected INativeFilter a(com.aviary.android.feather.cds.s.a a1, int i1, boolean flag)
    {
        EffectFilter effectfilter = (EffectFilter)com.aviary.android.feather.library.filters.a.d(com.aviary.android.feather.library.filters.a.a.e);
        if (a1 != null)
        {
            effectfilter.a((new StringBuilder()).append(a1.c()).append("/").append(a1.b()).append(".json").toString());
            effectfilter.a(f.getWidth(), f.getHeight());
        }
        return effectfilter;
    }

    protected f.c a(int i1)
    {
        return new b(i1);
    }

    public void a(Bitmap bitmap, Bundle bundle)
    {
        super.a(bitmap, bundle);
        q.b((new StringBuilder()).append("FastPreview enabled: ").append(x).toString());
        E = s.g(com.aviary.android.feather.sdk.R.dimen.aviary_effect_thumb_padding);
        F = s.g(com.aviary.android.feather.sdk.R.dimen.aviary_effect_thumb_radius);
        H = s.g(com.aviary.android.feather.sdk.R.dimen.aviary_effect_thumb_stroke);
        G = s.d(com.aviary.android.feather.sdk.R.color.aviary_effect_thumb_stroke_color);
        I = 1.3999999999999999D;
        int i1 = l.e();
        if (i1 > 0 && i1 < 1000)
        {
            I = 2D;
        }
        q.a((new StringBuilder()).append("thumbnails scale factor: ").append(I).append(" with cpu: ").append(i1).toString());
    }

    protected f.b b(Context context, Cursor cursor)
    {
        return new a(context, com.aviary.android.feather.sdk.R.layout.aviary_frame_item, com.aviary.android.feather.sdk.R.layout.aviary_effect_item_more, com.aviary.android.feather.sdk.R.layout.aviary_effect_item_external, com.aviary.android.feather.sdk.R.layout.aviary_frame_item_divider, cursor);
    }

    protected void c()
    {
        super.c();
    }

    protected void i()
    {
        if (!x)
        {
            super.k();
            return;
        } else
        {
            super.i();
            return;
        }
    }

    protected void j()
    {
        if (!x)
        {
            super.l();
            return;
        } else
        {
            super.j();
            return;
        }
    }
}
