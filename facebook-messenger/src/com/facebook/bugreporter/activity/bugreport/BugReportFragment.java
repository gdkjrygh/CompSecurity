// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.bugreport;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.base.fragment.FbFragment;
import com.facebook.base.fragment.b;
import com.facebook.base.fragment.c;
import com.facebook.base.j;
import com.facebook.bugreporter.BugReport;
import com.facebook.bugreporter.ConstBugReporterConfig;
import com.facebook.bugreporter.f;
import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.common.executors.ForUiThread;
import com.facebook.common.f.e;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.ui.i.a;
import com.facebook.ui.i.g;
import com.facebook.widget.images.UrlImage;
import com.facebook.widget.text.CustomUrlLikeSpan;
import com.facebook.widget.titlebar.d;
import com.google.common.a.es;
import com.google.common.d.a.i;
import com.google.common.d.a.u;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.bugreporter.activity.bugreport:
//            d, e, f, a, 
//            b, c

public class BugReportFragment extends FbFragment
    implements b
{

    private static final Class a = com/facebook/bugreporter/activity/bugreport/BugReportFragment;
    private com.facebook.bugreporter.b Z;
    private c aa;
    private com.facebook.widget.titlebar.a ab;
    private EditText ac;
    private View ad;
    private UrlImage ae;
    private View af;
    private TextView ag;
    private TextView ah;
    private boolean ai;
    private boolean aj;
    private ConstBugReporterConfig ak;
    private com.facebook.config.b.a b;
    private f c;
    private u d;
    private Executor e;
    private com.facebook.common.l.a f;
    private com.facebook.common.n.a g;
    private j h;
    private g i;

    public BugReportFragment()
    {
    }

    private void a()
    {
        Uri uri = Z.d();
        com.google.common.d.a.i.a(d.c(new com.facebook.bugreporter.activity.bugreport.d(this, uri)), new com.facebook.bugreporter.activity.bugreport.e(this), e);
        Z.d();
    }

    static void a(BugReportFragment bugreportfragment)
    {
        bugreportfragment.b();
    }

    private void b()
    {
        ai = true;
        ad.setVisibility(8);
    }

    static void b(BugReportFragment bugreportfragment)
    {
        bugreportfragment.c();
    }

    static com.facebook.common.n.a c(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.g;
    }

    private void c()
    {
        Object obj = ac.getText().toString();
        if (((String) (obj)).length() == 0)
        {
            i.a(new a(o.bug_report_please_enter_text));
            return;
        }
        Z.a(((String) (obj)));
        if (ai)
        {
            Z.c(null);
        }
        File file;
        long l;
        try
        {
            file = new File(new URI(Z.a().toString()));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.facebook.debug.log.b.e(a, "Cannot resolve bug report directory.");
            return;
        }
        if (!file.exists())
        {
            file.mkdirs();
        }
        try
        {
            file = new File(file, "description.txt");
            com.facebook.common.f.e.a(((String) (obj)).getBytes(), file);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.facebook.debug.log.b.d(a, "Cannot save description");
        }
        l = b.b();
        if (l >= 0L)
        {
            obj = String.valueOf(l);
        } else
        {
            obj = "";
        }
        Z.d(f.a);
        Z.e(((String) (obj)));
        if (h == j.PROD)
        {
            Z.f(null);
            Z.g(null);
        } else
        {
            Z.f(f.d);
            Z.g(f.b);
        }
        d.execute(new com.facebook.bugreporter.activity.bugreport.f(this));
        aa.a(this, null);
        aj = true;
    }

    static TextView d(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.ag;
    }

    static com.facebook.bugreporter.b e(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.Z;
    }

    static ConstBugReporterConfig f(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.ak;
    }

    static f g(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.c;
    }

    public void A()
    {
        super.A();
        ac.requestFocus();
        com.facebook.ui.e.a.a(n(), ac);
    }

    public void B()
    {
        super.B();
        com.facebook.ui.e.a.a(l());
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(k.bug_reporter_fragment, viewgroup, false);
    }

    public void a(c c1)
    {
        aa = c1;
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        Object obj = t.a(n());
        b = (com.facebook.config.b.a)((t) (obj)).a(com/facebook/config/b/a);
        c = (f)((t) (obj)).a(com/facebook/bugreporter/f);
        d = (u)((t) (obj)).a(com/google/common/d/a/u, com/facebook/common/executors/DefaultExecutorService);
        e = (Executor)((t) (obj)).a(java/util/concurrent/Executor, com/facebook/common/executors/ForUiThread);
        f = (com.facebook.common.l.a)((t) (obj)).a(com/facebook/common/l/a);
        g = (com.facebook.common.n.a)((t) (obj)).a(com/facebook/common/n/a);
        h = (j)((t) (obj)).a(com/facebook/base/j);
        i = (g)((t) (obj)).a(com/facebook/ui/i/g);
        if (bundle != null)
        {
            obj = (BugReport)bundle.getParcelable("report");
        } else
        {
            obj = (BugReport)k().getParcelable("report");
        }
        if (obj == null)
        {
            com.facebook.debug.log.b.d(a, "Missing bug report in intent");
            aa.a(this, null);
            aj = true;
            return;
        }
        ak = (ConstBugReporterConfig)k().getParcelable("reporter_config");
        com.facebook.widget.titlebar.c.a(z());
        ab = (com.facebook.widget.titlebar.a)d(com.facebook.i.titlebar);
        ab.setTitle(o.bug_report_title);
        ac = (EditText)d(com.facebook.i.text);
        ad = d(com.facebook.i.screenshot_section);
        ae = (UrlImage)d(com.facebook.i.screenshot);
        af = d(com.facebook.i.screenshot_remove);
        ag = (TextView)d(com.facebook.i.screenshot_description);
        ah = (TextView)d(com.facebook.i.bug_report_disclaimer);
        af.setOnClickListener(new com.facebook.bugreporter.activity.bugreport.a(this));
        Object obj1 = com.facebook.widget.titlebar.d.newBuilder().a(1).b(a(o.bug_report_send)).k();
        ab.setButtonSpecs(es.a(obj1));
        ab.setOnToolbarButtonListener(new com.facebook.bugreporter.activity.bugreport.b(this));
        Z = BugReport.newBuilder().a(((BugReport) (obj)));
        if (Z.b() != null)
        {
            ac.setText(Z.b());
        }
        if (bundle != null)
        {
            ai = bundle.getBoolean("screenshotRemoved");
        }
        if (Z.d() == null || ai)
        {
            ad.setVisibility(8);
        } else
        {
            ad.setVisibility(0);
            ae.setImageParams(Z.d());
            a();
        }
        bundle = new CustomUrlLikeSpan();
        bundle.a(new com.facebook.bugreporter.activity.bugreport.c(this));
        obj = o();
        obj1 = new com.facebook.common.w.o(o());
        ((com.facebook.common.w.o) (obj1)).a(((Resources) (obj)).getString(o.bug_report_disclaimer));
        ((com.facebook.common.w.o) (obj1)).a("[[link]]", ((Resources) (obj)).getString(o.bug_report_disclaimer_data_use_link), bundle, 33);
        ah.setText(((com.facebook.common.w.o) (obj1)).b());
        ah.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void e()
    {
        super.e();
        if (!aj)
        {
            Intent intent = new Intent();
            intent.putExtra("bug_desc", ac.getText().toString());
            aa.a(this, intent);
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        Z.a(ac.getText().toString());
        bundle.putParcelable("report", Z.o());
        bundle.putBoolean("screenshotRemoved", ai);
    }

}
