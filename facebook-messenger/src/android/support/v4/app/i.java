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
import java.util.Collection;
import java.util.HashMap;

// Referenced classes of package android.support.v4.app:
//            j, s, k, n, 
//            ai, Fragment, a, m, 
//            l, o, p, q, 
//            ag

public class i extends Activity
{

    final Handler a = new j(this);
    final s b = new s();
    s c;
    final o d = new k(this);
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    HashMap m;
    ai n;
    n o;

    public i()
    {
        c = null;
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
        String s1;
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
        s1 = ((Resources) (obj)).getResourceTypeName(i1);
        obj = ((Resources) (obj)).getResourceEntryName(i1);
        stringbuilder.append(" ");
        stringbuilder.append(view);
        stringbuilder.append(":");
        stringbuilder.append(s1);
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

    private void a(String s1, PrintWriter printwriter, View view)
    {
        printwriter.print(s1);
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
                s1 = (new StringBuilder()).append(s1).append("  ").toString();
                int i1 = 0;
                while (i1 < j1) 
                {
                    a(s1, printwriter, view.getChildAt(i1));
                    i1++;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private p h()
    {
        if (o == null)
        {
            o = new n(this);
        }
        return o;
    }

    Fragment a(int i1)
    {
        return b.c(i1);
    }

    ai a(String s1, boolean flag, boolean flag1)
    {
        if (m == null)
        {
            m = new HashMap();
        }
        ai ai1 = (ai)m.get(s1);
        if (ai1 == null)
        {
            if (flag1)
            {
                ai1 = new ai(s1, h(), flag);
                m.put(s1, ai1);
            }
            return ai1;
        } else
        {
            ai1.a(h());
            return ai1;
        }
    }

    public void a(Fragment fragment)
    {
    }

    public void a(Fragment fragment, Intent intent, int i1)
    {
        if (i1 == -1)
        {
            super.startActivityForResult(intent, -1);
            return;
        }
        if ((i1 & 0xffff0000) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
        int j1 = b(fragment);
        if ((0xffff0000 & j1) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 16 bits for fragment ID");
        } else
        {
            super.startActivityForResult(intent, (j1 << 16) + (0xffff & i1));
            return;
        }
    }

    public void a(q q)
    {
        c = (s)q;
    }

    void a(String s1)
    {
        if (m != null)
        {
            ai ai1 = (ai)m.get(s1);
            if (ai1 != null && !ai1.g)
            {
                ai1.h();
                m.remove(s1);
            }
        }
    }

    void a(boolean flag)
    {
        if (!h)
        {
            h = true;
            i = flag;
            a.removeMessages(1);
            e();
        }
    }

    int b(Fragment fragment)
    {
        b.b(0);
        return fragment.p;
    }

    protected void b()
    {
        b.p();
    }

    public q b_()
    {
        return c;
    }

    public void d()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            android.support.v4.app.a.a(this);
            return;
        } else
        {
            j = true;
            return;
        }
    }

    public Object d_()
    {
        return null;
    }

    public void dump(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        if (android.os.Build.VERSION.SDK_INT < 11);
        printwriter.print(s1);
        printwriter.print("Local FragmentActivity ");
        printwriter.print(Integer.toHexString(System.identityHashCode(this)));
        printwriter.println(" State:");
        String s2 = (new StringBuilder()).append(s1).append("  ").toString();
        printwriter.print(s2);
        printwriter.print("mCreated=");
        printwriter.print(e);
        printwriter.print("mResumed=");
        printwriter.print(f);
        printwriter.print(" mStopped=");
        printwriter.print(g);
        printwriter.print(" mReallyStopped=");
        printwriter.println(h);
        printwriter.print(s2);
        printwriter.print("mLoadersStarted=");
        printwriter.println(l);
        if (n != null)
        {
            printwriter.print(s1);
            printwriter.print("Loader Manager ");
            printwriter.print(Integer.toHexString(System.identityHashCode(n)));
            printwriter.println(":");
            n.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
        }
        b.a(s1, filedescriptor, printwriter, as);
        printwriter.print(s1);
        printwriter.println("View Hierarchy:");
        a((new StringBuilder()).append(s1).append("  ").toString(), printwriter, getWindow().getDecorView());
    }

    void e()
    {
        if (l)
        {
            l = false;
            if (n != null)
            {
                if (!i)
                {
                    n.c();
                } else
                {
                    n.d();
                }
            }
        }
        b.s();
    }

    public q f()
    {
        return b;
    }

    public ag g()
    {
        if (n != null)
        {
            return n;
        } else
        {
            k = true;
            n = a(((String) (null)), l, true);
            return n;
        }
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        b.l();
        int k1 = i1 >> 16;
        if (k1 != 0)
        {
            if (k1 < 0)
            {
                Log.w("FragmentActivity", (new StringBuilder()).append("Activity result fragment index out of range: 0x").append(Integer.toHexString(i1)).toString());
                return;
            }
            Fragment fragment = a(k1);
            if (fragment == null)
            {
                Log.w("FragmentActivity", (new StringBuilder()).append("Activity result no fragment exists for index: 0x").append(Integer.toHexString(i1)).toString());
                return;
            } else
            {
                fragment.a(0xffff & i1, j1, intent);
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
        if (!b.e())
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
        b.a(h(), d, null);
        if (getLayoutInflater().getFactory() == null)
        {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
        m m1 = (m)getLastNonConfigurationInstance();
        if (m1 != null)
        {
            m = m1.e;
        }
        if (bundle != null)
        {
            android.os.Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            s s1 = b;
            if (m1 != null)
            {
                bundle = m1.d;
            } else
            {
                bundle = null;
            }
            s1.a(parcelable, bundle);
        }
        b.m();
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

    public View onCreateView(String s1, Context context, AttributeSet attributeset)
    {
        Object obj = null;
        if (!"fragment".equals(s1))
        {
            return super.onCreateView(s1, context, attributeset);
        }
        s1 = attributeset.getAttributeValue(null, "class");
        context = context.obtainStyledAttributes(attributeset, l.a);
        String s2 = s1;
        if (s1 == null)
        {
            s2 = context.getString(0);
        }
        int j1 = context.getResourceId(1, -1);
        String s4 = context.getString(2);
        context.recycle();
        if (false)
        {
            throw new NullPointerException();
        }
        if (-1 == -1 && j1 == -1 && s4 == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Must specify unique android:id, android:tag, or have a parent with an id for ").append(s2).toString());
        }
        s s3;
        if (c != null)
        {
            s3 = c;
        } else
        {
            s3 = b;
        }
        context = obj;
        if (j1 != -1)
        {
            context = s3.a(j1);
        }
        s1 = context;
        if (context == null)
        {
            s1 = context;
            if (s4 != null)
            {
                s1 = s3.a(s4);
            }
        }
        context = s1;
        if (s1 == null)
        {
            context = s1;
            if (-1 != -1)
            {
                context = s3.a(-1);
            }
        }
        if (s.a)
        {
            Log.v("FragmentActivity", (new StringBuilder()).append("onCreateView: id=0x").append(Integer.toHexString(j1)).append(" fname=").append(s2).append(" existing=").append(context).toString());
        }
        if (context == null)
        {
            s1 = Fragment.a(this, s2);
            s1.y = true;
            int i1;
            if (j1 != 0)
            {
                i1 = j1;
            } else
            {
                i1 = -1;
            }
            s1.G = i1;
            s1.H = -1;
            s1.I = s4;
            s1.z = true;
            s1.C = s3;
            s1.a(this, attributeset, ((Fragment) (s1)).m);
            s3.a(s1, true);
        } else
        {
            if (((Fragment) (context)).z)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Duplicate id 0x").append(Integer.toHexString(j1)).append(", tag ").append(s4).append(", or parent id 0x").append(Integer.toHexString(-1)).append(" with another fragment for ").append(s2).toString());
            }
            context.z = true;
            if (!((Fragment) (context)).M)
            {
                context.a(this, attributeset, ((Fragment) (context)).m);
            }
            s3.b(context);
            s1 = context;
        }
        if (((Fragment) (s1)).S == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(s2).append(" did not create a view.").toString());
        }
        if (j1 != 0)
        {
            ((Fragment) (s1)).S.setId(j1);
        }
        if (((Fragment) (s1)).S.getTag() == null)
        {
            ((Fragment) (s1)).S.setTag(s4);
        }
        return ((Fragment) (s1)).S;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        a(false);
        b.u();
        if (n != null)
        {
            n.h();
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
        b.v();
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
        b.l();
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
        f = false;
        if (a.hasMessages(2))
        {
            a.removeMessages(2);
            b();
        }
        b.q();
    }

    protected void onPostResume()
    {
        super.onPostResume();
        a.removeMessages(2);
        b();
        b.h();
    }

    public boolean onPreparePanel(int i1, View view, Menu menu)
    {
        boolean flag1 = false;
        if (i1 == 0 && menu != null)
        {
            if (j)
            {
                j = false;
                menu.clear();
                onCreatePanelMenu(i1, menu);
            }
            boolean flag = flag1;
            if (super.onPreparePanel(i1, view, menu) | b.a(menu))
            {
                flag = flag1;
                if (menu.hasVisibleItems())
                {
                    flag = true;
                }
            }
            return flag;
        } else
        {
            return super.onPreparePanel(i1, view, menu);
        }
    }

    protected void onResume()
    {
        super.onResume();
        a.sendEmptyMessage(2);
        f = true;
        b.h();
    }

    public final Object onRetainNonConfigurationInstance()
    {
        boolean flag1 = false;
        int i1 = 0;
        if (g)
        {
            a(true);
        }
        Object obj = d_();
        java.util.ArrayList arraylist = b.j();
        boolean flag = flag1;
        if (m != null)
        {
            ai aai[] = new ai[m.size()];
            m.values().toArray(aai);
            flag = flag1;
            if (aai != null)
            {
                flag = false;
                while (i1 < aai.length) 
                {
                    ai ai1 = aai[i1];
                    if (ai1.g)
                    {
                        flag = true;
                    } else
                    {
                        ai1.h();
                        m.remove(ai1.d);
                    }
                    i1++;
                }
            }
        }
        if (arraylist == null && !flag && obj == null)
        {
            return null;
        } else
        {
            m m1 = new m();
            m1.a = null;
            m1.b = obj;
            m1.c = null;
            m1.d = arraylist;
            m1.e = m;
            return m1;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        android.os.Parcelable parcelable = b.k();
        if (parcelable != null)
        {
            bundle.putParcelable("android:support:fragments", parcelable);
        }
    }

    protected void onStart()
    {
        int i1;
        i1 = 0;
        super.onStart();
        g = false;
        h = false;
        a.removeMessages(1);
        if (!e)
        {
            e = true;
            b.n();
        }
        b.l();
        b.h();
        if (l) goto _L2; else goto _L1
_L1:
        l = true;
        if (n == null) goto _L4; else goto _L3
_L3:
        n.b();
_L6:
        k = true;
_L2:
        b.o();
        if (m != null)
        {
            ai aai[] = new ai[m.size()];
            m.values().toArray(aai);
            if (aai != null)
            {
                for (; i1 < aai.length; i1++)
                {
                    ai ai1 = aai[i1];
                    ai1.e();
                    ai1.g();
                }

            }
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (!k)
        {
            n = a(((String) (null)), l, false);
            if (n != null && !n.f)
            {
                n.b();
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onStop()
    {
        super.onStop();
        g = true;
        a.sendEmptyMessage(1);
        b.r();
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
