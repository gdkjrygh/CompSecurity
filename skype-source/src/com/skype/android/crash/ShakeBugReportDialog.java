// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.crash;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.FileUtil;
import com.skype.android.config.LoggingConfig;
import com.skype.android.util.NetworkUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.crash:
//            ClientFeedbackAreas

public class ShakeBugReportDialog
{

    private static final Logger a = Logger.getLogger("ShakeBugReportDialog");
    private SkyLib b;
    private NetworkUtil c;
    private Account d;
    private Activity e;
    private String f;
    private AnalyticsPersistentStorage g;

    public ShakeBugReportDialog(Activity activity, SkyLib skylib, Account account, AnalyticsPersistentStorage analyticspersistentstorage)
    {
        e = activity;
        b = skylib;
        d = account;
        c = new NetworkUtil(activity.getApplication());
        g = analyticspersistentstorage;
    }

    static void a(ShakeBugReportDialog shakebugreportdialog, String s, String s1, String s2, String s3, String s4, String s5, boolean flag)
    {
        List list = shakebugreportdialog.b();
        if (flag)
        {
            list.add(shakebugreportdialog.c());
        }
        StringBuilder stringbuilder1 = new StringBuilder();
        stringbuilder1.append("6.13.0.608-releaseQb rev ");
        StringBuilder stringbuilder = new StringBuilder();
        a(stringbuilder, "<b>Area:</b>");
        a(stringbuilder, s);
        a(stringbuilder, "<b>Iteration:</b>");
        a(stringbuilder, s1);
        a(stringbuilder, "<b>Description/Steps to Reproduce:</b>");
        a(stringbuilder, s3);
        a(stringbuilder, "<br />");
        if (!TextUtils.isEmpty(s4))
        {
            a(stringbuilder, "<b>Expected behavior:</b>");
            a(stringbuilder, s4);
            a(stringbuilder, "<br />");
        }
        if (!TextUtils.isEmpty(s5))
        {
            a(stringbuilder, "<b>Actual behavior:</b>");
            a(stringbuilder, s5);
            a(stringbuilder, "<br />");
        }
        a(stringbuilder, (new StringBuilder("<b>Build:</b> ")).append(stringbuilder1).toString());
        a(stringbuilder, (new StringBuilder("<b>OS Version:</b> ")).append(android.os.Build.VERSION.RELEASE).append(" (SDK: ").append(android.os.Build.VERSION.SDK_INT).append(")").toString());
        a(stringbuilder, (new StringBuilder("<b>Manufacturer:</b> ")).append(Build.MANUFACTURER).toString());
        a(stringbuilder, (new StringBuilder("<b>Device:</b> ")).append(Build.DEVICE).toString());
        a(stringbuilder, (new StringBuilder("<b>Model:</b> ")).append(Build.MODEL).toString());
        a(stringbuilder, (new StringBuilder("<b>Skype name:</b> ")).append(shakebugreportdialog.d.getSkypenameProp()).toString());
        a(stringbuilder, (new StringBuilder("<b>Sign in name:</b> ")).append(shakebugreportdialog.d.getSigninNameProp()).toString());
        a(stringbuilder, (new StringBuilder("<b>Activity:</b> ")).append(shakebugreportdialog.e.getClass().getSimpleName().replace(".class", "")).toString());
        if (shakebugreportdialog.c != null)
        {
            s1 = new StringBuilder("<b>Network:</b> ");
            if (shakebugreportdialog.c.d())
            {
                s = "Wifi";
            } else
            {
                s = "Cellular";
            }
            a(stringbuilder, s1.append(s).toString());
        }
        a(stringbuilder, (new StringBuilder("<b>Language:</b> ")).append(Locale.getDefault().getDisplayName()).toString());
        a(stringbuilder, (new StringBuilder("<b>SkyLib:</b> ")).append(shakebugreportdialog.b.getDebugInfo()).toString());
        a(stringbuilder, (new StringBuilder("<b>InstallID:</b>")).append(shakebugreportdialog.g.b()).toString());
        s1 = new ArrayList();
        for (s = list.iterator(); s.hasNext(); s1.add(Uri.fromFile((File)s.next()))) { }
        s3 = new Intent("android.intent.action.SEND_MULTIPLE");
        s3.setType("text/html");
        s3.putExtra("android.intent.extra.EMAIL", new String[] {
            "skypeandroidbetabugs@microsoft.com"
        });
        s = s2;
        if ("releaseQb".contains("beta"))
        {
            s = (new StringBuilder("[Beta] ")).append(s2).toString();
        }
        s3.putExtra("android.intent.extra.SUBJECT", s);
        s3.putExtra("android.intent.extra.TEXT", Html.fromHtml(stringbuilder.toString()));
        s3.putParcelableArrayListExtra("android.intent.extra.STREAM", s1);
        shakebugreportdialog.e.startActivity(Intent.createChooser(s3, "Send bug report:"));
    }

    private static void a(StringBuilder stringbuilder, String s)
    {
        stringbuilder.append(s).append("<br />");
    }

    private List b()
    {
        ArrayList arraylist = new ArrayList();
        if (ApplicationConfig.getInstance().getLoggingConfig().saveAppLogs())
        {
            arraylist.addAll(b("skype_app"));
            arraylist.addAll(b("skylib"));
            File file = new File("/data/anr/traces.txt");
            File file1 = new File(Environment.getExternalStorageDirectory(), "traces.txt");
            try
            {
                FileUtil.copy(file, file1);
                arraylist.add(file1);
            }
            catch (IOException ioexception)
            {
                a.log(Level.FINE, "Can't attach traces.txt", ioexception);
                return arraylist;
            }
        }
        return arraylist;
    }

    private List b(String s)
    {
        ArrayList arraylist = new ArrayList();
        File file = e.getExternalCacheDir();
        if (file == null)
        {
            s = new ArrayList();
        } else
        {
            File afile[] = file.listFiles();
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                File file1 = afile[i];
                if (!file1.isFile())
                {
                    continue;
                }
                String s1 = file1.getName();
                if (s1.contains(s) && s1.contains(".log") && !s1.contains(".lck"))
                {
                    arraylist.add(file1);
                }
                if (s1.contains(".htrace"))
                {
                    arraylist.add(file1);
                }
            }

            Collections.sort(arraylist, new Comparator() {

                final ShakeBugReportDialog a;

                public final int compare(Object obj, Object obj1)
                {
                    obj = (File)obj;
                    obj1 = (File)obj1;
                    long l = ((File) (obj)).lastModified();
                    long l1 = ((File) (obj1)).lastModified();
                    if (l < l1)
                    {
                        return -1;
                    }
                    return l != l1 ? 1 : 0;
                }

            
            {
                a = ShakeBugReportDialog.this;
                super();
            }
            });
            s = arraylist;
            if (arraylist.size() > 2)
            {
                return arraylist.subList(0, 2);
            }
        }
        return s;
    }

    private File c()
    {
        Object obj;
        Object obj1;
        Bitmap bitmap;
        TypedArray typedarray;
        Object obj3;
        obj = e.getWindow().getDecorView().getRootView();
        ((View) (obj)).setDrawingCacheEnabled(true);
        bitmap = Bitmap.createBitmap(((View) (obj)).getDrawingCache());
        ((View) (obj)).setDrawingCacheEnabled(false);
        obj1 = new Canvas(bitmap);
        typedarray = e.getTheme().obtainStyledAttributes(new int[] {
            0x1010054
        });
        e.getResources().getDrawable(typedarray.getResourceId(0, 0)).draw(((Canvas) (obj1)));
        ((View) (obj)).draw(((Canvas) (obj1)));
        obj3 = new StringBuilder();
        ((StringBuilder) (obj3)).append("screenshot_");
        ((StringBuilder) (obj3)).append((new SimpleDateFormat("yyyyMMdd-hhmmss", Locale.getDefault())).format(new Date()));
        ((StringBuilder) (obj3)).append(".jpg");
        obj1 = null;
        typedarray = null;
        obj = obj1;
        obj3 = new File(e.getExternalCacheDir(), ((StringBuilder) (obj3)).toString());
        obj = obj1;
        obj1 = new FileOutputStream(((File) (obj3)));
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, ((java.io.OutputStream) (obj1)));
        FileUtil.flushStream(((java.io.Flushable) (obj1)));
        FileUtil.closeStream(((java.io.Closeable) (obj1)));
        return ((File) (obj3));
        Object obj2;
        obj2;
        obj1 = typedarray;
_L4:
        obj = obj1;
        ((IOException) (obj2)).printStackTrace();
        FileUtil.closeStream(((java.io.Closeable) (obj1)));
        return null;
        obj1;
_L2:
        FileUtil.closeStream(((java.io.Closeable) (obj)));
        throw obj1;
        obj2;
        obj = obj1;
        obj1 = obj2;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a()
    {
        Object obj1 = e.getLayoutInflater().inflate(0x7f030026, null);
        Spinner spinner = (Spinner)((View) (obj1)).findViewById(0x7f100234);
        ClientFeedbackAreas clientfeedbackareas = new ClientFeedbackAreas();
        String as[] = clientfeedbackareas.a();
        Object obj = new ArrayAdapter(e, 0x7f030022, as);
        ((ArrayAdapter) (obj)).setDropDownViewResource(0x7f030022);
        spinner.setAdapter(((android.widget.SpinnerAdapter) (obj)));
        obj = (EditText)((View) (obj1)).findViewById(0x7f100235);
        EditText edittext = (EditText)((View) (obj1)).findViewById(0x7f100236);
        EditText edittext1 = (EditText)((View) (obj1)).findViewById(0x7f100237);
        EditText edittext2 = (EditText)((View) (obj1)).findViewById(0x7f100238);
        CheckBox checkbox = (CheckBox)((View) (obj1)).findViewById(0x7f100239);
        if (!TextUtils.isEmpty(f))
        {
            ((EditText) (obj)).setText(f);
            edittext.requestFocus();
        }
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(e);
        builder.setInverseBackgroundForced(true);
        builder.setTitle("Create a bug report");
        builder.setView(((View) (obj1)));
        builder.setPositiveButton("Send Report", new android.content.DialogInterface.OnClickListener(spinner, clientfeedbackareas, ((EditText) (obj)), edittext, edittext1, edittext2, checkbox) {

            final Spinner a;
            final ClientFeedbackAreas b;
            final EditText c;
            final EditText d;
            final EditText e;
            final EditText f;
            final CheckBox g;
            final ShakeBugReportDialog h;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = a.getSelectedItem().toString();
                String s = b.a(dialoginterface);
                String s1 = c.getText().toString();
                String s2 = d.getText().toString();
                String s3 = e.getText().toString();
                String s4 = f.getText().toString();
                ShakeBugReportDialog.a(h, dialoginterface, s, s1, s2, s3, s4, g.isChecked());
            }

            
            {
                h = ShakeBugReportDialog.this;
                a = spinner;
                b = clientfeedbackareas;
                c = edittext;
                d = edittext1;
                e = edittext2;
                f = edittext3;
                g = checkbox;
                super();
            }
        });
        builder.setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener() {

            final ShakeBugReportDialog a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                a = ShakeBugReportDialog.this;
                super();
            }
        });
        obj1 = builder.create();
        ((AlertDialog) (obj1)).show();
        obj1 = ((AlertDialog) (obj1)).getButton(-1);
        ((Button) (obj1)).setEnabled(false);
        obj1 = new TextWatcher(((EditText) (obj)), edittext, ((Button) (obj1))) {

            final EditText a;
            final EditText b;
            final Button c;
            final ShakeBugReportDialog d;

            public final void afterTextChanged(Editable editable)
            {
                boolean flag1 = false;
                boolean flag = flag1;
                if (a.getText().toString().length() > 5)
                {
                    flag = flag1;
                    if (b.getText().toString().length() > 5)
                    {
                        flag = true;
                    }
                }
                c.setEnabled(flag);
            }

            public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            
            {
                d = ShakeBugReportDialog.this;
                a = edittext;
                b = edittext1;
                c = button;
                super();
            }
        };
        ((EditText) (obj)).addTextChangedListener(((TextWatcher) (obj1)));
        edittext.addTextChangedListener(((TextWatcher) (obj1)));
    }

    public final void a(String s)
    {
        f = s;
    }

}
