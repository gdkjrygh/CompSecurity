// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.DefaultItemAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.play.animation:
//            ShuffleAnimation

public final class ShuffleAddItemAnimator extends DefaultItemAnimator
{
    public static interface AnimateAddProvider
    {

        public abstract boolean shouldAnimateAdd();
    }


    private ArrayList mAdditionsList;
    public boolean mChangeAnimationsDisabled;
    private boolean mHasPendingShuffle;
    private final ArrayList mPendingDefaultAdditions;
    private final ArrayList mPendingShuffleAdditions;
    final ArrayList mRunningAddAnimations;
    private final int mShuffleMode;

    public ShuffleAddItemAnimator()
    {
        this((byte)0);
    }

    private ShuffleAddItemAnimator(byte byte0)
    {
        mPendingShuffleAdditions = new ArrayList();
        mPendingDefaultAdditions = new ArrayList();
        mRunningAddAnimations = new ArrayList();
        mAdditionsList = new ArrayList();
        mChangeAnimationsDisabled = false;
        mHasPendingShuffle = true;
        mShuffleMode = 0;
    }

    private void dispatchFinishedWhenDone()
    {
        if (!isRunning())
        {
            dispatchAnimationsFinished();
        }
    }

    static void reset(View view)
    {
        view.setAlpha(1.0F);
        view.setTranslationY(0.0F);
        view.setRotation(0.0F);
    }

    public final boolean animateAdd(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
    {
        endAnimation(viewholder);
        viewholder.itemView.setAlpha(0.0F);
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            boolean flag;
            if ((viewholder instanceof AnimateAddProvider) && ((AnimateAddProvider)viewholder).shouldAnimateAdd())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                mPendingShuffleAdditions.add(viewholder);
                return true;
            }
        }
        mPendingDefaultAdditions.add(viewholder);
        return true;
    }

    public final boolean animateChange(android.support.v7.widget.RecyclerView.ViewHolder viewholder, android.support.v7.widget.RecyclerView.ViewHolder viewholder1, int i, int j, int k, int l)
    {
        if (mChangeAnimationsDisabled)
        {
            if (viewholder != null)
            {
                dispatchChangeFinished$763f3adc(viewholder);
            }
            if (viewholder1 != null)
            {
                dispatchChangeFinished$763f3adc(viewholder1);
            }
            return false;
        } else
        {
            return super.animateChange(viewholder, viewholder1, i, j, k, l);
        }
    }

    public final void endAnimation(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
    {
        super.endAnimation(viewholder);
        View view = viewholder.itemView;
        if (mPendingShuffleAdditions.remove(viewholder))
        {
            reset(view);
            dispatchAddFinished(viewholder);
        }
        for (int i = mAdditionsList.size() - 1; i >= 0; i--)
        {
            ArrayList arraylist = (ArrayList)mAdditionsList.get(i);
            if (!arraylist.remove(viewholder))
            {
                continue;
            }
            reset(view);
            dispatchAddFinished(viewholder);
            if (arraylist.isEmpty())
            {
                mAdditionsList.remove(arraylist);
            }
        }

        mRunningAddAnimations.remove(viewholder);
        dispatchFinishedWhenDone();
    }

    public final void endAnimations()
    {
        for (int i = mPendingShuffleAdditions.size() - 1; i >= 0; i--)
        {
            android.support.v7.widget.RecyclerView.ViewHolder viewholder = (android.support.v7.widget.RecyclerView.ViewHolder)mPendingShuffleAdditions.get(i);
            reset(viewholder.itemView);
            dispatchAddFinished(viewholder);
            mPendingShuffleAdditions.remove(i);
        }

        for (int j = mAdditionsList.size() - 1; j >= 0; j--)
        {
            ArrayList arraylist = (ArrayList)mAdditionsList.get(j);
            for (int l = arraylist.size() - 1; l >= 0; l--)
            {
                android.support.v7.widget.RecyclerView.ViewHolder viewholder1 = (android.support.v7.widget.RecyclerView.ViewHolder)arraylist.get(l);
                reset(viewholder1.itemView);
                dispatchAddFinished(viewholder1);
                arraylist.remove(l);
                if (arraylist.isEmpty())
                {
                    mAdditionsList.remove(arraylist);
                }
            }

        }

        ArrayList arraylist1 = mRunningAddAnimations;
        for (int k = arraylist1.size() - 1; k >= 0; k--)
        {
            ((android.support.v7.widget.RecyclerView.ViewHolder)arraylist1.get(k)).itemView.animate().cancel();
        }

        super.endAnimations();
    }

    public final boolean isRunning()
    {
        return super.isRunning() || !mPendingShuffleAdditions.isEmpty() || !mAdditionsList.isEmpty();
    }

    public final void runPendingAnimations()
    {
        for (Iterator iterator = mPendingDefaultAdditions.iterator(); iterator.hasNext(); super.animateAdd((android.support.v7.widget.RecyclerView.ViewHolder)iterator.next())) { }
        mPendingDefaultAdditions.clear();
        super.runPendingAnimations();
        if (!mPendingShuffleAdditions.isEmpty())
        {
            ArrayList arraylist = new ArrayList(mPendingShuffleAdditions);
            mAdditionsList.add(arraylist);
            mPendingShuffleAdditions.clear();
            mHasPendingShuffle = false;
            for (Iterator iterator1 = arraylist.iterator(); iterator1.hasNext();)
            {
                final android.support.v7.widget.RecyclerView.ViewHolder holder = (android.support.v7.widget.RecyclerView.ViewHolder)iterator1.next();
                final View view = holder.itemView;
                final ViewPropertyAnimator animation = (ViewGroup)view.getParent();
                if (animation == null)
                {
                    dispatchAddFinished(holder);
                } else
                {
                    mRunningAddAnimations.add(holder);
                    animation = ShuffleAnimation.shuffleAnimator$256b5262(view, animation);
                    animation.setListener(new AnimatorListenerAdapter() {

                        final ShuffleAddItemAnimator this$0;
                        final ViewPropertyAnimator val$animation;
                        final android.support.v7.widget.RecyclerView.ViewHolder val$holder;
                        final View val$view;

                        public final void onAnimationCancel(Animator animator)
                        {
                            ShuffleAddItemAnimator.reset(view);
                        }

                        public final void onAnimationEnd(Animator animator)
                        {
                            animation.setListener(null);
                            dispatchAddFinished(holder);
                            mRunningAddAnimations.remove(holder);
                            dispatchFinishedWhenDone();
                        }

                        public final void onAnimationStart(Animator animator)
                        {
                            view.setAlpha(1.0F);
                        }

            
            {
                this$0 = ShuffleAddItemAnimator.this;
                view = view1;
                holder = viewholder;
                animation = viewpropertyanimator;
                super();
            }
                    }).start();
                }
            }

            arraylist.clear();
            mAdditionsList.remove(arraylist);
        }
    }

}
