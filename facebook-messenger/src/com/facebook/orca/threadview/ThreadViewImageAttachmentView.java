// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.common.w.j;
import com.facebook.h;
import com.facebook.inject.t;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.attachments.ImageAttachmentData;
import com.facebook.orca.attachments.a;
import com.facebook.orca.attachments.f;
import com.facebook.orca.photos.view.PhotoViewActivity;
import com.facebook.ui.images.b.ab;
import com.facebook.ui.images.b.m;
import com.facebook.ui.images.b.o;
import com.facebook.ui.images.base.b;
import com.facebook.ui.images.d.c;
import com.facebook.ui.images.d.d;
import com.facebook.ui.images.d.i;
import com.facebook.ui.images.d.k;
import com.facebook.widget.images.UrlImage;
import com.google.common.a.es;
import com.google.common.a.ik;
import com.google.common.base.Joiner;
import java.util.Map;

// Referenced classes of package com.facebook.orca.threadview:
//            cf, ce, cd, cg, 
//            cc, l

public class ThreadViewImageAttachmentView extends ViewGroup
{

    private static final Map B = ik.a();
    private static final Class a = com/facebook/orca/threadview/ThreadViewImageAttachmentView;
    private static final int b[] = {
        0x10100a7
    };
    private static final int c[] = {
        0x101009e
    };
    private l A;
    private a d;
    private k e;
    private av f;
    private com.facebook.orca.photos.b.h g;
    private cg h;
    private com.facebook.common.executors.a i;
    private com.facebook.orca.photos.b.ab j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private Message t;
    private es u;
    private int v;
    private cf w;
    private int x;
    private int y;
    private Point z[];

    public ThreadViewImageAttachmentView(Context context)
    {
        this(context, null);
    }

    public ThreadViewImageAttachmentView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ThreadViewImageAttachmentView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        w = new cf(this, null);
        a(context, attributeset);
    }

    private int a(int i1, ImageAttachmentData imageattachmentdata)
    {
        return (int)(((float)i1 * (float)imageattachmentdata.e()) / (float)imageattachmentdata.d());
    }

    static int a(ThreadViewImageAttachmentView threadviewimageattachmentview)
    {
        return threadviewimageattachmentview.l;
    }

    private Bitmap a(Bitmap bitmap, Drawable drawable)
    {
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        drawable.setBounds(rect);
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        canvas.drawBitmap(bitmap, rect, rect, null);
        drawable.draw(canvas);
        return bitmap1;
    }

    static Bitmap a(ThreadViewImageAttachmentView threadviewimageattachmentview, Bitmap bitmap, Drawable drawable)
    {
        return threadviewimageattachmentview.a(bitmap, drawable);
    }

    private ab a(Uri uri, b b1)
    {
        return new ab(es.a(com.facebook.ui.images.b.m.a(uri).a(a(b1, h.orca_composer_overlay_normal)).a(), com.facebook.ui.images.b.m.a(uri).a(a(b1, h.orca_composer_overlay_pressed)).a()), w);
    }

    private b a(b b1, int i1)
    {
        return new ce(this, b1, i1);
    }

    private com.facebook.ui.images.d.h a(Point point, boolean flag)
    {
        i i1 = (new i()).a(0).c(point.x).b(0).d(point.y).a(true);
        point = (new d()).a((float)point.x / (float)point.y).b(0.0F).c(0.0F);
        if (flag)
        {
            point.b(0.5F);
            point.c(0.5F);
            point.a(c.CENTER);
        }
        i1.a(point.e());
        return i1.j();
    }

    private void a(int i1)
    {
        UrlImage urlimage = (UrlImage)getChildAt(i1);
        ImageAttachmentData imageattachmentdata = (ImageAttachmentData)u.get(i1);
        a(urlimage, imageattachmentdata, z[i1]);
        urlimage.setVisibility(0);
        urlimage.setOnClickListener(new cd(this, imageattachmentdata));
    }

    private void a(int i1, int j1)
    {
        if (i1 != 2 && i1 != 4 && i1 != 5) goto _L2; else goto _L1
_L1:
        int k1 = Math.min((j1 - k) / 2, n);
        if (k1 >= n) goto _L2; else goto _L3
_L3:
        n = k1;
        k1 = 1;
_L5:
        boolean flag;
label0:
        {
            if (i1 != 3 && i1 != 5)
            {
                flag = k1;
                if (i1 != 6)
                {
                    break label0;
                }
            }
            i1 = Math.min((j1 - k * 2) / 3, p);
            flag = k1;
            if (i1 < p)
            {
                p = i1;
                flag = true;
            }
        }
        if (flag)
        {
            z = getImageDimensions();
            for (i1 = 0; i1 < v && i1 < u.size(); i1++)
            {
                UrlImage urlimage = (UrlImage)getChildAt(i1);
                urlimage.setImageParams((m)null);
                a(urlimage, (ImageAttachmentData)u.get(i1), z[i1]);
            }

        }
        return;
_L2:
        k1 = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void a(int i1, int j1, int k1, int l1)
    {
        Point point = b(i1, j1);
        i1 = android.view.View.MeasureSpec.makeMeasureSpec(point.x, 0x40000000);
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(point.y, 0x40000000);
        x = resolveSize(point.x, k1);
        y = resolveSize(point.y, l1);
        if (z == null || x != z[0].x || y != z[0].y)
        {
            z = getImageDimensions();
        }
        measureChild(getChildAt(0), i1, j1);
    }

    private void a(Context context, AttributeSet attributeset)
    {
        attributeset = com.facebook.inject.t.a(context);
        d = (a)attributeset.a(com/facebook/orca/attachments/a);
        e = (k)attributeset.a(com/facebook/ui/images/d/k);
        f = (av)attributeset.a(com/facebook/analytics/av);
        g = (com.facebook.orca.photos.b.h)attributeset.a(com/facebook/orca/photos/b/h);
        i = (com.facebook.common.executors.a)attributeset.a(com/facebook/common/executors/a);
        j = (com.facebook.orca.photos.b.ab)attributeset.a(com/facebook/orca/photos/b/ab);
        k = com.facebook.common.w.j.a(context, 5F);
        l = com.facebook.common.w.j.a(context, 2.0F);
        m = com.facebook.common.w.j.a(context, 1.0F);
        n = com.facebook.common.w.j.a(context, 115F);
        o = com.facebook.common.w.j.a(context, 115F);
        p = com.facebook.common.w.j.a(context, 75F);
        q = com.facebook.common.w.j.a(context, 152F);
        r = com.facebook.common.w.j.a(context, 235F);
        s = com.facebook.common.w.j.a(context, 235F);
        h = new cg(this, null);
    }

    private void a(ImageAttachmentData imageattachmentdata)
    {
        Context context = getContext();
        Intent intent = new Intent(context, com/facebook/orca/photos/view/PhotoViewActivity);
        intent.putExtra("imageData", imageattachmentdata);
        intent.putExtra("imageAttachments", u);
        intent.putExtra("message", t);
        f.a((new cb("click")).f("message_image").g(t.d()).b("threadid", t.e()).a("num_images", u.size()));
        context.startActivity(intent);
    }

    static void a(ThreadViewImageAttachmentView threadviewimageattachmentview, ImageAttachmentData imageattachmentdata)
    {
        threadviewimageattachmentview.a(imageattachmentdata);
    }

    private void a(UrlImage urlimage, ImageAttachmentData imageattachmentdata, Point point)
    {
        Object obj;
        String s1;
        int i1;
        int j1;
        boolean flag;
        if (u.size() != 1 || !imageattachmentdata.c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s1 = Joiner.on('|').join(Integer.valueOf(point.x), Integer.valueOf(point.y), new Object[] {
            Boolean.valueOf(flag)
        });
        if (B.containsKey(s1))
        {
            obj = (com.facebook.ui.images.d.h)B.get(s1);
        } else
        {
            obj = a(point, flag);
            B.put(s1, obj);
        }
        obj = e.a(((com.facebook.ui.images.d.h) (obj)));
        if (imageattachmentdata.h() != null)
        {
            urlimage.setPlaceholderImageParams(com.facebook.ui.images.b.m.a(imageattachmentdata.h()).a(((b) (obj))).a());
        }
        if (imageattachmentdata.c())
        {
            if (imageattachmentdata.d() > imageattachmentdata.e())
            {
                float f1 = (float)imageattachmentdata.d() / (float)imageattachmentdata.e();
                j1 = point.y;
                i1 = (int)(f1 * (float)point.x);
            } else
            if (imageattachmentdata.d() < imageattachmentdata.e())
            {
                j1 = (int)(((float)imageattachmentdata.e() / (float)imageattachmentdata.d()) * (float)point.y);
                i1 = point.x;
            } else
            {
                i1 = Math.max(point.x, point.y);
                j1 = i1;
            }
        } else
        {
            i1 = (int)(1.5D * (double)Math.max(point.x, point.y));
            j1 = i1;
        }
        imageattachmentdata = imageattachmentdata.a().buildUpon();
        imageattachmentdata.appendQueryParameter("preview", "1");
        imageattachmentdata.appendQueryParameter("max_height", String.valueOf(j1));
        imageattachmentdata.appendQueryParameter("max_width", String.valueOf(i1));
        urlimage.setMultiFetchImageParams(a(imageattachmentdata.build(), ((b) (obj))));
    }

    static int[] a()
    {
        return b;
    }

    private int b(int i1, ImageAttachmentData imageattachmentdata)
    {
        return (int)(((float)i1 * (float)imageattachmentdata.d()) / (float)imageattachmentdata.e());
    }

    static int b(ThreadViewImageAttachmentView threadviewimageattachmentview)
    {
        return threadviewimageattachmentview.m;
    }

    private Point b(int i1, int j1)
    {
        ImageAttachmentData imageattachmentdata = (ImageAttachmentData)u.get(0);
        f f1 = imageattachmentdata.g();
        if (f1 == f.PORTRAIT || f1 == f.SQUARE || f1 == f.UNKNOWN)
        {
            int k1 = Math.min(s, i1);
            j1 = Math.min(r, j1);
            i1 = j1;
            if (j1 > k1)
            {
                i1 = k1;
            }
            if (imageattachmentdata.c())
            {
                j1 = Math.min(b(i1, imageattachmentdata), k1);
            } else
            {
                j1 = Math.min(s, k1);
            }
        } else
        {
            int l1 = Math.min(s, i1);
            j1 = Math.min(q, j1);
            i1 = j1;
            if (j1 > l1)
            {
                i1 = l1;
            }
            i1 = Math.min(a(l1, imageattachmentdata), i1);
            j1 = Math.min(b(i1, imageattachmentdata), l1);
        }
        return new Point(j1, i1);
    }

    static int[] b()
    {
        return c;
    }

    static es c(ThreadViewImageAttachmentView threadviewimageattachmentview)
    {
        return threadviewimageattachmentview.u;
    }

    private void c()
    {
        if (u.size() == 1)
        {
            removeAllViews();
            v = 0;
        }
        z = getImageDimensions();
        for (; v < u.size() && v < 6; v = v + 1)
        {
            UrlImage urlimage = (UrlImage)View.inflate(getContext(), com.facebook.k.orca_thread_view_url_image_with_upload_progress, null);
            urlimage.setShowProgressBar(false);
            urlimage.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            urlimage.setClickable(true);
            urlimage.setPlaceHolderDrawable(null);
            urlimage.setPlaceholderBackgroundResourceId(h.orca_photo_placeholder_background_border);
            addView(urlimage, v);
        }

        int i1 = 0;
        int j1;
        do
        {
            j1 = i1;
            if (i1 >= v)
            {
                break;
            }
            j1 = i1;
            if (i1 >= u.size())
            {
                break;
            }
            ((UrlImage)getChildAt(i1)).setImageParams((m)null);
            a(i1);
            i1++;
        } while (true);
        for (; j1 < v; j1++)
        {
            ((UrlImage)getChildAt(j1)).setVisibility(8);
        }

        a(A);
        requestLayout();
    }

    private void c(int i1, int j1)
    {
        int j2 = android.view.View.MeasureSpec.makeMeasureSpec(n, 0x40000000);
        int k2 = android.view.View.MeasureSpec.makeMeasureSpec(o, 0x40000000);
        int i2 = Math.min(u.size(), 6);
        int l1 = 1;
        for (int k1 = 0; k1 < i2; k1++)
        {
            measureChild(getChildAt(k1), j2, k2);
        }

        byte byte0 = l1;
        if (i2 == 4)
        {
            byte0 = 2;
        }
        l1 = o;
        y = resolveSize((byte0 - 1) * k + l1 * byte0, j1);
        x = resolveSize(n * 2 + k, i1);
    }

    static com.facebook.orca.photos.b.ab d(ThreadViewImageAttachmentView threadviewimageattachmentview)
    {
        return threadviewimageattachmentview.j;
    }

    private void d(int i1, int j1)
    {
        int j2 = android.view.View.MeasureSpec.makeMeasureSpec(p, 0x40000000);
        int k2 = android.view.View.MeasureSpec.makeMeasureSpec(p, 0x40000000);
        int i2 = Math.min(u.size(), 6);
        int l1 = 1;
        for (int k1 = 0; k1 < i2; k1++)
        {
            measureChild(getChildAt(k1), j2, k2);
        }

        byte byte0 = l1;
        if (i2 >= 6)
        {
            byte0 = 2;
        }
        l1 = p;
        y = resolveSize((byte0 - 1) * k + l1 * byte0, j1);
        x = resolveSize(p * 3 + k * 2, i1);
    }

    static com.facebook.common.executors.a e(ThreadViewImageAttachmentView threadviewimageattachmentview)
    {
        return threadviewimageattachmentview.i;
    }

    private void e(int i1, int j1)
    {
        byte byte0 = 2;
        int i2 = android.view.View.MeasureSpec.makeMeasureSpec(n, 0x40000000);
        int j2 = android.view.View.MeasureSpec.makeMeasureSpec(o, 0x40000000);
        for (int k1 = 0; k1 < 2; k1++)
        {
            measureChild(getChildAt(k1), i2, j2);
        }

        i2 = android.view.View.MeasureSpec.makeMeasureSpec(p, 0x40000000);
        j2 = android.view.View.MeasureSpec.makeMeasureSpec(p, 0x40000000);
        int k2 = Math.min(u.size(), 6);
        for (int l1 = byte0; l1 < k2; l1++)
        {
            measureChild(getChildAt(l1), i2, j2);
        }

        y = resolveSize(o + p + k, j1);
        x = Math.max(resolveSize(n * 2 + k, i1), resolveSize(p * 3 + k * 2, i1));
    }

    private Point[] getImageDimensions()
    {
        int j1 = Math.min(u.size(), 6);
        Point apoint[] = new Point[j1];
        int i1 = 0;
        while (i1 < j1) 
        {
            if (j1 == 2 || j1 == 4)
            {
                apoint[i1] = new Point(n, o);
            } else
            if (j1 == 3 || j1 == 6)
            {
                apoint[i1] = new Point(p, p);
            } else
            if (j1 == 5)
            {
                if (i1 < 2)
                {
                    apoint[i1] = new Point(n, o);
                } else
                {
                    apoint[i1] = new Point(p, p);
                }
            } else
            if (x == 0 || y == 0)
            {
                apoint[i1] = b(0x7fffffff, 0x7fffffff);
            } else
            {
                apoint[i1] = new Point(x, y);
            }
            i1++;
        }
        return apoint;
    }

    public void a(l l1)
    {
        if (l1 != null)
        {
            A = l1;
            int i1 = 0;
            while (i1 < u.size() && i1 < 6) 
            {
                ((UrlImage)getChildAt(i1)).setOnLongClickListener(new cc(this, l1, (ImageAttachmentData)u.get(i1)));
                i1++;
            }
        }
    }

    public Message getMessage()
    {
        return t;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int j3 = Math.min(u.size(), 6);
        if (j3 != 1) goto _L2; else goto _L1
_L1:
        UrlImage urlimage;
        f f1;
        urlimage = (UrlImage)getChildAt(0);
        f1 = ((ImageAttachmentData)u.get(0)).g();
        if (f1 != f.PORTRAIT && f1 != f.SQUARE && f1 != f.UNKNOWN) goto _L4; else goto _L3
_L3:
        urlimage.layout(0, 0, x, Math.min(r, y));
_L6:
        return;
_L4:
        if (f1 == f.LANDSCAPE)
        {
            urlimage.layout(0, 0, x, Math.min(q, y));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        int j2 = 0;
        int i2 = 1;
        int l2 = 0;
        int i3 = 0;
        l1 = k1 - i1;
        while (l2 < j3 && l1 >= z[l2].x) 
        {
            ((UrlImage)getChildAt(l2)).layout(i3, j2, z[l2].x + i3, j1 + j2 + z[l2].y);
            i3 += z[l2].x + k;
            int k2 = l1 - (z[l2].x + k);
            if (k2 < z[l2].x || j3 == 4 && l2 == 1 && i2 == 1 || j3 == 6 && l2 == 2 && i2 == 1 || j3 == 5 && l2 == 1 && i2 == 1)
            {
                i2++;
                j2 = z[l2].y + k + j2;
                k2 = k1 - i1;
                l1 = 0;
            } else
            {
                l1 = i3;
            }
            l2++;
            i3 = l1;
            l1 = k2;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        l1 = Math.max(0x7fffffff, getSuggestedMinimumHeight());
        k1 = resolveSize(Math.max(0x7fffffff, getSuggestedMinimumWidth()), i1);
        l1 = resolveSize(l1, j1);
        i2 = Math.min(u.size(), 6);
        a(i2, k1);
        if (i2 != 1) goto _L2; else goto _L1
_L1:
        a(k1, l1, i1, j1);
_L4:
        setMeasuredDimension(Math.min(x, k1), Math.min(y, l1));
        return;
_L2:
        if (i2 == 2 || i2 == 4)
        {
            c(i1, j1);
        } else
        if (i2 == 3 || i2 >= 6)
        {
            d(i1, j1);
        } else
        if (i2 == 5)
        {
            e(i1, j1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setMessage(Message message)
    {
        g.a(h);
        t = message;
        u = d.b(message);
        c();
    }

}
