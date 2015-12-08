// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import R;
import T;
import Y;
import Z;
import aD;
import aE;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            Fragment

public class FragmentActivity extends Activity
{
    static final class a
    {

        ArrayList a;
        aD b;

        a()
        {
        }
    }


    static final String FRAGMENTS_TAG = "android:support:fragments";
    private static final int HONEYCOMB = 11;
    static final int MSG_REALLY_STOPPED = 1;
    static final int MSG_RESUME_PENDING = 2;
    private static final String TAG = "FragmentActivity";
    aD mAllLoaderManagers;
    boolean mCheckedForLoaderManager;
    final R mContainer = new R() {

        private FragmentActivity a;

        public final View a(int i)
        {
            return a.findViewById(i);
        }

        public final boolean a()
        {
            Window window = a.getWindow();
            return window != null && window.peekDecorView() != null;
        }

            
            {
                a = FragmentActivity.this;
                super();
            }
    };
    boolean mCreated;
    public final T mFragments = new T();
    public final Handler mHandler = new Handler() {

        private FragmentActivity a;

        public final void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 1 2: default 28
        //                       1 34
        //                       2 53;
               goto _L1 _L2 _L3
_L1:
            super.handleMessage(message);
_L5:
            return;
_L2:
            if (!a.mStopped) goto _L5; else goto _L4
_L4:
            a.a(false);
            return;
_L3:
            a.mFragments.n();
            a.mFragments.h();
            return;
        }

            
            {
                a = FragmentActivity.this;
                super();
            }
    };
    Z mLoaderManager;
    boolean mLoadersStarted;
    boolean mOptionsMenuInvalidated;
    boolean mReallyStopped;
    boolean mResumed;
    boolean mRetaining;
    boolean mStopped;

    public FragmentActivity()
    {
    }

    private static String a(View view)
    {
        byte byte0;
        byte byte1;
        StringBuilder stringbuilder;
        byte1 = 70;
        byte0 = 46;
        stringbuilder = new StringBuilder(128);
        stringbuilder.append(view.getClass().getName());
        stringbuilder.append('{');
        stringbuilder.append(Integer.toHexString(System.identityHashCode(view)));
        stringbuilder.append(' ');
        view.getVisibility();
        JVM INSTR lookupswitch 3: default 100
    //                   0: 523
    //                   4: 534
    //                   8: 545;
           goto _L1 _L2 _L3 _L4
_L1:
        stringbuilder.append('.');
_L11:
        char c;
        Object obj;
        String s;
        int i;
        if (view.isFocusable())
        {
            c = 'F';
        } else
        {
            c = '.';
        }
        stringbuilder.append(c);
        if (view.isEnabled())
        {
            c = 'E';
        } else
        {
            c = '.';
        }
        stringbuilder.append(c);
        if (view.willNotDraw())
        {
            c = '.';
        } else
        {
            c = 'D';
        }
        stringbuilder.append(c);
        if (view.isHorizontalScrollBarEnabled())
        {
            c = 'H';
        } else
        {
            c = '.';
        }
        stringbuilder.append(c);
        if (view.isVerticalScrollBarEnabled())
        {
            c = 'V';
        } else
        {
            c = '.';
        }
        stringbuilder.append(c);
        if (view.isClickable())
        {
            c = 'C';
        } else
        {
            c = '.';
        }
        stringbuilder.append(c);
        if (view.isLongClickable())
        {
            c = 'L';
        } else
        {
            c = '.';
        }
        stringbuilder.append(c);
        stringbuilder.append(' ');
        if (view.isFocused())
        {
            c = byte1;
        } else
        {
            c = '.';
        }
        stringbuilder.append(c);
        if (view.isSelected())
        {
            c = 'S';
        } else
        {
            c = '.';
        }
        stringbuilder.append(c);
        c = byte0;
        if (view.isPressed())
        {
            c = 'P';
        }
        stringbuilder.append(c);
        stringbuilder.append(' ');
        stringbuilder.append(view.getLeft());
        stringbuilder.append(',');
        stringbuilder.append(view.getTop());
        stringbuilder.append('-');
        stringbuilder.append(view.getRight());
        stringbuilder.append(',');
        stringbuilder.append(view.getBottom());
        i = view.getId();
        if (i == -1) goto _L6; else goto _L5
_L5:
        stringbuilder.append(" #");
        stringbuilder.append(Integer.toHexString(i));
        obj = view.getResources();
        if (i == 0 || obj == null) goto _L6; else goto _L7
_L7:
        0xff000000 & i;
        JVM INSTR lookupswitch 2: default 436
    //                   16777216: 616
    //                   2130706432: 610;
           goto _L8 _L9 _L10
_L8:
        view = ((Resources) (obj)).getResourcePackageName(i);
_L12:
        s = ((Resources) (obj)).getResourceTypeName(i);
        obj = ((Resources) (obj)).getResourceEntryName(i);
        stringbuilder.append(" ");
        stringbuilder.append(view);
        stringbuilder.append(":");
        stringbuilder.append(s);
        stringbuilder.append("/");
        stringbuilder.append(((String) (obj)));
_L6:
        stringbuilder.append("}");
        return stringbuilder.toString();
_L2:
        stringbuilder.append('V');
          goto _L11
_L3:
        stringbuilder.append('I');
          goto _L11
_L4:
        stringbuilder.append('G');
          goto _L11
_L10:
        view = "app";
          goto _L12
_L9:
        view = "android";
          goto _L12
        view;
          goto _L6
    }

    private void a(String s, PrintWriter printwriter, View view)
    {
        printwriter.print(s);
        if (view != null) goto _L2; else goto _L1
_L1:
        printwriter.println("null");
_L4:
        return;
_L2:
        printwriter.println(a(view));
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int j = view.getChildCount();
            if (j > 0)
            {
                s = (new StringBuilder()).append(s).append("  ").toString();
                int i = 0;
                while (i < j) 
                {
                    a(s, printwriter, view.getChildAt(i));
                    i++;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void Z_()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            invalidateOptionsMenu();
            return;
        } else
        {
            mOptionsMenuInvalidated = true;
            return;
        }
    }

    final Z a(String s, boolean flag, boolean flag1)
    {
        if (mAllLoaderManagers == null)
        {
            mAllLoaderManagers = new aD();
        }
        Z z = (Z)mAllLoaderManagers.get(s);
        if (z == null)
        {
            if (flag1)
            {
                z = new Z(s, this, flag);
                mAllLoaderManagers.put(s, z);
            }
            return z;
        } else
        {
            z.d = this;
            return z;
        }
    }

    public final void a(Fragment fragment, Intent intent, int i)
    {
        if (i == -1)
        {
            super.startActivityForResult(intent, -1);
            return;
        }
        if ((0xffff0000 & i) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        } else
        {
            super.startActivityForResult(intent, (fragment.mIndex + 1 << 16) + (0xffff & i));
            return;
        }
    }

    public final void a(String s)
    {
        if (mAllLoaderManagers != null)
        {
            Z z = (Z)mAllLoaderManagers.get(s);
            if (z != null && !z.f)
            {
                z.g();
                mAllLoaderManagers.remove(s);
            }
        }
    }

    final void a(boolean flag)
    {
        if (!mReallyStopped)
        {
            mReallyStopped = true;
            mRetaining = flag;
            mHandler.removeMessages(1);
            if (mLoadersStarted)
            {
                mLoadersStarted = false;
                if (mLoaderManager != null)
                {
                    if (!mRetaining)
                    {
                        mLoaderManager.c();
                    } else
                    {
                        mLoaderManager.d();
                    }
                }
            }
            mFragments.d(2);
        }
    }

    public final Y b()
    {
        if (mLoaderManager != null)
        {
            return mLoaderManager;
        } else
        {
            mCheckedForLoaderManager = true;
            mLoaderManager = a("(root)", mLoadersStarted, true);
            return mLoaderManager;
        }
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        int i = android.os.Build.VERSION.SDK_INT;
        printwriter.print(s);
        printwriter.print("Local FragmentActivity ");
        printwriter.print(Integer.toHexString(System.identityHashCode(this)));
        printwriter.println(" State:");
        String s1 = (new StringBuilder()).append(s).append("  ").toString();
        printwriter.print(s1);
        printwriter.print("mCreated=");
        printwriter.print(mCreated);
        printwriter.print("mResumed=");
        printwriter.print(mResumed);
        printwriter.print(" mStopped=");
        printwriter.print(mStopped);
        printwriter.print(" mReallyStopped=");
        printwriter.println(mReallyStopped);
        printwriter.print(s1);
        printwriter.print("mLoadersStarted=");
        printwriter.println(mLoadersStarted);
        if (mLoaderManager != null)
        {
            printwriter.print(s);
            printwriter.print("Loader Manager ");
            printwriter.print(Integer.toHexString(System.identityHashCode(mLoaderManager)));
            printwriter.println(":");
            mLoaderManager.a((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
        }
        mFragments.a(s, filedescriptor, printwriter, as);
        printwriter.print(s);
        printwriter.println("View Hierarchy:");
        a((new StringBuilder()).append(s).append("  ").toString(), printwriter, getWindow().getDecorView());
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        mFragments.i = false;
        int k = i >> 16;
        if (k != 0)
        {
            k--;
            if (mFragments.a == null || k < 0 || k >= mFragments.a.size())
            {
                (new StringBuilder("Activity result fragment index out of range: 0x")).append(Integer.toHexString(i));
                return;
            }
            Fragment fragment = (Fragment)mFragments.a.get(k);
            if (fragment == null)
            {
                (new StringBuilder("Activity result no fragment exists for index: 0x")).append(Integer.toHexString(i));
                return;
            } else
            {
                fragment.onActivityResult(0xffff & i, j, intent);
                return;
            }
        } else
        {
            super.onActivityResult(i, j, intent);
            return;
        }
    }

    public void onBackPressed()
    {
label0:
        {
            if (!mFragments.d())
            {
                if (android.os.Build.VERSION.SDK_INT < 21)
                {
                    break label0;
                }
                finishAfterTransition();
            }
            return;
        }
        finish();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        mFragments.a(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        mFragments.a(this, mContainer, null);
        if (getLayoutInflater().getFactory() == null)
        {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
        a a1 = (a)getLastNonConfigurationInstance();
        if (a1 != null)
        {
            mAllLoaderManagers = a1.b;
        }
        if (bundle != null)
        {
            android.os.Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            T t = mFragments;
            if (a1 != null)
            {
                bundle = a1.a;
            } else
            {
                bundle = null;
            }
            t.a(parcelable, bundle);
        }
        mFragments.k();
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        if (i == 0)
        {
            boolean flag = super.onCreatePanelMenu(i, menu);
            boolean flag1 = mFragments.a(menu, getMenuInflater());
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                return flag | flag1;
            } else
            {
                return true;
            }
        } else
        {
            return super.onCreatePanelMenu(i, menu);
        }
    }

    public View onCreateView(String s, Context context, AttributeSet attributeset)
    {
        View view;
        if (!"fragment".equals(s))
        {
            view = super.onCreateView(s, context, attributeset);
        } else
        {
            View view1 = mFragments.a(null, s, context, attributeset);
            view = view1;
            if (view1 == null)
            {
                return super.onCreateView(s, context, attributeset);
            }
        }
        return view;
    }

    public void onDestroy()
    {
        super.onDestroy();
        a(false);
        mFragments.p();
        if (mLoaderManager != null)
        {
            mLoaderManager.g();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (android.os.Build.VERSION.SDK_INT < 5 && i == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        mFragments.q();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(i, menuitem))
        {
            return true;
        }
        switch (i)
        {
        default:
            return false;

        case 0: // '\0'
            return mFragments.a(menuitem);

        case 6: // '\006'
            return mFragments.b(menuitem);
        }
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        mFragments.i = false;
    }

    public void onPanelClosed(int i, Menu menu)
    {
        i;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 27;
           goto _L1 _L2
_L1:
        super.onPanelClosed(i, menu);
        return;
_L2:
        mFragments.b(menu);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onPause()
    {
        super.onPause();
        mResumed = false;
        if (mHandler.hasMessages(2))
        {
            mHandler.removeMessages(2);
            mFragments.n();
        }
        mFragments.d(4);
    }

    protected void onPostResume()
    {
        super.onPostResume();
        mHandler.removeMessages(2);
        mFragments.n();
        mFragments.h();
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        if (i == 0 && menu != null)
        {
            if (mOptionsMenuInvalidated)
            {
                mOptionsMenuInvalidated = false;
                menu.clear();
                onCreatePanelMenu(i, menu);
            }
            return super.onPreparePanel(0, view, menu) | mFragments.a(menu);
        } else
        {
            return super.onPreparePanel(i, view, menu);
        }
    }

    public void onResume()
    {
        super.onResume();
        mHandler.sendEmptyMessage(2);
        mResumed = true;
        mFragments.h();
    }

    public final Object onRetainNonConfigurationInstance()
    {
        boolean flag1 = false;
        if (mStopped)
        {
            a(true);
        }
        T t = mFragments;
        ArrayList arraylist1;
        if (t.a != null)
        {
            int i = 0;
            ArrayList arraylist = null;
            do
            {
                arraylist1 = arraylist;
                if (i >= t.a.size())
                {
                    break;
                }
                Fragment fragment = (Fragment)t.a.get(i);
                arraylist1 = arraylist;
                if (fragment != null)
                {
                    arraylist1 = arraylist;
                    if (fragment.mRetainInstance)
                    {
                        arraylist1 = arraylist;
                        if (arraylist == null)
                        {
                            arraylist1 = new ArrayList();
                        }
                        arraylist1.add(fragment);
                        fragment.mRetaining = true;
                        int k;
                        if (fragment.mTarget != null)
                        {
                            k = fragment.mTarget.mIndex;
                        } else
                        {
                            k = -1;
                        }
                        fragment.mTargetIndex = k;
                    }
                }
                i++;
                arraylist = arraylist1;
            } while (true);
        } else
        {
            arraylist1 = null;
        }
        if (mAllLoaderManagers != null)
        {
            int i1 = mAllLoaderManagers.size();
            Z az[] = new Z[i1];
            for (int j = i1 - 1; j >= 0; j--)
            {
                az[j] = (Z)mAllLoaderManagers.c(j);
            }

            boolean flag = false;
            int l = ((flag1) ? 1 : 0);
            do
            {
                flag1 = flag;
                if (l >= i1)
                {
                    break;
                }
                Z z = az[l];
                if (z.f)
                {
                    flag = true;
                } else
                {
                    z.g();
                    mAllLoaderManagers.remove(z.c);
                }
                l++;
            } while (true);
        } else
        {
            flag1 = false;
        }
        if (arraylist1 == null && !flag1)
        {
            return null;
        } else
        {
            a a1 = new a();
            a1.a = arraylist1;
            a1.b = mAllLoaderManagers;
            return a1;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        android.os.Parcelable parcelable = mFragments.j();
        if (parcelable != null)
        {
            bundle.putParcelable("android:support:fragments", parcelable);
        }
    }

    public void onStart()
    {
        super.onStart();
        mStopped = false;
        mReallyStopped = false;
        mHandler.removeMessages(1);
        if (!mCreated)
        {
            mCreated = true;
            mFragments.l();
        }
        mFragments.i = false;
        mFragments.h();
        if (!mLoadersStarted)
        {
            mLoadersStarted = true;
            int i;
            if (mLoaderManager != null)
            {
                mLoaderManager.b();
            } else
            if (!mCheckedForLoaderManager)
            {
                mLoaderManager = a("(root)", mLoadersStarted, false);
                if (mLoaderManager != null && !mLoaderManager.e)
                {
                    mLoaderManager.b();
                }
            }
            mCheckedForLoaderManager = true;
        }
        mFragments.m();
        if (mAllLoaderManagers != null)
        {
            int l = mAllLoaderManagers.size();
            Z az[] = new Z[l];
            for (i = l - 1; i >= 0; i--)
            {
                az[i] = (Z)mAllLoaderManagers.c(i);
            }

            for (int j = 0; j < l; j++)
            {
                Z z = az[j];
                if (z.f)
                {
                    z.f = false;
                    for (int k = z.a.a() - 1; k >= 0; k--)
                    {
                        Z.a a1 = (Z.a)z.a.d(k);
                        if (a1.h)
                        {
                            a1.h = false;
                            if (a1.g != a1.i && !a1.g)
                            {
                                a1.b();
                            }
                        }
                        if (a1.g && a1.d && !a1.j)
                        {
                            a1.b(a1.c, a1.f);
                        }
                    }

                }
                z.f();
            }

        }
    }

    public void onStop()
    {
        super.onStop();
        mStopped = true;
        mHandler.sendEmptyMessage(1);
        mFragments.o();
    }

    public void startActivityForResult(Intent intent, int i)
    {
        if (i != -1 && (0xffff0000 & i) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        } else
        {
            super.startActivityForResult(intent, i);
            return;
        }
    }
}
