// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

final class bb
    implements android.content.DialogInterface.OnClickListener
{

    final Context a;
    final String b;

    bb(Context context, String s)
    {
        a = context;
        b = s;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(b)));
    }
}
