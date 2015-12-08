// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.a;

import android.graphics.Typeface;
import android.widget.TextView;

// Referenced classes of package com.google.android.libraries.a:
//            a

final class c
    implements a
{

    final TextView a;

    c(TextView textview)
    {
        a = textview;
        super();
    }

    public final void setTypeface(Typeface typeface)
    {
        a.setTypeface(typeface);
    }
}
