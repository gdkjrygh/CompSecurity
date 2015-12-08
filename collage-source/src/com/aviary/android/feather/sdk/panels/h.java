// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.aviary.android.feather.headless.filters.impl.CropFilter;
import com.aviary.android.feather.headless.moa.d;
import com.aviary.android.feather.headless.moa.k;
import com.aviary.android.feather.library.d.c;
import com.aviary.android.feather.library.filters.a;
import com.aviary.android.feather.library.graphics.RectD;
import com.aviary.android.feather.library.services.ConfigService;
import com.aviary.android.feather.library.services.IAviaryController;
import com.aviary.android.feather.sdk.widget.AviaryAdapterView;
import com.aviary.android.feather.sdk.widget.AviaryGallery;
import com.aviary.android.feather.sdk.widget.AviaryHighlightImageButton;
import com.aviary.android.feather.sdk.widget.CropImageView;
import com.aviary.android.feather.sdk.widget.e;
import com.aviary.android.feather.sdk.widget.i;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONException;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            a

public class h extends com.aviary.android.feather.sdk.panels.a
    implements com.aviary.android.feather.sdk.widget.AviaryAdapterView.c, com.aviary.android.feather.sdk.widget.AviaryGallery.a
{
    private class a extends BaseAdapter
    {

        LayoutInflater a;
        Resources b;
        final h c;
        private String d[];

        public int getCount()
        {
            return d.length;
        }

        public Object getItem(int j)
        {
            return d[j];
        }

        public long getItemId(int j)
        {
            return 0L;
        }

        public int getItemViewType(int j)
        {
            boolean flag = true;
            byte byte0;
            if (j >= 0 && j < getCount())
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            if (byte0 != 0)
            {
                byte0 = flag;
                if (c.x.contains(Integer.valueOf(j)))
                {
                    byte0 = 2;
                }
                return byte0;
            } else
            {
                return 0;
            }
        }

        public View getView(int j, View view, ViewGroup viewgroup)
        {
            int k = getItemViewType(j);
            viewgroup = view;
            if (view == null)
            {
                if (k == 1)
                {
                    viewgroup = a.inflate(com.aviary.android.feather.sdk.R.layout.aviary_gallery_crop_item_view, c.s, false);
                } else
                if (k == 2)
                {
                    viewgroup = a.inflate(com.aviary.android.feather.sdk.R.layout.aviary_gallery_crop_item_view_custom, c.s, false);
                } else
                {
                    viewgroup = a.inflate(com.aviary.android.feather.sdk.R.layout.aviary_gallery_item_view, c.s, false);
                    viewgroup.findViewById(com.aviary.android.feather.sdk.R.id.image).setVisibility(8);
                }
            }
            if (k != 0)
            {
                view = (String)getItem(j);
                ((TextView)viewgroup.findViewById(com.aviary.android.feather.sdk.R.id.text)).setText(view);
                if (k == 1)
                {
                    view = (AviaryHighlightImageButton)viewgroup.findViewById(com.aviary.android.feather.sdk.R.id.image);
                    if (!c.y && !c.x.contains(Integer.valueOf(j)))
                    {
                        k = 0;
                    } else
                    {
                        k = 8;
                    }
                    if (view != null)
                    {
                        view.setVisibility(k);
                        view.setChecked(c.z);
                    }
                }
            }
            viewgroup.setId(j);
            return viewgroup;
        }

        public int getViewTypeCount()
        {
            return 3;
        }

        public a(Context context, String as[])
        {
            c = h.this;
            super();
            a = LayoutInflater.from(context);
            d = as;
            b = context.getResources();
        }
    }

    class b extends com.aviary.android.feather.common.utils.os.a
    {

        RectD a;
        d b;
        final h c;

        protected transient Bitmap a(Bitmap abitmap[])
        {
            Object obj = abitmap[0];
            double d1 = ((Bitmap) (obj)).getWidth();
            double d2 = ((Bitmap) (obj)).getHeight();
            obj = new k();
            ((k) (obj)).a((int)a.a, (int)a.b);
            k k1 = new k();
            k1.a((int)a.a(), (int)a.b());
            k k2 = new k(d1, d2);
            ((CropFilter)c.k).a(((k) (obj)));
            ((CropFilter)c.k).b(k1);
            ((CropFilter)c.k).c(k2);
            b = (d)((CropFilter)c.k).a().clone();
            try
            {
                obj = ((CropFilter)c.k).b(abitmap[0], null, 1, 1);
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
                return abitmap[0];
            }
            return ((Bitmap) (obj));
        }

        protected void a()
        {
            c.i();
        }

        protected void a(Bitmap bitmap)
        {
            c.j();
            ((CropImageView)c.c).a(bitmap, ((CropImageView)c.c).getAspectRatio(), ((CropImageView)c.c).getAspectRatioIsFixed());
            ((CropImageView)c.c).setHighlightView(null);
            c.e.a(b);
            c.e.a(new c());
            c.b(bitmap);
        }

        protected volatile void a(Object obj)
        {
            a((Bitmap)obj);
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Bitmap[])aobj);
        }

        public b(RectD rectd)
        {
            c = h.this;
            super();
            a = rectd;
        }
    }


    private boolean A;
    AviaryGallery s;
    String t[];
    String u[];
    int v;
    boolean w;
    HashSet x;
    boolean y;
    boolean z;

    public h(IAviaryController iaviarycontroller, com.aviary.android.feather.library.a.a a1)
    {
        super(iaviarycontroller, a1);
        v = 0;
        w = true;
        x = new HashSet();
        y = false;
        z = false;
    }

    private double a(int j, boolean flag)
    {
        String as[] = u[j].split(":");
        if (as.length == 2)
        {
            String s1;
            int k;
            int l;
            if (flag)
            {
                s1 = as[1];
            } else
            {
                s1 = as[0];
            }
            j = Integer.parseInt(s1);
            if (flag)
            {
                s1 = as[0];
            } else
            {
                s1 = as[1];
            }
            l = Integer.parseInt(s1);
            k = j;
            if (j == -1)
            {
                if (flag)
                {
                    j = g.getHeight();
                } else
                {
                    j = g.getWidth();
                }
                k = j;
            }
            if (l == -1)
            {
                if (flag)
                {
                    j = g.getWidth();
                } else
                {
                    j = g.getHeight();
                }
            } else
            {
                j = l;
            }
            if (k != 0 && j != 0)
            {
                return (double)k / (double)j;
            } else
            {
                return 0.0D;
            }
        } else
        {
            return 0.0D;
        }
    }

    private void a(double d1, boolean flag)
    {
        ((CropImageView)c).a(g, d1, flag);
    }

    private void a(HashSet hashset, String as[])
    {
        for (int j = 0; j < as.length; j++)
        {
            String as1[] = as[j].split(":");
            if (Integer.parseInt(as1[0]) == Integer.parseInt(as1[1]))
            {
                hashset.add(Integer.valueOf(j));
            }
        }

    }

    private void a(String as[], String as1[])
    {
        for (int j = 0; j < as.length; j++)
        {
            if (as[j].contains(":"))
            {
                String as2[] = as[j].split("[:]");
                as[j] = (new StringBuilder()).append(as2[1]).append(":").append(as2[0]).toString();
            }
            if (as1[j].contains(":"))
            {
                String as3[] = as1[j].split("[:]");
                as1[j] = (new StringBuilder()).append(as3[1]).append(":").append(as3[0]).toString();
            }
        }

    }

    private void b(double d1, boolean flag)
    {
        l.put("aspect", String.valueOf(d1));
        ((CropImageView)c).a(d1, flag);
    }

    public void A()
    {
        super.A();
        s.setOnItemsScrollListener(null);
        s.setOnItemClickListener(null);
    }

    protected void F()
    {
        (new b(new RectD(((CropImageView)c).getHighlightView().h()))).execute(new Bitmap[] {
            g
        });
    }

    public void a(Bitmap bitmap, Bundle bundle)
    {
        super.a(bitmap, bundle);
        bundle = (ConfigService)B().a(com/aviary/android/feather/library/services/ConfigService);
        k = com.aviary.android.feather.library.filters.a.d(com.aviary.android.feather.library.filters.a.a.g);
        t = bundle.h(com.aviary.android.feather.sdk.R.array.aviary_crop_labels);
        u = bundle.h(com.aviary.android.feather.sdk.R.array.aviary_crop_values);
        y = bundle.e(com.aviary.android.feather.sdk.R.integer.aviary_crop_invert_policy);
        if (!y)
        {
            if (bitmap.getHeight() > bitmap.getWidth())
            {
                w = true;
            } else
            {
                w = false;
            }
            a(x, u);
            if (w)
            {
                a(t, u);
            }
        }
        v = bundle.a(com.aviary.android.feather.sdk.R.integer.aviary_crop_selected_index);
        c = (CropImageView)b().findViewById(com.aviary.android.feather.sdk.R.id.aviary_crop_image);
        c.setDoubleTapEnabled(false);
        c.setScaleEnabled(true);
        c.setScrollEnabled(true);
        c.setDisplayType(it.sephiroth.android.library.imagezoom.ImageViewTouchBase.a.c);
        s = (AviaryGallery)f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_gallery);
        s.setDefaultPosition(v);
        s.setCallbackDuringFling(false);
        s.setAutoSelectChild(false);
        s.setAdapter(new a(B().a(), t));
        s.a(v, false, true);
    }

    public void a(AviaryAdapterView aviaryadapterview, View view, int j, long l)
    {
        A = false;
    }

    public volatile void a(boolean flag)
    {
        super.a(flag);
    }

    protected View b(LayoutInflater layoutinflater)
    {
        return layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_content_crop, null);
    }

    protected ViewGroup b(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return (ViewGroup)layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_panel_crop, viewgroup, false);
    }

    public void b(AviaryAdapterView aviaryadapterview, View view, int j, long l)
    {
        A = true;
    }

    public void c(AviaryAdapterView aviaryadapterview, View view, int j, long l)
    {
        boolean flag = true;
        if (j == v)
        {
            return;
        }
        q.c("onScrollFinished: %d --> %d", new Object[] {
            Integer.valueOf(v), Integer.valueOf(j)
        });
        v = j;
        double d1 = a(j, false);
        if (d1 == 0.0D)
        {
            flag = false;
        }
        b(d1, flag);
    }

    public void d(AviaryAdapterView aviaryadapterview, View view, int j, long l)
    {
        if (!y && !x.contains(Integer.valueOf(j)))
        {
            double d1;
            double d2;
            boolean flag;
            if (!z)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            z = flag;
            aviaryadapterview = (CropImageView)c;
            d2 = aviaryadapterview.getAspectRatio();
            view = aviaryadapterview.getHighlightView();
            d1 = d2;
            if (!aviaryadapterview.getAspectRatioIsFixed())
            {
                d1 = d2;
                if (view != null)
                {
                    d1 = (double)view.g().width() / (double)view.g().height();
                }
            }
            aviaryadapterview.a(1.0D / d1, aviaryadapterview.getAspectRatioIsFixed());
            a(t, u);
            s.l();
            this.l.put("aspect", String.valueOf(d1));
        }
    }

    public volatile boolean e()
    {
        return super.e();
    }

    public void y()
    {
        c.d();
        ((CropImageView)c).setOnHighlightSingleTapUpConfirmedListener(null);
        super.y();
    }

    public void z()
    {
        boolean flag = false;
        super.z();
        a(new i[] {
            s
        });
        s.setOnItemsScrollListener(this);
        s.setOnItemClickListener(this);
        double d1 = a(s.getSelectedItemPosition(), false);
        if (d1 != 0.0D)
        {
            flag = true;
        }
        a(d1, flag);
        d();
        c(true);
    }
}
