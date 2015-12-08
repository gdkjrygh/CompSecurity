// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.c;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.Process;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.microsoft.onlineid.sts.b;
import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.microsoft.onlineid.internal.c:
//            d

public final class a
{

    private static final DateFormat a = DateFormat.getDateTimeInstance(2, 2, Locale.getDefault());
    private static Context b;
    private static WeakReference c;
    private File d;
    private boolean e;
    private boolean f;

    public a()
    {
        e = false;
        f = true;
        b = null;
    }

    public a(Context context)
    {
        e = false;
        f = true;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        b = context;
        if (d == null && b != null)
        {
            d = b.getFilesDir();
        }
        return;
        context;
        com.microsoft.onlineid.internal.c.d.b("Error in init: ", context);
        return;
    }

    private static int a(String s)
    {
        return b.getResources().getIdentifier(s, "string", b.getPackageName());
    }

    private File a()
    {
        File file;
        Exception exception;
        file = null;
        exception = null;
        if (!e) goto _L2; else goto _L1
_L1:
        file = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append(File.separator).append("com.microsoft.msa.authenticator.screenshot.jpg").toString());
        boolean flag = file.exists();
        if (flag)
        {
            return file;
        } else
        {
            return null;
        }
        Exception exception1;
        exception1;
        file = exception;
        exception = exception1;
_L4:
        com.microsoft.onlineid.internal.c.d.b("Exception in getScreenshotFile:", exception);
_L2:
        return file;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(PrintWriter printwriter)
    {
        Object obj = new com.microsoft.onlineid.sts.a(b);
        if (((com.microsoft.onlineid.sts.a) (obj)).a())
        {
            for (obj = ((com.microsoft.onlineid.sts.a) (obj)).b().iterator(); ((Iterator) (obj)).hasNext(); printwriter.append("\n"))
            {
                b b1 = (b)((Iterator) (obj)).next();
                a(printwriter, "PUID", b1.b(), false);
                a(printwriter, "Username", b1.c(), false);
                a(printwriter, "GcmRegistrationID", b1.g(), false);
            }

        }
          goto _L1
_L7:
        Object obj1;
        try
        {
            printwriter.append("\n");
            if (f)
            {
                printwriter.append("-------------------- \n");
                printwriter.append("\nLogcat:\n\n");
                b(printwriter);
                printwriter.append("\n");
                printwriter.append("-------------------- \n");
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (PrintWriter printwriter)
        {
            com.microsoft.onlineid.internal.c.d.c("Exception in constructReport:", printwriter);
        }
        return;
_L1:
        printwriter.append((new Date()).toString());
        printwriter.append("\n\n");
        a(printwriter, "Package", b.getPackageName(), false);
        a(printwriter, "FilePath", d.getAbsolutePath(), false);
        try
        {
            a(printwriter, "Version", b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName, false);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        printwriter.append("\nPackage Data\n");
        a(printwriter, "OS version", android.os.Build.VERSION.RELEASE, true);
        a(printwriter, "SDK level", String.valueOf(android.os.Build.VERSION.SDK_INT), true);
        a(printwriter, "Board", Build.BOARD, true);
        a(printwriter, "Brand", Build.BRAND, true);
        a(printwriter, "Phone model", Build.MODEL, true);
        a(printwriter, "Device", Build.DEVICE, true);
        a(printwriter, "Display", Build.DISPLAY, true);
        a(printwriter, "Fingerprint", Build.FINGERPRINT, true);
        a(printwriter, "Host", Build.HOST, true);
        a(printwriter, "ID", Build.ID, true);
        a(printwriter, "Model", Build.MODEL, true);
        a(printwriter, "Product", Build.PRODUCT, true);
        a(printwriter, "Tags", Build.TAGS, true);
        a(printwriter, "Type", String.valueOf(Build.TYPE), true);
        a(printwriter, "User", String.valueOf(Build.USER), true);
        a(printwriter, "Locale", Locale.getDefault().toString(), true);
        a(printwriter, "Screen density", String.valueOf(b.getResources().getDisplayMetrics().density), true);
        b.getResources().getConfiguration().screenLayout & 0xf;
        JVM INSTR tableswitch 1 4: default 752
    //                   1 723
    //                   2 759
    //                   3 766
    //                   4 773;
           goto _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_773;
_L8:
        a(printwriter, "Screen size", ((String) (obj1)), true);
        if (b.getResources().getConfiguration().orientation == 1)
        {
            obj1 = "Portrait";
        } else
        {
            obj1 = "Landscape";
        }
        a(printwriter, "Screen orientation", ((String) (obj1)), true);
        printwriter.append("Internal Memory\n");
        a(printwriter, "Total", (new StringBuilder()).append(String.valueOf(Environment.getDataDirectory().getTotalSpace() / 1024L)).append("KB").toString(), true);
        a(printwriter, "Available", (new StringBuilder()).append(String.valueOf(Environment.getDataDirectory().getUsableSpace() / 1024L)).append("KB").toString(), true);
        printwriter.append("Native Memory\n");
        a(printwriter, "Allocated heap size", (new StringBuilder()).append(String.valueOf(Debug.getNativeHeapAllocatedSize() / 1024L)).append("KB").toString(), true);
        a(printwriter, "Free size", (new StringBuilder()).append(String.valueOf(Debug.getNativeHeapFreeSize() / 1024L)).append("KB").toString(), true);
        a(printwriter, "Heap size", (new StringBuilder()).append(String.valueOf(Debug.getNativeHeapSize() / 1024L)).append("KB").toString(), true);
          goto _L7
_L3:
        obj1 = "Small";
          goto _L8
        obj1;
        com.microsoft.onlineid.internal.c.d.b("Error in getDeviceInfo: ", ((Throwable) (obj1)));
          goto _L7
_L2:
        obj1 = "Undefined";
          goto _L8
_L4:
        obj1 = "Normal";
          goto _L8
_L5:
        obj1 = "Large";
          goto _L8
        obj1 = "Xlarge";
          goto _L8
    }

    private static void a(PrintWriter printwriter, String s, String s1, boolean flag)
    {
        String s2 = "%s : %s\n";
        if (flag)
        {
            s2 = (new StringBuilder("      ")).append("%s : %s\n").toString();
        }
        printwriter.append(String.format(Locale.US, s2, new Object[] {
            s, s1
        }));
    }

    private static void b(PrintWriter printwriter)
    {
        String s = null;
        int i = Process.myPid();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        s = (new StringBuilder()).append(Integer.toString(i)).append("):").toString();
        Object obj;
        obj = Integer.toString(5000);
        String s1 = (new StringBuilder()).append(com.microsoft.onlineid.internal.c.d.a()).append(":*").toString();
        obj = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[] {
            "logcat", "-t", obj, "-v", "time", s1, "*:S"
        }).getInputStream()));
_L3:
        String s2 = ((BufferedReader) (obj)).readLine();
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        if (!s2.contains(s)) goto _L3; else goto _L2
_L2:
        printwriter.append(s2);
        printwriter.append("\n");
          goto _L3
        printwriter;
        com.microsoft.onlineid.internal.c.d.c("Exception in collectLogCat", printwriter);
    }

    public final void a(Context context)
    {
        Object obj3;
        Intent intent;
        intent = null;
        obj3 = null;
        c = new WeakReference(context);
        if (!e)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        context = c;
        Object obj = a();
        Object obj1;
        if (obj != null && obj != null)
        {
            try
            {
                ((File) (obj)).delete();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                try
                {
                    com.microsoft.onlineid.internal.c.d.c("deleteFileNoThrow failed", ((Throwable) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    try
                    {
                        com.microsoft.onlineid.internal.c.d.b("Exception in deleteScreenshot", ((Throwable) (obj)));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        com.microsoft.onlineid.internal.c.d.c("!Error generateAndSendReportWithUserPermission:", context);
                        return;
                    }
                }
            }
        }
        context = ((Activity)context.get()).getWindow().getDecorView();
        context.setDrawingCacheEnabled(true);
        context.buildDrawingCache();
        obj1 = context.getDrawingCache();
        obj = new FileOutputStream((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append(File.separator).append("com.microsoft.msa.authenticator.screenshot.jpg").toString());
        context = ((Context) (obj));
        ((Bitmap) (obj1)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 10, ((java.io.OutputStream) (obj)));
        ((FileOutputStream) (obj)).close();
_L2:
        obj = new CharArrayWriter();
        context = new PrintWriter(((Writer) (obj)));
        a(((PrintWriter) (context)));
        context.close();
        obj1 = obj.toString();
        context.close();
        ((Writer) (obj)).close();
        context = ((Context) (obj1));
_L3:
        obj1 = b.getResources().getString(a("send_feedback_subject_tag"));
        obj3 = a.format(new Date());
        obj = c;
        obj1 = String.format(Locale.US, "[%s] %s", new Object[] {
            obj1, obj3
        });
        obj3 = a();
        intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.EMAIL", new String[] {
            "WS-MSACLIENT-AFB@microsoft.com"
        });
        intent.putExtra("android.intent.extra.SUBJECT", ((String) (obj1)));
        intent.putExtra("android.intent.extra.TEXT", (new StringBuilder()).append(context).append("\n").toString());
        intent.setType("message/rfc822");
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(((File) (obj3))));
        ((Context)((WeakReference) (obj)).get()).startActivity(intent);
        return;
        Object obj2;
        obj2;
        obj = null;
_L7:
        context = ((Context) (obj));
        com.microsoft.onlineid.internal.c.d.b("Exception in saveScreenshot:", ((Throwable) (obj2)));
        if (obj == null) goto _L2; else goto _L1
_L1:
        ((FileOutputStream) (obj)).close();
          goto _L2
        context;
        com.microsoft.onlineid.internal.c.d.b("Exception in saveScreenshot:", context);
          goto _L2
        obj;
        context = null;
_L6:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_417;
        }
        context.close();
        throw obj;
        obj2;
        context = null;
        obj = obj3;
_L5:
        com.microsoft.onlineid.internal.c.d.b("Exception in emailLogs", ((Throwable) (obj2)));
        ((PrintWriter) (obj)).close();
        context.close();
        context = "";
          goto _L3
_L4:
        try
        {
            ((PrintWriter) (obj2)).close();
            ((Writer) (obj)).close();
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        com.microsoft.onlineid.internal.c.d.b("Exception in emailLogs", context);
        return;
        context;
        obj = new android.content.DialogInterface.OnClickListener() {

            final a a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
            }

            
            {
                a = a.this;
                super();
            }
        };
        obj2 = new android.app.AlertDialog.Builder((Context)c.get());
        ((android.app.AlertDialog.Builder) (obj2)).setTitle(a("send_feedback_no_email_app_header"));
        ((android.app.AlertDialog.Builder) (obj2)).setMessage(a("send_feedback_no_email_app_body"));
        ((android.app.AlertDialog.Builder) (obj2)).setPositiveButton(a("popup_button_close"), ((android.content.DialogInterface.OnClickListener) (obj)));
        ((android.app.AlertDialog.Builder) (obj2)).show();
        com.microsoft.onlineid.internal.c.d.b("ActivityNotFoundException in sendEmail.", context);
        return;
        context;
        com.microsoft.onlineid.internal.c.d.b("Exception in sendEmail.", context);
        return;
        context;
        obj2 = intent;
          goto _L4
        obj3;
        obj2 = context;
        context = ((Context) (obj3));
          goto _L4
        obj2;
        obj3 = context;
        context = ((Context) (obj2));
        obj2 = obj;
        obj = obj3;
          goto _L4
        obj2;
        context = ((Context) (obj));
        obj = obj3;
          goto _L5
        obj2;
        Context context1 = context;
        context = ((Context) (obj));
        obj = context1;
          goto _L5
        obj;
          goto _L6
        obj2;
          goto _L7
        context;
        obj = null;
        obj2 = intent;
          goto _L4
    }

}
