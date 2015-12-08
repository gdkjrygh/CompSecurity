// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.consumerphotoeditor.core.Look;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.fragments.ConsumerPhotoEditorActivity;
import com.google.android.apps.consumerphotoeditor.views.InterpolatedHorizontalScrollView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class bfd extends omp
    implements mti
{

    private static final int a[] = {
        12, 1, 6, 13
    };
    private volatile boolean ag;
    private int ah;
    private noz ai;
    private LinearLayout b;
    private InterpolatedHorizontalScrollView c;
    private mtj d;
    private List e;
    private bdo f;
    private View g;
    private volatile boolean h;

    public bfd()
    {
        e = new ArrayList();
        ah = 0;
        (new msi(pwu.C)).a(ae);
        new msh(af, (byte)0);
    }

    static List a(bfd bfd1)
    {
        return bfd1.e;
    }

    static void a(bfd bfd1, View view, String s, msp msp1, msp msp2)
    {
        int i = ((Integer)view.getTag()).intValue();
        PipelineParams pipelineparams = bfd1.f.f();
        bem bem1 = (bem)((am) (bfd1)).B.a("EditorFragment");
        boolean flag;
        if (i == 0 || pipelineparams.look != i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (pipelineparams.look == i || i == 0)
        {
            if (i != 0)
            {
                mry.a(bfd1.ad, 4, (new msn()).a(new msm(msp2)).a(bfd1.ad));
            } else
            if (pipelineparams.look == 0)
            {
                mry.a(bfd1.ad, 4, (new msn()).a(new msm(msp2)).a(bfd1.ad));
            } else
            {
                mry.a(bfd1.ad, 4, (new msn()).a(new msm(msp1)).a(bfd1.ad));
            }
            pipelineparams.look = 0;
            pipelineparams.lookIntensity = 0.5F;
            bfd1.f.a(pipelineparams);
            bfd1.f.g();
            bem1.r();
            b.a(bfd1.ad, view, bfd1.a(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_filter_deselected, new Object[] {
                s
            }));
        } else
        {
            pipelineparams.look = i;
            if (bfd1.f.y.containsKey(Integer.valueOf(i)))
            {
                pipelineparams.lookIntensity = ((Float)bfd1.f.y.get(Integer.valueOf(i))).floatValue();
            } else
            {
                pipelineparams.lookIntensity = 0.5F;
            }
            bfd1.f.a(pipelineparams);
            bem1.e(1);
            b.a(bfd1.ad, view, bfd1.a(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_filter_selected, new Object[] {
                view.getContentDescription()
            }));
            mry.a(bfd1.ad, 4, (new msn()).a(new msm(msp1)).a(bfd1.ad));
            if (a[bfd1.ah] == i)
            {
                bfd1.ah = bfd1.ah + 1;
                if (bfd1.ah == a.length)
                {
                    bfd1.ah = 0;
                    view = new bex(bem1);
                    ((bex) (view)).b.a.removeCallbacksAndMessages(null);
                    view.a = System.currentTimeMillis();
                    ((bex) (view)).b.a.postDelayed(view, 25L);
                }
            } else
            {
                bfd1.ah = 0;
            }
        }
        view = bfd1.e.iterator();
        while (view.hasNext()) 
        {
            s = (bho)view.next();
            boolean flag1;
            if (((Integer)s.getTag()).intValue() == pipelineparams.look)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            s.a(flag1, true);
        }
        if (flag)
        {
            bfd1.a(true);
        }
    }

    static void a(bfd bfd1, boolean flag)
    {
        bfd1.a(false);
    }

    private void a(boolean flag)
    {
        int i;
        Object obj = f.f();
        Iterator iterator = e.iterator();
label0:
        do
        {
label1:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                bho bho1 = (bho)iterator.next();
                if (((Integer)bho1.getTag()).intValue() != ((PipelineParams) (obj)).look)
                {
                    continue;
                }
                i = bho1.getLeft();
                i = (bho1.getWidth() / 2 + i) - c.getWidth() / 2;
                if (!flag)
                {
                    break label1;
                }
                obj = c;
                obj.b = SystemClock.elapsedRealtime();
                obj.c = ((InterpolatedHorizontalScrollView) (obj)).b + (long)((InterpolatedHorizontalScrollView) (obj)).a;
                obj.d = ((InterpolatedHorizontalScrollView) (obj)).getScrollX();
                obj.e = ((InterpolatedHorizontalScrollView) (obj)).getScrollY();
                obj.f = i;
                obj.g = 0;
                ((InterpolatedHorizontalScrollView) (obj)).postInvalidate();
                break label0;
            }
        } while (true);
        return;
        c.scrollTo(i, 0);
        return;
    }

    static View b(bfd bfd1)
    {
        return bfd1.g;
    }

    static boolean b(bfd bfd1, boolean flag)
    {
        bfd1.ag = true;
        return true;
    }

    static boolean c(bfd bfd1)
    {
        return bfd1.h;
    }

    static boolean d(bfd bfd1)
    {
        return bfd1.ag;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        f = ((ConsumerPhotoEditorActivity)O_()).j();
        g = layoutinflater.inflate(com.google.android.apps.consumerphotoeditor.R.layout.cpe_looks_toolbar_fragment, viewgroup, false);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            g.setAlpha(0.0F);
        }
        c = (InterpolatedHorizontalScrollView)g.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_looks_list_scroll_view);
        b = (LinearLayout)g.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_looks_list);
        c.addOnLayoutChangeListener(new bfe(this));
        return g;
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (s.equals("LooksTask") && b.a(mue1, s, ai))
        {
            h = true;
            b.removeAllViews();
            e.clear();
            if (b != null)
            {
                mua = (Look[])mue1.a().getParcelableArray("looks");
                if (mua != null)
                {
                    int j = g().getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_look_list_item_spacing);
                    PipelineParams pipelineparams = f.f();
                    int i = 0;
                    while (i < mua.length) 
                    {
                        Bitmap bitmap = ((Look) (mua[i])).a;
                        BitmapDrawable bitmapdrawable = new BitmapDrawable(g(), bitmap);
                        mue1 = ((Look) (mua[i])).b;
                        s = mue1;
                        if (mue1.isEmpty())
                        {
                            s = a(com.google.android.apps.consumerphotoeditor.R.string.cpe_none_filter);
                        }
                        mue1 = new bho(ad, bitmapdrawable, s, ((Look) (mua[i])).c, ((Look) (mua[i])).d, ((Look) (mua[i])).e);
                        mue1.setTag(Integer.valueOf(i));
                        boolean flag;
                        if (pipelineparams.look == i)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        mue1.a(flag, false);
                        mue1.setContentDescription(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_filter_name, new Object[] {
                            s
                        }));
                        if (android.os.Build.VERSION.SDK_INT >= 16)
                        {
                            mue1.setAlpha(0.0F);
                        }
                        mue1.setOnClickListener(new bfg(this, s, new msp(((Look) (mua[i])).d), new msp(((Look) (mua[i])).e)));
                        s = new android.widget.LinearLayout.LayoutParams(bitmap.getWidth(), bitmap.getHeight());
                        s.leftMargin = j / 2;
                        s.rightMargin = j / 2;
                        if (mk.h(g) == 1)
                        {
                            b.addView(mue1, 0, s);
                        } else
                        {
                            b.addView(mue1, s);
                        }
                        e.add(mue1);
                        i++;
                    }
                    a(false);
                    return;
                }
            }
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        d = (mtj)ae.a(mtj);
        d.a(this);
        ai = noz.a(ad, "LooksToolbarFragment", new String[0]);
    }

    public final void l()
    {
        super.l();
        if (super.w)
        {
            int i = g().getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_look_list_item_height);
            h = false;
            d.a(new bga(f, i));
        }
    }

    public final void m()
    {
        super.m();
        ag = false;
    }

}
