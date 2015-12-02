// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.lite.BrowserActivity;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo360.mobilesafe.b.f;
import com.qihoo360.mobilesafe.b.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AboutUsActivity extends BaseActivity
    implements android.view.View.OnClickListener
{

    private LinearLayout A;
    private LinearLayout B;
    private LocaleTextView C;
    private LocaleTextView D;
    private String E;
    private final String F = "Msupport@360safe.com";
    private final String G = "http://360safe.com/mobile-security.html";
    private final String H = "http://m.facebook.com/360safecenter";
    private boolean I;
    private final Handler J = new Handler() {

        final AboutUsActivity a;

        public void handleMessage(Message message)
        {
            super.handleMessage(message);
            switch (message.what)
            {
            default:
                return;

            case 0: // '\0'
                AboutUsActivity.a(a, false);
                break;
            }
        }

            
            {
                a = AboutUsActivity.this;
                super();
            }
    };
    private LocaleTextView y;
    private LinearLayout z;

    public AboutUsActivity()
    {
        I = false;
    }

    static boolean a(AboutUsActivity aboutusactivity, boolean flag)
    {
        aboutusactivity.I = flag;
        return flag;
    }

    private void o()
    {
        Object obj;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("plain/text");
        obj = getPackageManager().queryIntentActivities(intent, 0);
        if (((List) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_260;
        }
        ArrayList arraylist = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (ResolveInfo)((Iterator) (obj)).next();
            Intent intent1 = new Intent("android.intent.action.SEND");
            intent1.setType("text/plain");
            obj1 = ((ResolveInfo) (obj1)).activityInfo;
            if (!((ActivityInfo) (obj1)).packageName.contains("bluetooth") && !((ActivityInfo) (obj1)).packageName.contains("huawei.hidisk"))
            {
                intent1.putExtra("android.intent.extra.EMAIL", new String[] {
                    "Msupport@360safe.com"
                });
                intent1.putExtra("android.intent.extra.SUBJECT", E);
                intent1.setPackage(((ActivityInfo) (obj1)).packageName);
                arraylist.add(intent1);
            }
        } while (true);
        Exception exception;
        try
        {
            if (arraylist.isEmpty())
            {
                q.a().a(0x7f0c016c, 0x7f020143);
                return;
            }
        }
        catch (Exception exception1)
        {
            return;
        }
        obj = Intent.createChooser((Intent)arraylist.remove(0), o.a(0x7f0c016b));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        q.a().a(0x7f0c016c, 0x7f020143);
        return;
        ((Intent) (obj)).putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])arraylist.toArray(new Parcelable[0]));
        try
        {
            startActivity(((Intent) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            return;
        }
        q.a().a(0x7f0c016c, 0x7f020143);
        return;
    }

    private void p()
    {
        J.sendEmptyMessageDelayed(0, 1000L);
    }

    protected void j()
    {
        super.j();
        if (r != null)
        {
            b(o.a(0x7f0c0165));
        }
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131427422 2131427429: default 52
    //                   2131427422 53
    //                   2131427423 52
    //                   2131427424 98
    //                   2131427425 52
    //                   2131427426 143
    //                   2131427427 52
    //                   2131427428 164
    //                   2131427429 206;
           goto _L1 _L2 _L1 _L3 _L1 _L4 _L1 _L5 _L6
_L1:
        return;
_L2:
        if (!I)
        {
            I = true;
            p();
            try
            {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://360safe.com/mobile-security.html")));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                q.a().a(0x7f0c0171);
            }
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (!I)
        {
            I = true;
            p();
            try
            {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://m.facebook.com/360safecenter")));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                q.a().a(0x7f0c0171);
            }
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!I)
        {
            I = true;
            p();
            o();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (!I)
        {
            I = true;
            p();
            view = new Intent(this, com/qihoo/security/lite/BrowserActivity);
            view.putExtra("webdata", 0x7f060001);
            startActivity(view);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (!I)
        {
            I = true;
            p();
            if (!f.a())
            {
                try
                {
                    view = new Intent(this, com/qihoo/security/lite/BrowserActivity);
                    view.putExtra("webdata", 0x7f060000);
                    view.putExtra("title", d.a().a(0x7f0c01d3));
                    startActivity(view);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    return;
                }
            }
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030019);
        E = (new StringBuilder()).append(o.a(0x7f0c01d2)).append(" ").append("1.0.8").append(".").append("3742").append(" ").append("Feedback").toString();
        y = (LocaleTextView)findViewById(0x7f0b005c);
        z = (LinearLayout)findViewById(0x7f0b005e);
        A = (LinearLayout)findViewById(0x7f0b0060);
        B = (LinearLayout)findViewById(0x7f0b0062);
        y.setLocalText((new StringBuilder("v")).append("1.0.8").append(".").append("3742"));
        C = (LocaleTextView)findViewById(0x7f0b0064);
        C.getPaint().setFlags(8);
        C.setOnClickListener(this);
        D = (LocaleTextView)findViewById(0x7f0b0065);
        D.getPaint().setFlags(8);
        D.setOnClickListener(this);
        z.setOnClickListener(this);
        A.setOnClickListener(this);
        B.setOnClickListener(this);
    }
}
