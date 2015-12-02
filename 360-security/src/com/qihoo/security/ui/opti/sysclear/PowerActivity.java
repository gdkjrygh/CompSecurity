// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
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
import android.widget.ProgressBar;
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
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            ProcessClearWhiteListActivity

public class PowerActivity extends BaseActivity
    implements android.view.View.OnClickListener
{
    private class a extends BroadcastReceiver
    {

        final PowerActivity a;

        public void onReceive(Context context, Intent intent)
        {
            if (intent != null && "android.intent.action.BATTERY_CHANGED".equals(intent.getAction()))
            {
                int i1 = intent.getIntExtra("level", 0);
                int j1 = intent.getIntExtra("scale", 100);
                com.qihoo.security.ui.opti.sysclear.PowerActivity.g(a, (i1 * 100) / j1);
                if (!a.isFinishing())
                {
                    PowerActivity.v(a).setLocalText(a.o.a(0x7f0c0037, new Object[] {
                        Integer.valueOf(PowerActivity.u(a))
                    }));
                }
            }
        }

        private a()
        {
            a = PowerActivity.this;
            super();
        }

    }

    class b extends BaseExpandableListAdapter
    {

        final PowerActivity a;
        private final List b = new ArrayList();
        private final List c = new ArrayList();
        private int d;
        private int e;
        private int f;

        static List a(b b1)
        {
            return b1.b;
        }

        static void a(b b1, View view, int i1, c c1, boolean flag)
        {
            b1.b(view, i1, c1, flag);
        }

        private void a(List list, List list1, List list2)
        {
            d = 0;
            e = 0;
            f = 0;
            c.clear();
            if (list != null && !list.isEmpty())
            {
                c.addAll(list);
            }
            if (list1 != null && !list1.isEmpty())
            {
                c.addAll(list1);
            }
            if (c != null && !c.isEmpty())
            {
                Collections.sort(c);
            }
            if (list2 != null && !list2.isEmpty())
            {
                Collections.sort(list2);
                c.addAll(list2);
            }
        }

        static int b(b b1)
        {
            int i1 = b1.f;
            b1.f = i1 + 1;
            return i1;
        }

        private void b(View view, int i1, c c1, boolean flag)
        {
            android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
            o o1 = com.nineoldandroids.a.o.b(new int[] {
                view.getHeight(), 1
            }).d(200L);
            o1.a(new com.nineoldandroids.a.b(this, view, flag, c1, i1) {

                final View a;
                final boolean b;
                final c c;
                final int d;
                final b e;

                public void b(com.nineoldandroids.a.a a1)
                {
                    PowerActivity.m(e.a).setEnabled(true);
                    if (e.a.isFinishing()) goto _L2; else goto _L1
_L1:
                    a1 = a.getLayoutParams();
                    com.nineoldandroids.b.a.a(a, 1.0F);
                    com.nineoldandroids.b.a.d(a, 0.0F);
                    a1.height = 0;
                    a.setLayoutParams(a1);
                    if (b)
                    {
                        com.qihoo.security.ui.opti.sysclear.b.b(e);
                    }
                    if (!c.h)
                    {
                        com.qihoo.security.ui.opti.sysclear.b.c(e);
                    }
                    if (c.j >= 3)
                    {
                        com.qihoo.security.ui.opti.sysclear.b.d(e);
                    }
                    if (d < 0) goto _L4; else goto _L3
_L3:
                    com.qihoo.security.ui.opti.sysclear.b.a(e).remove(c);
                    e.a(c);
_L6:
                    e.notifyDataSetChanged();
                    com.qihoo.security.ui.opti.sysclear.PowerActivity.a(e.a, false);
                    com.qihoo.security.ui.opti.sysclear.b.f(e);
_L2:
                    return;
_L4:
                    if (b.e(e) != null && b.e(e).size() > 0)
                    {
                        b.e(e).remove(c);
                    }
                    if (true) goto _L6; else goto _L5
_L5:
                }

            
            {
                e = b1;
                a = view;
                b = flag;
                c = c1;
                d = i1;
                super();
            }
            });
            o1.a(new com.nineoldandroids.a.o.b(this, layoutparams, view) {

                final android.view.ViewGroup.LayoutParams a;
                final View b;
                final b c;

                public void a(o o1)
                {
                    a.height = ((Integer)o1.o()).intValue();
                    b.setLayoutParams(a);
                }

            
            {
                c = b1;
                a = layoutparams;
                b = view;
                super();
            }
            });
            o1.a();
        }

        static int c(b b1)
        {
            int i1 = b1.d;
            b1.d = i1 + 1;
            return i1;
        }

        static int d(b b1)
        {
            int i1 = b1.e;
            b1.e = i1 + 1;
            return i1;
        }

        static List e(b b1)
        {
            return b1.c;
        }

        static void f(b b1)
        {
            b1.l();
        }

        private void l()
        {
label0:
            {
                if (!c())
                {
                    if (com.qihoo.security.ui.opti.sysclear.PowerActivity.g(a).size() != 0)
                    {
                        break label0;
                    }
                    com.qihoo.security.ui.opti.sysclear.PowerActivity.d(a, false);
                }
                return;
            }
            com.qihoo.security.ui.opti.sysclear.PowerActivity.d(a, true);
        }

        private List m()
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

        public c a(int i1)
        {
            if (c == null)
            {
                return null;
            } else
            {
                return (c)c.get(i1);
            }
        }

        public c a(int i1, int j1)
        {
            while (b == null || i1 != 0 || b == null || b.size() <= 0 || j1 >= b.size()) 
            {
                return null;
            }
            return (c)b.get(j1);
        }

        public void a()
        {
            a(((List) (null)), ((List) (null)), ((List) (null)));
        }

        public void a(View view, int i1, c c1)
        {
            a(view, i1, c1, false);
        }

        public void a(View view, int i1, c c1, boolean flag)
        {
            if (view == null)
            {
                return;
            } else
            {
                PowerActivity.m(a).setEnabled(false);
                com.nineoldandroids.b.b.a(view).a(-view.getWidth()).c(0.0F).a(300L).a(new com.nineoldandroids.a.b(this, view, i1, c1, flag) {

                    final View a;
                    final int b;
                    final c c;
                    final boolean d;
                    final b e;

                    public void b(com.nineoldandroids.a.a a1)
                    {
                        if (!e.a.isFinishing())
                        {
                            com.qihoo.security.ui.opti.sysclear.b.a(e, a, b, c, d);
                            return;
                        } else
                        {
                            PowerActivity.m(e.a).setEnabled(true);
                            return;
                        }
                    }

            
            {
                e = b1;
                a = view;
                b = i1;
                c = c1;
                d = flag;
                super();
            }
                });
                return;
            }
        }

        public void a(c c1)
        {
            c c2 = a(0);
            if (c1 != null && c2 != c1)
            {
                int i1 = c2.d - c1.d;
                c2.a(i1);
                if (i1 == 0)
                {
                    notifyDataSetChanged();
                }
            }
        }

        public c b(int i1, int j1)
        {
            if (com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a) == null)
            {
                return null;
            }
            if (i1 == 0)
            {
                if (b(i1))
                {
                    return com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a).a(i1, j1);
                } else
                {
                    return com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a).a(i1);
                }
            } else
            {
                return com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a).a(i1);
            }
        }

        public void b()
        {
            if (android.os.Build.VERSION.SDK_INT <= 11)
            {
                com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a, 0, com.qihoo.security.ui.opti.sysclear.PowerActivity.f(a));
            } else
            if (PowerActivity.m(a) != null)
            {
                android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener = new android.view.ViewTreeObserver.OnGlobalLayoutListener(this) {

                    final b a;

                    public void onGlobalLayout()
                    {
                        int j1 = PowerActivity.m(a.a).getChildCount();
                        com.qihoo.security.a.a.a a1 = new com.qihoo.security.a.a.a(2, 3, 20L, PowerActivity.r(a.a), com.qihoo.security.ui.opti.sysclear.PowerActivity.s(a.a));
                        if (j1 > 0)
                        {
                            for (int i1 = 0; i1 < j1; i1++)
                            {
                                View view = PowerActivity.m(a.a).getChildAt(i1);
                                view.setVisibility(4);
                                a1.a(view);
                            }

                            a1.a(new com.qihoo.security.a.a.a.a(this) {

                                final b._cls3 a;

                                public void a()
                                {
                                    PowerActivity.m(a.a.a).setEnabled(true);
                                }

            
            {
                a = _pcls3;
                super();
            }
                            });
                            if (a1.a() != 0)
                            {
                                com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a.a, 0, com.qihoo.security.ui.opti.sysclear.PowerActivity.f(a.a));
                                a1.b();
                                PowerActivity.m(a.a).setEnabled(false);
                            }
                        } else
                        {
                            com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a.a, 0, com.qihoo.security.ui.opti.sysclear.PowerActivity.f(a.a));
                        }
                        PowerActivity.m(a.a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }

            
            {
                a = b1;
                super();
            }
                };
                PowerActivity.m(a).getViewTreeObserver().addOnGlobalLayoutListener(ongloballayoutlistener);
                return;
            }
        }

        public void b(View view, int i1, c c1)
        {
            a(view, i1, c1, true);
        }

        public boolean b(int i1)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a) != null)
            {
                c c1 = com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a).a(i1);
                if (!TextUtils.isEmpty(c1.a))
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                flag = flag1;
                if ((i1 & "rom_sys_info".equals(c1.a)) != 0)
                {
                    flag = true;
                }
            }
            return flag;
        }

        public boolean c()
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

        public boolean d()
        {
            Object obj = m();
            if (obj != null)
            {
                if (((List) (obj)).size() > 0)
                {
                    for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
                    {
                        c c1 = (c)((Iterator) (obj)).next();
                        if (!c1.h && !c1.c)
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
                return PowerActivity.t(a) != null && !PowerActivity.t(a).isEmpty();
            }
        }

        public boolean e()
        {
            Object obj = m();
            if (obj != null)
            {
                if (((List) (obj)).size() > 0)
                {
                    for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
                    {
                        if (!((c)((Iterator) (obj)).next()).h)
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

        public List f()
        {
            ArrayList arraylist = new ArrayList();
            Object obj = m();
            if (obj != null && !((List) (obj)).isEmpty())
            {
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    c c1 = (c)((Iterator) (obj)).next();
                    if (c1.c)
                    {
                        KillBean killbean = new KillBean();
                        killbean.packageName = c1.a;
                        killbean.memory = c1.d;
                        arraylist.add(killbean);
                    }
                } while (true);
            }
            return arraylist;
        }

        public int g()
        {
            Object obj = m();
            boolean flag = false;
            int i1 = ((flag) ? 1 : 0);
            if (obj != null)
            {
                i1 = ((flag) ? 1 : 0);
                if (!((List) (obj)).isEmpty())
                {
                    obj = ((List) (obj)).iterator();
                    i1 = 0;
                    do
                    {
                        if (!((Iterator) (obj)).hasNext())
                        {
                            break;
                        }
                        if (((c)((Iterator) (obj)).next()).c)
                        {
                            i1++;
                        }
                    } while (true);
                }
            }
            return i1;
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
            c c1;
            android.graphics.drawable.Drawable drawable;
            if (view == null)
            {
                viewgroup = new a(this);
                view = com.qihoo.security.ui.opti.sysclear.PowerActivity.o(a).inflate(0x7f030086, null);
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
            c1 = (c)b.get(j1);
            ((a) (viewgroup)).b.setLocalText(c1.b);
            if (c1.h)
            {
                ((a) (viewgroup)).d.setLocalText(a.o.a(0x7f0c001e));
            } else
            {
                ((a) (viewgroup)).d.setLocalText(a.o.a(0x7f0c001f));
            }
            ((a) (viewgroup)).c.setLocalText(a.a(c1.d));
            drawable = PowerActivity.p(a).a(c1.a, null);
            if (drawable != null)
            {
                ((a) (viewgroup)).a.setImageDrawable(drawable);
            } else
            {
                ((a) (viewgroup)).a.setImageDrawable(com.qihoo.security.ui.opti.sysclear.PowerActivity.q(a).getResources().getDrawable(0x7f020043));
            }
            if (c1.h)
            {
                ((a) (viewgroup)).e.setChecked(false);
            } else
            {
                ((a) (viewgroup)).e.setChecked(c1.c);
            }
            ((a) (viewgroup)).e.setOnClickListener(new android.view.View.OnClickListener(this, c1) {

                final c a;
                final b b;

                public void onClick(View view)
                {
                    int i1;
                    boolean flag;
                    flag = ((CheckBox)view).isChecked();
                    i1 = com.qihoo.security.ui.opti.sysclear.PowerActivity.f(b.a);
                    if (!flag) goto _L2; else goto _L1
_L1:
                    PowerActivity.e(b.a, a.d);
                    a.c = true;
                    if (a.h)
                    {
                        com.qihoo.security.support.b.c(11308);
                    }
_L4:
                    if (a.h)
                    {
                        a.h = false;
                    }
                    ((CheckBox)view).setChecked(flag);
                    com.qihoo.security.ui.opti.sysclear.PowerActivity.a(b.a, false, com.qihoo.security.ui.opti.sysclear.PowerActivity.f(b.a), i1);
                    b.notifyDataSetChanged();
                    return;
_L2:
                    com.qihoo.security.ui.opti.sysclear.PowerActivity.f(b.a, a.d);
                    a.c = false;
                    if (!a.h)
                    {
                        com.qihoo.security.support.b.c(11307);
                    }
                    if (true) goto _L4; else goto _L3
_L3:
                }

            
            {
                b = b1;
                a = c1;
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
            c c1;
            android.graphics.drawable.Drawable drawable;
            if (view == null)
            {
                viewgroup = new b(this);
                view = com.qihoo.security.ui.opti.sysclear.PowerActivity.o(a).inflate(0x7f030082, null);
                viewgroup.b = (LocaleTextView)view.findViewById(0x7f0b0075);
                viewgroup.c = (ProgressBar)view.findViewById(0x7f0b01ae);
                viewgroup.d = (LocaleTextView)view.findViewById(0x7f0b01b0);
                viewgroup.e = (LocaleTextView)view.findViewById(0x7f0b01b1);
                viewgroup.f = (CheckBox)view.findViewById(0x7f0b01af);
                viewgroup.a = (ImageView)view.findViewById(0x7f0b0074);
                view.setTag(viewgroup);
            } else
            {
                viewgroup = (b)view.getTag();
            }
            c1 = (c)c.get(i1);
            i1 = (int)(float)c1.j;
            ((b) (viewgroup)).b.setLocalText(c1.b);
            ((b) (viewgroup)).c.setMax(100);
            ((b) (viewgroup)).c.setProgress(i1);
            if (i1 > 1)
            {
                ((b) (viewgroup)).e.setLocalText((new StringBuilder()).append(i1).append("%").toString());
            } else
            {
                ((b) (viewgroup)).e.setLocalText("<1%");
            }
            if (c1.h)
            {
                ((b) (viewgroup)).d.setLocalText(a.o.a(0x7f0c001e));
            } else
            {
                ((b) (viewgroup)).d.setLocalText(a.o.a(0x7f0c001f));
            }
            drawable = PowerActivity.p(a).a(c1.a, null);
            if (drawable != null)
            {
                ((b) (viewgroup)).a.setImageDrawable(drawable);
            } else
            {
                ((b) (viewgroup)).a.setImageDrawable(com.qihoo.security.ui.opti.sysclear.PowerActivity.q(a).getResources().getDrawable(0x7f020043));
            }
            if (c1.h)
            {
                if (c1.c)
                {
                    ((b) (viewgroup)).f.setButtonDrawable(0x7f020055);
                    ((b) (viewgroup)).f.setChecked(c1.c);
                } else
                {
                    ((b) (viewgroup)).f.setButtonDrawable(0x7f020054);
                    ((b) (viewgroup)).f.setChecked(c1.c);
                }
            } else
            if (c1.c)
            {
                ((b) (viewgroup)).f.setButtonDrawable(0x7f020055);
                ((b) (viewgroup)).f.setChecked(c1.c);
            } else
            {
                ((b) (viewgroup)).f.setButtonDrawable(0x7f020054);
                ((b) (viewgroup)).f.setChecked(c1.c);
            }
            ((b) (viewgroup)).f.setOnClickListener(new android.view.View.OnClickListener(this, c1) {

                final c a;
                final b b;

                public void onClick(View view)
                {
                    int i1;
                    boolean flag;
                    flag = ((CheckBox)view).isChecked();
                    i1 = com.qihoo.security.ui.opti.sysclear.PowerActivity.f(b.a);
                    if (!a.a.equals("rom_sys_info")) goto _L2; else goto _L1
_L1:
                    Iterator iterator = com.qihoo.security.ui.opti.sysclear.b.a(b).iterator();
                    while (iterator.hasNext()) 
                    {
                        c c1 = (c)iterator.next();
                        if (flag)
                        {
                            if (!c1.c)
                            {
                                PowerActivity.e(b.a, c1.d);
                            }
                        } else
                        if (c1.c)
                        {
                            com.qihoo.security.ui.opti.sysclear.PowerActivity.f(b.a, c1.d);
                        }
                        c1.c = flag;
                    }
                      goto _L3
_L2:
                    if (!flag) goto _L5; else goto _L4
_L4:
                    PowerActivity.e(b.a, a.d);
                    a.c = true;
                    if (a.h)
                    {
                        com.qihoo.security.support.b.c(11308);
                    }
_L3:
                    ((CheckBox)view).setChecked(flag);
                    b.notifyDataSetChanged();
                    com.qihoo.security.ui.opti.sysclear.PowerActivity.a(b.a, false, com.qihoo.security.ui.opti.sysclear.PowerActivity.f(b.a), i1);
                    return;
_L5:
                    com.qihoo.security.ui.opti.sysclear.PowerActivity.f(b.a, a.d);
                    a.c = false;
                    if (!a.h)
                    {
                        com.qihoo.security.support.b.c(11307);
                    }
                    if (true) goto _L3; else goto _L6
_L6:
                }

            
            {
                b = b1;
                a = c1;
                super();
            }
            });
            return view;
        }

        public List h()
        {
            ArrayList arraylist = new ArrayList();
            Object obj = m();
            if (obj != null && !((List) (obj)).isEmpty())
            {
                c c1 = (c)((List) (obj)).get(0);
                if (c1 != null)
                {
                    KillBean killbean;
                    boolean flag;
                    if (!TextUtils.isEmpty(c1.a))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if ("rom_sys_info".equals(c1.a) & flag)
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
                    c1 = (c)((Iterator) (obj)).next();
                    if (c1.c && c1.h)
                    {
                        killbean = new KillBean();
                        killbean.packageName = c1.a;
                        killbean.memory = c1.d;
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
            return d;
        }

        public boolean isChildSelectable(int i1, int j1)
        {
            return true;
        }

        public int j()
        {
            return e;
        }

        public int[] k()
        {
            int k1 = d;
            int i1 = e;
            Object obj = m();
            int l1 = i1;
            int j1 = k1;
            if (obj != null)
            {
                l1 = i1;
                j1 = k1;
                if (!((List) (obj)).isEmpty())
                {
                    obj = ((List) (obj)).iterator();
                    for (j1 = k1; ((Iterator) (obj)).hasNext(); j1 = k1)
                    {
                        c c1 = (c)((Iterator) (obj)).next();
                        k1 = j1;
                        if (c1.c)
                        {
                            k1 = j1;
                            if (!c1.h)
                            {
                                k1 = j1 + 1;
                            }
                        }
                        if (c1.c && c1.j >= 3)
                        {
                            i1++;
                        }
                    }

                    l1 = i1;
                }
            }
            return (new int[] {
                j1, l1
            });
        }

        b(List list, List list1, List list2)
        {
            a = PowerActivity.this;
            super();
            a(list, list1, list2);
        }
    }

    class b.a
    {

        ImageView a;
        LocaleTextView b;
        LocaleTextView c;
        LocaleTextView d;
        CheckBox e;
        final b f;

        b.a(b b1)
        {
            f = b1;
            super();
        }
    }

    class b.b
    {

        ImageView a;
        LocaleTextView b;
        ProgressBar c;
        LocaleTextView d;
        LocaleTextView e;
        CheckBox f;
        final b g;

        b.b(b b1)
        {
            g = b1;
            super();
        }
    }

    static class c
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

        public int a(c c1)
        {
            if (c1 != null)
            {
                if (j < c1.j)
                {
                    return 1;
                }
                if (j <= c1.j)
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
            return a((c)obj);
        }

        c(String s1, String s2, int i1, boolean flag, boolean flag1, boolean flag2, int ai1[], 
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


    private static final String z = com/qihoo/security/ui/opti/sysclear/PowerActivity.getSimpleName();
    private Context A;
    private PackageManager B;
    private ExpandableListView C;
    private b D;
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
    private int ag;
    private IntentFilter ah;
    private a ai;
    private List aj;
    private boolean ak;
    private final ServiceConnection al = new ServiceConnection() {

        final PowerActivity a;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a, com.qihoo360.mobilesafe.core.c.c.a.a(ibinder));
            if (PowerActivity.h(a) != null)
            {
                try
                {
                    PowerActivity.h(a).a(PowerActivity.i(a));
                }
                // Misplaced declaration of an exception variable
                catch (ComponentName componentname) { }
            }
            a.y.post(new Runnable(this) {

                final _cls6 a;

                public void run()
                {
                    if (PowerActivity.h(a.a) == null) goto _L2; else goto _L1
_L1:
                    if (PowerActivity.h(a.a).f()) goto _L4; else goto _L3
_L3:
                    PowerActivity.j(a.a).setVisibility(8);
                    PowerActivity.h(a.a).a(true);
                    if (!PowerActivity.h(a.a).g())
                    {
                        com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a.a, com.qihoo360.mobilesafe.b.s.d());
                    }
_L2:
                    a.a.o();
                    return;
_L4:
                    try
                    {
                        PowerActivity.k(a.a).setVisibility(8);
                        PowerActivity.j(a.a).setVisibility(0);
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
            if (PowerActivity.h(a) == null)
            {
                break MISSING_BLOCK_LABEL_29;
            }
            PowerActivity.h(a).b(PowerActivity.i(a));
            return;
            componentname;
        }

            
            {
                a = PowerActivity.this;
                super();
            }
    };
    private final com.qihoo360.mobilesafe.core.c.b am = new com.qihoo360.mobilesafe.core.c.b() {

        final PowerActivity a;

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
            if (PowerActivity.l(a))
            {
                com.qihoo.security.ui.opti.sysclear.PowerActivity.b(a, false);
            } else
            {
                com.qihoo.security.ui.opti.sysclear.PowerActivity.c(a, true);
                if (!a.isFinishing())
                {
                    a.finish();
                    return;
                }
            }
        }

            
            {
                a = PowerActivity.this;
                super();
            }
    };
    private final int an = 0;
    private final int ao = 2;
    Handler y;

    public PowerActivity()
    {
        A = null;
        P = null;
        Q = null;
        ai = null;
        ak = false;
        y = new Handler() {

            final PowerActivity a;

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
                com.qihoo.security.ui.opti.sysclear.PowerActivity.d(a, k1 + i1);
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
                for (; i1 < PowerActivity.m(a).getChildCount(); i1++)
                {
                    message = PowerActivity.m(a).getChildAt(i1);
                    PowerActivity.n(a).a(message);
                }

                PowerActivity.n(a).a(new com.qihoo.security.a.a.a.a(this) {

                    final _cls8 a;

                    public void a()
                    {
                        com.qihoo.security.ui.opti.sysclear.PowerActivity.d(a.a, true);
                    }

            
            {
                a = _pcls8;
                super();
            }
                });
                if (PowerActivity.n(a).a() != 0)
                {
                    PowerActivity.n(a).b();
                    return;
                }
                if (true) goto _L1; else goto _L4
_L4:
            }

            
            {
                a = PowerActivity.this;
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

    static int a(PowerActivity poweractivity, int i1)
    {
        poweractivity.N = i1;
        return i1;
    }

    static long a(PowerActivity poweractivity, long l1)
    {
        poweractivity.O = l1;
        return l1;
    }

    static View a(PowerActivity poweractivity, View view)
    {
        poweractivity.L = view;
        return view;
    }

    static b a(PowerActivity poweractivity)
    {
        return poweractivity.D;
    }

    static com.qihoo360.mobilesafe.core.c.c a(PowerActivity poweractivity, com.qihoo360.mobilesafe.core.c.c c1)
    {
        poweractivity.P = c1;
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

    private void a(c c1, Map map)
    {
        if (c1 == null || map == null || map.isEmpty())
        {
            break MISSING_BLOCK_LABEL_43;
        }
        try
        {
            map = (com.qihoo.security.opti.a.a.a)map.get(c1.a);
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            return;
        }
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        c1.j = map.a();
    }

    static void a(PowerActivity poweractivity, int i1, int j1)
    {
        poweractivity.a(i1, j1);
    }

    static void a(PowerActivity poweractivity, boolean flag, int i1, int j1)
    {
        poweractivity.a(flag, i1, j1);
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
                    D.b();
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

    static boolean a(PowerActivity poweractivity, boolean flag)
    {
        poweractivity.Z = flag;
        return flag;
    }

    static int b(PowerActivity poweractivity, int i1)
    {
        poweractivity.M = i1;
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
                    obj = new c(s2, s1, k1, flag1, false, flag, ((ProcessInfo) (obj)).pids, 0);
                    a(((c) (obj)), map);
                    if (!((c) (obj)).h)
                    {
                        int j2 = ((c) (obj)).d;
                        int l1 = j1 + j2;
                        if (((c) (obj)).e)
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
            S = j1;
            D = new b(arraylist, arraylist1, arraylist2);
        }
    }

    static boolean b(PowerActivity poweractivity)
    {
        return poweractivity.Z;
    }

    static boolean b(PowerActivity poweractivity, boolean flag)
    {
        poweractivity.X = flag;
        return flag;
    }

    private String[] b(long l1)
    {
        int i1 = r();
        long l2 = O;
        long l3 = i1;
        long l4 = com.qihoo360.mobilesafe.b.s.c();
        return com.qihoo360.mobilesafe.b.s.a(ag, l4 - (l3 + l2), l1);
    }

    static int c(PowerActivity poweractivity)
    {
        return poweractivity.N;
    }

    static int c(PowerActivity poweractivity, int i1)
    {
        poweractivity.S = i1;
        return i1;
    }

    private void c(Intent intent)
    {
        if (intent != null)
        {
            com.qihoo.utils.notice.c.a(A, intent);
        }
        com.qihoo.security.ui.result.f.a().a(0);
    }

    private void c(boolean flag)
    {
        boolean flag2 = false;
        int k1 = r();
        if (!flag && k1 <= 0 && (U == null || U.isEmpty()) && !W)
        {
            ak = false;
            finish();
        } else
        {
            ak = true;
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
                    flag1 = D.d();
                    int ai1[] = D.k();
                    i1 = ai1[0];
                    j1 = ai1[1];
                    k1 += S;
                    W = false;
                } else
                if (k1 > 0)
                {
                    flag1 = D.e();
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
                com.qihoo.security.support.b.b(11306, k1 / 1024);
                finish();
                return;
            }
        }
    }

    static boolean c(PowerActivity poweractivity, boolean flag)
    {
        poweractivity.W = flag;
        return flag;
    }

    static int d(PowerActivity poweractivity)
    {
        return poweractivity.M;
    }

    private void d(int i1)
    {
        String s1;
        String s2;
        String as[];
        s1 = "";
        as = b(i1);
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
        if (D != null)
        {
            i1 = D.g();
        } else
        {
            i1 = 0;
        }
        K.setLocalText(o.a(0x7f0c002c, new Object[] {
            Integer.valueOf(i1)
        }));
        return;
_L2:
        s1 = s2;
        s2 = "";
        if (true) goto _L5; else goto _L4
_L4:
    }

    static void d(PowerActivity poweractivity, int i1)
    {
        poweractivity.d(i1);
    }

    static void d(PowerActivity poweractivity, boolean flag)
    {
        poweractivity.c(flag);
    }

    static int e(PowerActivity poweractivity, int i1)
    {
        i1 = poweractivity.S + i1;
        poweractivity.S = i1;
        return i1;
    }

    static View e(PowerActivity poweractivity)
    {
        return poweractivity.L;
    }

    static int f(PowerActivity poweractivity)
    {
        return poweractivity.S;
    }

    static int f(PowerActivity poweractivity, int i1)
    {
        i1 = poweractivity.S - i1;
        poweractivity.S = i1;
        return i1;
    }

    static int g(PowerActivity poweractivity, int i1)
    {
        poweractivity.ag = i1;
        return i1;
    }

    static HashMap g(PowerActivity poweractivity)
    {
        return poweractivity.T;
    }

    static com.qihoo360.mobilesafe.core.c.c h(PowerActivity poweractivity)
    {
        return poweractivity.P;
    }

    static com.qihoo360.mobilesafe.core.c.b i(PowerActivity poweractivity)
    {
        return poweractivity.am;
    }

    static View j(PowerActivity poweractivity)
    {
        return poweractivity.H;
    }

    static View k(PowerActivity poweractivity)
    {
        return poweractivity.I;
    }

    static boolean l(PowerActivity poweractivity)
    {
        return poweractivity.X;
    }

    static ExpandableListView m(PowerActivity poweractivity)
    {
        return poweractivity.C;
    }

    static com.qihoo.security.a.a.a n(PowerActivity poweractivity)
    {
        return poweractivity.R;
    }

    static LayoutInflater o(PowerActivity poweractivity)
    {
        return poweractivity.Y;
    }

    static g p(PowerActivity poweractivity)
    {
        return poweractivity.Q;
    }

    private void p()
    {
        Intent intent = getIntent();
        long l1 = intent.getLongExtra("free_memory_kb", -1L);
        ag = intent.getIntExtra("battery_power", 0);
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

    static Context q(PowerActivity poweractivity)
    {
        return poweractivity.A;
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
        G.setLocalText(o.a(0x7f0c0037, new Object[] {
            Integer.valueOf(ag)
        }));
        K = (LocaleTextView)findViewById(0x7f0b00f6);
        K.setLocalText(o.a(0x7f0c002c, new Object[] {
            Integer.valueOf(0)
        }));
        K.setOnClickListener(this);
        C.setDivider(null);
        C.setGroupIndicator(null);
        C.setOnGroupClickListener(new android.widget.ExpandableListView.OnGroupClickListener() {

            final PowerActivity a;

            public boolean onGroupClick(ExpandableListView expandablelistview, View view, int i1, long l1)
            {
                if (com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a) != null)
                {
                    if (i1 == 0 && com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a).b(0))
                    {
                        return false;
                    }
                    if (!com.qihoo360.mobilesafe.b.f.a())
                    {
                        com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a, view);
                        com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a, i1);
                        com.qihoo.security.ui.opti.sysclear.PowerActivity.b(a, 0x80000000);
                        com.qihoo.security.support.b.c(11309);
                        a.showDialog(1);
                    }
                }
                return true;
            }

            
            {
                a = PowerActivity.this;
                super();
            }
        });
        C.setOnChildClickListener(new android.widget.ExpandableListView.OnChildClickListener() {

            final PowerActivity a;

            public boolean onChildClick(ExpandableListView expandablelistview, View view, int i1, int j1, long l1)
            {
                if (com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a) != null && !com.qihoo360.mobilesafe.b.f.a())
                {
                    com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a, view);
                    com.qihoo.security.ui.opti.sysclear.PowerActivity.b(a, j1);
                    com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a, i1);
                    com.qihoo.security.support.b.c(11309);
                    a.showDialog(1);
                }
                return true;
            }

            
            {
                a = PowerActivity.this;
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

    static int r(PowerActivity poweractivity)
    {
        return poweractivity.ae;
    }

    static int s(PowerActivity poweractivity)
    {
        return poweractivity.af;
    }

    private void s()
    {
        if (!com.qihoo360.mobilesafe.b.f.a())
        {
            c(false);
        }
    }

    static List t(PowerActivity poweractivity)
    {
        return poweractivity.aj;
    }

    static int u(PowerActivity poweractivity)
    {
        return poweractivity.ag;
    }

    static LocaleTextView v(PowerActivity poweractivity)
    {
        return poweractivity.G;
    }

    public String a(long l1)
    {
        return com.qihoo360.mobilesafe.b.s.a(1024L * l1);
    }

    public void a(List list)
    {
        aj = list;
        if (list != null && !list.isEmpty())
        {
            list = com.qihoo.security.opti.a.a.a(list);
            if (!isFinishing())
            {
                a(aj, ((Map) (list)));
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
        if (intent != null && intent.getBooleanExtra("from_notify", false))
        {
            intent.setClass(this, com/qihoo/security/ui/main/HomeActivity);
            intent.setFlags(0x14000000);
            intent.putExtra("fragment_index", 0);
            intent.putExtra("jump_result_page", ak);
            intent.putExtra("jump_result_page_param", 1001);
            intent.putExtra("from_notify", false);
            intent.putExtra("reset_main_page", true);
            startActivity(intent);
        }
        super.finish();
    }

    protected void j()
    {
        super.j();
        b(o.a(0x7f0c002b));
    }

    protected void n()
    {
        s();
        com.qihoo.security.support.b.b(11317, 1);
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
        view = D.f();
        if (view == null || view.isEmpty())
        {
            com.qihoo360.mobilesafe.b.q.a().a(0x7f0c0020);
            return;
        }
        Z = true;
        if (P == null) goto _L6; else goto _L5
_L5:
        if (!D.d()) goto _L8; else goto _L7
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
        super.onCreate(bundle);
        setContentView(0x7f030081);
        Z = false;
        A = this;
        B = A.getPackageManager();
        p();
        q();
        ai = new a();
        ah = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        com.qihoo360.mobilesafe.b.s.a(A, com/qihoo/security/service/SecurityService, com.qihoo.security.env.a.f, al, 1);
        o();
        c(getIntent());
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

            final PowerActivity a;

            public void onClick(View view1)
            {
                if (com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a) == null)
                {
                    return;
                }
                if (com.qihoo.security.ui.opti.sysclear.PowerActivity.b(a))
                {
                    a.dismissDialog(1);
                    return;
                }
                com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a, true);
                view1 = com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a).b(com.qihoo.security.ui.opti.sysclear.PowerActivity.c(a), com.qihoo.security.ui.opti.sysclear.PowerActivity.d(a));
                if (view1 != null)
                {
                    com.qihoo.security.support.b.c(11312);
                    String s1 = ((c) (view1)).a;
                    a.c(s1);
                    com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a).b(PowerActivity.e(a), com.qihoo.security.ui.opti.sysclear.PowerActivity.d(a), view1);
                    int j1 = com.qihoo.security.ui.opti.sysclear.PowerActivity.f(a);
                    if (((c) (view1)).c)
                    {
                        com.qihoo.security.ui.opti.sysclear.PowerActivity.c(a, com.qihoo.security.ui.opti.sysclear.PowerActivity.f(a) - ((c) (view1)).d);
                    }
                    com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a, false, com.qihoo.security.ui.opti.sysclear.PowerActivity.f(a), j1);
                    com.qihoo360.mobilesafe.b.q.a().a(a.o.a(0x7f0c00ba, new Object[] {
                        Integer.valueOf(1)
                    }));
                }
                a.dismissDialog(1);
            }

            
            {
                a = PowerActivity.this;
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

                final PowerActivity a;

                public void onClick(View view1)
                {
                    if (com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a) == null)
                    {
                        return;
                    }
                    if (com.qihoo.security.ui.opti.sysclear.PowerActivity.b(a))
                    {
                        a.dismissDialog(1);
                        return;
                    }
                    com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a, true);
                    view1 = com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a).b(com.qihoo.security.ui.opti.sysclear.PowerActivity.c(a), com.qihoo.security.ui.opti.sysclear.PowerActivity.d(a));
                    if (view1 == null) goto _L2; else goto _L1
_L1:
                    ArrayList arraylist;
                    com.qihoo.security.support.b.c(11310);
                    String s1 = ((c) (view1)).a;
                    com.qihoo.security.ui.opti.sysclear.PowerActivity.g(a).put(s1, Integer.valueOf(((c) (view1)).d));
                    arraylist = new ArrayList();
                    KillBean killbean = new KillBean();
                    killbean.memory = ((c) (view1)).d;
                    killbean.packageName = s1;
                    arraylist.add(killbean);
                    if (PowerActivity.h(a) == null) goto _L4; else goto _L3
_L3:
                    if (!com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a).c()) goto _L6; else goto _L5
_L5:
                    PowerActivity.h(a).a(arraylist);
_L7:
                    ProcessClearService.b(arraylist);
_L4:
                    com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a).a(PowerActivity.e(a), com.qihoo.security.ui.opti.sysclear.PowerActivity.d(a), view1);
                    int j1 = com.qihoo.security.ui.opti.sysclear.PowerActivity.f(a);
                    if (((c) (view1)).c)
                    {
                        com.qihoo.security.ui.opti.sysclear.PowerActivity.c(a, com.qihoo.security.ui.opti.sysclear.PowerActivity.f(a) - ((c) (view1)).d);
                    }
                    com.qihoo.security.ui.opti.sysclear.PowerActivity.a(a, true, com.qihoo.security.ui.opti.sysclear.PowerActivity.f(a), j1);
_L2:
                    a.dismissDialog(1);
                    return;
_L6:
                    com.qihoo.security.ui.opti.sysclear.PowerActivity.b(a, true);
                    PowerActivity.h(a).b(arraylist);
                      goto _L7
                    RemoteException remoteexception;
                    remoteexception;
                      goto _L4
                }

            
            {
                a = PowerActivity.this;
                super();
            }
            }, new android.view.View.OnClickListener() {

                final PowerActivity a;

                public void onClick(View view1)
                {
                    com.qihoo.security.support.b.c(11311);
                    a.dismissDialog(1);
                }

            
            {
                a = PowerActivity.this;
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
        com.qihoo360.mobilesafe.b.s.a(z, A, al);
        y.removeCallbacksAndMessages(null);
        if (P != null)
        {
            try
            {
                P.b(am);
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
            com.qihoo.security.support.b.b(11317, 0);
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
        intent.putExtra("white_list_type", 1);
        startActivityForResult(intent, 101);
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onPause()
    {
        super.onPause();
        A.unregisterReceiver(ai);
        if (P == null)
        {
            break MISSING_BLOCK_LABEL_31;
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
            c c1 = D.b(N, M);
            if (c1 != null)
            {
                ((com.qihoo.security.dialog.b)dialog).setDialogTitle(c1.b);
                aa.setLocalText(o.a(0x7f0c00bd, new Object[] {
                    c1.a
                }));
                ab.setLocalText(o.a(0x7f0c00c0, new Object[] {
                    a(c1.d)
                }));
            }
        }
        super.onPrepareDialog(i1, dialog);
    }

    protected void onResume()
    {
        super.onResume();
        A.registerReceiver(ai, ah);
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
