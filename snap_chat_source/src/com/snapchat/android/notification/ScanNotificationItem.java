// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.notification;

import CI;
import CO;
import DK;
import IQ;
import Jr;
import MA;
import Mf;
import OC;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.snapchat.android.Timber;
import com.squareup.otto.Bus;
import java.io.PrintStream;
import java.net.URL;

public abstract class ScanNotificationItem
    implements CI
{
    public static final class CodeNotificationSteps extends Enum
    {

        private static final CodeNotificationSteps $VALUES[];
        public static final CodeNotificationSteps ERROR;
        public static final CodeNotificationSteps SHOW_DATA;

        public static CodeNotificationSteps valueOf(String s)
        {
            return (CodeNotificationSteps)Enum.valueOf(com/snapchat/android/notification/ScanNotificationItem$CodeNotificationSteps, s);
        }

        public static CodeNotificationSteps[] values()
        {
            return (CodeNotificationSteps[])$VALUES.clone();
        }

        static 
        {
            SHOW_DATA = new CodeNotificationSteps("SHOW_DATA", 0);
            ERROR = new CodeNotificationSteps("ERROR", 1);
            $VALUES = (new CodeNotificationSteps[] {
                SHOW_DATA, ERROR
            });
        }

        private CodeNotificationSteps(String s, int i1)
        {
            super(s, i1);
        }
    }

    public class a extends AsyncTask
    {

        private ScanNotificationItem a;

        private static transient Bitmap a(String as[])
        {
            try
            {
                as = IQ.a(new URL(as[0]));
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                System.out.println(as);
                return null;
            }
            return as;
        }

        public void a(Bitmap bitmap)
        {
            if (bitmap != null)
            {
                a.j().setImageBitmap(bitmap);
                a.j().setVisibility(0);
            }
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((String[])aobj);
        }

        public void onPostExecute(Object obj)
        {
            a((Bitmap)obj);
        }

        public a()
        {
            a = ScanNotificationItem.this;
            super();
        }
    }


    private static final String m = com/snapchat/android/notification/ScanNotificationItem.getSimpleName();
    public DK a;
    public ImageView b;
    public ProgressBar c;
    public View d;
    public Context e;
    public TextView f;
    public TextView g;
    public MA h;
    protected String i;
    public final IQ j;
    public CodeNotificationSteps k;
    public boolean l;
    private ViewGroup n;

    public ScanNotificationItem(Context context, ViewGroup viewgroup, MA ma, IQ iq)
    {
        e = context;
        n = viewgroup;
        h = ma;
        i = ma.sourceId;
        j = iq;
        if (ma.mScannableData != null)
        {
            a = ma.mScannableData;
        }
        l = false;
    }

    public String a()
    {
        return i;
    }

    protected void a(String s)
    {
        c.setVisibility(8);
        c.animate().setStartDelay(0L).setListener(null).cancel();
        g.setVisibility(8);
        f.setGravity(17);
        f.setText(s);
        s = new android.widget.LinearLayout.LayoutParams(-1, -1);
        f.setLayoutParams(s);
        f.setVisibility(0);
        i().setVisibility(0);
    }

    public void b()
    {
        Timber.c(m, "Show loading animation", new Object[0]);
        j.mMessageView = d;
        if (l)
        {
            j.a(h.duration);
        } else
        {
            IQ iq = j;
            long l1 = h.duration;
            iq.mNotificationPanel.removeAllViews();
            iq.mNotificationPanel.addView(iq.mMessageView);
            iq.b();
            iq.mNotificationPanel.setTranslationY(-iq.mNotificationHeight);
            iq.mNotificationPanel.setVisibility(0);
            iq.mNotificationPanel.animate().translationY(0.0F);
            Mf.a().a(new OC(com.snapchat.android.util.TitleBarManager.Visibility.HIDDEN, com.snapchat.android.util.TitleBarManager.LockedState.LOCKED));
            iq.mNotificationPanel.animate().setListener(new IQ._cls1(iq, l1));
            iq.mNotificationPanel.animate().start();
        }
        l();
    }

    public void c()
    {
        j.a(false);
    }

    public void d()
    {
    }

    public void e()
    {
        if (j() == null)
        {
            return;
        }
        if (a.c() != null)
        {
            c.setVisibility(0);
            (new a()).execute(new String[] {
                a.c()
            });
            return;
        } else
        {
            j().setVisibility(8);
            return;
        }
    }

    public void f()
    {
        c.setVisibility(0);
        c.animate().setStartDelay(0L).setListener(null).cancel();
        c.animate().alpha(0.0F).setStartDelay(8000L).setListener(new Jr() {

            private ScanNotificationItem a;

            public final void onAnimationEnd(Animator animator)
            {
                if (a.c == null)
                {
                    return;
                }
                if (a.c.getVisibility() == 0)
                {
                    a.a(a.e.getResources().getString(0x7f080235));
                    a.k = CodeNotificationSteps.ERROR;
                    a.c.setVisibility(8);
                }
                a.c.animate().setStartDelay(0L).setListener(null).cancel();
            }

            
            {
                a = ScanNotificationItem.this;
                super();
            }
        }).start();
    }

    public abstract void g();

    public abstract View h();

    public abstract View i();

    public abstract ImageView j();

    public final void k()
    {
        Object obj;
        g();
        if (d == null || c == null)
        {
            Timber.e(m, "View is not constructed properly", new Object[0]);
            return;
        }
        obj = i();
        if (!h.showProgressBar) goto _L2; else goto _L1
_L1:
        ((View) (obj)).setVisibility(8);
        f();
_L4:
        obj = new CO(e, n);
        obj.a = n();
        d.setClickable(true);
        d.setOnTouchListener(((android.view.View.OnTouchListener) (obj)));
        return;
_L2:
        obj = i();
        c.setVisibility(8);
        f.setSingleLine(true);
        f.setEllipsize(android.text.TextUtils.TruncateAt.END);
        e();
        if (!TextUtils.isEmpty(a.a()))
        {
            break; /* Loop/switch isn't completed */
        }
        Timber.e(m, "Scan data has empty primary text", new Object[0]);
        f.setVisibility(8);
_L5:
        d();
        ((View) (obj)).setVisibility(0);
        if (true) goto _L4; else goto _L3
_L3:
        f.setVisibility(0);
        f.setText(a.a());
        if (!TextUtils.isEmpty(a.b()))
        {
            g.setVisibility(0);
            g.setText(a.b());
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    protected void l()
    {
    }

    public final void m()
    {
        j.a(false);
    }

    public abstract CO.a n();

}
