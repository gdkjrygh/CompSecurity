// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.facebook.bugreporter.activity.BugReportActivity;
import com.facebook.common.e.h;
import com.facebook.debug.log.b;
import com.facebook.o;
import com.facebook.ui.i.a;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.b.c;
import com.google.common.base.Strings;
import com.google.common.d.a.i;
import com.google.common.d.a.s;
import com.google.common.d.a.u;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import org.acra.ErrorReporter;

// Referenced classes of package com.facebook.bugreporter:
//            m, c, BugReport, b, 
//            j, k, z, aa, 
//            ConstBugReporterConfig, h, i, l

public class g
{

    private static Class a = com/facebook/bugreporter/g;
    private final Resources b;
    private final u c;
    private final Executor d;
    private final m e;
    private final h f;
    private final l g;
    private final Set h;
    private final z i;
    private final com.facebook.ui.i.g j;
    private final ConnectivityManager k;

    public g(Resources resources, u u1, Executor executor, m m1, h h1, l l, Set set, 
            z z1, com.facebook.ui.i.g g1, ConnectivityManager connectivitymanager)
    {
        b = resources;
        c = u1;
        d = executor;
        e = m1;
        f = h1;
        g = l;
        h = set;
        i = z1;
        j = g1;
        k = connectivitymanager;
    }

    private Bitmap a(Activity activity)
    {
        activity = activity.getWindow().getDecorView().findViewById(0x1020002);
        Bitmap bitmap;
        try
        {
            bitmap = Bitmap.createBitmap(activity.getWidth(), activity.getHeight(), android.graphics.Bitmap.Config.RGB_565);
            activity.draw(new Canvas(bitmap));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            j.a(new a("Insufficient memory to capture a screenshot. Sorry!"));
            f.a(a.getName(), "Out of memory while creating screenshot", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            j.a(new a("Failed to capture a screenshot. Sorry!"));
            f.a(a.getName(), "Exception while creating screenshot", activity);
            return null;
        }
        return bitmap;
    }

    private Uri a(Bitmap bitmap, File file)
    {
        File file1;
        file1 = new File(file, "screenshot.png");
        file = new FileOutputStream(file1);
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, file);
        file.flush();
        bitmap = Uri.fromFile(file1);
        com.google.common.b.c.a(file, false);
        return bitmap;
        bitmap;
        try
        {
            com.google.common.b.c.a(file, false);
            throw bitmap;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            com.facebook.debug.log.b.d(a, "Exception saving screenshot", bitmap);
        }
        return null;
    }

    private Uri a(File file)
    {
        Object obj;
        obj = new File(file, "report.txt");
        file = new FileOutputStream(((File) (obj)));
        ErrorReporter.getInstance().writeReportToStream(null, file);
        file.flush();
        obj = Uri.fromFile(((File) (obj)));
        com.google.common.b.c.a(file, false);
        return ((Uri) (obj));
        Exception exception;
        exception;
        try
        {
            com.google.common.b.c.a(file, false);
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            com.facebook.debug.log.b.d(a, "Exception generating ACRA report", file);
        }
        return null;
    }

    private BugReport a(Bitmap bitmap, ev ev1, ev ev2)
    {
        File file = e.a();
        if (file == null)
        {
            throw new Exception("Could not create directory");
        }
        String s = file.getName();
        Uri uri;
        NetworkInfo networkinfo;
        ew ew1;
        if (bitmap == null)
        {
            bitmap = null;
        } else
        {
            bitmap = a(bitmap, file);
        }
        uri = a(file);
        networkinfo = k.getActiveNetworkInfo();
        ew1 = ev.k();
        ew1.b(ev1);
        for (ev1 = h.iterator(); ev1.hasNext(); ew1.b(((com.facebook.bugreporter.c)ev1.next()).b())) { }
        ev1 = ew1.b();
        return BugReport.newBuilder().a(Uri.fromFile(file)).c(bitmap).a(ev1).b(ev2).b(uri).b(s).h(networkinfo.getTypeName()).i(networkinfo.getSubtypeName()).o();
    }

    static BugReport a(g g1, Bitmap bitmap, ev ev1, ev ev2)
    {
        return g1.a(bitmap, ev1, ev2);
    }

    private s a(Context context, int l, Callable callable)
    {
        String s = null;
        Object obj1;
        PackageManager packagemanager = context.getPackageManager();
        obj1 = packagemanager.getApplicationLabel(packagemanager.getApplicationInfo(context.getPackageName(), 0));
        Object obj = s;
        if (obj1 != null)
        {
            try
            {
                obj = obj1.toString();
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
            s = context.getString(o.bug_report_title);
        }
        obj1 = b.getString(l);
        obj = new ProgressDialog(context);
        ((ProgressDialog) (obj)).setTitle(s);
        ((ProgressDialog) (obj)).setMessage(((CharSequence) (obj1)));
        ((ProgressDialog) (obj)).setIndeterminate(true);
        if (!(context instanceof Activity))
        {
            ((ProgressDialog) (obj)).getWindow().setType(2002);
        }
        ((ProgressDialog) (obj)).show();
        context = c.c(callable);
        com.google.common.d.a.i.a(context, new j(this, ((ProgressDialog) (obj))), d);
        ((ProgressDialog) (obj)).setCancelable(true);
        ((ProgressDialog) (obj)).setCanceledOnTouchOutside(false);
        ((ProgressDialog) (obj)).setOnDismissListener(new k(this, context));
        return context;
    }

    private String a()
    {
        Object obj = i.a();
        ArrayNode arraynode = new ArrayNode(JsonNodeFactory.instance);
        ObjectNode objectnode;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraynode.add(objectnode))
        {
            aa aa1 = (aa)((Iterator) (obj)).next();
            objectnode = new ObjectNode(JsonNodeFactory.instance);
            objectnode.put("Package", aa1.a);
            objectnode.put("Git_Hash", aa1.c.a);
            objectnode.put("Git_Branch", aa1.c.b);
            objectnode.put("Build_Time", aa1.c.d);
            objectnode.put("Build_Num", aa1.b);
        }

        return arraynode.toString();
    }

    private void a(Context context, BugReport bugreport)
    {
        Intent intent = new Intent(context, com/facebook/bugreporter/activity/BugReportActivity);
        intent.putExtra("report", bugreport);
        intent.putExtra("reporter_config", com.facebook.bugreporter.ConstBugReporterConfig.a(g));
        context.startActivity(intent);
    }

    static void a(g g1, Context context, BugReport bugreport)
    {
        g1.a(context, bugreport);
    }

    static void a(g g1, Throwable throwable)
    {
        g1.a(throwable);
    }

    private void a(Throwable throwable)
    {
        if (throwable instanceof CancellationException)
        {
            return;
        } else
        {
            com.facebook.debug.log.b.a("Failed to create bug report", throwable);
            return;
        }
    }

    public void a(Context context)
    {
        a(context, ((Map) (null)));
    }

    public void a(Context context, Map map)
    {
        Object obj = ev.k();
        if (context instanceof com.facebook.bugreporter.activity.b)
        {
            ((ew) (obj)).b(((com.facebook.bugreporter.activity.b)context).a());
        }
        if (context instanceof Activity)
        {
            Intent intent = ((Activity)context).getIntent();
            if (intent != null && intent.getExtras() != null)
            {
                ((ew) (obj)).b("intent_extras", intent.getExtras().toString());
            }
        }
        ((ew) (obj)).b("all_fb_apks", a());
        for (Iterator iterator = h.iterator(); iterator.hasNext(); ((ew) (obj)).b(((com.facebook.bugreporter.c)iterator.next()).a())) { }
        obj = ((ew) (obj)).b();
        Object obj1 = ev.k();
        if (map != null)
        {
            ((ew) (obj1)).b(map);
        }
        if (context instanceof com.facebook.bugreporter.activity.a)
        {
            ((ew) (obj1)).b(((com.facebook.bugreporter.activity.a)context).a());
        }
        obj1 = ((ew) (obj1)).b();
        map = null;
        if (context instanceof Activity)
        {
            map = a((Activity)context);
        }
        com.google.common.d.a.i.a(a(context, o.bug_report_progress, ((Callable) (new com.facebook.bugreporter.h(this, map, ((ev) (obj)), ((ev) (obj1)))))), new com.facebook.bugreporter.i(this, context), d);
    }

}
