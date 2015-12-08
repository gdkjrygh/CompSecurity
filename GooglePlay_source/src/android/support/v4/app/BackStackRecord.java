// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.util.ArrayMap;
import android.support.v4.util.MapCollections;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package android.support.v4.app:
//            FragmentTransaction, Fragment, FragmentTransitionCompat21, FragmentManagerImpl, 
//            FragmentContainer

final class BackStackRecord extends FragmentTransaction
    implements Runnable
{
    private class TransitionState
    {

        public FragmentTransitionCompat21.EpicenterView enteringEpicenterView;
        public ArrayList hiddenFragmentViews;
        public ArrayMap nameOverrides;
        public View nonExistentView;
        final BackStackRecord this$0;

        public TransitionState()
        {
            this$0 = BackStackRecord.this;
            super();
            nameOverrides = new ArrayMap();
            hiddenFragmentViews = new ArrayList();
            enteringEpicenterView = new FragmentTransitionCompat21.EpicenterView();
        }
    }

    static final class Op
    {

        int cmd;
        int enterAnim;
        int exitAnim;
        Fragment fragment;
        Op next;
        int popEnterAnim;
        int popExitAnim;
        Op prev;
        ArrayList removed;

        Op()
        {
        }
    }


    static final boolean SUPPORTS_TRANSITIONS;
    boolean mAddToBackStack;
    boolean mAllowAddToBackStack;
    int mBreadCrumbShortTitleRes;
    CharSequence mBreadCrumbShortTitleText;
    int mBreadCrumbTitleRes;
    CharSequence mBreadCrumbTitleText;
    boolean mCommitted;
    Op mHead;
    int mIndex;
    final FragmentManagerImpl mManager;
    String mName;
    int mNumOp;
    ArrayList mSharedElementSourceNames;
    ArrayList mSharedElementTargetNames;
    Op mTail;
    int mTransition;
    int mTransitionStyle;

    public BackStackRecord(FragmentManagerImpl fragmentmanagerimpl)
    {
        mAllowAddToBackStack = true;
        mIndex = -1;
        mManager = fragmentmanagerimpl;
    }

    private TransitionState beginTransition(SparseArray sparsearray, SparseArray sparsearray1, boolean flag)
    {
        TransitionState transitionstate = new TransitionState();
        transitionstate.nonExistentView = new View(mManager.mActivity);
        boolean flag1 = false;
        for (int i = 0; i < sparsearray.size(); i++)
        {
            if (configureTransitions(sparsearray.keyAt(i), transitionstate, flag, sparsearray, sparsearray1))
            {
                flag1 = true;
            }
        }

        for (int j = 0; j < sparsearray1.size();)
        {
            int k = sparsearray1.keyAt(j);
            boolean flag2 = flag1;
            if (sparsearray.get(k) == null)
            {
                flag2 = flag1;
                if (configureTransitions(k, transitionstate, flag, sparsearray, sparsearray1))
                {
                    flag2 = true;
                }
            }
            j++;
            flag1 = flag2;
        }

        sparsearray = transitionstate;
        if (!flag1)
        {
            sparsearray = null;
        }
        return sparsearray;
    }

    private void calculateFragments(SparseArray sparsearray, SparseArray sparsearray1)
    {
        if (mManager.mContainer.hasView()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Op op = mHead;
_L12:
        if (op == null) goto _L1; else goto _L3
_L3:
        op.cmd;
        JVM INSTR tableswitch 1 7: default 76
    //                   1 86
    //                   2 98
    //                   3 216
    //                   4 228
    //                   5 240
    //                   6 252
    //                   7 264;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L4:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_264;
_L13:
        op = op.next;
          goto _L12
_L5:
        setLastIn(sparsearray1, op.fragment);
          goto _L13
_L6:
        Fragment fragment = op.fragment;
        Fragment fragment1 = fragment;
        if (mManager.mAdded != null)
        {
            int i = 0;
label0:
            do
            {
label1:
                {
                    fragment1 = fragment;
                    if (i >= mManager.mAdded.size())
                    {
                        break label0;
                    }
                    Fragment fragment2 = (Fragment)mManager.mAdded.get(i);
                    if (fragment != null)
                    {
                        fragment1 = fragment;
                        if (fragment2.mContainerId != fragment.mContainerId)
                        {
                            break label1;
                        }
                    }
                    if (fragment2 == fragment)
                    {
                        fragment1 = null;
                    } else
                    {
                        setFirstOut(sparsearray, fragment2);
                        fragment1 = fragment;
                    }
                }
                i++;
                fragment = fragment1;
            } while (true);
        }
        setLastIn(sparsearray1, fragment1);
          goto _L13
_L7:
        setFirstOut(sparsearray, op.fragment);
          goto _L13
_L8:
        setFirstOut(sparsearray, op.fragment);
          goto _L13
_L9:
        setLastIn(sparsearray1, op.fragment);
          goto _L13
_L10:
        setFirstOut(sparsearray, op.fragment);
          goto _L13
        setLastIn(sparsearray1, op.fragment);
          goto _L13
    }

    private static Object captureExitingViews(Object obj, Fragment fragment, ArrayList arraylist, ArrayMap arraymap, View view)
    {
label0:
        {
            Object obj1 = obj;
            if (obj != null)
            {
                fragment = fragment.mView;
                obj1 = obj;
                if (obj != null)
                {
                    FragmentTransitionCompat21.captureTransitioningViews(arraylist, fragment);
                    if (arraymap != null)
                    {
                        arraylist.removeAll(arraymap.values());
                    }
                    if (!arraylist.isEmpty())
                    {
                        break label0;
                    }
                    obj1 = null;
                }
            }
            return obj1;
        }
        arraylist.add(view);
        FragmentTransitionCompat21.addTargets((Transition)obj, arraylist);
        return obj;
    }

    private int commitInternal(boolean flag)
    {
        if (mCommitted)
        {
            throw new IllegalStateException("commit already called");
        }
        mCommitted = true;
        if (mAddToBackStack)
        {
            mIndex = mManager.allocBackStackIndex(this);
        } else
        {
            mIndex = -1;
        }
        mManager.enqueueAction(this, flag);
        return mIndex;
    }

    private boolean configureTransitions(final int containerId, final TransitionState state, final boolean isBack, SparseArray sparsearray, final SparseArray sharedElementTransition)
    {
        final ViewGroup sceneRoot = (ViewGroup)mManager.mContainer.findViewById(containerId);
        if (sceneRoot == null)
        {
            return false;
        }
        final Fragment inFragment = (Fragment)sharedElementTransition.get(containerId);
        final Fragment outFragment = (Fragment)sparsearray.get(containerId);
        Object obj;
        if (inFragment == null)
        {
            sparsearray = null;
        } else
        {
            if (isBack && inFragment.mReenterTransition != Fragment.USE_DEFAULT_TRANSITION)
            {
                sparsearray = ((SparseArray) (inFragment.mReenterTransition));
            } else
            {
                sparsearray = null;
            }
            sparsearray = ((SparseArray) (FragmentTransitionCompat21.cloneTransition(sparsearray)));
        }
        if (inFragment == null || outFragment == null)
        {
            sharedElementTransition = null;
        } else
        {
            if (isBack && outFragment.mSharedElementReturnTransition != Fragment.USE_DEFAULT_TRANSITION)
            {
                sharedElementTransition = ((SparseArray) (outFragment.mSharedElementReturnTransition));
            } else
            {
                sharedElementTransition = null;
            }
            sharedElementTransition = ((SparseArray) (FragmentTransitionCompat21.cloneTransition(sharedElementTransition)));
        }
        if (outFragment == null)
        {
            obj = null;
        } else
        {
            if (isBack && outFragment.mReturnTransition != Fragment.USE_DEFAULT_TRANSITION)
            {
                obj = outFragment.mReturnTransition;
            } else
            {
                obj = null;
            }
            obj = FragmentTransitionCompat21.cloneTransition(obj);
        }
        if (sparsearray == null && sharedElementTransition == null && obj == null)
        {
            return false;
        }
        Object obj1 = null;
        final ArrayList sharedElementTargets = new ArrayList();
        if (sharedElementTransition != null)
        {
            obj1 = remapSharedElements(state, outFragment, isBack);
            sharedElementTargets.add(state.nonExistentView);
            sharedElementTargets.addAll(((ArrayMap) (obj1)).values());
        }
        ArrayList arraylist = new ArrayList();
        obj = captureExitingViews(obj, outFragment, arraylist, ((ArrayMap) (obj1)), state.nonExistentView);
        if (mSharedElementTargetNames != null && obj1 != null)
        {
            obj1 = (View)((ArrayMap) (obj1)).get(mSharedElementTargetNames.get(0));
            if (obj1 != null)
            {
                if (obj != null)
                {
                    FragmentTransitionCompat21.setEpicenter(obj, ((View) (obj1)));
                }
                if (sharedElementTransition != null)
                {
                    FragmentTransitionCompat21.setEpicenter(sharedElementTransition, ((View) (obj1)));
                }
            }
        }
        Object obj2 = new FragmentTransitionCompat21.ViewRetriever() {

            final BackStackRecord this$0;
            final Fragment val$inFragment;

            public final View getView()
            {
                return inFragment.mView;
            }

            
            {
                this$0 = BackStackRecord.this;
                inFragment = fragment;
                super();
            }
        };
        if (sharedElementTransition != null)
        {
            sceneRoot.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

                final BackStackRecord this$0;
                final Fragment val$inFragment;
                final boolean val$isBack;
                final Fragment val$outFragment;
                final View val$sceneRoot;
                final ArrayList val$sharedElementTargets;
                final Object val$sharedElementTransition;
                final TransitionState val$state;

                public final boolean onPreDraw()
                {
                    sceneRoot.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (sharedElementTransition != null)
                    {
                        FragmentTransitionCompat21.removeTargets(sharedElementTransition, sharedElementTargets);
                        sharedElementTargets.clear();
                        ArrayMap arraymap = ArrayMap arraymap = new ArrayMap();
                        sharedElementTargets.add(state.nonExistentView);
                        sharedElementTargets.addAll(arraymap.values());
                        FragmentTransitionCompat21.addTargets(sharedElementTransition, sharedElementTargets);
                        BackStackRecord.access$100(BackStackRecord.this, arraymap, state);
                        BackStackRecord.access$200$4a5f5891(inFragment, outFragment, isBack, arraymap);
                    }
                    return true;
                }

            
            {
                this$0 = BackStackRecord.this;
                sceneRoot = view;
                sharedElementTransition = obj;
                sharedElementTargets = arraylist;
                state = transitionstate;
                isBack = flag;
                inFragment = fragment;
                outFragment = fragment1;
                super();
            }
            });
        }
        obj1 = new ArrayList();
        inFragment = new ArrayMap();
        Object obj3 = (Transition)sparsearray;
        Object obj4 = (Transition)obj;
        Object obj5 = (Transition)sharedElementTransition;
        final TransitionSet transition = new TransitionSet();
        if (obj3 != null)
        {
            transition.addTransition(((Transition) (obj3)));
        }
        if (obj4 != null)
        {
            transition.addTransition(((Transition) (obj4)));
        }
        if (obj5 != null)
        {
            transition.addTransition(((Transition) (obj5)));
        }
        obj3 = state.nonExistentView;
        obj4 = state.enteringEpicenterView;
        obj5 = state.nameOverrides;
        if (sparsearray != null || sharedElementTransition != null)
        {
            Transition transition1 = (Transition)sparsearray;
            if (transition1 != null)
            {
                transition1.addTarget(((View) (obj3)));
            }
            if (sharedElementTransition != null)
            {
                FragmentTransitionCompat21.addTargets((Transition)sharedElementTransition, sharedElementTargets);
            }
            sceneRoot.getViewTreeObserver().addOnPreDrawListener(new FragmentTransitionCompat21._cls2(sceneRoot, ((FragmentTransitionCompat21.ViewRetriever) (obj2)), ((Map) (obj5)), inFragment, transition1, ((ArrayList) (obj1)), ((View) (obj3))));
            if (transition1 != null)
            {
                transition1.setEpicenterCallback(new FragmentTransitionCompat21._cls3(((FragmentTransitionCompat21.EpicenterView) (obj4))));
            }
        }
        sceneRoot.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

            final BackStackRecord this$0;
            final int val$containerId;
            final View val$sceneRoot;
            final TransitionState val$state;
            final Object val$transition;

            public final boolean onPreDraw()
            {
                sceneRoot.getViewTreeObserver().removeOnPreDrawListener(this);
                excludeHiddenFragments(state, containerId, transition);
                return true;
            }

            
            {
                this$0 = BackStackRecord.this;
                sceneRoot = view;
                state = transitionstate;
                containerId = i;
                transition = obj;
                super();
            }
        });
        FragmentTransitionCompat21.excludeTarget(transition, state.nonExistentView, true);
        excludeHiddenFragments(state, containerId, transition);
        TransitionManager.beginDelayedTransition(sceneRoot, (Transition)transition);
        obj2 = state.nonExistentView;
        state = state.hiddenFragmentViews;
        sparsearray = (Transition)sparsearray;
        obj = (Transition)obj;
        sharedElementTransition = (Transition)sharedElementTransition;
        transition = (Transition)transition;
        sceneRoot.getViewTreeObserver().addOnPreDrawListener(new FragmentTransitionCompat21._cls4(sceneRoot, sparsearray, ((View) (obj2)), ((ArrayList) (obj1)), ((Transition) (obj)), arraylist, sharedElementTransition, sharedElementTargets, inFragment, state, transition));
        return true;
    }

    private void doAddOp(int i, Fragment fragment, String s, int j)
    {
        fragment.mFragmentManager = mManager;
        if (s != null)
        {
            if (fragment.mTag != null && !s.equals(fragment.mTag))
            {
                throw new IllegalStateException((new StringBuilder("Can't change tag of fragment ")).append(fragment).append(": was ").append(fragment.mTag).append(" now ").append(s).toString());
            }
            fragment.mTag = s;
        }
        if (i != 0)
        {
            if (fragment.mFragmentId != 0 && fragment.mFragmentId != i)
            {
                throw new IllegalStateException((new StringBuilder("Can't change container ID of fragment ")).append(fragment).append(": was ").append(fragment.mFragmentId).append(" now ").append(i).toString());
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        s = new Op();
        s.cmd = j;
        s.fragment = fragment;
        addOp(s);
    }

    private void excludeHiddenFragments(TransitionState transitionstate, int i, Object obj)
    {
        if (mManager.mAdded != null)
        {
            int j = 0;
            while (j < mManager.mAdded.size()) 
            {
                Fragment fragment = (Fragment)mManager.mAdded.get(j);
                if (fragment.mView != null && fragment.mContainer != null && fragment.mContainerId == i)
                {
                    if (fragment.mHidden)
                    {
                        if (!transitionstate.hiddenFragmentViews.contains(fragment.mView))
                        {
                            FragmentTransitionCompat21.excludeTarget(obj, fragment.mView, true);
                            transitionstate.hiddenFragmentViews.add(fragment.mView);
                        }
                    } else
                    {
                        FragmentTransitionCompat21.excludeTarget(obj, fragment.mView, false);
                        transitionstate.hiddenFragmentViews.remove(fragment.mView);
                    }
                }
                j++;
            }
        }
    }

    private static ArrayMap remapNames(ArrayList arraylist, ArrayList arraylist1, ArrayMap arraymap)
    {
        if (arraymap.isEmpty())
        {
            return arraymap;
        }
        ArrayMap arraymap1 = new ArrayMap();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            View view = (View)arraymap.get(arraylist.get(i));
            if (view != null)
            {
                arraymap1.put(arraylist1.get(i), view);
            }
        }

        return arraymap1;
    }

    private ArrayMap remapSharedElements(TransitionState transitionstate, Fragment fragment, boolean flag)
    {
        ArrayMap arraymap1 = new ArrayMap();
        ArrayMap arraymap = arraymap1;
        if (mSharedElementSourceNames != null)
        {
            FragmentTransitionCompat21.findNamedViews(arraymap1, fragment.mView);
            if (flag)
            {
                MapCollections.retainAllHelper(arraymap1, mSharedElementTargetNames);
                arraymap = arraymap1;
            } else
            {
                arraymap = remapNames(mSharedElementSourceNames, mSharedElementTargetNames, arraymap1);
            }
        }
        if (flag)
        {
            setBackNameOverrides(transitionstate, arraymap, false);
            return arraymap;
        } else
        {
            setNameOverrides(transitionstate, arraymap, false);
            return arraymap;
        }
    }

    private void setBackNameOverrides(TransitionState transitionstate, ArrayMap arraymap, boolean flag)
    {
        int i;
        int j;
        if (mSharedElementTargetNames == null)
        {
            i = 0;
        } else
        {
            i = mSharedElementTargetNames.size();
        }
        j = 0;
        while (j < i) 
        {
            String s = (String)mSharedElementSourceNames.get(j);
            Object obj = (View)arraymap.get((String)mSharedElementTargetNames.get(j));
            if (obj != null)
            {
                obj = ((View) (obj)).getTransitionName();
                if (flag)
                {
                    setNameOverride(transitionstate.nameOverrides, s, ((String) (obj)));
                } else
                {
                    setNameOverride(transitionstate.nameOverrides, ((String) (obj)), s);
                }
            }
            j++;
        }
    }

    private static void setFirstOut(SparseArray sparsearray, Fragment fragment)
    {
        if (fragment != null)
        {
            int i = fragment.mContainerId;
            if (i != 0 && !fragment.mHidden && fragment.isAdded() && fragment.mView != null && sparsearray.get(i) == null)
            {
                sparsearray.put(i, fragment);
            }
        }
    }

    private static void setLastIn(SparseArray sparsearray, Fragment fragment)
    {
        if (fragment != null)
        {
            int i = fragment.mContainerId;
            if (i != 0)
            {
                sparsearray.put(i, fragment);
            }
        }
    }

    private static void setNameOverride(ArrayMap arraymap, String s, String s1)
    {
        if (s == null || s1 == null || s.equals(s1)) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        if (i >= arraymap.size())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!s.equals(arraymap.valueAt(i))) goto _L4; else goto _L3
_L3:
        arraymap.setValueAt(i, s1);
_L2:
        return;
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        arraymap.put(s, s1);
        return;
    }

    private static void setNameOverrides(TransitionState transitionstate, ArrayMap arraymap, boolean flag)
    {
        int j = arraymap.size();
        int i = 0;
        while (i < j) 
        {
            String s = (String)arraymap.keyAt(i);
            String s1 = ((View)arraymap.valueAt(i)).getTransitionName();
            if (flag)
            {
                setNameOverride(transitionstate.nameOverrides, s, s1);
            } else
            {
                setNameOverride(transitionstate.nameOverrides, s1, s);
            }
            i++;
        }
    }

    public final FragmentTransaction add(int i, Fragment fragment, String s)
    {
        doAddOp(i, fragment, s, 1);
        return this;
    }

    public final FragmentTransaction add(Fragment fragment, String s)
    {
        doAddOp(0, fragment, s, 1);
        return this;
    }

    final void addOp(Op op)
    {
        if (mHead == null)
        {
            mTail = op;
            mHead = op;
        } else
        {
            op.prev = mTail;
            mTail.next = op;
            mTail = op;
        }
        op.enterAnim = 0;
        op.exitAnim = 0;
        op.popEnterAnim = 0;
        op.popExitAnim = 0;
        mNumOp = mNumOp + 1;
    }

    public final FragmentTransaction attach(Fragment fragment)
    {
        Op op = new Op();
        op.cmd = 7;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    final void bumpBackStackNesting(int i)
    {
        if (mAddToBackStack)
        {
            Op op = mHead;
            while (op != null) 
            {
                if (op.fragment != null)
                {
                    Fragment fragment = op.fragment;
                    fragment.mBackStackNesting = fragment.mBackStackNesting + i;
                }
                if (op.removed != null)
                {
                    for (int j = op.removed.size() - 1; j >= 0; j--)
                    {
                        Fragment fragment1 = (Fragment)op.removed.get(j);
                        fragment1.mBackStackNesting = fragment1.mBackStackNesting + i;
                    }

                }
                op = op.next;
            }
        }
    }

    public final void calculateBackFragments(SparseArray sparsearray, SparseArray sparsearray1)
    {
        if (mManager.mContainer.hasView()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Op op = mHead;
_L12:
        if (op == null) goto _L1; else goto _L3
_L3:
        op.cmd;
        JVM INSTR tableswitch 1 7: default 72
    //                   1 80
    //                   2 91
    //                   3 150
    //                   4 161
    //                   5 172
    //                   6 183
    //                   7 194;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L4:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_194;
_L13:
        op = op.next;
          goto _L12
_L5:
        setFirstOut(sparsearray, op.fragment);
          goto _L13
_L6:
        if (op.removed != null)
        {
            for (int i = op.removed.size() - 1; i >= 0; i--)
            {
                setLastIn(sparsearray1, (Fragment)op.removed.get(i));
            }

        }
        setFirstOut(sparsearray, op.fragment);
          goto _L13
_L7:
        setLastIn(sparsearray1, op.fragment);
          goto _L13
_L8:
        setLastIn(sparsearray1, op.fragment);
          goto _L13
_L9:
        setFirstOut(sparsearray, op.fragment);
          goto _L13
_L10:
        setLastIn(sparsearray1, op.fragment);
          goto _L13
        setFirstOut(sparsearray, op.fragment);
          goto _L13
    }

    public final int commit()
    {
        return commitInternal(false);
    }

    public final int commitAllowingStateLoss()
    {
        return commitInternal(true);
    }

    public final FragmentTransaction detach(Fragment fragment)
    {
        Op op = new Op();
        op.cmd = 6;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    public final void dump$ec96877(String s, PrintWriter printwriter)
    {
        Op op;
        String s2;
        int i;
        printwriter.print(s);
        printwriter.print("mName=");
        printwriter.print(mName);
        printwriter.print(" mIndex=");
        printwriter.print(mIndex);
        printwriter.print(" mCommitted=");
        printwriter.println(mCommitted);
        if (mTransition != 0)
        {
            printwriter.print(s);
            printwriter.print("mTransition=#");
            printwriter.print(Integer.toHexString(mTransition));
            printwriter.print(" mTransitionStyle=#");
            printwriter.println(Integer.toHexString(mTransitionStyle));
        }
        if (mBreadCrumbTitleRes != 0 || mBreadCrumbTitleText != null)
        {
            printwriter.print(s);
            printwriter.print("mBreadCrumbTitleRes=#");
            printwriter.print(Integer.toHexString(mBreadCrumbTitleRes));
            printwriter.print(" mBreadCrumbTitleText=");
            printwriter.println(mBreadCrumbTitleText);
        }
        if (mBreadCrumbShortTitleRes != 0 || mBreadCrumbShortTitleText != null)
        {
            printwriter.print(s);
            printwriter.print("mBreadCrumbShortTitleRes=#");
            printwriter.print(Integer.toHexString(mBreadCrumbShortTitleRes));
            printwriter.print(" mBreadCrumbShortTitleText=");
            printwriter.println(mBreadCrumbShortTitleText);
        }
        if (mHead == null)
        {
            break MISSING_BLOCK_LABEL_690;
        }
        printwriter.print(s);
        printwriter.println("Operations:");
        s2 = (new StringBuilder()).append(s).append("    ").toString();
        op = mHead;
        i = 0;
_L13:
        if (op == null) goto _L2; else goto _L1
_L1:
        op.cmd;
        JVM INSTR tableswitch 0 7: default 308
    //                   0 577
    //                   1 584
    //                   2 591
    //                   3 598
    //                   4 605
    //                   5 612
    //                   6 619
    //                   7 626;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_626;
_L3:
        String s1 = (new StringBuilder("cmd=")).append(op.cmd).toString();
_L12:
        printwriter.print(s);
        printwriter.print("  Op #");
        printwriter.print(i);
        printwriter.print(": ");
        printwriter.print(s1);
        printwriter.print(" ");
        printwriter.println(op.fragment);
        if (op.enterAnim != 0 || op.exitAnim != 0)
        {
            printwriter.print(s);
            printwriter.print("enterAnim=#");
            printwriter.print(Integer.toHexString(op.enterAnim));
            printwriter.print(" exitAnim=#");
            printwriter.println(Integer.toHexString(op.exitAnim));
        }
        if (op.popEnterAnim != 0 || op.popExitAnim != 0)
        {
            printwriter.print(s);
            printwriter.print("popEnterAnim=#");
            printwriter.print(Integer.toHexString(op.popEnterAnim));
            printwriter.print(" popExitAnim=#");
            printwriter.println(Integer.toHexString(op.popExitAnim));
        }
        if (op.removed != null && op.removed.size() > 0)
        {
            int j = 0;
            while (j < op.removed.size()) 
            {
                printwriter.print(s2);
                if (op.removed.size() == 1)
                {
                    printwriter.print("Removed: ");
                } else
                {
                    if (j == 0)
                    {
                        printwriter.println("Removed:");
                    }
                    printwriter.print(s2);
                    printwriter.print("  #");
                    printwriter.print(j);
                    printwriter.print(": ");
                }
                printwriter.println(op.removed.get(j));
                j++;
            }
        }
        break MISSING_BLOCK_LABEL_674;
_L4:
        s1 = "NULL";
          goto _L12
_L5:
        s1 = "ADD";
          goto _L12
_L6:
        s1 = "REPLACE";
          goto _L12
_L7:
        s1 = "REMOVE";
          goto _L12
_L8:
        s1 = "HIDE";
          goto _L12
_L9:
        s1 = "SHOW";
          goto _L12
_L10:
        s1 = "DETACH";
          goto _L12
        s1 = "ATTACH";
          goto _L12
        op = op.next;
        i++;
          goto _L13
_L2:
    }

    public final TransitionState popFromBackStack(boolean flag, TransitionState transitionstate, SparseArray sparsearray, SparseArray sparsearray1)
    {
        Object obj = transitionstate;
        if (!SUPPORTS_TRANSITIONS) goto _L2; else goto _L1
_L1:
        if (transitionstate != null) goto _L4; else goto _L3
_L3:
        if (sparsearray.size() != 0) goto _L6; else goto _L5
_L5:
        obj = transitionstate;
        if (sparsearray1.size() == 0) goto _L2; else goto _L6
_L6:
        obj = beginTransition(sparsearray, sparsearray1, true);
_L2:
        int i;
        int j;
        int k;
        int l;
        bumpBackStackNesting(-1);
        String s;
        if (obj != null)
        {
            i = 0;
        } else
        {
            i = mTransitionStyle;
        }
        if (obj != null)
        {
            j = 0;
        } else
        {
            j = mTransition;
        }
        transitionstate = mTail;
_L17:
        if (transitionstate == null) goto _L8; else goto _L7
_L7:
        if (obj != null)
        {
            k = 0;
        } else
        {
            k = ((Op) (transitionstate)).popEnterAnim;
        }
        if (obj != null)
        {
            l = 0;
        } else
        {
            l = ((Op) (transitionstate)).popExitAnim;
        }
        ((Op) (transitionstate)).cmd;
        JVM INSTR tableswitch 1 7: default 132
    //                   1 279
    //                   2 313
    //                   3 402
    //                   4 425
    //                   5 454
    //                   6 483
    //                   7 512;
           goto _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L9:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(((Op) (transitionstate)).cmd).toString());
_L4:
        obj = transitionstate;
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        sparsearray = mSharedElementTargetNames;
        sparsearray1 = mSharedElementSourceNames;
        obj = transitionstate;
        if (sparsearray == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = 0;
        do
        {
            obj = transitionstate;
            if (i >= sparsearray.size())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (String)sparsearray.get(i);
            s = (String)sparsearray1.get(i);
            setNameOverride(transitionstate.nameOverrides, ((String) (obj)), s);
            i++;
        } while (true);
        continue; /* Loop/switch isn't completed */
_L10:
        sparsearray = ((Op) (transitionstate)).fragment;
        sparsearray.mNextAnim = l;
        mManager.removeFragment(sparsearray, FragmentManagerImpl.reverseTransit(j), i);
_L18:
        transitionstate = ((Op) (transitionstate)).prev;
          goto _L17
_L11:
        sparsearray = ((Op) (transitionstate)).fragment;
        if (sparsearray != null)
        {
            sparsearray.mNextAnim = l;
            mManager.removeFragment(sparsearray, FragmentManagerImpl.reverseTransit(j), i);
        }
        if (((Op) (transitionstate)).removed != null)
        {
            l = 0;
            while (l < ((Op) (transitionstate)).removed.size()) 
            {
                sparsearray = (Fragment)((Op) (transitionstate)).removed.get(l);
                sparsearray.mNextAnim = k;
                mManager.addFragment(sparsearray, false);
                l++;
            }
        }
          goto _L18
_L12:
        sparsearray = ((Op) (transitionstate)).fragment;
        sparsearray.mNextAnim = k;
        mManager.addFragment(sparsearray, false);
          goto _L18
_L13:
        sparsearray = ((Op) (transitionstate)).fragment;
        sparsearray.mNextAnim = k;
        mManager.showFragment(sparsearray, FragmentManagerImpl.reverseTransit(j), i);
          goto _L18
_L14:
        sparsearray = ((Op) (transitionstate)).fragment;
        sparsearray.mNextAnim = l;
        mManager.hideFragment(sparsearray, FragmentManagerImpl.reverseTransit(j), i);
          goto _L18
_L15:
        sparsearray = ((Op) (transitionstate)).fragment;
        sparsearray.mNextAnim = k;
        mManager.attachFragment(sparsearray, FragmentManagerImpl.reverseTransit(j), i);
          goto _L18
_L16:
        sparsearray = ((Op) (transitionstate)).fragment;
        sparsearray.mNextAnim = k;
        mManager.detachFragment(sparsearray, FragmentManagerImpl.reverseTransit(j), i);
          goto _L18
_L8:
        if (flag)
        {
            mManager.moveToState(mManager.mCurState, FragmentManagerImpl.reverseTransit(j), i, true);
            obj = null;
        }
        if (mIndex < 0) goto _L20; else goto _L19
_L19:
        transitionstate = mManager;
        i = mIndex;
        transitionstate;
        JVM INSTR monitorenter ;
        ((FragmentManagerImpl) (transitionstate)).mBackStackIndices.set(i, null);
        if (((FragmentManagerImpl) (transitionstate)).mAvailBackStackIndices == null)
        {
            transitionstate.mAvailBackStackIndices = new ArrayList();
        }
        ((FragmentManagerImpl) (transitionstate)).mAvailBackStackIndices.add(Integer.valueOf(i));
        transitionstate;
        JVM INSTR monitorexit ;
        mIndex = -1;
_L20:
        return ((TransitionState) (obj));
        sparsearray;
        transitionstate;
        JVM INSTR monitorexit ;
        throw sparsearray;
        if (true) goto _L2; else goto _L21
_L21:
    }

    public final FragmentTransaction remove(Fragment fragment)
    {
        Op op = new Op();
        op.cmd = 3;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    public final FragmentTransaction replace(int i, Fragment fragment)
    {
        return replace(i, fragment, null);
    }

    public final FragmentTransaction replace(int i, Fragment fragment, String s)
    {
        if (i == 0)
        {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        } else
        {
            doAddOp(i, fragment, s, 2);
            return this;
        }
    }

    public final void run()
    {
        Op op;
        int i;
        int j;
        int k;
        int l;
        if (mAddToBackStack && mIndex < 0)
        {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        bumpBackStackNesting(1);
        Object obj = null;
        if (SUPPORTS_TRANSITIONS)
        {
            SparseArray sparsearray = new SparseArray();
            obj = new SparseArray();
            calculateFragments(sparsearray, ((SparseArray) (obj)));
            obj = beginTransition(sparsearray, ((SparseArray) (obj)), false);
        }
        if (obj != null)
        {
            i = 0;
        } else
        {
            i = mTransitionStyle;
        }
        if (obj != null)
        {
            j = 0;
        } else
        {
            j = mTransition;
        }
        op = mHead;
_L10:
        if (op == null)
        {
            break MISSING_BLOCK_LABEL_573;
        }
        if (obj != null)
        {
            k = 0;
        } else
        {
            k = op.enterAnim;
        }
        if (obj != null)
        {
            l = 0;
        } else
        {
            l = op.exitAnim;
        }
        op.cmd;
        JVM INSTR tableswitch 1 7: default 152
    //                   1 216
    //                   2 244
    //                   3 443
    //                   4 469
    //                   5 495
    //                   6 521
    //                   7 547;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_547;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(op.cmd).toString());
_L2:
        Fragment fragment = op.fragment;
        fragment.mNextAnim = k;
        mManager.addFragment(fragment, false);
_L11:
        op = op.next;
        if (true) goto _L10; else goto _L9
_L9:
        Fragment fragment1 = op.fragment;
        Fragment fragment7 = fragment1;
        if (mManager.mAdded != null)
        {
            int i1 = 0;
label0:
            do
            {
label1:
                {
                    fragment7 = fragment1;
                    if (i1 >= mManager.mAdded.size())
                    {
                        break label0;
                    }
                    Fragment fragment8 = (Fragment)mManager.mAdded.get(i1);
                    if (fragment1 != null)
                    {
                        fragment7 = fragment1;
                        if (fragment8.mContainerId != fragment1.mContainerId)
                        {
                            break label1;
                        }
                    }
                    if (fragment8 == fragment1)
                    {
                        fragment7 = null;
                        op.fragment = null;
                    } else
                    {
                        if (op.removed == null)
                        {
                            op.removed = new ArrayList();
                        }
                        op.removed.add(fragment8);
                        fragment8.mNextAnim = l;
                        if (mAddToBackStack)
                        {
                            fragment8.mBackStackNesting = fragment8.mBackStackNesting + 1;
                        }
                        mManager.removeFragment(fragment8, j, i);
                        fragment7 = fragment1;
                    }
                }
                i1++;
                fragment1 = fragment7;
            } while (true);
        }
        if (fragment7 != null)
        {
            fragment7.mNextAnim = k;
            mManager.addFragment(fragment7, false);
        }
          goto _L11
_L4:
        Fragment fragment2 = op.fragment;
        fragment2.mNextAnim = l;
        mManager.removeFragment(fragment2, j, i);
          goto _L11
_L5:
        Fragment fragment3 = op.fragment;
        fragment3.mNextAnim = l;
        mManager.hideFragment(fragment3, j, i);
          goto _L11
_L6:
        Fragment fragment4 = op.fragment;
        fragment4.mNextAnim = k;
        mManager.showFragment(fragment4, j, i);
          goto _L11
_L7:
        Fragment fragment5 = op.fragment;
        fragment5.mNextAnim = l;
        mManager.detachFragment(fragment5, j, i);
          goto _L11
        Fragment fragment6 = op.fragment;
        fragment6.mNextAnim = k;
        mManager.attachFragment(fragment6, j, i);
          goto _L11
        mManager.moveToState(mManager.mCurState, j, i, true);
        if (mAddToBackStack)
        {
            FragmentManagerImpl fragmentmanagerimpl = mManager;
            if (fragmentmanagerimpl.mBackStack == null)
            {
                fragmentmanagerimpl.mBackStack = new ArrayList();
            }
            fragmentmanagerimpl.mBackStack.add(this);
        }
        return;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("BackStackEntry{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (mIndex >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(mIndex);
        }
        if (mName != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(mName);
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SUPPORTS_TRANSITIONS = flag;
    }


/*
    static ArrayMap access$000(BackStackRecord backstackrecord, TransitionState transitionstate, boolean flag, Fragment fragment)
    {
        ArrayMap arraymap = new ArrayMap();
        View view = fragment.mView;
        fragment = arraymap;
        if (view != null)
        {
            fragment = arraymap;
            if (backstackrecord.mSharedElementSourceNames != null)
            {
                FragmentTransitionCompat21.findNamedViews(arraymap, view);
                if (flag)
                {
                    fragment = remapNames(backstackrecord.mSharedElementSourceNames, backstackrecord.mSharedElementTargetNames, arraymap);
                } else
                {
                    MapCollections.retainAllHelper(arraymap, backstackrecord.mSharedElementTargetNames);
                    fragment = arraymap;
                }
            }
        }
        if (flag)
        {
            backstackrecord.setBackNameOverrides(transitionstate, fragment, true);
            return fragment;
        } else
        {
            setNameOverrides(transitionstate, fragment, true);
            return fragment;
        }
    }

*/


/*
    static void access$100(BackStackRecord backstackrecord, ArrayMap arraymap, TransitionState transitionstate)
    {
        if (backstackrecord.mSharedElementTargetNames != null && !arraymap.isEmpty())
        {
            backstackrecord = (View)arraymap.get(backstackrecord.mSharedElementTargetNames.get(0));
            if (backstackrecord != null)
            {
                transitionstate.enteringEpicenterView.epicenter = backstackrecord;
            }
        }
        return;
    }

*/


}
