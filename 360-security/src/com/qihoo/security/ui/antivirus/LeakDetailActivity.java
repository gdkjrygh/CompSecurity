// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.dialog.g;
import com.qihoo.security.leak.LeakTipsService;
import com.qihoo.security.leak.b;
import com.qihoo.security.leak.c;
import com.qihoo.security.leak.d;
import com.qihoo.security.locale.widget.LocaleButton;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.f;
import com.qihoo360.mobilesafe.b.q;

public class LeakDetailActivity extends BaseActivity
    implements android.view.View.OnClickListener
{
    private class a extends AsyncTask
    {

        final LeakDetailActivity a;
        private g b;

        protected transient Boolean a(Integer ainteger[])
        {
            long l = 0L;
            if (LeakDetailActivity.a(a) == null)
            {
                return Boolean.valueOf(false);
            }
            long l1 = SystemClock.elapsedRealtime();
            LeakDetailActivity.a(a).f();
            l1 = SystemClock.elapsedRealtime() - l1;
            if (l1 >= 0L)
            {
                l = l1;
            }
            if (l < 800L)
            {
                try
                {
                    Thread.sleep(800L - l);
                }
                // Misplaced declaration of an exception variable
                catch (Integer ainteger[]) { }
            }
            return Boolean.valueOf(LeakDetailActivity.a(a).c());
        }

        protected void a(Boolean boolean1)
        {
            com.qihoo360.mobilesafe.b.d.b(b);
            q.a().a(0x7f0c0139);
            com.qihoo.security.ui.antivirus.LeakDetailActivity.b(a);
            LeakDetailActivity.a(a, null);
        }

        protected transient void a(c ac[])
        {
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Integer[])aobj);
        }

        protected void onCancelled()
        {
            super.onCancelled();
        }

        protected void onPostExecute(Object obj)
        {
            a((Boolean)obj);
        }

        protected void onPreExecute()
        {
            if (b == null)
            {
                b = new g(a);
                b.a(0x7f0c00b7);
                b.setCancelable(false);
                b.setCanceledOnTouchOutside(false);
            }
            com.qihoo360.mobilesafe.b.d.a(b);
        }

        protected void onProgressUpdate(Object aobj[])
        {
            a((c[])aobj);
        }

        private a()
        {
            a = LeakDetailActivity.this;
            super();
        }

    }


    private LocaleButton A;
    private LocaleButton B;
    private LocaleTextView C;
    private LocaleTextView D;
    private LocaleTextView E;
    private LocaleTextView F;
    private boolean G;
    private a H;
    private c y;
    private d z;

    public LeakDetailActivity()
    {
    }

    static c a(LeakDetailActivity leakdetailactivity)
    {
        return leakdetailactivity.y;
    }

    static a a(LeakDetailActivity leakdetailactivity, a a1)
    {
        leakdetailactivity.H = a1;
        return a1;
    }

    static void b(LeakDetailActivity leakdetailactivity)
    {
        leakdetailactivity.o();
    }

    private void o()
    {
        if (y.c())
        {
            G = true;
            A.setVisibility(8);
            B.setVisibility(0);
            return;
        } else
        {
            A.setVisibility(0);
            B.setVisibility(8);
            return;
        }
    }

    private void p()
    {
        if (y.a().equals("leak_samsung_backup"))
        {
            Utils.showPackageDetial(this, b.a);
            startService(new Intent(this, com/qihoo/security/leak/LeakTipsService));
        } else
        if (H == null)
        {
            H = new a();
            H.execute(new Integer[] {
                (Integer)null
            });
            return;
        }
    }

    protected void j()
    {
        super.j();
        if (r != null)
        {
            b(0x7f0c010a);
        }
    }

    public void onBackPressed()
    {
        if (G)
        {
            setResult(-1);
        }
        super.onBackPressed();
    }

    public void onClick(View view)
    {
        if (f.a())
        {
            return;
        }
        switch (view.getId())
        {
        default:
            return;

        case 2131427699: 
            p();
            return;

        case 2131427700: 
            onBackPressed();
            break;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        z = d.a();
        bundle = getIntent().getStringExtra("extra_leak_id");
        if (TextUtils.isEmpty(bundle))
        {
            G = true;
            onBackPressed();
            return;
        }
        y = z.a(bundle);
        if (y == null)
        {
            G = true;
            onBackPressed();
            return;
        }
        setContentView(0x7f03006d);
        ((LocaleTextView)findViewById(0x7f0b016a)).setLocalText(y.g());
        ((LocaleTextView)findViewById(0x7f0b016b)).setLocalText(y.h());
        ((ImageView)findViewById(0x7f0b0049)).setImageDrawable(y.d());
        A = (LocaleButton)findViewById(0x7f0b0173);
        A.setOnClickListener(this);
        B = (LocaleButton)findViewById(0x7f0b0174);
        B.setOnClickListener(this);
        C = (LocaleTextView)findViewById(0x7f0b016e);
        E = (LocaleTextView)findViewById(0x7f0b0170);
        D = (LocaleTextView)findViewById(0x7f0b0171);
        F = (LocaleTextView)findViewById(0x7f0b0172);
        C.setLocalText(y.i());
        E.setLocalText(y.j());
        D.setLocalText(y.k());
        F.setLocalText(y.l());
        bundle = (LocaleTextView)findViewById(0x7f0b016f);
        if (!y.a().equals("leak_samsung_backup"))
        {
            bundle.setLocalText(0x7f0c00b4);
        } else
        {
            bundle.setLocalText(0x7f0c00b5);
        }
        o();
        com.qihoo.security.support.b.c(14015);
    }

    protected void onResume()
    {
        super.onResume();
        if (y != null && y.a().equals("leak_samsung_backup") && y.c())
        {
            o();
            H = null;
        }
    }
}
