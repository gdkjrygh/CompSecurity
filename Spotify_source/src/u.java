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
import android.os.Message;
import android.support.v4.app.Fragment;
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

public class u extends s
    implements l, n
{

    final Handler a = new Handler() {

        private u a;

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
            if (!a.c) goto _L5; else goto _L4
_L4:
            a.a(false);
            return;
_L3:
            a.O_();
            a.b.c();
            return;
        }

            
            {
                a = u.this;
                super();
            }
    };
    final y b = new y(new v(this));
    boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;

    public u()
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
        s1 = ((Resources) (obj)).getResourceTypeName(i);
        obj = ((Resources) (obj)).getResourceEntryName(i);
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
            int j = view.getChildCount();
            if (j > 0)
            {
                s1 = (new StringBuilder()).append(s1).append("  ").toString();
                int i = 0;
                while (i < j) 
                {
                    a(s1, printwriter, view.getChildAt(i));
                    i++;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void O_()
    {
        b.a.d.o();
    }

    public final am S_()
    {
        z z1 = b.a;
        if (z1.f != null)
        {
            return z1.f;
        } else
        {
            z1.g = true;
            z1.f = z1.a("(root)", z1.h, true);
            return z1.f;
        }
    }

    final View a(View view, String s1, Context context, AttributeSet attributeset)
    {
        return b.a.d.a(view, s1, context, attributeset);
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
            super.startActivityForResult(intent, (fragment.i + 1 << 16) + (0xffff & i));
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
            Object obj1 = ((y) (obj)).a;
            if (((z) (obj1)).f != null && ((z) (obj1)).h)
            {
                obj1.h = false;
                int i;
                if (flag)
                {
                    ((z) (obj1)).f.d();
                } else
                {
                    ((z) (obj1)).f.c();
                }
            }
            obj = ((y) (obj)).a.d;
            if (((ac) (obj)).b != null)
            {
                for (i = 0; i < ((ac) (obj)).b.size(); i++)
                {
                    obj1 = (Fragment)((ac) (obj)).b.get(i);
                    if (obj1 != null)
                    {
                        obj1.G = flag;
                    }
                }

            }
            b.a.d.c(2);
        }
    }

    public final aa a_()
    {
        return b.a.d;
    }

    public final void b_()
    {
        throw new IllegalArgumentException("Can only use lower 8 bits for requestCode");
    }

    public void dump(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        int i = android.os.Build.VERSION.SDK_INT;
        printwriter.print(s1);
        printwriter.print("Local FragmentActivity ");
        printwriter.print(Integer.toHexString(System.identityHashCode(this)));
        printwriter.println(" State:");
        String s2 = (new StringBuilder()).append(s1).append("  ").toString();
        printwriter.print(s2);
        printwriter.print("mCreated=");
        printwriter.print(d);
        printwriter.print("mResumed=");
        printwriter.print(e);
        printwriter.print(" mStopped=");
        printwriter.print(c);
        printwriter.print(" mReallyStopped=");
        printwriter.println(f);
        z z1 = b.a;
        printwriter.print(s2);
        printwriter.print("mLoadersStarted=");
        printwriter.println(z1.h);
        if (z1.f != null)
        {
            printwriter.print(s2);
            printwriter.print("Loader Manager ");
            printwriter.print(Integer.toHexString(System.identityHashCode(z1.f)));
            printwriter.println(":");
            z1.f.a((new StringBuilder()).append(s2).append("  ").toString(), filedescriptor, printwriter, as);
        }
        b.a.d.a(s1, filedescriptor, printwriter, as);
        printwriter.print(s1);
        printwriter.println("View Hierarchy:");
        a((new StringBuilder()).append(s1).append("  ").toString(), printwriter, getWindow().getDecorView());
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        b.b();
        int k = i >> 16;
        if (k != 0)
        {
            k--;
            int i1 = b.a();
            if (i1 == 0 || k < 0 || k >= i1)
            {
                Log.w("FragmentActivity", (new StringBuilder("Activity result fragment index out of range: 0x")).append(Integer.toHexString(i)).toString());
                return;
            }
            Fragment fragment = (Fragment)b.a(new ArrayList(i1)).get(k);
            if (fragment == null)
            {
                Log.w("FragmentActivity", (new StringBuilder("Activity result no fragment exists for index: 0x")).append(Integer.toHexString(i)).toString());
                return;
            } else
            {
                fragment.a(0xffff & i, j, intent);
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
        ((y) (obj)).a.d.a(((y) (obj)).a, ((y) (obj)).a, null);
        super.onCreate(bundle);
        obj = (w)getLastNonConfigurationInstance();
        if (obj != null)
        {
            y y1 = b;
            hs hs1 = ((w) (obj)).b;
            y1.a.e = hs1;
        }
        if (bundle != null)
        {
            android.os.Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            y y2 = b;
            if (obj != null)
            {
                bundle = ((w) (obj)).a;
            } else
            {
                bundle = null;
            }
            y2.a.d.a(parcelable, bundle);
        }
        b.a.d.l();
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        if (i == 0)
        {
            boolean flag = super.onCreatePanelMenu(i, menu);
            y y1 = b;
            android.view.MenuInflater menuinflater = getMenuInflater();
            boolean flag1 = y1.a.d.a(menu, menuinflater);
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
        b.a.d.q();
        z z1 = b.a;
        if (z1.f != null)
        {
            z1.f.g();
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
        b.b();
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
            O_();
        }
        b.a.d.c(4);
    }

    public void onPostResume()
    {
        super.onPostResume();
        a.removeMessages(2);
        O_();
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

    public void onRequestPermissionsResult(int i, String as[], int ai[])
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
        if ((Fragment)b.a(new ArrayList(k)).get(j) == null)
        {
            Log.w("FragmentActivity", (new StringBuilder("Activity result no fragment exists for index: 0x")).append(Integer.toHexString(i)).toString());
            return;
        } else
        {
            Fragment.v();
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
        ac ac1 = b.a.d;
        ArrayList arraylist1;
        if (ac1.b != null)
        {
            int i = 0;
            ArrayList arraylist = null;
            do
            {
                arraylist1 = arraylist;
                if (i >= ac1.b.size())
                {
                    break;
                }
                Fragment fragment = (Fragment)ac1.b.get(i);
                arraylist1 = arraylist;
                if (fragment != null)
                {
                    arraylist1 = arraylist;
                    if (fragment.E)
                    {
                        arraylist1 = arraylist;
                        if (arraylist == null)
                        {
                            arraylist1 = new ArrayList();
                        }
                        arraylist1.add(fragment);
                        fragment.F = true;
                        int j;
                        if (fragment.l != null)
                        {
                            j = fragment.l.i;
                        } else
                        {
                            j = -1;
                        }
                        fragment.m = j;
                    }
                }
                i++;
                arraylist = arraylist1;
            } while (true);
        } else
        {
            arraylist1 = null;
        }
        hs hs1 = b.a.g();
        if (arraylist1 == null && hs1 == null)
        {
            return null;
        } else
        {
            w w1 = new w();
            w1.a = arraylist1;
            w1.b = hs1;
            return w1;
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
        b.b();
        b.c();
        Object obj = b.a;
        if (!((z) (obj)).h)
        {
            obj.h = true;
            z z1;
            int i;
            if (((z) (obj)).f != null)
            {
                ((z) (obj)).f.b();
            } else
            if (!((z) (obj)).g)
            {
                obj.f = ((z) (obj)).a("(root)", ((z) (obj)).h, false);
                if (((z) (obj)).f != null && !((z) (obj)).f.d)
                {
                    ((z) (obj)).f.b();
                }
            }
            obj.g = true;
        }
        b.a.d.n();
        z1 = b.a;
        if (z1.e != null)
        {
            int i1 = z1.e.size();
            obj = new ao[i1];
            for (i = i1 - 1; i >= 0; i--)
            {
                obj[i] = (ao)z1.e.c(i);
            }

            for (int j = 0; j < i1; j++)
            {
                ao ao1 = obj[j];
                if (ao1.e)
                {
                    ao1.e = false;
                    for (int k = ao1.a.a() - 1; k >= 0; k--)
                    {
                        ap ap1 = (ap)ao1.a.d(k);
                        if (ap1.h)
                        {
                            ap1.h = false;
                            if (ap1.g != ap1.i && !ap1.g)
                            {
                                ap1.b();
                            }
                        }
                        if (ap1.g && ap1.d && !ap1.j)
                        {
                            ap1.b(ap1.f);
                        }
                    }

                }
                ao1.f();
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
        c = true;
        a.sendEmptyMessage(1);
        b.a.d.p();
    }

    public void q_()
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
