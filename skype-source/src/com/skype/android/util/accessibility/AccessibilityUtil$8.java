// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.accessibility;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.skype.android.util.accessibility:
//            AccessibilityUtil

final class b
    implements android.view.
{

    final URLSpan a;
    final TextView b;
    final AccessibilityUtil c;

    public final void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW");
        view.setData(Uri.parse(a.getURL()));
        b.getContext().startActivity(view);
    }

    (AccessibilityUtil accessibilityutil, URLSpan urlspan, TextView textview)
    {
        c = accessibilityutil;
        a = urlspan;
        b = textview;
        super();
    }
}
