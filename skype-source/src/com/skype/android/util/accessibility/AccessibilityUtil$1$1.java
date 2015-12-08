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

final class a
    implements android.content.kListener
{

    final a a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.VIEW");
        dialoginterface.setData(Uri.parse(a.a[i].getURL()));
        a.a.getContext().startActivity(dialoginterface);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/skype/android/util/accessibility/AccessibilityUtil$1

/* anonymous class */
    final class AccessibilityUtil._cls1
        implements android.view.View.OnClickListener
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

            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(c.getContext());
            builder.setTitle(0x7f08007d);
            builder.setItems(view, new AccessibilityUtil._cls1._cls1(this));
            builder.create().show();
        }

            
            {
                d = accessibilityutil;
                a = aurlspan;
                b = spanned;
                c = textview;
                super();
            }
    }

}
