// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.util.ArrayMap;
import android.support.v4.util.LogWriter;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            FragmentTransaction, FragmentManagerImpl, FragmentContainer, Fragment, 
//            SharedElementCallback, FragmentTransitionCompat21, FragmentActivity

final class BackStackRecord extends FragmentTransaction
    implements FragmentManager.BackStackEntry, Runnable
{

    static final int OP_ADD = 1;
    static final int OP_ATTACH = 7;
    static final int OP_DETACH = 6;
    static final int OP_HIDE = 4;
    static final int OP_NULL = 0;
    static final int OP_REMOVE = 3;
    static final int OP_REPLACE = 2;
    static final int OP_SHOW = 5;
    static final boolean SUPPORTS_TRANSITIONS;
    static final String TAG = "FragmentManager";
    boolean mAddToBackStack;
    boolean mAllowAddToBackStack;
    int mBreadCrumbShortTitleRes;
    CharSequence mBreadCrumbShortTitleText;
    int mBreadCrumbTitleRes;
    CharSequence mBreadCrumbTitleText;
    boolean mCommitted;
    int mEnterAnim;
    int mExitAnim;
    Op mHead;
    int mIndex;
    final FragmentManagerImpl mManager;
    String mName;
    int mNumOp;
    int mPopEnterAnim;
    int mPopExitAnim;
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
        boolean flag4 = false;
        TransitionState transitionstate = new TransitionState();
        transitionstate.nonExistentView = new View(mManager.mActivity);
        int i = 0;
        boolean flag1 = false;
        int k;
        boolean flag3;
        do
        {
            k = ((flag4) ? 1 : 0);
            flag3 = flag1;
            if (i >= sparsearray.size())
            {
                break;
            }
            if (configureTransitions(sparsearray.keyAt(i), transitionstate, flag, sparsearray, sparsearray1))
            {
                flag1 = true;
            }
            i++;
        } while (true);
        while (k < sparsearray1.size()) 
        {
            int j = sparsearray1.keyAt(k);
            boolean flag2 = flag3;
            if (sparsearray.get(j) == null)
            {
                flag2 = flag3;
                if (configureTransitions(j, transitionstate, flag, sparsearray, sparsearray1))
                {
                    flag2 = true;
                }
            }
            k++;
            flag3 = flag2;
        }
        sparsearray = transitionstate;
        if (!flag3)
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
    //                   2 99
    //                   3 218
    //                   4 230
    //                   5 242
    //                   6 255
    //                   7 267;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L4:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_267;
_L13:
        op = op.next;
          goto _L12
_L5:
        setLastIn(sparsearray1, op.fragment);
          goto _L13
_L6:
        Fragment fragment = op.fragment;
        Fragment fragment1;
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
        } else
        {
            fragment1 = fragment;
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

    private void callSharedElementEnd(TransitionState transitionstate, Fragment fragment, Fragment fragment1, boolean flag, ArrayMap arraymap)
    {
        if (flag)
        {
            transitionstate = fragment1.mEnterTransitionCallback;
        } else
        {
            transitionstate = fragment.mEnterTransitionCallback;
        }
        if (transitionstate != null)
        {
            transitionstate.onSharedElementEnd(new ArrayList(arraymap.keySet()), new ArrayList(arraymap.values()), null);
        }
    }

    private static Object captureExitingViews(Object obj, Fragment fragment, ArrayList arraylist, ArrayMap arraymap, View view)
    {
        Object obj1 = obj;
        if (obj != null)
        {
            obj1 = FragmentTransitionCompat21.captureExitingViews(obj, fragment.getView(), arraylist, arraymap, view);
        }
        return obj1;
    }

    private boolean configureTransitions(int i, TransitionState transitionstate, boolean flag, SparseArray sparsearray, SparseArray sparsearray1)
    {
        ViewGroup viewgroup = (ViewGroup)mManager.mContainer.findViewById(i);
        if (viewgroup == null)
        {
            return false;
        }
        final Object inFragment = (Fragment)sparsearray1.get(i);
        Object obj3 = (Fragment)sparsearray.get(i);
        Object obj1 = getEnterTransition(((Fragment) (inFragment)), flag);
        Object obj2 = getSharedElementTransition(((Fragment) (inFragment)), ((Fragment) (obj3)), flag);
        Object obj4 = getExitTransition(((Fragment) (obj3)), flag);
        if (obj1 == null && obj2 == null && obj4 == null)
        {
            return false;
        }
        sparsearray = null;
        ArrayList arraylist = new ArrayList();
        if (obj2 != null)
        {
            Object obj = remapSharedElements(transitionstate, ((Fragment) (obj3)), flag);
            arraylist.add(transitionstate.nonExistentView);
            arraylist.addAll(((ArrayMap) (obj)).values());
            if (flag)
            {
                sparsearray1 = ((Fragment) (obj3)).mEnterTransitionCallback;
            } else
            {
                sparsearray1 = ((Fragment) (inFragment)).mEnterTransitionCallback;
            }
            sparsearray = ((SparseArray) (obj));
            if (sparsearray1 != null)
            {
                sparsearray1.onSharedElementStart(new ArrayList(((ArrayMap) (obj)).keySet()), new ArrayList(((ArrayMap) (obj)).values()), null);
                sparsearray = ((SparseArray) (obj));
            }
        }
        sparsearray1 = new ArrayList();
        obj = captureExitingViews(obj4, ((Fragment) (obj3)), sparsearray1, sparsearray, transitionstate.nonExistentView);
        if (mSharedElementTargetNames != null && sparsearray != null)
        {
            sparsearray = (View)sparsearray.get(mSharedElementTargetNames.get(0));
            if (sparsearray != null)
            {
                if (obj != null)
                {
                    FragmentTransitionCompat21.setEpicenter(obj, sparsearray);
                }
                if (obj2 != null)
                {
                    FragmentTransitionCompat21.setEpicenter(obj2, sparsearray);
                }
            }
        }
        sparsearray = new _cls1();
        if (obj2 != null)
        {
            prepareSharedElementTransition(transitionstate, viewgroup, obj2, ((Fragment) (inFragment)), ((Fragment) (obj3)), flag, arraylist);
        }
        obj3 = new ArrayList();
        obj4 = new ArrayMap();
        if (flag)
        {
            flag = ((Fragment) (inFragment)).getAllowReturnTransitionOverlap();
        } else
        {
            flag = ((Fragment) (inFragment)).getAllowEnterTransitionOverlap();
        }
        inFragment = FragmentTransitionCompat21.mergeTransitions(obj1, obj, obj2, flag);
        if (inFragment != null)
        {
            FragmentTransitionCompat21.addTransitionTargets(obj1, obj2, viewgroup, sparsearray, transitionstate.nonExistentView, transitionstate.enteringEpicenterView, transitionstate.nameOverrides, ((ArrayList) (obj3)), ((java.util.Map) (obj4)), arraylist);
            excludeHiddenFragmentsAfterEnter(viewgroup, transitionstate, i, inFragment);
            FragmentTransitionCompat21.excludeTarget(inFragment, transitionstate.nonExistentView, true);
            excludeHiddenFragments(transitionstate, i, inFragment);
            FragmentTransitionCompat21.beginDelayedTransition(viewgroup, inFragment);
            FragmentTransitionCompat21.cleanupTransitions(viewgroup, transitionstate.nonExistentView, obj1, ((ArrayList) (obj3)), obj, sparsearray1, obj2, arraylist, inFragment, transitionstate.hiddenFragmentViews, ((java.util.Map) (obj4)));
        }
        return inFragment != null;
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

    private void excludeHiddenFragmentsAfterEnter(final View sceneRoot, final TransitionState state, final int containerId, final Object transition)
    {
        sceneRoot.getViewTreeObserver().addOnPreDrawListener(new _cls3());
    }

    private static Object getEnterTransition(Fragment fragment, boolean flag)
    {
        if (fragment == null)
        {
            return null;
        }
        if (flag)
        {
            fragment = ((Fragment) (fragment.getReenterTransition()));
        } else
        {
            fragment = ((Fragment) (fragment.getEnterTransition()));
        }
        return FragmentTransitionCompat21.cloneTransition(fragment);
    }

    private static Object getExitTransition(Fragment fragment, boolean flag)
    {
        if (fragment == null)
        {
            return null;
        }
        if (flag)
        {
            fragment = ((Fragment) (fragment.getReturnTransition()));
        } else
        {
            fragment = ((Fragment) (fragment.getExitTransition()));
        }
        return FragmentTransitionCompat21.cloneTransition(fragment);
    }

    private static Object getSharedElementTransition(Fragment fragment, Fragment fragment1, boolean flag)
    {
        if (fragment == null || fragment1 == null)
        {
            return null;
        }
        if (flag)
        {
            fragment = ((Fragment) (fragment1.getSharedElementReturnTransition()));
        } else
        {
            fragment = ((Fragment) (fragment.getSharedElementEnterTransition()));
        }
        return FragmentTransitionCompat21.cloneTransition(fragment);
    }

    private ArrayMap mapEnteringSharedElements(TransitionState transitionstate, Fragment fragment, boolean flag)
    {
        ArrayMap arraymap;
label0:
        {
            arraymap = new ArrayMap();
            fragment = fragment.getView();
            transitionstate = arraymap;
            if (fragment != null)
            {
                transitionstate = arraymap;
                if (mSharedElementSourceNames != null)
                {
                    FragmentTransitionCompat21.findNamedViews(arraymap, fragment);
                    if (!flag)
                    {
                        break label0;
                    }
                    transitionstate = remapNames(mSharedElementSourceNames, mSharedElementTargetNames, arraymap);
                }
            }
            return transitionstate;
        }
        arraymap.retainAll(mSharedElementTargetNames);
        return arraymap;
    }

    private ArrayMap mapSharedElementsIn(TransitionState transitionstate, boolean flag, Fragment fragment)
    {
        ArrayMap arraymap = mapEnteringSharedElements(transitionstate, fragment, flag);
        if (flag)
        {
            if (fragment.mExitTransitionCallback != null)
            {
                fragment.mExitTransitionCallback.onMapSharedElements(mSharedElementTargetNames, arraymap);
            }
            setBackNameOverrides(transitionstate, arraymap, true);
            return arraymap;
        }
        if (fragment.mEnterTransitionCallback != null)
        {
            fragment.mEnterTransitionCallback.onMapSharedElements(mSharedElementTargetNames, arraymap);
        }
        setNameOverrides(transitionstate, arraymap, true);
        return arraymap;
    }

    private void prepareSharedElementTransition(final TransitionState state, final View sceneRoot, final Object sharedElementTransition, final Fragment inFragment, final Fragment outFragment, final boolean isBack, final ArrayList sharedElementTargets)
    {
        sceneRoot.getViewTreeObserver().addOnPreDrawListener(new _cls2());
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
            FragmentTransitionCompat21.findNamedViews(arraymap1, fragment.getView());
            if (flag)
            {
                arraymap1.retainAll(mSharedElementTargetNames);
                arraymap = arraymap1;
            } else
            {
                arraymap = remapNames(mSharedElementSourceNames, mSharedElementTargetNames, arraymap1);
            }
        }
        if (flag)
        {
            if (fragment.mEnterTransitionCallback != null)
            {
                fragment.mEnterTransitionCallback.onMapSharedElements(mSharedElementTargetNames, arraymap);
            }
            setBackNameOverrides(transitionstate, arraymap, false);
            return arraymap;
        }
        if (fragment.mExitTransitionCallback != null)
        {
            fragment.mExitTransitionCallback.onMapSharedElements(mSharedElementTargetNames, arraymap);
        }
        setNameOverrides(transitionstate, arraymap, false);
        return arraymap;
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
                obj = FragmentTransitionCompat21.getTransitionName(((View) (obj)));
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

    private void setEpicenterIn(ArrayMap arraymap, TransitionState transitionstate)
    {
        if (mSharedElementTargetNames != null && !arraymap.isEmpty())
        {
            arraymap = (View)arraymap.get(mSharedElementTargetNames.get(0));
            if (arraymap != null)
            {
                transitionstate.enteringEpicenterView.epicenter = arraymap;
            }
        }
    }

    private static void setFirstOut(SparseArray sparsearray, Fragment fragment)
    {
        if (fragment != null)
        {
            int i = fragment.mContainerId;
            if (i != 0 && !fragment.isHidden() && fragment.isAdded() && fragment.getView() != null && sparsearray.get(i) == null)
            {
                sparsearray.put(i, fragment);
            }
        }
    }

    private void setLastIn(SparseArray sparsearray, Fragment fragment)
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

    private void setNameOverrides(TransitionState transitionstate, ArrayMap arraymap, boolean flag)
    {
        int j = arraymap.size();
        int i = 0;
        while (i < j) 
        {
            String s = (String)arraymap.keyAt(i);
            String s1 = FragmentTransitionCompat21.getTransitionName((View)arraymap.valueAt(i));
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

    private static void setNameOverrides(TransitionState transitionstate, ArrayList arraylist, ArrayList arraylist1)
    {
        if (arraylist != null)
        {
            for (int i = 0; i < arraylist.size(); i++)
            {
                String s = (String)arraylist.get(i);
                String s1 = (String)arraylist1.get(i);
                setNameOverride(transitionstate.nameOverrides, s, s1);
            }

        }
    }

    public final FragmentTransaction add(int i, Fragment fragment)
    {
        doAddOp(i, fragment, null, 1);
        return this;
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
        op.enterAnim = mEnterAnim;
        op.exitAnim = mExitAnim;
        op.popEnterAnim = mPopEnterAnim;
        op.popExitAnim = mPopExitAnim;
        mNumOp = mNumOp + 1;
    }

    public final FragmentTransaction addSharedElement(View view, String s)
    {
        if (SUPPORTS_TRANSITIONS)
        {
            view = FragmentTransitionCompat21.getTransitionName(view);
            if (view == null)
            {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (mSharedElementSourceNames == null)
            {
                mSharedElementSourceNames = new ArrayList();
                mSharedElementTargetNames = new ArrayList();
            }
            mSharedElementSourceNames.add(view);
            mSharedElementTargetNames.add(s);
        }
        return this;
    }

    public final FragmentTransaction addToBackStack(String s)
    {
        if (!mAllowAddToBackStack)
        {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        } else
        {
            mAddToBackStack = true;
            mName = s;
            return this;
        }
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
            if (FragmentManagerImpl.DEBUG)
            {
                (new StringBuilder("Bump nesting in ")).append(this).append(" by ").append(i);
            }
            Op op = mHead;
            while (op != null) 
            {
                if (op.fragment != null)
                {
                    Fragment fragment = op.fragment;
                    fragment.mBackStackNesting = fragment.mBackStackNesting + i;
                    if (FragmentManagerImpl.DEBUG)
                    {
                        (new StringBuilder("Bump nesting of ")).append(op.fragment).append(" to ").append(op.fragment.mBackStackNesting);
                    }
                }
                if (op.removed != null)
                {
                    for (int j = op.removed.size() - 1; j >= 0; j--)
                    {
                        Fragment fragment1 = (Fragment)op.removed.get(j);
                        fragment1.mBackStackNesting = fragment1.mBackStackNesting + i;
                        if (FragmentManagerImpl.DEBUG)
                        {
                            (new StringBuilder("Bump nesting of ")).append(fragment1).append(" to ").append(fragment1.mBackStackNesting);
                        }
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
    //                   3 151
    //                   4 163
    //                   5 175
    //                   6 186
    //                   7 198;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L4:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_198;
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

    final int commitInternal(boolean flag)
    {
        if (mCommitted)
        {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManagerImpl.DEBUG)
        {
            (new StringBuilder("Commit: ")).append(this);
            dump("  ", null, new PrintWriter(new LogWriter("FragmentManager")), null);
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

    public final FragmentTransaction detach(Fragment fragment)
    {
        Op op = new Op();
        op.cmd = 6;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    public final FragmentTransaction disallowAddToBackStack()
    {
        if (mAddToBackStack)
        {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        } else
        {
            mAllowAddToBackStack = false;
            return this;
        }
    }

    public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        dump(s, printwriter, true);
    }

    public final void dump(String s, PrintWriter printwriter, boolean flag)
    {
        Op op;
        String s2;
        int i;
        if (flag)
        {
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
            if (mEnterAnim != 0 || mExitAnim != 0)
            {
                printwriter.print(s);
                printwriter.print("mEnterAnim=#");
                printwriter.print(Integer.toHexString(mEnterAnim));
                printwriter.print(" mExitAnim=#");
                printwriter.println(Integer.toHexString(mExitAnim));
            }
            if (mPopEnterAnim != 0 || mPopExitAnim != 0)
            {
                printwriter.print(s);
                printwriter.print("mPopEnterAnim=#");
                printwriter.print(Integer.toHexString(mPopEnterAnim));
                printwriter.print(" mPopExitAnim=#");
                printwriter.println(Integer.toHexString(mPopExitAnim));
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
        }
        if (mHead == null)
        {
            break MISSING_BLOCK_LABEL_820;
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
        JVM INSTR tableswitch 0 7: default 424
    //                   0 699
    //                   1 707
    //                   2 715
    //                   3 723
    //                   4 731
    //                   5 739
    //                   6 747
    //                   7 755;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_755;
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
        if (flag)
        {
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
        break MISSING_BLOCK_LABEL_804;
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

    public final CharSequence getBreadCrumbShortTitle()
    {
        if (mBreadCrumbShortTitleRes != 0)
        {
            return mManager.mActivity.getText(mBreadCrumbShortTitleRes);
        } else
        {
            return mBreadCrumbShortTitleText;
        }
    }

    public final int getBreadCrumbShortTitleRes()
    {
        return mBreadCrumbShortTitleRes;
    }

    public final CharSequence getBreadCrumbTitle()
    {
        if (mBreadCrumbTitleRes != 0)
        {
            return mManager.mActivity.getText(mBreadCrumbTitleRes);
        } else
        {
            return mBreadCrumbTitleText;
        }
    }

    public final int getBreadCrumbTitleRes()
    {
        return mBreadCrumbTitleRes;
    }

    public final int getId()
    {
        return mIndex;
    }

    public final String getName()
    {
        return mName;
    }

    public final int getTransition()
    {
        return mTransition;
    }

    public final int getTransitionStyle()
    {
        return mTransitionStyle;
    }

    public final FragmentTransaction hide(Fragment fragment)
    {
        Op op = new Op();
        op.cmd = 4;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    public final boolean isAddToBackStackAllowed()
    {
        return mAllowAddToBackStack;
    }

    public final boolean isEmpty()
    {
        return mNumOp == 0;
    }

    public final TransitionState popFromBackStack(boolean flag, TransitionState transitionstate, SparseArray sparsearray, SparseArray sparsearray1)
    {
        TransitionState transitionstate1;
        if (FragmentManagerImpl.DEBUG)
        {
            (new StringBuilder("popFromBackStack: ")).append(this);
            dump("  ", null, new PrintWriter(new LogWriter("FragmentManager")), null);
        }
        transitionstate1 = transitionstate;
        if (!SUPPORTS_TRANSITIONS) goto _L2; else goto _L1
_L1:
        if (transitionstate != null) goto _L4; else goto _L3
_L3:
        if (sparsearray.size() != 0) goto _L6; else goto _L5
_L5:
        transitionstate1 = transitionstate;
        if (sparsearray1.size() == 0) goto _L2; else goto _L6
_L6:
        transitionstate1 = beginTransition(sparsearray, sparsearray1, true);
_L2:
        int i;
        int j;
        int k;
        int l;
        bumpBackStackNesting(-1);
        if (transitionstate1 != null)
        {
            i = 0;
        } else
        {
            i = mTransitionStyle;
        }
        if (transitionstate1 != null)
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
        if (transitionstate1 != null)
        {
            k = 0;
        } else
        {
            k = ((Op) (transitionstate)).popEnterAnim;
        }
        if (transitionstate1 != null)
        {
            l = 0;
        } else
        {
            l = ((Op) (transitionstate)).popExitAnim;
        }
        ((Op) (transitionstate)).cmd;
        JVM INSTR tableswitch 1 7: default 180
    //                   1 269
    //                   2 303
    //                   3 392
    //                   4 415
    //                   5 444
    //                   6 473
    //                   7 502;
           goto _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L9:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(((Op) (transitionstate)).cmd).toString());
_L4:
        transitionstate1 = transitionstate;
        if (!flag)
        {
            setNameOverrides(transitionstate, mSharedElementTargetNames, mSharedElementSourceNames);
            transitionstate1 = transitionstate;
        }
          goto _L2
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
            transitionstate1 = null;
        }
        if (mIndex >= 0)
        {
            mManager.freeBackStackIndex(mIndex);
            mIndex = -1;
        }
        return transitionstate1;
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
        if (FragmentManagerImpl.DEBUG)
        {
            (new StringBuilder("Run: ")).append(this);
        }
        if (mAddToBackStack && mIndex < 0)
        {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        bumpBackStackNesting(1);
        Fragment fragment;
        Object obj;
        Op op;
        Fragment fragment1;
        Fragment fragment2;
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (SUPPORTS_TRANSITIONS)
        {
            SparseArray sparsearray = new SparseArray();
            obj = new SparseArray();
            calculateFragments(sparsearray, ((SparseArray) (obj)));
            obj = beginTransition(sparsearray, ((SparseArray) (obj)), false);
        } else
        {
            obj = null;
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
        if (op == null)
        {
            break MISSING_BLOCK_LABEL_661;
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
        JVM INSTR tableswitch 1 7: default 172
    //                   1 236
    //                   2 264
    //                   3 531
    //                   4 557
    //                   5 583
    //                   6 609
    //                   7 635;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_635;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(op.cmd).toString());
_L2:
        fragment = op.fragment;
        fragment.mNextAnim = k;
        mManager.addFragment(fragment, false);
_L12:
        op = op.next;
        if (true) goto _L10; else goto _L9
_L10:
        break MISSING_BLOCK_LABEL_106;
_L9:
        fragment = op.fragment;
        if (mManager.mAdded != null)
        {
            i1 = 0;
label0:
            do
            {
label1:
                {
                    fragment1 = fragment;
                    if (i1 >= mManager.mAdded.size())
                    {
                        break label0;
                    }
                    fragment2 = (Fragment)mManager.mAdded.get(i1);
                    if (FragmentManagerImpl.DEBUG)
                    {
                        (new StringBuilder("OP_REPLACE: adding=")).append(fragment).append(" old=").append(fragment2);
                    }
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
                        op.fragment = null;
                        fragment1 = null;
                    } else
                    {
                        if (op.removed == null)
                        {
                            op.removed = new ArrayList();
                        }
                        op.removed.add(fragment2);
                        fragment2.mNextAnim = l;
                        if (mAddToBackStack)
                        {
                            fragment2.mBackStackNesting = fragment2.mBackStackNesting + 1;
                            if (FragmentManagerImpl.DEBUG)
                            {
                                (new StringBuilder("Bump nesting of ")).append(fragment2).append(" to ").append(fragment2.mBackStackNesting);
                            }
                        }
                        mManager.removeFragment(fragment2, j, i);
                        fragment1 = fragment;
                    }
                }
                i1++;
                fragment = fragment1;
            } while (true);
        } else
        {
            fragment1 = fragment;
        }
        if (fragment1 != null)
        {
            fragment1.mNextAnim = k;
            mManager.addFragment(fragment1, false);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        fragment = op.fragment;
        fragment.mNextAnim = l;
        mManager.removeFragment(fragment, j, i);
        continue; /* Loop/switch isn't completed */
_L5:
        fragment = op.fragment;
        fragment.mNextAnim = l;
        mManager.hideFragment(fragment, j, i);
        continue; /* Loop/switch isn't completed */
_L6:
        fragment = op.fragment;
        fragment.mNextAnim = k;
        mManager.showFragment(fragment, j, i);
        continue; /* Loop/switch isn't completed */
_L7:
        fragment = op.fragment;
        fragment.mNextAnim = l;
        mManager.detachFragment(fragment, j, i);
        continue; /* Loop/switch isn't completed */
        fragment = op.fragment;
        fragment.mNextAnim = k;
        mManager.attachFragment(fragment, j, i);
        if (true) goto _L12; else goto _L11
_L11:
        mManager.moveToState(mManager.mCurState, j, i, true);
        if (mAddToBackStack)
        {
            mManager.addBackStackState(this);
        }
        return;
    }

    public final FragmentTransaction setBreadCrumbShortTitle(int i)
    {
        mBreadCrumbShortTitleRes = i;
        mBreadCrumbShortTitleText = null;
        return this;
    }

    public final FragmentTransaction setBreadCrumbShortTitle(CharSequence charsequence)
    {
        mBreadCrumbShortTitleRes = 0;
        mBreadCrumbShortTitleText = charsequence;
        return this;
    }

    public final FragmentTransaction setBreadCrumbTitle(int i)
    {
        mBreadCrumbTitleRes = i;
        mBreadCrumbTitleText = null;
        return this;
    }

    public final FragmentTransaction setBreadCrumbTitle(CharSequence charsequence)
    {
        mBreadCrumbTitleRes = 0;
        mBreadCrumbTitleText = charsequence;
        return this;
    }

    public final FragmentTransaction setCustomAnimations(int i, int j)
    {
        return setCustomAnimations(i, j, 0, 0);
    }

    public final FragmentTransaction setCustomAnimations(int i, int j, int k, int l)
    {
        mEnterAnim = i;
        mExitAnim = j;
        mPopEnterAnim = k;
        mPopExitAnim = l;
        return this;
    }

    public final FragmentTransaction setTransition(int i)
    {
        mTransition = i;
        return this;
    }

    public final FragmentTransaction setTransitionStyle(int i)
    {
        mTransitionStyle = i;
        return this;
    }

    public final FragmentTransaction show(Fragment fragment)
    {
        Op op = new Op();
        op.cmd = 5;
        op.fragment = fragment;
        addOp(op);
        return this;
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


    private class Op
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


    private class _cls1
        implements FragmentTransitionCompat21.ViewRetriever
    {

        final BackStackRecord this$0;
        final Fragment val$inFragment;

        public View getView()
        {
            return inFragment.getView();
        }

        _cls1()
        {
            this$0 = BackStackRecord.this;
            inFragment = fragment;
            super();
        }
    }


    private class _cls3
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        final BackStackRecord this$0;
        final int val$containerId;
        final View val$sceneRoot;
        final TransitionState val$state;
        final Object val$transition;

        public boolean onPreDraw()
        {
            sceneRoot.getViewTreeObserver().removeOnPreDrawListener(this);
            excludeHiddenFragments(state, containerId, transition);
            return true;
        }

        _cls3()
        {
            this$0 = BackStackRecord.this;
            sceneRoot = view;
            state = transitionstate;
            containerId = i;
            transition = obj;
            super();
        }
    }


    private class _cls2
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        final BackStackRecord this$0;
        final Fragment val$inFragment;
        final boolean val$isBack;
        final Fragment val$outFragment;
        final View val$sceneRoot;
        final ArrayList val$sharedElementTargets;
        final Object val$sharedElementTransition;
        final TransitionState val$state;

        public boolean onPreDraw()
        {
            sceneRoot.getViewTreeObserver().removeOnPreDrawListener(this);
            if (sharedElementTransition != null)
            {
                FragmentTransitionCompat21.removeTargets(sharedElementTransition, sharedElementTargets);
                sharedElementTargets.clear();
                ArrayMap arraymap = mapSharedElementsIn(state, isBack, inFragment);
                sharedElementTargets.add(state.nonExistentView);
                sharedElementTargets.addAll(arraymap.values());
                FragmentTransitionCompat21.addTargets(sharedElementTransition, sharedElementTargets);
                setEpicenterIn(arraymap, state);
                callSharedElementEnd(state, inFragment, outFragment, isBack, arraymap);
            }
            return true;
        }

        _cls2()
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
    }

}
