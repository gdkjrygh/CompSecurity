// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.jcp.adapters.ce;
import com.jcp.e.ab;
import com.jcp.e.s;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import java.util.Calendar;
import java.util.List;

// Referenced classes of package com.jcp.util:
//            bd, az, ba, be, 
//            bf, av, ay, bb, 
//            bc, aw, ax

public final class au
{

    public static PopupWindow a(Context context, List list, ViewGroup viewgroup, ab ab)
    {
        viewgroup = LayoutInflater.from(context).inflate(0x7f0300b7, viewgroup);
        viewgroup.findViewById(0x7f0e039c).setVisibility(8);
        ListView listview = (ListView)viewgroup.findViewById(0x7f0e039d);
        listview.setAdapter(new ce(context, list));
        list = new PopupWindow(context);
        list.setFocusable(true);
        list.setOutsideTouchable(true);
        list.setWidth((int)context.getResources().getDimension(0x7f0800bb));
        list.setHeight(-2);
        list.setContentView(viewgroup);
        listview.setOnItemClickListener(new bd(list, ab));
        return list;
    }

    public static String a(Context context, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        if (errormessageentitycontainer != null && errormessageentitycontainer.getErrorCode() != null)
        {
            return errormessageentitycontainer.getErrorCode();
        } else
        {
            return context.getResources().getString(0x7f070236);
        }
    }

    public static void a(Activity activity, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        a(((Context) (activity)), activity.getResources().getString(0x7f0701bb), b(activity, errormessageentitycontainer), ((android.content.DialogInterface.OnClickListener) (new az(activity))));
    }

    public static void a(Activity activity, String s, String s1)
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(activity)).create();
        alertdialog.setTitle(s);
        alertdialog.setCancelable(false);
        alertdialog.setMessage(s1);
        alertdialog.setButton(-1, activity.getResources().getString(0x7f070049), new ba(alertdialog, activity));
        if (!activity.isFinishing())
        {
            alertdialog.show();
        }
    }

    private static void a(AlertDialog alertdialog, Context context)
    {
        if (context instanceof Activity)
        {
            context = (Activity)context;
            if (context != null && !context.isFinishing())
            {
                alertdialog.show();
            }
        }
    }

    public static void a(Context context)
    {
        a(context, context.getString(0x7f0702b9), context.getString(0x7f0702b7));
    }

    public static void a(Context context, android.app.DatePickerDialog.OnDateSetListener ondatesetlistener)
    {
        (new be(context, ondatesetlistener, Calendar.getInstance().get(1), Calendar.getInstance().get(2), Calendar.getInstance().get(5))).show();
    }

    public static void a(Context context, s s)
    {
        s = new bf(s);
        context = new android.app.AlertDialog.Builder(context);
        context.setCancelable(false);
        context.setMessage(0x7f0700ab).setPositiveButton(0x7f0700a9, s).setNegativeButton(0x7f0700aa, s).show();
    }

    public static void a(Context context, String s)
    {
        if (context != null)
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
            builder.setMessage(s);
            builder.setPositiveButton(0x7f070049, new av());
            a(builder.create(), context);
        }
    }

    public static void a(Context context, String s, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        if (context != null)
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
            builder.setMessage(s);
            builder.setPositiveButton(0x7f070049, onclicklistener);
            a(builder.create(), context);
        }
    }

    public static void a(Context context, String s, android.content.DialogInterface.OnClickListener onclicklistener, android.content.DialogInterface.OnClickListener onclicklistener1)
    {
        a(context, s, context.getString(0x7f070049), context.getString(0x7f070041), onclicklistener, onclicklistener1);
    }

    public static void a(Context context, String s, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        a(context, s, b(context, errormessageentitycontainer));
    }

    public static void a(Context context, String s, String s1)
    {
        if (context != null)
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
            builder.setTitle(s);
            builder.setMessage(s1);
            builder.setPositiveButton(0x7f070049, new ay());
            a(builder.create(), context);
        }
    }

    public static void a(Context context, String s, String s1, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        (new android.app.AlertDialog.Builder(context)).setTitle(s).setMessage(s1).setPositiveButton(0x7f070049, onclicklistener).create().show();
    }

    public static void a(Context context, String s, String s1, String s2, android.content.DialogInterface.OnClickListener onclicklistener, android.content.DialogInterface.OnClickListener onclicklistener1)
    {
        a(context, s, (String)null, s1, s2, onclicklistener, onclicklistener1);
    }

    public static void a(Context context, String s, String s1, String s2, String s3, android.content.DialogInterface.OnClickListener onclicklistener, android.content.DialogInterface.OnClickListener onclicklistener1)
    {
        if (context != null)
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
            builder.setMessage(s);
            if (!TextUtils.isEmpty(s1))
            {
                builder.setTitle(s1);
            }
            if (!TextUtils.isEmpty(s2) && onclicklistener != null)
            {
                builder.setNegativeButton(s2, onclicklistener);
            }
            if (!TextUtils.isEmpty(s3) && onclicklistener1 != null)
            {
                builder.setPositiveButton(s3, onclicklistener1);
            }
            a(builder.create(), context);
        }
    }

    private static String b(Context context, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        if (errormessageentitycontainer != null && errormessageentitycontainer.getErrorMessage() != null)
        {
            return errormessageentitycontainer.getErrorMessage();
        } else
        {
            return context.getResources().getString(0x7f070236);
        }
    }

    public static void b(Context context, String s)
    {
        b(context, context.getResources().getString(0x7f070273), s);
    }

    public static void b(Context context, String s, String s1)
    {
        a(context, s, new bb(context, s1), new bc());
    }

    public static void c(Context context, String s)
    {
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setContentView(0x7f030058);
        ((TextView)dialog.findViewById(0x7f0e0229)).setText(s);
        dialog.findViewById(0x7f0e0230).setOnClickListener(new aw(context, s, dialog));
        dialog.findViewById(0x7f0e022e).setOnClickListener(new ax(dialog));
        dialog.show();
    }
}
