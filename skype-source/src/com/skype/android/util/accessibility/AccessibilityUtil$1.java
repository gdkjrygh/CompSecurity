// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.accessibility;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.skype.android.util.accessibility:
//            AccessibilityUtil

final class c
    implements android.view.
{

    final URLSpan a[];
    final Spanned b;
    final TextView c;
    final AccessibilityUtil d;

    public final void onClick(View view)
    {
        view = new CharSequence[a.length];
        for (int i = 0; i < a.length; i++)
        {
            URLSpan urlspan = a[i];
            view[i] = b.subSequence(b.getSpanStart(urlspan), b.getSpanEnd(urlspan)).toString();
        }

        android.app.OnClickListener onclicklistener = new android.app.<init>(c.getContext());
        onclicklistener.setTitle(0x7f08007d);
        onclicklistener.setItems(view, new android.content.DialogInterface.OnClickListener() {

            final AccessibilityUtil._cls1 a;

            public final void onClick(DialogInterface dialoginterface, int j)
            {
                dialoginterface = new Intent("android.intent.action.VIEW");
                dialoginterface.setData(Uri.parse(a.a[j].getURL()));
                a.c.getContext().startActivity(dialoginterface);
            }

            
            {
                a = AccessibilityUtil._cls1.this;
                super();
            }
        });
        onclicklistener.create().show();
    }

    _cls1.a(AccessibilityUtil accessibilityutil, URLSpan aurlspan[], Spanned spanned, TextView textview)
    {
        d = accessibilityutil;
        a = aurlspan;
        b = spanned;
        c = textview;
        super();
    }
}
