// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckBox;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import com.nineoldandroids.a.o;
import com.qihoo.security.a.a.a;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.service.ProcessClearService;
import com.qihoo.security.service.SecurityService;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.main.HomeActivity;
import com.qihoo.security.ui.result.f;
import com.qihoo.utils.notice.c;
import com.qihoo360.mobilesafe.b.g;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.b.s;
import com.qihoo360.mobilesafe.service.KillBean;
import com.qihoo360.mobilesafe.service.ProcessInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            ProcessClearWhiteListActivity

public class ProcessClearActivity extends BaseActivity
    implements android.view.View.OnClickListener
{
    class a extends BaseExpandableListAdapter
    {

        final ProcessClearActivity a;
        private final List b = new ArrayList();
        private final List c = new ArrayList();
        private b d;
        private int e;
        private int f;
        private int g;
        private final long h = com.qihoo360.mobilesafe.b.s.c() - (long)com.qihoo360.mobilesafe.b.s.e();

        private int a(List list)
        {
            boolean flag = false;
            int i1 = ((flag) ? 1 : 0);
            if (list != null)
            {
                i1 = ((flag) ? 1 : 0);
                if (!list.isEmpty())
                {
                    list = list.iterator();
                    for (i1 = 0; list.hasNext(); i1 = ((b)list.next()).d + i1) { }
                }
            }
            return i1;
        }

        private String a(String s1)
        {
            String s2 = s1;
            if (!TextUtils.isEmpty(s1))
            {
                s2 = (new StringBuilder()).append(s1.substring(0, 1).toUpperCase(Locale.US)).append(s1.substring(1)).toString();
            }
            return s2;
        }

        static List a(a a1)
        {
            return a1.b;
        }

        static void a(a a1, View view, int i1, b b1, boolean flag)
        {
            a1.b(view, i1, b1, flag);
        }

        private void a(List list, List list1, List list2)
        {
            e = 0;
            f = 0;
            g = 0;
            c.clear();
            if (list != null && !list.isEmpty())
            {
                String s1 = (new StringBuilder()).append(a(Build.BRAND)).append(" Rom ").append(a.o.a(0x7f0c0017)).toString();
                d = new b("rom_sys_info", s1, 0, false, false, false, null, 0);
                int i1 = a(list);
                d.a(i1);
                b.addAll(list);
                c.add(d);
                if (com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.o(a))
                {
                    com.qihoo.security.support.b.a(11407, s1, (new StringBuilder()).append((long)(i1 * 100) / h).append("").toString());
                }
            }
            if (list1 != null && !list1.isEmpty())
            {
                c.addAll(list1);
                if (com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.o(a))
                {
                    list = (b)list1.get(0);
                    com.qihoo.security.support.b.a(11408, ((b) (list)).b.toString(), (new StringBuilder()).append((long)(((b) (list)).d * 100) / h).append("").toString());
                    if (list1.size() > 1)
                    {
                        list = (b)list1.get(1);
                        com.qihoo.security.support.b.a(11409, ((b) (list)).b.toString(), (new StringBuilder()).append((long)(((b) (list)).d * 100) / h).append("").toString());
                    }
                }
            }
            if (list2 != null && !list2.isEmpty())
            {
                c.addAll(list2);
            }
        }

        private void b(View view, int i1, b b1, boolean flag)
        {
            android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
            o o1 = com.nineoldandroids.a.o.b(new int[] {
                view.getHeight(), 1
            }).d(200L);
            o1.a(new com.nineoldandroids.a.b(this, view, flag, b1, i1) {

                final View a;
                final boolean b;
                final b c;
                final int d;
                final a e;

                public void b(com.nineoldandroids.a.a a1)
                {
                    ProcessClearActivity.m(e.a).setEnabled(true);
                    if (e.a.isFinishing()) goto _L2; else goto _L1
_L1:
                    a1 = a.getLayoutParams();
                    com.nineoldandroids.b.a.a(a, 1.0F);
                    com.nineoldandroids.b.a.d(a, 0.0F);
                    a1.height = 0;
                    a.setLayoutParams(a1);
                    if (b)
                    {
                        com.qihoo.security.ui.opti.sysclear.a.c(e);
                    }
                    if (!c.h)
                    {
                        com.qihoo.security.ui.opti.sysclear.a.d(e);
                    }
                    if (c.j >= 3)
                    {
                        a.e(e);
                    }
                    if (d < 0) goto _L4; else goto _L3
_L3:
                    com.qihoo.security.ui.opti.sysclear.a.a(e).remove(c);
                    e.a(c);
_L6:
                    e.notifyDataSetChanged();
                    com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(e.a, false);
                    com.qihoo.security.ui.opti.sysclear.a.g(e);
_L2:
                    return;
_L4:
                    if (com.qihoo.security.ui.opti.sysclear.a.f(e) != null && com.qihoo.security.ui.opti.sysclear.a.f(e).size() > 0)
                    {
                        com.qihoo.security.ui.opti.sysclear.a.f(e).remove(c);
                    }
                    if (true) goto _L6; else goto _L5
_L5:
                }

            
            {
                e = a1;
                a = view;
                b = flag;
                c = b1;
                d = i1;
                super();
            }
            });
            o1.a(new com.nineoldandroids.a.o.b(this, layoutparams, view) {

                final android.view.ViewGroup.LayoutParams a;
                final View b;
                final a c;

                public void a(o o1)
                {
                    a.height = ((Integer)o1.o()).intValue();
                    b.setLayoutParams(a);
                }

            
            {
                c = a1;
                a = layoutparams;
                b = view;
                super();
            }
            });
            o1.a();
        }

        static void b(a a1)
        {
            a1.l();
        }

        static int c(a a1)
        {
            int i1 = a1.g;
            a1.g = i1 + 1;
            return i1;
        }

        static int d(a a1)
        {
            int i1 = a1.e;
            a1.e = i1 + 1;
            return i1;
        }

        static int e(a a1)
        {
            int i1 = a1.f;
            a1.f = i1 + 1;
            return i1;
        }

        static List f(a a1)
        {
            return a1.c;
        }

        static void g(a a1)
        {
            a1.m();
        }

        private void l()
        {
            ProcessClearActivity.m(a).setVisibility(0);
            int j1 = ProcessClearActivity.m(a).getChildCount();
            com.qihoo.security.a.a.a a1 = new com.qihoo.security.a.a.a(2, 3, 20L, com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.s(a), ProcessClearActivity.t(a));
            if (j1 > 0)
            {
                for (int i1 = 0; i1 < j1; i1++)
                {
                    View view = ProcessClearActivity.m(a).getChildAt(i1);
                    view.setVisibility(4);
                    a1.a(view);
                }

                a1.a(new com.qihoo.security.a.a.a.a(this) {

                    final a a;

                    public void a()
                    {
                        ProcessClearActivity.m(a.a).setEnabled(true);
                    }

            
            {
                a = a1;
                super();
            }
                });
                if (a1.a() != 0)
                {
                    com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a, 0, com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.f(a));
                    a1.b();
                    ProcessClearActivity.m(a).setEnabled(false);
                }
                return;
            } else
            {
                com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a, 0, com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.f(a));
                return;
            }
        }

        private void m()
        {
label0:
            {
                if (!d())
                {
                    if (com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.g(a).size() != 0)
                    {
                        break label0;
                    }
                    com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.d(a, false);
                }
                return;
            }
            com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.d(a, true);
        }

        private List n()
        {
            if (c != null && !c.isEmpty())
            {
                ArrayList arraylist = new ArrayList();
                if (c != null && !c.isEmpty())
                {
                    arraylist.addAll(c);
                }
                if (b != null && !b.isEmpty())
                {
                    arraylist.addAll(b);
                }
                return arraylist;
            } else
            {
                return null;
            }
        }

        public b a(int i1)
        {
            if (c == null)
            {
                return null;
            } else
            {
                return (b)c.get(i1);
            }
        }

        public b a(int i1, int j1)
        {
            while (b == null || i1 != 0 || b == null || b.size() <= 0 || j1 >= b.size()) 
            {
                return null;
            }
            return (b)b.get(j1);
        }

        public void a()
        {
            a(((List) (null)), ((List) (null)), ((List) (null)));
        }

        public void a(View view, int i1, b b1)
        {
            a(view, i1, b1, false);
        }

        public void a(View view, int i1, b b1, boolean flag)
        {
            if (view == null)
            {
                return;
            } else
            {
                ProcessClearActivity.m(a).setEnabled(false);
                com.nineoldandroids.b.b.a(view).a(-view.getWidth()).c(0.0F).a(300L).a(new com.nineoldandroids.a.b(this, view, i1, b1, flag) {

                    final View a;
                    final int b;
                    final b c;
                    final boolean d;
                    final a e;

                    public void b(com.nineoldandroids.a.a a1)
                    {
                        if (!e.a.isFinishing())
                        {
                            com.qihoo.security.ui.opti.sysclear.a.a(e, a, b, c, d);
                            return;
                        } else
                        {
                            ProcessClearActivity.m(e.a).setEnabled(true);
                            return;
                        }
                    }

            
            {
                e = a1;
                a = view;
                b = i1;
                c = b1;
                d = flag;
                super();
            }
                });
                return;
            }
        }

        public void a(b b1)
        {
            b b2 = a(0);
            if (b1 != null && b2 != b1)
            {
                int i1 = b2.d - b1.d;
                b2.a(i1);
                if (i1 == 0)
                {
                    c.remove(d);
                    notifyDataSetChanged();
                }
            }
        }

        public b b(int i1, int j1)
        {
            if (com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a) == null)
            {
                return null;
            }
            if (i1 == 0)
            {
                if (b(i1))
                {
                    return com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a).a(i1, j1);
                } else
                {
                    return com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a).a(i1);
                }
            } else
            {
                return com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a).a(i1);
            }
        }

        public void b(View view, int i1, b b1)
        {
            a(view, i1, b1, true);
        }

        public boolean b()
        {
            boolean flag1 = false;
            int i1 = getGroupCount();
            boolean flag = flag1;
            if (ProcessClearActivity.m(a) != null)
            {
                flag = flag1;
                if (i1 > 0)
                {
                    flag = flag1;
                    if (b(0))
                    {
                        flag = flag1;
                        if (i1 < 7)
                        {
                            ProcessClearActivity.m(a).expandGroup(0);
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }

        public boolean b(int i1)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a) != null)
            {
                b b1 = com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a).a(i1);
                if (!TextUtils.isEmpty(b1.a))
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                flag = flag1;
                if ((i1 & "rom_sys_info".equals(b1.a)) != 0)
                {
                    flag = true;
                }
            }
            return flag;
        }

        public void c()
        {
            if (android.os.Build.VERSION.SDK_INT <= 11)
            {
                com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a, 0, com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.f(a));
            } else
            if (ProcessClearActivity.m(a) != null)
            {
                ProcessClearActivity.m(a).setVisibility(4);
                ProcessClearActivity.m(a).post(new Runnable(this) {

                    final a a;

                    public void run()
                    {
                        if (com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a.a).b())
                        {
                            android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener = new android.view.ViewTreeObserver.OnGlobalLayoutListener(this) {

                                final a._cls3 a;

                                public void onGlobalLayout()
                                {
                                    com.qihoo.security.ui.opti.sysclear.a.b(a.a);
                                    ProcessClearActivity.m(a.a.a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
                                }

            
            {
                a = _pcls3;
                super();
            }
                            };
                            ProcessClearActivity.m(a.a).getViewTreeObserver().addOnGlobalLayoutListener(ongloballayoutlistener);
                            return;
                        } else
                        {
                            com.qihoo.security.ui.opti.sysclear.a.b(a);
                            return;
                        }
                    }

            
            {
                a = a1;
                super();
            }
                });
                return;
            }
        }

        public boolean d()
        {
            boolean flag1 = true;
            boolean flag = flag1;
            if (c != null)
            {
                flag = flag1;
                if (c.isEmpty())
                {
                    flag = false;
                }
            }
            return flag;
        }

        public boolean e()
        {
            Object obj = n();
            if (obj != null)
            {
                if (((List) (obj)).size() > 0)
                {
                    for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
                    {
                        b b1 = (b)((Iterator) (obj)).next();
                        if (!b1.h && !b1.c)
                        {
                            return false;
                        }
                    }

                    return true;
                } else
                {
                    return true;
                }
            } else
            {
                return ProcessClearActivity.u(a) != null && !ProcessClearActivity.u(a).isEmpty();
            }
        }

        public boolean f()
        {
            Object obj = n();
            if (obj != null)
            {
                if (((List) (obj)).size() > 0)
                {
                    for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
                    {
                        if (!((b)((Iterator) (obj)).next()).h)
                        {
                            return false;
                        }
                    }

                    return true;
                } else
                {
                    return true;
                }
            } else
            {
                return false;
            }
        }

        public List g()
        {
            ArrayList arraylist = new ArrayList();
            Object obj = n();
            if (obj != null && !((List) (obj)).isEmpty())
            {
                b b1 = (b)((List) (obj)).get(0);
                if (b1 != null)
                {
                    KillBean killbean;
                    boolean flag;
                    if (!TextUtils.isEmpty(b1.a))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if ("rom_sys_info".equals(b1.a) & flag)
                    {
                        ((List) (obj)).remove(0);
                    }
                }
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    b1 = (b)((Iterator) (obj)).next();
                    if (b1.c)
                    {
                        killbean = new KillBean();
                        killbean.packageName = b1.a;
                        killbean.memory = b1.d;
                        arraylist.add(killbean);
                    }
                } while (true);
            }
            return arraylist;
        }

        public Object getChild(int i1, int j1)
        {
            return a(i1, j1);
        }

        public long getChildId(int i1, int j1)
        {
            return (long)j1;
        }

        public View getChildView(int i1, int j1, boolean flag, View view, ViewGroup viewgroup)
        {
            b b1;
            android.graphics.drawable.Drawable drawable;
            if (view == null)
            {
                viewgroup = new a(this);
                view = ProcessClearActivity.p(a).inflate(0x7f030086, null);
                viewgroup.b = (LocaleTextView)view.findViewById(0x7f0b0075);
                viewgroup.d = (LocaleTextView)view.findViewById(0x7f0b01bd);
                viewgroup.c = (LocaleTextView)view.findViewById(0x7f0b01b2);
                viewgroup.e = (CheckBox)view.findViewById(0x7f0b01af);
                viewgroup.a = (ImageView)view.findViewById(0x7f0b0074);
                view.setTag(viewgroup);
            } else
            {
                viewgroup = (a)view.getTag();
            }
            b1 = (b)b.get(j1);
            ((a) (viewgroup)).b.setLocalText(b1.b);
            if (b1.h)
            {
                ((a) (viewgroup)).d.setLocalText(a.o.a(0x7f0c001e));
            } else
            {
                ((a) (viewgroup)).d.setLocalText(a.o.a(0x7f0c001f));
            }
            ((a) (viewgroup)).c.setLocalText(a.a(b1.d));
            drawable = ProcessClearActivity.r(a).a(b1.a, null);
            if (drawable != null)
            {
                ((a) (viewgroup)).a.setImageDrawable(drawable);
            } else
            {
                ((a) (viewgroup)).a.setImageDrawable(com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.q(a).getResources().getDrawable(0x7f020043));
            }
            if (b1.h)
            {
                ((a) (viewgroup)).e.setChecked(false);
            } else
            {
                ((a) (viewgroup)).e.setChecked(b1.c);
            }
            ((a) (viewgroup)).e.setOnClickListener(new android.view.View.OnClickListener(this, b1) {

                final b a;
                final a b;

                public void onClick(View view)
                {
                    int i1;
                    boolean flag;
                    flag = ((CheckBox)view).isChecked();
                    i1 = com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.f(b.a);
                    if (!flag) goto _L2; else goto _L1
_L1:
                    ProcessClearActivity.e(b.a, a.d);
                    a.c = true;
                    if (a.h)
                    {
                        com.qihoo.security.support.b.c(11019);
                    }
_L4:
                    if (a.h)
                    {
                        a.h = false;
                    }
                    ((CheckBox)view).setChecked(flag);
                    com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(b.a, false, com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.f(b.a), i1);
                    b.notifyDataSetChanged();
                    return;
_L2:
                    com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.f(b.a, a.d);
                    a.c = false;
                    if (!a.h)
                    {
                        com.qihoo.security.support.b.c(11018);
                    }
                    if (true) goto _L4; else goto _L3
_L3:
                }

            
            {
                b = a1;
                a = b1;
                super();
            }
            });
            return view;
        }

        public int getChildrenCount(int i1)
        {
            while (b == null || b.size() == 0 || i1 > 0 || i1 != 0) 
            {
                return 0;
            }
            return b.size();
        }

        public Object getGroup(int i1)
        {
            return a(i1);
        }

        public int getGroupCount()
        {
            if (c == null)
            {
                return 0;
            } else
            {
                return c.size();
            }
        }

        public long getGroupId(int i1)
        {
            return (long)i1;
        }

        public View getGroupView(int i1, boolean flag, View view, ViewGroup viewgroup)
        {
            b b1;
            int j1;
            Iterator iterator;
            if (view == null)
            {
                viewgroup = new b(this);
                view = ProcessClearActivity.p(a).inflate(0x7f030087, null);
                viewgroup.b = (LocaleTextView)view.findViewById(0x7f0b0075);
                viewgroup.d = (LocaleTextView)view.findViewById(0x7f0b01bd);
                viewgroup.c = (LocaleTextView)view.findViewById(0x7f0b01b2);
                viewgroup.e = (LocaleTextView)view.findViewById(0x7f0b01be);
                viewgroup.f = (CheckBox)view.findViewById(0x7f0b01af);
                viewgroup.a = (ImageView)view.findViewById(0x7f0b0074);
                view.setTag(viewgroup);
            } else
            {
                viewgroup = (b)view.getTag();
            }
            b1 = (b)c.get(i1);
            ((b) (viewgroup)).b.setLocalText(b1.b);
            if (b1.h)
            {
                ((b) (viewgroup)).d.setLocalText(a.o.a(0x7f0c001e));
                ((b) (viewgroup)).d.setVisibility(0);
            } else
            {
                ((b) (viewgroup)).d.setVisibility(8);
            }
            if (b1.d == 0)
            {
                b1.d = 1024;
            }
            ((b) (viewgroup)).c.setLocalText(a.a(b1.d));
            if (!b1.a.equals("rom_sys_info")) goto _L2; else goto _L1
_L1:
            ((b) (viewgroup)).a.setImageDrawable(com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.q(a).getResources().getDrawable(0x7f02004b));
            ((b) (viewgroup)).e.setLocalText(a.o.a(0x7f0c0035));
            ((b) (viewgroup)).e.setVisibility(0);
            j1 = b.size();
            iterator = b.iterator();
            i1 = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((b)iterator.next()).c)
                {
                    i1++;
                }
            } while (true);
            if (j1 != i1) goto _L4; else goto _L3
_L3:
            ((b) (viewgroup)).f.setChecked(true);
            ((b) (viewgroup)).f.setButtonDrawable(0x7f020055);
_L6:
            ((b) (viewgroup)).f.setOnClickListener(new android.view.View.OnClickListener(this, b1) {

                final b a;
                final a b;

                public void onClick(View view)
                {
                    int i1;
                    boolean flag;
                    flag = ((CheckBox)view).isChecked();
                    i1 = com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.f(b.a);
                    if (!a.a.equals("rom_sys_info")) goto _L2; else goto _L1
_L1:
                    Iterator iterator = com.qihoo.security.ui.opti.sysclear.a.a(b).iterator();
                    while (iterator.hasNext()) 
                    {
                        b b1 = (b)iterator.next();
                        if (flag)
                        {
                            if (!b1.c)
                            {
                                ProcessClearActivity.e(b.a, b1.d);
                            }
                        } else
                        if (b1.c)
                        {
                            com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.f(b.a, b1.d);
                        }
                        b1.c = flag;
                    }
                      goto _L3
_L2:
                    if (!flag) goto _L5; else goto _L4
_L4:
                    ProcessClearActivity.e(b.a, a.d);
                    a.c = true;
                    if (a.h)
                    {
                        com.qihoo.security.support.b.c(11019);
                    }
_L3:
                    ((CheckBox)view).setChecked(flag);
                    b.notifyDataSetChanged();
                    com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(b.a, false, com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.f(b.a), i1);
                    return;
_L5:
                    com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.f(b.a, a.d);
                    a.c = false;
                    if (!a.h)
                    {
                        com.qihoo.security.support.b.c(11018);
                    }
                    if (true) goto _L3; else goto _L6
_L6:
                }

            
            {
                b = a1;
                a = b1;
                super();
            }
            });
            return view;
_L4:
            if (j1 != i1 && i1 != 0)
            {
                ((b) (viewgroup)).f.setChecked(false);
                ((b) (viewgroup)).f.setButtonDrawable(0x7f020056);
            } else
            if (i1 == 0)
            {
                ((b) (viewgroup)).f.setChecked(false);
                ((b) (viewgroup)).f.setButtonDrawable(0x7f020054);
            }
            continue; /* Loop/switch isn't completed */
_L2:
            ((b) (viewgroup)).e.setVisibility(8);
            android.graphics.drawable.Drawable drawable = ProcessClearActivity.r(a).a(b1.a, null);
            if (drawable != null)
            {
                ((b) (viewgroup)).a.setImageDrawable(drawable);
            } else
            {
                ((b) (viewgroup)).a.setImageDrawable(com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.q(a).getResources().getDrawable(0x7f020043));
            }
            if (b1.h)
            {
                if (b1.c)
                {
                    ((b) (viewgroup)).f.setButtonDrawable(0x7f020055);
                    ((b) (viewgroup)).f.setChecked(b1.c);
                } else
                {
                    ((b) (viewgroup)).f.setButtonDrawable(0x7f020054);
                    ((b) (viewgroup)).f.setChecked(b1.c);
                }
            } else
            if (b1.c)
            {
                ((b) (viewgroup)).f.setButtonDrawable(0x7f020055);
                ((b) (viewgroup)).f.setChecked(b1.c);
            } else
            {
                ((b) (viewgroup)).f.setButtonDrawable(0x7f020054);
                ((b) (viewgroup)).f.setChecked(b1.c);
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        public List h()
        {
            ArrayList arraylist = new ArrayList();
            Object obj = n();
            if (obj != null && !((List) (obj)).isEmpty())
            {
                b b1 = (b)((List) (obj)).get(0);
                if (b1 != null)
                {
                    KillBean killbean;
                    boolean flag;
                    if (!TextUtils.isEmpty(b1.a))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if ("rom_sys_info".equals(b1.a) & flag)
                    {
                        ((List) (obj)).remove(0);
                    }
                }
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    b1 = (b)((Iterator) (obj)).next();
                    if (b1.c && b1.h)
                    {
                        killbean = new KillBean();
                        killbean.packageName = b1.a;
                        killbean.memory = b1.d;
                        arraylist.add(killbean);
                    }
                } while (true);
            }
            return arraylist;
        }

        public boolean hasStableIds()
        {
            return false;
        }

        public int i()
        {
            return e;
        }

        public boolean isChildSelectable(int i1, int j1)
        {
            return true;
        }

        public int j()
        {
            return f;
        }

        public int[] k()
        {
            int i1 = e;
            int j1 = f;
            Object obj = n();
            int l1 = j1;
            int k1 = i1;
            if (obj != null)
            {
                l1 = j1;
                k1 = i1;
                if (!((List) (obj)).isEmpty())
                {
                    b b1 = (b)((List) (obj)).get(0);
                    if (b1 != null)
                    {
                        if (!TextUtils.isEmpty(b1.a))
                        {
                            k1 = 1;
                        } else
                        {
                            k1 = 0;
                        }
                        if (("rom_sys_info".equals(b1.a) & k1) != 0)
                        {
                            ((List) (obj)).remove(0);
                        }
                    }
                    obj = ((List) (obj)).iterator();
                    k1 = j1;
                    j1 = i1;
                    i1 = k1;
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        b1 = (b)((Iterator) (obj)).next();
                        k1 = j1;
                        if (b1.c)
                        {
                            k1 = j1;
                            if (!b1.h)
                            {
                                k1 = j1 + 1;
                            }
                        }
                        if (b1.c && b1.j >= 3)
                        {
                            i1++;
                        }
                        j1 = k1;
                    }
                    k1 = j1;
                    l1 = i1;
                }
            }
            return (new int[] {
                k1, l1
            });
        }

        a(List list, List list1, List list2)
        {
            a = ProcessClearActivity.this;
            super();
            a(list, list1, list2);
        }
    }

    class a.a
    {

        ImageView a;
        LocaleTextView b;
        LocaleTextView c;
        LocaleTextView d;
        CheckBox e;
        final a f;

        a.a(a a1)
        {
            f = a1;
            super();
        }
    }

    class a.b
    {

        ImageView a;
        LocaleTextView b;
        LocaleTextView c;
        LocaleTextView d;
        LocaleTextView e;
        CheckBox f;
        final a g;

        a.b(a a1)
        {
            g = a1;
            super();
        }
    }

    static class b
        implements Comparable
    {

        final String a;
        CharSequence b;
        boolean c;
        int d;
        boolean e;
        boolean f;
        boolean g;
        boolean h;
        public int i[];
        public int j;

        public int a(b b1)
        {
            if (b1 != null)
            {
                if (d < b1.d)
                {
                    return 1;
                }
                if (d <= b1.d)
                {
                    return 0;
                }
            }
            return -1;
        }

        void a(int i1)
        {
            d = i1;
        }

        public int compareTo(Object obj)
        {
            return a((b)obj);
        }

        b(String s1, String s2, int i1, boolean flag, boolean flag1, boolean flag2, int ai1[], 
                int j1)
        {
            b = null;
            c = false;
            d = 0;
            e = false;
            f = false;
            g = false;
            h = false;
            j = 0;
            a = s1;
            d = i1;
            c = true;
            e = flag;
            g = flag1;
            b = s2;
            h = flag2;
            i = ai1;
            j = j1;
            if (flag2)
            {
                c = false;
            }
        }
    }


    private static final String z = com/qihoo/security/ui/opti/sysclear/ProcessClearActivity.getSimpleName();
    private Context A;
    private PackageManager B;
    private ExpandableListView C;
    private a D;
    private LocaleTextView E;
    private LocaleTextView F;
    private LocaleTextView G;
    private View H;
    private View I;
    private View J;
    private LocaleTextView K;
    private View L;
    private int M;
    private int N;
    private long O;
    private com.qihoo360.mobilesafe.core.c.c P;
    private g Q;
    private com.qihoo.security.a.a.a R;
    private int S;
    private final HashMap T = new HashMap();
    private final HashSet U = new HashSet();
    private boolean V;
    private boolean W;
    private boolean X;
    private LayoutInflater Y;
    private boolean Z;
    private LocaleTextView aa;
    private LocaleTextView ab;
    private LocaleTextView ac;
    private com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus ad;
    private int ae;
    private int af;
    private List ag;
    private boolean ah;
    private boolean ai;
    private final ServiceConnection aj = new ServiceConnection() {

        final ProcessClearActivity a;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a, com.qihoo360.mobilesafe.core.c.c.a.a(ibinder));
            if (ProcessClearActivity.h(a) != null)
            {
                try
                {
                    ProcessClearActivity.h(a).a(ProcessClearActivity.i(a));
                }
                // Misplaced declaration of an exception variable
                catch (ComponentName componentname) { }
            }
            a.y.post(new Runnable(this) {

                final _cls6 a;

                public void run()
                {
                    if (ProcessClearActivity.h(a.a) == null) goto _L2; else goto _L1
_L1:
                    if (ProcessClearActivity.h(a.a).f()) goto _L4; else goto _L3
_L3:
                    ProcessClearActivity.j(a.a).setVisibility(8);
                    ProcessClearActivity.h(a.a).a(true);
_L2:
                    a.a.o();
                    return;
_L4:
                    try
                    {
                        ProcessClearActivity.k(a.a).setVisibility(8);
                        ProcessClearActivity.j(a.a).setVisibility(0);
                    }
                    catch (RemoteException remoteexception) { }
                    if (true) goto _L2; else goto _L5
_L5:
                }

            
            {
                a = _pcls6;
                super();
            }
            });
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            if (ProcessClearActivity.h(a) == null)
            {
                break MISSING_BLOCK_LABEL_29;
            }
            ProcessClearActivity.h(a).b(ProcessClearActivity.i(a));
            return;
            componentname;
        }

            
            {
                a = ProcessClearActivity.this;
                super();
            }
    };
    private final com.qihoo360.mobilesafe.core.c.b ak = new com.qihoo360.mobilesafe.core.c.b() {

        final ProcessClearActivity a;

        public void a(int i1, int j1)
            throws RemoteException
        {
        }

        public void a(List list, boolean flag)
            throws RemoteException
        {
            super.a(list, flag);
            a.y.post(new Runnable(this, list) {

                final List a;
                final _cls7 b;

                public void run()
                {
                    if (!b.a.isFinishing())
                    {
                        b.a.a(a);
                    }
                }

            
            {
                b = _pcls7;
                a = list;
                super();
            }
            });
        }

        public void b()
            throws RemoteException
        {
            if (ProcessClearActivity.l(a))
            {
                com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.b(a, false);
            } else
            {
                com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.c(a, true);
                if (!a.isFinishing())
                {
                    a.finish();
                    return;
                }
            }
        }

            
            {
                a = ProcessClearActivity.this;
                super();
            }
    };
    private final int al = 0;
    private final int am = 2;
    Handler y;

    public ProcessClearActivity()
    {
        A = null;
        P = null;
        Q = null;
        ah = false;
        y = new Handler() {

            final ProcessClearActivity a;

            public void handleMessage(Message message)
            {
                int i1 = 0;
                message.what;
                JVM INSTR tableswitch 0 2: default 32
            //                           0 33
            //                           1 32
            //                           2 160;
                   goto _L1 _L2 _L1 _L3
_L1:
                return;
_L2:
                int j1 = message.arg2;
                int k1;
                if (message.obj != null && (message.obj instanceof Integer))
                {
                    i1 = ((Integer)message.obj).intValue();
                } else
                {
                    i1 = 0;
                }
                k1 = (int)((float)(j1 - i1) * ((float)message.arg1 / 10F));
                com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.d(a, k1 + i1);
                if (message.arg1 < 10)
                {
                    Message message1 = a.y.obtainMessage();
                    message1.what = 0;
                    message1.arg1 = message.arg1 + 1;
                    message1.arg2 = j1;
                    message1.obj = Integer.valueOf(i1);
                    a.y.sendMessageDelayed(message1, 60L);
                    return;
                }
                continue; /* Loop/switch isn't completed */
_L3:
                for (; i1 < ProcessClearActivity.m(a).getChildCount(); i1++)
                {
                    message = ProcessClearActivity.m(a).getChildAt(i1);
                    ProcessClearActivity.n(a).a(message);
                }

                ProcessClearActivity.n(a).a(new com.qihoo.security.a.a.a.a(this) {

                    final _cls8 a;

                    public void a()
                    {
                        com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.d(a.a, true);
                    }

            
            {
                a = _pcls8;
                super();
            }
                });
                if (ProcessClearActivity.n(a).a() != 0)
                {
                    ProcessClearActivity.n(a).b();
                    return;
                }
                if (true) goto _L1; else goto _L4
_L4:
            }

            
            {
                a = ProcessClearActivity.this;
                super();
            }
        };
    }

    private int a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        if (examstatus == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER)
        {
            return getResources().getColor(0x7f080058);
        }
        if (examstatus == com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE)
        {
            return getResources().getColor(0x7f080057);
        } else
        {
            return getResources().getColor(0x7f080056);
        }
    }

    static int a(ProcessClearActivity processclearactivity, int i1)
    {
        processclearactivity.N = i1;
        return i1;
    }

    static View a(ProcessClearActivity processclearactivity, View view)
    {
        processclearactivity.L = view;
        return view;
    }

    static a a(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.D;
    }

    static com.qihoo360.mobilesafe.core.c.c a(ProcessClearActivity processclearactivity, com.qihoo360.mobilesafe.core.c.c c1)
    {
        processclearactivity.P = c1;
        return c1;
    }

    private String a(ProcessInfo processinfo)
    {
        String s1 = "";
        Object obj;
        try
        {
            obj = B.getApplicationInfo(processinfo.packageName, 128).loadLabel(B);
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                return processinfo.packageName;
            }
            obj = ((CharSequence) (obj)).toString().trim();
        }
        catch (Exception exception)
        {
            if (!TextUtils.isEmpty(processinfo.packageName))
            {
                s1 = processinfo.packageName;
            }
            return s1;
        }
        return ((String) (obj));
    }

    private void a(int i1, int j1)
    {
        Message message = y.obtainMessage();
        message.arg1 = 0;
        message.arg2 = j1;
        message.obj = Integer.valueOf(i1);
        message.what = 0;
        y.removeMessages(0);
        y.sendMessage(message);
    }

    private void a(b b1, Map map)
    {
        if (b1 == null || map == null || map.isEmpty())
        {
            break MISSING_BLOCK_LABEL_43;
        }
        try
        {
            map = (com.qihoo.security.opti.a.a.a)map.get(b1.a);
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            return;
        }
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        b1.j = map.a();
    }

    static void a(ProcessClearActivity processclearactivity, int i1, int j1)
    {
        processclearactivity.a(i1, j1);
    }

    static void a(ProcessClearActivity processclearactivity, boolean flag, int i1, int j1)
    {
        processclearactivity.a(flag, i1, j1);
    }

    private void a(List list, Map map)
    {
label0:
        {
            I.setVisibility(8);
            if (!V)
            {
                V = true;
                if (list == null || list.isEmpty())
                {
                    break label0;
                }
                H.setVisibility(8);
                C.setVisibility(0);
                b(list, map);
                C.setAdapter(D);
                if (D != null)
                {
                    D.c();
                }
            }
            return;
        }
        if (D != null)
        {
            D.a();
        }
        d(0);
        C.setVisibility(8);
        H.setVisibility(0);
    }

    private void a(boolean flag, int i1, int j1)
    {
        a(j1, i1);
        if (flag)
        {
            o();
        }
    }

    static boolean a(ProcessClearActivity processclearactivity, boolean flag)
    {
        processclearactivity.Z = flag;
        return flag;
    }

    static int b(ProcessClearActivity processclearactivity, int i1)
    {
        processclearactivity.M = i1;
        return i1;
    }

    private void b(List list, Map map)
    {
        S = 0;
        if (list != null && !list.isEmpty())
        {
            ArrayList arraylist = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
            ArrayList arraylist2 = new ArrayList();
            list = list.iterator();
            int i1 = 0;
            int j1 = 0;
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Object obj = (ProcessInfo)list.next();
                String s1 = a(((ProcessInfo) (obj)));
                if (!T.containsKey(s1))
                {
                    String s2 = ((ProcessInfo) (obj)).packageName;
                    int k1 = ((ProcessInfo) (obj)).useMemory;
                    boolean flag1 = ((ProcessInfo) (obj)).isSystem;
                    boolean flag;
                    if (((ProcessInfo) (obj)).flag == 3)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    obj = new b(s2, s1, k1, flag1, false, flag, ((ProcessInfo) (obj)).pids, 0);
                    a(((b) (obj)), map);
                    if (!((b) (obj)).h)
                    {
                        int j2 = ((b) (obj)).d;
                        int l1 = j1 + j2;
                        if (((b) (obj)).e)
                        {
                            i1 += j2;
                            arraylist.add(obj);
                        } else
                        {
                            arraylist1.add(obj);
                        }
                        j1 = i1;
                        i1 = l1;
                    } else
                    {
                        arraylist2.add(obj);
                        int i2 = j1;
                        j1 = i1;
                        i1 = i2;
                    }
                    l1 = i1;
                    i1 = j1;
                    j1 = l1;
                }
            } while (true);
            if (arraylist1 != null && !arraylist1.isEmpty())
            {
                Collections.sort(arraylist1);
            }
            if (arraylist != null && !arraylist.isEmpty())
            {
                Collections.sort(arraylist);
            }
            if (arraylist2 != null && !arraylist2.isEmpty())
            {
                Collections.sort(arraylist2);
            }
            S = j1;
            D = new a(arraylist, arraylist1, arraylist2);
        }
    }

    static boolean b(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.Z;
    }

    static boolean b(ProcessClearActivity processclearactivity, boolean flag)
    {
        processclearactivity.X = flag;
        return flag;
    }

    static int c(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.N;
    }

    static int c(ProcessClearActivity processclearactivity, int i1)
    {
        processclearactivity.S = i1;
        return i1;
    }

    private void c(Intent intent)
    {
        if (intent != null)
        {
            com.qihoo.utils.notice.c.a(A, intent);
            ai = intent.getBooleanExtra("from_notify", false);
        }
        com.qihoo.security.ui.result.f.a().a(0);
    }

    private void c(boolean flag)
    {
        boolean flag2 = false;
        int k1 = r();
        if (!flag && k1 <= 0 && (U == null || U.isEmpty()) && !W)
        {
            ah = false;
            finish();
        } else
        {
            ah = true;
            Intent intent = new Intent();
            if (intent != null && D != null)
            {
                int i1;
                int j1;
                long l1;
                long l2;
                boolean flag1;
                if (flag)
                {
                    flag1 = D.e();
                    int ai1[] = D.k();
                    i1 = ai1[0];
                    j1 = ai1[1];
                    k1 += S;
                    W = false;
                } else
                if (k1 > 0)
                {
                    flag1 = D.f();
                    j1 = D.j();
                    i1 = D.i();
                } else
                {
                    i1 = -1;
                    j1 = -1;
                    flag1 = false;
                }
                if (flag1 || flag)
                {
                    flag2 = true;
                }
                l1 = O;
                l2 = k1;
                if (flag1)
                {
                    ad = com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT;
                }
                intent.putExtra("is_need_read", W);
                intent.putExtra("is_best_fade", flag2);
                intent.putExtra("is_best", flag1);
                intent.putExtra("extra_killed_memory", k1);
                intent.putExtra("free_memory_kb", l1 + l2);
                intent.putExtra("exam_status", ad);
                intent.putExtra("kill_prower_count", j1);
                intent.putExtra("kill_process_count", i1);
                setResult(-1, intent);
                com.qihoo.security.support.b.b(11017, k1 / 1024);
                finish();
                return;
            }
        }
    }

    static boolean c(ProcessClearActivity processclearactivity, boolean flag)
    {
        processclearactivity.W = flag;
        return flag;
    }

    static int d(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.M;
    }

    private void d(int i1)
    {
        String s1;
        String s2;
        String as[];
        s1 = "";
        as = com.qihoo360.mobilesafe.b.s.b((long)i1 * 1024L);
        s2 = s1;
        if (as == null) goto _L2; else goto _L1
_L1:
        if (!TextUtils.isEmpty(as[0]))
        {
            s1 = as[0];
        }
        s2 = s1;
        if (TextUtils.isEmpty(as[1])) goto _L2; else goto _L3
_L3:
        s2 = as[1];
_L5:
        E.setLocalText(s1);
        F.setLocalText(s2);
        return;
_L2:
        s1 = s2;
        s2 = "";
        if (true) goto _L5; else goto _L4
_L4:
    }

    static void d(ProcessClearActivity processclearactivity, int i1)
    {
        processclearactivity.d(i1);
    }

    static void d(ProcessClearActivity processclearactivity, boolean flag)
    {
        processclearactivity.c(flag);
    }

    static int e(ProcessClearActivity processclearactivity, int i1)
    {
        i1 = processclearactivity.S + i1;
        processclearactivity.S = i1;
        return i1;
    }

    static View e(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.L;
    }

    static int f(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.S;
    }

    static int f(ProcessClearActivity processclearactivity, int i1)
    {
        i1 = processclearactivity.S - i1;
        processclearactivity.S = i1;
        return i1;
    }

    static HashMap g(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.T;
    }

    static com.qihoo360.mobilesafe.core.c.c h(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.P;
    }

    static com.qihoo360.mobilesafe.core.c.b i(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.ak;
    }

    static View j(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.H;
    }

    static View k(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.I;
    }

    static boolean l(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.X;
    }

    static ExpandableListView m(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.C;
    }

    static com.qihoo.security.a.a.a n(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.R;
    }

    static boolean o(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.ai;
    }

    static LayoutInflater p(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.Y;
    }

    private void p()
    {
        long l1 = getIntent().getLongExtra("free_memory_kb", -1L);
        if (l1 == -1L)
        {
            O = com.qihoo360.mobilesafe.b.s.d();
            return;
        } else
        {
            O = l1;
            return;
        }
    }

    static Context q(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.A;
    }

    private void q()
    {
        Y = (LayoutInflater)getSystemService("layout_inflater");
        Q = new g(A, 48, 48);
        Y = LayoutInflater.from(A);
        I = findViewById(0x7f0b009b);
        I.setVisibility(0);
        H = findViewById(0x7f0b01ac);
        H.setVisibility(8);
        J = findViewById(0x7f0b00eb);
        C = (ExpandableListView)findViewById(0x7f0b0146);
        E = (LocaleTextView)findViewById(0x7f0b01a9);
        F = (LocaleTextView)findViewById(0x7f0b01aa);
        G = (LocaleTextView)findViewById(0x7f0b01a8);
        G.setLocalText(o.a(0x7f0c001d, new Object[] {
            a(com.qihoo360.mobilesafe.b.s.c())
        }));
        K = (LocaleTextView)findViewById(0x7f0b00f6);
        K.setLocalText(0x7f0c0017);
        K.setOnClickListener(this);
        C.setDivider(null);
        C.setGroupIndicator(null);
        C.setOnGroupClickListener(new android.widget.ExpandableListView.OnGroupClickListener() {

            final ProcessClearActivity a;

            public boolean onGroupClick(ExpandableListView expandablelistview, View view, int i1, long l1)
            {
                if (com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a) != null)
                {
                    if (i1 == 0 && com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a).b(0))
                    {
                        return false;
                    }
                    if (!com.qihoo360.mobilesafe.b.f.a())
                    {
                        com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a, view);
                        com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a, i1);
                        com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.b(a, 0x80000000);
                        com.qihoo.security.support.b.c(11020);
                        a.showDialog(1);
                    }
                }
                return true;
            }

            
            {
                a = ProcessClearActivity.this;
                super();
            }
        });
        C.setOnChildClickListener(new android.widget.ExpandableListView.OnChildClickListener() {

            final ProcessClearActivity a;

            public boolean onChildClick(ExpandableListView expandablelistview, View view, int i1, int j1, long l1)
            {
                if (com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a) != null && !com.qihoo360.mobilesafe.b.f.a())
                {
                    com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a, view);
                    com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.b(a, j1);
                    com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a, i1);
                    com.qihoo.security.support.b.c(11020);
                    a.showDialog(1);
                }
                return true;
            }

            
            {
                a = ProcessClearActivity.this;
                super();
            }
        });
        new DisplayMetrics();
        DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        ae = displaymetrics.widthPixels;
        af = displaymetrics.heightPixels;
        R = new com.qihoo.security.a.a.a(3, 3, 120L, ae, af);
    }

    private int r()
    {
        boolean flag = false;
        int i1 = ((flag) ? 1 : 0);
        if (T != null)
        {
            i1 = ((flag) ? 1 : 0);
            if (!T.isEmpty())
            {
                Iterator iterator = T.entrySet().iterator();
                for (i1 = 0; iterator.hasNext(); i1 = ((Integer)((java.util.Map.Entry)iterator.next()).getValue()).intValue() + i1) { }
            }
        }
        return i1;
    }

    static g r(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.Q;
    }

    static int s(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.ae;
    }

    private void s()
    {
        if (!com.qihoo360.mobilesafe.b.f.a())
        {
            c(false);
        }
    }

    static int t(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.af;
    }

    static List u(ProcessClearActivity processclearactivity)
    {
        return processclearactivity.ag;
    }

    public String a(long l1)
    {
        return com.qihoo360.mobilesafe.b.s.a(1024L * l1);
    }

    public void a(List list)
    {
        ag = list;
        if (list != null && !list.isEmpty())
        {
            list = com.qihoo.security.opti.a.a.a(list);
            if (!isFinishing())
            {
                a(ag, ((Map) (list)));
            }
            return;
        } else
        {
            a(list, ((Map) (null)));
            return;
        }
    }

    public void c(String s1)
    {
        if (P == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        U.add(s1);
        P.a(s1, true);
        KillBean killbean = new KillBean();
        killbean.packageName = s1;
        ProcessClearService.a(killbean);
        return;
        s1;
    }

    public void finish()
    {
        Intent intent = getIntent();
        if (intent != null && ai)
        {
            intent.setClass(this, com/qihoo/security/ui/main/HomeActivity);
            intent.setFlags(0x14000000);
            intent.putExtra("fragment_index", 0);
            intent.putExtra("jump_result_page", ah);
            intent.putExtra("jump_result_page_param", 1000);
            intent.putExtra("from_notify", false);
            intent.putExtra("reset_main_page", true);
            startActivity(intent);
        }
        super.finish();
    }

    protected void j()
    {
        super.j();
        b(o.a(0x7f0c0017));
    }

    protected void n()
    {
        s();
        com.qihoo.security.support.b.b(11316, 1);
        super.n();
    }

    public void o()
    {
        int i1 = r();
        long l1 = com.qihoo360.mobilesafe.b.s.c();
        long l2 = O;
        com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus = com.qihoo.security.booster.a.a((int)((((long)i1 + l2) * 100L) / l1));
        ad = examstatus;
        i1 = a(examstatus);
        a(new ColorDrawable(i1));
        b(new ColorDrawable(i1));
        J.setBackgroundColor(i1);
        com.qihoo360.mobilesafe.b.c.a(K, i1);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        while (j1 != -1 || i1 != 101 || !intent.getBooleanExtra("has_changed", false) || P == null) 
        {
            return;
        }
        try
        {
            V = false;
            P.b(true);
            W = true;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return;
        }
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131427574 2131427574: default 24
    //                   2131427574 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (D == null || D.getGroupCount() <= 0) goto _L1; else goto _L3
_L3:
        if (C.isGroupExpanded(0))
        {
            C.collapseGroup(0);
            C.setSelection(0);
        }
        if (com.qihoo360.mobilesafe.b.f.a()) goto _L1; else goto _L4
_L4:
        view = D.g();
        if (view == null || view.isEmpty())
        {
            com.qihoo360.mobilesafe.b.q.a().a(0x7f0c0020);
            return;
        }
        Z = true;
        if (P == null) goto _L6; else goto _L5
_L5:
        if (!D.e()) goto _L8; else goto _L7
_L7:
        X = true;
        view = D.h();
        if (view == null) goto _L10; else goto _L9
_L9:
        if (view.isEmpty()) goto _L10; else goto _L11
_L11:
        P.b(view);
        ProcessClearService.a(null);
_L6:
        if (android.os.Build.VERSION.SDK_INT <= 11)
        {
            c(true);
        } else
        {
            C.setDivider(null);
            y.sendEmptyMessageDelayed(2, 200L);
        }
        a(false, 0, S);
        return;
_L10:
        try
        {
            P.e();
            ProcessClearService.a(null);
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
          goto _L6
_L8:
        P.a(view);
        ProcessClearService.b(view);
          goto _L6
    }

    protected void onCreate(Bundle bundle)
    {
        c(getIntent());
        super.onCreate(bundle);
        setContentView(0x7f030085);
        Z = false;
        A = this;
        B = A.getPackageManager();
        p();
        q();
        com.qihoo360.mobilesafe.b.s.a(A, com/qihoo/security/service/SecurityService, com.qihoo.security.env.a.f, aj, 1);
        o();
        com.qihoo.security.ui.result.f.a().a(0);
    }

    protected Dialog onCreateDialog(int i1)
    {
        com.qihoo.security.dialog.b b1;
        switch (i1)
        {
        default:
            return super.onCreateDialog(i1);

        case 1: // '\001'
            b1 = new com.qihoo.security.dialog.b(this);
            break;
        }
        b1.setDialogTitle(0x7f0c00c1);
        b1.c();
        b1.setTitle(0x7f0c00bc);
        View view = View.inflate(A, 0x7f03009b, null);
        aa = (LocaleTextView)view.findViewById(0x7f0b0208);
        ab = (LocaleTextView)view.findViewById(0x7f0b0209);
        ac = (LocaleTextView)view.findViewById(0x7f0b020a);
        ac.getPaint().setFlags(8);
        ac.setOnClickListener(new android.view.View.OnClickListener() {

            final ProcessClearActivity a;

            public void onClick(View view1)
            {
                if (com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a) == null)
                {
                    return;
                }
                if (com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.b(a))
                {
                    a.dismissDialog(1);
                    return;
                }
                com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a, true);
                view1 = com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a).b(com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.c(a), com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.d(a));
                if (view1 != null)
                {
                    com.qihoo.security.support.b.c(11023);
                    String s1 = ((b) (view1)).a;
                    a.c(s1);
                    com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a).b(ProcessClearActivity.e(a), com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.d(a), view1);
                    int j1 = com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.f(a);
                    if (((b) (view1)).c)
                    {
                        com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.c(a, com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.f(a) - ((b) (view1)).d);
                    }
                    com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a, false, com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.f(a), j1);
                    com.qihoo360.mobilesafe.b.q.a().a(a.o.a(0x7f0c00ba, new Object[] {
                        Integer.valueOf(1)
                    }));
                }
                a.dismissDialog(1);
            }

            
            {
                a = ProcessClearActivity.this;
                super();
            }
        });
        b1.a(view);
        b1.setCancelable(true);
        b1.setButtonText(new int[] {
            0x7f0c0157, 0x7f0c014f
        });
        b1.setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener() {

                final ProcessClearActivity a;

                public void onClick(View view1)
                {
                    if (com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a) == null)
                    {
                        return;
                    }
                    if (com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.b(a))
                    {
                        a.dismissDialog(1);
                        return;
                    }
                    com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a, true);
                    view1 = com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a).b(com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.c(a), com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.d(a));
                    if (view1 == null) goto _L2; else goto _L1
_L1:
                    ArrayList arraylist;
                    com.qihoo.security.support.b.c(11021);
                    String s1 = ((b) (view1)).a;
                    com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.g(a).put(s1, Integer.valueOf(((b) (view1)).d));
                    arraylist = new ArrayList();
                    KillBean killbean = new KillBean();
                    killbean.memory = ((b) (view1)).d;
                    killbean.packageName = s1;
                    arraylist.add(killbean);
                    if (ProcessClearActivity.h(a) == null) goto _L4; else goto _L3
_L3:
                    if (!com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a).d()) goto _L6; else goto _L5
_L5:
                    ProcessClearActivity.h(a).a(arraylist);
_L7:
                    ProcessClearService.b(arraylist);
_L4:
                    com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a).a(ProcessClearActivity.e(a), com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.d(a), view1);
                    int j1 = com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.f(a);
                    if (((b) (view1)).c)
                    {
                        com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.c(a, com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.f(a) - ((b) (view1)).d);
                    }
                    com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.a(a, true, com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.f(a), j1);
_L2:
                    a.dismissDialog(1);
                    return;
_L6:
                    com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.b(a, true);
                    ProcessClearActivity.h(a).b(arraylist);
                      goto _L7
                    RemoteException remoteexception;
                    remoteexception;
                      goto _L4
                }

            
            {
                a = ProcessClearActivity.this;
                super();
            }
            }, new android.view.View.OnClickListener() {

                final ProcessClearActivity a;

                public void onClick(View view1)
                {
                    com.qihoo.security.support.b.c(11022);
                    a.dismissDialog(1);
                }

            
            {
                a = ProcessClearActivity.this;
                super();
            }
            }
        });
        return b1;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        (new com.qihoo.security.locale.widget.a(A)).inflate(0x7f100003, menu);
        a(menu, 0x7f0b0255, 0x7f020066);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        com.qihoo360.mobilesafe.b.s.a(z, A, aj);
        y.removeCallbacksAndMessages(null);
        if (P != null)
        {
            try
            {
                P.b(ak);
            }
            catch (Exception exception) { }
        }
        if (Q != null)
        {
            Q.a();
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            s();
            com.qihoo.security.support.b.b(11316, 0);
        }
        return super.onKeyDown(i1, keyevent);
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        c(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 2131427925 2131427925: default 24
    //                   2131427925 30;
           goto _L1 _L2
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        Intent intent = new Intent(A, com/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity);
        intent.putExtra("white_list_type", 0);
        startActivityForResult(intent, 101);
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onPause()
    {
        super.onPause();
        if (P == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        P.d();
        return;
        RemoteException remoteexception;
        remoteexception;
        remoteexception.printStackTrace();
        return;
    }

    protected void onPrepareDialog(int i1, Dialog dialog)
    {
        if (i1 == 1 && D != null)
        {
            b b1 = D.b(N, M);
            if (b1 != null)
            {
                ((com.qihoo.security.dialog.b)dialog).setDialogTitle(b1.b);
                aa.setLocalText(o.a(0x7f0c00bd, new Object[] {
                    b1.a
                }));
                ab.setLocalText(o.a(0x7f0c00c0, new Object[] {
                    a(b1.d)
                }));
            }
        }
        super.onPrepareDialog(i1, dialog);
    }

    protected void onResume()
    {
        super.onResume();
    }

    protected void onStart()
    {
        super.onStart();
    }

    public void onStop()
    {
        super.onStop();
    }

}
