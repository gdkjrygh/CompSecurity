// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.x;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.skype.android.animation.SkypeMultiPropertyAnimatorSet;
import com.skype.android.animation.SkypePropertyAnimatorSet;
import com.skype.android.util.FloatMath;
import com.skype.android.widget.fabmenu.FabMenu;
import com.skype.android.widget.fabmenu.FabMenuItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SkypeFabMenu extends FabMenu
{

    private SparseArray a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;

    public SkypeFabMenu(Context context)
    {
        this(context, null);
    }

    public SkypeFabMenu(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, -1);
    }

    public SkypeFabMenu(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = 0;
        c = 1;
        d = 2;
        e = 3;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if (f)
        {
            a = new SparseArray();
            a(0, getResources().getDimensionPixelSize(0x7f0c01b2));
            a(1, getResources().getDimensionPixelSize(0x7f0c01b2));
            a(2, getResources().getDimensionPixelSize(0x7f0c01b3));
            a(3, getResources().getDimensionPixelSize(0x7f0c01b3));
        }
    }

    private void a(int i, int j)
    {
        View view = new View(getContext());
        view.setBackgroundResource(0x7f020061);
        view.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(j, j));
        a.put(i, view);
    }

    protected final void a(int i, int j, int k, int l)
    {
        if (f)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = e().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                FabMenuItem fabmenuitem = (FabMenuItem)iterator.next();
                if (fabmenuitem.isEnabled())
                {
                    arraylist.add(fabmenuitem);
                }
            } while (true);
            j = arraylist.size();
            k = ((FabMenuItem)e().get(0)).getMeasuredHeight();
            float f1 = c().getX() + (float)(c().getWidth() / 2);
            float f2 = c().getY() + (float)(c().getHeight() / 2);
            l = getResources().getDimensionPixelSize(0x7f0c01b4);
            if (j > 0)
            {
                float f3 = -90 / (j - 1);
                for (i = 0; i < j; i++)
                {
                    View view = (View)arraylist.get(i);
                    float f5 = FloatMath.b(180F + (float)i * f3);
                    float f4 = (float)Math.cos(f5);
                    f5 = (float)Math.sin(f5);
                    float f8 = k / 2;
                    float f9 = l - k / 2;
                    float f6 = k / 2;
                    float f7 = l - k / 2;
                    f4 = f8 + f9 * (1.0F + f4) + (f1 - (float)l);
                    f5 = f6 + f7 * (1.0F - f5) + (f2 - (float)l);
                    view.setPivotX((f1 - f4) + (float)(k / 2));
                    view.setPivotY((f2 - f5) + (float)(k / 2));
                    view.layout((int)(f4 - (float)(k / 2)), (int)(f5 - (float)(k / 2)), (int)((float)(k / 2) + f4), (int)((float)(k / 2) + f5));
                }

            }
        } else
        {
            super.a(i, j, k, l);
        }
    }

    protected final void a(int i, TextView textview)
    {
        if (f)
        {
            textview.setVisibility(4);
            return;
        } else
        {
            super.a(i, textview);
            return;
        }
    }

    protected final void a(int i, FabMenuItem fabmenuitem)
    {
        if (f)
        {
            fabmenuitem.setVisibility(0);
            fabmenuitem.setScaleX(0.0F);
            fabmenuitem.setScaleY(0.0F);
            SkypeMultiPropertyAnimatorSet skypemultipropertyanimatorset = new SkypeMultiPropertyAnimatorSet(fabmenuitem);
            skypemultipropertyanimatorset.a(0.2177314F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.d(), new Pair[] {
                Pair.create(View.SCALE_X.getName(), Float.valueOf(0.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(0.0F))
            });
            skypemultipropertyanimatorset.a(((float)i * 0.033F + 0.333F) * 1.303781F, null, new Pair[] {
                Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
            });
            skypemultipropertyanimatorset.a(767L);
            fabmenuitem = new SkypePropertyAnimatorSet(fabmenuitem, View.ROTATION.getName());
            fabmenuitem.a((float)i * 1.303781F * 0.033F, -139F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.d());
            fabmenuitem.a(((float)i * 0.033F + 0.333F) * 1.303781F, 6F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.b());
            fabmenuitem.a((0.667F + (float)i * 0.033F) * 1.303781F, 0.0F, null);
            fabmenuitem.a(767L);
            return;
        } else
        {
            super.a(i, fabmenuitem);
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (f)
        {
            c().setOnTouchListener(new android.view.View.OnTouchListener() {

                final SkypeFabMenu a;

                public final boolean onTouch(View view, MotionEvent motionevent)
                {
                    motionevent.getAction();
                    JVM INSTR tableswitch 0 0: default 24
                //                               0 26;
                       goto _L1 _L2
_L1:
                    return false;
_L2:
                    view.animate().scaleX(1.15F).scaleY(1.15F).setInterpolator(new DecelerateInterpolator()).setDuration(100L).start();
                    if (true) goto _L1; else goto _L3
_L3:
                }

            
            {
                a = SkypeFabMenu.this;
                super();
            }
            });
            float f1 = x.u(c());
            for (Iterator iterator = e().iterator(); iterator.hasNext(); x.f((FabMenuItem)iterator.next(), f1 - 2.0F)) { }
            for (int i = 0; i < a.size(); i++)
            {
                x.f((View)a.valueAt(i), f1 - 1.0F);
            }

        }
    }

    public void setExpanded(boolean flag)
    {
        super.setExpanded(flag);
        if (f)
        {
            float f2;
            Object obj1;
            Object obj3;
            String s;
            int j;
            int k;
            if (flag)
            {
                float f1 = (float)getWidth() / 720F;
                float f4 = (float)getHeight() / 1280F;
                Object obj = (View)a.get(0);
                addView(((View) (obj)));
                int i = ((View) (obj)).getLayoutParams().width / 2;
                obj = new SkypeMultiPropertyAnimatorSet(((View) (obj)));
                ((SkypeMultiPropertyAnimatorSet) (obj)).a(0.0F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a(0.28F, 0.0F, 0.65F, 0.57F), new Pair[] {
                    Pair.create(View.X.getName(), Float.valueOf(806F * f1 - (float)i)), Pair.create(View.Y.getName(), Float.valueOf(1359F * f4 - (float)i))
                });
                ((SkypeMultiPropertyAnimatorSet) (obj)).a(0.3911343F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a(0.39F, 0.59F, 0.75F, 1.0F), new Pair[] {
                    Pair.create(View.X.getName(), Float.valueOf(716F * f1 - (float)i)), Pair.create(View.Y.getName(), Float.valueOf(1271F * f4 - (float)i))
                });
                ((SkypeMultiPropertyAnimatorSet) (obj)).a(0.6518905F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.b(), new Pair[] {
                    Pair.create(View.X.getName(), Float.valueOf(651F * f1 - (float)i)), Pair.create(View.Y.getName(), Float.valueOf(1247F * f4 - (float)i))
                });
                ((SkypeMultiPropertyAnimatorSet) (obj)).a(0.7301173F, null, new Pair[] {
                    Pair.create(View.X.getName(), Float.valueOf(667F * f1 - (float)i)), Pair.create(View.Y.getName(), Float.valueOf(1269F * f4 - (float)i))
                });
                float f5 = c().getX() + (float)(c().getMeasuredWidth() / 2);
                float f6 = c().getY() + (float)(c().getMeasuredWidth() / 2);
                Object obj2 = (View)a.get(1);
                addView(((View) (obj2)));
                i = ((View) (obj2)).getLayoutParams().width / 2;
                obj2 = new SkypeMultiPropertyAnimatorSet(((View) (obj2)));
                ((SkypeMultiPropertyAnimatorSet) (obj2)).a(0.0F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.d(), new Pair[] {
                    Pair.create(View.X.getName(), Float.valueOf(786F * f1 - (float)i)), Pair.create(View.Y.getName(), Float.valueOf(1329F * f4 - (float)i)), Pair.create(View.SCALE_X.getName(), Float.valueOf(0.6F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(0.6F))
                });
                ((SkypeMultiPropertyAnimatorSet) (obj2)).a(0.434159F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.b(), new Pair[] {
                    Pair.create(View.X.getName(), Float.valueOf(f5 - 18F * f1 - (float)i)), Pair.create(View.Y.getName(), Float.valueOf(f6 - 13F * f4 - (float)i)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
                });
                ((SkypeMultiPropertyAnimatorSet) (obj2)).a(0.9556714F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.b(), new Pair[] {
                    Pair.create(View.X.getName(), Float.valueOf(f5 - (float)i)), Pair.create(View.Y.getName(), Float.valueOf(f6 - (float)i)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
                });
                Object obj4 = (View)a.get(2);
                addView(((View) (obj4)));
                i = ((View) (obj4)).getLayoutParams().width / 2;
                obj4 = new SkypeMultiPropertyAnimatorSet(((View) (obj4)));
                ((SkypeMultiPropertyAnimatorSet) (obj4)).a(0.0F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a(), new Pair[] {
                    Pair.create(View.X.getName(), Float.valueOf(762F * f1 - (float)i)), Pair.create(View.Y.getName(), Float.valueOf(1194F * f4 - (float)i)), Pair.create(View.SCALE_X.getName(), Float.valueOf(0.5F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(0.5F))
                });
                ((SkypeMultiPropertyAnimatorSet) (obj4)).a(0.2177314F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a(0.81F, 0.45F, 0.63F, 1.0F), new Pair[] {
                    Pair.create(View.X.getName(), Float.valueOf(762F * f1 - (float)i)), Pair.create(View.Y.getName(), Float.valueOf(1194F * f4 - (float)i))
                });
                ((SkypeMultiPropertyAnimatorSet) (obj4)).a(0.3911343F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.b(), new Pair[] {
                    Pair.create(View.X.getName(), Float.valueOf(697F * f1 - (float)i)), Pair.create(View.Y.getName(), Float.valueOf(1111F * f4 - (float)i)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.1F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.1F))
                });
                ((SkypeMultiPropertyAnimatorSet) (obj4)).a(0.9126467F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.b(), new Pair[] {
                    Pair.create(View.X.getName(), Float.valueOf(713F * f1 - (float)i)), Pair.create(View.Y.getName(), Float.valueOf(1129F * f4 - (float)i)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
                });
                Object obj5 = (View)a.get(3);
                addView(((View) (obj5)));
                i = ((View) (obj5)).getLayoutParams().width / 2;
                obj5 = new SkypeMultiPropertyAnimatorSet(((View) (obj5)));
                ((SkypeMultiPropertyAnimatorSet) (obj5)).a(0.0F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.d(), new Pair[] {
                    Pair.create(View.X.getName(), Float.valueOf(694F * f1 - (float)i)), Pair.create(View.Y.getName(), Float.valueOf(1356F * f4 - (float)i)), Pair.create(View.SCALE_X.getName(), Float.valueOf(0.6F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(0.6F))
                });
                ((SkypeMultiPropertyAnimatorSet) (obj5)).a(0.4784876F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.b(), new Pair[] {
                    Pair.create(View.X.getName(), Float.valueOf(527F * f1 - (float)i)), Pair.create(View.Y.getName(), Float.valueOf(1256F * f4 - (float)i)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.1F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.1F))
                });
                ((SkypeMultiPropertyAnimatorSet) (obj5)).a(1.0F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.b(), new Pair[] {
                    Pair.create(View.X.getName(), Float.valueOf(544F * f1 - (float)i)), Pair.create(View.Y.getName(), Float.valueOf(1263F * f4 - (float)i)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
                });
                ((SkypeMultiPropertyAnimatorSet) (obj)).a(767L);
                ((SkypeMultiPropertyAnimatorSet) (obj2)).a(767L);
                ((SkypeMultiPropertyAnimatorSet) (obj4)).a(767L);
                ((SkypeMultiPropertyAnimatorSet) (obj5)).a(767L);
            } else
            {
                j = 0;
                while (j < a.size()) 
                {
                    removeView((View)a.valueAt(j));
                    j++;
                }
            }
            obj1 = new SkypeMultiPropertyAnimatorSet(c());
            obj3 = com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.d();
            s = View.ROTATION.getName();
            if (flag)
            {
                f2 = 0.0F;
            } else
            {
                f2 = 45F;
            }
            ((SkypeMultiPropertyAnimatorSet) (obj1)).a(0.0F, ((com.skype.android.animation.SkypeAbstractAnimatorSet.Curve) (obj3)), new Pair[] {
                Pair.create(s, Float.valueOf(f2)), Pair.create(View.SCALE_X.getName(), Float.valueOf(c().getScaleX())), Pair.create(View.SCALE_Y.getName(), Float.valueOf(c().getScaleY()))
            });
            obj3 = com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.b();
            s = View.ROTATION.getName();
            if (flag)
            {
                f2 = 60F;
            } else
            {
                f2 = -15F;
            }
            ((SkypeMultiPropertyAnimatorSet) (obj1)).a(0.2086049F, ((com.skype.android.animation.SkypeAbstractAnimatorSet.Curve) (obj3)), new Pair[] {
                Pair.create(s, Float.valueOf(f2)), Pair.create(View.SCALE_X.getName(), Float.valueOf(0.85F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(0.85F))
            });
            obj3 = View.ROTATION.getName();
            if (flag)
            {
                f2 = 45F;
            } else
            {
                f2 = 0.0F;
            }
            ((SkypeMultiPropertyAnimatorSet) (obj1)).a(0.7301173F, null, new Pair[] {
                Pair.create(obj3, Float.valueOf(f2)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
            });
            ((SkypeMultiPropertyAnimatorSet) (obj1)).a(767L);
            obj1 = new ArgbEvaluator();
            if (flag)
            {
                j = 0;
            } else
            {
                j = d();
            }
            if (flag)
            {
                k = d();
            } else
            {
                k = 0;
            }
            obj1 = ObjectAnimator.ofObject(this, "backgroundColor", ((android.animation.TypeEvaluator) (obj1)), new Object[] {
                Integer.valueOf(j), Integer.valueOf(k)
            });
            ((ObjectAnimator) (obj1)).setDuration(255L);
            ((ObjectAnimator) (obj1)).start();
            return;
        }
        ViewPropertyAnimator viewpropertyanimator = c().animate();
        float f3;
        if (flag)
        {
            f3 = 45F;
        } else
        {
            f3 = 0.0F;
        }
        viewpropertyanimator.rotation(f3).setDuration(100L).setInterpolator(new AccelerateDecelerateInterpolator());
    }
}
