// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ar extends ak
{

    final Handler a = new as(this);
    final aw b = new aw(new at(this));
    boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;

    public ar()
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
        int i;
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

    final View a(View view, String s, Context context, AttributeSet attributeset)
    {
        return b.a.d.a(view, s, context, attributeset);
    }

    public void a(am am1)
    {
    }

    public void a(am am1, Intent intent, int i)
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
            super.startActivityForResult(intent, (am1.o + 1 << 16) + (0xffff & i));
            return;
        }
    }

    final void a(boolean flag)
    {
        if (!f)
        {
            f = true;
            g = flag;
            a.removeMessages(1);
            Object obj = b;
            flag = g;
            obj = ((aw) (obj)).a;
            if (((ax) (obj)).f != null && ((ax) (obj)).h)
            {
                obj.h = false;
                if (flag)
                {
                    ((ax) (obj)).f.d();
                } else
                {
                    ((ax) (obj)).f.c();
                }
            }
            b.a.d.a(2, false);
        }
    }

    public void ab_()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            invalidateOptionsMenu();
            return;
        } else
        {
            h = true;
            return;
        }
    }

    public final ay c()
    {
        return b.a.d;
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as1[])
    {
        int i = android.os.Build.VERSION.SDK_INT;
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
        printwriter.print(c);
        printwriter.print(" mReallyStopped=");
        printwriter.println(f);
        ax ax1 = b.a;
        printwriter.print(s1);
        printwriter.print("mLoadersStarted=");
        printwriter.println(ax1.h);
        if (ax1.f != null)
        {
            printwriter.print(s1);
            printwriter.print("Loader Manager ");
            printwriter.print(Integer.toHexString(System.identityHashCode(ax1.f)));
            printwriter.println(":");
            ax1.f.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as1);
        }
        b.a.d.a(s, filedescriptor, printwriter, as1);
        printwriter.print(s);
        printwriter.println("View Hierarchy:");
        a((new StringBuilder()).append(s).append("  ").toString(), printwriter, getWindow().getDecorView());
    }

    public final bz n_()
    {
        ax ax1 = b.a;
        if (ax1.f != null)
        {
            return ax1.f;
        } else
        {
            ax1.g = true;
            ax1.f = ax1.a("(root)", ax1.h, true);
            return ax1.f;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        b.e_();
        int k = i >> 16;
        if (k != 0)
        {
            k--;
            int l = b.a();
            if (l == 0 || k < 0 || k >= l)
            {
                Log.w("FragmentActivity", (new StringBuilder("Activity result fragment index out of range: 0x")).append(Integer.toHexString(i)).toString());
                return;
            }
            am am1 = (am)b.a(new ArrayList(l)).get(k);
            if (am1 == null)
            {
                Log.w("FragmentActivity", (new StringBuilder("Activity result no fragment exists for index: 0x")).append(Integer.toHexString(i)).toString());
                return;
            } else
            {
                am1.a(0xffff & i, j, intent);
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
            if (!b.a.d.d())
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
        b.a.d.a(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        Object obj = b;
        ((aw) (obj)).a.d.a(((aw) (obj)).a, ((aw) (obj)).a, null);
        super.onCreate(bundle);
        obj = (au)getLastNonConfigurationInstance();
        if (obj != null)
        {
            aw aw1 = b;
            jz jz1 = ((au) (obj)).b;
            aw1.a.e = jz1;
        }
        if (bundle != null)
        {
            android.os.Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            aw aw2 = b;
            if (obj != null)
            {
                bundle = ((au) (obj)).a;
            } else
            {
                bundle = null;
            }
            aw2.a.d.a(parcelable, bundle);
        }
        b.a.d.l();
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        if (i == 0)
        {
            boolean flag = super.onCreatePanelMenu(i, menu);
            aw aw1 = b;
            android.view.MenuInflater menuinflater = getMenuInflater();
            boolean flag1 = aw1.a.d.a(menu, menuinflater);
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

    public void onDestroy()
    {
        super.onDestroy();
        a(false);
        b.a.d.q();
        ax ax1 = b.a;
        if (ax1.f != null)
        {
            ax1.f.g();
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
        b.a.d.r();
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
            return b.a.d.a(menuitem);

        case 6: // '\006'
            return b.a.d.b(menuitem);
        }
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        b.e_();
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
        b.a.d.b(menu);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onPause()
    {
        super.onPause();
        e = false;
        if (a.hasMessages(2))
        {
            a.removeMessages(2);
            b.a.d.o();
        }
        b.a.d.a(4, false);
    }

    public void onPostResume()
    {
        super.onPostResume();
        a.removeMessages(2);
        b.a.d.o();
        b.c();
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        if (i == 0 && menu != null)
        {
            if (h)
            {
                h = false;
                menu.clear();
                onCreatePanelMenu(i, menu);
            }
            return super.onPreparePanel(0, view, menu) | b.a.d.a(menu);
        } else
        {
            return super.onPreparePanel(i, view, menu);
        }
    }

    public void onRequestPermissionsResult(int i, String as1[], int ai[])
    {
        int j;
        int k;
label0:
        {
            j = i >> 8 & 0xff;
            if (j != 0)
            {
                j--;
                k = b.a();
                if (k != 0 && j >= 0 && j < k)
                {
                    break label0;
                }
                Log.w("FragmentActivity", (new StringBuilder("Activity result fragment index out of range: 0x")).append(Integer.toHexString(i)).toString());
            }
            return;
        }
        am am1 = (am)b.a(new ArrayList(k)).get(j);
        if (am1 == null)
        {
            Log.w("FragmentActivity", (new StringBuilder("Activity result no fragment exists for index: 0x")).append(Integer.toHexString(i)).toString());
            return;
        } else
        {
            am1.a(i & 0xff, as1, ai);
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        a.sendEmptyMessage(2);
        e = true;
        b.c();
    }

    public final Object onRetainNonConfigurationInstance()
    {
        if (c)
        {
            a(true);
        }
        bb bb1 = b.a.d;
        ArrayList arraylist1;
        if (bb1.b != null)
        {
            int i = 0;
            ArrayList arraylist = null;
            do
            {
                arraylist1 = arraylist;
                if (i >= bb1.b.size())
                {
                    break;
                }
                am am1 = (am)bb1.b.get(i);
                arraylist1 = arraylist;
                if (am1 != null)
                {
                    arraylist1 = arraylist;
                    if (am1.K)
                    {
                        arraylist1 = arraylist;
                        if (arraylist == null)
                        {
                            arraylist1 = new ArrayList();
                        }
                        arraylist1.add(am1);
                        am1.L = true;
                        int j;
                        if (am1.r != null)
                        {
                            j = am1.r.o;
                        } else
                        {
                            j = -1;
                        }
                        am1.s = j;
                    }
                }
                i++;
                arraylist = arraylist1;
            } while (true);
        } else
        {
            arraylist1 = null;
        }
        jz jz1 = b.a.g();
        if (arraylist1 == null && jz1 == null)
        {
            return null;
        } else
        {
            au au1 = new au();
            au1.a = arraylist1;
            au1.b = jz1;
            return au1;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        android.os.Parcelable parcelable = b.a.d.k();
        if (parcelable != null)
        {
            bundle.putParcelable("android:support:fragments", parcelable);
        }
    }

    public void onStart()
    {
        super.onStart();
        c = false;
        f = false;
        a.removeMessages(1);
        if (!d)
        {
            d = true;
            b.a.d.m();
        }
        b.e_();
        b.c();
        Object obj = b.a;
        if (!((ax) (obj)).h)
        {
            obj.h = true;
            ax ax1;
            int i;
            if (((ax) (obj)).f != null)
            {
                ((ax) (obj)).f.b();
            } else
            if (!((ax) (obj)).g)
            {
                obj.f = ((ax) (obj)).a("(root)", ((ax) (obj)).h, false);
                if (((ax) (obj)).f != null && !((ax) (obj)).f.e)
                {
                    ((ax) (obj)).f.b();
                }
            }
            obj.g = true;
        }
        b.a.d.n();
        ax1 = b.a;
        if (ax1.e != null)
        {
            int l = ax1.e.size();
            obj = new cb[l];
            for (i = l - 1; i >= 0; i--)
            {
                obj[i] = (cb)ax1.e.c(i);
            }

            for (int j = 0; j < l; j++)
            {
                cb cb1 = obj[j];
                if (cb1.f)
                {
                    if (cb.a)
                    {
                        (new StringBuilder("Finished Retaining in ")).append(cb1);
                    }
                    cb1.f = false;
                    for (int k = cb1.b.a() - 1; k >= 0; k--)
                    {
                        cc cc1 = (cc)cb1.b.c(k);
                        if (cc1.h)
                        {
                            if (cb.a)
                            {
                                (new StringBuilder("  Finished Retaining: ")).append(cc1);
                            }
                            cc1.h = false;
                            if (cc1.g != cc1.i && !cc1.g)
                            {
                                cc1.b();
                            }
                        }
                        if (cc1.g && cc1.d && !cc1.j)
                        {
                            cc1.b(cc1.c, cc1.f);
                        }
                    }

                }
                cb1.f();
            }

        }
    }

    public void onStateNotSaved()
    {
        b.e_();
    }

    public void onStop()
    {
        super.onStop();
        c = true;
        a.sendEmptyMessage(1);
        b.a.d.p();
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

    protected final void t_()
    {
        b.a.d.o();
    }
}
