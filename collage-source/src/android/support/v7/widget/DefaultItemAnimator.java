// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.animation.AnimatorCompatHelper;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            SimpleItemAnimator

public class DefaultItemAnimator extends SimpleItemAnimator
{
    private static class ChangeInfo
    {

        public int fromX;
        public int fromY;
        public RecyclerView.ViewHolder newHolder;
        public RecyclerView.ViewHolder oldHolder;
        public int toX;
        public int toY;

        public String toString()
        {
            return (new StringBuilder()).append("ChangeInfo{oldHolder=").append(oldHolder).append(", newHolder=").append(newHolder).append(", fromX=").append(fromX).append(", fromY=").append(fromY).append(", toX=").append(toX).append(", toY=").append(toY).append('}').toString();
        }

        private ChangeInfo(RecyclerView.ViewHolder viewholder, RecyclerView.ViewHolder viewholder1)
        {
            oldHolder = viewholder;
            newHolder = viewholder1;
        }

        private ChangeInfo(RecyclerView.ViewHolder viewholder, RecyclerView.ViewHolder viewholder1, int i, int j, int k, int l)
        {
            this(viewholder, viewholder1);
            fromX = i;
            fromY = j;
            toX = k;
            toY = l;
        }

    }

    private static class MoveInfo
    {

        public int fromX;
        public int fromY;
        public RecyclerView.ViewHolder holder;
        public int toX;
        public int toY;

        private MoveInfo(RecyclerView.ViewHolder viewholder, int i, int j, int k, int l)
        {
            holder = viewholder;
            fromX = i;
            fromY = j;
            toX = k;
            toY = l;
        }

    }

    private static class VpaListenerAdapter
        implements ViewPropertyAnimatorListener
    {

        public void onAnimationCancel(View view)
        {
        }

        public void onAnimationEnd(View view)
        {
        }

        public void onAnimationStart(View view)
        {
        }

        private VpaListenerAdapter()
        {
        }

    }


    private static final boolean DEBUG = false;
    private ArrayList mAddAnimations;
    private ArrayList mAdditionsList;
    private ArrayList mChangeAnimations;
    private ArrayList mChangesList;
    private ArrayList mMoveAnimations;
    private ArrayList mMovesList;
    private ArrayList mPendingAdditions;
    private ArrayList mPendingChanges;
    private ArrayList mPendingMoves;
    private ArrayList mPendingRemovals;
    private ArrayList mRemoveAnimations;

    public DefaultItemAnimator()
    {
        mPendingRemovals = new ArrayList();
        mPendingAdditions = new ArrayList();
        mPendingMoves = new ArrayList();
        mPendingChanges = new ArrayList();
        mAdditionsList = new ArrayList();
        mMovesList = new ArrayList();
        mChangesList = new ArrayList();
        mAddAnimations = new ArrayList();
        mMoveAnimations = new ArrayList();
        mRemoveAnimations = new ArrayList();
        mChangeAnimations = new ArrayList();
    }

    private void animateAddImpl(final RecyclerView.ViewHolder holder)
    {
        final ViewPropertyAnimatorCompat animation = ViewCompat.animate(holder.itemView);
        mAddAnimations.add(holder);
        animation.alpha(1.0F).setDuration(getAddDuration()).setListener(new VpaListenerAdapter() {

            final DefaultItemAnimator this$0;
            final ViewPropertyAnimatorCompat val$animation;
            final RecyclerView.ViewHolder val$holder;

            public void onAnimationCancel(View view)
            {
                ViewCompat.setAlpha(view, 1.0F);
            }

            public void onAnimationEnd(View view)
            {
                animation.setListener(null);
                dispatchAddFinished(holder);
                mAddAnimations.remove(holder);
                dispatchFinishedWhenDone();
            }

            public void onAnimationStart(View view)
            {
                dispatchAddStarting(holder);
            }

            
            {
                this$0 = DefaultItemAnimator.this;
                holder = viewholder;
                animation = viewpropertyanimatorcompat;
                super();
            }
        }).start();
    }

    private void animateChangeImpl(final ChangeInfo changeInfo)
    {
        final View newView = null;
        final Object oldViewAnim = changeInfo.oldHolder;
        RecyclerView.ViewHolder viewholder;
        if (oldViewAnim == null)
        {
            oldViewAnim = null;
        } else
        {
            oldViewAnim = ((RecyclerView.ViewHolder) (oldViewAnim)).itemView;
        }
        viewholder = changeInfo.newHolder;
        if (viewholder != null)
        {
            newView = viewholder.itemView;
        }
        if (oldViewAnim != null)
        {
            oldViewAnim = ViewCompat.animate(((View) (oldViewAnim))).setDuration(getChangeDuration());
            mChangeAnimations.add(changeInfo.oldHolder);
            ((ViewPropertyAnimatorCompat) (oldViewAnim)).translationX(changeInfo.toX - changeInfo.fromX);
            ((ViewPropertyAnimatorCompat) (oldViewAnim)).translationY(changeInfo.toY - changeInfo.fromY);
            ((ViewPropertyAnimatorCompat) (oldViewAnim)).alpha(0.0F).setListener(new VpaListenerAdapter() {

                final DefaultItemAnimator this$0;
                final ChangeInfo val$changeInfo;
                final ViewPropertyAnimatorCompat val$oldViewAnim;

                public void onAnimationEnd(View view)
                {
                    oldViewAnim.setListener(null);
                    ViewCompat.setAlpha(view, 1.0F);
                    ViewCompat.setTranslationX(view, 0.0F);
                    ViewCompat.setTranslationY(view, 0.0F);
                    dispatchChangeFinished(changeInfo.oldHolder, true);
                    mChangeAnimations.remove(changeInfo.oldHolder);
                    dispatchFinishedWhenDone();
                }

                public void onAnimationStart(View view)
                {
                    dispatchChangeStarting(changeInfo.oldHolder, true);
                }

            
            {
                this$0 = DefaultItemAnimator.this;
                changeInfo = changeinfo;
                oldViewAnim = viewpropertyanimatorcompat;
                super();
            }
            }).start();
        }
        if (newView != null)
        {
            oldViewAnim = ViewCompat.animate(newView);
            mChangeAnimations.add(changeInfo.newHolder);
            ((ViewPropertyAnimatorCompat) (oldViewAnim)).translationX(0.0F).translationY(0.0F).setDuration(getChangeDuration()).alpha(1.0F).setListener(new VpaListenerAdapter() {

                final DefaultItemAnimator this$0;
                final ChangeInfo val$changeInfo;
                final View val$newView;
                final ViewPropertyAnimatorCompat val$newViewAnimation;

                public void onAnimationEnd(View view)
                {
                    newViewAnimation.setListener(null);
                    ViewCompat.setAlpha(newView, 1.0F);
                    ViewCompat.setTranslationX(newView, 0.0F);
                    ViewCompat.setTranslationY(newView, 0.0F);
                    dispatchChangeFinished(changeInfo.newHolder, false);
                    mChangeAnimations.remove(changeInfo.newHolder);
                    dispatchFinishedWhenDone();
                }

                public void onAnimationStart(View view)
                {
                    dispatchChangeStarting(changeInfo.newHolder, false);
                }

            
            {
                this$0 = DefaultItemAnimator.this;
                changeInfo = changeinfo;
                newViewAnimation = viewpropertyanimatorcompat;
                newView = view;
                super();
            }
            }).start();
        }
    }

    private void animateMoveImpl(final RecyclerView.ViewHolder holder, final int deltaX, final int deltaY, int i, int j)
    {
        final ViewPropertyAnimatorCompat animation = holder.itemView;
        deltaX = i - deltaX;
        deltaY = j - deltaY;
        if (deltaX != 0)
        {
            ViewCompat.animate(animation).translationX(0.0F);
        }
        if (deltaY != 0)
        {
            ViewCompat.animate(animation).translationY(0.0F);
        }
        animation = ViewCompat.animate(animation);
        mMoveAnimations.add(holder);
        animation.setDuration(getMoveDuration()).setListener(new VpaListenerAdapter() {

            final DefaultItemAnimator this$0;
            final ViewPropertyAnimatorCompat val$animation;
            final int val$deltaX;
            final int val$deltaY;
            final RecyclerView.ViewHolder val$holder;

            public void onAnimationCancel(View view)
            {
                if (deltaX != 0)
                {
                    ViewCompat.setTranslationX(view, 0.0F);
                }
                if (deltaY != 0)
                {
                    ViewCompat.setTranslationY(view, 0.0F);
                }
            }

            public void onAnimationEnd(View view)
            {
                animation.setListener(null);
                dispatchMoveFinished(holder);
                mMoveAnimations.remove(holder);
                dispatchFinishedWhenDone();
            }

            public void onAnimationStart(View view)
            {
                dispatchMoveStarting(holder);
            }

            
            {
                this$0 = DefaultItemAnimator.this;
                holder = viewholder;
                deltaX = i;
                deltaY = j;
                animation = viewpropertyanimatorcompat;
                super();
            }
        }).start();
    }

    private void animateRemoveImpl(final RecyclerView.ViewHolder holder)
    {
        final ViewPropertyAnimatorCompat animation = ViewCompat.animate(holder.itemView);
        mRemoveAnimations.add(holder);
        animation.setDuration(getRemoveDuration()).alpha(0.0F).setListener(new VpaListenerAdapter() {

            final DefaultItemAnimator this$0;
            final ViewPropertyAnimatorCompat val$animation;
            final RecyclerView.ViewHolder val$holder;

            public void onAnimationEnd(View view)
            {
                animation.setListener(null);
                ViewCompat.setAlpha(view, 1.0F);
                dispatchRemoveFinished(holder);
                mRemoveAnimations.remove(holder);
                dispatchFinishedWhenDone();
            }

            public void onAnimationStart(View view)
            {
                dispatchRemoveStarting(holder);
            }

            
            {
                this$0 = DefaultItemAnimator.this;
                holder = viewholder;
                animation = viewpropertyanimatorcompat;
                super();
            }
        }).start();
    }

    private void dispatchFinishedWhenDone()
    {
        if (!isRunning())
        {
            dispatchAnimationsFinished();
        }
    }

    private void endChangeAnimation(List list, RecyclerView.ViewHolder viewholder)
    {
        for (int i = list.size() - 1; i >= 0; i--)
        {
            ChangeInfo changeinfo = (ChangeInfo)list.get(i);
            if (endChangeAnimationIfNecessary(changeinfo, viewholder) && changeinfo.oldHolder == null && changeinfo.newHolder == null)
            {
                list.remove(changeinfo);
            }
        }

    }

    private void endChangeAnimationIfNecessary(ChangeInfo changeinfo)
    {
        if (changeinfo.oldHolder != null)
        {
            endChangeAnimationIfNecessary(changeinfo, changeinfo.oldHolder);
        }
        if (changeinfo.newHolder != null)
        {
            endChangeAnimationIfNecessary(changeinfo, changeinfo.newHolder);
        }
    }

    private boolean endChangeAnimationIfNecessary(ChangeInfo changeinfo, RecyclerView.ViewHolder viewholder)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        if (changeinfo.newHolder != viewholder) goto _L2; else goto _L1
_L1:
        changeinfo.newHolder = null;
_L6:
        ViewCompat.setAlpha(viewholder.itemView, 1.0F);
        ViewCompat.setTranslationX(viewholder.itemView, 0.0F);
        ViewCompat.setTranslationY(viewholder.itemView, 0.0F);
        dispatchChangeFinished(viewholder, flag);
        flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (changeinfo.oldHolder != viewholder) goto _L4; else goto _L3
_L3:
        changeinfo.oldHolder = null;
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void resetAnimation(RecyclerView.ViewHolder viewholder)
    {
        AnimatorCompatHelper.clearInterpolator(viewholder.itemView);
        endAnimation(viewholder);
    }

    public boolean animateAdd(RecyclerView.ViewHolder viewholder)
    {
        resetAnimation(viewholder);
        ViewCompat.setAlpha(viewholder.itemView, 0.0F);
        mPendingAdditions.add(viewholder);
        return true;
    }

    public boolean animateChange(RecyclerView.ViewHolder viewholder, RecyclerView.ViewHolder viewholder1, int i, int j, int k, int l)
    {
        if (viewholder == viewholder1)
        {
            return animateMove(viewholder, i, j, k, l);
        }
        float f = ViewCompat.getTranslationX(viewholder.itemView);
        float f1 = ViewCompat.getTranslationY(viewholder.itemView);
        float f2 = ViewCompat.getAlpha(viewholder.itemView);
        resetAnimation(viewholder);
        int i1 = (int)((float)(k - i) - f);
        int j1 = (int)((float)(l - j) - f1);
        ViewCompat.setTranslationX(viewholder.itemView, f);
        ViewCompat.setTranslationY(viewholder.itemView, f1);
        ViewCompat.setAlpha(viewholder.itemView, f2);
        if (viewholder1 != null)
        {
            resetAnimation(viewholder1);
            ViewCompat.setTranslationX(viewholder1.itemView, -i1);
            ViewCompat.setTranslationY(viewholder1.itemView, -j1);
            ViewCompat.setAlpha(viewholder1.itemView, 0.0F);
        }
        mPendingChanges.add(new ChangeInfo(viewholder, viewholder1, i, j, k, l));
        return true;
    }

    public boolean animateMove(RecyclerView.ViewHolder viewholder, int i, int j, int k, int l)
    {
        View view = viewholder.itemView;
        i = (int)((float)i + ViewCompat.getTranslationX(viewholder.itemView));
        j = (int)((float)j + ViewCompat.getTranslationY(viewholder.itemView));
        resetAnimation(viewholder);
        int i1 = k - i;
        int j1 = l - j;
        if (i1 == 0 && j1 == 0)
        {
            dispatchMoveFinished(viewholder);
            return false;
        }
        if (i1 != 0)
        {
            ViewCompat.setTranslationX(view, -i1);
        }
        if (j1 != 0)
        {
            ViewCompat.setTranslationY(view, -j1);
        }
        mPendingMoves.add(new MoveInfo(viewholder, i, j, k, l));
        return true;
    }

    public boolean animateRemove(RecyclerView.ViewHolder viewholder)
    {
        resetAnimation(viewholder);
        mPendingRemovals.add(viewholder);
        return true;
    }

    void cancelAll(List list)
    {
        for (int i = list.size() - 1; i >= 0; i--)
        {
            ViewCompat.animate(((RecyclerView.ViewHolder)list.get(i)).itemView).cancel();
        }

    }

    public void endAnimation(RecyclerView.ViewHolder viewholder)
    {
        View view = viewholder.itemView;
        ViewCompat.animate(view).cancel();
        for (int i = mPendingMoves.size() - 1; i >= 0; i--)
        {
            if (((MoveInfo)mPendingMoves.get(i)).holder == viewholder)
            {
                ViewCompat.setTranslationY(view, 0.0F);
                ViewCompat.setTranslationX(view, 0.0F);
                dispatchMoveFinished(viewholder);
                mPendingMoves.remove(i);
            }
        }

        endChangeAnimation(mPendingChanges, viewholder);
        if (mPendingRemovals.remove(viewholder))
        {
            ViewCompat.setAlpha(view, 1.0F);
            dispatchRemoveFinished(viewholder);
        }
        if (mPendingAdditions.remove(viewholder))
        {
            ViewCompat.setAlpha(view, 1.0F);
            dispatchAddFinished(viewholder);
        }
        for (int j = mChangesList.size() - 1; j >= 0; j--)
        {
            ArrayList arraylist = (ArrayList)mChangesList.get(j);
            endChangeAnimation(arraylist, viewholder);
            if (arraylist.isEmpty())
            {
                mChangesList.remove(j);
            }
        }

        int k = mMovesList.size() - 1;
label0:
        do
        {
            if (k >= 0)
            {
                ArrayList arraylist1 = (ArrayList)mMovesList.get(k);
                int i1 = arraylist1.size() - 1;
                do
                {
label1:
                    {
                        if (i1 >= 0)
                        {
                            if (((MoveInfo)arraylist1.get(i1)).holder != viewholder)
                            {
                                break label1;
                            }
                            ViewCompat.setTranslationY(view, 0.0F);
                            ViewCompat.setTranslationX(view, 0.0F);
                            dispatchMoveFinished(viewholder);
                            arraylist1.remove(i1);
                            if (arraylist1.isEmpty())
                            {
                                mMovesList.remove(k);
                            }
                        }
                        k--;
                        continue label0;
                    }
                    i1--;
                } while (true);
            }
            for (int l = mAdditionsList.size() - 1; l >= 0; l--)
            {
                ArrayList arraylist2 = (ArrayList)mAdditionsList.get(l);
                if (!arraylist2.remove(viewholder))
                {
                    continue;
                }
                ViewCompat.setAlpha(view, 1.0F);
                dispatchAddFinished(viewholder);
                if (arraylist2.isEmpty())
                {
                    mAdditionsList.remove(l);
                }
            }

            if (!mRemoveAnimations.remove(viewholder));
            if (!mAddAnimations.remove(viewholder));
            if (!mChangeAnimations.remove(viewholder));
            if (!mMoveAnimations.remove(viewholder));
            dispatchFinishedWhenDone();
            return;
        } while (true);
    }

    public void endAnimations()
    {
        for (int i = mPendingMoves.size() - 1; i >= 0; i--)
        {
            MoveInfo moveinfo = (MoveInfo)mPendingMoves.get(i);
            View view = moveinfo.holder.itemView;
            ViewCompat.setTranslationY(view, 0.0F);
            ViewCompat.setTranslationX(view, 0.0F);
            dispatchMoveFinished(moveinfo.holder);
            mPendingMoves.remove(i);
        }

        for (int j = mPendingRemovals.size() - 1; j >= 0; j--)
        {
            dispatchRemoveFinished((RecyclerView.ViewHolder)mPendingRemovals.get(j));
            mPendingRemovals.remove(j);
        }

        for (int k = mPendingAdditions.size() - 1; k >= 0; k--)
        {
            RecyclerView.ViewHolder viewholder = (RecyclerView.ViewHolder)mPendingAdditions.get(k);
            ViewCompat.setAlpha(viewholder.itemView, 1.0F);
            dispatchAddFinished(viewholder);
            mPendingAdditions.remove(k);
        }

        for (int l = mPendingChanges.size() - 1; l >= 0; l--)
        {
            endChangeAnimationIfNecessary((ChangeInfo)mPendingChanges.get(l));
        }

        mPendingChanges.clear();
        if (!isRunning())
        {
            return;
        }
        for (int i1 = mMovesList.size() - 1; i1 >= 0; i1--)
        {
            ArrayList arraylist = (ArrayList)mMovesList.get(i1);
            for (int l1 = arraylist.size() - 1; l1 >= 0; l1--)
            {
                MoveInfo moveinfo1 = (MoveInfo)arraylist.get(l1);
                View view1 = moveinfo1.holder.itemView;
                ViewCompat.setTranslationY(view1, 0.0F);
                ViewCompat.setTranslationX(view1, 0.0F);
                dispatchMoveFinished(moveinfo1.holder);
                arraylist.remove(l1);
                if (arraylist.isEmpty())
                {
                    mMovesList.remove(arraylist);
                }
            }

        }

        for (int j1 = mAdditionsList.size() - 1; j1 >= 0; j1--)
        {
            ArrayList arraylist1 = (ArrayList)mAdditionsList.get(j1);
            for (int i2 = arraylist1.size() - 1; i2 >= 0; i2--)
            {
                RecyclerView.ViewHolder viewholder1 = (RecyclerView.ViewHolder)arraylist1.get(i2);
                ViewCompat.setAlpha(viewholder1.itemView, 1.0F);
                dispatchAddFinished(viewholder1);
                arraylist1.remove(i2);
                if (arraylist1.isEmpty())
                {
                    mAdditionsList.remove(arraylist1);
                }
            }

        }

        for (int k1 = mChangesList.size() - 1; k1 >= 0; k1--)
        {
            ArrayList arraylist2 = (ArrayList)mChangesList.get(k1);
            for (int j2 = arraylist2.size() - 1; j2 >= 0; j2--)
            {
                endChangeAnimationIfNecessary((ChangeInfo)arraylist2.get(j2));
                if (arraylist2.isEmpty())
                {
                    mChangesList.remove(arraylist2);
                }
            }

        }

        cancelAll(mRemoveAnimations);
        cancelAll(mMoveAnimations);
        cancelAll(mAddAnimations);
        cancelAll(mChangeAnimations);
        dispatchAnimationsFinished();
    }

    public boolean isRunning()
    {
        return !mPendingAdditions.isEmpty() || !mPendingChanges.isEmpty() || !mPendingMoves.isEmpty() || !mPendingRemovals.isEmpty() || !mMoveAnimations.isEmpty() || !mRemoveAnimations.isEmpty() || !mAddAnimations.isEmpty() || !mChangeAnimations.isEmpty() || !mMovesList.isEmpty() || !mAdditionsList.isEmpty() || !mChangesList.isEmpty();
    }

    public void runPendingAnimations()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (!mPendingRemovals.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!mPendingMoves.isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!mPendingChanges.isEmpty())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!mPendingAdditions.isEmpty())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag || flag1 || flag3 || flag2)
        {
            for (Iterator iterator = mPendingRemovals.iterator(); iterator.hasNext(); animateRemoveImpl((RecyclerView.ViewHolder)iterator.next())) { }
            mPendingRemovals.clear();
            Runnable runnable;
            if (flag1)
            {
                final ArrayList moves = new ArrayList();
                moves.addAll(mPendingMoves);
                mMovesList.add(moves);
                mPendingMoves.clear();
                runnable = new Runnable() {

                    final DefaultItemAnimator this$0;
                    final ArrayList val$moves;

                    public void run()
                    {
                        MoveInfo moveinfo;
                        for (Iterator iterator1 = moves.iterator(); iterator1.hasNext(); animateMoveImpl(moveinfo.holder, moveinfo.fromX, moveinfo.fromY, moveinfo.toX, moveinfo.toY))
                        {
                            moveinfo = (MoveInfo)iterator1.next();
                        }

                        moves.clear();
                        mMovesList.remove(moves);
                    }

            
            {
                this$0 = DefaultItemAnimator.this;
                moves = arraylist;
                super();
            }
                };
                final ArrayList changes;
                final ArrayList additions;
                if (flag)
                {
                    ViewCompat.postOnAnimationDelayed(((MoveInfo)moves.get(0)).holder.itemView, runnable, getRemoveDuration());
                } else
                {
                    runnable.run();
                }
            }
            if (flag2)
            {
                changes = new ArrayList();
                changes.addAll(mPendingChanges);
                mChangesList.add(changes);
                mPendingChanges.clear();
                runnable = new Runnable() {

                    final DefaultItemAnimator this$0;
                    final ArrayList val$changes;

                    public void run()
                    {
                        ChangeInfo changeinfo;
                        for (Iterator iterator1 = changes.iterator(); iterator1.hasNext(); animateChangeImpl(changeinfo))
                        {
                            changeinfo = (ChangeInfo)iterator1.next();
                        }

                        changes.clear();
                        mChangesList.remove(changes);
                    }

            
            {
                this$0 = DefaultItemAnimator.this;
                changes = arraylist;
                super();
            }
                };
                if (flag)
                {
                    ViewCompat.postOnAnimationDelayed(((ChangeInfo)changes.get(0)).oldHolder.itemView, runnable, getRemoveDuration());
                } else
                {
                    runnable.run();
                }
            }
            if (flag3)
            {
                additions = new ArrayList();
                additions.addAll(mPendingAdditions);
                mAdditionsList.add(additions);
                mPendingAdditions.clear();
                runnable = new Runnable() {

                    final DefaultItemAnimator this$0;
                    final ArrayList val$additions;

                    public void run()
                    {
                        RecyclerView.ViewHolder viewholder;
                        for (Iterator iterator1 = additions.iterator(); iterator1.hasNext(); animateAddImpl(viewholder))
                        {
                            viewholder = (RecyclerView.ViewHolder)iterator1.next();
                        }

                        additions.clear();
                        mAdditionsList.remove(additions);
                    }

            
            {
                this$0 = DefaultItemAnimator.this;
                additions = arraylist;
                super();
            }
                };
                if (flag || flag1 || flag2)
                {
                    long l;
                    long l1;
                    long l2;
                    if (flag)
                    {
                        l = getRemoveDuration();
                    } else
                    {
                        l = 0L;
                    }
                    if (flag1)
                    {
                        l1 = getMoveDuration();
                    } else
                    {
                        l1 = 0L;
                    }
                    if (flag2)
                    {
                        l2 = getChangeDuration();
                    } else
                    {
                        l2 = 0L;
                    }
                    l1 = Math.max(l1, l2);
                    ViewCompat.postOnAnimationDelayed(((RecyclerView.ViewHolder)additions.get(0)).itemView, runnable, l + l1);
                    return;
                } else
                {
                    runnable.run();
                    return;
                }
            }
        }
    }











}
