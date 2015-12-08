// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.actionbutton;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.util.view.Views;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.widgets.actionbutton:
//            BackgroundShadeDrawable, FloatingActionButton

public class ActionsContainer extends LinearLayout
{
    static final class Action
    {

        private final ImageButton imageButton;
        private final Intent intent;
        private final View view;

        public final ImageButton getButtonView()
        {
            return imageButton;
        }

        public final Intent getIntent()
        {
            return intent;
        }

        public final View getView()
        {
            return view;
        }

        public Action(String s, int i, Intent intent1, View view1)
        {
            intent = intent1;
            view = view1;
            intent1 = (TextView)Views.findViewById(view1, com.google.android.apps.walletnfcrel.R.id.ActionText);
            if (s != null && intent1 != null)
            {
                intent1.setText(s);
            }
            imageButton = (ImageButton)Views.findViewById(view1, com.google.android.apps.walletnfcrel.R.id.ActionImage);
            imageButton.setImageResource(i);
            imageButton.setContentDescription(s);
            imageButton.setClickable(false);
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                imageButton.setElevation(view1.getResources().getDimension(com.google.android.apps.walletnfcrel.R.dimen.fab_elevation));
                imageButton.setStateListAnimator(AnimatorInflater.loadStateListAnimator(view1.getContext(), com.google.android.apps.walletnfcrel.R.anim.floating_action_button_raise));
            }
        }
    }

    final class LegacyOpenCloser
        implements OpenCloser
    {

        private final int duration;
        final ActionsContainer this$0;

        private Animator animate(boolean flag)
        {
            AnimatorSet animatorset = new AnimatorSet();
            float f;
            float f1;
            Object obj;
            AnimatorSet animatorset1;
            ObjectAnimator objectanimator;
            if (flag)
            {
                obj = createOpenListener();
            } else
            {
                obj = createCloseListener();
            }
            animatorset.addListener(((android.animation.Animator.AnimatorListener) (obj)));
            animatorset.setDuration(duration);
            animatorset1 = createButtonAnimators(flag, duration);
            obj = ActionsContainer.this;
            if (flag)
            {
                f = 0.0F;
            } else
            {
                f = 1.0F;
            }
            if (flag)
            {
                f1 = 1.0F;
            } else
            {
                f1 = 0.0F;
            }
            objectanimator = ObjectAnimator.ofFloat(obj, "alpha", new float[] {
                f, f1
            });
            objectanimator.setInterpolator(new DecelerateInterpolator(1.5F));
            if (actionButton != null)
            {
                obj = actionButton;
                float f2;
                ObjectAnimator objectanimator1;
                ObjectAnimator objectanimator2;
                ObjectAnimator objectanimator3;
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
                objectanimator1 = ObjectAnimator.ofFloat(obj, "rotation", new float[] {
                    f, f1
                }).setDuration(duration);
                f = (float)smallFabHeight / (float)fabHeight;
                obj = actionButton;
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
                objectanimator2 = ObjectAnimator.ofFloat(obj, "scaleX", new float[] {
                    f1, f2
                }).setDuration(duration);
                obj = actionButton;
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
                objectanimator3 = ObjectAnimator.ofFloat(obj, "scaleY", new float[] {
                    f1, f
                }).setDuration(duration);
                if (flag)
                {
                    obj = actionButton.fadeOut(duration);
                } else
                {
                    obj = actionButton.fadeIn(duration);
                }
                animatorset.playTogether(new Animator[] {
                    animatorset1, objectanimator, objectanimator1, objectanimator2, objectanimator3, obj
                });
                animatorset.addListener(createLayerTypeAdjuster(actionButton));
            } else
            {
                animatorset.playTogether(new Animator[] {
                    animatorset1, objectanimator
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

        public LegacyOpenCloser(Resources resources)
        {
            this$0 = ActionsContainer.this;
            super();
            duration = resources.getInteger(0x10e0000);
        }
    }

    final class MaterialOpenCloser
        implements OpenCloser
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
            if (actionButton != null)
            {
                i = (int)(actionButton.getX() + (float)(actionButton.getWidth() / 2));
            } else
            {
                i = getWidth() / 2;
            }
            if (actionButton != null)
            {
                j = (int)(actionButton.getY() + (float)(actionButton.getHeight() / 2));
            } else
            {
                j = getHeight() / 2;
            }
            animatorset = new AnimatorSet();
            if (flag)
            {
                obj = createOpenListener();
            } else
            {
                obj = createCloseListener();
            }
            animatorset.addListener(((android.animation.Animator.AnimatorListener) (obj)));
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
            animator = ViewAnimationUtils.createCircularReveal(((View) (obj)), i, j, f1, f);
            l = animator.getDuration();
            animatorset.setDuration(l);
            if (actionButton != null)
            {
                obj = actionButton;
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
                f = (float)smallFabHeight / (float)fabHeight;
                obj = actionButton;
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
                obj = actionButton;
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
                    obj = actionButton.fadeOut(l);
                } else
                {
                    obj = actionButton.fadeIn(l);
                }
                animatorset.playTogether(new Animator[] {
                    animator, objectanimator, objectanimator1, objectanimator2, obj, createButtonAnimators(flag, l)
                });
                animatorset.addListener(createLayerTypeAdjuster(actionButton));
            } else
            {
                animatorset.playTogether(new Animator[] {
                    animator, createButtonAnimators(flag, l)
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

        private MaterialOpenCloser()
        {
            this$0 = ActionsContainer.this;
            super();
        }

    }

    static interface OpenCloser
    {

        public abstract Animator close();

        public abstract Animator open();
    }


    private FloatingActionButton actionButton;
    private final android.view.View.OnClickListener actionButtonClickListener = new android.view.View.OnClickListener() {

        final ActionsContainer this$0;

        public final void onClick(View view)
        {
            open();
        }

            
            {
                this$0 = ActionsContainer.this;
                super();
            }
    };
    private final android.view.View.OnClickListener actionClickListener = new android.view.View.OnClickListener() {

        final ActionsContainer this$0;

        public final void onClick(View view)
        {
            view = (Action)view.getTag(com.google.android.apps.walletnfcrel.R.id.FloatingActionButtonAction);
            close();
            if (lastAnimator != null)
            {
                lastAnimator.addListener(view. new AnimatorListenerAdapter() {

                    final _cls8 this$1;
                    final Action val$action;

                    public final void onAnimationEnd(Animator animator)
                    {
                        getContext().startActivity(action.getIntent());
                    }

            
            {
                this$1 = final__pcls8;
                action = Action.this;
                super();
            }
                });
                return;
            } else
            {
                getContext().startActivity(view.getIntent());
                return;
            }
        }

            
            {
                this$0 = ActionsContainer.this;
                super();
            }
    };
    private final int actionHeight;
    private final ArrayList actions = Lists.newArrayList();
    private Action closeAction;
    private final android.view.View.OnClickListener containerClickListener = new android.view.View.OnClickListener() {

        final ActionsContainer this$0;

        public final void onClick(View view)
        {
            close();
        }

            
            {
                this$0 = ActionsContainer.this;
                super();
            }
    };
    private final int fabHeight;
    private Animator lastAnimator;
    private final OpenCloser openCloser;
    private final int smallFabHeight;

    public ActionsContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setBackgroundDrawable(new BackgroundShadeDrawable(getResources().getColor(0x106000b), 0.9F, 0.0F));
        Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            obj = new MaterialOpenCloser();
        } else
        {
            obj = new LegacyOpenCloser(getResources());
        }
        openCloser = ((OpenCloser) (obj));
        attributeset = context.obtainStyledAttributes(attributeset, com.google.android.apps.walletnfcrel.R.styleable.ActionsContainer);
        if (attributeset.hasValue(com.google.android.apps.walletnfcrel.R.styleable.ActionsContainer_actionButtonId))
        {
            doDelayedButtonSearch(context, attributeset.getResourceId(com.google.android.apps.walletnfcrel.R.styleable.ActionsContainer_actionButtonId, -1));
        }
        attributeset.recycle();
        fabHeight = getResources().getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.fab_diameter);
        actionHeight = fabHeight + getResources().getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.default_spacing);
        smallFabHeight = getResources().getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.fab_small_diameter);
        setOnClickListener(containerClickListener);
        setCloseAction();
    }

    private AnimatorSet createButtonAnimators(boolean flag, long l)
    {
        ArrayList arraylist = Lists.newArrayListWithCapacity(actions.size() + 1);
        float f1;
        float f2;
        float f3;
        if (actionButton == null)
        {
            f1 = 0.0F;
        } else
        {
            f1 = (float)actionButton.getTop() + actionButton.getTranslationY() + (float)((fabHeight - smallFabHeight) / 2);
        }
        if (actionButton != null && closeAction != null)
        {
            View view = closeAction.getView();
            float f = (float)(-(fabHeight - smallFabHeight)) / 2.0F;
            Object obj = ObjectAnimator.ofFloat(view, "translationX", new float[] {
                f, f
            });
            f = f1 - (float)view.getTop();
            Object obj1 = ObjectAnimator.ofFloat(view, "translationY", new float[] {
                f, f
            });
            ObjectAnimator objectanimator;
            ObjectAnimator objectanimator1;
            ObjectAnimator objectanimator2;
            AnimatorSet animatorset1;
            int i;
            if (flag)
            {
                f = -180F;
            } else
            {
                f = 0.0F;
            }
            if (flag)
            {
                f2 = 0.0F;
            } else
            {
                f2 = -180F;
            }
            objectanimator = ObjectAnimator.ofFloat(view, "rotation", new float[] {
                f, f2
            });
            f = (float)fabHeight / (float)smallFabHeight;
            if (flag)
            {
                f2 = f;
            } else
            {
                f2 = 1.0F;
            }
            if (flag)
            {
                f3 = 1.0F;
            } else
            {
                f3 = f;
            }
            objectanimator1 = ObjectAnimator.ofFloat(view, "scaleX", new float[] {
                f2, f3
            });
            if (flag)
            {
                f2 = f;
            } else
            {
                f2 = 1.0F;
            }
            if (flag)
            {
                f = 1.0F;
            }
            objectanimator2 = ObjectAnimator.ofFloat(view, "scaleY", new float[] {
                f2, f
            });
            animatorset1 = new AnimatorSet();
            animatorset1.addListener(createLayerTypeAdjuster(view));
            animatorset1.playTogether(new Animator[] {
                obj, obj1, objectanimator1, objectanimator2, objectanimator
            });
            animatorset1.setDuration(l);
            arraylist.add(animatorset1);
        }
        f = f1 - (float)actionHeight;
        f1 -= (float)fabHeight / 2.0F;
        i = 0;
        while (i < actions.size()) 
        {
            view = ((Action)actions.get(i)).getView();
            obj = ((Action)actions.get(i)).getButtonView();
            obj1 = new AnimatorSet();
            f2 = f1 - (float)view.getTop();
            f3 = f - (float)view.getTop();
            float f4;
            if (flag)
            {
                f4 = f2;
            } else
            {
                f4 = f3;
            }
            if (!flag)
            {
                f3 = f2;
            }
            objectanimator = ObjectAnimator.ofFloat(view, "translationY", new float[] {
                f4, f3
            });
            if (flag)
            {
                f2 = 0.0F;
            } else
            {
                f2 = 1.0F;
            }
            if (flag)
            {
                f3 = 1.0F;
            } else
            {
                f3 = 0.0F;
            }
            objectanimator1 = ObjectAnimator.ofFloat(view, "alpha", new float[] {
                f2, f3
            });
            if (flag)
            {
                f2 = -90F;
            } else
            {
                f2 = 0.0F;
            }
            if (flag)
            {
                f3 = 0.0F;
            } else
            {
                f3 = -90F;
            }
            ((AnimatorSet) (obj1)).playTogether(new Animator[] {
                objectanimator, objectanimator1, ObjectAnimator.ofFloat(obj, "rotation", new float[] {
                    f2, f3
                })
            });
            ((AnimatorSet) (obj1)).setDuration(l);
            ((AnimatorSet) (obj1)).addListener(createLayerTypeAdjuster(view));
            arraylist.add(obj1);
            f1 -= fabHeight;
            f -= actionHeight;
            i++;
        }
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(arraylist);
        animatorset.setDuration(l);
        return animatorset;
    }

    private AnimatorListenerAdapter createCloseListener()
    {
        return new AnimatorListenerAdapter() {

            final ActionsContainer this$0;

            public final void onAnimationEnd(Animator animator)
            {
                if (lastAnimator == animator)
                {
                    lastAnimator = null;
                }
                setLayerType(0, null);
                setVisibility(4);
            }

            public final void onAnimationStart(Animator animator)
            {
                setClickable(false);
                setLayerType(2, null);
                if (actionButton != null)
                {
                    actionButton.setClickable(true);
                    actionButton.setVisibility(0);
                }
            }

            
            {
                this$0 = ActionsContainer.this;
                super();
            }
        };
    }

    private android.animation.Animator.AnimatorListener createLayerTypeAdjuster(final View view)
    {
        return new AnimatorListenerAdapter() {

            final ActionsContainer this$0;
            final View val$view;

            public final void onAnimationEnd(Animator animator)
            {
                view.setLayerType(0, null);
            }

            public final void onAnimationStart(Animator animator)
            {
                view.setLayerType(2, null);
            }

            
            {
                this$0 = ActionsContainer.this;
                view = view1;
                super();
            }
        };
    }

    private AnimatorListenerAdapter createOpenListener()
    {
        return new AnimatorListenerAdapter() {

            final ActionsContainer this$0;

            public final void onAnimationEnd(Animator animator)
            {
                if (lastAnimator == animator)
                {
                    lastAnimator = null;
                }
                setLayerType(0, null);
                if (actionButton != null)
                {
                    actionButton.setVisibility(4);
                }
            }

            public final void onAnimationStart(Animator animator)
            {
                setVisibility(0);
                setClickable(true);
                setLayerType(2, null);
                if (actionButton != null)
                {
                    actionButton.setClickable(false);
                }
            }

            
            {
                this$0 = ActionsContainer.this;
                super();
            }
        };
    }

    private void doDelayedButtonSearch(final Context context, final int id)
    {
        if (id == -1)
        {
            return;
        } else
        {
            (new Handler()).post(new Runnable() {

                final ActionsContainer this$0;
                final Context val$context;
                final int val$id;

                public final void run()
                {
                    if (actionButton != null)
                    {
                        return;
                    } else
                    {
                        FloatingActionButton floatingactionbutton = (FloatingActionButton)Views.findViewById((Activity)context, id);
                        setFloatingActionButton(floatingactionbutton);
                        return;
                    }
                }

            
            {
                this$0 = ActionsContainer.this;
                context = context1;
                id = i;
                super();
            }
            });
            return;
        }
    }

    private boolean isOpen()
    {
        return getVisibility() == 0;
    }

    private ActionsContainer setCloseAction()
    {
        View view = LayoutInflater.from(getContext()).inflate(com.google.android.apps.walletnfcrel.R.layout.fab_close, this, false);
        if (closeAction != null)
        {
            removeView(closeAction.getView());
        }
        closeAction = new Action(getResources().getString(com.google.android.apps.walletnfcrel.R.string.fab_close), com.google.android.apps.walletnfcrel.R.drawable.quantum_ic_clear_white_24, null, view);
        addView(view);
        view.setTag(com.google.android.apps.walletnfcrel.R.id.FloatingActionButtonAction, closeAction);
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final ActionsContainer this$0;

            public final void onClick(View view1)
            {
                close();
            }

            
            {
                this$0 = ActionsContainer.this;
                super();
            }
        });
        return this;
    }

    public final ActionsContainer addAction(int i, int j, Intent intent)
    {
        View view = LayoutInflater.from(getContext()).inflate(com.google.android.apps.walletnfcrel.R.layout.fab_action, this, false);
        intent = new Action(getResources().getString(i), j, intent, view);
        actions.add(intent);
        addView(view, 0);
        view.setTag(com.google.android.apps.walletnfcrel.R.id.FloatingActionButtonAction, intent);
        view.setOnClickListener(actionClickListener);
        return this;
    }

    public final void close()
    {
        if (isOpen())
        {
            if (lastAnimator != null)
            {
                lastAnimator.cancel();
            }
            lastAnimator = openCloser.close();
        }
    }

    public final void open()
    {
        if (!isOpen())
        {
            if (lastAnimator != null)
            {
                lastAnimator.cancel();
            }
            lastAnimator = openCloser.open();
        }
    }

    public void setFloatingActionButton(FloatingActionButton floatingactionbutton)
    {
        if (actionButton != null)
        {
            actionButton.setOnClickListener(null);
        }
        actionButton = floatingactionbutton;
        if (floatingactionbutton != null)
        {
            floatingactionbutton.setOnClickListener(actionButtonClickListener);
        }
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        super.setOnClickListener(onclicklistener);
        if (!isOpen())
        {
            setClickable(false);
        }
    }




/*
    static Animator access$202(ActionsContainer actionscontainer, Animator animator)
    {
        actionscontainer.lastAnimator = animator;
        return animator;
    }

*/






}
