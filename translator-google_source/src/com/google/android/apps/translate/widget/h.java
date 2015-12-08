// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.app.AlertDialog;
import android.content.Intent;

// Referenced classes of package com.google.android.apps.translate.widget:
//            g, HandwritingInputView, j, i

final class h
    implements Runnable
{

    final long a;
    final Intent b;
    final g c;

    h(g g1, long l, Intent intent)
    {
        c = g1;
        a = l;
        b = intent;
        super();
    }

    public final void run()
    {
        (new android.app.AlertDialog.Builder(c.a.getContext())).setTitle("Handwriting Data Download").setMessage(String.format("The handwriting folks want to download an enormous amount of %d bytes to enable on-device recognition for the language that you are currently using", new Object[] {
            Long.valueOf(a)
        })).setPositiveButton("Download now", new j(this)).setNegativeButton("I want to be in a really weird state", new i(this)).create().show();
    }
}
