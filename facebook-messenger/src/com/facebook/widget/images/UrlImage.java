// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.images;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.facebook.b;
import com.facebook.common.v.j;
import com.facebook.common.w.n;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.q;
import com.facebook.ui.images.b.ab;
import com.facebook.ui.images.b.c;
import com.facebook.ui.images.b.h;
import com.facebook.ui.images.b.m;
import com.facebook.ui.images.b.o;
import com.facebook.ui.images.b.r;
import com.facebook.ui.images.b.v;
import com.facebook.ui.images.b.w;
import com.facebook.ui.images.cache.a;
import com.facebook.widget.f;
import com.facebook.widget.p;
import com.google.common.a.es;
import com.google.common.a.hq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

// Referenced classes of package com.facebook.widget.images:
//            j, i, h, f, 
//            ImageViewTouchBase, g, k

public class UrlImage extends f
    implements p
{

    public static final m a = null;
    private static Class b = com/facebook/widget/images/UrlImage;
    private static final android.widget.ImageView.ScaleType c[];
    private static final com.facebook.widget.images.j d[];
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private com.facebook.ui.images.d.h G;
    private boolean H;
    private Bitmap I;
    private final h e;
    private final c f;
    private LayoutInflater g;
    private final j h;
    private final a i;
    private ImageView j;
    private ProgressBar k;
    private Animation l;
    private ProgressBar m;
    private View n;
    private final com.facebook.widget.images.i o;
    private final com.facebook.widget.images.i p;
    private com.facebook.widget.images.h q;
    private boolean r;
    private List s;
    private com.facebook.widget.images.k t;
    private boolean u;
    private com.facebook.widget.images.j v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public UrlImage(Context context)
    {
        this(context, null, 0);
    }

    public UrlImage(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public UrlImage(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        o = new com.facebook.widget.images.i(null);
        p = new com.facebook.widget.images.i(null);
        v = j.NONE;
        F = false;
        H = false;
        t t1 = getInjector();
        g = (LayoutInflater)t1.a(android/view/LayoutInflater);
        e = (h)t1.a(com/facebook/ui/images/b/h);
        i = (a)t1.a(com/facebook/ui/images/cache/a);
        f = (c)t1.a(com/facebook/ui/images/b/c);
        o.g = android.widget.ImageView.ScaleType.CENTER_INSIDE;
        p.g = android.widget.ImageView.ScaleType.FIT_CENTER;
        attributeset = context.obtainStyledAttributes(attributeset, q.UrlImage);
        i1 = attributeset.getInt(q.UrlImage_loadResolutionDuringScroll, -1);
        if (i1 >= 0)
        {
            v = d[i1];
        }
        C = attributeset.getBoolean(q.UrlImage_shouldCacheOriginal, false);
        D = attributeset.getBoolean(q.UrlImage_shouldShowLoadingAnimation, false);
        l = AnimationUtils.loadAnimation(context, b.fade_in_thumbnail);
        x = attributeset.getBoolean(q.UrlImage_isShownInGallery, false);
        y = attributeset.getBoolean(q.UrlImage_useZoomableImageView, false);
        z = attributeset.getBoolean(q.UrlImage_useQuickContactBadge, false);
        A = attributeset.getBoolean(q.UrlImage_isUsedWithUploadProgress, false);
        if (x)
        {
            g.inflate(k.orca_url_image_gallery, this);
        } else
        if (y)
        {
            g.inflate(k.orca_url_zoomable_image, this);
        } else
        if (z)
        {
            g.inflate(k.orca_url_quick_contact_badge, this);
        } else
        if (A)
        {
            g.inflate(k.orca_url_image_upload_progress, this);
        } else
        {
            g.inflate(k.orca_url_image, this);
        }
        j = (ImageView)getView(i.url_image_image);
        k = (ProgressBar)getView(i.url_image_progress);
        m = (ProgressBar)getView(i.url_image_upload_progress);
        n = getView(i.url_image_upload_cover);
        context = attributeset.getString(q.UrlImage_url);
        if (!com.facebook.common.w.n.a(context))
        {
            p.a = com.facebook.ui.images.b.m.a(Uri.parse(context)).a();
        }
        i1 = attributeset.getInt(q.UrlImage_scaleType, -1);
        if (i1 >= 0)
        {
            p.g = c[i1];
        }
        p.j = attributeset.getBoolean(q.UrlImage_adjustViewBounds, false);
        i1 = attributeset.getInt(q.UrlImage_placeHolderScaleType, -1);
        if (i1 >= 0)
        {
            o.g = c[i1];
        }
        r = attributeset.getBoolean(q.UrlImage_showProgressBar, false);
        o.d = Integer.valueOf(attributeset.getResourceId(q.UrlImage_placeholderSrc, com.facebook.h.orca_photo_downloading));
        q = h.PLACEHOLDER;
        j.setImageResource(o.d.intValue());
        j.setScaleType(o.g);
        B = attributeset.getBoolean(q.UrlImage_retainImageDuringUpdate, false);
        setShouldRetryFetch(attributeset.getBoolean(q.UrlImage_shouldRetryFetch, false));
        attributeset.recycle();
        context = (com.facebook.common.v.f)t1.a(com/facebook/common/v/f);
        h = new com.facebook.widget.images.f(this);
        context.a(h);
    }

    static List a(UrlImage urlimage)
    {
        return urlimage.s;
    }

    private void a(Drawable drawable)
    {
        if (drawable != null && (j instanceof ImageViewTouchBase))
        {
            ((ImageViewTouchBase)j).setDrawable(drawable);
            return;
        } else
        {
            j.setImageDrawable(drawable);
            return;
        }
    }

    static void a(UrlImage urlimage, Throwable throwable)
    {
        urlimage.a(throwable);
    }

    static void a(UrlImage urlimage, List list)
    {
        urlimage.b(list);
    }

    private void a(com.facebook.widget.images.i i1)
    {
        j.setScaleType(i1.g);
        j.setImageMatrix(i1.h);
        j.setAdjustViewBounds(i1.j);
        if (i1.f != null && i1.f.intValue() != -1)
        {
            j.setBackgroundResource(i1.f.intValue());
        } else
        {
            j.setBackgroundDrawable(null);
        }
        if (i1.c != null)
        {
            a(i1.c);
        } else
        if (i1.e != null)
        {
            a(i1.e);
        } else
        if (i1.d != null && i1.d.intValue() != -1)
        {
            j.setImageResource(i1.d.intValue());
        } else
        {
            a(((Drawable) (null)));
        }
        G = i1.i;
        g();
    }

    private void a(Throwable throwable)
    {
        if (throwable instanceof CancellationException)
        {
            return;
        } else
        {
            s = null;
            setMode(h.PLACEHOLDER);
            return;
        }
    }

    private void a(List list)
    {
        ArrayList arraylist = hq.c(list.size());
        ArrayList arraylist1 = hq.c(list.size());
        com.google.common.d.a.s s1;
        for (list = list.iterator(); list.hasNext(); arraylist1.add(s1))
        {
            Object obj = (m)list.next();
            obj = new w(com.facebook.common.time.c.b(), e, f, ((m) (obj)));
            ((w) (obj)).a(getShouldRetryFetch());
            s1 = ((w) (obj)).b();
            arraylist.add(obj);
        }

        s = arraylist;
        com.google.common.d.a.i.a(com.google.common.d.a.i.a(arraylist1), new g(this, arraylist), f);
    }

    private void b(List list)
    {
        int i1 = 0;
        s = null;
        Bitmap bitmap = ((r)list.get(0)).a();
        if (p.a != null && bitmap != null && bitmap.getWidth() > 0)
        {
            list = new BitmapDrawable(getResources(), bitmap);
        } else
        if (p.b != null)
        {
            ArrayList arraylist = new ArrayList(list.size());
            for (; i1 < list.size(); i1++)
            {
                arraylist.add(i1, ((r)list.get(i1)).a());
            }

            list = p.b.b().a(arraylist);
        } else
        {
            list = null;
        }
        p.c = list;
        if (list != null)
        {
            setMode(h.LOADED_IMAGE);
            if (C)
            {
                e();
            }
            if (t != null)
            {
                t.a(list);
            }
        }
    }

    private boolean b()
    {
        while (p.a == null || s != null || w || q == h.LOADED_IMAGE) 
        {
            return true;
        }
        return false;
    }

    private void c()
    {
        if (s != null)
        {
            for (Iterator iterator = s.iterator(); iterator.hasNext(); ((w)iterator.next()).c()) { }
            s = null;
        }
    }

    private void d()
    {
        Object obj2;
        w = false;
        H = false;
        c();
        o.c = null;
        if (o.a != null)
        {
            Object obj = o.a.i();
            if (obj != null)
            {
                obj = (Bitmap)i.a(((com.facebook.ui.media.cache.l) (obj)));
                if (obj != null)
                {
                    o.c = new BitmapDrawable(getResources(), ((Bitmap) (obj)));
                }
            }
        }
        obj2 = getImagesToDownload();
        I = null;
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        arraylist = hq.a();
        for (Iterator iterator = ((List) (obj2)).iterator(); iterator.hasNext();)
        {
            com.facebook.ui.images.cache.d d1 = ((m)iterator.next()).i();
            if (d1 != null)
            {
label0:
                {
                    Bitmap bitmap = (Bitmap)i.a(d1);
                    if (bitmap == null)
                    {
                        break label0;
                    }
                    arraylist.add(com.facebook.ui.images.b.r.a(d1).a(bitmap).a(v.MEMORY_CACHE).a());
                    if (C)
                    {
                        e();
                    }
                }
            }
        }

          goto _L3
        boolean flag = false;
_L7:
        if (!flag) goto _L2; else goto _L4
_L4:
        H = true;
        b(arraylist);
_L5:
        return;
_L2:
        p.c = null;
        if (obj2 != null)
        {
            if (u && v != j.FULL_RES)
            {
                Object obj1;
                if (r)
                {
                    obj1 = h.PROGRESS_BAR;
                } else
                {
                    obj1 = h.PLACEHOLDER;
                }
                setLoadingMode(((com.facebook.widget.images.h) (obj1)));
                w = true;
                if (v != j.NONE)
                {
                    obj1 = new ArrayList();
                    for (obj2 = ((List) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); ((List) (obj1)).add(((m)((Iterator) (obj2)).next()).k())) { }
                    a(((List) (obj1)));
                    return;
                }
            } else
            {
                if (!w)
                {
                    com.facebook.widget.images.h h1;
                    if (r)
                    {
                        h1 = h.PROGRESS_BAR;
                    } else
                    {
                        h1 = h.PLACEHOLDER;
                    }
                    setLoadingMode(h1);
                }
                w = false;
                a(((List) (obj2)));
                return;
            }
        } else
        {
            setMode(h.PLACEHOLDER);
            return;
        }
        if (true) goto _L5; else goto _L3
_L3:
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void e()
    {
        if (p.b == null && p.a != null)
        {
            Object obj = p.a.j();
            obj = (Bitmap)i.a(((com.facebook.ui.media.cache.l) (obj)));
            if (obj != null)
            {
                I = ((Bitmap) (obj));
            }
        }
    }

    private void f()
    {
        if (k == null)
        {
            k = (ProgressBar)g.inflate(k.orca_url_image_progress_bar, this, false);
            addView(k);
        }
    }

    private void g()
    {
        if (G != null)
        {
            j.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
            Drawable drawable = j.getDrawable();
            if (drawable != null)
            {
                j.setImageMatrix(G.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), getWidth(), getHeight()));
            }
        }
    }

    private List getImagesToDownload()
    {
        if (p.a != null)
        {
            return es.a(p.a);
        }
        if (p.b != null)
        {
            return p.b.a();
        } else
        {
            return null;
        }
    }

    private void setLoadingMode(com.facebook.widget.images.h h1)
    {
        if (B && q == h.LOADED_IMAGE && h1 != h.LOADED_IMAGE)
        {
            return;
        } else
        {
            setMode(h1);
            return;
        }
    }

    private void setMode(com.facebook.widget.images.h h1)
    {
        if (!x) goto _L2; else goto _L1
_L1:
        if (h1 == h.LOADED_IMAGE || h1 == h.PLACEHOLDER)
        {
            k.setVisibility(8);
        }
        if (h1 != h.PLACEHOLDER) goto _L4; else goto _L3
_L3:
        a(o);
_L6:
        q = h1;
        return;
_L4:
        if (h1 == h.LOADED_IMAGE)
        {
            a(p);
            j.clearAnimation();
            if (D && !H)
            {
                j.startAnimation(l);
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (h1 == h.PROGRESS_BAR)
        {
            j.setVisibility(8);
            f();
            k.setVisibility(0);
        } else
        if (h1 == h.PLACEHOLDER)
        {
            j.setVisibility(0);
            if (k != null)
            {
                k.setVisibility(8);
            }
            a(o);
        } else
        if (h1 == h.LOADED_IMAGE)
        {
            a(p);
            j.clearAnimation();
            if (D && !H)
            {
                j.startAnimation(l);
            }
            j.setVisibility(0);
            if (k != null)
            {
                k.setVisibility(8);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(Uri uri, com.facebook.ui.images.base.b b1)
    {
        if (uri == null)
        {
            setImageParams((m)null);
            return;
        } else
        {
            setImageParams(com.facebook.ui.images.b.m.a(uri).a(b1).a());
            return;
        }
    }

    public void a(boolean flag)
    {
        u = flag;
        if (!flag && w)
        {
            d();
        }
    }

    public boolean a()
    {
        return F;
    }

    public boolean getAdjustViewBounds()
    {
        return p.j;
    }

    public Drawable getImageDrawable()
    {
        return p.c;
    }

    public m getImageParams()
    {
        return p.a;
    }

    public ImageView getImageView()
    {
        return j;
    }

    public ab getMultiFetchImageParams()
    {
        return p.b;
    }

    public Bitmap getOriginalImageBitmap()
    {
        if (I == null && p.a != null)
        {
            com.facebook.ui.images.cache.d d1 = p.a.j();
            I = (Bitmap)i.d(d1);
        }
        return I;
    }

    public int getPlaceHolderBackgroundResourceId()
    {
        if (o.f == null)
        {
            return o.f.intValue();
        } else
        {
            return -1;
        }
    }

    public Drawable getPlaceHolderDrawable()
    {
        return o.e;
    }

    public int getPlaceHolderResourceId()
    {
        if (o.d != null)
        {
            return o.d.intValue();
        } else
        {
            return -1;
        }
    }

    public android.widget.ImageView.ScaleType getPlaceHolderScaleType()
    {
        return o.g;
    }

    public m getPlaceholderImageParams()
    {
        return o.a;
    }

    public boolean getRetainImageDuringUpdate()
    {
        return B;
    }

    public android.widget.ImageView.ScaleType getScaleType()
    {
        return p.g;
    }

    public boolean getShouldRetryFetch()
    {
        return E;
    }

    public boolean getShowProgressBar()
    {
        return r;
    }

    public ProgressBar getUploadProgressBar()
    {
        return m;
    }

    public View getUploadProgressCoverView()
    {
        return n;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (!x && !y)
        {
            d();
        }
        setHasBeenAttached(true);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        setHasBeenAttached(false);
    }

    public void onFinishTemporaryDetach()
    {
        super.onFinishTemporaryDetach();
        if (!b())
        {
            d();
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        g();
    }

    public void setAdjustViewBounds(boolean flag)
    {
        p.j = flag;
        if (q == h.LOADED_IMAGE)
        {
            j.setAdjustViewBounds(flag);
        }
    }

    public void setHasBeenAttached(boolean flag)
    {
        F = flag;
    }

    public void setImageMatrix(Matrix matrix)
    {
        p.h = matrix;
        if (q == h.LOADED_IMAGE)
        {
            j.setImageMatrix(matrix);
        }
    }

    public void setImageParams(Uri uri)
    {
        if (uri == null)
        {
            setImageParams((m)null);
            return;
        } else
        {
            a(uri, ((com.facebook.ui.images.base.b) (null)));
            return;
        }
    }

    public void setImageParams(m m1)
    {
        com.facebook.ui.images.d.h h1 = null;
        p.b = null;
        if (!com.facebook.ui.images.b.m.a(m1, p.a))
        {
            p.a = m1;
            com.facebook.widget.images.i i1 = p;
            if (m1 != null)
            {
                h1 = m1.c();
            }
            i1.i = h1;
            d();
        }
    }

    public void setLoadResolutionDuringScroll(com.facebook.widget.images.j j1)
    {
        v = j1;
    }

    public void setMultiFetchImageParams(ab ab1)
    {
        p.a = null;
        p.i = null;
        if (!ab.a(ab1, p.b))
        {
            p.b = ab1;
            d();
        }
    }

    public void setOnImageDownloadListener(com.facebook.widget.images.k k1)
    {
        t = k1;
    }

    public void setPlaceHolderDrawable(Drawable drawable)
    {
        o.d = null;
        o.e = drawable;
        if (q == h.PLACEHOLDER)
        {
            j.setImageDrawable(drawable);
        }
    }

    public void setPlaceHolderResourceId(int i1)
    {
        o.d = Integer.valueOf(i1);
        o.e = null;
        if (q == h.PLACEHOLDER)
        {
            j.setImageResource(i1);
        }
    }

    public void setPlaceHolderScaleType(android.widget.ImageView.ScaleType scaletype)
    {
        o.g = scaletype;
        if (q == h.PLACEHOLDER)
        {
            j.setScaleType(scaletype);
        }
    }

    public void setPlaceholderBackgroundResourceId(int i1)
    {
        o.f = Integer.valueOf(i1);
        if (q == h.PLACEHOLDER)
        {
            j.setBackgroundResource(i1);
        }
    }

    public void setPlaceholderImageParams(m m1)
    {
        if (!com.facebook.ui.images.b.m.a(m1, o.a))
        {
            o.a = m1;
            d();
        }
    }

    public void setRetainImageDuringUpdate(boolean flag)
    {
        B = flag;
    }

    public void setScaleType(android.widget.ImageView.ScaleType scaletype)
    {
        p.g = scaletype;
        if (q == h.LOADED_IMAGE)
        {
            j.setScaleType(scaletype);
        }
    }

    public void setShouldCacheOriginal(boolean flag)
    {
        C = flag;
    }

    public void setShouldRetryFetch(boolean flag)
    {
        E = flag;
    }

    public void setShowProgressBar(boolean flag)
    {
        r = flag;
    }

    static 
    {
        c = (new android.widget.ImageView.ScaleType[] {
            android.widget.ImageView.ScaleType.MATRIX, android.widget.ImageView.ScaleType.FIT_XY, android.widget.ImageView.ScaleType.FIT_START, android.widget.ImageView.ScaleType.FIT_CENTER, android.widget.ImageView.ScaleType.FIT_END, android.widget.ImageView.ScaleType.CENTER, android.widget.ImageView.ScaleType.CENTER_CROP, android.widget.ImageView.ScaleType.CENTER_INSIDE
        });
        d = (new com.facebook.widget.images.j[] {
            j.NONE, j.LOW_RES, j.FULL_RES
        });
    }
}
