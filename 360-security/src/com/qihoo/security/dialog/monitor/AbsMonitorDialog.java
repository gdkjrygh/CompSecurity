// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog.monitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.qihoo.security.dialog.AbsDialogListActivity;
import com.qihoo.security.dialog.g;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleButton;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.malware.a.b;
import com.qihoo.security.malware.db.a;
import com.qihoo.security.malware.db.c;
import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo.security.receiver.PackageMonitor;
import com.qihoo.security.ui.antivirus.MalwareDetailActivity;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.dialog.monitor:
//            MonitorDangerDialog, MonitorWarningDialog

public abstract class AbsMonitorDialog extends AbsDialogListActivity
    implements com.qihoo.security.receiver.PackageMonitor.a
{
    private class a extends BaseAdapter
    {

        final AbsMonitorDialog a;
        private final LayoutInflater b;

        public int getCount()
        {
            if (AbsMonitorDialog.j(a) == null)
            {
                return 0;
            } else
            {
                return AbsMonitorDialog.j(a).size();
            }
        }

        public Object getItem(int i1)
        {
            return AbsMonitorDialog.j(a).get(i1);
        }

        public long getItemId(int i1)
        {
            return (long)((MaliciousInfo)AbsMonitorDialog.j(a).get(i1))._id;
        }

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            MaliciousInfo maliciousinfo;
            String s1;
            if (view == null)
            {
                view = b.inflate(0x7f030076, null);
                viewgroup = a. new b();
                com.qihoo.security.dialog.monitor.b.a(viewgroup, (ImageView)view.findViewById(0x7f0b018c));
                com.qihoo.security.dialog.monitor.b.a(viewgroup, (LocaleTextView)view.findViewById(0x7f0b018d));
                com.qihoo.security.dialog.monitor.b.b(viewgroup, (LocaleTextView)view.findViewById(0x7f0b018e));
                com.qihoo.security.dialog.monitor.b.c(viewgroup, (LocaleTextView)view.findViewById(0x7f0b0190));
                com.qihoo.security.dialog.monitor.b.d(viewgroup, (LocaleTextView)view.findViewById(0x7f0b0192));
                b.e(viewgroup, (LocaleTextView)view.findViewById(0x7f0b0191));
                b.f(viewgroup, (LocaleTextView)view.findViewById(0x7f0b0193));
                com.qihoo.security.dialog.monitor.b.a(viewgroup, (CheckBox)view.findViewById(0x7f0b018f));
                view.setTag(viewgroup);
            } else
            {
                viewgroup = (b)view.getTag();
            }
            maliciousinfo = (MaliciousInfo)AbsMonitorDialog.j(a).get(i1);
            if (AbsMonitorDialog.j(a).size() == 1 && maliciousinfo.isMalware())
            {
                com.qihoo.security.dialog.monitor.b.a(viewgroup).setVisibility(0);
                com.qihoo.security.dialog.monitor.b.b(viewgroup).setVisibility(8);
            } else
            {
                com.qihoo.security.dialog.monitor.b.a(viewgroup).setVisibility(8);
                com.qihoo.security.dialog.monitor.b.b(viewgroup).setVisibility(0);
            }
            com.qihoo.security.dialog.monitor.b.c(viewgroup).setImageDrawable(com.qihoo360.mobilesafe.b.a.c(AbsMonitorDialog.k(a), maliciousinfo.packageName, maliciousinfo.filePath, maliciousinfo.isInstalled));
            com.qihoo.security.dialog.monitor.b.d(viewgroup).setLocalText(com.qihoo360.mobilesafe.b.a.a(AbsMonitorDialog.l(a), maliciousinfo.packageName, maliciousinfo.filePath, maliciousinfo.isInstalled));
            i1 = maliciousinfo.maliceRank;
            if (maliciousinfo.isTrojan())
            {
                i1 = 3;
            } else
            if (maliciousinfo.isDanger())
            {
                i1 = 1;
            } else
            if (maliciousinfo.isWarning())
            {
                i1 = 2;
            }
            if (maliciousinfo.isWarning() && !com.qihoo.security.malware.db.c.a(AbsMonitorDialog.m(a), maliciousinfo))
            {
                b.e(viewgroup).setVisibility(0);
            } else
            {
                b.e(viewgroup).setVisibility(8);
            }
            b.f(viewgroup).setText(maliciousinfo.getVirusSummaryOfDialog());
            b.e(viewgroup).getPaint().setFlags(8);
            b.f(viewgroup).setOnClickListener(new android.view.View.OnClickListener(this, maliciousinfo) {

                final MaliciousInfo a;
                final a b;

                public void onClick(View view)
                {
                    com.qihoo.security.dialog.monitor.AbsMonitorDialog.a(b.a, a);
                }

            
            {
                b = a1;
                a = maliciousinfo;
                super();
            }
            });
            b.e(viewgroup).setOnClickListener(new android.view.View.OnClickListener(this, maliciousinfo) {

                final MaliciousInfo a;
                final a b;

                public void onClick(View view)
                {
                    view = new ArrayList();
                    view.add(a);
                    com.qihoo.security.malware.db.c.a(AbsMonitorDialog.n(b.a), view);
                    com.qihoo360.mobilesafe.b.q.a().a(AbsMonitorDialog.p(b.a).a(0x7f0c0120, new Object[] {
                        com.qihoo360.mobilesafe.b.a.a(AbsMonitorDialog.o(b.a), a.packageName, a.filePath, a.isInstalled)
                    }));
                    AbsMonitorDialog.j(b.a).remove(a);
                    b.notifyDataSetChanged();
                    com.qihoo.security.dialog.monitor.AbsMonitorDialog.b(b.a);
                }

            
            {
                b = a1;
                a = maliciousinfo;
                super();
            }
            });
            s1 = com.qihoo.security.malware.b.a(com.qihoo.security.dialog.monitor.AbsMonitorDialog.q(a), i1);
            i1 = com.qihoo.security.malware.b.b(AbsMonitorDialog.r(a), i1);
            com.qihoo.security.dialog.monitor.b.g(viewgroup).setTextColor(i1);
            com.qihoo.security.dialog.monitor.b.g(viewgroup).setLocalText(s1);
            s1 = com.qihoo.security.malware.b.a(AbsMonitorDialog.s(a), maliciousinfo.behavior, ";");
            if (!TextUtils.isEmpty(s1))
            {
                b.h(viewgroup).setLocalText(s1);
                b.h(viewgroup).setVisibility(8);
            } else
            {
                b.h(viewgroup).setVisibility(8);
            }
            com.qihoo.security.dialog.monitor.b.b(viewgroup).setOnCheckedChangeListener(null);
            if (com.qihoo.security.dialog.monitor.AbsMonitorDialog.g(a).contains(Integer.valueOf(maliciousinfo._id)))
            {
                com.qihoo.security.dialog.monitor.b.b(viewgroup).setChecked(true);
            } else
            {
                com.qihoo.security.dialog.monitor.b.b(viewgroup).setChecked(false);
            }
            com.qihoo.security.dialog.monitor.b.b(viewgroup).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(this, maliciousinfo) {

                final MaliciousInfo a;
                final a b;

                public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
                {
                    if (flag)
                    {
                        com.qihoo.security.dialog.monitor.AbsMonitorDialog.g(b.a).add(Integer.valueOf(a._id));
                    } else
                    {
                        com.qihoo.security.dialog.monitor.AbsMonitorDialog.g(b.a).remove(Integer.valueOf(a._id));
                    }
                    AbsMonitorDialog.t(b.a);
                }

            
            {
                b = a1;
                a = maliciousinfo;
                super();
            }
            });
            return view;
        }

        public a()
        {
            a = AbsMonitorDialog.this;
            super();
            b = LayoutInflater.from(AbsMonitorDialog.i(AbsMonitorDialog.this));
        }
    }

    private class b
    {

        final AbsMonitorDialog a;
        private ImageView b;
        private LocaleTextView c;
        private LocaleTextView d;
        private LocaleTextView e;
        private LocaleTextView f;
        private LocaleTextView g;
        private LocaleTextView h;
        private CheckBox i;

        static CheckBox a(b b1, CheckBox checkbox)
        {
            b1.i = checkbox;
            return checkbox;
        }

        static ImageView a(b b1, ImageView imageview)
        {
            b1.b = imageview;
            return imageview;
        }

        static LocaleTextView a(b b1)
        {
            return b1.f;
        }

        static LocaleTextView a(b b1, LocaleTextView localetextview)
        {
            b1.c = localetextview;
            return localetextview;
        }

        static CheckBox b(b b1)
        {
            return b1.i;
        }

        static LocaleTextView b(b b1, LocaleTextView localetextview)
        {
            b1.d = localetextview;
            return localetextview;
        }

        static ImageView c(b b1)
        {
            return b1.b;
        }

        static LocaleTextView c(b b1, LocaleTextView localetextview)
        {
            b1.e = localetextview;
            return localetextview;
        }

        static LocaleTextView d(b b1)
        {
            return b1.c;
        }

        static LocaleTextView d(b b1, LocaleTextView localetextview)
        {
            b1.g = localetextview;
            return localetextview;
        }

        static LocaleTextView e(b b1)
        {
            return b1.h;
        }

        static LocaleTextView e(b b1, LocaleTextView localetextview)
        {
            b1.f = localetextview;
            return localetextview;
        }

        static LocaleTextView f(b b1)
        {
            return b1.g;
        }

        static LocaleTextView f(b b1, LocaleTextView localetextview)
        {
            b1.h = localetextview;
            return localetextview;
        }

        static LocaleTextView g(b b1)
        {
            return b1.d;
        }

        static LocaleTextView h(b b1)
        {
            return b1.e;
        }

        private b()
        {
            a = AbsMonitorDialog.this;
            super();
        }

    }


    protected android.support.v4.content.g c;
    protected BroadcastReceiver d;
    private g e;
    private com.qihoo.security.malware.a.b f;
    private PackageMonitor g;
    private List h;
    private List i;
    private List j;
    private a k;
    private boolean l;
    private final com.qihoo.security.malware.a.a.a m = new com.qihoo.security.malware.a.a.a() {

        final AbsMonitorDialog a;

        public void a()
        {
            Utils.dismissDialog(com.qihoo.security.dialog.monitor.AbsMonitorDialog.a(a));
            com.qihoo.security.dialog.monitor.AbsMonitorDialog.b(a);
            if (com.qihoo.security.dialog.monitor.AbsMonitorDialog.c(a))
            {
                a.finish();
            }
        }

        public void a(MaliciousInfo maliciousinfo, int i1, int j1)
        {
            if (com.qihoo.security.dialog.monitor.AbsMonitorDialog.a(a) != null)
            {
                if (!com.qihoo.security.dialog.monitor.AbsMonitorDialog.a(a).isShowing())
                {
                    com.qihoo.security.dialog.monitor.AbsMonitorDialog.a(a).show();
                }
                com.qihoo.security.dialog.monitor.AbsMonitorDialog.a(a).a(com.qihoo.security.locale.d.a().a(0x7f0c00ed, new Object[] {
                    maliciousinfo.getLabel(com.qihoo.security.dialog.monitor.AbsMonitorDialog.d(a)), Integer.valueOf(i1), Integer.valueOf(j1)
                }));
            }
        }

        public void b()
        {
        }

            
            {
                a = AbsMonitorDialog.this;
                super();
            }
    };
    private final Comparator n = new Comparator() {

        final AbsMonitorDialog a;

        public int a(MaliciousInfo maliciousinfo, MaliciousInfo maliciousinfo1)
        {
            int j1 = 0;
            int i1;
            if (maliciousinfo.isTrojan())
            {
                i1 = 0;
            } else
            if (maliciousinfo.isDanger())
            {
                i1 = 1;
            } else
            if (maliciousinfo.isWarning())
            {
                i1 = 2;
            } else
            {
                i1 = 3;
            }
            if (!maliciousinfo1.isTrojan())
            {
                if (maliciousinfo1.isDanger())
                {
                    j1 = 1;
                } else
                if (maliciousinfo1.isWarning())
                {
                    j1 = 2;
                } else
                {
                    j1 = 3;
                }
            }
            return i1 - j1;
        }

        public int compare(Object obj, Object obj1)
        {
            return a((MaliciousInfo)obj, (MaliciousInfo)obj1);
        }

            
            {
                a = AbsMonitorDialog.this;
                super();
            }
    };

    public AbsMonitorDialog()
    {
        f = null;
        d = new BroadcastReceiver() {

            final AbsMonitorDialog a;

            public void onReceive(Context context, Intent intent)
            {
                if (intent == null)
                {
                    return;
                }
                if ("com.qihoo.action.MONITOR_UPDATE".equals(intent.getAction()))
                {
                    com.qihoo.security.dialog.monitor.AbsMonitorDialog.b(a);
                    return;
                } else
                {
                    a.finish();
                    return;
                }
            }

            
            {
                a = AbsMonitorDialog.this;
                super();
            }
        };
    }

    static g a(AbsMonitorDialog absmonitordialog)
    {
        return absmonitordialog.e;
    }

    static void a(AbsMonitorDialog absmonitordialog, MaliciousInfo maliciousinfo)
    {
        absmonitordialog.a(maliciousinfo);
    }

    private void a(MaliciousInfo maliciousinfo)
    {
        Intent intent = new Intent(b, com/qihoo/security/ui/antivirus/MalwareDetailActivity);
        intent.putExtra("extra_detail_info", maliciousinfo);
        startActivity(intent);
        finish();
    }

    static boolean a(AbsMonitorDialog absmonitordialog, boolean flag)
    {
        absmonitordialog.l = flag;
        return flag;
    }

    public static boolean a(Class class1)
    {
        if (com/qihoo/security/dialog/monitor/MonitorDangerDialog.equals(class1))
        {
            return MonitorDangerDialog.i();
        }
        if (com/qihoo/security/dialog/monitor/MonitorWarningDialog.equals(class1))
        {
            return MonitorWarningDialog.i();
        } else
        {
            return h();
        }
    }

    static void b(AbsMonitorDialog absmonitordialog)
    {
        absmonitordialog.i();
    }

    static boolean c(AbsMonitorDialog absmonitordialog)
    {
        return absmonitordialog.l;
    }

    static Context d(AbsMonitorDialog absmonitordialog)
    {
        return absmonitordialog.b;
    }

    static a e(AbsMonitorDialog absmonitordialog)
    {
        return absmonitordialog.k;
    }

    static void f(AbsMonitorDialog absmonitordialog)
    {
        absmonitordialog.l();
    }

    static List g(AbsMonitorDialog absmonitordialog)
    {
        return absmonitordialog.i;
    }

    static List h(AbsMonitorDialog absmonitordialog)
    {
        return absmonitordialog.j;
    }

    public static boolean h()
    {
        return false;
    }

    static Context i(AbsMonitorDialog absmonitordialog)
    {
        return absmonitordialog.b;
    }

    private void i()
    {
        Object obj = j;
        j = new ArrayList();
        h = d();
        for (Iterator iterator = h.iterator(); iterator.hasNext();)
        {
            MaliciousInfo maliciousinfo = (MaliciousInfo)iterator.next();
            if (maliciousinfo.isUninstall(this))
            {
                iterator.remove();
                com.qihoo.security.malware.db.a.a(this, maliciousinfo._id);
                i.remove(Integer.valueOf(maliciousinfo._id));
            } else
            {
                if (maliciousinfo.isMalware() && !((List) (obj)).contains(Integer.valueOf(maliciousinfo._id)))
                {
                    i.add(Integer.valueOf(maliciousinfo._id));
                }
                j.add(Integer.valueOf(maliciousinfo._id));
            }
        }

        obj = i.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Integer integer = (Integer)((Iterator) (obj)).next();
            if (!j.contains(integer))
            {
                ((Iterator) (obj)).remove();
            }
        } while (true);
        if (h.isEmpty())
        {
            finish();
            return;
        } else
        {
            k();
            Collections.sort(h, n);
            k.notifyDataSetChanged();
            return;
        }
    }

    static List j(AbsMonitorDialog absmonitordialog)
    {
        return absmonitordialog.h;
    }

    private void j()
    {
        a(g());
        setDialogTitle(c());
        k = new a();
        a(k, new android.widget.AdapterView.OnItemClickListener() {

            final AbsMonitorDialog a;

            public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
            {
                adapterview = (MaliciousInfo)AbsMonitorDialog.e(a).getItem(i1);
                com.qihoo.security.dialog.monitor.AbsMonitorDialog.a(a, adapterview);
            }

            
            {
                a = AbsMonitorDialog.this;
                super();
            }
        });
        setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener() {

                final AbsMonitorDialog a;

                public void onClick(View view)
                {
                    com.qihoo.security.dialog.monitor.AbsMonitorDialog.a(a, true);
                    AbsMonitorDialog.f(a);
                    if (com.qihoo.security.dialog.monitor.AbsMonitorDialog.g(a) != null && AbsMonitorDialog.h(a) != null)
                    {
                        com.qihoo.security.support.b.a(14312, (new StringBuilder()).append(com.qihoo.security.dialog.monitor.AbsMonitorDialog.g(a).size()).append("").toString(), (new StringBuilder()).append(AbsMonitorDialog.h(a).size()).append("").toString());
                        return;
                    } else
                    {
                        com.qihoo.security.support.b.b(14312);
                        return;
                    }
                }

            
            {
                a = AbsMonitorDialog.this;
                super();
            }
            }, new android.view.View.OnClickListener() {

                final AbsMonitorDialog a;

                public void onClick(View view)
                {
                    a.finish();
                    if (AbsMonitorDialog.h(a) != null)
                    {
                        com.qihoo.security.support.b.a(14313, AbsMonitorDialog.h(a).size());
                        return;
                    } else
                    {
                        com.qihoo.security.support.b.b(14313);
                        return;
                    }
                }

            
            {
                a = AbsMonitorDialog.this;
                super();
            }
            }
        });
    }

    static Context k(AbsMonitorDialog absmonitordialog)
    {
        return absmonitordialog.b;
    }

    private void k()
    {
        LocaleButton alocalebutton[];
label0:
        {
            setButtonText(new CharSequence[] {
                a.a(0x7f0c011f), a.a(0x7f0c014f)
            });
            alocalebutton = getShownButtons();
            if (alocalebutton.length == 2)
            {
                if (i.size() <= 0)
                {
                    break label0;
                }
                alocalebutton[1].setEnabled(true);
                alocalebutton[1].setTextColor(getResources().getColor(0x7f080056));
            }
            return;
        }
        alocalebutton[1].setEnabled(false);
        alocalebutton[1].setTextColor(getResources().getColor(0x7f08006b));
    }

    static Context l(AbsMonitorDialog absmonitordialog)
    {
        return absmonitordialog.b;
    }

    private void l()
    {
        ArrayList arraylist = new ArrayList();
        h = d();
        Iterator iterator = h.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MaliciousInfo maliciousinfo = (MaliciousInfo)iterator.next();
            if (maliciousinfo.isUninstall(this))
            {
                i.remove(Integer.valueOf(maliciousinfo._id));
                j.remove(Integer.valueOf(maliciousinfo._id));
                iterator.remove();
                com.qihoo.security.malware.db.a.a(this, maliciousinfo._id);
            } else
            if (i.contains(Integer.valueOf(maliciousinfo._id)))
            {
                arraylist.add(maliciousinfo);
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            f.a(arraylist);
            if (e != null)
            {
                e.a(com.qihoo.security.locale.d.a().a(0x7f0c00ec, new Object[] {
                    Integer.valueOf(0), Integer.valueOf(arraylist.size())
                }));
                e.show();
            }
        }
    }

    static Context m(AbsMonitorDialog absmonitordialog)
    {
        return absmonitordialog.b;
    }

    static Context n(AbsMonitorDialog absmonitordialog)
    {
        return absmonitordialog.b;
    }

    static Context o(AbsMonitorDialog absmonitordialog)
    {
        return absmonitordialog.b;
    }

    static d p(AbsMonitorDialog absmonitordialog)
    {
        return absmonitordialog.a;
    }

    static Context q(AbsMonitorDialog absmonitordialog)
    {
        return absmonitordialog.b;
    }

    static Context r(AbsMonitorDialog absmonitordialog)
    {
        return absmonitordialog.b;
    }

    static Context s(AbsMonitorDialog absmonitordialog)
    {
        return absmonitordialog.b;
    }

    static void t(AbsMonitorDialog absmonitordialog)
    {
        absmonitordialog.k();
    }

    protected int a()
    {
        return 0x7f030077;
    }

    public void a(String s1)
    {
    }

    public void b()
    {
        i();
    }

    public void b(String s1)
    {
    }

    protected abstract int c();

    protected abstract List d();

    protected abstract void e();

    protected abstract void f();

    protected abstract int g();

    public void onBackPressed()
    {
        super.onBackPressed();
        if (j != null)
        {
            com.qihoo.security.support.b.a(14313, j.size());
            return;
        } else
        {
            com.qihoo.security.support.b.b(14313);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        i = new ArrayList();
        j = new ArrayList();
        j();
        com.qihoo.security.support.b.b(14311);
        c = android.support.v4.content.g.a(getApplicationContext());
        e();
        boolean flag = com.qihoo360.mobilesafe.support.a.c(getApplicationContext());
        if (flag)
        {
            e = new g(this);
            e.setCancelable(false);
            e.setCanceledOnTouchOutside(false);
        }
        f = new com.qihoo.security.malware.a.b(this, flag, m);
        g = new PackageMonitor(this);
        g.a(this);
        i();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        Utils.dismissDialog(e);
        f();
        if (g != null)
        {
            g.b(this);
        }
    }

    protected void onResume()
    {
        super.onResume();
        f.c();
    }

    protected void onStart()
    {
        super.onStart();
        f.a();
    }

    protected void onStop()
    {
        super.onStop();
        f.b();
    }
}
