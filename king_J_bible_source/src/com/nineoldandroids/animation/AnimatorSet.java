// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.nineoldandroids.animation:
//            Animator, ValueAnimator, ObjectAnimator, AnimatorListenerAdapter

public final class AnimatorSet extends Animator
{
    private class AnimatorSetListener
        implements Animator.AnimatorListener
    {

        private AnimatorSet mAnimatorSet;
        final AnimatorSet this$0;

        public void onAnimationCancel(Animator animator)
        {
            if (!mTerminated && mPlayingSet.size() == 0 && mListeners != null)
            {
                int j = mListeners.size();
                for (int i = 0; i < j; i++)
                {
                    ((Animator.AnimatorListener)mListeners.get(i)).onAnimationCancel(mAnimatorSet);
                }

            }
        }

        public void onAnimationEnd(Animator animator)
        {
label0:
            {
                animator.removeListener(this);
                mPlayingSet.remove(animator);
                ((Node)mAnimatorSet.mNodeMap.get(animator)).done = true;
                if (mTerminated)
                {
                    break label0;
                }
                animator = mAnimatorSet.mSortedNodes;
                boolean flag1 = true;
                int k = animator.size();
                int i = 0;
label1:
                do
                {
label2:
                    {
                        boolean flag = flag1;
                        if (i < k)
                        {
                            if (((Node)animator.get(i)).done)
                            {
                                break label2;
                            }
                            flag = false;
                        }
                        if (!flag)
                        {
                            break label0;
                        }
                        if (mListeners != null)
                        {
                            animator = (ArrayList)mListeners.clone();
                            int j = animator.size();
                            for (i = 0; i < j; i++)
                            {
                                ((Animator.AnimatorListener)animator.get(i)).onAnimationEnd(mAnimatorSet);
                            }

                        }
                        break label1;
                    }
                    i++;
                } while (true);
                mAnimatorSet.mStarted = false;
            }
        }

        public void onAnimationRepeat(Animator animator)
        {
        }

        public void onAnimationStart(Animator animator)
        {
        }

        AnimatorSetListener(AnimatorSet animatorset1)
        {
            this$0 = AnimatorSet.this;
            super();
            mAnimatorSet = animatorset1;
        }
    }

    public class Builder
    {

        private Node mCurrentNode;
        final AnimatorSet this$0;

        public Builder after(long l)
        {
            ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
                0.0F, 1.0F
            });
            valueanimator.setDuration(l);
            after(((Animator) (valueanimator)));
            return this;
        }

        public Builder after(Animator animator)
        {
            Node node1 = (Node)mNodeMap.get(animator);
            Node node = node1;
            if (node1 == null)
            {
                node = new Node(animator);
                mNodeMap.put(animator, node);
                mNodes.add(node);
            }
            animator = new Dependency(node, 1);
            mCurrentNode.addDependency(animator);
            return this;
        }

        public Builder before(Animator animator)
        {
            Node node1 = (Node)mNodeMap.get(animator);
            Node node = node1;
            if (node1 == null)
            {
                node = new Node(animator);
                mNodeMap.put(animator, node);
                mNodes.add(node);
            }
            node.addDependency(new Dependency(mCurrentNode, 1));
            return this;
        }

        public Builder with(Animator animator)
        {
            Node node1 = (Node)mNodeMap.get(animator);
            Node node = node1;
            if (node1 == null)
            {
                node = new Node(animator);
                mNodeMap.put(animator, node);
                mNodes.add(node);
            }
            node.addDependency(new Dependency(mCurrentNode, 0));
            return this;
        }

        Builder(Animator animator)
        {
            this$0 = AnimatorSet.this;
            super();
            mCurrentNode = (Node)mNodeMap.get(animator);
            if (mCurrentNode == null)
            {
                mCurrentNode = new Node(animator);
                mNodeMap.put(animator, mCurrentNode);
                mNodes.add(mCurrentNode);
            }
        }
    }

    private static class Dependency
    {

        static final int AFTER = 1;
        static final int WITH = 0;
        public Node node;
        public int rule;

        public Dependency(Node node1, int i)
        {
            node = node1;
            rule = i;
        }
    }

    private static class DependencyListener
        implements Animator.AnimatorListener
    {

        private AnimatorSet mAnimatorSet;
        private Node mNode;
        private int mRule;

        private void startIfReady(Animator animator)
        {
            if (!mAnimatorSet.mTerminated) goto _L2; else goto _L1
_L1:
            return;
_L2:
            Object obj = null;
            int j = mNode.tmpDependencies.size();
            int i = 0;
            do
            {
label0:
                {
                    Dependency dependency = obj;
                    if (i < j)
                    {
                        dependency = (Dependency)mNode.tmpDependencies.get(i);
                        if (dependency.rule != mRule || dependency.node.animation != animator)
                        {
                            break label0;
                        }
                        animator.removeListener(this);
                    }
                    mNode.tmpDependencies.remove(dependency);
                    if (mNode.tmpDependencies.size() == 0)
                    {
                        mNode.animation.start();
                        mAnimatorSet.mPlayingSet.add(mNode.animation);
                        return;
                    }
                }
                if (true)
                {
                    continue;
                }
                i++;
            } while (true);
            if (true) goto _L1; else goto _L3
_L3:
        }

        public void onAnimationCancel(Animator animator)
        {
        }

        public void onAnimationEnd(Animator animator)
        {
            if (mRule == 1)
            {
                startIfReady(animator);
            }
        }

        public void onAnimationRepeat(Animator animator)
        {
        }

        public void onAnimationStart(Animator animator)
        {
            if (mRule == 0)
            {
                startIfReady(animator);
            }
        }

        public DependencyListener(AnimatorSet animatorset, Node node, int i)
        {
            mAnimatorSet = animatorset;
            mNode = node;
            mRule = i;
        }
    }

    private static class Node
        implements Cloneable
    {

        public Animator animation;
        public ArrayList dependencies;
        public boolean done;
        public ArrayList nodeDependencies;
        public ArrayList nodeDependents;
        public ArrayList tmpDependencies;

        public void addDependency(Dependency dependency)
        {
            if (dependencies == null)
            {
                dependencies = new ArrayList();
                nodeDependencies = new ArrayList();
            }
            dependencies.add(dependency);
            if (!nodeDependencies.contains(dependency.node))
            {
                nodeDependencies.add(dependency.node);
            }
            dependency = dependency.node;
            if (((Node) (dependency)).nodeDependents == null)
            {
                dependency.nodeDependents = new ArrayList();
            }
            ((Node) (dependency)).nodeDependents.add(this);
        }

        public Node clone()
        {
            Node node;
            try
            {
                node = (Node)super.clone();
                node.animation = animation.clone();
            }
            catch (CloneNotSupportedException clonenotsupportedexception)
            {
                throw new AssertionError();
            }
            return node;
        }

        public volatile Object clone()
            throws CloneNotSupportedException
        {
            return clone();
        }

        public Node(Animator animator)
        {
            dependencies = null;
            tmpDependencies = null;
            nodeDependencies = null;
            nodeDependents = null;
            done = false;
            animation = animator;
        }
    }


    private ValueAnimator mDelayAnim;
    private long mDuration;
    private boolean mNeedsSort;
    private HashMap mNodeMap;
    private ArrayList mNodes;
    private ArrayList mPlayingSet;
    private AnimatorSetListener mSetListener;
    private ArrayList mSortedNodes;
    private long mStartDelay;
    private boolean mStarted;
    boolean mTerminated;

    public AnimatorSet()
    {
        mPlayingSet = new ArrayList();
        mNodeMap = new HashMap();
        mNodes = new ArrayList();
        mSortedNodes = new ArrayList();
        mNeedsSort = true;
        mSetListener = null;
        mTerminated = false;
        mStarted = false;
        mStartDelay = 0L;
        mDelayAnim = null;
        mDuration = -1L;
    }

    private void sortNodes()
    {
        if (mNeedsSort)
        {
            mSortedNodes.clear();
            ArrayList arraylist = new ArrayList();
            int l = mNodes.size();
            for (int i = 0; i < l; i++)
            {
                Node node1 = (Node)mNodes.get(i);
                if (node1.dependencies == null || node1.dependencies.size() == 0)
                {
                    arraylist.add(node1);
                }
            }

            ArrayList arraylist1 = new ArrayList();
            for (; arraylist.size() > 0; arraylist1.clear())
            {
                int k1 = arraylist.size();
                for (int j = 0; j < k1; j++)
                {
                    Node node2 = (Node)arraylist.get(j);
                    mSortedNodes.add(node2);
                    if (node2.nodeDependents == null)
                    {
                        continue;
                    }
                    int i2 = node2.nodeDependents.size();
                    for (int i1 = 0; i1 < i2; i1++)
                    {
                        Node node3 = (Node)node2.nodeDependents.get(i1);
                        node3.nodeDependencies.remove(node2);
                        if (node3.nodeDependencies.size() == 0)
                        {
                            arraylist1.add(node3);
                        }
                    }

                }

                arraylist.clear();
                arraylist.addAll(arraylist1);
            }

            mNeedsSort = false;
            if (mSortedNodes.size() != mNodes.size())
            {
                throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
            }
        } else
        {
            int l1 = mNodes.size();
            for (int k = 0; k < l1; k++)
            {
                Node node = (Node)mNodes.get(k);
                if (node.dependencies != null && node.dependencies.size() > 0)
                {
                    int j2 = node.dependencies.size();
                    for (int j1 = 0; j1 < j2; j1++)
                    {
                        Dependency dependency = (Dependency)node.dependencies.get(j1);
                        if (node.nodeDependencies == null)
                        {
                            node.nodeDependencies = new ArrayList();
                        }
                        if (!node.nodeDependencies.contains(dependency.node))
                        {
                            node.nodeDependencies.add(dependency.node);
                        }
                    }

                }
                node.done = false;
            }

        }
    }

    public void cancel()
    {
        Object obj;
        mTerminated = true;
        if (!isStarted())
        {
            break MISSING_BLOCK_LABEL_176;
        }
        obj = null;
        if (mListeners != null)
        {
            ArrayList arraylist = (ArrayList)mListeners.clone();
            Iterator iterator1 = arraylist.iterator();
            do
            {
                obj = arraylist;
                if (!iterator1.hasNext())
                {
                    break;
                }
                ((Animator.AnimatorListener)iterator1.next()).onAnimationCancel(this);
            } while (true);
        }
        if (mDelayAnim == null || !mDelayAnim.isRunning()) goto _L2; else goto _L1
_L1:
        mDelayAnim.cancel();
_L4:
        if (obj != null)
        {
            for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Animator.AnimatorListener)((Iterator) (obj)).next()).onAnimationEnd(this)) { }
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (mSortedNodes.size() > 0)
        {
            Iterator iterator = mSortedNodes.iterator();
            while (iterator.hasNext()) 
            {
                ((Node)iterator.next()).animation.cancel();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        mStarted = false;
    }

    public volatile Animator clone()
    {
        return clone();
    }

    public AnimatorSet clone()
    {
        AnimatorSet animatorset = (AnimatorSet)super.clone();
        animatorset.mNeedsSort = true;
        animatorset.mTerminated = false;
        animatorset.mStarted = false;
        animatorset.mPlayingSet = new ArrayList();
        animatorset.mNodeMap = new HashMap();
        animatorset.mNodes = new ArrayList();
        animatorset.mSortedNodes = new ArrayList();
        HashMap hashmap = new HashMap();
        Iterator iterator1 = mNodes.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Node node = (Node)iterator1.next();
            Node node1 = node.clone();
            hashmap.put(node, node1);
            animatorset.mNodes.add(node1);
            animatorset.mNodeMap.put(node1.animation, node1);
            node1.dependencies = null;
            node1.tmpDependencies = null;
            node1.nodeDependents = null;
            node1.nodeDependencies = null;
            ArrayList arraylist1 = node1.animation.getListeners();
            if (arraylist1 != null)
            {
                Object obj = null;
                Iterator iterator2 = arraylist1.iterator();
                do
                {
                    if (!iterator2.hasNext())
                    {
                        break;
                    }
                    Animator.AnimatorListener animatorlistener = (Animator.AnimatorListener)iterator2.next();
                    if (animatorlistener instanceof AnimatorSetListener)
                    {
                        ArrayList arraylist = ((ArrayList) (obj));
                        if (obj == null)
                        {
                            arraylist = new ArrayList();
                        }
                        arraylist.add(animatorlistener);
                        obj = arraylist;
                    }
                } while (true);
                if (obj != null)
                {
                    obj = ((ArrayList) (obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        arraylist1.remove((Animator.AnimatorListener)((Iterator) (obj)).next());
                    }
                }
            }
        } while (true);
        Iterator iterator = mNodes.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = (Node)iterator.next();
            Node node2 = (Node)hashmap.get(obj1);
            if (((Node) (obj1)).dependencies != null)
            {
                obj1 = ((Node) (obj1)).dependencies.iterator();
                while (((Iterator) (obj1)).hasNext()) 
                {
                    Dependency dependency = (Dependency)((Iterator) (obj1)).next();
                    node2.addDependency(new Dependency((Node)hashmap.get(dependency.node), dependency.rule));
                }
            }
        } while (true);
        return animatorset;
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public void end()
    {
        mTerminated = true;
        if (isStarted())
        {
            if (mSortedNodes.size() != mNodes.size())
            {
                sortNodes();
                Node node;
                for (Iterator iterator = mSortedNodes.iterator(); iterator.hasNext(); node.animation.addListener(mSetListener))
                {
                    node = (Node)iterator.next();
                    if (mSetListener == null)
                    {
                        mSetListener = new AnimatorSetListener(this);
                    }
                }

            }
            if (mDelayAnim != null)
            {
                mDelayAnim.cancel();
            }
            if (mSortedNodes.size() > 0)
            {
                for (Iterator iterator1 = mSortedNodes.iterator(); iterator1.hasNext(); ((Node)iterator1.next()).animation.end()) { }
            }
            if (mListeners != null)
            {
                for (Iterator iterator2 = ((ArrayList)mListeners.clone()).iterator(); iterator2.hasNext(); ((Animator.AnimatorListener)iterator2.next()).onAnimationEnd(this)) { }
            }
            mStarted = false;
        }
    }

    public ArrayList getChildAnimations()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = mNodes.iterator(); iterator.hasNext(); arraylist.add(((Node)iterator.next()).animation)) { }
        return arraylist;
    }

    public long getDuration()
    {
        return mDuration;
    }

    public long getStartDelay()
    {
        return mStartDelay;
    }

    public boolean isRunning()
    {
        for (Iterator iterator = mNodes.iterator(); iterator.hasNext();)
        {
            if (((Node)iterator.next()).animation.isRunning())
            {
                return true;
            }
        }

        return false;
    }

    public boolean isStarted()
    {
        return mStarted;
    }

    public Builder play(Animator animator)
    {
        if (animator != null)
        {
            mNeedsSort = true;
            return new Builder(animator);
        } else
        {
            return null;
        }
    }

    public void playSequentially(List list)
    {
        if (list != null && list.size() > 0)
        {
            mNeedsSort = true;
            if (list.size() == 1)
            {
                play((Animator)list.get(0));
            } else
            {
                int i = 0;
                while (i < list.size() - 1) 
                {
                    play((Animator)list.get(i)).before((Animator)list.get(i + 1));
                    i++;
                }
            }
        }
    }

    public transient void playSequentially(Animator aanimator[])
    {
        if (aanimator != null)
        {
            mNeedsSort = true;
            if (aanimator.length == 1)
            {
                play(aanimator[0]);
            } else
            {
                int i = 0;
                while (i < aanimator.length - 1) 
                {
                    play(aanimator[i]).before(aanimator[i + 1]);
                    i++;
                }
            }
        }
    }

    public void playTogether(Collection collection)
    {
        if (collection != null && collection.size() > 0)
        {
            mNeedsSort = true;
            Object obj = null;
            Iterator iterator = collection.iterator();
            collection = obj;
            while (iterator.hasNext()) 
            {
                Animator animator = (Animator)iterator.next();
                if (collection == null)
                {
                    collection = play(animator);
                } else
                {
                    collection.with(animator);
                }
            }
        }
    }

    public transient void playTogether(Animator aanimator[])
    {
        if (aanimator != null)
        {
            mNeedsSort = true;
            Builder builder = play(aanimator[0]);
            for (int i = 1; i < aanimator.length; i++)
            {
                builder.with(aanimator[i]);
            }

        }
    }

    public volatile Animator setDuration(long l)
    {
        return setDuration(l);
    }

    public AnimatorSet setDuration(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("duration must be a value of zero or greater");
        }
        for (Iterator iterator = mNodes.iterator(); iterator.hasNext(); ((Node)iterator.next()).animation.setDuration(l)) { }
        mDuration = l;
        return this;
    }

    public void setInterpolator(Interpolator interpolator)
    {
        for (Iterator iterator = mNodes.iterator(); iterator.hasNext(); ((Node)iterator.next()).animation.setInterpolator(interpolator)) { }
    }

    public void setStartDelay(long l)
    {
        mStartDelay = l;
    }

    public void setTarget(Object obj)
    {
        Iterator iterator = mNodes.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Animator animator = ((Node)iterator.next()).animation;
            if (animator instanceof AnimatorSet)
            {
                ((AnimatorSet)animator).setTarget(obj);
            } else
            if (animator instanceof ObjectAnimator)
            {
                ((ObjectAnimator)animator).setTarget(obj);
            }
        } while (true);
    }

    public void setupEndValues()
    {
        for (Iterator iterator = mNodes.iterator(); iterator.hasNext(); ((Node)iterator.next()).animation.setupEndValues()) { }
    }

    public void setupStartValues()
    {
        for (Iterator iterator = mNodes.iterator(); iterator.hasNext(); ((Node)iterator.next()).animation.setupStartValues()) { }
    }

    public void start()
    {
        mTerminated = false;
        mStarted = true;
        sortNodes();
        int l1 = mSortedNodes.size();
label0:
        for (int i = 0; i < l1; i++)
        {
            Node node = (Node)mSortedNodes.get(i);
            Object obj = node.animation.getListeners();
            if (obj == null || ((ArrayList) (obj)).size() <= 0)
            {
                continue;
            }
            obj = (new ArrayList(((Collection) (obj)))).iterator();
            do
            {
                Animator.AnimatorListener animatorlistener;
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        continue label0;
                    }
                    animatorlistener = (Animator.AnimatorListener)((Iterator) (obj)).next();
                } while (!(animatorlistener instanceof DependencyListener) && !(animatorlistener instanceof AnimatorSetListener));
                node.animation.removeListener(animatorlistener);
            } while (true);
        }

        final Object nodesToStart = new ArrayList();
        int j = 0;
        while (j < l1) 
        {
            Node node1 = (Node)mSortedNodes.get(j);
            if (mSetListener == null)
            {
                mSetListener = new AnimatorSetListener(this);
            }
            if (node1.dependencies == null || node1.dependencies.size() == 0)
            {
                ((ArrayList) (nodesToStart)).add(node1);
            } else
            {
                int i2 = node1.dependencies.size();
                for (int i1 = 0; i1 < i2; i1++)
                {
                    Dependency dependency = (Dependency)node1.dependencies.get(i1);
                    dependency.node.animation.addListener(new DependencyListener(this, node1, dependency.rule));
                }

                node1.tmpDependencies = (ArrayList)node1.dependencies.clone();
            }
            node1.animation.addListener(mSetListener);
            j++;
        }
        if (mStartDelay <= 0L)
        {
            Node node2;
            for (nodesToStart = ((ArrayList) (nodesToStart)).iterator(); ((Iterator) (nodesToStart)).hasNext(); mPlayingSet.add(node2.animation))
            {
                node2 = (Node)((Iterator) (nodesToStart)).next();
                node2.animation.start();
            }

        } else
        {
            mDelayAnim = ValueAnimator.ofFloat(new float[] {
                0.0F, 1.0F
            });
            mDelayAnim.setDuration(mStartDelay);
            mDelayAnim.addListener(new AnimatorListenerAdapter() {

                boolean canceled;
                final AnimatorSet this$0;
                final ArrayList val$nodesToStart;

                public void onAnimationCancel(Animator animator)
                {
                    canceled = true;
                }

                public void onAnimationEnd(Animator animator)
                {
                    if (!canceled)
                    {
                        int k2 = nodesToStart.size();
                        for (int j2 = 0; j2 < k2; j2++)
                        {
                            animator = (Node)nodesToStart.get(j2);
                            ((Node) (animator)).animation.start();
                            mPlayingSet.add(((Node) (animator)).animation);
                        }

                    }
                }

            
            {
                this$0 = AnimatorSet.this;
                nodesToStart = arraylist;
                super();
                canceled = false;
            }
            });
            mDelayAnim.start();
        }
        if (mListeners != null)
        {
            ArrayList arraylist = (ArrayList)mListeners.clone();
            int j1 = arraylist.size();
            for (int k = 0; k < j1; k++)
            {
                ((Animator.AnimatorListener)arraylist.get(k)).onAnimationStart(this);
            }

        }
        if (mNodes.size() == 0 && mStartDelay == 0L)
        {
            mStarted = false;
            if (mListeners != null)
            {
                ArrayList arraylist1 = (ArrayList)mListeners.clone();
                int k1 = arraylist1.size();
                for (int l = 0; l < k1; l++)
                {
                    ((Animator.AnimatorListener)arraylist1.get(l)).onAnimationEnd(this);
                }

            }
        }
    }





/*
    static boolean access$302(AnimatorSet animatorset, boolean flag)
    {
        animatorset.mStarted = flag;
        return flag;
    }

*/

}
