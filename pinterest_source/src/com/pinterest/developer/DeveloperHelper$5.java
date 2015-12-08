// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.developer;

import android.view.View;
import android.widget.EditText;

final class a
    implements android.view.er
{

    final EditText a;

    public final void onClick(View view)
    {
        a.setText("https://api.pinterest.com/v3/%s");
    }

    (EditText edittext)
    {
        a = edittext;
        super();
    }
}
