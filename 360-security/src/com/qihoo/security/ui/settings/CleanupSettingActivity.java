// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.dialog.i;
import com.qihoo.security.locale.d;
import com.qihoo.security.opti.trashclear.ui.ClearWhiteListActivity;
import com.qihoo.security.widget.CheckBoxPreference;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;

public class CleanupSettingActivity extends BaseActivity
    implements android.view.View.OnClickListener
{
    private class a
        implements android.view.View.OnClickListener
    {

        final CleanupSettingActivity a;
        private Context b;
        private ArrayList c;
        private int d;
        private Dialog e;
        private int f[];
        private int g;
        private android.view.View.OnClickListener h;

        public void a()
        {
            if (e == null)
            {
                View view = LayoutInflater.from(b).inflate(g, null);
                e = new i(b);
                e.setContentView(view, new android.widget.FrameLayout.LayoutParams(-1, -2));
                c = new ArrayList();
                for (int k = 0; k < f.length; k++)
                {
                    CheckBoxPreference checkboxpreference1 = (CheckBoxPreference)view.findViewById(f[k]);
                    if (checkboxpreference1 != null)
                    {
                        c.add(checkboxpreference1);
                        checkboxpreference1.setOnClickListener(this);
                    }
                }

                e.setCanceledOnTouchOutside(false);
            }
            int i1 = c.size();
            int l = 0;
            while (l < i1) 
            {
                CheckBoxPreference checkboxpreference = (CheckBoxPreference)c.get(l);
                if (checkboxpreference != null)
                {
                    boolean flag;
                    if (checkboxpreference.getId() == d)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    checkboxpreference.a(flag);
                }
                l++;
            }
            e.show();
        }

        public void a(int k)
        {
            d = k;
            a();
        }

        public void b()
        {
            if (e != null)
            {
                e.cancel();
            }
        }

        public void onClick(View view)
        {
            d = view.getId();
            if (h != null)
            {
                h.onClick(view);
            }
        }

        a(Context context, int k, int ai[], android.view.View.OnClickListener onclicklistener)
        {
            a = CleanupSettingActivity.this;
            super();
            b = context;
            g = k;
            f = ai;
            h = onclicklistener;
        }
    }


    private CheckBoxPreference A;
    private CheckBoxPreference B;
    private CheckBoxPreference C;
    private CheckBoxPreference D;
    private CheckBoxPreference E;
    private int F[] = {
        0x7f0b00dd, 0x7f0b00de, 0x7f0b00df, 0x7f0b00e0
    };
    private int G[] = {
        0x7f0b00da, 0x7f0b00db, 0x7f0b00dc
    };
    private a H;
    private a I;
    private CheckBoxPreference y;
    private CheckBoxPreference z;

    public CleanupSettingActivity()
    {
    }

    static CheckBoxPreference a(CleanupSettingActivity cleanupsettingactivity)
    {
        return cleanupsettingactivity.A;
    }

    static CheckBoxPreference b(CleanupSettingActivity cleanupsettingactivity)
    {
        return cleanupsettingactivity.B;
    }

    private void o()
    {
        y = (CheckBoxPreference)findViewById(0x7f0b00d2);
        z = (CheckBoxPreference)findViewById(0x7f0b00d3);
        A = (CheckBoxPreference)findViewById(0x7f0b00d4);
        B = (CheckBoxPreference)findViewById(0x7f0b00d5);
        C = (CheckBoxPreference)findViewById(0x7f0b00d6);
        D = (CheckBoxPreference)findViewById(0x7f0b00d7);
        E = (CheckBoxPreference)findViewById(0x7f0b00d8);
        int i;
        if (SharedPref.b(getApplicationContext(), "remind_notification_swtich", true))
        {
            y.a(true);
        } else
        {
            y.a(false);
        }
        if (SharedPref.b(getApplicationContext(), "remind_trash_swtich", true))
        {
            z.a(true);
            A.setEnabled(true);
            B.setEnabled(true);
        } else
        {
            z.a(false);
            A.setEnabled(false);
            B.setEnabled(false);
        }
        i = SharedPref.b(getApplicationContext(), "remind_trash_swtich_time", 7);
        if (i == 1)
        {
            A.setSummary(0x7f0c019b);
        } else
        if (i == 3)
        {
            A.setSummary(0x7f0c019c);
        } else
        if (i == 7)
        {
            A.setSummary(0x7f0c019d);
        }
        i = SharedPref.b(p, "remind_trash_swtich_size", 50);
        if (i == 50)
        {
            B.setSummary(0x7f0c01e0);
        } else
        if (i == 100)
        {
            B.setSummary(0x7f0c01e1);
        } else
        if (i == 300)
        {
            B.setSummary(0x7f0c01e2);
        } else
        if (i == 500)
        {
            B.setSummary(0x7f0c01e3);
        }
        if (SharedPref.b(getApplicationContext(), "remind_delpackage_swtich", true))
        {
            C.a(true);
        } else
        {
            C.a(false);
        }
        if (SharedPref.b(getApplicationContext(), "remind_uninstallReminder_swtich", true))
        {
            D.a(true);
            return;
        } else
        {
            D.a(false);
            return;
        }
    }

    private void p()
    {
        A.setOnClickListener(this);
        B.setOnClickListener(this);
        E.setOnClickListener(this);
        y.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final CleanupSettingActivity a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                SharedPref.a(a.getApplicationContext(), "remind_notification_swtich", flag);
            }

            
            {
                a = CleanupSettingActivity.this;
                super();
            }
        });
        z.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final CleanupSettingActivity a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (flag)
                {
                    CleanupSettingActivity.a(a).setEnabled(true);
                    CleanupSettingActivity.b(a).setEnabled(true);
                } else
                {
                    CleanupSettingActivity.a(a).setEnabled(false);
                    CleanupSettingActivity.b(a).setEnabled(false);
                }
                SharedPref.a(a.getApplicationContext(), "remind_trash_swtich", flag);
            }

            
            {
                a = CleanupSettingActivity.this;
                super();
            }
        });
        C.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final CleanupSettingActivity a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                SharedPref.a(a.getApplicationContext(), "remind_delpackage_swtich", flag);
            }

            
            {
                a = CleanupSettingActivity.this;
                super();
            }
        });
        D.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final CleanupSettingActivity a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                SharedPref.a(a.getApplicationContext(), "remind_uninstallReminder_swtich", flag);
            }

            
            {
                a = CleanupSettingActivity.this;
                super();
            }
        });
    }

    private void q()
    {
        if (H == null)
        {
            H = new a(this, 0x7f03003e, F, this);
        }
        int i = SharedPref.b(p, "remind_trash_swtich_size", 50);
        if (i == 50)
        {
            H.a(0x7f0b00dd);
        } else
        {
            if (i == 100)
            {
                H.a(0x7f0b00de);
                return;
            }
            if (i == 300)
            {
                H.a(0x7f0b00df);
                return;
            }
            if (i == 500)
            {
                H.a(0x7f0b00e0);
                return;
            }
        }
    }

    private void r()
    {
        if (H != null)
        {
            H.b();
        }
    }

    private void s()
    {
        if (I == null)
        {
            I = new a(this, 0x7f03003d, G, this);
        }
        int i = SharedPref.b(getApplicationContext(), "remind_trash_swtich_time", 7);
        if (i == 1)
        {
            I.a(0x7f0b00da);
        } else
        {
            if (i == 3)
            {
                I.a(0x7f0b00db);
                return;
            }
            if (i == 7)
            {
                I.a(0x7f0b00dc);
                return;
            }
        }
    }

    private void t()
    {
        if (I != null)
        {
            I.b();
        }
    }

    protected void j()
    {
        super.j();
        if (r != null)
        {
            b(o.a(0x7f0c0191));
        }
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        case 2131427542: 
        case 2131427543: 
        case 2131427545: 
        default:
            return;

        case 2131427540: 
            s();
            return;

        case 2131427541: 
            q();
            return;

        case 2131427544: 
            startActivity(new Intent(this, com/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity));
            return;

        case 2131427546: 
            A.setSummary(0x7f0c019b);
            t();
            SharedPref.a(getApplicationContext(), "remind_trash_swtich_time", 1);
            return;

        case 2131427547: 
            A.setSummary(0x7f0c019c);
            t();
            SharedPref.a(getApplicationContext(), "remind_trash_swtich_time", 3);
            return;

        case 2131427548: 
            A.setSummary(0x7f0c019d);
            t();
            SharedPref.a(getApplicationContext(), "remind_trash_swtich_time", 7);
            return;

        case 2131427549: 
            B.setSummary(0x7f0c01e0);
            r();
            SharedPref.a(p, "remind_trash_swtich_size", 50);
            return;

        case 2131427550: 
            B.setSummary(0x7f0c01e1);
            r();
            SharedPref.a(p, "remind_trash_swtich_size", 100);
            return;

        case 2131427551: 
            B.setSummary(0x7f0c01e2);
            r();
            SharedPref.a(p, "remind_trash_swtich_size", 300);
            return;

        case 2131427552: 
            B.setSummary(0x7f0c01e3);
            break;
        }
        r();
        SharedPref.a(p, "remind_trash_swtich_size", 500);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03003c);
        o();
        p();
    }
}
