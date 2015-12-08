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
import android.support.v4.d.m;
import android.support.v4.d.n;
import android.util.AttributeSet;
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

// Referenced classes of package android.support.v4.app:
//            i, l, p, m, 
//            q, s, ao, r, 
//            Fragment, n, ap, am

public class FragmentActivity extends i
{

    final Handler a = new l(this);
    final p b = new p(new android.support.v4.app.m(this));
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;

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
        String s1;
        int j;
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
        j = view.getId();
        if (j == -1) goto _L6; else goto _L5
_L5:
        stringbuilder.append(" #");
        stringbuilder.append(Integer.toHexString(j));
        obj = view.getResources();
        if (j == 0 || obj == null) goto _L6; else goto _L7
_L7:
        0xff000000 & j;
        JVM INSTR lookupswitch 2: default 436
    //                   16777216: 616
    //                   2130706432: 610;
           goto _L8 _L9 _L10
_L8:
        view = ((Resources) (obj)).getResourcePackageName(j);
_L12:
        s1 = ((Resources) (obj)).getResourceTypeName(j);
        obj = ((Resources) (obj)).getResourceEntryName(j);
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
            int k = view.getChildCount();
            if (k > 0)
            {
                s1 = (new StringBuilder()).append(s1).append("  ").toString();
                int j = 0;
                while (j < k) 
                {
                    a(s1, printwriter, view.getChildAt(j));
                    j++;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final View a(View view, String s1, Context context, AttributeSet attributeset)
    {
        return b.a.f.a(view, s1, context, attributeset);
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
            obj = ((p) (obj)).a;
            if (((q) (obj)).h != null && ((q) (obj)).j)
            {
                obj.j = false;
                if (flag)
                {
                    ((q) (obj)).h.e();
                } else
                {
                    ((q) (obj)).h.d();
                }
            }
            b.a.f.a(2);
        }
    }

    protected final void a_()
    {
        b.a.f.l();
    }

    public void b()
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

    public final r c()
    {
        return b.a.f;
    }

    public final am d()
    {
        q q1 = b.a;
        if (q1.h != null)
        {
            return q1.h;
        } else
        {
            q1.i = true;
            q1.h = q1.a("(root)", q1.j, true);
            return q1.h;
        }
    }

    public void dump(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        int j = android.os.Build.VERSION.SDK_INT;
        printwriter.print(s1);
        printwriter.print("Local FragmentActivity ");
        printwriter.print(Integer.toHexString(System.identityHashCode(this)));
        printwriter.println(" State:");
        String s2 = (new StringBuilder()).append(s1).append("  ").toString();
        printwriter.print(s2);
        printwriter.print("mCreated=");
        printwriter.print(c);
        printwriter.print("mResumed=");
        printwriter.print(d);
        printwriter.print(" mStopped=");
        printwriter.print(e);
        printwriter.print(" mReallyStopped=");
        printwriter.println(f);
        q q1 = b.a;
        printwriter.print(s2);
        printwriter.print("mLoadersStarted=");
        printwriter.println(q1.j);
        if (q1.h != null)
        {
            printwriter.print(s2);
            printwriter.print("Loader Manager ");
            printwriter.print(Integer.toHexString(System.identityHashCode(q1.h)));
            printwriter.println(":");
            q1.h.a((new StringBuilder()).append(s2).append("  ").toString(), filedescriptor, printwriter, as);
        }
        b.a.f.a(s1, filedescriptor, printwriter, as);
        printwriter.print(s1);
        printwriter.println("View Hierarchy:");
        a((new StringBuilder()).append(s1).append("  ").toString(), printwriter, getWindow().getDecorView());
    }

    public void onActivityResult(int j, int k, Intent intent)
    {
        b.b();
        int i1 = j >> 16;
        if (i1 != 0)
        {
            k = i1 - 1;
            i1 = b.a();
            if (i1 == 0 || k < 0 || k >= i1)
            {
                (new StringBuilder("Activity result fragment index out of range: 0x")).append(Integer.toHexString(j));
                return;
            }
            if ((Fragment)b.a(new ArrayList(i1)).get(k) == null)
            {
                (new StringBuilder("Activity result no fragment exists for index: 0x")).append(Integer.toHexString(j));
                return;
            } else
            {
                Fragment.d();
                return;
            }
        } else
        {
            super.onActivityResult(j, k, intent);
            return;
        }
    }

    public void onBackPressed()
    {
label0:
        {
            if (!b.a.f.c())
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
        b.a.f.a(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        Object obj = b;
        ((p) (obj)).a.f.a(((p) (obj)).a, ((p) (obj)).a, null);
        super.onCreate(bundle);
        obj = (android.support.v4.app.n)getLastNonConfigurationInstance();
        if (obj != null)
        {
            p p1 = b;
            m m1 = ((android.support.v4.app.n) (obj)).c;
            p1.a.g = m1;
        }
        if (bundle != null)
        {
            android.os.Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            p p2 = b;
            if (obj != null)
            {
                bundle = ((android.support.v4.app.n) (obj)).b;
            } else
            {
                bundle = null;
            }
            p2.a.f.a(parcelable, bundle);
        }
        b.a.f.i();
    }

    public boolean onCreatePanelMenu(int j, Menu menu)
    {
        if (j == 0)
        {
            boolean flag = super.onCreatePanelMenu(j, menu);
            p p1 = b;
            android.view.MenuInflater menuinflater = getMenuInflater();
            boolean flag1 = p1.a.f.a(menu, menuinflater);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                return flag | flag1;
            } else
            {
                return true;
            }
        } else
        {
            return super.onCreatePanelMenu(j, menu);
        }
    }

    public volatile View onCreateView(View view, String s1, Context context, AttributeSet attributeset)
    {
        return super.onCreateView(view, s1, context, attributeset);
    }

    public volatile View onCreateView(String s1, Context context, AttributeSet attributeset)
    {
        return super.onCreateView(s1, context, attributeset);
    }

    public void onDestroy()
    {
        super.onDestroy();
        a(false);
        b.a.f.n();
        q q1 = b.a;
        if (q1.h != null)
        {
            q1.h.h();
        }
    }

    public boolean onKeyDown(int j, KeyEvent keyevent)
    {
        if (android.os.Build.VERSION.SDK_INT < 5 && j == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
            return true;
        } else
        {
            return super.onKeyDown(j, keyevent);
        }
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        b.a.f.o();
    }

    public boolean onMenuItemSelected(int j, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(j, menuitem))
        {
            return true;
        }
        switch (j)
        {
        default:
            return false;

        case 0: // '\0'
            return b.a.f.a(menuitem);

        case 6: // '\006'
            return b.a.f.b(menuitem);
        }
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        b.b();
    }

    public void onPanelClosed(int j, Menu menu)
    {
        j;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 27;
           goto _L1 _L2
_L1:
        super.onPanelClosed(j, menu);
        return;
_L2:
        b.a.f.b(menu);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onPause()
    {
        super.onPause();
        d = false;
        if (a.hasMessages(2))
        {
            a.removeMessages(2);
            a_();
        }
        b.a.f.a(4);
    }

    public void onPostResume()
    {
        super.onPostResume();
        a.removeMessages(2);
        a_();
        b.c();
    }

    public boolean onPreparePanel(int j, View view, Menu menu)
    {
        if (j == 0 && menu != null)
        {
            if (h)
            {
                h = false;
                menu.clear();
                onCreatePanelMenu(j, menu);
            }
            return super.onPreparePanel(0, view, menu) | b.a.f.a(menu);
        } else
        {
            return super.onPreparePanel(j, view, menu);
        }
    }

    public void onRequestPermissionsResult(int j, String as[], int ai[])
    {
        int k;
        int i1;
label0:
        {
            k = j >> 8 & 0xff;
            if (k != 0)
            {
                k--;
                i1 = b.a();
                if (i1 != 0 && k >= 0 && k < i1)
                {
                    break label0;
                }
                (new StringBuilder("Activity result fragment index out of range: 0x")).append(Integer.toHexString(j));
            }
            return;
        }
        if ((Fragment)b.a(new ArrayList(i1)).get(k) == null)
        {
            (new StringBuilder("Activity result no fragment exists for index: 0x")).append(Integer.toHexString(j));
            return;
        } else
        {
            Fragment.e();
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        a.sendEmptyMessage(2);
        d = true;
        b.c();
    }

    public final Object onRetainNonConfigurationInstance()
    {
        if (e)
        {
            a(true);
        }
        s s1 = b.a.f;
        ArrayList arraylist1;
        if (s1.f != null)
        {
            int j = 0;
            ArrayList arraylist = null;
            do
            {
                arraylist1 = arraylist;
                if (j >= s1.f.size())
                {
                    break;
                }
                Fragment fragment = (Fragment)s1.f.get(j);
                ArrayList arraylist2 = arraylist;
                if (fragment != null)
                {
                    arraylist2 = arraylist;
                    if (fragment.C)
                    {
                        arraylist1 = arraylist;
                        if (arraylist == null)
                        {
                            arraylist1 = new ArrayList();
                        }
                        arraylist1.add(fragment);
                        fragment.D = true;
                        int k;
                        if (fragment.j != null)
                        {
                            k = fragment.j.g;
                        } else
                        {
                            k = -1;
                        }
                        fragment.k = k;
                        arraylist2 = arraylist1;
                        if (s.a)
                        {
                            (new StringBuilder("retainNonConfig: keeping retained ")).append(fragment);
                            arraylist2 = arraylist1;
                        }
                    }
                }
                j++;
                arraylist = arraylist2;
            } while (true);
        } else
        {
            arraylist1 = null;
        }
        m m1 = b.a.g();
        if (arraylist1 == null && m1 == null)
        {
            return null;
        } else
        {
            android.support.v4.app.n n1 = new android.support.v4.app.n();
            n1.a = null;
            n1.b = arraylist1;
            n1.c = m1;
            return n1;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        android.os.Parcelable parcelable = b.a.f.h();
        if (parcelable != null)
        {
            bundle.putParcelable("android:support:fragments", parcelable);
        }
    }

    public void onStart()
    {
        super.onStart();
        e = false;
        f = false;
        a.removeMessages(1);
        if (!c)
        {
            c = true;
            b.a.f.j();
        }
        b.b();
        b.c();
        Object obj = b.a;
        if (!((q) (obj)).j)
        {
            obj.j = true;
            q q1;
            int j;
            if (((q) (obj)).h != null)
            {
                ((q) (obj)).h.c();
            } else
            if (!((q) (obj)).i)
            {
                obj.h = ((q) (obj)).a("(root)", ((q) (obj)).j, false);
                if (((q) (obj)).h != null && !((q) (obj)).h.e)
                {
                    ((q) (obj)).h.c();
                }
            }
            obj.i = true;
        }
        b.a.f.k();
        q1 = b.a;
        if (q1.g != null)
        {
            int j1 = q1.g.size();
            obj = new ao[j1];
            for (j = j1 - 1; j >= 0; j--)
            {
                obj[j] = (ao)q1.g.c(j);
            }

            for (int k = 0; k < j1; k++)
            {
                ao ao1 = obj[k];
                if (ao1.f)
                {
                    if (ao.a)
                    {
                        (new StringBuilder("Finished Retaining in ")).append(ao1);
                    }
                    ao1.f = false;
                    for (int i1 = ao1.b.a() - 1; i1 >= 0; i1--)
                    {
                        ap ap1 = (ap)ao1.b.d(i1);
                        if (ap1.i)
                        {
                            if (ao.a)
                            {
                                (new StringBuilder("  Finished Retaining: ")).append(ap1);
                            }
                            ap1.i = false;
                            if (ap1.h != ap1.j && !ap1.h)
                            {
                                ap1.b();
                            }
                        }
                        if (ap1.h && ap1.e && !ap1.k)
                        {
                            ap1.b(ap1.d, ap1.g);
                        }
                    }

                }
                ao1.g();
            }

        }
    }

    public void onStateNotSaved()
    {
        b.b();
    }

    public void onStop()
    {
        super.onStop();
        e = true;
        a.sendEmptyMessage(1);
        b.a.f.m();
    }

    public void startActivityForResult(Intent intent, int j)
    {
        if (j != -1 && (0xffff0000 & j) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        } else
        {
            super.startActivityForResult(intent, j);
            return;
        }
    }
}
