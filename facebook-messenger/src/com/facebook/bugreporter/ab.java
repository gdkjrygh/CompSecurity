// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.app.Activity;
import android.app.Dialog;
import android.content.pm.PackageManager;
import com.facebook.bugreporter.activity.BugReportActivity;
import com.facebook.debug.log.b;
import com.facebook.o;
import com.facebook.ui.i.g;
import com.google.common.base.Strings;
import javax.inject.a;

// Referenced classes of package com.facebook.bugreporter:
//            ae, ac, ad, g

public class ab
{

    private static final Class a = com/facebook/bugreporter/ab;
    private ae b;
    private final com.facebook.bugreporter.g c;
    private final a d;
    private final a e;
    private Activity f;
    private boolean g;
    private g h;
    private Dialog i;

    public ab(com.facebook.bugreporter.g g1, a a1, a a2, g g2)
    {
        i = null;
        c = g1;
        d = a1;
        e = a2;
        h = g2;
        b = new ae(this);
    }

    static Activity a(ab ab1, Activity activity)
    {
        ab1.f = activity;
        return activity;
    }

    static ae a(ab ab1)
    {
        return ab1.b;
    }

    static boolean a(ab ab1, boolean flag)
    {
        ab1.g = flag;
        return flag;
    }

    static Activity b(ab ab1)
    {
        return ab1.f;
    }

    static com.facebook.bugreporter.g c(ab ab1)
    {
        return ab1.c;
    }

    private boolean c()
    {
        return !Strings.isNullOrEmpty((String)d.b());
    }

    static a d(ab ab1)
    {
        return ab1.e;
    }

    private void d()
    {
        String s;
        android.app.AlertDialog.Builder builder;
        builder = new android.app.AlertDialog.Builder(f);
        s = null;
        CharSequence charsequence;
        PackageManager packagemanager = f.getPackageManager();
        charsequence = packagemanager.getApplicationLabel(packagemanager.getApplicationInfo(f.getPackageName(), 0));
        Object obj = s;
        if (charsequence != null)
        {
            try
            {
                obj = charsequence.toString();
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                com.facebook.debug.log.b.d(a, namenotfoundexception.getMessage());
                namenotfoundexception = s;
            }
        }
        s = ((String) (obj));
        if (Strings.isNullOrEmpty(((String) (obj))))
        {
            s = f.getString(o.bug_report_title);
        }
        builder.setTitle(s).setMessage(f.getString(o.bug_report_question)).setPositiveButton(f.getString(o.dialog_yes), new ac(this));
        builder.setNegativeButton(f.getString(o.dialog_cancel), new ad(this));
        i = builder.create();
        i.show();
        return;
    }

    private boolean e()
    {
        return i != null && i.isShowing();
    }

    static boolean e(ab ab1)
    {
        return ab1.g;
    }

    static boolean f(ab ab1)
    {
        return ab1.e();
    }

    static Dialog g(ab ab1)
    {
        return ab1.i;
    }

    public ae a()
    {
        return b;
    }

    public void b()
    {
label0:
        {
            if (f != null && !e() && !(f instanceof BugReportActivity))
            {
                if (c())
                {
                    break label0;
                }
                h.a(new com.facebook.ui.i.a(o.bug_report_please_log_in));
            }
            return;
        }
        d();
    }

}
