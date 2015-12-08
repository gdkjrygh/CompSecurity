// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.actionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewAnimationUtils;

// Referenced classes of package com.google.android.apps.wallet.widgets.actionbutton:
//            ActionsContainer, FloatingActionButton

final class <init>
    implements <init>
{

    final ActionsContainer this$0;

    private Animator animate(boolean flag)
    {
        float f = (float)Math.max(getWidth(), getHeight()) * 2.0F;
        float f1;
        Object obj;
        AnimatorSet animatorset;
        Animator animator;
        int i;
        int j;
        long l;
        if (ActionsContainer.access$100(ActionsContainer.this) != null)
        {
            i = (int)(ActionsContainer.access$100(ActionsContainer.this).getX() + (float)(ActionsContainer.access$100(ActionsContainer.this).getWidth() / 2));
        } else
        {
            i = getWidth() / 2;
        }
        if (ActionsContainer.access$100(ActionsContainer.this) != null)
        {
            j = (int)(ActionsContainer.access$100(ActionsContainer.this).getY() + (float)(ActionsContainer.access$100(ActionsContainer.this).getHeight() / 2));
        } else
        {
            j = getHeight() / 2;
        }
        animatorset = new AnimatorSet();
        if (flag)
        {
            obj = ActionsContainer.access$300(ActionsContainer.this);
        } else
        {
            obj = ActionsContainer.access$400(ActionsContainer.this);
        }
        animatorset.addListener(((android.animation.tionsContainer) (obj)));
        obj = ActionsContainer.this;
        if (flag)
        {
            f1 = 0.0F;
        } else
        {
            f1 = f;
        }
        if (!flag)
        {
            f = 0.0F;
        }
        animator = ViewAnimationUtils.createCircularReveal(((android.view.View) (obj)), i, j, f1, f);
        l = animator.getDuration();
        animatorset.setDuration(l);
        if (ActionsContainer.access$100(ActionsContainer.this) != null)
        {
            obj = ActionsContainer.access$100(ActionsContainer.this);
            float f2;
            ObjectAnimator objectanimator;
            ObjectAnimator objectanimator1;
            ObjectAnimator objectanimator2;
            if (flag)
            {
                f = 0.0F;
            } else
            {
                f = 180F;
            }
            if (flag)
            {
                f1 = 180F;
            } else
            {
                f1 = 0.0F;
            }
            objectanimator = ObjectAnimator.ofFloat(obj, "rotation", new float[] {
                f, f1
            }).setDuration(l);
            f = (float)ActionsContainer.access$500(ActionsContainer.this) / (float)ActionsContainer.access$600(ActionsContainer.this);
            obj = ActionsContainer.access$100(ActionsContainer.this);
            if (flag)
            {
                f1 = 1.0F;
            } else
            {
                f1 = f;
            }
            if (flag)
            {
                f2 = f;
            } else
            {
                f2 = 1.0F;
            }
            objectanimator1 = ObjectAnimator.ofFloat(obj, "scaleX", new float[] {
                f1, f2
            }).setDuration(l);
            obj = ActionsContainer.access$100(ActionsContainer.this);
            if (flag)
            {
                f1 = 1.0F;
            } else
            {
                f1 = f;
            }
            if (!flag)
            {
                f = 1.0F;
            }
            objectanimator2 = ObjectAnimator.ofFloat(obj, "scaleY", new float[] {
                f1, f
            }).setDuration(l);
            if (flag)
            {
                obj = ActionsContainer.access$100(ActionsContainer.this).fadeOut(l);
            } else
            {
                obj = ActionsContainer.access$100(ActionsContainer.this).fadeIn(l);
            }
            animatorset.playTogether(new Animator[] {
                animator, objectanimator, objectanimator1, objectanimator2, obj, ActionsContainer.access$700(ActionsContainer.this, flag, l)
            });
            animatorset.addListener(ActionsContainer.access$800(ActionsContainer.this, ActionsContainer.access$100(ActionsContainer.this)));
        } else
        {
            animatorset.playTogether(new Animator[] {
                animator, ActionsContainer.access$700(ActionsContainer.this, flag, l)
            });
        }
        animatorset.start();
        return animatorset;
    }

    public final Animator close()
    {
        return animate(false);
    }

    public final Animator open()
    {
        return animate(true);
    }

    private ()
    {
        this$0 = ActionsContainer.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
