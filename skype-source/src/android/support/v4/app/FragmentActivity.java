// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.util.i;
import android.util.AttributeSet;
import android.util.Log;
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
import java.util.List;

// Referenced classes of package android.support.v4.app:
//            g, j, a, Fragment, 
//            l, r, ah, k

public class FragmentActivity extends g
    implements a.a, c.a
{
    final class a extends k
    {

        final FragmentActivity a;

        public final View a(int i)
        {
            return a.findViewById(i);
        }

        public final void a(Fragment fragment)
        {
            a.onAttachFragment(fragment);
        }

        public final void a(Fragment fragment, Intent intent, int i)
        {
            a.startActivityFromFragment(fragment, intent, i);
        }

        public final void a(Fragment fragment, String as[], int i)
        {
            a.requestPermissionsFromFragment(fragment, as, i);
        }

        public final void a(String s, PrintWriter printwriter, String as[])
        {
            a.dump(s, null, printwriter, as);
        }

        public final boolean a()
        {
            Window window = a.getWindow();
            return window != null && window.peekDecorView() != null;
        }

        public final boolean a(String s)
        {
            FragmentActivity fragmentactivity = a;
            if (android.os.Build.VERSION.SDK_INT >= 23)
            {
                return fragmentactivity.shouldShowRequestPermissionRationale(s);
            } else
            {
                return false;
            }
        }

        public final boolean b()
        {
            return !a.isFinishing();
        }

        public final LayoutInflater c()
        {
            return a.getLayoutInflater().cloneInContext(a);
        }

        public final void d()
        {
            a.supportInvalidateOptionsMenu();
        }

        public final boolean e()
        {
            return a.getWindow() != null;
        }

        public final int f()
        {
            Window window = a.getWindow();
            if (window == null)
            {
                return 0;
            } else
            {
                return window.getAttributes().windowAnimations;
            }
        }

        public final volatile Object g()
        {
            return a;
        }

        public a()
        {
            a = FragmentActivity.this;
            super(FragmentActivity.this);
        }
    }

    static final class b
    {

        Object a;
        List b;
        i c;

        b()
        {
        }
    }


    static final String FRAGMENTS_TAG = "android:support:fragments";
    private static final int HONEYCOMB = 11;
    static final int MSG_REALLY_STOPPED = 1;
    static final int MSG_RESUME_PENDING = 2;
    private static final String TAG = "FragmentActivity";
    boolean mCreated;
    final j mFragments = j.a(new a());
    final Handler mHandler = new Handler() {

        final FragmentActivity a;

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
            a.doReallyStop(false);
            return;
_L3:
            a.onResumeFragments();
            a.mFragments.q();
            return;
        }

            
            {
                a = FragmentActivity.this;
                super();
            }
    };
    boolean mOptionsMenuInvalidated;
    boolean mReallyStopped;
    boolean mRequestedPermissionsFromFragment;
    boolean mResumed;
    boolean mRetaining;
    boolean mStopped;

    public FragmentActivity()
    {
    }

    private void dumpViewHierarchy(String s, PrintWriter printwriter, View view)
    {
        printwriter.print(s);
        if (view != null) goto _L2; else goto _L1
_L1:
        printwriter.println("null");
_L4:
        return;
_L2:
        printwriter.println(viewToString(view));
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int k = view.getChildCount();
            if (k > 0)
            {
                s = (new StringBuilder()).append(s).append("  ").toString();
                int i = 0;
                while (i < k) 
                {
                    dumpViewHierarchy(s, printwriter, view.getChildAt(i));
                    i++;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void requestPermissionsFromFragment(Fragment fragment, String as[], int i)
    {
        if (i == -1)
        {
            android.support.v4.app.a.a(this, as, i);
            return;
        }
        if ((i & 0xffffff00) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 8 bits for requestCode");
        } else
        {
            mRequestedPermissionsFromFragment = true;
            android.support.v4.app.a.a(this, as, (fragment.mIndex + 1 << 8) + (i & 0xff));
            return;
        }
    }

    private static String viewToString(View view)
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

    final View dispatchFragmentsOnCreateView(View view, String s, Context context, AttributeSet attributeset)
    {
        return mFragments.a(view, s, context, attributeset);
    }

    void doReallyStop(boolean flag)
    {
        if (!mReallyStopped)
        {
            mReallyStopped = true;
            mRetaining = flag;
            mHandler.removeMessages(1);
            onReallyStop();
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
        mFragments.a(s1, filedescriptor, printwriter, as);
        mFragments.a().a(s, filedescriptor, printwriter, as);
        printwriter.print(s);
        printwriter.println("View Hierarchy:");
        dumpViewHierarchy((new StringBuilder()).append(s).append("  ").toString(), printwriter, getWindow().getDecorView());
    }

    public Object getLastCustomNonConfigurationInstance()
    {
        b b1 = (b)getLastNonConfigurationInstance();
        if (b1 != null)
        {
            return b1.a;
        } else
        {
            return null;
        }
    }

    public l getSupportFragmentManager()
    {
        return mFragments.a();
    }

    public r getSupportLoaderManager()
    {
        return mFragments.b();
    }

    protected void onActivityResult(int i, int k, Intent intent)
    {
        mFragments.e();
        int i1 = i >> 16;
        if (i1 != 0)
        {
            i1--;
            int j1 = mFragments.c();
            if (j1 == 0 || i1 < 0 || i1 >= j1)
            {
                Log.w("FragmentActivity", (new StringBuilder("Activity result fragment index out of range: 0x")).append(Integer.toHexString(i)).toString());
                return;
            }
            Fragment fragment = (Fragment)mFragments.a(new ArrayList(j1)).get(i1);
            if (fragment == null)
            {
                Log.w("FragmentActivity", (new StringBuilder("Activity result no fragment exists for index: 0x")).append(Integer.toHexString(i)).toString());
                return;
            } else
            {
                fragment.onActivityResult(0xffff & i, k, intent);
                return;
            }
        } else
        {
            super.onActivityResult(i, k, intent);
            return;
        }
    }

    public void onAttachFragment(Fragment fragment)
    {
    }

    public void onBackPressed()
    {
        if (!mFragments.a().d())
        {
            supportFinishAfterTransition();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        mFragments.a(configuration);
    }

    protected void onCreate(Bundle bundle)
    {
        mFragments.d();
        super.onCreate(bundle);
        b b1 = (b)getLastNonConfigurationInstance();
        if (b1 != null)
        {
            mFragments.a(b1.c);
        }
        if (bundle != null)
        {
            android.os.Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            j j1 = mFragments;
            if (b1 != null)
            {
                bundle = b1.b;
            } else
            {
                bundle = null;
            }
            j1.a(parcelable, bundle);
        }
        mFragments.h();
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

    public volatile View onCreateView(View view, String s, Context context, AttributeSet attributeset)
    {
        return super.onCreateView(view, s, context, attributeset);
    }

    public volatile View onCreateView(String s, Context context, AttributeSet attributeset)
    {
        return super.onCreateView(s, context, attributeset);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        doReallyStop(false);
        mFragments.o();
        mFragments.s();
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
        mFragments.p();
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

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        mFragments.e();
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

    protected void onPause()
    {
        super.onPause();
        mResumed = false;
        if (mHandler.hasMessages(2))
        {
            mHandler.removeMessages(2);
            onResumeFragments();
        }
        mFragments.l();
    }

    protected void onPostResume()
    {
        super.onPostResume();
        mHandler.removeMessages(2);
        onResumeFragments();
        mFragments.q();
    }

    protected boolean onPrepareOptionsPanel(View view, Menu menu)
    {
        return super.onPreparePanel(0, view, menu);
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
            return onPrepareOptionsPanel(view, menu) | mFragments.a(menu);
        } else
        {
            return super.onPreparePanel(i, view, menu);
        }
    }

    void onReallyStop()
    {
        mFragments.a(mRetaining);
        mFragments.n();
    }

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        int k;
        int i1;
label0:
        {
            k = i >> 8 & 0xff;
            if (k != 0)
            {
                k--;
                i1 = mFragments.c();
                if (i1 != 0 && k >= 0 && k < i1)
                {
                    break label0;
                }
                Log.w("FragmentActivity", (new StringBuilder("Activity result fragment index out of range: 0x")).append(Integer.toHexString(i)).toString());
            }
            return;
        }
        Fragment fragment = (Fragment)mFragments.a(new ArrayList(i1)).get(k);
        if (fragment == null)
        {
            Log.w("FragmentActivity", (new StringBuilder("Activity result no fragment exists for index: 0x")).append(Integer.toHexString(i)).toString());
            return;
        } else
        {
            fragment.onRequestPermissionsResult(i & 0xff, as, ai);
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        mHandler.sendEmptyMessage(2);
        mResumed = true;
        mFragments.q();
    }

    protected void onResumeFragments()
    {
        mFragments.k();
    }

    public Object onRetainCustomNonConfigurationInstance()
    {
        return null;
    }

    public final Object onRetainNonConfigurationInstance()
    {
        if (mStopped)
        {
            doReallyStop(true);
        }
        Object obj = onRetainCustomNonConfigurationInstance();
        List list = mFragments.g();
        i i = mFragments.u();
        if (list == null && i == null && obj == null)
        {
            return null;
        } else
        {
            b b1 = new b();
            b1.a = obj;
            b1.b = list;
            b1.c = i;
            return b1;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        android.os.Parcelable parcelable = mFragments.f();
        if (parcelable != null)
        {
            bundle.putParcelable("android:support:fragments", parcelable);
        }
    }

    protected void onStart()
    {
        super.onStart();
        mStopped = false;
        mReallyStopped = false;
        mHandler.removeMessages(1);
        if (!mCreated)
        {
            mCreated = true;
            mFragments.i();
        }
        mFragments.e();
        mFragments.q();
        mFragments.r();
        mFragments.j();
        mFragments.t();
    }

    public void onStateNotSaved()
    {
        mFragments.e();
    }

    protected void onStop()
    {
        super.onStop();
        mStopped = true;
        mHandler.sendEmptyMessage(1);
        mFragments.m();
    }

    public void setEnterSharedElementCallback(ah ah)
    {
        android.support.v4.app.a.a(this, ah);
    }

    public void setExitSharedElementCallback(ah ah)
    {
        android.support.v4.app.a.b(this, ah);
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

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i)
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

    public void supportFinishAfterTransition()
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            finishAfterTransition();
            return;
        } else
        {
            finish();
            return;
        }
    }

    public void supportInvalidateOptionsMenu()
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

    public void supportPostponeEnterTransition()
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            postponeEnterTransition();
        }
    }

    public void supportStartPostponedEnterTransition()
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            startPostponedEnterTransition();
        }
    }

    public final void validateRequestPermissionsRequestCode(int i)
    {
        if (mRequestedPermissionsFromFragment)
        {
            mRequestedPermissionsFromFragment = false;
        } else
        if ((i & 0xffffff00) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 8 bits for requestCode");
        }
    }

}
