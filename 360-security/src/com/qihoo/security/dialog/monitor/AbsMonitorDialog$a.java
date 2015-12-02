// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog.monitor;

import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.malware.b;
import com.qihoo.security.malware.db.c;
import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo360.mobilesafe.b.a;
import com.qihoo360.mobilesafe.b.q;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.qihoo.security.dialog.monitor:
//            AbsMonitorDialog

private class b extends BaseAdapter
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

    public Object getItem(int i)
    {
        return AbsMonitorDialog.j(a).get(i);
    }

    public long getItemId(int i)
    {
        return (long)((MaliciousInfo)AbsMonitorDialog.j(a).get(i))._id;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        MaliciousInfo maliciousinfo;
        String s;
        if (view == null)
        {
            view = b.inflate(0x7f030076, null);
            viewgroup = new <init>(a, null);
            com.qihoo.security.dialog.monitor.a(viewgroup, (ImageView)view.findViewById(0x7f0b018c));
            com.qihoo.security.dialog.monitor.a(viewgroup, (LocaleTextView)view.findViewById(0x7f0b018d));
            com.qihoo.security.dialog.monitor.b(viewgroup, (LocaleTextView)view.findViewById(0x7f0b018e));
            com.qihoo.security.dialog.monitor.c(viewgroup, (LocaleTextView)view.findViewById(0x7f0b0190));
            com.qihoo.security.dialog.monitor.d(viewgroup, (LocaleTextView)view.findViewById(0x7f0b0192));
            e(viewgroup, (LocaleTextView)view.findViewById(0x7f0b0191));
            f(viewgroup, (LocaleTextView)view.findViewById(0x7f0b0193));
            com.qihoo.security.dialog.monitor.a(viewgroup, (CheckBox)view.findViewById(0x7f0b018f));
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (a)view.getTag();
        }
        maliciousinfo = (MaliciousInfo)AbsMonitorDialog.j(a).get(i);
        if (AbsMonitorDialog.j(a).size() == 1 && maliciousinfo.isMalware())
        {
            com.qihoo.security.dialog.monitor.a(viewgroup).setVisibility(0);
            com.qihoo.security.dialog.monitor.b(viewgroup).setVisibility(8);
        } else
        {
            com.qihoo.security.dialog.monitor.a(viewgroup).setVisibility(8);
            com.qihoo.security.dialog.monitor.b(viewgroup).setVisibility(0);
        }
        com.qihoo.security.dialog.monitor.c(viewgroup).setImageDrawable(com.qihoo360.mobilesafe.b.a.c(AbsMonitorDialog.k(a), maliciousinfo.packageName, maliciousinfo.filePath, maliciousinfo.isInstalled));
        com.qihoo.security.dialog.monitor.d(viewgroup).setLocalText(com.qihoo360.mobilesafe.b.a.a(AbsMonitorDialog.l(a), maliciousinfo.packageName, maliciousinfo.filePath, maliciousinfo.isInstalled));
        i = maliciousinfo.maliceRank;
        if (maliciousinfo.isTrojan())
        {
            i = 3;
        } else
        if (maliciousinfo.isDanger())
        {
            i = 1;
        } else
        if (maliciousinfo.isWarning())
        {
            i = 2;
        }
        if (maliciousinfo.isWarning() && !c.a(AbsMonitorDialog.m(a), maliciousinfo))
        {
            e(viewgroup).setVisibility(0);
        } else
        {
            e(viewgroup).setVisibility(8);
        }
        f(viewgroup).setText(maliciousinfo.getVirusSummaryOfDialog());
        e(viewgroup).getPaint().setFlags(8);
        f(viewgroup).setOnClickListener(new android.view.View.OnClickListener(maliciousinfo) {

            final MaliciousInfo a;
            final AbsMonitorDialog.a b;

            public void onClick(View view1)
            {
                com.qihoo.security.dialog.monitor.AbsMonitorDialog.a(b.a, a);
            }

            
            {
                b = AbsMonitorDialog.a.this;
                a = maliciousinfo;
                super();
            }
        });
        e(viewgroup).setOnClickListener(new android.view.View.OnClickListener(maliciousinfo) {

            final MaliciousInfo a;
            final AbsMonitorDialog.a b;

            public void onClick(View view1)
            {
                view1 = new ArrayList();
                view1.add(a);
                c.a(AbsMonitorDialog.n(b.a), view1);
                q.a().a(AbsMonitorDialog.p(b.a).a(0x7f0c0120, new Object[] {
                    com.qihoo360.mobilesafe.b.a.a(AbsMonitorDialog.o(b.a), a.packageName, a.filePath, a.isInstalled)
                }));
                AbsMonitorDialog.j(b.a).remove(a);
                b.notifyDataSetChanged();
                com.qihoo.security.dialog.monitor.AbsMonitorDialog.b(b.a);
            }

            
            {
                b = AbsMonitorDialog.a.this;
                a = maliciousinfo;
                super();
            }
        });
        s = com.qihoo.security.malware.b.a(com.qihoo.security.dialog.monitor.AbsMonitorDialog.q(a), i);
        i = com.qihoo.security.malware.b.b(AbsMonitorDialog.r(a), i);
        g(viewgroup).setTextColor(i);
        g(viewgroup).setLocalText(s);
        s = com.qihoo.security.malware.b.a(AbsMonitorDialog.s(a), maliciousinfo.behavior, ";");
        if (!TextUtils.isEmpty(s))
        {
            h(viewgroup).setLocalText(s);
            h(viewgroup).setVisibility(8);
        } else
        {
            h(viewgroup).setVisibility(8);
        }
        com.qihoo.security.dialog.monitor.b(viewgroup).setOnCheckedChangeListener(null);
        if (AbsMonitorDialog.g(a).contains(Integer.valueOf(maliciousinfo._id)))
        {
            com.qihoo.security.dialog.monitor.b(viewgroup).setChecked(true);
        } else
        {
            com.qihoo.security.dialog.monitor.b(viewgroup).setChecked(false);
        }
        com.qihoo.security.dialog.monitor.b(viewgroup).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(maliciousinfo) {

            final MaliciousInfo a;
            final AbsMonitorDialog.a b;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (flag)
                {
                    AbsMonitorDialog.g(b.a).add(Integer.valueOf(a._id));
                } else
                {
                    AbsMonitorDialog.g(b.a).remove(Integer.valueOf(a._id));
                }
                AbsMonitorDialog.t(b.a);
            }

            
            {
                b = AbsMonitorDialog.a.this;
                a = maliciousinfo;
                super();
            }
        });
        return view;
    }

    public _cls3.a(AbsMonitorDialog absmonitordialog)
    {
        a = absmonitordialog;
        super();
        b = LayoutInflater.from(AbsMonitorDialog.i(absmonitordialog));
    }
}
