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
import android.support.v4.g.j;
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
//            g, k, a, Fragment, 
//            l, n, v, m, 
//            b, u, am

public class i extends g
    implements a.a, c.a
{
    final class a extends l
    {

        final i a;

        public final View a(int i1)
        {
            return a.findViewById(i1);
        }

        public final void a(Fragment fragment)
        {
            a.onAttachFragment(fragment);
        }

        public final void a(Fragment fragment, Intent intent, int i1)
        {
            a.startActivityFromFragment(fragment, intent, i1);
        }

        public final void a(Fragment fragment, String as[], int i1)
        {
            a.requestPermissionsFromFragment(fragment, as, i1);
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
            i i1 = a;
            if (android.os.Build.VERSION.SDK_INT >= 23)
            {
                return i1.shouldShowRequestPermissionRationale(s);
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
            a = i.this;
            super(i.this);
        }
    }

    static final class b
    {

        Object a;
        List b;
        android.support.v4.g.i c;

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
    final k mFragments = new k(new a());
    final Handler mHandler = new Handler() {

        final i a;

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
            a.mFragments.c();
            return;
        }

            
            {
                a = i.this;
                super();
            }
    };
    boolean mOptionsMenuInvalidated;
    boolean mReallyStopped;
    boolean mRequestedPermissionsFromFragment;
    boolean mResumed;
    boolean mRetaining;
    boolean mStopped;

    public i()
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
            int j1 = view.getChildCount();
            if (j1 > 0)
            {
                s = (new StringBuilder()).append(s).append("  ").toString();
                int i1 = 0;
                while (i1 < j1) 
                {
                    dumpViewHierarchy(s, printwriter, view.getChildAt(i1));
                    i1++;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void requestPermissionsFromFragment(Fragment fragment, String as[], int i1)
    {
        if (i1 == -1)
        {
            android.support.v4.app.a.a(this, as, i1);
            return;
        }
        if ((i1 & 0xffffff00) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 8 bits for requestCode");
        } else
        {
            mRequestedPermissionsFromFragment = true;
            android.support.v4.app.a.a(this, as, (fragment.mIndex + 1 << 8) + (i1 & 0xff));
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
        int i1;
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
        i1 = view.getId();
        if (i1 == -1) goto _L6; else goto _L5
_L5:
        stringbuilder.append(" #");
        stringbuilder.append(Integer.toHexString(i1));
        obj = view.getResources();
        if (i1 == 0 || obj == null) goto _L6; else goto _L7
_L7:
        0xff000000 & i1;
        JVM INSTR lookupswitch 2: default 436
    //                   16777216: 616
    //                   2130706432: 610;
           goto _L8 _L9 _L10
_L8:
        view = ((Resources) (obj)).getResourcePackageName(i1);
_L12:
        s = ((Resources) (obj)).getResourceTypeName(i1);
        obj = ((Resources) (obj)).getResourceEntryName(i1);
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
        return mFragments.a.f.onCreateView(view, s, context, attributeset);
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
        int i1 = android.os.Build.VERSION.SDK_INT;
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
        l l1 = mFragments.a;
        printwriter.print(s1);
        printwriter.print("mLoadersStarted=");
        printwriter.println(l1.j);
        if (l1.h != null)
        {
            printwriter.print(s1);
            printwriter.print("Loader Manager ");
            printwriter.print(Integer.toHexString(System.identityHashCode(l1.h)));
            printwriter.println(":");
            l1.h.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
        }
        mFragments.a.f.a(s, filedescriptor, printwriter, as);
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

    public m getSupportFragmentManager()
    {
        return mFragments.a.f;
    }

    public u getSupportLoaderManager()
    {
        l l1 = mFragments.a;
        if (l1.h != null)
        {
            return l1.h;
        } else
        {
            l1.i = true;
            l1.h = l1.a("(root)", l1.j, true);
            return l1.h;
        }
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        mFragments.b();
        int k1 = i1 >> 16;
        if (k1 != 0)
        {
            k1--;
            int l1 = mFragments.a();
            if (l1 == 0 || k1 < 0 || k1 >= l1)
            {
                Log.w("FragmentActivity", (new StringBuilder("Activity result fragment index out of range: 0x")).append(Integer.toHexString(i1)).toString());
                return;
            }
            Fragment fragment = (Fragment)mFragments.a(new ArrayList(l1)).get(k1);
            if (fragment == null)
            {
                Log.w("FragmentActivity", (new StringBuilder("Activity result no fragment exists for index: 0x")).append(Integer.toHexString(i1)).toString());
                return;
            } else
            {
                fragment.onActivityResult(0xffff & i1, j1, intent);
                return;
            }
        } else
        {
            super.onActivityResult(i1, j1, intent);
            return;
        }
    }

    public void onAttachFragment(Fragment fragment)
    {
    }

    public void onBackPressed()
    {
        if (!mFragments.a.f.c())
        {
            supportFinishAfterTransition();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        mFragments.a.f.a(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        Object obj = mFragments;
        ((k) (obj)).a.f.a(((k) (obj)).a, ((k) (obj)).a, null);
        super.onCreate(bundle);
        obj = (b)getLastNonConfigurationInstance();
        if (obj != null)
        {
            k k1 = mFragments;
            android.support.v4.g.i i1 = ((b) (obj)).c;
            k1.a.g = i1;
        }
        if (bundle != null)
        {
            android.os.Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            k k2 = mFragments;
            if (obj != null)
            {
                bundle = ((b) (obj)).b;
            } else
            {
                bundle = null;
            }
            k2.a.f.a(parcelable, bundle);
        }
        mFragments.a.f.l();
    }

    public boolean onCreatePanelMenu(int i1, Menu menu)
    {
        if (i1 == 0)
        {
            boolean flag = super.onCreatePanelMenu(i1, menu);
            k k1 = mFragments;
            android.view.MenuInflater menuinflater = getMenuInflater();
            boolean flag1 = k1.a.f.a(menu, menuinflater);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                return flag | flag1;
            } else
            {
                return true;
            }
        } else
        {
            return super.onCreatePanelMenu(i1, menu);
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

    public void onDestroy()
    {
        super.onDestroy();
        doReallyStop(false);
        mFragments.a.f.q();
        l l1 = mFragments.a;
        if (l1.h != null)
        {
            l1.h.g();
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (android.os.Build.VERSION.SDK_INT < 5 && i1 == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        mFragments.a.f.r();
    }

    public boolean onMenuItemSelected(int i1, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(i1, menuitem))
        {
            return true;
        }
        switch (i1)
        {
        default:
            return false;

        case 0: // '\0'
            return mFragments.a.f.a(menuitem);

        case 6: // '\006'
            return mFragments.a.f.b(menuitem);
        }
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        mFragments.b();
    }

    public void onPanelClosed(int i1, Menu menu)
    {
        i1;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 27;
           goto _L1 _L2
_L1:
        super.onPanelClosed(i1, menu);
        return;
_L2:
        mFragments.a.f.b(menu);
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
            onResumeFragments();
        }
        mFragments.a.f.d(4);
    }

    public void onPostResume()
    {
        super.onPostResume();
        mHandler.removeMessages(2);
        onResumeFragments();
        mFragments.c();
    }

    protected boolean onPrepareOptionsPanel(View view, Menu menu)
    {
        return super.onPreparePanel(0, view, menu);
    }

    public boolean onPreparePanel(int i1, View view, Menu menu)
    {
        if (i1 == 0 && menu != null)
        {
            if (mOptionsMenuInvalidated)
            {
                mOptionsMenuInvalidated = false;
                menu.clear();
                onCreatePanelMenu(i1, menu);
            }
            return onPrepareOptionsPanel(view, menu) | mFragments.a.f.a(menu);
        } else
        {
            return super.onPreparePanel(i1, view, menu);
        }
    }

    void onReallyStop()
    {
        Object obj = mFragments;
        boolean flag = mRetaining;
        obj = ((k) (obj)).a;
        if (((l) (obj)).h != null && ((l) (obj)).j)
        {
            obj.j = false;
            if (flag)
            {
                ((l) (obj)).h.d();
            } else
            {
                ((l) (obj)).h.c();
            }
        }
        mFragments.a.f.d(2);
    }

    public void onRequestPermissionsResult(int i1, String as[], int ai[])
    {
        int j1;
        int k1;
label0:
        {
            j1 = i1 >> 8 & 0xff;
            if (j1 != 0)
            {
                j1--;
                k1 = mFragments.a();
                if (k1 != 0 && j1 >= 0 && j1 < k1)
                {
                    break label0;
                }
                Log.w("FragmentActivity", (new StringBuilder("Activity result fragment index out of range: 0x")).append(Integer.toHexString(i1)).toString());
            }
            return;
        }
        Fragment fragment = (Fragment)mFragments.a(new ArrayList(k1)).get(j1);
        if (fragment == null)
        {
            Log.w("FragmentActivity", (new StringBuilder("Activity result no fragment exists for index: 0x")).append(Integer.toHexString(i1)).toString());
            return;
        } else
        {
            fragment.onRequestPermissionsResult(i1 & 0xff, as, ai);
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        mHandler.sendEmptyMessage(2);
        mResumed = true;
        mFragments.c();
    }

    protected void onResumeFragments()
    {
        mFragments.a.f.o();
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
        n n1 = mFragments.a.f;
        ArrayList arraylist1;
        if (n1.f != null)
        {
            int j1 = 0;
            ArrayList arraylist = null;
            do
            {
                arraylist1 = arraylist;
                if (j1 >= n1.f.size())
                {
                    break;
                }
                Fragment fragment = (Fragment)n1.f.get(j1);
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
                        int k1;
                        if (fragment.mTarget != null)
                        {
                            k1 = fragment.mTarget.mIndex;
                        } else
                        {
                            k1 = -1;
                        }
                        fragment.mTargetIndex = k1;
                        arraylist2 = arraylist1;
                        if (n.a)
                        {
                            Log.v("FragmentManager", (new StringBuilder("retainNonConfig: keeping retained ")).append(fragment).toString());
                            arraylist2 = arraylist1;
                        }
                    }
                }
                j1++;
                arraylist = arraylist2;
            } while (true);
        } else
        {
            arraylist1 = null;
        }
        android.support.v4.g.i i1 = mFragments.a.h();
        if (arraylist1 == null && i1 == null && obj == null)
        {
            return null;
        } else
        {
            b b1 = new b();
            b1.a = obj;
            b1.b = arraylist1;
            b1.c = i1;
            return b1;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        android.os.Parcelable parcelable = mFragments.a.f.k();
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
            mFragments.a.f.m();
        }
        mFragments.b();
        mFragments.c();
        Object obj = mFragments.a;
        if (!((l) (obj)).j)
        {
            obj.j = true;
            l l1;
            int i1;
            if (((l) (obj)).h != null)
            {
                ((l) (obj)).h.b();
            } else
            if (!((l) (obj)).i)
            {
                obj.h = ((l) (obj)).a("(root)", ((l) (obj)).j, false);
                if (((l) (obj)).h != null && !((l) (obj)).h.e)
                {
                    ((l) (obj)).h.b();
                }
            }
            obj.i = true;
        }
        mFragments.a.f.n();
        l1 = mFragments.a;
        if (l1.g != null)
        {
            int i2 = l1.g.size();
            obj = new v[i2];
            for (i1 = i2 - 1; i1 >= 0; i1--)
            {
                obj[i1] = (v)l1.g.c(i1);
            }

            for (int j1 = 0; j1 < i2; j1++)
            {
                v v1 = obj[j1];
                if (v1.f)
                {
                    if (v.a)
                    {
                        Log.v("LoaderManager", (new StringBuilder("Finished Retaining in ")).append(v1).toString());
                    }
                    v1.f = false;
                    for (int k1 = v1.b.a() - 1; k1 >= 0; k1--)
                    {
                        v.a a1 = (v.a)v1.b.d(k1);
                        if (a1.i)
                        {
                            if (v.a)
                            {
                                Log.v("LoaderManager", (new StringBuilder("  Finished Retaining: ")).append(a1).toString());
                            }
                            a1.i = false;
                            if (a1.h != a1.j && !a1.h)
                            {
                                a1.b();
                            }
                        }
                        if (a1.h && a1.e && !a1.k)
                        {
                            a1.b(a1.d, a1.g);
                        }
                    }

                }
                v1.f();
            }

        }
    }

    public void onStateNotSaved()
    {
        mFragments.b();
    }

    public void onStop()
    {
        super.onStop();
        mStopped = true;
        mHandler.sendEmptyMessage(1);
        mFragments.a.f.p();
    }

    public void setEnterSharedElementCallback(am am)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            setEnterSharedElementCallback(android.support.v4.app.b.a(android.support.v4.app.a.a(am)));
        }
    }

    public void setExitSharedElementCallback(am am)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            setExitSharedElementCallback(android.support.v4.app.b.a(android.support.v4.app.a.a(am)));
        }
    }

    public void startActivityForResult(Intent intent, int i1)
    {
        if (i1 != -1 && (0xffff0000 & i1) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        } else
        {
            super.startActivityForResult(intent, i1);
            return;
        }
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i1)
    {
        if (i1 == -1)
        {
            super.startActivityForResult(intent, -1);
            return;
        }
        if ((0xffff0000 & i1) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        } else
        {
            super.startActivityForResult(intent, (fragment.mIndex + 1 << 16) + (0xffff & i1));
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

    public final void validateRequestPermissionsRequestCode(int i1)
    {
        if (mRequestedPermissionsFromFragment)
        {
            mRequestedPermissionsFromFragment = false;
        } else
        if ((i1 & 0xffffff00) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 8 bits for requestCode");
        }
    }

}
