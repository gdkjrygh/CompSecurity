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
import android.support.v4.util.SimpleArrayMap;
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
//            FragmentManager, Fragment, FragmentActivity, BackStackRecord, 
//            SuperNotCalledException, FragmentContainer, NoSaveStateFrameLayout, LoaderManagerImpl, 
//            FragmentManagerState, FragmentState, BackStackState, FragmentTransaction

final class FragmentManagerImpl extends FragmentManager
    implements LayoutInflaterFactory
{
    static final class FragmentTag
    {

        public static final int Fragment[] = {
            0x1010003, 0x10100d0, 0x10100d1
        };

    }


    static final Interpolator ACCELERATE_CUBIC = new AccelerateInterpolator(1.5F);
    static final Interpolator ACCELERATE_QUINT = new AccelerateInterpolator(2.5F);
    static boolean DEBUG = false;
    static final Interpolator DECELERATE_CUBIC = new DecelerateInterpolator(1.5F);
    static final Interpolator DECELERATE_QUINT = new DecelerateInterpolator(2.5F);
    static final boolean HONEYCOMB;
    ArrayList mActive;
    FragmentActivity mActivity;
    ArrayList mAdded;
    ArrayList mAvailBackStackIndices;
    ArrayList mAvailIndices;
    ArrayList mBackStack;
    ArrayList mBackStackIndices;
    FragmentContainer mContainer;
    ArrayList mCreatedMenus;
    int mCurState;
    boolean mDestroyed;
    Runnable mExecCommit;
    boolean mExecutingActions;
    boolean mHavePendingDeferredStart;
    boolean mNeedMenuInvalidate;
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
        mExecCommit = new Runnable() {

            final FragmentManagerImpl this$0;

            public final void run()
            {
                execPendingActions();
            }

            
            {
                this$0 = FragmentManagerImpl.this;
                super();
            }
        };
    }

    private Fragment getFragment(Bundle bundle, String s)
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

    private Animation loadAnimation(Fragment fragment, int i, boolean flag, int j)
    {
        int k = fragment.mNextAnim;
        Fragment.onCreateAnimation$24236ca7();
        if (fragment.mNextAnim != 0)
        {
            fragment = AnimationUtils.loadAnimation(mActivity, fragment.mNextAnim);
            if (fragment != null)
            {
                return fragment;
            }
        }
        if (i == 0)
        {
            return null;
        }
        i;
        JVM INSTR lookupswitch 3: default 76
    //                   4097: 84
    //                   4099: 112
    //                   8194: 98;
           goto _L1 _L2 _L3 _L4
_L1:
        i = -1;
_L6:
        if (i < 0)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (flag)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (flag)
        {
            i = 3;
        } else
        {
            i = 4;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (flag)
        {
            i = 5;
        } else
        {
            i = 6;
        }
        if (true) goto _L6; else goto _L5
_L5:
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
            return makeOpenCloseAnimation$376f30fd(1.125F, 1.0F, 0.0F, 1.0F);

        case 2: // '\002'
            return makeOpenCloseAnimation$376f30fd(1.0F, 0.975F, 1.0F, 0.0F);

        case 3: // '\003'
            return makeOpenCloseAnimation$376f30fd(0.975F, 1.0F, 0.0F, 1.0F);

        case 4: // '\004'
            return makeOpenCloseAnimation$376f30fd(1.0F, 1.075F, 1.0F, 0.0F);

        case 5: // '\005'
            return makeFadeAnimation$424ea1bd(0.0F, 1.0F);

        case 6: // '\006'
            return makeFadeAnimation$424ea1bd(1.0F, 0.0F);
        }
    }

    private static Animation makeFadeAnimation$424ea1bd(float f, float f1)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(f, f1);
        alphaanimation.setInterpolator(DECELERATE_CUBIC);
        alphaanimation.setDuration(220L);
        return alphaanimation;
    }

    private static Animation makeOpenCloseAnimation$376f30fd(float f, float f1, float f2, float f3)
    {
        AnimationSet animationset = new AnimationSet(false);
        Object obj = new ScaleAnimation(f, f1, f, f1, 1, 0.5F, 1, 0.5F);
        ((ScaleAnimation) (obj)).setInterpolator(DECELERATE_QUINT);
        ((ScaleAnimation) (obj)).setDuration(220L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new AlphaAnimation(f2, f3);
        ((AlphaAnimation) (obj)).setInterpolator(DECELERATE_CUBIC);
        ((AlphaAnimation) (obj)).setDuration(220L);
        animationset.addAnimation(((Animation) (obj)));
        return animationset;
    }

    private void moveToState(Fragment fragment)
    {
        moveToState(fragment, mCurState, 0, 0, false);
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

    private void saveFragmentViewState(Fragment fragment)
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

    private void setBackStackIndex(int i, BackStackRecord backstackrecord)
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
        mBackStackIndices.add(backstackrecord);
          goto _L4
        backstackrecord;
        this;
        JVM INSTR monitorexit ;
        throw backstackrecord;
    }

    private void startPendingDeferredFragments()
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

    public final void addFragment(Fragment fragment, boolean flag)
    {
        if (mAdded == null)
        {
            mAdded = new ArrayList();
        }
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
        }
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

    public final int allocBackStackIndex(BackStackRecord backstackrecord)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        if (mAvailBackStackIndices != null && mAvailBackStackIndices.size() > 0)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        if (mBackStackIndices == null)
        {
            mBackStackIndices = new ArrayList();
        }
        i = mBackStackIndices.size();
        mBackStackIndices.add(backstackrecord);
        this;
        JVM INSTR monitorexit ;
        return i;
        i = ((Integer)mAvailBackStackIndices.remove(mAvailBackStackIndices.size() - 1)).intValue();
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

    final void checkStateLoss()
    {
        if (mStateSaved)
        {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else
        {
            return;
        }
    }

    public final void detachFragment(Fragment fragment, int i, int j)
    {
        if (!fragment.mDetached)
        {
            fragment.mDetached = true;
            if (fragment.mAdded)
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
                moveToState(fragment, 1, i, j, false);
            }
        }
    }

    public final void dispatchActivityCreated()
    {
        mStateSaved = false;
        moveToState$2563266(2);
    }

    public final void dispatchConfigurationChanged(Configuration configuration)
    {
        if (mAdded != null)
        {
            for (int i = 0; i < mAdded.size(); i++)
            {
                Fragment fragment = (Fragment)mAdded.get(i);
                if (fragment == null)
                {
                    continue;
                }
                fragment.onConfigurationChanged(configuration);
                if (fragment.mChildFragmentManager != null)
                {
                    fragment.mChildFragmentManager.dispatchConfigurationChanged(configuration);
                }
            }

        }
    }

    public final boolean dispatchContextItemSelected(MenuItem menuitem)
    {
        if (mAdded != null)
        {
            boolean flag;
            for (int i = 0; i < mAdded.size(); i++)
            {
                Fragment fragment = (Fragment)mAdded.get(i);
                if (fragment == null)
                {
                    continue;
                }
                if (!fragment.mHidden && fragment.mChildFragmentManager != null && fragment.mChildFragmentManager.dispatchContextItemSelected(menuitem))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    return true;
                }
            }

        }
        return false;
    }

    public final void dispatchCreate()
    {
        mStateSaved = false;
        moveToState$2563266(1);
    }

    public final boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        boolean flag4 = false;
        boolean flag3 = false;
        ArrayList arraylist1 = null;
        ArrayList arraylist = null;
        if (mAdded != null)
        {
            int j = 0;
            do
            {
                arraylist1 = arraylist;
                flag4 = flag3;
                if (j >= mAdded.size())
                {
                    break;
                }
                Fragment fragment = (Fragment)mAdded.get(j);
                arraylist1 = arraylist;
                flag4 = flag3;
                if (fragment != null)
                {
                    boolean flag1 = false;
                    boolean flag2 = false;
                    if (!fragment.mHidden)
                    {
                        boolean flag = flag2;
                        if (fragment.mHasMenu)
                        {
                            flag = flag2;
                            if (fragment.mMenuVisible)
                            {
                                flag = true;
                                fragment.onCreateOptionsMenu(menu, menuinflater);
                            }
                        }
                        flag1 = flag;
                        if (fragment.mChildFragmentManager != null)
                        {
                            flag1 = flag | fragment.mChildFragmentManager.dispatchCreateOptionsMenu(menu, menuinflater);
                        }
                    }
                    arraylist1 = arraylist;
                    flag4 = flag3;
                    if (flag1)
                    {
                        flag4 = true;
                        arraylist1 = arraylist;
                        if (arraylist == null)
                        {
                            arraylist1 = new ArrayList();
                        }
                        arraylist1.add(fragment);
                    }
                }
                j++;
                arraylist = arraylist1;
                flag3 = flag4;
            } while (true);
        }
        if (mCreatedMenus != null)
        {
            for (int i = 0; i < mCreatedMenus.size(); i++)
            {
                menu = (Fragment)mCreatedMenus.get(i);
                if (arraylist1 == null || !arraylist1.contains(menu))
                {
                    Fragment.onDestroyOptionsMenu();
                }
            }

        }
        mCreatedMenus = arraylist1;
        return flag4;
    }

    public final void dispatchDestroy()
    {
        mDestroyed = true;
        execPendingActions();
        moveToState$2563266(0);
        mActivity = null;
        mContainer = null;
        mParent = null;
    }

    public final void dispatchLowMemory()
    {
        if (mAdded != null)
        {
            for (int i = 0; i < mAdded.size(); i++)
            {
                Fragment fragment = (Fragment)mAdded.get(i);
                if (fragment == null)
                {
                    continue;
                }
                fragment.onLowMemory();
                if (fragment.mChildFragmentManager != null)
                {
                    fragment.mChildFragmentManager.dispatchLowMemory();
                }
            }

        }
    }

    public final boolean dispatchOptionsItemSelected(MenuItem menuitem)
    {
        int i;
        if (mAdded == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        i = 0;
_L9:
        if (i >= mAdded.size()) goto _L2; else goto _L1
_L1:
        Fragment fragment;
        fragment = (Fragment)mAdded.get(i);
        if (fragment == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (fragment.mHidden) goto _L4; else goto _L3
_L3:
        if (!fragment.mHasMenu || !fragment.mMenuVisible || !fragment.onOptionsItemSelected(menuitem)) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L8:
        if (flag)
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (fragment.mChildFragmentManager != null && fragment.mChildFragmentManager.dispatchOptionsItemSelected(menuitem))
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
        i++;
          goto _L9
_L2:
        return false;
    }

    public final void dispatchOptionsMenuClosed(Menu menu)
    {
        if (mAdded != null)
        {
            for (int i = 0; i < mAdded.size(); i++)
            {
                Fragment fragment = (Fragment)mAdded.get(i);
                if (fragment != null && !fragment.mHidden && fragment.mChildFragmentManager != null)
                {
                    fragment.mChildFragmentManager.dispatchOptionsMenuClosed(menu);
                }
            }

        }
    }

    public final boolean dispatchPrepareOptionsMenu(Menu menu)
    {
        boolean flag4 = false;
        boolean flag3 = false;
        if (mAdded != null)
        {
            int i = 0;
            do
            {
                flag4 = flag3;
                if (i >= mAdded.size())
                {
                    break;
                }
                Fragment fragment = (Fragment)mAdded.get(i);
                flag4 = flag3;
                if (fragment != null)
                {
                    boolean flag1 = false;
                    boolean flag2 = false;
                    if (!fragment.mHidden)
                    {
                        boolean flag = flag2;
                        if (fragment.mHasMenu)
                        {
                            flag = flag2;
                            if (fragment.mMenuVisible)
                            {
                                flag = true;
                            }
                        }
                        flag1 = flag;
                        if (fragment.mChildFragmentManager != null)
                        {
                            flag1 = flag | fragment.mChildFragmentManager.dispatchPrepareOptionsMenu(menu);
                        }
                    }
                    flag4 = flag3;
                    if (flag1)
                    {
                        flag4 = true;
                    }
                }
                i++;
                flag3 = flag4;
            } while (true);
        }
        return flag4;
    }

    public final void dispatchResume()
    {
        mStateSaved = false;
        moveToState$2563266(5);
    }

    public final void dispatchStart()
    {
        mStateSaved = false;
        moveToState$2563266(4);
    }

    public final void dispatchStop()
    {
        mStateSaved = true;
        moveToState$2563266(3);
    }

    public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
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
                    filedescriptor = (Fragment)mAdded.get(j);
                    printwriter.print(s);
                    printwriter.print("  #");
                    printwriter.print(j);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor.toString());
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
                    filedescriptor = (Fragment)mCreatedMenus.get(k);
                    printwriter.print(s);
                    printwriter.print("  #");
                    printwriter.print(k);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor.toString());
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
                    filedescriptor = (BackStackRecord)mBackStack.get(l);
                    printwriter.print(s);
                    printwriter.print("  #");
                    printwriter.print(l);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor.toString());
                    filedescriptor.dump$ec96877(s1, printwriter);
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
                for (int j1 = 0; j1 < l2; j1++)
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
        break MISSING_BLOCK_LABEL_696;
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
            break MISSING_BLOCK_LABEL_140;
        }
        this;
        JVM INSTR monitorexit ;
        int k;
        if (!mHavePendingDeferredStart)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        k = 0;
        for (int i = 0; i < mActive.size();)
        {
            Object obj = (Fragment)mActive.get(i);
            int l = k;
            if (obj != null)
            {
                l = k;
                if (((Fragment) (obj)).mLoaderManager != null)
                {
                    obj = ((Fragment) (obj)).mLoaderManager;
                    l = k | 0;
                }
            }
            i++;
            k = l;
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

        break MISSING_BLOCK_LABEL_249;
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

    public final List getFragments()
    {
        return mActive;
    }

    public final void hideFragment(Fragment fragment, int i, int j)
    {
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
            Fragment.onHiddenChanged$1385ff();
        }
    }

    public final boolean isDestroyed()
    {
        return mDestroyed;
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
                boolean flag1 = false;
                for (int l = 0; l < mActive.size();)
                {
                    Object obj = (Fragment)mActive.get(l);
                    boolean flag2 = flag1;
                    if (obj != null)
                    {
                        moveToState(((Fragment) (obj)), i, j, k, false);
                        flag2 = flag1;
                        if (((Fragment) (obj)).mLoaderManager != null)
                        {
                            obj = ((Fragment) (obj)).mLoaderManager;
                            flag2 = flag1 | false;
                        }
                    }
                    l++;
                    flag1 = flag2;
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
    //                   1 650
    //                   2 1134
    //                   3 1134
    //                   4 1249;
           goto _L3 _L4 _L5 _L6 _L6 _L7
_L3:
        i1 = i;
_L16:
        fragment.mState = i1;
        return;
_L4:
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
            Object obj = fragment.mSavedFragmentState;
            if (fragment.mChildFragmentManager != null)
            {
                fragment.mChildFragmentManager.mStateSaved = false;
            }
            fragment.mCalled = false;
            fragment.onCreate(((Bundle) (obj)));
            if (!fragment.mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onCreate()").toString());
            }
            if (obj != null)
            {
                obj = ((Bundle) (obj)).getParcelable("android:support:fragments");
                if (obj != null)
                {
                    if (fragment.mChildFragmentManager == null)
                    {
                        fragment.instantiateChildFragmentManager();
                    }
                    fragment.mChildFragmentManager.restoreAllState(((Parcelable) (obj)), null);
                    fragment.mChildFragmentManager.dispatchCreate();
                }
            }
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
                Object obj2;
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    ViewCompat.setSaveFromParentEnabled$53599cc9(fragment.mView);
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
            if (!fragment.mFromLayout)
            {
                obj1 = null;
                if (fragment.mContainerId != 0)
                {
                    obj2 = (ViewGroup)mContainer.findViewById(fragment.mContainerId);
                    obj1 = obj2;
                    if (obj2 == null)
                    {
                        obj1 = obj2;
                        if (!fragment.mRestored)
                        {
                            throwException(new IllegalArgumentException((new StringBuilder("No view found for id 0x")).append(Integer.toHexString(fragment.mContainerId)).append(" (").append(fragment.getResources().getResourceName(fragment.mContainerId)).append(") for fragment ").append(fragment).toString()));
                            obj1 = obj2;
                        }
                    }
                }
                fragment.mContainer = ((ViewGroup) (obj1));
                fragment.mView = fragment.performCreateView(fragment.getLayoutInflater(fragment.mSavedFragmentState), ((ViewGroup) (obj1)), fragment.mSavedFragmentState);
                if (fragment.mView != null)
                {
                    fragment.mInnerView = fragment.mView;
                    if (android.os.Build.VERSION.SDK_INT >= 11)
                    {
                        ViewCompat.setSaveFromParentEnabled$53599cc9(fragment.mView);
                    } else
                    {
                        fragment.mView = NoSaveStateFrameLayout.wrap(fragment.mView);
                    }
                    if (obj1 != null)
                    {
                        obj2 = loadAnimation(fragment, j, true, k);
                        if (obj2 != null)
                        {
                            fragment.mView.startAnimation(((Animation) (obj2)));
                        }
                        ((ViewGroup) (obj1)).addView(fragment.mView);
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
            obj1 = fragment.mSavedFragmentState;
            if (fragment.mChildFragmentManager != null)
            {
                fragment.mChildFragmentManager.mStateSaved = false;
            }
            fragment.mCalled = false;
            fragment.onActivityCreated(((Bundle) (obj1)));
            if (!fragment.mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onActivityCreated()").toString());
            }
            if (fragment.mChildFragmentManager != null)
            {
                fragment.mChildFragmentManager.dispatchActivityCreated();
            }
            if (fragment.mView != null)
            {
                Bundle bundle = fragment.mSavedFragmentState;
                if (fragment.mSavedViewState != null)
                {
                    fragment.mInnerView.restoreHierarchyState(fragment.mSavedViewState);
                    fragment.mSavedViewState = null;
                }
                fragment.mCalled = false;
                fragment.onViewStateRestored(bundle);
                if (!fragment.mCalled)
                {
                    throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onViewStateRestored()").toString());
                }
            }
            fragment.mSavedFragmentState = null;
            l1 = i1;
        }
_L6:
        k1 = l1;
        if (l1 > 3)
        {
            if (fragment.mChildFragmentManager != null)
            {
                fragment.mChildFragmentManager.mStateSaved = false;
                fragment.mChildFragmentManager.execPendingActions();
            }
            fragment.mCalled = false;
            fragment.onStart();
            if (!fragment.mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onStart()").toString());
            }
            if (fragment.mChildFragmentManager != null)
            {
                fragment.mChildFragmentManager.dispatchStart();
            }
            k1 = l1;
            if (fragment.mLoaderManager != null)
            {
                LoaderManagerImpl loadermanagerimpl = fragment.mLoaderManager;
                k1 = l1;
            }
        }
_L7:
        i1 = k1;
        if (k1 > 4)
        {
            fragment.mResumed = true;
            if (fragment.mChildFragmentManager != null)
            {
                fragment.mChildFragmentManager.mStateSaved = false;
                fragment.mChildFragmentManager.execPendingActions();
            }
            fragment.mCalled = false;
            fragment.onResume();
            if (!fragment.mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onResume()").toString());
            }
            if (fragment.mChildFragmentManager != null)
            {
                fragment.mChildFragmentManager.dispatchResume();
                fragment.mChildFragmentManager.execPendingActions();
            }
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
        JVM INSTR tableswitch 1 5: default 1424
    //                   1 1430
    //                   2 1706
    //                   3 1623
    //                   4 1557
    //                   5 1485;
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
            View view = fragment.mAnimatingAway;
            fragment.mAnimatingAway = null;
            view.clearAnimation();
        }
        if (fragment.mAnimatingAway != null)
        {
            fragment.mStateAfterAnimating = i;
            i1 = 1;
            break; /* Loop/switch isn't completed */
        }
        break; /* Loop/switch isn't completed */
_L13:
        if (i < 5)
        {
            if (fragment.mChildFragmentManager != null)
            {
                fragment.mChildFragmentManager.moveToState$2563266(4);
            }
            fragment.mCalled = false;
            fragment.onPause();
            if (!fragment.mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onPause()").toString());
            }
            fragment.mResumed = false;
        }
_L12:
        if (i < 4)
        {
            if (fragment.mChildFragmentManager != null)
            {
                fragment.mChildFragmentManager.dispatchStop();
            }
            fragment.mCalled = false;
            fragment.onStop();
            if (!fragment.mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onStop()").toString());
            }
        }
_L11:
        if (i < 3)
        {
            if (fragment.mChildFragmentManager != null)
            {
                fragment.mChildFragmentManager.moveToState$2563266(2);
            }
            if (fragment.mLoadersStarted)
            {
                fragment.mLoadersStarted = false;
                if (!fragment.mCheckedForLoaderManager)
                {
                    fragment.mCheckedForLoaderManager = true;
                    fragment.mLoaderManager = fragment.mActivity.getLoaderManager$2cd5ab55(fragment.mWho);
                }
                if (fragment.mLoaderManager != null)
                {
                    if (!fragment.mActivity.mRetaining)
                    {
                        fragment.mLoaderManager.doStop();
                    } else
                    {
                        fragment.mLoaderManager.doRetain();
                    }
                }
            }
        }
_L10:
        if (i < 2)
        {
            if (fragment.mView != null && !mActivity.isFinishing() && fragment.mSavedViewState == null)
            {
                saveFragmentViewState(fragment);
            }
            if (fragment.mChildFragmentManager != null)
            {
                fragment.mChildFragmentManager.moveToState$2563266(1);
            }
            fragment.mCalled = false;
            fragment.onDestroyView();
            if (!fragment.mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onDestroyView()").toString());
            }
            LoaderManagerImpl loadermanagerimpl1;
            if (fragment.mLoaderManager != null)
            {
                loadermanagerimpl1 = fragment.mLoaderManager;
            }
            if (fragment.mView != null && fragment.mContainer != null)
            {
                Object obj3 = null;
                Animation animation = obj3;
                if (mCurState > 0)
                {
                    animation = obj3;
                    if (!mDestroyed)
                    {
                        animation = loadAnimation(fragment, j, false, k);
                    }
                }
                if (animation != null)
                {
                    fragment.mAnimatingAway = fragment.mView;
                    fragment.mStateAfterAnimating = i;
                    animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                        final FragmentManagerImpl this$0;
                        final Fragment val$fragment;

                        public final void onAnimationEnd(Animation animation1)
                        {
                            if (fragment.mAnimatingAway != null)
                            {
                                fragment.mAnimatingAway = null;
                                moveToState(fragment, fragment.mStateAfterAnimating, 0, 0, false);
                            }
                        }

                        public final void onAnimationRepeat(Animation animation1)
                        {
                        }

                        public final void onAnimationStart(Animation animation1)
                        {
                        }

            
            {
                this$0 = FragmentManagerImpl.this;
                fragment = fragment1;
                super();
            }
                    });
                    fragment.mView.startAnimation(animation);
                }
                fragment.mContainer.removeView(fragment.mView);
            }
            fragment.mContainer = null;
            fragment.mView = null;
            fragment.mInnerView = null;
        }
        if (true) goto _L9; else goto _L14
_L14:
        if (!fragment.mRetaining)
        {
            if (fragment.mChildFragmentManager != null)
            {
                fragment.mChildFragmentManager.dispatchDestroy();
            }
            fragment.mCalled = false;
            fragment.mCalled = true;
            if (!fragment.mCheckedForLoaderManager)
            {
                fragment.mCheckedForLoaderManager = true;
                fragment.mLoaderManager = fragment.mActivity.getLoaderManager$2cd5ab55(fragment.mWho);
            }
            if (fragment.mLoaderManager != null)
            {
                fragment.mLoaderManager.doDestroy();
            }
            if (!fragment.mCalled)
            {
                throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onDestroy()").toString());
            }
        }
        fragment.mCalled = false;
        fragment.onDetach();
        if (!fragment.mCalled)
        {
            throw new SuperNotCalledException((new StringBuilder("Fragment ")).append(fragment).append(" did not call through to super.onDetach()").toString());
        }
        i1 = i;
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!fragment.mRetaining)
        {
            i1 = i;
            if (fragment.mIndex >= 0)
            {
                mActive.set(fragment.mIndex, null);
                if (mAvailIndices == null)
                {
                    mAvailIndices = new ArrayList();
                }
                mAvailIndices.add(Integer.valueOf(fragment.mIndex));
                FragmentActivity fragmentactivity = mActivity;
                String s = fragment.mWho;
                if (fragmentactivity.mAllLoaderManagers != null)
                {
                    LoaderManagerImpl loadermanagerimpl2 = (LoaderManagerImpl)fragmentactivity.mAllLoaderManagers.get(s);
                    if (loadermanagerimpl2 != null && !loadermanagerimpl2.mRetaining)
                    {
                        loadermanagerimpl2.doDestroy();
                        fragmentactivity.mAllLoaderManagers.remove(s);
                    }
                }
                fragment.mIndex = -1;
                fragment.mWho = null;
                fragment.mAdded = false;
                fragment.mRemoving = false;
                fragment.mResumed = false;
                fragment.mFromLayout = false;
                fragment.mInLayout = false;
                fragment.mRestored = false;
                fragment.mBackStackNesting = 0;
                fragment.mFragmentManager = null;
                fragment.mChildFragmentManager = null;
                fragment.mActivity = null;
                fragment.mFragmentId = 0;
                fragment.mContainerId = 0;
                fragment.mTag = null;
                fragment.mHidden = false;
                fragment.mDetached = false;
                fragment.mRetaining = false;
                fragment.mLoaderManager = null;
                fragment.mLoadersStarted = false;
                fragment.mCheckedForLoaderManager = false;
                i1 = i;
            }
        } else
        {
            fragment.mActivity = null;
            fragment.mParentFragment = null;
            fragment.mFragmentManager = null;
            fragment.mChildFragmentManager = null;
            i1 = i;
        }
        if (true) goto _L16; else goto _L15
_L15:
    }

    final void moveToState$2563266(int i)
    {
        moveToState(i, 0, 0, false);
    }

    public final View onCreateView(View view, String s, Context context, AttributeSet attributeset)
    {
        if ("fragment".equals(s))
        {
            s = attributeset.getAttributeValue(null, "class");
            TypedArray typedarray = context.obtainStyledAttributes(attributeset, FragmentTag.Fragment);
            String s1 = s;
            if (s == null)
            {
                s1 = typedarray.getString(0);
            }
            int k = typedarray.getResourceId(1, -1);
            String s2 = typedarray.getString(2);
            typedarray.recycle();
            if (Fragment.isSupportFragmentClass(mActivity, s1))
            {
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
                    view = findFragmentById(k);
                } else
                {
                    view = null;
                }
                s = view;
                if (view == null)
                {
                    s = view;
                    if (s2 != null)
                    {
                        s = findFragmentByTag(s2);
                    }
                }
                view = s;
                if (s == null)
                {
                    view = s;
                    if (i != -1)
                    {
                        view = findFragmentById(i);
                    }
                }
                if (view == null)
                {
                    s = Fragment.instantiate(context, s1);
                    s.mFromLayout = true;
                    int j;
                    if (k != 0)
                    {
                        j = k;
                    } else
                    {
                        j = i;
                    }
                    s.mFragmentId = j;
                    s.mContainerId = i;
                    s.mTag = s2;
                    s.mInLayout = true;
                    s.mFragmentManager = this;
                    view = ((Fragment) (s)).mSavedFragmentState;
                    s.mCalled = true;
                    addFragment(s, true);
                } else
                {
                    if (((Fragment) (view)).mInLayout)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Duplicate id 0x").append(Integer.toHexString(k)).append(", tag ").append(s2).append(", or parent id 0x").append(Integer.toHexString(i)).append(" with another fragment for ").append(s1).toString());
                    }
                    view.mInLayout = true;
                    s = view;
                    if (!((Fragment) (view)).mRetaining)
                    {
                        s = ((Fragment) (view)).mSavedFragmentState;
                        view.mCalled = true;
                        s = view;
                    }
                }
                if (mCurState <= 0 && ((Fragment) (s)).mFromLayout)
                {
                    moveToState(s, 1, 0, 0, false);
                } else
                {
                    moveToState(s);
                }
                if (((Fragment) (s)).mView == null)
                {
                    throw new IllegalStateException((new StringBuilder("Fragment ")).append(s1).append(" did not create a view.").toString());
                }
                if (k != 0)
                {
                    ((Fragment) (s)).mView.setId(k);
                }
                if (((Fragment) (s)).mView.getTag() == null)
                {
                    ((Fragment) (s)).mView.setTag(s2);
                }
                return ((Fragment) (s)).mView;
            }
        }
        return null;
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

    public final void popBackStack$255f295(final int id)
    {
        if (id < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad id: ")).append(id).toString());
        } else
        {
            enqueueAction(new Runnable() {

                final FragmentManagerImpl this$0;
                final int val$flags = 1;
                final int val$id;

                public final void run()
                {
                    FragmentManagerImpl fragmentmanagerimpl = FragmentManagerImpl.this;
                    FragmentActivity fragmentactivity = mActivity;
                    fragmentmanagerimpl.popBackStackState$68507953$44bd8ea3(id, flags);
                }

            
            {
                this$0 = FragmentManagerImpl.this;
                id = i;
                super();
            }
            }, false);
            return;
        }
    }

    final boolean popBackStackState$68507953$44bd8ea3(int i, int j)
    {
        if (mBackStack != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (i >= 0 || (j & 1) != 0) goto _L4; else goto _L3
_L3:
        if ((i = mBackStack.size() - 1) < 0) goto _L1; else goto _L5
_L5:
        BackStackRecord backstackrecord = (BackStackRecord)mBackStack.remove(i);
        SparseArray sparsearray = new SparseArray();
        SparseArray sparsearray1 = new SparseArray();
        backstackrecord.calculateBackFragments(sparsearray, sparsearray1);
        backstackrecord.popFromBackStack(true, null, sparsearray, sparsearray1);
_L8:
        return true;
_L4:
        int k;
        int l;
        k = -1;
        if (i < 0)
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
            BackStackRecord backstackrecord1 = (BackStackRecord)mBackStack.get(l);
            if (i >= 0 && i == backstackrecord1.mIndex)
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
                BackStackRecord backstackrecord2 = (BackStackRecord)mBackStack.get(j);
                k = j;
                if (i < 0)
                {
                    break;
                }
                k = j;
                if (i != backstackrecord2.mIndex)
                {
                    break;
                }
                j--;
            } while (true);
        }
        if (k == mBackStack.size() - 1) goto _L1; else goto _L7
_L7:
        ArrayList arraylist = new ArrayList();
        for (i = mBackStack.size() - 1; i > k; i--)
        {
            arraylist.add(mBackStack.remove(i));
        }

        j = arraylist.size() - 1;
        SparseArray sparsearray2 = new SparseArray();
        SparseArray sparsearray3 = new SparseArray();
        for (i = 0; i <= j; i++)
        {
            ((BackStackRecord)arraylist.get(i)).calculateBackFragments(sparsearray2, sparsearray3);
        }

        BackStackRecord.TransitionState transitionstate = null;
        i = 0;
        while (i <= j) 
        {
            BackStackRecord backstackrecord3 = (BackStackRecord)arraylist.get(i);
            boolean flag;
            if (i == j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            transitionstate = backstackrecord3.popFromBackStack(flag, transitionstate, sparsearray2, sparsearray3);
            i++;
        }
          goto _L8
    }

    public final void removeFragment(Fragment fragment, int i, int j)
    {
        int k;
        if (fragment.mBackStackNesting > 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k == 0)
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

    final void restoreAllState(Parcelable parcelable, ArrayList arraylist)
    {
        if (parcelable != null) goto _L2; else goto _L1
_L1:
        FragmentManagerState fragmentmanagerstate;
        return;
_L2:
        if ((fragmentmanagerstate = (FragmentManagerState)parcelable).mActive != null)
        {
            if (arraylist != null)
            {
                for (int i = 0; i < arraylist.size(); i++)
                {
                    parcelable = (Fragment)arraylist.get(i);
                    FragmentState fragmentstate = fragmentmanagerstate.mActive[((Fragment) (parcelable)).mIndex];
                    fragmentstate.mInstance = parcelable;
                    parcelable.mSavedViewState = null;
                    parcelable.mBackStackNesting = 0;
                    parcelable.mInLayout = false;
                    parcelable.mAdded = false;
                    parcelable.mTarget = null;
                    if (fragmentstate.mSavedFragmentState != null)
                    {
                        fragmentstate.mSavedFragmentState.setClassLoader(mActivity.getClassLoader());
                        parcelable.mSavedViewState = fragmentstate.mSavedFragmentState.getSparseParcelableArray("android:view_state");
                        parcelable.mSavedFragmentState = fragmentstate.mSavedFragmentState;
                    }
                }

            }
            mActive = new ArrayList(fragmentmanagerstate.mActive.length);
            if (mAvailIndices != null)
            {
                mAvailIndices.clear();
            }
            int j = 0;
            while (j < fragmentmanagerstate.mActive.length) 
            {
                FragmentState fragmentstate1 = fragmentmanagerstate.mActive[j];
                if (fragmentstate1 != null)
                {
                    parcelable = mActivity;
                    Fragment fragment = mParent;
                    if (fragmentstate1.mInstance != null)
                    {
                        parcelable = fragmentstate1.mInstance;
                    } else
                    {
                        if (fragmentstate1.mArguments != null)
                        {
                            fragmentstate1.mArguments.setClassLoader(parcelable.getClassLoader());
                        }
                        fragmentstate1.mInstance = Fragment.instantiate(parcelable, fragmentstate1.mClassName, fragmentstate1.mArguments);
                        if (fragmentstate1.mSavedFragmentState != null)
                        {
                            fragmentstate1.mSavedFragmentState.setClassLoader(parcelable.getClassLoader());
                            fragmentstate1.mInstance.mSavedFragmentState = fragmentstate1.mSavedFragmentState;
                        }
                        fragmentstate1.mInstance.setIndex(fragmentstate1.mIndex, fragment);
                        fragmentstate1.mInstance.mFromLayout = fragmentstate1.mFromLayout;
                        fragmentstate1.mInstance.mRestored = true;
                        fragmentstate1.mInstance.mFragmentId = fragmentstate1.mFragmentId;
                        fragmentstate1.mInstance.mContainerId = fragmentstate1.mContainerId;
                        fragmentstate1.mInstance.mTag = fragmentstate1.mTag;
                        fragmentstate1.mInstance.mRetainInstance = fragmentstate1.mRetainInstance;
                        fragmentstate1.mInstance.mDetached = fragmentstate1.mDetached;
                        fragmentstate1.mInstance.mFragmentManager = ((FragmentActivity) (parcelable)).mFragments;
                        parcelable = fragmentstate1.mInstance;
                    }
                    mActive.add(parcelable);
                    fragmentstate1.mInstance = null;
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
                    parcelable = (Fragment)arraylist.get(k);
                    if (((Fragment) (parcelable)).mTargetIndex >= 0)
                    {
                        if (((Fragment) (parcelable)).mTargetIndex < mActive.size())
                        {
                            parcelable.mTarget = (Fragment)mActive.get(((Fragment) (parcelable)).mTargetIndex);
                        } else
                        {
                            Log.w("FragmentManager", (new StringBuilder("Re-attaching retained fragment ")).append(parcelable).append(" target no longer exists: ").append(((Fragment) (parcelable)).mTargetIndex).toString());
                            parcelable.mTarget = null;
                        }
                    }
                    k++;
                }
            }
            if (fragmentmanagerstate.mAdded != null)
            {
                mAdded = new ArrayList(fragmentmanagerstate.mAdded.length);
                for (int l = 0; l < fragmentmanagerstate.mAdded.length; l++)
                {
                    parcelable = (Fragment)mActive.get(fragmentmanagerstate.mAdded[l]);
                    if (parcelable == null)
                    {
                        throwException(new IllegalStateException((new StringBuilder("No instantiated fragment for index #")).append(fragmentmanagerstate.mAdded[l]).toString()));
                    }
                    parcelable.mAdded = true;
                    if (mAdded.contains(parcelable))
                    {
                        throw new IllegalStateException("Already added!");
                    }
                    mAdded.add(parcelable);
                }

            } else
            {
                mAdded = null;
            }
            if (fragmentmanagerstate.mBackStack != null)
            {
                mBackStack = new ArrayList(fragmentmanagerstate.mBackStack.length);
                int i1 = 0;
                while (i1 < fragmentmanagerstate.mBackStack.length) 
                {
                    parcelable = fragmentmanagerstate.mBackStack[i1].instantiate(this);
                    mBackStack.add(parcelable);
                    if (((BackStackRecord) (parcelable)).mIndex >= 0)
                    {
                        setBackStackIndex(((BackStackRecord) (parcelable)).mIndex, parcelable);
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

    final Parcelable saveAllState()
    {
        execPendingActions();
        if (HONEYCOMB)
        {
            mStateSaved = true;
        }
        if (mActive == null || mActive.size() <= 0)
        {
            return null;
        }
        int j1 = mActive.size();
        FragmentState afragmentstate[] = new FragmentState[j1];
        boolean flag = false;
        int i = 0;
        while (i < j1) 
        {
            Fragment fragment1 = (Fragment)mActive.get(i);
            if (fragment1 != null)
            {
                if (fragment1.mIndex < 0)
                {
                    throwException(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(fragment1).append(" has cleared index: ").append(fragment1.mIndex).toString()));
                }
                boolean flag1 = true;
                FragmentState fragmentstate = new FragmentState(fragment1);
                afragmentstate[i] = fragmentstate;
                if (fragment1.mState > 0 && fragmentstate.mSavedFragmentState == null)
                {
                    Bundle bundle2 = null;
                    if (mStateBundle == null)
                    {
                        mStateBundle = new Bundle();
                    }
                    fragment1.performSaveInstanceState(mStateBundle);
                    if (!mStateBundle.isEmpty())
                    {
                        bundle2 = mStateBundle;
                        mStateBundle = null;
                    }
                    if (fragment1.mView != null)
                    {
                        saveFragmentViewState(fragment1);
                    }
                    Bundle bundle = bundle2;
                    if (fragment1.mSavedViewState != null)
                    {
                        bundle = bundle2;
                        if (bundle2 == null)
                        {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", fragment1.mSavedViewState);
                    }
                    bundle2 = bundle;
                    if (!fragment1.mUserVisibleHint)
                    {
                        bundle2 = bundle;
                        if (bundle == null)
                        {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", fragment1.mUserVisibleHint);
                    }
                    fragmentstate.mSavedFragmentState = bundle2;
                    flag = flag1;
                    if (fragment1.mTarget != null)
                    {
                        if (fragment1.mTarget.mIndex < 0)
                        {
                            throwException(new IllegalStateException((new StringBuilder("Failure saving state: ")).append(fragment1).append(" has target not in fragment manager: ").append(fragment1.mTarget).toString()));
                        }
                        if (fragmentstate.mSavedFragmentState == null)
                        {
                            fragmentstate.mSavedFragmentState = new Bundle();
                        }
                        Bundle bundle1 = fragmentstate.mSavedFragmentState;
                        Fragment fragment = fragment1.mTarget;
                        if (fragment.mIndex < 0)
                        {
                            throwException(new IllegalStateException((new StringBuilder("Fragment ")).append(fragment).append(" is not currently in the FragmentManager").toString()));
                        }
                        bundle1.putInt("android:target_state", fragment.mIndex);
                        flag = flag1;
                        if (fragment1.mTargetRequestCode != 0)
                        {
                            fragmentstate.mSavedFragmentState.putInt("android:target_req_state", fragment1.mTargetRequestCode);
                            flag = flag1;
                        }
                    }
                } else
                {
                    fragmentstate.mSavedFragmentState = fragment1.mSavedFragmentState;
                    flag = flag1;
                }
            }
            i++;
        }
        if (!flag)
        {
            return null;
        }
        Object aobj[] = null;
        FragmentManagerState fragmentmanagerstate = null;
        int ai[] = ((int []) (aobj));
        if (mAdded != null)
        {
            int l = mAdded.size();
            ai = ((int []) (aobj));
            if (l > 0)
            {
                aobj = new int[l];
                int j = 0;
                do
                {
                    ai = ((int []) (aobj));
                    if (j >= l)
                    {
                        break;
                    }
                    aobj[j] = ((Fragment)mAdded.get(j)).mIndex;
                    if (aobj[j] < 0)
                    {
                        throwException(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(mAdded.get(j)).append(" has cleared index: ").append(aobj[j]).toString()));
                    }
                    j++;
                } while (true);
            }
        }
        aobj = fragmentmanagerstate;
        if (mBackStack != null)
        {
            int i1 = mBackStack.size();
            aobj = fragmentmanagerstate;
            if (i1 > 0)
            {
                BackStackState abackstackstate[] = new BackStackState[i1];
                int k = 0;
                do
                {
                    aobj = abackstackstate;
                    if (k >= i1)
                    {
                        break;
                    }
                    abackstackstate[k] = new BackStackState((BackStackRecord)mBackStack.get(k));
                    k++;
                } while (true);
            }
        }
        abackstackstate = new FragmentManagerState();
        abackstackstate.mActive = afragmentstate;
        abackstackstate.mAdded = ai;
        abackstackstate.mBackStack = ((BackStackState []) (aobj));
        return abackstackstate;
    }

    public final void showFragment(Fragment fragment, int i, int j)
    {
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
            Fragment.onHiddenChanged$1385ff();
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
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        }
        HONEYCOMB = flag;
    }
}
