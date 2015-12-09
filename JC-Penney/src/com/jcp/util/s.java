// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.app.Dialog;
import android.view.View;

final class s
    implements android.view.View.OnClickListener
{

    final Dialog a;

    s(Dialog dialog)
    {
        a = dialog;
        super();
    }

    public void onClick(View view)
    {
        a.dismiss();
    }
}
