// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bv;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.IntEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class d
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    static boolean e;
    static final TypeEvaluator f = new TypeEvaluator() {

        public int a(int i, int j, float f1)
        {
            return (int)((float)i + (float)(j - i) * f1);
        }

        public Rect a(float f1, Rect rect, Rect rect1)
        {
            return new Rect(a(rect.left, rect1.left, f1), a(rect.top, rect1.top, f1), a(rect.right, rect1.right, f1), a(rect.bottom, rect1.bottom, f1));
        }

        public Object evaluate(float f1, Object obj, Object obj1)
        {
            return a(f1, (Rect)obj, (Rect)obj1);
        }

    };
    final HashMap a = new HashMap();
    final HashMap b = new HashMap();
    final ArrayList c = new ArrayList();
    final ListView d;

    d(ListView listview)
    {
        d = listview;
        d.getViewTreeObserver().addOnPreDrawListener(this);
        int j = d.getFirstVisiblePosition();
        for (int i = 0; i < listview.getChildCount(); i++)
        {
            View view = listview.getChildAt(i);
            long l = d.getItemIdAtPosition(j + i);
            Rect rect = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            a.put(Long.valueOf(l), rect);
            b.put(Long.valueOf(l), a(view));
            c.add(Long.valueOf(l));
        }

    }

    private BitmapDrawable a(View view)
    {
        if (view.getWidth() == 0 || view.getHeight() == 0)
        {
            return null;
        } else
        {
            Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(bitmap));
            return new BitmapDrawable(view.getResources(), bitmap);
        }
    }

    static void a(View view, Drawable drawable)
    {
        c(view, drawable);
    }

    public static void a(ListView listview, boolean flag)
    {
        if (listview == null)
        {
            return;
        } else
        {
            e = flag;
            new d(listview);
            return;
        }
    }

    private static void b(View view, Drawable drawable)
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            view.getOverlay().add(drawable);
        }
    }

    private static void c(View view, Drawable drawable)
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            view.getOverlay().remove(drawable);
        }
    }

    public boolean onPreDraw()
    {
        d.getViewTreeObserver().removeOnPreDrawListener(this);
        int j1 = d.getResources().getInteger(0x10e0001) * 1;
        int k1 = d.getFirstVisiblePosition();
        int i = 0;
        int i1 = 0;
        int k = 0;
        while (k < d.getChildCount()) 
        {
            View view = d.getChildAt(k);
            long l1 = d.getItemIdAtPosition((k + k1) - i1);
            int l = i1;
            int j = i;
            if (e)
            {
                l = i1;
                j = i;
                if (k < c.size())
                {
                    l = i1;
                    j = i;
                    if (!((Long)c.get(k)).equals(Long.valueOf(l1)))
                    {
                        l = i1 + 1;
                        j = i + (view.getHeight() + d.getDividerHeight());
                    }
                }
            }
            if (j != 0)
            {
                if (e)
                {
                    view.setTranslationY(j);
                    view.animate().translationY(0.0F).setDuration(j1).setListener(null);
                } else
                {
                    view.setTranslationY(-j);
                    view.animate().translationY(0.0F).setDuration(j1).setListener(null);
                }
            }
            i = j;
            if (!e)
            {
                i = j;
                if (!a.keySet().contains(Long.valueOf(l1)))
                {
                    view.setAlpha(0.0F);
                    view.animate().alpha(1.0F).setDuration(j1).setListener(null);
                    i = j + (view.getHeight() + d.getDividerHeight());
                }
            }
            a.remove(Long.valueOf(l1));
            b.remove(Long.valueOf(l1));
            k++;
            i1 = l;
        }
        ArrayList arraylist = new ArrayList();
        Iterator iterator = (new ArrayList(a.keySet())).iterator();
        while (iterator.hasNext()) 
        {
            Long long1 = (Long)iterator.next();
            BitmapDrawable bitmapdrawable = (BitmapDrawable)b.get(long1);
            Object obj = (Rect)a.get(long1);
            bitmapdrawable.setBounds(((Rect) (obj)));
            Rect rect = new Rect(((Rect) (obj)));
            rect.offset(0, i);
            if (e)
            {
                obj = ObjectAnimator.ofObject(bitmapdrawable, "alpha", new IntEvaluator(), new Object[] {
                    Integer.valueOf(255), Integer.valueOf(0)
                });
            } else
            {
                obj = ObjectAnimator.ofObject(bitmapdrawable, "bounds", f, new Object[] {
                    obj, rect
                });
            }
            if (!e)
            {
                ((ObjectAnimator) (obj)).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                    final d a;
                    private Rect b;
                    private Rect c;

                    public void onAnimationUpdate(ValueAnimator valueanimator)
                    {
                        valueanimator = (Rect)valueanimator.getAnimatedValue();
                        c.set(valueanimator);
                        if (b != null)
                        {
                            c.union(b);
                        }
                        b = valueanimator;
                        a.d.invalidate(c);
                    }

            
            {
                a = d.this;
                super();
                b = null;
                c = new Rect();
            }
                });
            }
            ((ObjectAnimator) (obj)).addListener(new AnimatorListenerAdapter(bitmapdrawable) {

                final BitmapDrawable a;
                final d b;

                public void onAnimationEnd(Animator animator)
                {
                    animator.removeListener(this);
                    d.a(b.d, a);
                    super.onAnimationEnd(animator);
                }

            
            {
                b = d.this;
                a = bitmapdrawable;
                super();
            }
            });
            a.remove(long1);
            b.remove(long1);
            b(d, bitmapdrawable);
            arraylist.add(obj);
        }
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.setDuration(j1);
        animatorset.playTogether(arraylist);
        animatorset.start();
        return true;
    }

}
