// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.jcp.JCP;
import com.jcp.productentity.Links;
import java.util.List;

// Referenced classes of package com.jcp.util:
//            af, l, o, r, 
//            s, q, m, n, 
//            p

public final class k
{

    public static void a(Context context)
    {
        if (context == null)
        {
            return;
        }
        if (JCP.s().c())
        {
            Toast.makeText(context, context.getString(0x7f07011b), 0).show();
            return;
        } else
        {
            Toast.makeText(context, context.getString(0x7f07011c), 0).show();
            return;
        }
    }

    public static void a(Context context, int i, int j)
    {
        if (context == null)
        {
            return;
        } else
        {
            context = new android.app.AlertDialog.Builder(context);
            context.setTitle(i);
            context.setMessage(j);
            context.setPositiveButton(0x7f070049, new l());
            context.show();
            return;
        }
    }

    public static void a(Context context, String s1, String s2)
    {
        if (context == null)
        {
            return;
        } else
        {
            context = new android.app.AlertDialog.Builder(context);
            context.setTitle(s1);
            context.setMessage(s2);
            context.setPositiveButton(0x7f070049, new o());
            context.show();
            return;
        }
    }

    public static void a(Context context, List list)
    {
        while (context == null || list == null || list.size() <= 0) 
        {
            return;
        }
        list = (Links)list.get(0);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", list.getTitle());
        intent.putExtra("android.intent.extra.TEXT", list.getHref());
        context.startActivity(Intent.createChooser(intent, context.getResources().getString(0x7f0703cb)));
    }

    public static void a(String s1, Activity activity)
    {
        if (activity == null)
        {
            return;
        } else
        {
            Dialog dialog = new Dialog(activity);
            dialog.requestWindowFeature(1);
            dialog.setContentView(0x7f030058);
            ((TextView)dialog.findViewById(0x7f0e0229)).setText(s1);
            Button button = (Button)dialog.findViewById(0x7f0e0230);
            Button button1 = (Button)dialog.findViewById(0x7f0e022e);
            button.setOnClickListener(new r(activity, s1, dialog));
            button1.setOnClickListener(new s(dialog));
            dialog.show();
            return;
        }
    }

    public static void a(String s1, String s2, Context context)
    {
        context = (new android.app.AlertDialog.Builder(context)).create();
        context.setTitle(s1);
        context.setCancelable(false);
        context.setMessage(s2);
        context.setButton(-1, "Ok", new q(context));
        context.show();
    }

    public static void b(Context context)
    {
        Toast.makeText(context, context.getString(0x7f07011d), 0).show();
    }

    public static void b(Context context, String s1, String s2)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setMessage(s1);
        builder.setPositiveButton(0x7f070049, new m(s2, context));
        builder.setNegativeButton(0x7f070041, new n());
        builder.create().show();
    }

    public static void c(Context context)
    {
        if (context == null)
        {
            return;
        } else
        {
            context = new android.app.AlertDialog.Builder(context);
            context.setTitle(0x7f070270);
            context.setMessage(0x7f07026f);
            context.setPositiveButton(0x7f070049, new p());
            context.show();
            return;
        }
    }
}
