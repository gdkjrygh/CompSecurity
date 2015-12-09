// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.jcp.b.b;

// Referenced classes of package com.jcp.util:
//            ae

final class m
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final Context b;

    m(String s, Context context)
    {
        a = s;
        b = context;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        String s;
        if (!a.startsWith("http"))
        {
            if (!a.contains(b.b))
            {
                s = (new StringBuilder()).append("http://").append(b.b).append(a).toString();
            } else
            {
                s = (new StringBuilder()).append("http://").append(a).toString();
            }
        } else
        {
            s = a;
        }
        try
        {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
            b.startActivity(intent);
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            ae.a(getClass().getSimpleName(), (new StringBuilder()).append("No Activity found to handle url :").append(s).toString());
        }
        dialoginterface.dismiss();
    }
}
