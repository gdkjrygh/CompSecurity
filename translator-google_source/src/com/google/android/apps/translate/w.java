// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Window;
import com.google.android.apps.translate.e.d;
import com.google.android.apps.translate.widget.ZoomTextView;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.e.j;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;

// Referenced classes of package com.google.android.apps.translate:
//            j

public class w extends Dialog
    implements android.content.DialogInterface.OnDismissListener, j
{

    boolean a;
    public Activity b;

    public w(Context context, String s, Language language, Event event)
    {
        super(context, 0x103000e);
        getWindow().addFlags(128);
        ZoomTextView zoomtextview = new ZoomTextView(context, null);
        setContentView(zoomtextview);
        zoomtextview.setTypeface(d.b(language.getShortName()));
        zoomtextview.setText(s);
        zoomtextview.a = true;
        zoomtextview.setMovementMethod(ScrollingMovementMethod.getInstance());
        zoomtextview.setTextColor(context.getResources().getColor(j.result_text));
        zoomtextview.setBackgroundColor(context.getResources().getColor(j.result_background));
        a = true;
        h.a(this, new int[] {
            9
        });
        setOnDismissListener(this);
        Singleton.b().a(event, null, null);
        Singleton.b().c("supersize_text");
    }

    public final void a(int i, Bundle bundle)
    {
        dismiss();
    }

    public void onBackPressed()
    {
        a = false;
        dismiss();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        h.a(this);
        if (b != null)
        {
            b.setRequestedOrientation(-1);
        }
    }
}
