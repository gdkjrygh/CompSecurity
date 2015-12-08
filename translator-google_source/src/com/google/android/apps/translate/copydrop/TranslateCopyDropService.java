// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.copydrop;

import android.animation.ObjectAnimator;
import android.app.ActivityManager;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.content.g;
import android.support.v4.view.bt;
import android.support.v4.view.dq;
import android.support.v4.view.dz;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.translate.cards.b;
import com.google.android.apps.translate.copydrop.views.CopyView;
import com.google.android.apps.translate.copydrop.views.DismissalView;
import com.google.android.apps.translate.copydrop.views.PopoverView;
import com.google.android.apps.translate.copydrop.views.TranslationEditTextView;
import com.google.android.apps.translate.copydrop.views.a;
import com.google.android.apps.translate.e.k;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.o;
import com.google.android.apps.translate.q;
import com.google.android.apps.translate.s;
import com.google.android.apps.translate.widget.LangSpinner;
import com.google.android.apps.translate.widget.aq;
import com.google.android.apps.translate.widget.w;
import com.google.android.apps.translate.z;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.e.j;
import com.google.android.libraries.translate.languages.Language;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.translate.copydrop:
//            b, a

public class TranslateCopyDropService extends Service
    implements aq, w, j
{

    private static final String a = com/google/android/apps/translate/copydrop/TranslateCopyDropService.getSimpleName();
    private static final CharSequence b = String.valueOf(com/google/android/apps/translate/copydrop/TranslateCopyDropService.getCanonicalName()).concat("copy_drop_translated_text");
    private WindowManager c;
    private PopoverView d;
    private CopyView e;
    private ClipboardManager f;
    private DismissalView g;
    private android.view.WindowManager.LayoutParams h;
    private android.view.WindowManager.LayoutParams i;
    private android.view.WindowManager.LayoutParams j;
    private z k;
    private LayoutInflater l;
    private String m;
    private android.content.ClipboardManager.OnPrimaryClipChangedListener n;

    public TranslateCopyDropService()
    {
        m = null;
        n = new com.google.android.apps.translate.copydrop.b(this);
    }

    static android.view.WindowManager.LayoutParams a(TranslateCopyDropService translatecopydropservice)
    {
        return translatecopydropservice.j;
    }

    static void a(TranslateCopyDropService translatecopydropservice, String s1)
    {
        s1 = com.google.android.apps.translate.e.k.a(translatecopydropservice, s1, "auto", ((LangSpinner)translatecopydropservice.d.findViewById(m.spinner1)).getSelectedLanguage().getShortName());
        translatecopydropservice.k.a(s1);
    }

    static CopyView b(TranslateCopyDropService translatecopydropservice)
    {
        return translatecopydropservice.e;
    }

    static CharSequence b()
    {
        return b;
    }

    static WindowManager c(TranslateCopyDropService translatecopydropservice)
    {
        return translatecopydropservice.c;
    }

    private void c()
    {
        j.x = 0;
        j.y = getResources().getDimensionPixelSize(com.google.android.apps.translate.k.copydrop_chathead_margin_bottom);
        c.updateViewLayout(e, j);
    }

    static ClipboardManager d(TranslateCopyDropService translatecopydropservice)
    {
        return translatecopydropservice.f;
    }

    static String e(TranslateCopyDropService translatecopydropservice)
    {
        return translatecopydropservice.m;
    }

    static PopoverView f(TranslateCopyDropService translatecopydropservice)
    {
        return translatecopydropservice.d;
    }

    static android.view.WindowManager.LayoutParams g(TranslateCopyDropService translatecopydropservice)
    {
        return translatecopydropservice.i;
    }

    static void h(TranslateCopyDropService translatecopydropservice)
    {
        String s1;
        Object obj1;
        Object obj2;
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        Iterator iterator;
        ActivityManager activitymanager;
        activitymanager = (ActivityManager)translatecopydropservice.getSystemService("activity");
        runningappprocessinfo = null;
        iterator = null;
        s1 = null;
        obj1 = runningappprocessinfo;
        obj2 = iterator;
        Field field = android/app/ActivityManager$RunningAppProcessInfo.getDeclaredField("processState");
        obj1 = runningappprocessinfo;
        obj2 = iterator;
        iterator = activitymanager.getRunningAppProcesses().iterator();
_L2:
        obj1 = s1;
        runningappprocessinfo = s1;
        obj2 = s1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_145;
        }
        obj1 = s1;
        obj2 = s1;
        runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)iterator.next();
        obj1 = s1;
        obj2 = s1;
        if (runningappprocessinfo.importance > 100) goto _L2; else goto _L1
_L1:
        obj1 = s1;
        obj2 = s1;
        if (runningappprocessinfo.importanceReasonCode != 0) goto _L2; else goto _L3
_L3:
        obj1 = s1;
        obj2 = s1;
        if (field.getInt(runningappprocessinfo) != 2) goto _L2; else goto _L4
_L4:
        obj1 = s1;
        obj2 = s1;
        s1 = runningappprocessinfo.pkgList[0];
          goto _L2
        Object obj;
        obj;
        runningappprocessinfo = obj1;
_L6:
        translatecopydropservice.d.setCurrentAppIcon(android.support.v4.content.g.a(translatecopydropservice, q.product_logo_translate_launcher_color_48));
        if (runningappprocessinfo == null)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        android.graphics.drawable.Drawable drawable = translatecopydropservice.getPackageManager().getApplicationIcon(runningappprocessinfo);
        translatecopydropservice.d.setCurrentAppIcon(drawable);
        return;
        translatecopydropservice;
        return;
        drawable;
        runningappprocessinfo = obj2;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a()
    {
    }

    public final void a(int i1, Bundle bundle)
    {
        switch (i1)
        {
        default:
            (new StringBuilder(33)).append("Unhandled event type: ").append(i1);
            return;

        case 250: 
            d.setEditTextFocused();
            ((InputMethodManager)getSystemService("input_method")).toggleSoftInput(1, 0);
            bundle = g;
            bundle.setVisibility(0);
            bundle = ObjectAnimator.ofFloat(bundle, "alpha", new float[] {
                0.0F, 1.0F
            });
            bundle.setDuration(500L);
            bundle.start();
            return;

        case 251: 
            c.updateViewLayout(d, h);
            return;

        case 252: 
            c.updateViewLayout(d, i);
            bundle = d;
            bundle.a();
            bundle.setVisibility(0);
            com.google.android.libraries.translate.e.h.a(250);
            ((PopoverView) (bundle)).a.setVisibility(8);
            ((PopoverView) (bundle)).b.setVisibility(0);
            ((PopoverView) (bundle)).d.start();
            ((PopoverView) (bundle)).c.b();
            ((PopoverView) (bundle)).c.c();
            return;

        case 253: 
            bundle = bundle.getString("output");
            break;
        }
        m = bundle;
        f.setPrimaryClip(ClipData.newPlainText(b, bundle));
        c.updateViewLayout(d, h);
        g.setVisibility(8);
        e.a();
        c();
        bundle = e;
        bundle.setVisibility(0);
        bt.c(((CopyView) (bundle)).a, 0.0F);
        bt.d(((CopyView) (bundle)).a, 0.0F);
        dq dq1 = bt.l(((CopyView) (bundle)).a);
        View view = (View)dq1.a.get();
        if (view != null)
        {
            dq.b.a(dq1, view);
        }
        view = (View)dq1.a.get();
        if (view != null)
        {
            dq.b.b(dq1, view);
        }
        dq1.a(650L).b(250L).a(new OvershootInterpolator(1.2F)).a(new a(bundle)).b();
    }

    public final void a(com.google.android.libraries.translate.core.m m1, b b1, Bundle bundle, int i1)
    {
        d.setTranslatedText(m1.a(0), b1.f);
    }

    public final void a(boolean flag)
    {
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        setTheme(s.AppTheme);
        l = LayoutInflater.from(this);
        com.google.android.libraries.translate.e.h.a(this, new int[] {
            252, 250, 253, 251
        });
        c = (WindowManager)getSystemService("window");
        android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams(-1, -1, 2003, 1024, -3);
        layoutparams.gravity = 51;
        g = (DismissalView)l.inflate(o.view_dismissal, null, false);
        g.setVisibility(8);
        c.addView(g, layoutparams);
        h = new android.view.WindowManager.LayoutParams(-2, -2, 2003, 8, -3);
        h.gravity = 49;
        i = new android.view.WindowManager.LayoutParams(-2, -2, 2003, 1024, -3);
        i.gravity = 49;
        d = (PopoverView)l.inflate(o.view_translate_popover, null, false);
        c.addView(d, i);
        j = new android.view.WindowManager.LayoutParams(-2, -2, 2003, 8, -3);
        j.gravity = 81;
        e = (CopyView)l.inflate(o.view_copy_popup, null, false);
        c.addView(e, j);
        c();
        e.setOnTouchListener(new com.google.android.apps.translate.copydrop.a(this));
        f = (ClipboardManager)getSystemService("clipboard");
        f.addPrimaryClipChangedListener(n);
        k = new z(this, this, this);
    }

    public void onDestroy()
    {
        super.onDestroy();
        com.google.android.libraries.translate.e.h.a(this);
        f = (ClipboardManager)getSystemService("clipboard");
        f.removePrimaryClipChangedListener(n);
        if (d != null)
        {
            c.removeView(d);
        }
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        if (intent != null && intent.getAction() != null && intent.getAction().equals("action_stop_listening"))
        {
            ((NotificationManager)getSystemService("notification")).cancel(1001);
            stopSelf();
        }
        return super.onStartCommand(intent, i1, j1);
    }

    public void setResultInformation(Language language, com.google.android.libraries.translate.core.m m1)
    {
    }

}
