// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.b;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.widget.Toast;
import com.jcp.e.l;
import com.jcp.fragments.rewards.RewardsDashboardFragment;
import com.jcp.util.DownloadResultReceiver;
import com.jcp.util.DownloadService;
import com.jcp.util.ae;
import com.jcp.util.t;
import java.lang.ref.WeakReference;

// Referenced classes of package com.jcp.b:
//            b

public final class a
{

    public static final String a = com/jcp/b/a.getName();
    public static final String b = com/jcp/fragments/rewards/RewardsDashboardFragment.getSimpleName();
    private static boolean c;
    private static boolean d;
    private static boolean e;
    private static boolean f;
    private static boolean g;
    private static boolean h;
    private static boolean i;
    private static boolean j;
    private static int k;
    private static WeakReference l = new WeakReference(null);
    private static WeakReference m = new WeakReference(null);

    private a()
    {
    }

    public static String a(Context context, String s)
    {
        if ("sale".equalsIgnoreCase(s))
        {
            return context.getResources().getString(0x7f07033f);
        }
        if ("clearance".equalsIgnoreCase(s))
        {
            return context.getResources().getString(0x7f07033d);
        } else
        {
            return "";
        }
    }

    public static void a(int i1)
    {
        k = i1;
    }

    public static void a(Context context)
    {
        DownloadResultReceiver downloadresultreceiver = new DownloadResultReceiver(new Handler());
        if (context instanceof t)
        {
            downloadresultreceiver.a((t)context);
        }
        Intent intent = new Intent(context, com/jcp/util/DownloadService);
        intent.putExtra("url", com.jcp.b.b.G());
        intent.putExtra("resultReceiver", downloadresultreceiver);
        context.startService(intent);
    }

    public static void a(Context context, int i1)
    {
        b(context, context.getResources().getString(i1));
    }

    public static void a(l l1)
    {
        if (l1 != null)
        {
            m = new WeakReference(l1);
            return;
        } else
        {
            m = null;
            return;
        }
    }

    public static void a(boolean flag)
    {
        c = flag;
    }

    public static boolean a()
    {
        return c;
    }

    public static boolean a(String s)
    {
        return "default".equalsIgnoreCase(s);
    }

    public static void b(Context context, String s)
    {
        i();
        l = new WeakReference(ProgressDialog.show(context, "", s, true));
    }

    public static void b(boolean flag)
    {
        d = flag;
    }

    public static boolean b()
    {
        return d;
    }

    public static boolean b(String s)
    {
        return "sale".equalsIgnoreCase(s) || "clearance".equalsIgnoreCase(s);
    }

    public static void c(Context context, String s)
    {
        Toast.makeText(context, s, 0).show();
    }

    public static void c(boolean flag)
    {
        e = flag;
    }

    public static boolean c()
    {
        return e;
    }

    public static boolean c(String s)
    {
        return "original".equalsIgnoreCase(s);
    }

    public static void d(boolean flag)
    {
        f = flag;
    }

    public static boolean d()
    {
        return f;
    }

    public static void e(boolean flag)
    {
        g = flag;
    }

    public static boolean e()
    {
        return g;
    }

    public static void f(boolean flag)
    {
        h = flag;
    }

    public static boolean f()
    {
        return i;
    }

    public static void g(boolean flag)
    {
        i = flag;
    }

    public static boolean g()
    {
        return j;
    }

    public static int h()
    {
        return k;
    }

    public static void h(boolean flag)
    {
        j = flag;
    }

    public static void i()
    {
        try
        {
            if (l != null && l.get() != null && ((ProgressDialog)l.get()).isShowing())
            {
                ((ProgressDialog)l.get()).dismiss();
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            ae.a(a, "Exception while dismissing progress dialog of detached fragment");
        }
    }

    public static l j()
    {
        if (m != null)
        {
            return (l)m.get();
        } else
        {
            return null;
        }
    }

    public static String k()
    {
        return "accountId,name,shortDescription,longDescription,videoStillURL,thumbnailURL,referenceId,id,length,customFields,HLSURL,videoFullLength,cuePoints";
    }

}
