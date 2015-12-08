// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.text.Editable;

// Referenced classes of package com.google.android.apps.translate.widget:
//            CopyTextView

final class c extends com.google.android.apps.translate.e.c
{

    final CopyTextView a;

    c(CopyTextView copytextview)
    {
        a = copytextview;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
        a.setText(editable);
    }
}
