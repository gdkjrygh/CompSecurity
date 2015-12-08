// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.kik.cache.ad;
import com.kik.cache.z;
import kik.android.util.bx;

// Referenced classes of package kik.android.widget:
//            cl, cm, cn, p, 
//            w

public abstract class KikNetworkedImageView extends ImageView
{

    protected static final com.android.volley.r.a e = new cl();
    protected static final com.android.volley.r.b f = new cm();
    private z a;
    private int b;
    private ad c;
    private com.kik.cache.ad.c d;
    protected Bitmap g;
    private int h;
    private int i;
    private Drawable j;
    private Drawable k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;

    public KikNetworkedImageView(Context context)
    {
        this(context, null);
    }

    public KikNetworkedImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public KikNetworkedImageView(Context context, AttributeSet attributeset, int i1)
    {
        TypedArray typedarray;
        super(context, attributeset, i1);
        p = false;
        typedarray = context.obtainStyledAttributes(attributeset, kik.android.ag.b.m);
        context = null;
        attributeset = typedarray.getDrawable(0);
        context = attributeset;
_L2:
        a(context);
        typedarray.recycle();
        return;
        attributeset;
        bx.a(attributeset);
        if (true) goto _L2; else goto _L1
_L1:
    }

    static int a(KikNetworkedImageView kiknetworkedimageview)
    {
        return kiknetworkedimageview.b;
    }

    private void a()
    {
        if (d != null)
        {
            d.a();
            d = null;
            a = null;
        }
    }

    static void a(KikNetworkedImageView kiknetworkedimageview, com.kik.cache.ad.c c1, boolean flag)
    {
        kiknetworkedimageview.o = false;
        if (c1.b() != null)
        {
            if (flag)
            {
                kiknetworkedimageview.c(c1.b());
                return;
            } else
            {
                kiknetworkedimageview.b(c1.b());
                return;
            }
        } else
        {
            kiknetworkedimageview.e();
            return;
        }
    }

    private void a(boolean flag)
    {
        if (!p) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (a == null)
        {
            a();
            e();
            return;
        }
        if (d == null || d.e() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag1 = d.e().equals(a.a(d.c(), d.d()));
        boolean flag2 = n;
        if (flag1 && flag2 || !m)
        {
            continue; /* Loop/switch isn't completed */
        }
        d.a();
        e();
        d = null;
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        m = false;
        d = c.a(a, new cn(this, flag), h, i, l);
        return;
    }

    protected w a(Bitmap bitmap, String s)
    {
        return new p(bitmap, s);
    }

    public void a(Bitmap bitmap)
    {
        g = bitmap;
    }

    public final void a(Drawable drawable)
    {
        k = drawable;
        if (drawable != null && (drawable instanceof BitmapDrawable))
        {
            a(((BitmapDrawable)drawable).getBitmap());
        }
    }

    public final void a(z z1, ad ad1)
    {
        a(z1, ad1, 0, 0, l, true);
    }

    public final void a(z z1, ad ad1, int i1, int j1, boolean flag, boolean flag1)
    {
        a = z1;
        m = true;
        p = false;
        c = ad1;
        l = flag;
        n = flag1;
        a(false);
        i = j1;
        h = i1;
    }

    protected void b(Bitmap bitmap)
    {
        Object obj = getDrawable();
        if (obj != null && (obj instanceof BitmapDrawable) && ((BitmapDrawable)obj).getBitmap() == bitmap)
        {
            return;
        }
        f();
        if (a == null)
        {
            obj = null;
        } else
        {
            obj = a.d();
        }
        j = a(bitmap, ((String) (obj)));
        j.setCallback(this);
        setImageDrawable(j);
    }

    public final void b(Drawable drawable)
    {
        p = true;
        a();
        f();
        j = drawable;
        if (j != null)
        {
            j.setCallback(this);
        }
        setImageDrawable(j);
    }

    protected void c(Bitmap bitmap)
    {
        f();
        String s;
        if (a == null)
        {
            s = null;
        } else
        {
            s = a.d();
        }
        j = a(((Bitmap) (null)), s);
        j.setCallback(this);
        if (j instanceof w)
        {
            ((w)j).a(g, bitmap);
        }
        setImageDrawable(j);
    }

    public final void d(Bitmap bitmap)
    {
        p = true;
        a();
        b(bitmap);
    }

    protected final boolean d()
    {
        return o && !p;
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        invalidate();
    }

    protected final void e()
    {
        o = true;
        b(g);
    }

    public final void e(int i1)
    {
        try
        {
            a(getResources().getDrawable(i1));
            return;
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            bx.a(outofmemoryerror);
        }
    }

    protected final void f()
    {
        if (j != null)
        {
            j.setCallback(null);
            j = null;
        }
    }

    protected void onDetachedFromWindow()
    {
        if (d != null)
        {
            d.a();
            b(((Bitmap) (null)));
            d = null;
        }
        if (j != null)
        {
            j.setCallback(null);
        }
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        a(true);
    }

}
