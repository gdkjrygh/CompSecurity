// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.common:
//            z, aa, ad, ab, 
//            ac

public final class y
{

    public static void a(Context context)
    {
        try
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
            context = LayoutInflater.from(context).inflate(0x7f03009c, null);
            (new StringBuilder()).append(Build.MODEL).append(",").append(android.os.Build.VERSION.RELEASE);
            builder.setView(context);
            builder.setPositiveButton(0x7f07024f, new z());
            builder.create();
            builder.show();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    public static void a(Context context, String s)
    {
        android.app.AlertDialog.Builder builder;
        View view;
        Object obj;
        builder = new android.app.AlertDialog.Builder(context);
        view = LayoutInflater.from(context).inflate(0x7f03009c, null);
        obj = (ImageView)view.findViewById(0x7f0d0273);
        String s1;
        try
        {
            ((ImageView) (obj)).setImageResource(0x7f02041b);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            try
            {
                outofmemoryerror.printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return;
            }
        }
        obj = (TextView)view.findViewById(0x7f0d0274);
        s1 = (new StringBuilder()).append(context.getResources().getString(0x7f07004e)).append("<br><font color=\"red\">").append(s).append("</font>").toString();
        (new StringBuilder()).append(Build.MODEL).append(",").append(android.os.Build.VERSION.RELEASE).append(s);
        ((TextView) (obj)).setText(Html.fromHtml(s1));
        builder.setView(view);
        builder.setCancelable(false);
        builder.setPositiveButton(0x7f07024f, new aa(context));
        builder.create();
        builder.show();
        return;
    }

    public static void a(Context context, String s, boolean flag)
    {
        android.app.AlertDialog.Builder builder;
        View view;
        Object obj;
        builder = new android.app.AlertDialog.Builder(context);
        view = LayoutInflater.from(context).inflate(0x7f03009c, null);
        obj = (ImageView)view.findViewById(0x7f0d0273);
        try
        {
            ((ImageView) (obj)).setImageResource(0x7f02041b);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            try
            {
                outofmemoryerror.printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return;
            }
        }
        obj = (TextView)view.findViewById(0x7f0d0274);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        context = context.getResources().getString(0x7f07004f);
_L1:
        (new StringBuilder()).append(Build.MODEL).append(",").append(android.os.Build.VERSION.RELEASE).append(s);
        ((TextView) (obj)).setText(Html.fromHtml(context));
        builder.setView(view);
        builder.setPositiveButton(0x7f07024f, new ad());
        builder.create();
        builder.show();
        return;
        context = (new StringBuilder()).append(context.getResources().getString(0x7f07004e)).append("<br><font color=\"red\">").append(s).append("</font>").toString();
          goto _L1
    }

    public static void b(Context context, String s)
    {
        android.app.AlertDialog.Builder builder;
        View view;
        Object obj;
        builder = new android.app.AlertDialog.Builder(context);
        view = LayoutInflater.from(context).inflate(0x7f03009c, null);
        obj = (ImageView)view.findViewById(0x7f0d0273);
        String s1;
        try
        {
            ((ImageView) (obj)).setImageResource(0x7f02041a);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            try
            {
                outofmemoryerror.printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return;
            }
        }
        obj = (TextView)view.findViewById(0x7f0d0274);
        s1 = (new StringBuilder()).append(context.getResources().getString(0x7f07028e)).append("<br><font color=\"red\">").append(s).append("</font>").toString();
        (new StringBuilder()).append(Build.MODEL).append(",").append(android.os.Build.VERSION.RELEASE).append(s);
        ((TextView) (obj)).setText(Html.fromHtml(s1));
        builder.setView(view);
        builder.setPositiveButton(0x7f07024f, new ab(context));
        builder.setCancelable(false);
        context = builder.create();
        context.setCanceledOnTouchOutside(false);
        context.show();
        return;
    }

    public static void c(Context context, String s)
    {
        android.app.AlertDialog.Builder builder;
        View view;
        Object obj;
        builder = new android.app.AlertDialog.Builder(context);
        view = LayoutInflater.from(context).inflate(0x7f03009c, null);
        obj = (ImageView)view.findViewById(0x7f0d0273);
        String s1;
        try
        {
            ((ImageView) (obj)).setImageResource(0x7f02041a);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            try
            {
                outofmemoryerror.printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return;
            }
        }
        obj = (TextView)view.findViewById(0x7f0d0274);
        s1 = (new StringBuilder()).append(context.getResources().getString(0x7f070210)).append("<br><font color=\"red\">").append(s).append("</font>").toString();
        (new StringBuilder()).append(Build.MODEL).append(",").append(android.os.Build.VERSION.RELEASE).append(s);
        ((TextView) (obj)).setText(Html.fromHtml(s1));
        builder.setView(view);
        builder.setPositiveButton(0x7f07024f, new ac(context));
        builder.setCancelable(false);
        context = builder.create();
        context.setCanceledOnTouchOutside(false);
        context.show();
        return;
    }
}
