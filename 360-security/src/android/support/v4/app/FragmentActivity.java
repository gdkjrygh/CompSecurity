// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.c.h;
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

// Referenced classes of package android.support.v4.app:
//            FragmentManagerImpl, k, Fragment, b, 
//            e, f

public class FragmentActivity extends Activity
{
    static class a
    {

        public static final int a[] = {
            0x1010003, 0x10100d0, 0x10100d1
        };

    }

    static final class b
    {

        Object a;
        Object b;
        h c;
        ArrayList d;
        h e;

        b()
        {
        }
    }


    final Handler a = new Handler() {

        final FragmentActivity a;

        public void handleMessage(Message message)
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
            if (!a.f) goto _L5; else goto _L4
_L4:
            a.a(false);
            return;
_L3:
            a.a_();
            a.b.e();
            return;
        }

            
            {
                a = FragmentActivity.this;
                super();
            }
    };
    final FragmentManagerImpl b = new FragmentManagerImpl();
    final e c = new e() {

        final FragmentActivity a;

        public View a(int i1)
        {
            return a.findViewById(i1);
        }

            
            {
                a = FragmentActivity.this;
                super();
            }
    };
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    h l;
    k m;

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
        char c1;
        Object obj;
        String s;
        int i1;
        if (view.isFocusable())
        {
            c1 = 'F';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        if (view.isEnabled())
        {
            c1 = 'E';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        if (view.willNotDraw())
        {
            c1 = '.';
        } else
        {
            c1 = 'D';
        }
        stringbuilder.append(c1);
        if (view.isHorizontalScrollBarEnabled())
        {
            c1 = 'H';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        if (view.isVerticalScrollBarEnabled())
        {
            c1 = 'V';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        if (view.isClickable())
        {
            c1 = 'C';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        if (view.isLongClickable())
        {
            c1 = 'L';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        stringbuilder.append(' ');
        if (view.isFocused())
        {
            c1 = byte1;
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        if (view.isSelected())
        {
            c1 = 'S';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        c1 = byte0;
        if (view.isPressed())
        {
            c1 = 'P';
        }
        stringbuilder.append(c1);
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
            int j1 = view.getChildCount();
            if (j1 > 0)
            {
                s = (new StringBuilder()).append(s).append("  ").toString();
                int i1 = 0;
                while (i1 < j1) 
                {
                    a(s, printwriter, view.getChildAt(i1));
                    i1++;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    k a(String s, boolean flag, boolean flag1)
    {
        if (l == null)
        {
            l = new h();
        }
        k k1 = (k)l.get(s);
        if (k1 == null)
        {
            if (flag1)
            {
                k1 = new k(s, this, flag);
                l.put(s, k1);
            }
            return k1;
        } else
        {
            k1.a(this);
            return k1;
        }
    }

    public void a(Fragment fragment, Intent intent, int i1)
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

    void a(String s)
    {
        if (l != null)
        {
            k k1 = (k)l.get(s);
            if (k1 != null && !k1.g)
            {
                k1.h();
                l.remove(s);
            }
        }
    }

    void a(boolean flag)
    {
        if (!g)
        {
            g = true;
            h = flag;
            a.removeMessages(1);
            d();
        }
    }

    protected boolean a(View view, Menu menu)
    {
        return super.onPreparePanel(0, view, menu);
    }

    protected void a_()
    {
        b.l();
    }

    public void a_(Fragment fragment)
    {
    }

    public Object b()
    {
        return null;
    }

    public void c()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            android.support.v4.app.b.a(this);
            return;
        } else
        {
            i = true;
            return;
        }
    }

    void d()
    {
        if (k)
        {
            k = false;
            if (m != null)
            {
                if (!h)
                {
                    m.c();
                } else
                {
                    m.d();
                }
            }
        }
        b.o();
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        if (android.os.Build.VERSION.SDK_INT < 11);
        printwriter.print(s);
        printwriter.print("Local FragmentActivity ");
        printwriter.print(Integer.toHexString(System.identityHashCode(this)));
        printwriter.println(" State:");
        String s1 = (new StringBuilder()).append(s).append("  ").toString();
        printwriter.print(s1);
        printwriter.print("mCreated=");
        printwriter.print(d);
        printwriter.print("mResumed=");
        printwriter.print(e);
        printwriter.print(" mStopped=");
        printwriter.print(f);
        printwriter.print(" mReallyStopped=");
        printwriter.println(g);
        printwriter.print(s1);
        printwriter.print("mLoadersStarted=");
        printwriter.println(k);
        if (m != null)
        {
            printwriter.print(s);
            printwriter.print("Loader Manager ");
            printwriter.print(Integer.toHexString(System.identityHashCode(m)));
            printwriter.println(":");
            m.a((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
        }
        b.a(s, filedescriptor, printwriter, as);
        printwriter.print(s);
        printwriter.println("View Hierarchy:");
        a((new StringBuilder()).append(s).append("  ").toString(), printwriter, getWindow().getDecorView());
    }

    public f e()
    {
        return b;
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        b.noteStateNotSaved();
        int k1 = i1 >> 16;
        if (k1 != 0)
        {
            k1--;
            if (b.f == null || k1 < 0 || k1 >= b.f.size())
            {
                Log.w("FragmentActivity", (new StringBuilder()).append("Activity result fragment index out of range: 0x").append(Integer.toHexString(i1)).toString());
                return;
            }
            Fragment fragment = (Fragment)b.f.get(k1);
            if (fragment == null)
            {
                Log.w("FragmentActivity", (new StringBuilder()).append("Activity result no fragment exists for index: 0x").append(Integer.toHexString(i1)).toString());
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

    public void onBackPressed()
    {
        if (!b.c())
        {
            finish();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        b.a(configuration);
    }

    protected void onCreate(Bundle bundle)
    {
        b.a(this, c, null);
        if (getLayoutInflater().getFactory() == null)
        {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
        b b1 = (b)getLastNonConfigurationInstance();
        if (b1 != null)
        {
            l = b1.e;
        }
        if (bundle != null)
        {
            android.os.Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            FragmentManagerImpl fragmentmanagerimpl = b;
            if (b1 != null)
            {
                bundle = b1.d;
            } else
            {
                bundle = null;
            }
            fragmentmanagerimpl.a(parcelable, bundle);
        }
        b.i();
    }

    public boolean onCreatePanelMenu(int i1, Menu menu)
    {
        if (i1 == 0)
        {
            boolean flag = super.onCreatePanelMenu(i1, menu);
            boolean flag1 = b.a(menu, getMenuInflater());
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

    public View onCreateView(String s, Context context, AttributeSet attributeset)
    {
        Object obj = null;
        if (!"fragment".equals(s))
        {
            return super.onCreateView(s, context, attributeset);
        }
        String s2 = attributeset.getAttributeValue(null, "class");
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, a.a);
        String s1 = s2;
        if (s2 == null)
        {
            s1 = typedarray.getString(0);
        }
        int j1 = typedarray.getResourceId(1, -1);
        s2 = typedarray.getString(2);
        typedarray.recycle();
        if (!Fragment.isSupportFragmentClass(this, s1))
        {
            return super.onCreateView(s, context, attributeset);
        }
        if (false)
        {
            throw new NullPointerException();
        }
        if (-1 == 0 && j1 == -1 && s2 == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Must specify unique android:id, android:tag, or have a parent with an id for ").append(s1).toString());
        }
        context = obj;
        if (j1 != -1)
        {
            context = b.a(j1);
        }
        s = context;
        if (context == null)
        {
            s = context;
            if (s2 != null)
            {
                s = b.a(s2);
            }
        }
        context = s;
        if (s == null)
        {
            context = s;
            if (-1 != 0)
            {
                context = b.a(0);
            }
        }
        if (FragmentManagerImpl.a)
        {
            Log.v("FragmentActivity", (new StringBuilder()).append("onCreateView: id=0x").append(Integer.toHexString(j1)).append(" fname=").append(s1).append(" existing=").append(context).toString());
        }
        if (context == null)
        {
            s = Fragment.instantiate(this, s1);
            s.mFromLayout = true;
            int i1;
            if (j1 != 0)
            {
                i1 = j1;
            } else
            {
                i1 = 0;
            }
            s.mFragmentId = i1;
            s.mContainerId = 0;
            s.mTag = s2;
            s.mInLayout = true;
            s.mFragmentManager = b;
            s.onInflate(this, attributeset, ((Fragment) (s)).mSavedFragmentState);
            b.a(s, true);
        } else
        {
            if (((Fragment) (context)).mInLayout)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Duplicate id 0x").append(Integer.toHexString(j1)).append(", tag ").append(s2).append(", or parent id 0x").append(Integer.toHexString(0)).append(" with another fragment for ").append(s1).toString());
            }
            context.mInLayout = true;
            if (!((Fragment) (context)).mRetaining)
            {
                context.onInflate(this, attributeset, ((Fragment) (context)).mSavedFragmentState);
            }
            b.b(context);
            s = context;
        }
        if (((Fragment) (s)).mView == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(s1).append(" did not create a view.").toString());
        }
        if (j1 != 0)
        {
            ((Fragment) (s)).mView.setId(j1);
        }
        if (((Fragment) (s)).mView.getTag() == null)
        {
            ((Fragment) (s)).mView.setTag(s2);
        }
        return ((Fragment) (s)).mView;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        a(false);
        b.q();
        if (m != null)
        {
            m.h();
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
        b.r();
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
            return b.a(menuitem);

        case 6: // '\006'
            return b.b(menuitem);
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        b.noteStateNotSaved();
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
        b.b(menu);
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onPause()
    {
        super.onPause();
        e = false;
        if (a.hasMessages(2))
        {
            a.removeMessages(2);
            a_();
        }
        b.m();
    }

    protected void onPostResume()
    {
        super.onPostResume();
        a.removeMessages(2);
        a_();
        b.e();
    }

    public boolean onPreparePanel(int i1, View view, Menu menu)
    {
        if (i1 == 0 && menu != null)
        {
            if (i)
            {
                i = false;
                menu.clear();
                onCreatePanelMenu(i1, menu);
            }
            return a(view, menu) | b.a(menu);
        } else
        {
            return super.onPreparePanel(i1, view, menu);
        }
    }

    protected void onResume()
    {
        super.onResume();
        a.sendEmptyMessage(2);
        e = true;
        b.e();
    }

    public final Object onRetainNonConfigurationInstance()
    {
        int j1 = 0;
        if (f)
        {
            a(true);
        }
        Object obj = b();
        ArrayList arraylist = b.g();
        boolean flag1;
        if (l != null)
        {
            int l1 = l.size();
            k ak[] = new k[l1];
            for (int i1 = l1 - 1; i1 >= 0; i1--)
            {
                ak[i1] = (k)l.c(i1);
            }

            boolean flag = false;
            do
            {
                flag1 = flag;
                if (j1 >= l1)
                {
                    break;
                }
                k k1 = ak[j1];
                if (k1.g)
                {
                    flag = true;
                } else
                {
                    k1.h();
                    l.remove(k1.d);
                }
                j1++;
            } while (true);
        } else
        {
            flag1 = false;
        }
        if (arraylist == null && !flag1 && obj == null)
        {
            return null;
        } else
        {
            b b1 = new b();
            b1.a = null;
            b1.b = obj;
            b1.c = null;
            b1.d = arraylist;
            b1.e = l;
            return b1;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        android.os.Parcelable parcelable = b.h();
        if (parcelable != null)
        {
            bundle.putParcelable("android:support:fragments", parcelable);
        }
    }

    protected void onStart()
    {
        super.onStart();
        f = false;
        g = false;
        a.removeMessages(1);
        if (!d)
        {
            d = true;
            b.j();
        }
        b.noteStateNotSaved();
        b.e();
        if (!k)
        {
            k = true;
            int i1;
            if (m != null)
            {
                m.b();
            } else
            if (!j)
            {
                m = a("(root)", k, false);
                if (m != null && !m.f)
                {
                    m.b();
                }
            }
            j = true;
        }
        b.k();
        if (l != null)
        {
            int l1 = l.size();
            k ak[] = new k[l1];
            for (i1 = l1 - 1; i1 >= 0; i1--)
            {
                ak[i1] = (k)l.c(i1);
            }

            for (int j1 = 0; j1 < l1; j1++)
            {
                k k1 = ak[j1];
                k1.e();
                k1.g();
            }

        }
    }

    protected void onStop()
    {
        super.onStop();
        f = true;
        a.sendEmptyMessage(1);
        b.n();
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
}
