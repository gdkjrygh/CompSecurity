// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.a.a;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import com.cardinalblue.android.piccollage.a.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package net.a.a:
//            b, a

public class c extends net.a.a.b
    implements android.widget.PopupWindow.OnDismissListener
{
    public static interface a
    {

        public abstract void a(c c1, int i1, int j1, ImageView imageview, TextView textview);
    }

    public static interface b
    {

        public abstract void a();
    }


    protected final LayoutInflater e;
    protected View f;
    protected ImageView g;
    protected ImageView h;
    protected ImageView i;
    protected ViewGroup j;
    protected ScrollView k;
    protected a l;
    protected final List m = new ArrayList();
    protected boolean n;
    private final View o;
    private b p;
    private int q;
    private int r;
    private int s;
    private final Rect t;

    public c(Context context, View view, boolean flag)
    {
        super(context);
        r = 0;
        s = 0;
        o = view;
        e = (LayoutInflater)context.getSystemService("layout_inflater");
        a(flag);
        t = new Rect(10, 10, o.getWidth() - 10, o.getHeight() - 10);
    }

    private void a(Rect rect, int i1)
    {
        g.setVisibility(4);
        h.setVisibility(4);
        if (i == null)
        {
            return;
        }
        int j1 = i.getMeasuredWidth();
        int k1 = k.getPaddingLeft();
        int l1 = rect.centerX();
        int i2 = j1 / 2;
        int j2 = rect.centerX();
        int k2 = rect.centerX();
        if (j2 - j1 - k1 < i1)
        {
            i1 = j1 / 2 + k1;
        } else
        if (k2 + j1 + k1 > r + i1)
        {
            i1 = r - (j1 * 3) / 2 - k1;
        } else
        {
            i1 = l1 - i1 - i2;
        }
        ((android.view.ViewGroup.MarginLayoutParams)i.getLayoutParams()).leftMargin = i1;
        i.setVisibility(0);
    }

    private void a(Rect rect, View view)
    {
        boolean flag = false;
        b();
        n = false;
        if (r == 0 || s == 0)
        {
            f.measure(-2, -2);
            r = f.getMeasuredWidth();
            s = f.getMeasuredHeight();
        }
        int i1 = rect.top;
        int j1 = t.bottom - rect.bottom;
        if (i1 > j1)
        {
            flag = true;
        }
        if (s > t.height())
        {
            i = null;
            i1 = t.top;
            k.getLayoutParams().height = t.height();
        } else
        if (flag)
        {
            if (s > i1)
            {
                i = null;
                i1 = t.top;
            } else
            {
                i = h;
                i1 = rect.top - s;
            }
        } else
        if (s > j1)
        {
            i = null;
            i1 = t.height() - s;
        } else
        {
            i = g;
            i1 = rect.bottom;
        }
        do
        {
            if (rect.centerX() + r / 2 > t.right)
            {
                j1 = t.right - r;
                q = 2;
            } else
            if (rect.centerX() - r / 2 < t.left)
            {
                j1 = t.left;
                q = 1;
            } else
            {
                j1 = rect.centerX() - r / 2;
                q = 3;
            }
            a(rect, j1);
            b(flag);
            try
            {
                b.showAtLocation(view, 0, j1, i1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Rect rect)
            {
                com.cardinalblue.android.piccollage.a.f.a(rect);
            }
            return;
        } while (true);
    }

    private void b(boolean flag)
    {
        PopupWindow popupwindow2;
        switch (q)
        {
        default:
            return;

        case 1: // '\001'
            PopupWindow popupwindow = b;
            int i1;
            if (flag)
            {
                i1 = 0x7f0c00a5;
            } else
            {
                i1 = 0x7f0c00a0;
            }
            popupwindow.setAnimationStyle(i1);
            return;

        case 2: // '\002'
            PopupWindow popupwindow1 = b;
            int j1;
            if (flag)
            {
                j1 = 0x7f0c00a7;
            } else
            {
                j1 = 0x7f0c00a2;
            }
            popupwindow1.setAnimationStyle(j1);
            return;

        case 3: // '\003'
            popupwindow2 = b;
            break;
        }
        int k1;
        if (flag)
        {
            k1 = 0x7f0c00a4;
        } else
        {
            k1 = 0x7f0c009f;
        }
        popupwindow2.setAnimationStyle(k1);
    }

    public net.a.a.a a(int i1)
    {
        return (net.a.a.a)m.get(i1);
    }

    public void a(float f1, float f2)
    {
        Rect rect = new Rect();
        o.getGlobalVisibleRect(rect);
        int i1 = (int)f1;
        int j1 = rect.left;
        int k1 = (int)f2;
        int l1 = rect.top;
        int i2 = (int)f1;
        int j2 = rect.left;
        int k2 = (int)f2;
        a(new Rect(i1 + j1, k1 + l1, i2 + j2, rect.top + k2), o);
    }

    public void a(net.a.a.a a1)
    {
        a(a1, 0x7f03001f);
    }

    public void a(net.a.a.a a1, int i1)
    {
        m.add(a1);
        String s1 = a1.a();
        android.graphics.drawable.Drawable drawable = a1.b();
        View view = e.inflate(i1, null);
        ImageView imageview = (ImageView)view.findViewById(0x7f1000b8);
        TextView textview = (TextView)view.findViewById(0x7f1000b9);
        if (drawable != null)
        {
            imageview.setImageDrawable(drawable);
        } else
        {
            imageview.setVisibility(8);
        }
        if (s1 != null)
        {
            textview.setText(s1);
        } else
        {
            textview.setVisibility(8);
        }
        view.setOnClickListener(new android.view.View.OnClickListener(a1.c(), imageview, textview) {

            final int a;
            final ImageView b;
            final TextView c;
            final c d;

            public void onClick(View view1)
            {
                int j1 = d.b(a);
                if (d.l != null)
                {
                    d.l.a(d, j1, a, b, c);
                }
                if (!d.a(j1).d())
                {
                    d.n = true;
                    d.a(0L);
                }
            }

            
            {
                d = c.this;
                a = i1;
                b = imageview;
                c = textview;
                super();
            }
        });
        view.setFocusable(true);
        view.setClickable(true);
        j.addView(view);
    }

    public void a(a a1)
    {
        l = a1;
    }

    public void a(b b1)
    {
        a(((android.widget.PopupWindow.OnDismissListener) (this)));
        p = b1;
    }

    public void a(boolean flag)
    {
        f = e.inflate(0x7f030124, null);
        j = (ViewGroup)f.findViewById(0x7f100261);
        h = (ImageView)f.findViewById(0x7f100260);
        g = (ImageView)f.findViewById(0x7f10025d);
        k = (ScrollView)f.findViewById(0x7f10025e);
        f.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        a(f);
    }

    protected int b(int i1)
    {
        Iterator iterator = m.iterator();
        int j1 = -1;
        while (iterator.hasNext()) 
        {
            net.a.a.a a1 = (net.a.a.a)iterator.next();
            int k1 = j1 + 1;
            j1 = k1;
            if (i1 == a1.c())
            {
                return k1;
            }
        }
        return -1;
    }

    public void b(View view)
    {
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        a(new Rect(ai[0], ai[1], ai[0] + view.getWidth(), ai[1] + view.getHeight()), view);
    }

    public void onDismiss()
    {
        if (!n && p != null)
        {
            p.a();
        }
    }
}
