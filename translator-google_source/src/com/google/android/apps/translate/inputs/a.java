// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.translate.m;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.e.j;
import com.google.android.libraries.translate.e.p;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;
import com.google.android.libraries.translate.tts.MyTts;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            VoiceInputPopup, Camera2InputPopup

public abstract class a extends Dialog
    implements android.content.DialogInterface.OnDismissListener, j
{

    private static WeakReference f;
    public Language a;
    public Language b;
    public final Handler c;
    public String d;
    public Activity e;
    private CharSequence g;

    public a(Context context, Language language, Language language1, String s, int i)
    {
        super(context, i);
        e = null;
        d = s;
        a = language;
        b = language1;
        setOnDismissListener(this);
        h.a(this, new int[] {
            9
        });
        c = new Handler();
        ((MyTts)Singleton.b.b()).b();
        com/google/android/apps/translate/inputs/a;
        JVM INSTR monitorenter ;
        if (f == null) goto _L2; else goto _L1
_L1:
        language = (a)f.get();
        if (language == null) goto _L2; else goto _L3
_L3:
        if (!language.isShowing()) goto _L2; else goto _L4
_L4:
        if (!(language instanceof VoiceInputPopup)) goto _L6; else goto _L5
_L5:
        context = "VoiceInput";
_L8:
        p.a(language, context);
_L2:
        f = new WeakReference(this);
        com/google/android/apps/translate/inputs/a;
        JVM INSTR monitorexit ;
        return;
_L6:
        if (language instanceof Camera2InputPopup)
        {
            context = "CameraInput";
        } else
        {
            context = "KeyboardInput";
        }
        if (true) goto _L8; else goto _L7
_L7:
        context;
        com/google/android/apps/translate/inputs/a;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static transient void a(android.view.View.OnClickListener onclicklistener, View aview[])
    {
        int i = 0;
        int l;
        boolean flag;
        if (onclicklistener != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        for (l = aview.length; i < l; i++)
        {
            View view = aview[i];
            view.setOnClickListener(onclicklistener);
            view.setClickable(flag);
        }

    }

    protected final int a(View view)
    {
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        int i = ai[1];
        getOwnerActivity().findViewById(m.main_content).getLocationOnScreen(ai);
        return i - ai[1];
    }

    public void a(int i, Bundle bundle)
    {
        c();
    }

    public void a(Activity activity)
    {
        e = activity;
        show();
    }

    protected void a(Bundle bundle)
    {
    }

    public final transient void a(android.view.View.OnClickListener onclicklistener, int ai[])
    {
        for (int i = 0; i < 11; i++)
        {
            View view = findViewById(ai[i]);
            view.setClickable(true);
            view.setOnClickListener(onclicklistener);
        }

    }

    protected final void a(Event event)
    {
        Singleton.b().a(event, a.getShortName(), b.getShortName());
    }

    protected final void a(Runnable runnable)
    {
        c.post(runnable);
    }

    protected final void a(String s)
    {
        a(s, a, b);
    }

    protected final void a(String s, Language language, Language language1)
    {
        s = com.google.android.apps.translate.e.k.a(s, language, language1, d);
        s.putBoolean("animate", false);
        if (e != null || !language.equals(a) || !language1.equals(b))
        {
            s.putBoolean("update_lang", true);
        }
        a(((Bundle) (s)));
        h.b(3, s);
    }

    public abstract void b(String s);

    public void c()
    {
        dismiss();
    }

    public abstract void d();

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        if (g != null)
        {
            accessibilityevent.getText().add(g);
            return true;
        } else
        {
            return super.dispatchPopulateAccessibilityEvent(accessibilityevent);
        }
    }

    public void onBackPressed()
    {
        if (e != null)
        {
            e.finish();
            c();
            return;
        } else
        {
            d();
            return;
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        h.a(this);
    }

    public void setTitle(CharSequence charsequence)
    {
        super.setTitle(charsequence);
        g = charsequence;
    }
}
