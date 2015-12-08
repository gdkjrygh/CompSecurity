// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.help;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.o;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.apps.translate.help:
//            h, i

public final class g extends Fragment
{

    private int aa;
    private int ab[];
    private int ac[];
    private int ad;
    private ProgressBar ae;
    private FrameLayout af;
    private RelativeLayout ag;
    private ImageView ah;
    private TextView ai;

    public g()
    {
    }

    static ProgressBar a(g g1)
    {
        return g1.ae;
    }

    static g a(int j, int ai1[], int ai2[], int k)
    {
        g g1 = new g();
        Bundle bundle = new Bundle();
        bundle.putInt("resId", j);
        bundle.putIntArray("slides", ai1);
        bundle.putIntArray("captions", ai2);
        bundle.putInt("bgcolor", k);
        if (((Fragment) (g1)).g >= 0)
        {
            throw new IllegalStateException("Fragment already active");
        } else
        {
            g1.i = bundle;
            return g1;
        }
    }

    static i a(ImageView imageview)
    {
        return b(imageview);
    }

    static RelativeLayout b(g g1)
    {
        return g1.ag;
    }

    private static i b(ImageView imageview)
    {
        if (imageview != null)
        {
            imageview = imageview.getDrawable();
            if (imageview instanceof h)
            {
                return (i)((h)imageview).a.get();
            }
        }
        return null;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        layoutinflater = layoutinflater.inflate(o.tour_slide, viewgroup, false);
        ah = (ImageView)layoutinflater.findViewById(m.image);
        ai = (TextView)layoutinflater.findViewById(0x1020014);
        ae = (ProgressBar)layoutinflater.findViewById(m.progressbar);
        af = (FrameLayout)layoutinflater.findViewById(m.layout);
        ag = (RelativeLayout)layoutinflater.findViewById(m.slide);
        if (ad != 0)
        {
            af.setBackgroundColor(a().getColor(ad));
        }
        return layoutinflater;
    }

    public final void a(Bundle bundle)
    {
        Object obj = null;
        super.a(bundle);
        Bundle bundle1 = super.i;
        int j;
        if (bundle1 != null)
        {
            j = bundle1.getInt("resId");
        } else
        {
            j = -1;
        }
        aa = j;
        if (bundle1 != null)
        {
            bundle = bundle1.getIntArray("slides");
        } else
        {
            bundle = null;
        }
        ab = bundle;
        bundle = obj;
        if (bundle1 != null)
        {
            bundle = bundle1.getIntArray("captions");
        }
        ac = bundle;
        if (bundle1 != null)
        {
            j = bundle1.getInt("bgcolor");
        } else
        {
            j = 0;
        }
        ad = j;
    }

    public final void b(Bundle bundle)
    {
        int i1;
        int j1;
        super.b(bundle);
        while (aa == -1 || ab == null || ac == null || !b()) 
        {
            return;
        }
        j1 = ab[aa];
        bundle = ah;
        i j = b(((ImageView) (bundle)));
        if (j != null)
        {
            int l = i.a(j);
            if (l != 0 && l == j1)
            {
                break MISSING_BLOCK_LABEL_153;
            }
            j.cancel(true);
        }
        i1 = 1;
_L1:
        if (i1 != 0)
        {
            i k = new i(this, bundle);
            bundle.setImageDrawable(new h(a(), k));
            k.execute(new Integer[] {
                Integer.valueOf(j1)
            });
        }
        i1 = ac[aa];
        if (i1 != 0)
        {
            ai.setText(i1);
            return;
        } else
        {
            ai.setVisibility(8);
            return;
        }
        i1 = 0;
          goto _L1
    }
}
