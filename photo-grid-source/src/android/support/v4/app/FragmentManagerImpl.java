// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.LogWriter;
import android.support.v4.view.LayoutInflaterFactory;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//            FragmentManager, FragmentActivity, Fragment, BackStackRecord, 
//            LoaderManagerImpl, SuperNotCalledException, FragmentContainer, NoSaveStateFrameLayout, 
//            FragmentManagerState, FragmentState, BackStackState, FragmentTransaction

final class FragmentManagerImpl extends FragmentManager
    implements LayoutInflaterFactory
{

    static final Interpolator ACCELERATE_CUBIC = new AccelerateInterpolator(1.5F);
    static final Interpolator ACCELERATE_QUINT = new AccelerateInterpolator(2.5F);
    static final int ANIM_DUR = 220;
    public static final int ANIM_STYLE_CLOSE_ENTER = 3;
    public static final int ANIM_STYLE_CLOSE_EXIT = 4;
    public static final int ANIM_STYLE_FADE_ENTER = 5;
    public static final int ANIM_STYLE_FADE_EXIT = 6;
    public static final int ANIM_STYLE_OPEN_ENTER = 1;
    public static final int ANIM_STYLE_OPEN_EXIT = 2;
    static boolean DEBUG = false;
    static final Interpolator DECELERATE_CUBIC = new DecelerateInterpolator(1.5F);
    static final Interpolator DECELERATE_QUINT = new DecelerateInterpolator(2.5F);
    static final boolean HONEYCOMB;
    static final String TAG = "FragmentManager";
    static final String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
    static final String TARGET_STATE_TAG = "android:target_state";
    static final String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
    static final String VIEW_STATE_TAG = "android:view_state";
    ArrayList mActive;
    FragmentActivity mActivity;
    ArrayList mAdded;
    ArrayList mAvailBackStackIndices;
    ArrayList mAvailIndices;
    ArrayList mBackStack;
    ArrayList mBackStackChangeListeners;
    ArrayList mBackStackIndices;
    FragmentContainer mContainer;
    ArrayList mCreatedMenus;
    int mCurState;
    boolean mDestroyed;
    Runnable mExecCommit;
    boolean mExecutingActions;
    boolean mHavePendingDeferredStart;
    boolean mNeedMenuInvalidate;
    String mNoTransactionsBecause;
    Fragment mParent;
    ArrayList mPendingActions;
    SparseArray mStateArray;
    Bundle mStateBundle;
    boolean mStateSaved;
    Runnable mTmpActions[];

    FragmentManagerImpl()
    {
        mCurState = 0;
        mStateBundle = null;
        mStateArray = null;
        mExecCommit = new _cls1();
    }

    private void checkStateLoss()
    {
        if (mStateSaved)
        {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (mNoTransactionsBecause != null)
        {
            throw new IllegalStateException((new StringBuilder("Can not perform this action inside of ")).append(mNoTransactionsBecause).toString());
        } else
        {
            return;
        }
    }

    static Animation makeFadeAnimation(Context context, float f, float f1)
    {
        context = new AlphaAnimation(f, f1);
        context.setInterpolator(DECELERATE_CUBIC);
        context.setDuration(220L);
        return context;
    }

    static Animation makeOpenCloseAnimation(Context context, float f, float f1, float f2, float f3)
    {
        context = new AnimationSet(false);
        Object obj = new ScaleAnimation(f, f1, f, f1, 1, 0.5F, 1, 0.5F);
        ((ScaleAnimation) (obj)).setInterpolator(DECELERATE_QUINT);
        ((ScaleAnimation) (obj)).setDuration(220L);
        context.addAnimation(((Animation) (obj)));
        obj = new AlphaAnimation(f2, f3);
        ((AlphaAnimation) (obj)).setInterpolator(DECELERATE_CUBIC);
        ((AlphaAnimation) (obj)).setDuration(220L);
        context.addAnimation(((Animation) (obj)));
        return context;
    }

    public static int reverseTransit(int i)
    {
        switch (i)
        {
        default:
            return 0;

        case 4097: 
            return 8194;

        case 8194: 
            return 4097;

        case 4099: 
            return 4099;
        }
    }

    private void throwException(RuntimeException runtimeexception)
    {
        Log.e("FragmentManager", runtimeexception.getMessage());
        Log.e("FragmentManager", "Activity state:");
        Object obj = new PrintWriter(new LogWriter("FragmentManager"));
        if (mActivity != null)
        {
            try
            {
                mActivity.dump("  ", null, ((PrintWriter) (obj)), new String[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("FragmentManager", "Failed dumping state", ((Throwable) (obj)));
            }
        } else
        {
            try
            {
                dump("  ", null, ((PrintWriter) (obj)), new String[0]);
            }
            catch (Exception exception)
            {
                Log.e("FragmentManager", "Failed dumping state", exception);
            }
        }
        throw runtimeexception;
    }

    public static int transitToStyleIndex(int i, boolean flag)
    {
        switch (i)
        {
        default:
            return -1;

        case 4097: 
            return !flag ? 2 : 1;

        case 8194: 
            return !flag ? 4 : 3;

        case 4099: 
            break;
        }
        return !flag ? 6 : 5;
    }

    final void addBackStackState(BackStackRecord backstackrecord)
    {
        if (mBackStack == null)
        {
            mBackStack = new ArrayList();
        }
        mBackStack.add(backstackrecord);
        reportBackStackChanged();
    }

    public final void addFragment(Fragment fragment, boolean flag)
    {
        if (mAdded == null)
        {
            mAdded = new ArrayList();
        }
        if (DEBUG)
        {
            (new StringBuilder("add: ")).append(fragment);
        }
        makeActive(fragment);
        if (!fragment.mDetached)
        {
            if (mAdded.contains(fragment))
            {
                throw new IllegalStateException((new StringBuilder("Fragment already added: ")).append(fragment).toString());
            }
            mAdded.add(fragment);
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mHasMenu && fragment.mMenuVisible)
            {
                mNeedMenuInvalidate = true;
            }
            if (flag)
            {
                moveToState(fragment);
            }
        }
    }

    public final void addOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener onbackstackchangedlistener)
    {
        if (mBackStackChangeListeners == null)
        {
            mBackStackChangeListeners = new ArrayList();
        }
        mBackStackChangeListeners.add(onbackstackchangedlistener);
    }

    public final int allocBackStackIndex(BackStackRecord backstackrecord)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        if (mAvailBackStackIndices != null && mAvailBackStackIndices.size() > 0)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        if (mBackStackIndices == null)
        {
            mBackStackIndices = new ArrayList();
        }
        i = mBackStackIndices.size();
        if (DEBUG)
        {
            (new StringBuilder("Setting back stack index ")).append(i).append(" to ").append(backstackrecord);
        }
        mBackStackIndices.add(backstackrecord);
        this;
        JVM INSTR monitorexit ;
        return i;
        i = ((Integer)mAvailBackStackIndices.remove(mAvailBackStackIndices.size() - 1)).intValue();
        if (DEBUG)
        {
            (new StringBuilder("Adding back stack index ")).append(i).append(" with ").append(backstackrecord);
        }
        mBackStackIndices.set(i, backstackrecord);
        this;
        JVM INSTR monitorexit ;
        return i;
        backstackrecord;
        this;
        JVM INSTR monitorexit ;
        throw backstackrecord;
    }

    public final void attachActivity(FragmentActivity fragmentactivity, FragmentContainer fragmentcontainer, Fragment fragment)
    {
        if (mActivity != null)
        {
            throw new IllegalStateException("Already attached");
        } else
        {
            mActivity = fragmentactivity;
            mContainer = fragmentcontainer;
            mParent = fragment;
            return;
        }
    }

    public final void attachFragment(Fragment fragment, int i, int j)
    {
        if (DEBUG)
        {
            (new StringBuilder("attach: ")).append(fragment);
        }
        if (fragment.mDetached)
        {
            fragment.mDetached = false;
            if (!fragment.mAdded)
            {
                if (mAdded == null)
                {
                    mAdded = new ArrayList();
                }
                if (mAdded.contains(fragment))
                {
                    throw new IllegalStateException((new StringBuilder("Fragment already added: ")).append(fragment).toString());
                }
                if (DEBUG)
                {
                    (new StringBuilder("add from attach: ")).append(fragment);
                }
                mAdded.add(fragment);
                fragment.mAdded = true;
                if (fragment.mHasMenu && fragment.mMenuVisible)
                {
                    mNeedMenuInvalidate = true;
                }
                moveToState(fragment, mCurState, i, j, false);
            }
        }
    }

    public final FragmentTransaction beginTransaction()
    {
        return new BackStackRecord(this);
    }

    public final void detachFragment(Fragment fragment, int i, int j)
    {
        if (DEBUG)
        {
            (new StringBuilder("detach: ")).append(fragment);
        }
        if (!fragment.mDetached)
        {
            fragment.mDetached = true;
            if (fragment.mAdded)
            {
                if (mAdded != null)
                {
                    if (DEBUG)
                    {
                        (new StringBuilder("remove from detach: ")).append(fragment);
                    }
                    mAdded.remove(fragment);
                }
                if (fragment.mHasMenu && fragment.mMenuVisible)
                {
                    mNeedMenuInvalidate = true;
                }
                fragment.mAdded = false;
                moveToState(fragment, 1, i, j, false);
            }
        }
    }

    public final void dispatchActivityCreated()
    {
        mStateSaved = false;
        moveToState(2, false);
    }

    public final void dispatchConfigurationChanged(Configuration configuration)
    {
        if (mAdded != null)
        {
            for (int i = 0; i < mAdded.size(); i++)
            {
                Fragment fragment = (Fragment)mAdded.get(i);
                if (fragment != null)
                {
                    fragment.performConfigurationChanged(configuration);
                }
            }

        }
    }

    public final boolean dispatchContextItemSelected(MenuItem menuitem)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (mAdded == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L7:
        flag = flag1;
        if (i >= mAdded.size()) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)mAdded.get(i);
        if (fragment == null || !fragment.performContextItemSelected(menuitem)) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void dispatchCreate()
    {
        mStateSaved = false;
        moveToState(1, false);
    }

    public final boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        boolean flag = false;
        ArrayList arraylist1 = null;
        ArrayList arraylist = null;
        boolean flag2;
        if (mAdded != null)
        {
            int i = 0;
            boolean flag1 = false;
            do
            {
                arraylist1 = arraylist;
                flag2 = flag1;
                if (i >= mAdded.size())
                {
                    break;
                }
                Fragment fragment = (Fragment)mAdded.get(i);
                arraylist1 = arraylist;
                flag2 = flag1;
                if (fragment != null)
                {
                    arraylist1 = arraylist;
                    flag2 = flag1;
                    if (fragment.performCreateOptionsMenu(menu, menuinflater))
                    {
                        flag2 = true;
                        arraylist1 = arraylist;
                        if (arraylist == null)
                        {
                            arraylist1 = new ArrayList();
                        }
                        arraylist1.add(fragment);
                    }
                }
                i++;
                flag1 = flag2;
                arraylist = arraylist1;
            } while (true);
        } else
        {
            flag2 = false;
        }
        if (mCreatedMenus != null)
        {
            for (int j = ((flag) ? 1 : 0); j < mCreatedMenus.size(); j++)
            {
                menu = (Fragment)mCreatedMenus.get(j);
                if (arraylist1 == null || !arraylist1.contains(menu))
                {
                    menu.onDestroyOptionsMenu();
                }
            }

        }
        mCreatedMenus = arraylist1;
        return flag2;
    }

    public final void dispatchDestroy()
    {
        mDestroyed = true;
        execPendingActions();
        moveToState(0, false);
        mActivity = null;
        mContainer = null;
        mParent = null;
    }

    public final void dispatchDestroyView()
    {
        moveToState(1, false);
    }

    public final void dispatchLowMemory()
    {
        if (mAdded != null)
        {
            for (int i = 0; i < mAdded.size(); i++)
            {
                Fragment fragment = (Fragment)mAdded.get(i);
                if (fragment != null)
                {
                    fragment.performLowMemory();
                }
            }

        }
    }

    public final boolean dispatchOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (mAdded == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L7:
        flag = flag1;
        if (i >= mAdded.size()) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)mAdded.get(i);
        if (fragment == null || !fragment.performOptionsItemSelected(menuitem)) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void dispatchOptionsMenuClosed(Menu menu)
    {
        if (mAdded != null)
        {
            for (int i = 0; i < mAdded.size(); i++)
            {
                Fragment fragment = (Fragment)mAdded.get(i);
                if (fragment != null)
                {
                    fragment.performOptionsMenuClosed(menu);
                }
            }

        }
    }

    public final void dispatchPause()
    {
        moveToState(4, false);
    }

    public final boolean dispatchPrepareOptionsMenu(Menu menu)
    {
        boolean flag1;
        if (mAdded != null)
        {
            int i = 0;
            boolean flag = false;
            do
            {
                flag1 = flag;
                if (i >= mAdded.size())
                {
                    break;
                }
                Fragment fragment = (Fragment)mAdded.get(i);
                flag1 = flag;
                if (fragment != null)
                {
                    flag1 = flag;
                    if (fragment.performPrepareOptionsMenu(menu))
                    {
                        flag1 = true;
                    }
                }
                i++;
                flag = flag1;
            } while (true);
        } else
        {
            flag1 = false;
        }
        return flag1;
    }

    public final void dispatchReallyStop()
    {
        moveToState(2, false);
    }

    public final void dispatchResume()
    {
        mStateSaved = false;
        moveToState(5, false);
    }

    public final void dispatchStart()
    {
        mStateSaved = false;
        moveToState(4, false);
    }

    public final void dispatchStop()
    {
        mStateSaved = true;
        moveToState(3, false);
    }

    public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag;
        flag = false;
        String s1 = (new StringBuilder()).append(s).append("    ").toString();
        if (mActive != null)
        {
            int k1 = mActive.size();
            if (k1 > 0)
            {
                printwriter.print(s);
                printwriter.print("Active Fragments in ");
                printwriter.print(Integer.toHexString(System.identityHashCode(this)));
                printwriter.println(":");
                for (int i = 0; i < k1; i++)
                {
                    Fragment fragment = (Fragment)mActive.get(i);
                    printwriter.print(s);
                    printwriter.print("  #");
                    printwriter.print(i);
                    printwriter.print(": ");
                    printwriter.println(fragment);
                    if (fragment != null)
                    {
                        fragment.dump(s1, filedescriptor, printwriter, as);
                    }
                }

            }
        }
        if (mAdded != null)
        {
            int l1 = mAdded.size();
            if (l1 > 0)
            {
                printwriter.print(s);
                printwriter.println("Added Fragments:");
                for (int j = 0; j < l1; j++)
                {
                    Fragment fragment1 = (Fragment)mAdded.get(j);
                    printwriter.print(s);
                    printwriter.print("  #");
                    printwriter.print(j);
                    printwriter.print(": ");
                    printwriter.println(fragment1.toString());
                }

            }
        }
        if (mCreatedMenus != null)
        {
            int i2 = mCreatedMenus.size();
            if (i2 > 0)
            {
                printwriter.print(s);
                printwriter.println("Fragments Created Menus:");
                for (int k = 0; k < i2; k++)
                {
                    Fragment fragment2 = (Fragment)mCreatedMenus.get(k);
                    printwriter.print(s);
                    printwriter.print("  #");
                    printwriter.print(k);
                    printwriter.print(": ");
                    printwriter.println(fragment2.toString());
                }

            }
        }
        if (mBackStack != null)
        {
            int j2 = mBackStack.size();
            if (j2 > 0)
            {
                printwriter.print(s);
                printwriter.println("Back Stack:");
                for (int l = 0; l < j2; l++)
                {
                    BackStackRecord backstackrecord = (BackStackRecord)mBackStack.get(l);
                    printwriter.print(s);
                    printwriter.print("  #");
                    printwriter.print(l);
                    printwriter.print(": ");
                    printwriter.println(backstackrecord.toString());
                    backstackrecord.dump(s1, filedescriptor, printwriter, as);
                }

            }
        }
        this;
        JVM INSTR monitorenter ;
        if (mBackStackIndices == null) goto _L2; else goto _L1
_L1:
        int k2 = mBackStackIndices.size();
        if (k2 <= 0) goto _L2; else goto _L3
_L3:
        printwriter.print(s);
        printwriter.println("Back Stack Indices:");
        int i1 = 0;
_L4:
        if (i1 >= k2)
        {
            break; /* Loop/switch isn't completed */
        }
        filedescriptor = (BackStackRecord)mBackStackIndices.get(i1);
        printwriter.print(s);
        printwriter.print("  #");
        printwriter.print(i1);
        printwriter.print(": ");
        printwriter.println(filedescriptor);
        i1++;
        if (true) goto _L4; else goto _L2
_L2:
        if (mAvailBackStackIndices != null && mAvailBackStackIndices.size() > 0)
        {
            printwriter.print(s);
            printwriter.print("mAvailBackStackIndices: ");
            printwriter.println(Arrays.toString(mAvailBackStackIndices.toArray()));
        }
        this;
        JVM INSTR monitorexit ;
        if (mPendingActions != null)
        {
            int l2 = mPendingActions.size();
            if (l2 > 0)
            {
                printwriter.print(s);
                printwriter.println("Pending Actions:");
                for (int j1 = ((flag) ? 1 : 0); j1 < l2; j1++)
                {
                    filedescriptor = (Runnable)mPendingActions.get(j1);
                    printwriter.print(s);
                    printwriter.print("  #");
                    printwriter.print(j1);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor);
                }

            }
        }
        break MISSING_BLOCK_LABEL_710;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        printwriter.print(s);
        printwriter.println("FragmentManager misc state:");
        printwriter.print(s);
        printwriter.print("  mActivity=");
        printwriter.println(mActivity);
        printwriter.print(s);
        printwriter.print("  mContainer=");
        printwriter.println(mContainer);
        if (mParent != null)
        {
            printwriter.print(s);
            printwriter.print("  mParent=");
            printwriter.println(mParent);
        }
        printwriter.print(s);
        printwriter.print("  mCurState=");
        printwriter.print(mCurState);
        printwriter.print(" mStateSaved=");
        printwriter.print(mStateSaved);
        printwriter.print(" mDestroyed=");
        printwriter.println(mDestroyed);
        if (mNeedMenuInvalidate)
        {
            printwriter.print(s);
            printwriter.print("  mNeedMenuInvalidate=");
            printwriter.println(mNeedMenuInvalidate);
        }
        if (mNoTransactionsBecause != null)
        {
            printwriter.print(s);
            printwriter.print("  mNoTransactionsBecause=");
            printwriter.println(mNoTransactionsBecause);
        }
        if (mAvailIndices != null && mAvailIndices.size() > 0)
        {
            printwriter.print(s);
            printwriter.print("  mAvailIndices: ");
            printwriter.println(Arrays.toString(mAvailIndices.toArray()));
        }
        return;
    }

    public final void enqueueAction(Runnable runnable, boolean flag)
    {
        if (!flag)
        {
            checkStateLoss();
        }
        this;
        JVM INSTR monitorenter ;
        if (mDestroyed || mActivity == null)
        {
            throw new IllegalStateException("Activity has been destroyed");
        }
        break MISSING_BLOCK_LABEL_40;
        runnable;
        this;
        JVM INSTR monitorexit ;
        throw runnable;
        if (mPendingActions == null)
        {
            mPendingActions = new ArrayList();
        }
        mPendingActions.add(runnable);
        if (mPendingActions.size() == 1)
        {
            mActivity.mHandler.removeCallbacks(mExecCommit);
            mActivity.mHandler.post(mExecCommit);
        }
        this;
        JVM INSTR monitorexit ;
    }

    public final boolean execPendingActions()
    {
        if (mExecutingActions)
        {
            throw new IllegalStateException("Recursive entry to executePendingTransactions");
        }
        if (Looper.myLooper() != mActivity.mHandler.getLooper())
        {
            throw new IllegalStateException("Must be called from main thread of process");
        }
        boolean flag = false;
_L2:
        this;
        JVM INSTR monitorenter ;
        if (mPendingActions != null && mPendingActions.size() != 0)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        this;
        JVM INSTR monitorexit ;
        int k;
        if (!mHavePendingDeferredStart)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        int i = 0;
        int l;
        for (k = 0; i < mActive.size(); k = l)
        {
            Fragment fragment = (Fragment)mActive.get(i);
            l = k;
            if (fragment != null)
            {
                l = k;
                if (fragment.mLoaderManager != null)
                {
                    l = k | fragment.mLoaderManager.hasRunningLoaders();
                }
            }
            i++;
        }

        break; /* Loop/switch isn't completed */
        k = mPendingActions.size();
        if (mTmpActions == null || mTmpActions.length < k)
        {
            mTmpActions = new Runnable[k];
        }
        mPendingActions.toArray(mTmpActions);
        mPendingActions.clear();
        mActivity.mHandler.removeCallbacks(mExecCommit);
        this;
        JVM INSTR monitorexit ;
        mExecutingActions = true;
        for (int j = 0; j < k; j++)
        {
            mTmpActions[j].run();
            mTmpActions[j] = null;
        }

        break MISSING_BLOCK_LABEL_250;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        mExecutingActions = false;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        if (k == 0)
        {
            mHavePendingDeferredStart = false;
            startPendingDeferredFragments();
        }
        return flag;
    }

    public final boolean executePendingTransactions()
    {
        return execPendingActions();
    }

    public final Fragment findFragmentById(int i)
    {
        if (mAdded == null) goto _L2; else goto _L1
_L1:
        int j = mAdded.size() - 1;
_L11:
        if (j < 0) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)mAdded.get(j);
        if (fragment == null || fragment.mFragmentId != i) goto _L5; else goto _L4
_L4:
        return fragment;
_L5:
        j--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (mActive == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        j = mActive.size() - 1;
_L9:
        if (j < 0) goto _L7; else goto _L6
_L6:
        Fragment fragment1;
        fragment1 = (Fragment)mActive.get(j);
        if (fragment1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        fragment = fragment1;
        if (fragment1.mFragmentId == i) goto _L4; else goto _L8
_L8:
        j--;
          goto _L9
_L7:
        return null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final Fragment findFragmentByTag(String s)
    {
        if (mAdded == null || s == null) goto _L2; else goto _L1
_L1:
        int i = mAdded.size() - 1;
_L11:
        if (i < 0) goto _L2; else goto _L3
_L3:
        Fragment fragment = (Fragment)mAdded.get(i);
        if (fragment == null || !s.equals(fragment.mTag)) goto _L5; else goto _L4
_L4:
        return fragment;
_L5:
        i--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (mActive == null || s == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        i = mActive.size() - 1;
_L9:
        if (i < 0) goto _L7; else goto _L6
_L6:
        Fragment fragment1;
        fragment1 = (Fragment)mActive.get(i);
        if (fragment1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        fragment = fragment1;
        if (s.equals(fragment1.mTag)) goto _L4; else goto _L8
_L8:
        i--;
          goto _L9
_L7:
        return null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final Fragment findFragmentByWho(String s)
    {
        if (mActive != null && s != null)
        {
            for (int i = mActive.size() - 1; i >= 0; i--)
            {
                Fragment fragment = (Fragment)mActive.get(i);
                if (fragment == null)
                {
                    continue;
                }
                fragment = fragment.findFragmentByWho(s);
                if (fragment != null)
                {
                    return fragment;
                }
            }

        }
        return null;
    }

    public final void freeBackStackIndex(int i)
    {
        this;
        JVM INSTR monitorenter ;
        mBackStackIndices.set(i, null);
        if (mAvailBackStackIndices == null)
        {
            mAvailBackStackIndices = new ArrayList();
        }
        mAvailBackStackIndices.add(Integer.valueOf(i));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final FragmentManager.BackStackEntry getBackStackEntryAt(int i)
    {
        return (FragmentManager.BackStackEntry)mBackStack.get(i);
    }

    public final int getBackStackEntryCount()
    {
        if (mBackStack != null)
        {
            return mBackStack.size();
        } else
        {
            return 0;
        }
    }

    public final Fragment getFragment(Bundle bundle, String s)
    {
        int i = bundle.getInt(s, -1);
        if (i == -1)
        {
            bundle = null;
        } else
        {
            if (i >= mActive.size())
            {
                throwException(new IllegalStateException((new StringBuilder("Fragment no longer exists for key ")).append(s).append(": index ").append(i).toString()));
            }
            Fragment fragment = (Fragment)mActive.get(i);
            bundle = fragment;
            if (fragment == null)
            {
                throwException(new IllegalStateException((new StringBuilder("Fragment no longer exists for key ")).append(s).append(": index ").append(i).toString()));
                return fragment;
            }
        }
        return bundle;
    }

    public final List getFragments()
    {
        return mActive;
    }

    final LayoutInflaterFactory getLayoutInflaterFactory()
    {
        return this;
    }

    public final void hideFragment(Fragment fragment, int i, int j)
    {
        if (DEBUG)
        {
            (new StringBuilder("hide: ")).append(fragment);
        }
        if (!fragment.mHidden)
        {
            fragment.mHidden = true;
            if (fragment.mView != null)
            {
                Animation animation = loadAnimation(fragment, i, false, j);
                if (animation != null)
                {
                    fragment.mView.startAnimation(animation);
                }
                fragment.mView.setVisibility(8);
            }
            if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible)
            {
                mNeedMenuInvalidate = true;
            }
            fragment.onHiddenChanged(true);
        }
    }

    public final boolean isDestroyed()
    {
        return mDestroyed;
    }

    final Animation loadAnimation(Fragment fragment, int i, boolean flag, int j)
    {
        Animation animation = fragment.onCreateAnimation(i, flag, fragment.mNextAnim);
        if (animation == null) goto _L2; else goto _L1
_L1:
        fragment = animation;
_L4:
        return fragment;
_L2:
        if (fragment.mNextAnim == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        animation = AnimationUtils.loadAnimation(mActivity, fragment.mNextAnim);
        fragment = animation;
        if (animation != null) goto _L4; else goto _L3
_L3:
        if (i == 0)
        {
            return null;
        }
        i = transitToStyleIndex(i, flag);
        if (i < 0)
        {
            return null;
        }
        switch (i)
        {
        default:
            i = j;
            if (j == 0)
            {
                i = j;
                if (mActivity.getWindow() != null)
                {
                    i = mActivity.getWindow().getAttributes().windowAnimations;
                }
            }
            if (i == 0)
            {
                return null;
            } else
            {
                return null;
            }

        case 1: // '\001'
            return makeOpenCloseAnimation(mActivity, 1.125F, 1.0F, 0.0F, 1.0F);

        case 2: // '\002'
            return makeOpenCloseAnimation(mActivity, 1.0F, 0.975F, 1.0F, 0.0F);

        case 3: // '\003'
            return makeOpenCloseAnimation(mActivity, 0.975F, 1.0F, 0.0F, 1.0F);

        case 4: // '\004'
            return makeOpenCloseAnimation(mActivity, 1.0F, 1.075F, 1.0F, 0.0F);

        case 5: // '\005'
            return makeFadeAnimation(mActivity, 0.0F, 1.0F);

        case 6: // '\006'
            return makeFadeAnimation(mActivity, 1.0F, 0.0F);
        }
    }

    final void makeActive(Fragment fragment)
    {
        if (fragment.mIndex < 0)
        {
            if (mAvailIndices == null || mAvailIndices.size() <= 0)
            {
                if (mActive == null)
                {
                    mActive = new ArrayList();
                }
                fragment.setIndex(mActive.size(), mParent);
                mActive.add(fragment);
            } else
            {
                fragment.setIndex(((Integer)mAvailIndices.remove(mAvailIndices.size() - 1)).intValue(), mParent);
                mActive.set(fragment.mIndex, fragment);
            }
            if (DEBUG)
            {
                (new StringBuilder("Allocated fragment index ")).append(fragment);
                return;
            }
        }
    }

    final void makeInactive(Fragment fragment)
    {
        if (fragment.mIndex < 0)
        {
            return;
        }
        if (DEBUG)
        {
            (new StringBuilder("Freeing fragment index ")).append(fragment);
        }
        mActive.set(fragment.mIndex, null);
        if (mAvailIndices == null)
        {
            mAvailIndices = new ArrayList();
        }
        mAvailIndices.add(Integer.valueOf(fragment.mIndex));
        mActivity.invalidateSupportFragment(fragment.mWho);
        fragment.initState();
    }

    final void moveToState(int i, int j, int k, boolean flag)
    {
        if (mActivity == null && i != 0)
        {
            throw new IllegalStateException("No activity");
        }
        if (flag || mCurState != i)
        {
            mCurState = i;
            if (mActive != null)
            {
                int l = 0;
                boolean flag1 = false;
                for (; l < mActive.size(); l++)
                {
                    Fragment fragment = (Fragment)mActive.get(l);
                    if (fragment == null)
                    {
                        continue;
                    }
                    moveToState(fragment, i, j, k, false);
                    if (fragment.mLoaderManager != null)
                    {
                        flag1 |= fragment.mLoaderManager.hasRunningLoaders();
                    }
                }

                if (!flag1)
                {
                    startPendingDeferredFragments();
                }
                if (mNeedMenuInvalidate && mActivity != null && mCurState == 5)
                {
                    mActivity.supportInvalidateOptionsMenu();
                    mNeedMenuInvalidate = false;
                    return;
                }
            }
        }
    }

    final void moveToState(int i, boolean flag)
    {
        moveToState(i, 0, 0, flag);
    }

    final void moveToState(Fragment fragment)
    {
        moveToState(fragment, mCurState, 0, 0, false);
    }

    final void moveToState(final Fragment fragment, int i, int j, int k, boolean flag)
    {
        int l;
label0:
        {
            if (fragment.mAdded)
            {
                l = i;
                if (!fragment.mDetached)
                {
                    break label0;
                }
            }
            l = i;
            if (i > 1)
            {
                l = 1;
            }
        }
        int j1 = l;
        if (fragment.mRemoving)
        {
            j1 = l;
            if (l > fragment.mState)
            {
                j1 = fragment.mState;
            }
        }
        i = j1;
        if (fragment.mDeferStart)
        {
            i = j1;
            if (fragment.mState < 4)
            {
                i = j1;
                if (j1 > 3)
                {
                    i = 3;
                }
            }
        }
        if (fragment.mState >= i) goto _L2; else goto _L1
_L1:
        int i1;
        int k1;
        int l1;
        if (fragment.mFromLayout && !fragment.mInLayout)
        {
            return;
        }
        if (fragment.mAnimatingAway != null)
        {
            fragment.mAnimatingAway = null;
            moveToState(fragment, fragment.mStateAfterAnimating, 0, 0, true);
        }
        i1 = i;
        l1 = i;
        k1 = i;
        fragment.mState;
        JVM INSTR tableswitch 0 4: default 184
    //                   0 194
    //                   1 558
    //                   2 867
    //                   3 867
    //                   4 906;
           goto _L3 _L4 _L5 _L6 _L6 _L7
_L3:
        i1 = i;
_L16:
        fragment.mState = i1;
        return;
_L4:
        if (DEBUG)
        {
            (new StringBuilder("moveto CREATED: ")).append(fragment);
        }
        k1 = i;
        if (fragment.mSavedFragmentState != null)
        {
            fragment.mSavedFragmentState.setClassLoader(mActivity.getClassLoader());
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            fragment.mTarget = getFragment(fragment.mSavedFragmentState, "android:target_state");
            if (fragment.mTarget != null)
            {
                fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            k1 = i;
            if (!fragment.mUserVisibleHint)
            {
                fragment.mDeferStart = true;
                k1 = i;
                if (i > 3)
                {
                    k1 = 3;
                }
            }
        }
        fragment.mActivity = mActivity;
        fragment.mParentFragment = mParent;
        FragmentManagerImpl fragmentmanagerimpl;
        if (mParent != null)
        {
            fragmentmanagerimpl = mParent.mChildFragmentManager;
        } else
        {
            fragmentmanagerimpl = mActivity.mFragments;
        }
        fragment.mFragmentManager = fragmentmanagerimpl;
        fragment.mCalled = false;
        fragment.onAttach(mActivity);
        if (!fragment.mCalled)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onAttach()").toString());
        }
        if (fragment.mParentFragment == null)
        {
            mActivity.onAttachFragment(fragment);
        }
        if (!fragment.mRetaining)
        {
            fragment.performCreate(fragment.mSavedFragmentState);
        }
        fragment.mRetaining = false;
        i1 = k1;
        if (fragment.mFromLayout)
        {
            fragment.mView = fragment.performCreateView(fragment.getLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            if (fragment.mView != null)
            {
                fragment.mInnerView = fragment.mView;
                Object obj1;
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    ViewCompat.setSaveFromParentEnabled(fragment.mView, false);
                } else
                {
                    fragment.mView = NoSaveStateFrameLayout.wrap(fragment.mView);
                }
                if (fragment.mHidden)
                {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                i1 = k1;
            } else
            {
                fragment.mInnerView = null;
                i1 = k1;
            }
        }
_L5:
        l1 = i1;
        if (i1 > 1)
        {
            if (DEBUG)
            {
                (new StringBuilder("moveto ACTIVITY_CREATED: ")).append(fragment);
            }
            if (!fragment.mFromLayout)
            {
                Object obj;
                if (fragment.mContainerId != 0)
                {
                    obj1 = (ViewGroup)mContainer.findViewById(fragment.mContainerId);
                    obj = obj1;
                    if (obj1 == null)
                    {
                        obj = obj1;
                        if (!fragment.mRestored)
                        {
                            throwException(new IllegalArgumentException((new StringBuilder("No view found for id 0x")).append(Integer.toHexString(fragment.mContainerId)).append(" (").append(fragment.getResources().getResourceName(fragment.mContainerId)).append(") for fragment ").append(fragment).toString()));
                            obj = obj1;
                        }
                    }
                } else
                {
                    obj = null;
                }
                fragment.mContainer = ((ViewGroup) (obj));
                fragment.mView = fragment.performCreateView(fragment.getLayoutInflater(fragment.mSavedFragmentState), ((ViewGroup) (obj)), fragment.mSavedFragmentState);
                if (fragment.mView != null)
                {
                    fragment.mInnerView = fragment.mView;
                    if (android.os.Build.VERSION.SDK_INT >= 11)
                    {
                        ViewCompat.setSaveFromParentEnabled(fragment.mView, false);
                    } else
                    {
                        fragment.mView = NoSaveStateFrameLayout.wrap(fragment.mView);
                    }
                    if (obj != null)
                    {
                        obj1 = loadAnimation(fragment, j, true, k);
                        if (obj1 != null)
                        {
                            fragment.mView.startAnimation(((Animation) (obj1)));
                        }
                        ((ViewGroup) (obj)).addView(fragment.mView);
                    }
                    if (fragment.mHidden)
                    {
                        fragment.mView.setVisibility(8);
                    }
                    fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                } else
                {
                    fragment.mInnerView = null;
                }
            }
            fragment.performActivityCreated(fragment.mSavedFragmentState);
            if (fragment.mView != null)
            {
                fragment.restoreViewState(fragment.mSavedFragmentState);
            }
            fragment.mSavedFragmentState = null;
            l1 = i1;
        }
_L6:
        k1 = l1;
        if (l1 > 3)
        {
            if (DEBUG)
            {
                (new StringBuilder("moveto STARTED: ")).append(fragment);
            }
            fragment.performStart();
            k1 = l1;
        }
_L7:
        i1 = k1;
        if (k1 > 4)
        {
            if (DEBUG)
            {
                (new StringBuilder("moveto RESUMED: ")).append(fragment);
            }
            fragment.mResumed = true;
            fragment.performResume();
            fragment.mSavedFragmentState = null;
            fragment.mSavedViewState = null;
            i1 = k1;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        i1 = i;
        if (fragment.mState <= i)
        {
            continue; /* Loop/switch isn't completed */
        }
        fragment.mState;
        JVM INSTR tableswitch 1 5: default 1060
    //                   1 1066
    //                   2 1216
    //                   3 1186
    //                   4 1156
    //                   5 1121;
           goto _L8 _L9 _L10 _L11 _L12 _L13
_L8:
        i1 = i;
        break; /* Loop/switch isn't completed */
_L9:
        i1 = i;
        if (i > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mDestroyed && fragment.mAnimatingAway != null)
        {
            obj = fragment.mAnimatingAway;
            fragment.mAnimatingAway = null;
            ((View) (obj)).clearAnimation();
        }
        if (fragment.mAnimatingAway != null)
        {
            fragment.mStateAfterAnimating = i;
            i1 = 1;
            break; /* Loop/switch isn't completed */
        }
          goto _L14
_L13:
        if (i < 5)
        {
            if (DEBUG)
            {
                (new StringBuilder("movefrom RESUMED: ")).append(fragment);
            }
            fragment.performPause();
            fragment.mResumed = false;
        }
_L12:
        if (i < 4)
        {
            if (DEBUG)
            {
                (new StringBuilder("movefrom STARTED: ")).append(fragment);
            }
            fragment.performStop();
        }
_L11:
        if (i < 3)
        {
            if (DEBUG)
            {
                (new StringBuilder("movefrom STOPPED: ")).append(fragment);
            }
            fragment.performReallyStop();
        }
_L10:
        if (i < 2)
        {
            if (DEBUG)
            {
                (new StringBuilder("movefrom ACTIVITY_CREATED: ")).append(fragment);
            }
            if (fragment.mView != null && !mActivity.isFinishing() && fragment.mSavedViewState == null)
            {
                saveFragmentViewState(fragment);
            }
            fragment.performDestroyView();
            if (fragment.mView != null && fragment.mContainer != null)
            {
                if (mCurState > 0 && !mDestroyed)
                {
                    obj = loadAnimation(fragment, j, false, k);
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    fragment.mAnimatingAway = fragment.mView;
                    fragment.mStateAfterAnimating = i;
                    ((Animation) (obj)).setAnimationListener(new _cls5());
                    fragment.mView.startAnimation(((Animation) (obj)));
                }
                fragment.mContainer.removeView(fragment.mView);
            }
            fragment.mContainer = null;
            fragment.mView = null;
            fragment.mInnerView = null;
        }
        if (true) goto _L9; else goto _L14
_L14:
        if (DEBUG)
        {
            (new StringBuilder("movefrom CREATED: ")).append(fragment);
        }
        if (!fragment.mRetaining)
        {
            fragment.performDestroy();
        }
        fragment.mCalled = false;
        fragment.onDetach();
        if (!fragment.mCalled)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onDetach()").toString());
        }
        i1 = i;
        if (!flag)
        {
            if (!fragment.mRetaining)
            {
                makeInactive(fragment);
                i1 = i;
            } else
            {
                fragment.mActivity = null;
                fragment.mParentFragment = null;
                fragment.mFragmentManager = null;
                fragment.mChildFragmentManager = null;
                i1 = i;
            }
        }
        if (true) goto _L16; else goto _L15
_L15:
    }

    public final void noteStateNotSaved()
    {
        mStateSaved = false;
    }

    public final View onCreateView(View view, String s, Context context, AttributeSet attributeset)
    {
        if (!"fragment".equals(s))
        {
            return null;
        }
        String s1 = attributeset.getAttributeValue(null, "class");
        s = context.obtainStyledAttributes(attributeset, FragmentTag.Fragment);
        if (s1 == null)
        {
            s1 = s.getString(0);
        }
        int k = s.getResourceId(1, -1);
        String s2 = s.getString(2);
        s.recycle();
        if (!Fragment.isSupportFragmentClass(mActivity, s1))
        {
            return null;
        }
        int i;
        if (view != null)
        {
            i = view.getId();
        } else
        {
            i = 0;
        }
        if (i == -1 && k == -1 && s2 == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Must specify unique android:id, android:tag, or have a parent with an id for ").append(s1).toString());
        }
        if (k != -1)
        {
            s = findFragmentById(k);
        } else
        {
            s = null;
        }
        view = s;
        if (s == null)
        {
            view = s;
            if (s2 != null)
            {
                view = findFragmentByTag(s2);
            }
        }
        s = view;
        if (view == null)
        {
            s = view;
            if (i != -1)
            {
                s = findFragmentById(i);
            }
        }
        if (DEBUG)
        {
            (new StringBuilder("onCreateView: id=0x")).append(Integer.toHexString(k)).append(" fname=").append(s1).append(" existing=").append(s);
        }
        if (s == null)
        {
            view = Fragment.instantiate(context, s1);
            view.mFromLayout = true;
            int j;
            if (k != 0)
            {
                j = k;
            } else
            {
                j = i;
            }
            view.mFragmentId = j;
            view.mContainerId = i;
            view.mTag = s2;
            view.mInLayout = true;
            view.mFragmentManager = this;
            view.onInflate(mActivity, attributeset, ((Fragment) (view)).mSavedFragmentState);
            addFragment(view, true);
        } else
        {
            if (((Fragment) (s)).mInLayout)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Duplicate id 0x").append(Integer.toHexString(k)).append(", tag ").append(s2).append(", or parent id 0x").append(Integer.toHexString(i)).append(" with another fragment for ").append(s1).toString());
            }
            s.mInLayout = true;
            if (!((Fragment) (s)).mRetaining)
            {
                s.onInflate(mActivity, attributeset, ((Fragment) (s)).mSavedFragmentState);
            }
            view = s;
        }
        if (mCurState <= 0 && ((Fragment) (view)).mFromLayout)
        {
            moveToState(view, 1, 0, 0, false);
        } else
        {
            moveToState(view);
        }
        if (((Fragment) (view)).mView == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(s1).append(" did not create a view.").toString());
        }
        if (k != 0)
        {
            ((Fragment) (view)).mView.setId(k);
        }
        if (((Fragment) (view)).mView.getTag() == null)
        {
            ((Fragment) (view)).mView.setTag(s2);
        }
        return ((Fragment) (view)).mView;
    }

    public final void performPendingDeferredStart(Fragment fragment)
    {
label0:
        {
            if (fragment.mDeferStart)
            {
                if (!mExecutingActions)
                {
                    break label0;
                }
                mHavePendingDeferredStart = true;
            }
            return;
        }
        fragment.mDeferStart = false;
        moveToState(fragment, mCurState, 0, 0, false);
    }

    public final void popBackStack()
    {
        enqueueAction(new _cls2(), false);
    }

    public final void popBackStack(final int id, final int flags)
    {
        if (id < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad id: ")).append(id).toString());
        } else
        {
            enqueueAction(new _cls4(), false);
            return;
        }
    }

    public final void popBackStack(final String name, final int flags)
    {
        enqueueAction(new _cls3(), false);
    }

    public final boolean popBackStackImmediate()
    {
        checkStateLoss();
        executePendingTransactions();
        return popBackStackState(mActivity.mHandler, null, -1, 0);
    }

    public final boolean popBackStackImmediate(int i, int j)
    {
        checkStateLoss();
        executePendingTransactions();
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad id: ")).append(i).toString());
        } else
        {
            return popBackStackState(mActivity.mHandler, null, i, j);
        }
    }

    public final boolean popBackStackImmediate(String s, int i)
    {
        checkStateLoss();
        executePendingTransactions();
        return popBackStackState(mActivity.mHandler, s, -1, i);
    }

    final boolean popBackStackState(Handler handler, String s, int i, int j)
    {
        if (mBackStack != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (s != null || i >= 0 || (j & 1) != 0) goto _L4; else goto _L3
_L3:
        if ((i = mBackStack.size() - 1) < 0) goto _L1; else goto _L5
_L5:
        handler = (BackStackRecord)mBackStack.remove(i);
        s = new SparseArray();
        SparseArray sparsearray = new SparseArray();
        handler.calculateBackFragments(s, sparsearray);
        handler.popFromBackStack(true, null, s, sparsearray);
_L8:
        reportBackStackChanged();
        return true;
_L4:
        int k;
        int l;
        k = -1;
        if (s == null && i < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = mBackStack.size() - 1;
        do
        {
            if (l < 0)
            {
                break;
            }
            handler = (BackStackRecord)mBackStack.get(l);
            if (s != null && s.equals(handler.getName()) || i >= 0 && i == ((BackStackRecord) (handler)).mIndex)
            {
                break;
            }
            l--;
        } while (true);
        if (l < 0) goto _L1; else goto _L6
_L6:
        k = l;
        if ((j & 1) != 0)
        {
            j = l - 1;
            do
            {
                k = j;
                if (j < 0)
                {
                    break;
                }
                handler = (BackStackRecord)mBackStack.get(j);
                if (s == null || !s.equals(handler.getName()))
                {
                    k = j;
                    if (i < 0)
                    {
                        break;
                    }
                    k = j;
                    if (i != ((BackStackRecord) (handler)).mIndex)
                    {
                        break;
                    }
                }
                j--;
            } while (true);
        }
        if (k == mBackStack.size() - 1) goto _L1; else goto _L7
_L7:
        s = new ArrayList();
        for (i = mBackStack.size() - 1; i > k; i--)
        {
            s.add(mBackStack.remove(i));
        }

        j = s.size() - 1;
        SparseArray sparsearray1 = new SparseArray();
        SparseArray sparsearray2 = new SparseArray();
        for (i = 0; i <= j; i++)
        {
            ((BackStackRecord)s.get(i)).calculateBackFragments(sparsearray1, sparsearray2);
        }

        handler = null;
        i = 0;
        while (i <= j) 
        {
            if (DEBUG)
            {
                (new StringBuilder("Popping back stack state: ")).append(s.get(i));
            }
            BackStackRecord backstackrecord = (BackStackRecord)s.get(i);
            boolean flag;
            if (i == j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            handler = backstackrecord.popFromBackStack(flag, handler, sparsearray1, sparsearray2);
            i++;
        }
          goto _L8
    }

    public final void putFragment(Bundle bundle, String s, Fragment fragment)
    {
        if (fragment.mIndex < 0)
        {
            throwException(new IllegalStateException((new StringBuilder("Fragment ")).append(fragment).append(" is not currently in the FragmentManager").toString()));
        }
        bundle.putInt(s, fragment.mIndex);
    }

    public final void removeFragment(Fragment fragment, int i, int j)
    {
        if (DEBUG)
        {
            (new StringBuilder("remove: ")).append(fragment).append(" nesting=").append(fragment.mBackStackNesting);
        }
        int k;
        if (!fragment.isInBackStack())
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (!fragment.mDetached || k != 0)
        {
            if (mAdded != null)
            {
                mAdded.remove(fragment);
            }
            if (fragment.mHasMenu && fragment.mMenuVisible)
            {
                mNeedMenuInvalidate = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
            if (k != 0)
            {
                k = 0;
            } else
            {
                k = 1;
            }
            moveToState(fragment, k, i, j, false);
        }
    }

    public final void removeOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener onbackstackchangedlistener)
    {
        if (mBackStackChangeListeners != null)
        {
            mBackStackChangeListeners.remove(onbackstackchangedlistener);
        }
    }

    final void reportBackStackChanged()
    {
        if (mBackStackChangeListeners != null)
        {
            for (int i = 0; i < mBackStackChangeListeners.size(); i++)
            {
                ((FragmentManager.OnBackStackChangedListener)mBackStackChangeListeners.get(i)).onBackStackChanged();
            }

        }
    }

    final void restoreAllState(Parcelable parcelable, ArrayList arraylist)
    {
        if (parcelable != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (((FragmentManagerState) (parcelable = (FragmentManagerState)parcelable)).mActive != null)
        {
            if (arraylist != null)
            {
                for (int i = 0; i < arraylist.size(); i++)
                {
                    Fragment fragment = (Fragment)arraylist.get(i);
                    if (DEBUG)
                    {
                        (new StringBuilder("restoreAllState: re-attaching retained ")).append(fragment);
                    }
                    FragmentState fragmentstate1 = ((FragmentManagerState) (parcelable)).mActive[fragment.mIndex];
                    fragmentstate1.mInstance = fragment;
                    fragment.mSavedViewState = null;
                    fragment.mBackStackNesting = 0;
                    fragment.mInLayout = false;
                    fragment.mAdded = false;
                    fragment.mTarget = null;
                    if (fragmentstate1.mSavedFragmentState != null)
                    {
                        fragmentstate1.mSavedFragmentState.setClassLoader(mActivity.getClassLoader());
                        fragment.mSavedViewState = fragmentstate1.mSavedFragmentState.getSparseParcelableArray("android:view_state");
                        fragment.mSavedFragmentState = fragmentstate1.mSavedFragmentState;
                    }
                }

            }
            mActive = new ArrayList(((FragmentManagerState) (parcelable)).mActive.length);
            if (mAvailIndices != null)
            {
                mAvailIndices.clear();
            }
            int j = 0;
            while (j < ((FragmentManagerState) (parcelable)).mActive.length) 
            {
                FragmentState fragmentstate = ((FragmentManagerState) (parcelable)).mActive[j];
                if (fragmentstate != null)
                {
                    Fragment fragment2 = fragmentstate.instantiate(mActivity, mParent);
                    if (DEBUG)
                    {
                        (new StringBuilder("restoreAllState: active #")).append(j).append(": ").append(fragment2);
                    }
                    mActive.add(fragment2);
                    fragmentstate.mInstance = null;
                } else
                {
                    mActive.add(null);
                    if (mAvailIndices == null)
                    {
                        mAvailIndices = new ArrayList();
                    }
                    mAvailIndices.add(Integer.valueOf(j));
                }
                j++;
            }
            if (arraylist != null)
            {
                int k = 0;
                while (k < arraylist.size()) 
                {
                    Fragment fragment1 = (Fragment)arraylist.get(k);
                    if (fragment1.mTargetIndex >= 0)
                    {
                        if (fragment1.mTargetIndex < mActive.size())
                        {
                            fragment1.mTarget = (Fragment)mActive.get(fragment1.mTargetIndex);
                        } else
                        {
                            Log.w("FragmentManager", (new StringBuilder("Re-attaching retained fragment ")).append(fragment1).append(" target no longer exists: ").append(fragment1.mTargetIndex).toString());
                            fragment1.mTarget = null;
                        }
                    }
                    k++;
                }
            }
            if (((FragmentManagerState) (parcelable)).mAdded != null)
            {
                mAdded = new ArrayList(((FragmentManagerState) (parcelable)).mAdded.length);
                for (int l = 0; l < ((FragmentManagerState) (parcelable)).mAdded.length; l++)
                {
                    arraylist = (Fragment)mActive.get(((FragmentManagerState) (parcelable)).mAdded[l]);
                    if (arraylist == null)
                    {
                        throwException(new IllegalStateException((new StringBuilder("No instantiated fragment for index #")).append(((FragmentManagerState) (parcelable)).mAdded[l]).toString()));
                    }
                    arraylist.mAdded = true;
                    if (DEBUG)
                    {
                        (new StringBuilder("restoreAllState: added #")).append(l).append(": ").append(arraylist);
                    }
                    if (mAdded.contains(arraylist))
                    {
                        throw new IllegalStateException("Already added!");
                    }
                    mAdded.add(arraylist);
                }

            } else
            {
                mAdded = null;
            }
            if (((FragmentManagerState) (parcelable)).mBackStack != null)
            {
                mBackStack = new ArrayList(((FragmentManagerState) (parcelable)).mBackStack.length);
                int i1 = 0;
                while (i1 < ((FragmentManagerState) (parcelable)).mBackStack.length) 
                {
                    arraylist = ((FragmentManagerState) (parcelable)).mBackStack[i1].instantiate(this);
                    if (DEBUG)
                    {
                        (new StringBuilder("restoreAllState: back stack #")).append(i1).append(" (index ").append(((BackStackRecord) (arraylist)).mIndex).append("): ").append(arraylist);
                        arraylist.dump("  ", new PrintWriter(new LogWriter("FragmentManager")), false);
                    }
                    mBackStack.add(arraylist);
                    if (((BackStackRecord) (arraylist)).mIndex >= 0)
                    {
                        setBackStackIndex(((BackStackRecord) (arraylist)).mIndex, arraylist);
                    }
                    i1++;
                }
            } else
            {
                mBackStack = null;
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    final ArrayList retainNonConfig()
    {
        ArrayList arraylist1 = null;
        ArrayList arraylist = null;
        if (mActive != null)
        {
            int i = 0;
            do
            {
                arraylist1 = arraylist;
                if (i >= mActive.size())
                {
                    break;
                }
                Fragment fragment = (Fragment)mActive.get(i);
                ArrayList arraylist2 = arraylist;
                if (fragment != null)
                {
                    arraylist2 = arraylist;
                    if (fragment.mRetainInstance)
                    {
                        arraylist1 = arraylist;
                        if (arraylist == null)
                        {
                            arraylist1 = new ArrayList();
                        }
                        arraylist1.add(fragment);
                        fragment.mRetaining = true;
                        int j;
                        if (fragment.mTarget != null)
                        {
                            j = fragment.mTarget.mIndex;
                        } else
                        {
                            j = -1;
                        }
                        fragment.mTargetIndex = j;
                        arraylist2 = arraylist1;
                        if (DEBUG)
                        {
                            (new StringBuilder("retainNonConfig: keeping retained ")).append(fragment);
                            arraylist2 = arraylist1;
                        }
                    }
                }
                i++;
                arraylist = arraylist2;
            } while (true);
        }
        return arraylist1;
    }

    final Parcelable saveAllState()
    {
        FragmentManagerState fragmentmanagerstate = null;
        execPendingActions();
        if (HONEYCOMB)
        {
            mStateSaved = true;
        }
        if (mActive != null && mActive.size() > 0)
        {
            int j1 = mActive.size();
            FragmentState afragmentstate[] = new FragmentState[j1];
            int k = 0;
            boolean flag = false;
            while (k < j1) 
            {
                Fragment fragment = (Fragment)mActive.get(k);
                if (fragment == null)
                {
                    continue;
                }
                if (fragment.mIndex < 0)
                {
                    throwException(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(fragment).append(" has cleared index: ").append(fragment.mIndex).toString()));
                }
                FragmentState fragmentstate = new FragmentState(fragment);
                afragmentstate[k] = fragmentstate;
                if (fragment.mState > 0 && fragmentstate.mSavedFragmentState == null)
                {
                    fragmentstate.mSavedFragmentState = saveFragmentBasicState(fragment);
                    if (fragment.mTarget != null)
                    {
                        if (fragment.mTarget.mIndex < 0)
                        {
                            throwException(new IllegalStateException((new StringBuilder("Failure saving state: ")).append(fragment).append(" has target not in fragment manager: ").append(fragment.mTarget).toString()));
                        }
                        if (fragmentstate.mSavedFragmentState == null)
                        {
                            fragmentstate.mSavedFragmentState = new Bundle();
                        }
                        putFragment(fragmentstate.mSavedFragmentState, "android:target_state", fragment.mTarget);
                        if (fragment.mTargetRequestCode != 0)
                        {
                            fragmentstate.mSavedFragmentState.putInt("android:target_req_state", fragment.mTargetRequestCode);
                        }
                    }
                } else
                {
                    fragmentstate.mSavedFragmentState = fragment.mSavedFragmentState;
                }
                if (DEBUG)
                {
                    (new StringBuilder("Saved state of ")).append(fragment).append(": ").append(fragmentstate.mSavedFragmentState);
                }
                flag = true;
                k++;
            }
            if (flag)
            {
                int ai[];
label0:
                {
                    if (mAdded != null)
                    {
                        int l = mAdded.size();
                        if (l > 0)
                        {
                            int ai1[] = new int[l];
                            int i = 0;
                            do
                            {
                                ai = ai1;
                                if (i >= l)
                                {
                                    break;
                                }
                                ai1[i] = ((Fragment)mAdded.get(i)).mIndex;
                                if (ai1[i] < 0)
                                {
                                    throwException(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(mAdded.get(i)).append(" has cleared index: ").append(ai1[i]).toString()));
                                }
                                if (DEBUG)
                                {
                                    (new StringBuilder("saveAllState: adding fragment #")).append(i).append(": ").append(mAdded.get(i));
                                }
                                i++;
                            } while (true);
                            break label0;
                        }
                    }
                    ai = null;
                }
                BackStackState abackstackstate[] = fragmentmanagerstate;
                if (mBackStack != null)
                {
                    int i1 = mBackStack.size();
                    abackstackstate = fragmentmanagerstate;
                    if (i1 > 0)
                    {
                        BackStackState abackstackstate1[] = new BackStackState[i1];
                        int j = 0;
                        do
                        {
                            abackstackstate = abackstackstate1;
                            if (j >= i1)
                            {
                                break;
                            }
                            abackstackstate1[j] = new BackStackState(this, (BackStackRecord)mBackStack.get(j));
                            if (DEBUG)
                            {
                                (new StringBuilder("saveAllState: adding back stack #")).append(j).append(": ").append(mBackStack.get(j));
                            }
                            j++;
                        } while (true);
                    }
                }
                abackstackstate1 = new FragmentManagerState();
                abackstackstate1.mActive = afragmentstate;
                abackstackstate1.mAdded = ai;
                abackstackstate1.mBackStack = abackstackstate;
                return abackstackstate1;
            }
        }
        return null;
    }

    final Bundle saveFragmentBasicState(Fragment fragment)
    {
        if (mStateBundle == null)
        {
            mStateBundle = new Bundle();
        }
        fragment.performSaveInstanceState(mStateBundle);
        Bundle bundle;
        Bundle bundle1;
        if (!mStateBundle.isEmpty())
        {
            bundle1 = mStateBundle;
            mStateBundle = null;
        } else
        {
            bundle1 = null;
        }
        if (fragment.mView != null)
        {
            saveFragmentViewState(fragment);
        }
        bundle = bundle1;
        if (fragment.mSavedViewState != null)
        {
            bundle = bundle1;
            if (bundle1 == null)
            {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        bundle1 = bundle;
        if (!fragment.mUserVisibleHint)
        {
            bundle1 = bundle;
            if (bundle == null)
            {
                bundle1 = new Bundle();
            }
            bundle1.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle1;
    }

    public final Fragment.SavedState saveFragmentInstanceState(Fragment fragment)
    {
        Object obj = null;
        if (fragment.mIndex < 0)
        {
            throwException(new IllegalStateException((new StringBuilder("Fragment ")).append(fragment).append(" is not currently in the FragmentManager").toString()));
        }
        Fragment.SavedState savedstate = obj;
        if (fragment.mState > 0)
        {
            fragment = saveFragmentBasicState(fragment);
            savedstate = obj;
            if (fragment != null)
            {
                savedstate = new Fragment.SavedState(fragment);
            }
        }
        return savedstate;
    }

    final void saveFragmentViewState(Fragment fragment)
    {
        if (fragment.mInnerView != null)
        {
            if (mStateArray == null)
            {
                mStateArray = new SparseArray();
            } else
            {
                mStateArray.clear();
            }
            fragment.mInnerView.saveHierarchyState(mStateArray);
            if (mStateArray.size() > 0)
            {
                fragment.mSavedViewState = mStateArray;
                mStateArray = null;
                return;
            }
        }
    }

    public final void setBackStackIndex(int i, BackStackRecord backstackrecord)
    {
        this;
        JVM INSTR monitorenter ;
        int k;
        if (mBackStackIndices == null)
        {
            mBackStackIndices = new ArrayList();
        }
        k = mBackStackIndices.size();
        int j = k;
        if (i >= k) goto _L2; else goto _L1
_L1:
        if (DEBUG)
        {
            (new StringBuilder("Setting back stack index ")).append(i).append(" to ").append(backstackrecord);
        }
        mBackStackIndices.set(i, backstackrecord);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (j >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        mBackStackIndices.add(null);
        if (mAvailBackStackIndices == null)
        {
            mAvailBackStackIndices = new ArrayList();
        }
        mAvailBackStackIndices.add(Integer.valueOf(j));
        j++;
        if (true) goto _L2; else goto _L3
_L3:
        if (DEBUG)
        {
            (new StringBuilder("Adding back stack index ")).append(i).append(" with ").append(backstackrecord);
        }
        mBackStackIndices.add(backstackrecord);
          goto _L4
        backstackrecord;
        this;
        JVM INSTR monitorexit ;
        throw backstackrecord;
    }

    public final void showFragment(Fragment fragment, int i, int j)
    {
        if (DEBUG)
        {
            (new StringBuilder("show: ")).append(fragment);
        }
        if (fragment.mHidden)
        {
            fragment.mHidden = false;
            if (fragment.mView != null)
            {
                Animation animation = loadAnimation(fragment, i, true, j);
                if (animation != null)
                {
                    fragment.mView.startAnimation(animation);
                }
                fragment.mView.setVisibility(0);
            }
            if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible)
            {
                mNeedMenuInvalidate = true;
            }
            fragment.onHiddenChanged(false);
        }
    }

    final void startPendingDeferredFragments()
    {
        if (mActive != null)
        {
            int i = 0;
            while (i < mActive.size()) 
            {
                Fragment fragment = (Fragment)mActive.get(i);
                if (fragment != null)
                {
                    performPendingDeferredStart(fragment);
                }
                i++;
            }
        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("FragmentManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        if (mParent != null)
        {
            DebugUtils.buildShortClassTag(mParent, stringbuilder);
        } else
        {
            DebugUtils.buildShortClassTag(mActivity, stringbuilder);
        }
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

    static 
    {
        boolean flag = false;
        DEBUG = false;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        }
        HONEYCOMB = flag;
    }

    private class _cls1
        implements Runnable
    {

        final FragmentManagerImpl this$0;

        public void run()
        {
            execPendingActions();
        }

        _cls1()
        {
            this$0 = FragmentManagerImpl.this;
            super();
        }
    }


    private class _cls5
        implements android.view.animation.Animation.AnimationListener
    {

        final FragmentManagerImpl this$0;
        final Fragment val$fragment;

        public void onAnimationEnd(Animation animation)
        {
            if (fragment.mAnimatingAway != null)
            {
                fragment.mAnimatingAway = null;
                moveToState(fragment, fragment.mStateAfterAnimating, 0, 0, false);
            }
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        _cls5()
        {
            this$0 = FragmentManagerImpl.this;
            fragment = fragment1;
            super();
        }
    }


    private class FragmentTag
    {

        public static final int Fragment[] = {
            0x1010003, 0x10100d0, 0x10100d1
        };
        public static final int Fragment_id = 1;
        public static final int Fragment_name = 0;
        public static final int Fragment_tag = 2;


        FragmentTag()
        {
        }
    }


    private class _cls2
        implements Runnable
    {

        final FragmentManagerImpl this$0;

        public void run()
        {
            popBackStackState(mActivity.mHandler, null, -1, 0);
        }

        _cls2()
        {
            this$0 = FragmentManagerImpl.this;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final FragmentManagerImpl this$0;
        final int val$flags;
        final int val$id;

        public void run()
        {
            popBackStackState(mActivity.mHandler, null, id, flags);
        }

        _cls4()
        {
            this$0 = FragmentManagerImpl.this;
            id = i;
            flags = j;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final FragmentManagerImpl this$0;
        final int val$flags;
        final String val$name;

        public void run()
        {
            popBackStackState(mActivity.mHandler, name, -1, flags);
        }

        _cls3()
        {
            this$0 = FragmentManagerImpl.this;
            name = s;
            flags = i;
            super();
        }
    }

}
