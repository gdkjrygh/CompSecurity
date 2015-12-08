// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64;
import android.view.View;
import com.mopub.common.AdReport;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.DateAndTime;
import com.mopub.common.util.Streams;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class AdAlertReporter
{

    private final String a;
    private final View b;
    private final Context c;
    private Intent d;
    private ArrayList e;
    private String f;
    private String g;

    public AdAlertReporter(Context context, View view, AdReport adreport)
    {
        FileOutputStream fileoutputstream = null;
        Object obj = null;
        super();
        b = view;
        c = context;
        e = new ArrayList();
        a = (new SimpleDateFormat("M/d/yy hh:mm:ss a z", Locale.US)).format(DateAndTime.now());
        d = new Intent("android.intent.action.SEND_MULTIPLE", Uri.parse("mailto:"));
        d.setType("plain/text");
        d.putExtra("android.intent.extra.EMAIL", new String[] {
            "creative-review@mopub.com"
        });
        if (b == null || b.getRootView() == null)
        {
            context = null;
        } else
        {
            view = b.getRootView();
            boolean flag = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            context = view.getDrawingCache();
            if (context == null)
            {
                context = null;
            } else
            {
                context = Bitmap.createBitmap(context);
                view.setDrawingCacheEnabled(flag);
            }
        }
        view = a(context);
        f = "";
        g = "";
        if (adreport != null)
        {
            f = adreport.toString();
            g = adreport.getResponseString();
        }
        d.putExtra("android.intent.extra.SUBJECT", (new StringBuilder("New creative violation report - ")).append(a).toString());
        a(new String[] {
            f, g, view
        });
        a("mp_adalert_parameters.txt", f);
        a("mp_adalert_markup.html", g);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        view = obj;
        adreport = fileoutputstream;
        fileoutputstream = c.openFileOutput("mp_adalert_screenshot.png", 1);
        view = fileoutputstream;
        adreport = fileoutputstream;
        context.compress(android.graphics.Bitmap.CompressFormat.PNG, 25, fileoutputstream);
        view = fileoutputstream;
        adreport = fileoutputstream;
        context = Uri.fromFile(new File((new StringBuilder()).append(c.getFilesDir()).append(File.separator).append("mp_adalert_screenshot.png").toString()));
        view = fileoutputstream;
        adreport = fileoutputstream;
        e.add(context);
        Streams.closeStream(fileoutputstream);
        return;
        context;
        adreport = view;
        MoPubLog.d((new StringBuilder("Unable to write text attachment to file: ")).append("mp_adalert_screenshot.png").toString());
        Streams.closeStream(view);
        return;
        context;
        Streams.closeStream(adreport);
        throw context;
    }

    private static String a(Bitmap bitmap)
    {
        Object obj = null;
        if (bitmap != null)
        {
            try
            {
                obj = new ByteArrayOutputStream();
                bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 25, ((java.io.OutputStream) (obj)));
                obj = Base64.encodeToString(((ByteArrayOutputStream) (obj)).toByteArray(), 0);
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap)
            {
                return null;
            }
        }
        return ((String) (obj));
    }

    private void a(String s, String s1)
    {
        FileOutputStream fileoutputstream;
        fileoutputstream = null;
        if (s1 == null)
        {
            return;
        }
        FileOutputStream fileoutputstream2 = c.openFileOutput(s, 1);
        FileOutputStream fileoutputstream1;
        fileoutputstream = fileoutputstream2;
        fileoutputstream1 = fileoutputstream2;
        fileoutputstream2.write(s1.getBytes());
        fileoutputstream = fileoutputstream2;
        fileoutputstream1 = fileoutputstream2;
        s1 = Uri.fromFile(new File((new StringBuilder()).append(c.getFilesDir()).append(File.separator).append(s).toString()));
        fileoutputstream = fileoutputstream2;
        fileoutputstream1 = fileoutputstream2;
        e.add(s1);
        Streams.closeStream(fileoutputstream2);
        return;
        s1;
        fileoutputstream1 = fileoutputstream;
        MoPubLog.d((new StringBuilder("Unable to write text attachment to file: ")).append(s).toString());
        Streams.closeStream(fileoutputstream);
        return;
        s;
        fileoutputstream1 = null;
_L2:
        Streams.closeStream(fileoutputstream1);
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private transient void a(String as[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < 3; i++)
        {
            stringbuilder.append(as[i]);
            if (i != 2)
            {
                stringbuilder.append("\n=================\n");
            }
        }

        d.putExtra("android.intent.extra.TEXT", stringbuilder.toString());
    }

    public void send()
    {
        d.putParcelableArrayListExtra("android.intent.extra.STREAM", e);
        Intent intent = Intent.createChooser(d, "Send Email...");
        intent.addFlags(0x10000000);
        c.startActivity(intent);
    }
}
