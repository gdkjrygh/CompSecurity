// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
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
            if (mTerminated || mPlayingSet.size() != 0 || mListeners == null) goto _L2; else goto _L1
_L1:
            int i;
            int j;
            j = mListeners.size();
            i = 0;
_L5:
            if (i < j) goto _L3; else goto _L2
_L2:
            return;
_L3:
            ((Animator.AnimatorListener)mListeners.get(i)).onAnimationCancel(mAnimatorSet);
            i++;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public void onAnimationEnd(Animator animator)
        {
            animator.removeListener(this);
            mPlayingSet.remove(animator);
            ((Node)mAnimatorSet.mNodeMap.get(animator)).done = true;
            if (mTerminated) goto _L2; else goto _L1
_L1:
            int i;
            int j;
            int k;
            animator = mAnimatorSet.mSortedNodes;
            j = 1;
            k = animator.size();
            i = 0;
_L6:
            if (i >= k)
            {
                i = j;
            } else
            {
label0:
                {
                    if (((Node)animator.get(i)).done)
                    {
                        break label0;
                    }
                    i = 0;
                }
            }
            if (i == 0) goto _L2; else goto _L3
_L3:
            if (mListeners == null) goto _L5; else goto _L4
_L4:
            animator = (ArrayList)mListeners.clone();
            j = animator.size();
            i = 0;
_L7:
            if (i < j)
            {
                break MISSING_BLOCK_LABEL_146;
            }
_L5:
            mAnimatorSet.mStarted = false;
_L2:
            return;
            i++;
              goto _L6
            ((Animator.AnimatorListener)animator.get(i)).onAnimationEnd(mAnimatorSet);
            i++;
              goto _L7
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
            Dependency dependency = null;
            int j = mNode.tmpDependencies.size();
            int i = 0;
            do
            {
                if (i < j)
                {
label0:
                    {
                        Dependency dependency1 = (Dependency)mNode.tmpDependencies.get(i);
                        if (dependency1.rule != mRule || dependency1.node.animation != animator)
                        {
                            break label0;
                        }
                        dependency = dependency1;
                        animator.removeListener(this);
                    }
                }
                mNode.tmpDependencies.remove(dependency);
                if (mNode.tmpDependencies.size() == 0)
                {
                    mNode.animation.start();
                    mAnimatorSet.mPlayingSet.add(mNode.animation);
                    return;
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
        if (!mNeedsSort) goto _L2; else goto _L1
_L1:
        Object obj;
        int i;
        int j;
        mSortedNodes.clear();
        obj = new ArrayList();
        j = mNodes.size();
        i = 0;
_L8:
        if (i < j) goto _L4; else goto _L3
_L3:
        Object obj1 = new ArrayList();
_L9:
        if (((ArrayList) (obj)).size() > 0) goto _L6; else goto _L5
_L5:
        mNeedsSort = false;
        if (mSortedNodes.size() != mNodes.size())
        {
            throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
        }
          goto _L7
_L4:
        obj1 = (Node)mNodes.get(i);
        if (((Node) (obj1)).dependencies == null || ((Node) (obj1)).dependencies.size() == 0)
        {
            ((ArrayList) (obj)).add(obj1);
        }
        i++;
          goto _L8
_L6:
        int k;
        k = ((ArrayList) (obj)).size();
        i = 0;
_L12:
label0:
        {
            if (i < k)
            {
                break label0;
            }
            ((ArrayList) (obj)).clear();
            ((ArrayList) (obj)).addAll(((Collection) (obj1)));
            ((ArrayList) (obj1)).clear();
        }
          goto _L9
        Node node;
        node = (Node)((ArrayList) (obj)).get(i);
        mSortedNodes.add(node);
        if (node.nodeDependents == null) goto _L11; else goto _L10
_L10:
        int l;
        l = node.nodeDependents.size();
        j = 0;
_L13:
        if (j < l)
        {
            break MISSING_BLOCK_LABEL_220;
        }
_L11:
        i++;
          goto _L12
        Node node1 = (Node)node.nodeDependents.get(j);
        node1.nodeDependencies.remove(node);
        if (node1.nodeDependencies.size() == 0)
        {
            ((ArrayList) (obj1)).add(node1);
        }
        j++;
          goto _L13
_L2:
        k = mNodes.size();
        i = 0;
_L17:
        if (i < k) goto _L14; else goto _L7
_L7:
        return;
_L14:
        obj = (Node)mNodes.get(i);
        if (((Node) (obj)).dependencies == null || ((Node) (obj)).dependencies.size() <= 0) goto _L16; else goto _L15
_L15:
        l = ((Node) (obj)).dependencies.size();
        j = 0;
_L18:
        if (j < l)
        {
            break MISSING_BLOCK_LABEL_354;
        }
_L16:
        obj.done = false;
        i++;
          goto _L17
        Dependency dependency = (Dependency)((Node) (obj)).dependencies.get(j);
        if (((Node) (obj)).nodeDependencies == null)
        {
            obj.nodeDependencies = new ArrayList();
        }
        if (!((Node) (obj)).nodeDependencies.contains(dependency.node))
        {
            ((Node) (obj)).nodeDependencies.add(dependency.node);
        }
        j++;
          goto _L18
    }

    public void cancel()
    {
        mTerminated = true;
        if (!isStarted()) goto _L2; else goto _L1
_L1:
        Object obj = null;
        if (mListeners == null) goto _L4; else goto _L3
_L3:
        Iterator iterator;
        obj = (ArrayList)mListeners.clone();
        iterator = ((ArrayList) (obj)).iterator();
_L7:
        if (iterator.hasNext()) goto _L5; else goto _L4
_L4:
        if (mDelayAnim != null && mDelayAnim.isRunning())
        {
            mDelayAnim.cancel();
        } else
        if (mSortedNodes.size() > 0)
        {
            Iterator iterator1 = mSortedNodes.iterator();
            while (iterator1.hasNext()) 
            {
                ((Node)iterator1.next()).animation.cancel();
            }
        }
        if (obj != null)
        {
            for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Animator.AnimatorListener)((Iterator) (obj)).next()).onAnimationEnd(this))
            {
                break MISSING_BLOCK_LABEL_157;
            }

        }
        mStarted = false;
_L2:
        return;
_L5:
        ((Animator.AnimatorListener)iterator.next()).onAnimationCancel(this);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public volatile Animator clone()
    {
        return clone();
    }

    public AnimatorSet clone()
    {
        AnimatorSet animatorset;
        HashMap hashmap;
        Iterator iterator;
        animatorset = (AnimatorSet)super.clone();
        animatorset.mNeedsSort = true;
        animatorset.mTerminated = false;
        animatorset.mStarted = false;
        animatorset.mPlayingSet = new ArrayList();
        animatorset.mNodeMap = new HashMap();
        animatorset.mNodes = new ArrayList();
        animatorset.mSortedNodes = new ArrayList();
        hashmap = new HashMap();
        iterator = mNodes.iterator();
_L4:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = mNodes.iterator();
_L6:
        if (!((Iterator) (obj)).hasNext())
        {
            return animatorset;
        }
        break MISSING_BLOCK_LABEL_295;
_L2:
        ArrayList arraylist;
        obj = (Node)iterator.next();
        Node node = ((Node) (obj)).clone();
        hashmap.put(obj, node);
        animatorset.mNodes.add(node);
        animatorset.mNodeMap.put(node.animation, node);
        node.dependencies = null;
        node.tmpDependencies = null;
        node.nodeDependents = null;
        node.nodeDependencies = null;
        arraylist = node.animation.getListeners();
        if (arraylist == null) goto _L4; else goto _L3
_L3:
        Iterator iterator1;
        obj = null;
        iterator1 = arraylist.iterator();
_L5:
label0:
        {
            if (iterator1.hasNext())
            {
                break label0;
            }
            if (obj != null)
            {
                obj = ((ArrayList) (obj)).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    arraylist.remove((Animator.AnimatorListener)((Iterator) (obj)).next());
                }
            }
        }
          goto _L4
        Animator.AnimatorListener animatorlistener = (Animator.AnimatorListener)iterator1.next();
        if (animatorlistener instanceof AnimatorSetListener)
        {
            Object obj1 = obj;
            if (obj == null)
            {
                obj1 = new ArrayList();
            }
            ((ArrayList) (obj1)).add(animatorlistener);
            obj = obj1;
        }
          goto _L5
        Object obj2 = (Node)((Iterator) (obj)).next();
        Node node1 = (Node)hashmap.get(obj2);
        if (((Node) (obj2)).dependencies != null)
        {
            obj2 = ((Node) (obj2)).dependencies.iterator();
            while (((Iterator) (obj2)).hasNext()) 
            {
                Dependency dependency = (Dependency)((Iterator) (obj2)).next();
                node1.addDependency(new Dependency((Node)hashmap.get(dependency.node), dependency.rule));
            }
        }
          goto _L6
    }

    public void end()
    {
        mTerminated = true;
        if (!isStarted()) goto _L2; else goto _L1
_L1:
        if (mSortedNodes.size() == mNodes.size()) goto _L4; else goto _L3
_L3:
        Iterator iterator;
        sortNodes();
        iterator = mSortedNodes.iterator();
_L7:
        if (iterator.hasNext()) goto _L5; else goto _L4
_L4:
        if (mDelayAnim != null)
        {
            mDelayAnim.cancel();
        }
        if (mSortedNodes.size() > 0)
        {
            Node node;
            for (iterator = mSortedNodes.iterator(); iterator.hasNext(); ((Node)iterator.next()).animation.end())
            {
                break MISSING_BLOCK_LABEL_171;
            }

        }
        if (mListeners != null)
        {
            for (iterator = ((ArrayList)mListeners.clone()).iterator(); iterator.hasNext(); ((Animator.AnimatorListener)iterator.next()).onAnimationEnd(this))
            {
                break MISSING_BLOCK_LABEL_189;
            }

        }
        mStarted = false;
_L2:
        return;
_L5:
        node = (Node)iterator.next();
        if (mSetListener == null)
        {
            mSetListener = new AnimatorSetListener(this);
        }
        node.animation.addListener(mSetListener);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public ArrayList getChildAnimations()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = mNodes.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return arraylist;
            }
            arraylist.add(((Node)iterator.next()).animation);
        } while (true);
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
        Iterator iterator = mNodes.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return false;
            }
        } while (!((Node)iterator.next()).animation.isRunning());
        return true;
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
        if (collection == null || collection.size() <= 0) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        mNeedsSort = true;
        Object obj = null;
        iterator = collection.iterator();
        collection = obj;
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        Animator animator = (Animator)iterator.next();
        if (collection == null)
        {
            collection = play(animator);
        } else
        {
            collection.with(animator);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public transient void playTogether(Animator aanimator[])
    {
        if (aanimator == null) goto _L2; else goto _L1
_L1:
        Builder builder;
        int i;
        mNeedsSort = true;
        builder = play(aanimator[0]);
        i = 1;
_L5:
        if (i < aanimator.length) goto _L3; else goto _L2
_L2:
        return;
_L3:
        builder.with(aanimator[i]);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
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
        Iterator iterator = mNodes.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                mDuration = l;
                return this;
            }
            ((Node)iterator.next()).animation.setDuration(l);
        } while (true);
    }

    public void setInterpolator(Interpolator interpolator)
    {
        Iterator iterator = mNodes.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((Node)iterator.next()).animation.setInterpolator(interpolator);
        } while (true);
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
                return;
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
        Iterator iterator = mNodes.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((Node)iterator.next()).animation.setupEndValues();
        } while (true);
    }

    public void setupStartValues()
    {
        Iterator iterator = mNodes.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((Node)iterator.next()).animation.setupStartValues();
        } while (true);
    }

    public void start()
    {
        int i;
        int k;
        mTerminated = false;
        mStarted = true;
        sortNodes();
        k = mSortedNodes.size();
        i = 0;
_L17:
        if (i < k) goto _L2; else goto _L1
_L1:
        final Object nodesToStart;
        nodesToStart = new ArrayList();
        i = 0;
_L21:
        if (i < k) goto _L4; else goto _L3
_L3:
        if (mStartDelay > 0L) goto _L6; else goto _L5
_L5:
        nodesToStart = ((ArrayList) (nodesToStart)).iterator();
_L24:
        if (((Iterator) (nodesToStart)).hasNext()) goto _L8; else goto _L7
_L7:
        if (mListeners == null) goto _L10; else goto _L9
_L9:
        int j;
        nodesToStart = (ArrayList)mListeners.clone();
        j = ((ArrayList) (nodesToStart)).size();
        i = 0;
_L25:
        if (i < j) goto _L11; else goto _L10
_L10:
        if (mNodes.size() != 0 || mStartDelay != 0L) goto _L13; else goto _L12
_L12:
        mStarted = false;
        if (mListeners == null) goto _L13; else goto _L14
_L14:
        nodesToStart = (ArrayList)mListeners.clone();
        j = ((ArrayList) (nodesToStart)).size();
        i = 0;
_L26:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_533;
        }
_L13:
        return;
_L2:
        Object obj;
        nodesToStart = (Node)mSortedNodes.get(i);
        obj = ((Node) (nodesToStart)).animation.getListeners();
        if (obj == null || ((ArrayList) (obj)).size() <= 0) goto _L16; else goto _L15
_L15:
        obj = (new ArrayList(((Collection) (obj)))).iterator();
_L18:
        if (((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_229;
        }
_L16:
        i++;
          goto _L17
        Animator.AnimatorListener animatorlistener = (Animator.AnimatorListener)((Iterator) (obj)).next();
        if ((animatorlistener instanceof DependencyListener) || (animatorlistener instanceof AnimatorSetListener))
        {
            ((Node) (nodesToStart)).animation.removeListener(animatorlistener);
        }
          goto _L18
_L4:
        obj = (Node)mSortedNodes.get(i);
        if (mSetListener == null)
        {
            mSetListener = new AnimatorSetListener(this);
        }
        if (((Node) (obj)).dependencies != null && ((Node) (obj)).dependencies.size() != 0) goto _L20; else goto _L19
_L19:
        ((ArrayList) (nodesToStart)).add(obj);
_L22:
        ((Node) (obj)).animation.addListener(mSetListener);
        i++;
          goto _L21
_L20:
        int l;
        l = ((Node) (obj)).dependencies.size();
        j = 0;
_L23:
label0:
        {
            if (j < l)
            {
                break label0;
            }
            obj.tmpDependencies = (ArrayList)((Node) (obj)).dependencies.clone();
        }
          goto _L22
        Dependency dependency = (Dependency)((Node) (obj)).dependencies.get(j);
        dependency.node.animation.addListener(new DependencyListener(this, ((Node) (obj)), dependency.rule));
        j++;
          goto _L23
_L8:
        Node node = (Node)((Iterator) (nodesToStart)).next();
        node.animation.start();
        mPlayingSet.add(node.animation);
          goto _L24
_L6:
        mDelayAnim = ValueAnimator.ofFloat(new float[] {
            0.0F, 1.0F
        });
        mDelayAnim.setDuration(mStartDelay);
        mDelayAnim.addListener(new AnimatorListenerAdapter() {

            boolean canceled;
            final AnimatorSet this$0;
            private final ArrayList val$nodesToStart;

            public void onAnimationCancel(Animator animator)
            {
                canceled = true;
            }

            public void onAnimationEnd(Animator animator)
            {
                if (canceled) goto _L2; else goto _L1
_L1:
                int i1;
                int j1;
                j1 = nodesToStart.size();
                i1 = 0;
_L5:
                if (i1 < j1) goto _L3; else goto _L2
_L2:
                return;
_L3:
                animator = (Node)nodesToStart.get(i1);
                ((Node) (animator)).animation.start();
                mPlayingSet.add(((Node) (animator)).animation);
                i1++;
                if (true) goto _L5; else goto _L4
_L4:
            }

            
            {
                this$0 = AnimatorSet.this;
                nodesToStart = arraylist;
                super();
                canceled = false;
            }
        });
        mDelayAnim.start();
          goto _L7
_L11:
        ((Animator.AnimatorListener)((ArrayList) (nodesToStart)).get(i)).onAnimationStart(this);
        i++;
          goto _L25
        ((Animator.AnimatorListener)((ArrayList) (nodesToStart)).get(i)).onAnimationEnd(this);
        i++;
          goto _L26
    }





}
