// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;

final class cf
    implements android.content.DialogInterface.OnClickListener
{

    final Context a;
    final String b;

    cf(Context context, String s)
    {
        a = context;
        b = s;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse(a.getResources().getString(0x7f090362, new Object[] {
            b
        })));
        a.startActivity(dialoginterface);
    }
}
