// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;

public final class AlertDialogFactory
{
    public static class AlertDialogDescriptor
    {

        String message;
        Runnable posButtonHandler;
        String posButtonLabel;
        String title;

        public String getMessage()
        {
            return message;
        }

        public AlertDialogDescriptor(String s, String s1, String s2, Runnable runnable)
        {
            title = s;
            message = s1;
            posButtonLabel = s2;
            posButtonHandler = runnable;
        }
    }

    public static class TwoButtonAlertDialogDescriptor extends AlertDialogDescriptor
    {

        Runnable negButtonHandler;
        String negButtonLabel;

        public TwoButtonAlertDialogDescriptor(String s, String s1, String s2, Runnable runnable, String s3, Runnable runnable1)
        {
            super(s, s1, s2, runnable);
            negButtonLabel = s3;
            negButtonHandler = runnable1;
        }
    }


    private AlertDialogFactory()
    {
    }

    public static UpdateDialog.Builder createDialog(Context context, Handler handler, AlertDialogDescriptor alertdialogdescriptor)
    {
        if (alertdialogdescriptor instanceof TwoButtonAlertDialogDescriptor)
        {
            alertdialogdescriptor = (TwoButtonAlertDialogDescriptor)alertdialogdescriptor;
            return createDialog(context, ((TwoButtonAlertDialogDescriptor) (alertdialogdescriptor)).title, ((TwoButtonAlertDialogDescriptor) (alertdialogdescriptor)).message, handler, ((TwoButtonAlertDialogDescriptor) (alertdialogdescriptor)).posButtonLabel, ((TwoButtonAlertDialogDescriptor) (alertdialogdescriptor)).posButtonHandler, ((TwoButtonAlertDialogDescriptor) (alertdialogdescriptor)).negButtonLabel, ((TwoButtonAlertDialogDescriptor) (alertdialogdescriptor)).negButtonHandler, false);
        } else
        {
            return createOneButtonDialog(context, alertdialogdescriptor.title, alertdialogdescriptor.message, handler, alertdialogdescriptor.posButtonLabel, alertdialogdescriptor.posButtonHandler);
        }
    }

    public static UpdateDialog.Builder createDialog(Context context, String s, String s1, Handler handler, String s2, Runnable runnable, String s3, Runnable runnable1, 
            boolean flag)
    {
        UpdateDialog.Builder builder = new UpdateDialog.Builder(context);
        builder.setTitle(noNull(s));
        builder.setMessage(noNull(s1));
        if (s2 != null)
        {
            s = s2;
        } else
        {
            s = context.getString(0x7f0c0071);
        }
        if (s3 == null)
        {
            s3 = context.getString(0x7f0c0101);
        }
        if (handler != null)
        {
            builder.setPositiveButton(s, new android.content.DialogInterface.OnClickListener(runnable, handler) {

                final Handler val$handler;
                final Runnable val$positiveButtonHandler;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    if (positiveButtonHandler != null)
                    {
                        handler.post(positiveButtonHandler);
                    }
                }

            
            {
                positiveButtonHandler = runnable;
                handler = handler1;
                super();
            }
            });
            if (!flag)
            {
                builder.setNegativeButton(s3, new android.content.DialogInterface.OnClickListener(runnable1, handler) {

                    final Handler val$handler;
                    final Runnable val$negativeButtonHandler;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        if (negativeButtonHandler != null)
                        {
                            handler.post(negativeButtonHandler);
                        }
                    }

            
            {
                negativeButtonHandler = runnable;
                handler = handler1;
                super();
            }
                });
            }
        } else
        {
            builder.setPositiveButton(s, null);
            if (!flag)
            {
                builder.setNegativeButton(s3, null);
                return builder;
            }
        }
        return builder;
    }

    public static UpdateDialog.Builder createOneButtonDialog(Context context, String s, String s1, Handler handler, String s2, Runnable runnable)
    {
        return createDialog(context, s, s1, handler, s2, runnable, null, null, true);
    }

    private static String noNull(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        return s1;
    }
}
