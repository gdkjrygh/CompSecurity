// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.media.ThumbnailUtils;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kik.a.d.a.a;
import kik.a.d.o;
import kik.a.h.e;
import kik.android.chat.KikApplication;

// Referenced classes of package kik.android.util:
//            cx, DeviceUtils, ae, bx, 
//            cw, r

public final class cv
{
    public static abstract class a
        implements android.view.View.OnClickListener
    {

        private final int a;
        private long b;

        public abstract void a();

        public final void onClick(View view)
        {
            long l = SystemClock.elapsedRealtime();
            if (l - b > (long)a)
            {
                b = l;
                a();
            }
        }

        public a()
        {
            this((byte)0);
        }

        private a(byte byte0)
        {
            b = 0L;
            a = 1000;
        }
    }

    public static final class b
    {

        private final View a;

        public final b a(int i)
        {
            if (a != null && (a.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams))
            {
                android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)a.getLayoutParams();
                marginlayoutparams.topMargin = i;
                a.setLayoutParams(marginlayoutparams);
            }
            return this;
        }

        public final b b(int i)
        {
            if (a != null && (a.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams))
            {
                android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)a.getLayoutParams();
                marginlayoutparams.bottomMargin = i;
                a.setLayoutParams(marginlayoutparams);
            }
            return this;
        }

        public final b c(int i)
        {
            if (a != null && (a.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams))
            {
                android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)a.getLayoutParams();
                marginlayoutparams.leftMargin = i;
                a.setLayoutParams(marginlayoutparams);
            }
            return this;
        }

        public final b d(int i)
        {
            if (a != null && (a.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams))
            {
                android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)a.getLayoutParams();
                marginlayoutparams.rightMargin = i;
                a.setLayoutParams(marginlayoutparams);
            }
            return this;
        }

        private b(View view)
        {
            a = view;
        }

        b(View view, byte byte0)
        {
            this(view);
        }
    }

    public static final class c
    {

        private String a;
        private String b;
        private Bitmap c;
        private com.kik.f.a.a.a d;

        public final com.kik.f.a.a.a a()
        {
            return d;
        }

        public final String b()
        {
            return a;
        }

        public final Bitmap c()
        {
            return c;
        }

        public final String d()
        {
            return b;
        }

        public c(String s, String s1, Bitmap bitmap, com.kik.f.a.a.a a1)
        {
            a = s;
            b = s1;
            c = bitmap;
            d = a1;
        }
    }

    public static final class d
    {

        final float a = 6F;
        final float b = 0.0F;
        final float c = 1.0F;
        final int d;

        public d(int i)
        {
            d = i;
        }
    }


    public static String a = "http://cdn.kik.com/cards/unsupported.html";

    private static int a(int ai[], int i)
    {
        if (ai == null || i >= ai.length || i < 0)
        {
            return 0;
        } else
        {
            return ai[i];
        }
    }

    public static Animator a(View view, int i, android.animation.ValueAnimator.AnimatorUpdateListener animatorupdatelistener, android.animation.Animator.AnimatorListener animatorlistener, long l, long l1)
    {
        if (view == null)
        {
            return null;
        } else
        {
            ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
                view.getMeasuredHeight(), i
            });
            valueanimator.addUpdateListener(a(view, animatorupdatelistener));
            valueanimator.addListener(animatorlistener);
            valueanimator.setStartDelay(l1);
            valueanimator.setDuration(l);
            return valueanimator;
        }
    }

    private static android.animation.ValueAnimator.AnimatorUpdateListener a(View view, android.animation.ValueAnimator.AnimatorUpdateListener animatorupdatelistener)
    {
        return new cx(view, animatorupdatelistener);
    }

    public static ValueAnimator a(View view, int i, android.animation.Animator.AnimatorListener animatorlistener, long l)
    {
        if (view == null)
        {
            return null;
        }
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            view.getMeasuredHeight(), i
        });
        valueanimator.addUpdateListener(a(view, ((android.animation.ValueAnimator.AnimatorUpdateListener) (null))));
        if (animatorlistener != null)
        {
            valueanimator.addListener(animatorlistener);
        }
        valueanimator.setInterpolator(new DecelerateInterpolator());
        valueanimator.setDuration(l);
        return valueanimator;
    }

    private static Bitmap a(o o)
    {
        if (o != null)
        {
            if ((o = kik.a.h.e.a().a(o)) != null)
            {
                try
                {
                    o = BitmapFactory.decodeByteArray(o, 0, o.length);
                }
                // Misplaced declaration of an exception variable
                catch (o o)
                {
                    return null;
                }
                return o;
            }
        }
        return null;
    }

    public static c a(kik.a.d.a.a a1, Context context, String s)
    {
        if (context != null && a1 != null && s != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        String s2;
        Iterator iterator = a1.e("android").iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_334;
            }
            s2 = (String)iterator.next();
        } while (s.equalsIgnoreCase(s2) || !kik.android.util.DeviceUtils.a(context, s2) || a.equals(s2));
_L4:
        com.kik.f.a.a.a a2;
        s = a1.f().iterator();
        do
        {
            if (!s.hasNext())
            {
                break MISSING_BLOCK_LABEL_326;
            }
            a2 = (com.kik.f.a.a.a)s.next();
        } while (a2 == null || a2.d() != null || a2.c() != null && !a2.c().equals("android") && !a2.c().equals("cards"));
        s = a2.e();
_L3:
        if (s2 != null)
        {
            String s1;
            Object obj;
            if (s2.startsWith("http://") || s2.startsWith("https://"))
            {
                if (s == null)
                {
                    s1 = context.getString(0x7f0902e8, new Object[] {
                        kik.android.util.ae.a(a1)
                    });
                    s = null;
                } else
                {
                    s1 = s;
                    s = null;
                }
            } else
            if (s2.startsWith("market://"))
            {
                s1 = context.getString(0x7f0902b4, new Object[] {
                    kik.android.util.ae.a(a1)
                });
                s = BitmapFactory.decodeResource(context.getResources(), 0x7f020208);
            } else
            {
                s1 = context.getString(0x7f0902e9, new Object[] {
                    kik.android.util.ae.a(a1)
                });
                s = null;
            }
            obj = s;
            if (s == null)
            {
                a1 = a(a1.a("icon"));
                obj = a1;
                if (a1 == null)
                {
                    obj = BitmapFactory.decodeResource(context.getResources(), 0x7f0200b2);
                }
            }
            return new c(s2, s1, ((Bitmap) (obj)), a2);
        }
          goto _L1
        a2 = null;
        s = null;
          goto _L3
        s2 = null;
          goto _L4
    }

    public static void a(Drawable drawable, int i)
    {
        if (drawable instanceof GradientDrawable)
        {
            ((GradientDrawable)drawable).setColor(i);
            return;
        } else
        {
            kik.android.util.bx.e(new Throwable("Trying to set gradient drawable color on a non-gradient drawable"));
            return;
        }
    }

    public static void a(View view)
    {
        while (view == null || android.os.Build.VERSION.SDK_INT < 9) 
        {
            return;
        }
        MotionEvent motionevent = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0F, 0.0F, 0);
        view.dispatchTouchEvent(motionevent);
        motionevent.recycle();
    }

    public static void a(View view, int i)
    {
        (new b(view, (byte)0)).a(i);
    }

    public static void a(View view, int i, int j)
    {
        if (view == null)
        {
            return;
        } else
        {
            view.setPadding(KikApplication.a(i), KikApplication.a(6), KikApplication.a(j), KikApplication.a(10));
            return;
        }
    }

    public static void a(View view, int i, android.animation.ValueAnimator.AnimatorUpdateListener animatorupdatelistener, android.animation.Animator.AnimatorListener animatorlistener)
    {
        if (view == null)
        {
            return;
        } else
        {
            view.getLayoutParams().height = 0;
            view.requestLayout();
            view.measure(0, 0);
            view.post(new cw(view, i, animatorupdatelistener, animatorlistener));
            return;
        }
    }

    public static void a(View view, View view1)
    {
        if (view != null && view1 != null)
        {
            if (!(view.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams))
            {
                if (DeviceUtils.c())
                {
                    throw new IllegalArgumentException("Trying to set relative layour params on a view not in a relative layout!");
                }
            } else
            {
                android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams();
                layoutparams.addRule(3, view1.getId());
                int ai[] = layoutparams.getRules();
                if (a(ai, 2) == view1.getId())
                {
                    a(layoutparams, 2);
                }
                if (a(ai, 4) == view1.getId())
                {
                    a(layoutparams, 4);
                }
                if (a(ai, 8) == view1.getId())
                {
                    a(layoutparams, 8);
                }
                view.setLayoutParams(layoutparams);
                return;
            }
        }
    }

    private static void a(android.widget.RelativeLayout.LayoutParams layoutparams, int i)
    {
        if (layoutparams == null || i < 0)
        {
            return;
        } else
        {
            layoutparams.addRule(i, 0);
            return;
        }
    }

    public static void a(TextView textview)
    {
        if (textview == null)
        {
            return;
        } else
        {
            textview.setPaintFlags(textview.getPaintFlags() | 8);
            return;
        }
    }

    public static void a(TextView textview, int i)
    {
        char c1 = '\377';
        if (textview != null)
        {
            if (i < 0)
            {
                i = 0;
            }
            if (i > 255)
            {
                i = c1;
            }
            ColorStateList colorstatelist = textview.getTextColors();
            if (colorstatelist != null)
            {
                int j = colorstatelist.getDefaultColor();
                textview.setTextColor(Color.argb(i, Color.red(j), Color.green(j), Color.blue(j)));
                return;
            }
        }
    }

    public static void a(TextView textview, d d1)
    {
        if (textview == null || d1 == null)
        {
            return;
        } else
        {
            textview.setShadowLayer(d1.a, d1.b, d1.c, d1.d);
            return;
        }
    }

    public static void a(String s, TextView textview)
    {
        if (textview != null)
        {
            textview.setText(s);
        }
    }

    public static boolean a(View view, Bitmap bitmap)
    {
        if (bitmap == null || view == null)
        {
            return false;
        }
        bitmap = kik.android.util.r.a(bitmap);
        if (bitmap == null)
        {
            return false;
        }
        int j = view.getWidth();
        int k = view.getHeight();
        int i = j;
        if (j == 0)
        {
            i = Math.min(bitmap.getWidth(), 50);
        }
        j = k;
        if (k == 0)
        {
            j = Math.min(bitmap.getHeight(), 10);
        }
        bitmap = ThumbnailUtils.extractThumbnail(bitmap, i, j, 2);
        if (bitmap == null)
        {
            return false;
        } else
        {
            bitmap = new BitmapDrawable(view.getResources(), bitmap);
            bitmap.setAlpha(90);
            view.setBackgroundDrawable(new LayerDrawable(new Drawable[] {
                view.getBackground(), bitmap
            }));
            return true;
        }
    }

    public static transient boolean a(View aview[])
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < 3)
                {
                    View view = aview[i];
                    if (view == null || view.getAnimation() == null || !view.getAnimation().hasStarted() || view.getAnimation().hasEnded())
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public static b b(View view)
    {
        return new b(view, (byte)0);
    }

    public static void b(View view, int i)
    {
        android.view.ViewGroup.LayoutParams layoutparams;
        if (view != null)
        {
            if ((layoutparams = view.getLayoutParams()) != null)
            {
                layoutparams.height = i;
                view.setLayoutParams(layoutparams);
                return;
            }
        }
    }

    public static void b(View view, View view1)
    {
        if (view != null && view1 != null)
        {
            if (!(view.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams))
            {
                if (DeviceUtils.c())
                {
                    throw new IllegalArgumentException("Trying to set relative layour params on a view not in a relative layout!");
                }
            } else
            {
                android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams();
                layoutparams.addRule(8, view1.getId());
                int ai[] = layoutparams.getRules();
                if (a(ai, 2) == view1.getId())
                {
                    a(layoutparams, 2);
                }
                if (a(ai, 3) == view1.getId())
                {
                    a(layoutparams, 3);
                }
                if (a(ai, 12) == -1)
                {
                    a(layoutparams, 12);
                }
                view.setLayoutParams(layoutparams);
                return;
            }
        }
    }

    public static void b(TextView textview)
    {
        CharSequence charsequence;
        if (textview != null)
        {
            if ((charsequence = textview.getText()) != null)
            {
                textview.setText(charsequence.toString().toUpperCase());
                return;
            }
        }
    }

    public static void b(TextView textview, int i)
    {
        char c1 = '\377';
        if (textview != null)
        {
            if (i < 0)
            {
                i = 0;
            }
            if (i > 255)
            {
                i = c1;
            }
            ColorStateList colorstatelist = textview.getLinkTextColors();
            if (colorstatelist != null)
            {
                int j = colorstatelist.getDefaultColor();
                textview.setLinkTextColor(Color.argb(i, Color.red(j), Color.green(j), Color.blue(j)));
                return;
            }
        }
    }

    public static transient void b(View aview[])
    {
        if (aview != null)
        {
            int j = aview.length;
            int i = 0;
            while (i < j) 
            {
                View view = aview[i];
                if (view != null)
                {
                    view.setVisibility(0);
                }
                i++;
            }
        }
    }

    public static transient void c(View aview[])
    {
        int j = aview.length;
        for (int i = 0; i < j; i++)
        {
            View view = aview[i];
            if (view != null)
            {
                view.setAlpha(1.0F);
            }
        }

    }

    public static boolean c(View view)
    {
        while (view == null || view.getVisibility() != 0) 
        {
            return false;
        }
        return true;
    }

    public static transient void d(View aview[])
    {
        for (int i = 0; i <= 0; i++)
        {
            View view = aview[0];
            if (view != null)
            {
                view.setPressed(false);
                view.setVisibility(4);
            }
        }

    }

    public static boolean d(View view)
    {
        while (view == null || view.getVisibility() != 8 && view.getVisibility() != 4) 
        {
            return false;
        }
        return true;
    }

    public static transient void e(View aview[])
    {
        if (aview != null)
        {
            int j = aview.length;
            int i = 0;
            while (i < j) 
            {
                View view = aview[i];
                if (view != null)
                {
                    view.setPressed(false);
                    view.setVisibility(8);
                }
                i++;
            }
        }
    }

}
