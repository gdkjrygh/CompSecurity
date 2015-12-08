// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.skype.android.animation.SkypeAbstractAnimatorSet;
import com.skype.android.animation.SkypeMultiPropertyAnimatorSet;
import com.skype.android.animation.SkypePropertyAnimatorSet;
import com.skype.android.animation.SkypeValueAnimatorSet;
import com.skype.android.util.FloatMath;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExpandedActionsViewGroup extends FrameLayout
    implements android.view.View.OnClickListener
{
    public static interface OnExpandedStateListener
    {
    }


    private boolean a;
    private OnExpandedStateListener b;
    private View c;
    private List d;
    private List e;
    private int f;
    private long g;
    private int h;
    private int i;
    private boolean j;

    public ExpandedActionsViewGroup(Context context)
    {
        super(context);
        a(((AttributeSet) (null)));
    }

    public ExpandedActionsViewGroup(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(attributeset);
    }

    public ExpandedActionsViewGroup(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        a(attributeset);
    }

    private void a(AttributeSet attributeset)
    {
        d = new ArrayList();
        e = new ArrayList();
        int l = 0;
        int k = 90;
        boolean flag = true;
        f = 0;
        if (attributeset != null)
        {
            attributeset = getContext().obtainStyledAttributes(attributeset, R.styleable.ExpandedActionsViewGroup);
            l = attributeset.getInt(0, 0);
            k = attributeset.getInt(1, 90);
            f = attributeset.getDimensionPixelSize(2, 0);
            flag = attributeset.getBoolean(3, true);
            attributeset.recycle();
        }
        setArc(l, k);
        setClockwiseExpandAnimation(flag);
        if (f <= 0)
        {
            throw new IllegalArgumentException("Menu radius must be greater than 0");
        } else
        {
            g = 730L;
            return;
        }
    }

    static boolean a(ExpandedActionsViewGroup expandedactionsviewgroup)
    {
        return expandedactionsviewgroup.j;
    }

    static List b(ExpandedActionsViewGroup expandedactionsviewgroup)
    {
        return expandedactionsviewgroup.d;
    }

    public void onClick(View view)
    {
        boolean flag;
        if (!a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a != flag)
        {
            c.setSelected(flag);
            ((ViewGroup)getParent()).setClipChildren(false);
            a = flag;
            requestLayout();
            int k = 0;
            while (k < d.size()) 
            {
                view = (View)d.get(k);
                Object obj = view.findViewById(R.id.extra_action_button);
                if (view.getTag() != null)
                {
                    Object obj1 = (List)view.getTag();
                    if (obj1 != null)
                    {
                        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((SkypeAbstractAnimatorSet)((Iterator) (obj1)).next()).b()) { }
                    }
                }
                view.setVisibility(0);
                float f6 = f - c.getWidth() - ((Integer)((Pair)e.get(k)).first).intValue();
                float f5 = f - c.getHeight() - ((Integer)((Pair)e.get(k)).second).intValue();
                float f1;
                float f4;
                float f7;
                float f8;
                SkypeMultiPropertyAnimatorSet skypemultipropertyanimatorset;
                if (view.getTranslationX() == 1.401298E-45F)
                {
                    f1 = f6;
                } else
                {
                    f1 = view.getTranslationX();
                }
                if (view.getTranslationY() == 1.401298E-45F)
                {
                    f4 = f5;
                } else
                {
                    f4 = view.getTranslationY();
                }
                if (flag)
                {
                    f6 = 0.0F;
                }
                if (flag)
                {
                    f5 = 0.0F;
                }
                f8 = ((View) (obj)).getAlpha();
                if (flag)
                {
                    f7 = 1.0F;
                } else
                {
                    f7 = 0.0F;
                }
                view.setTranslationX(f1);
                view.setTranslationY(f4);
                obj = new SkypeValueAnimatorSet(new android.animation.ValueAnimator.AnimatorUpdateListener(view, f1, f6, f4, f5, ((View) (obj)), f8, f7) {

                    final View a;
                    final float b;
                    final float c;
                    final float d;
                    final float e;
                    final View f;
                    final float g;
                    final float h;
                    final ExpandedActionsViewGroup i;

                    public final void onAnimationUpdate(ValueAnimator valueanimator)
                    {
                        float f9 = ((Float)valueanimator.getAnimatedValue()).floatValue();
                        valueanimator = a;
                        float f10 = b;
                        valueanimator.setTranslationX(f10 + (c - f10) * f9);
                        valueanimator = a;
                        f10 = d;
                        valueanimator.setTranslationY(f10 + (e - f10) * f9);
                        valueanimator = f;
                        f10 = g;
                        valueanimator.setAlpha(f10 + (h - f10) * f9);
                    }

            
            {
                i = ExpandedActionsViewGroup.this;
                a = view;
                b = f1;
                c = f2;
                d = f3;
                e = f4;
                f = view1;
                g = f5;
                h = f6;
                super();
            }
                });
                ((SkypeValueAnimatorSet) (obj)).a(new AnimatorListenerAdapter(view, flag, k) {

                    final View a;
                    final boolean b;
                    final int c;
                    final ExpandedActionsViewGroup d;

                    public final void onAnimationEnd(Animator animator)
                    {
                        animator = a;
                        int j1;
                        int k1;
                        if (b)
                        {
                            j1 = 0;
                        } else
                        {
                            j1 = 8;
                        }
                        animator.setVisibility(j1);
                        k1 = c;
                        if (ExpandedActionsViewGroup.a(d))
                        {
                            j1 = ExpandedActionsViewGroup.b(d).size() - 1;
                        } else
                        {
                            j1 = 0;
                        }
                        if (k1 == j1)
                        {
                            ((ViewGroup)d.getParent()).setClipChildren(false);
                        }
                    }

            
            {
                d = ExpandedActionsViewGroup.this;
                a = view;
                b = flag;
                c = k;
                super();
            }
                });
                skypemultipropertyanimatorset = new SkypeMultiPropertyAnimatorSet(view);
                if (flag)
                {
                    ArrayList arraylist;
                    int l;
                    if (j)
                    {
                        l = k;
                    } else
                    {
                        l = d.size() - 1 - k;
                    }
                    f1 = (float)l * 0.11F;
                    ((SkypeValueAnimatorSet) (obj)).a(0.0F, 0.0F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a());
                    ((SkypeValueAnimatorSet) (obj)).a(0.3636F + f1, 1.12F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.b());
                    ((SkypeValueAnimatorSet) (obj)).a(1.0F, 1.0F, null);
                    skypemultipropertyanimatorset.a(0.0F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a(), new Pair[] {
                        Pair.create(View.SCALE_X.getName(), Float.valueOf(view.getScaleX())), Pair.create(View.SCALE_Y.getName(), Float.valueOf(view.getScaleY()))
                    });
                    skypemultipropertyanimatorset.a(0.2727F + f1, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a(0.33F, 0.0F, 0.78F, 1.0F), new Pair[] {
                        Pair.create(View.SCALE_X.getName(), Float.valueOf(0.94F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.16F))
                    });
                    skypemultipropertyanimatorset.a(0.3636F + f1, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.b(), new Pair[] {
                        Pair.create(View.SCALE_X.getName(), Float.valueOf(1.16F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(0.94F))
                    });
                    skypemultipropertyanimatorset.a(f1 + 0.8182F, null, new Pair[] {
                        Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
                    });
                } else
                {
                    float f2;
                    int i1;
                    if (j)
                    {
                        i1 = k;
                    } else
                    {
                        i1 = d.size() - 1 - k;
                    }
                    f2 = (float)i1 * 0.05F;
                    ((SkypeValueAnimatorSet) (obj)).a(0.0F, 0.0F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a());
                    ((SkypeValueAnimatorSet) (obj)).a(0.4F + f2, 1.0F, null);
                    ((SkypeValueAnimatorSet) (obj)).a(1.0F, 1.0F, null);
                    skypemultipropertyanimatorset.a(0.0F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a(1.0F, 0.0F, 0.85F, 1.26F), new Pair[] {
                        Pair.create(View.SCALE_X.getName(), Float.valueOf(view.getScaleX())), Pair.create(View.SCALE_Y.getName(), Float.valueOf(view.getScaleY()))
                    });
                    skypemultipropertyanimatorset.a(0.3F + f2, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a(0.57F, -0.14F, 0.5F, 1.0F), new Pair[] {
                        Pair.create(View.SCALE_X.getName(), Float.valueOf(0.94F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.16F))
                    });
                    skypemultipropertyanimatorset.a(f2 + 0.4F, null, new Pair[] {
                        Pair.create(View.SCALE_X.getName(), Float.valueOf(0.8F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(0.8F))
                    });
                }
                ((SkypeValueAnimatorSet) (obj)).a(g);
                skypemultipropertyanimatorset.a(g);
                arraylist = new ArrayList();
                arraylist.add(obj);
                arraylist.add(skypemultipropertyanimatorset);
                view.setTag(arraylist);
                k++;
            }
            view = new SkypePropertyAnimatorSet(c, new String[] {
                View.SCALE_X.getName(), View.SCALE_Y.getName()
            });
            view.a(0.0F, 1.06F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a());
            view.a(0.4545F, 0.96F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.b());
            view.a(0.9091F, 1.0F, null);
            view.a(g);
            view = new SkypePropertyAnimatorSet(c, View.ROTATION.getName());
            float f3;
            if (flag)
            {
                f3 = 45F;
            } else
            {
                f3 = 225F;
            }
            view.a(0.0F, f3, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a());
            if (flag)
            {
                f3 = 245F;
            } else
            {
                f3 = 25F;
            }
            view.a(0.4545F, f3, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.b());
            if (flag)
            {
                f3 = 225F;
            } else
            {
                f3 = 45F;
            }
            view.a(0.9091F, f3, null);
            view.a(g);
        }
    }

    protected void onLayout(boolean flag, int k, int l, int i1, int j1)
    {
        l = d.size();
        i1 = c.getMeasuredHeight();
        if (l > 0)
        {
            float f1 = (i - h) / l;
            float f2 = h;
            float f3 = f1 / 2.0F;
            for (k = 0; k < l; k++)
            {
                View view = (View)d.get(k);
                float f4 = FloatMath.b((float)k * f1 + (f2 + f3));
                float f5 = (float)Math.cos(f4);
                float f6 = (float)Math.sin(f4);
                f5 = (float)(i1 / 2) + (float)(getWidth() - i1 / 2) * (1.0F + f5);
                f6 = (float)(i1 / 2) + (float)(getHeight() - i1 / 2) * (1.0F - f6);
                view.layout((int)(f5 - (float)(i1 / 2)), (int)(f6 - (float)(i1 / 2)), (int)((float)(i1 / 2) + f5), (int)((float)(i1 / 2) + f6));
                f4 = 90F - (float)Math.toDegrees(f4);
                view.setRotation(f4);
                view.findViewById(R.id.extra_action_button).setRotation(-f4);
                e.set(k, Pair.create(Integer.valueOf((int)(f5 - (float)(i1 / 2))), Integer.valueOf((int)(f6 - (float)(i1 / 2)))));
            }

        }
        c.layout(getWidth() - i1, getHeight() - i1, getWidth(), getHeight());
        c.bringToFront();
    }

    protected void onMeasure(int k, int l)
    {
        super.onMeasure(k, l);
        setMeasuredDimension(f, f);
    }

    protected void onVisibilityChanged(View view, int k)
    {
        super.onVisibilityChanged(view, k);
    }

    public void setActionEnabled(int k, boolean flag)
    {
        Iterator iterator = d.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        View view = (View)iterator.next();
        if (view.getId() != k) goto _L4; else goto _L3
_L3:
        if (view != null)
        {
            view.findViewById(R.id.extra_action_button).setEnabled(flag);
        }
        return;
_L2:
        view = null;
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void setArc(int k, int l)
    {
        if (k > l)
        {
            throw new IllegalArgumentException("end angle should be greater than the starting angle");
        } else
        {
            h = k % 360;
            i = l % 360;
            return;
        }
    }

    public void setClockwiseExpandAnimation(boolean flag)
    {
        j = flag;
    }

    public void setOnExpandedStateChangeListener(OnExpandedStateListener onexpandedstatelistener)
    {
        b = onexpandedstatelistener;
    }
}
