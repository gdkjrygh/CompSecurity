// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.skype.android.app.contacts.ContactItem;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.util.ImageCache;
import java.util.ArrayList;
import java.util.List;

public class FacepileTileView extends LinearLayout
{
    public static interface VisibilityChangeListener
    {

        public abstract void onVisibilityChanged(FacepileTileView facepiletileview, boolean flag);
    }

    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/skype/android/widget/FacepileTileView$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("CIRCULAR", 0);
            b = new a("RECTANGULAR", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int k)
        {
            super(s, k);
        }
    }


    AsyncCallback a = new AsyncCallback() {

        final FacepileTileView a;

        public final void done(AsyncResult asyncresult)
        {
label0:
            {
                if (asyncresult.e())
                {
                    Bitmap bitmap = (Bitmap)asyncresult.a();
                    if (bitmap != null)
                    {
                        FacepileTileView.a(a, bitmap);
                    }
                    int l;
                    if (FacepileTileView.a(a) < FacepileTileView.b(a).size())
                    {
                        l = FacepileTileView.a(a) - 1;
                    } else
                    {
                        l = FacepileTileView.b(a).size();
                    }
                    asyncresult = (Integer)asyncresult.b();
                    if (a.getChildCount() < l && asyncresult.intValue() < FacepileTileView.b(a).size() - 1)
                    {
                        break label0;
                    }
                    FacepileTileView.c(a);
                }
                return;
            }
            this;
            JVM INSTR monitorenter ;
            FacepileTileView.d(a);
            this;
            JVM INSTR monitorexit ;
            FacepileTileView.a(a, FacepileTileView.e(a), FacepileTileView.f(a));
            return;
            asyncresult;
            this;
            JVM INSTR monitorexit ;
            throw asyncresult;
        }

            
            {
                a = FacepileTileView.this;
                super();
            }
    };
    private int b;
    private int c;
    private int d;
    private a e;
    private List f;
    private int g;
    private volatile int h;
    private ImageCache i;
    private VisibilityChangeListener j;

    public FacepileTileView(Context context)
    {
        this(context, null);
    }

    public FacepileTileView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = new ArrayList();
        h = -1;
        if (attributeset != null)
        {
            context = context.obtainStyledAttributes(attributeset, com.skype.android.app.R.styleable.FacepileTileView);
            b = context.getDimensionPixelSize(0, 0);
            c = context.getDimensionPixelSize(1, 0);
            if (b == 0 || c == 0)
            {
                throw new IllegalArgumentException("Missing or wrong tile dimensions");
            }
            d = context.getDimensionPixelSize(2, 0);
            int k = context.getInteger(3, a.b.ordinal());
            e = a.values()[k];
            context.recycle();
        }
    }

    static int a(FacepileTileView facepiletileview)
    {
        return facepiletileview.g;
    }

    private void a(int k, boolean flag)
    {
        setVisibility(k);
        if (flag && j != null)
        {
            VisibilityChangeListener visibilitychangelistener = j;
            if (k == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            visibilitychangelistener.onVisibilityChanged(this, flag);
        }
    }

    private void a(ImageCache imagecache, int k)
    {
        if (f.size() == 0 || k >= f.size())
        {
            return;
        } else
        {
            i = imagecache;
            imagecache.a((ContactItem)f.get(k), Integer.valueOf(k), a);
            return;
        }
    }

    static void a(FacepileTileView facepiletileview, Bitmap bitmap)
    {
        static final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        _cls2.a[facepiletileview.e.ordinal()];
        JVM INSTR tableswitch 1 1: default 28
    //                   1 77;
           goto _L1 _L2
_L1:
        int k = 0x7f03008b;
_L4:
        ImageView imageview = (ImageView)LayoutInflater.from(facepiletileview.getContext()).inflate(k, null);
        imageview.setPadding(0, 0, facepiletileview.d, 0);
        imageview.setImageBitmap(bitmap);
        facepiletileview.addView(imageview, facepiletileview.b, facepiletileview.c);
        return;
_L2:
        k = 0x7f03008a;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(FacepileTileView facepiletileview, ImageCache imagecache, int k)
    {
        facepiletileview.a(imagecache, k);
    }

    static List b(FacepileTileView facepiletileview)
    {
        return facepiletileview.f;
    }

    static void c(FacepileTileView facepiletileview)
    {
        facepiletileview.h = -2;
        int k;
        if (facepiletileview.getChildCount() == 0)
        {
            k = 8;
        } else
        {
            if (facepiletileview.getChildCount() < facepiletileview.g && facepiletileview.f.size() > facepiletileview.getChildCount())
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (k != 0)
            {
                TextView textview;
                int l;
                if (facepiletileview.e == a.a)
                {
                    k = 0x7f030088;
                } else
                {
                    k = 0x7f030089;
                }
                textview = (TextView)LayoutInflater.from(facepiletileview.getContext()).inflate(k, null);
                k = facepiletileview.f.size();
                l = facepiletileview.getChildCount();
                textview.setText(String.format(facepiletileview.getResources().getString(0x7f0802b2), new Object[] {
                    Integer.valueOf(k - l)
                }));
                facepiletileview.addView(textview, facepiletileview.b, facepiletileview.c);
            }
            k = 0;
        }
        facepiletileview.a(k, true);
        facepiletileview.invalidate();
        facepiletileview.requestLayout();
    }

    static int d(FacepileTileView facepiletileview)
    {
        int k = facepiletileview.h;
        facepiletileview.h = k + 1;
        return k;
    }

    static ImageCache e(FacepileTileView facepiletileview)
    {
        return facepiletileview.i;
    }

    static int f(FacepileTileView facepiletileview)
    {
        return facepiletileview.h;
    }

    protected void onDetachedFromWindow()
    {
        j = null;
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean flag, int k, int l, int i1, int j1)
    {
        boolean flag1 = true;
        boolean flag2 = true;
        super.onLayout(flag, k, l, i1, j1);
        if (f.size() == 0)
        {
            removeAllViews();
            if (getVisibility() != 8)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            a(8, flag);
        } else
        {
            g = (Math.max(getMeasuredWidth(), getWidth()) - getPaddingLeft() - getPaddingRight()) / (b + d);
            if (g > 0 && h == -1)
            {
                k = ((flag1) ? 1 : 0);
            } else
            {
                k = 0;
            }
            if (k != 0)
            {
                removeAllViews();
                ImageCache imagecache = i;
                h = 0;
                a(imagecache, h);
                return;
            }
        }
    }

    public void setContacts(List list, ImageCache imagecache)
    {
        if (list == null)
        {
            throw new IllegalArgumentException("The contacts list cannot be null");
        } else
        {
            f = list;
            i = imagecache;
            return;
        }
    }

    public void setVisibilityChangeListener(VisibilityChangeListener visibilitychangelistener)
    {
        j = visibilitychangelistener;
    }
}
