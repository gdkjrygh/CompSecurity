// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import Gc;
import Ic;
import OU;
import PG;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import com.snapchat.android.Timber;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class AlertDialogUtils
{
    public static final class YesNoOption extends Enum
    {

        private static final YesNoOption $VALUES[];
        public static final YesNoOption NO;
        public static final YesNoOption YES;
        public static final YesNoOption YES_DONT_ASK_AGAIN;

        public static YesNoOption valueOf(String s)
        {
            return (YesNoOption)Enum.valueOf(com/snapchat/android/util/AlertDialogUtils$YesNoOption, s);
        }

        public static YesNoOption[] values()
        {
            return (YesNoOption[])$VALUES.clone();
        }

        static 
        {
            YES = new YesNoOption("YES", 0);
            NO = new YesNoOption("NO", 1);
            YES_DONT_ASK_AGAIN = new YesNoOption("YES_DONT_ASK_AGAIN", 2);
            $VALUES = (new YesNoOption[] {
                YES, NO, YES_DONT_ASK_AGAIN
            });
        }

        private YesNoOption(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface a
    {

        public abstract void a(YesNoOption yesnooption);
    }


    private static final String TAG = "AlertDialogUtils";
    private static final int TOAST_RATE_LIMIT = 2000;
    private static Toast sLastToast = null;
    private static Map sToastRateLimiter;

    static int a(int i)
    {
        int j = i;
        if (i != 0)
        {
            j = i;
            if (i != 1)
            {
                if (ReleaseManager.e())
                {
                    throw new RuntimeException((new StringBuilder("Invalid parameter for length")).append(i).toString());
                }
                j = 0;
            }
        }
        return j;
    }

    public static AlertDialog a(Context context, android.content.DialogInterface.OnCancelListener oncancellistener, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        View view = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f0400a1, null);
        ((TextView)view.findViewById(0x7f0d0354)).setText(context.getText(0x7f08036b));
        ((TextView)view.findViewById(0x7f0d0355)).setText(context.getText(0x7f08036a));
        context = new ArrayAdapter(context, 0x7f0400a0, 0x7f0d0353, context.getResources().getStringArray(0x7f09001d));
        builder.setCustomTitle(view).setAdapter(context, onclicklistener).setOnCancelListener(oncancellistener).setNegativeButton(0x7f08007f, new android.content.DialogInterface.OnClickListener() {

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
            }

        });
        return builder.show();
    }

    static Toast a(Toast toast)
    {
        sLastToast = toast;
        return toast;
    }

    public static void a()
    {
        PG.a(new Runnable() {

            public final void run()
            {
                if (AlertDialogUtils.b() != null)
                {
                    AlertDialogUtils.b().cancel();
                }
            }

        });
    }

    public static void a(int i, Context context)
    {
        a(context.getString(i), context, 0);
    }

    public static void a(Context context)
    {
        Object obj;
        if (Ic.IS_NEXUS_4 && android.os.Build.VERSION.SDK_INT >= 18)
        {
            if (!((SharedPreferences) (obj = PreferenceManager.getDefaultSharedPreferences(context))).getBoolean("hasSeenNexus4RestartMessage", false))
            {
                obj = ((SharedPreferences) (obj)).edit();
                ((android.content.SharedPreferences.Editor) (obj)).putBoolean("hasSeenNexus4RestartMessage", true);
                ((android.content.SharedPreferences.Editor) (obj)).apply();
                obj = new android.app.AlertDialog.Builder(context);
                ((android.app.AlertDialog.Builder) (obj)).setTitle("Nexus 4 Restarts");
                ((android.app.AlertDialog.Builder) (obj)).setMessage(OU.a(context));
                ((android.app.AlertDialog.Builder) (obj)).setPositiveButton("Support", new android.content.DialogInterface.OnClickListener(context) {

                    final Context val$context;

                    public final void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse("http://productforums.google.com/forum/#!topic/mobile/gsBvuZzG_xc/discussion"));
                        dialoginterface.setFlags(32768);
                        try
                        {
                            context.startActivity(dialoginterface);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (DialogInterface dialoginterface)
                        {
                            AlertDialogUtils.a("Could not start browser", context);
                        }
                    }

            
            {
                context = context1;
                super();
            }
                });
                ((android.app.AlertDialog.Builder) (obj)).setNegativeButton(0x7f0801bc, null);
                ((android.app.AlertDialog.Builder) (obj)).create().show();
                return;
            }
        }
    }

    public static void a(Context context, String s)
    {
        context = new android.app.AlertDialog.Builder(context);
        context.setMessage(s);
        context.setCancelable(false);
        context.setNegativeButton(0x7f0801bc, new android.content.DialogInterface.OnClickListener() {

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
            }

        });
        context.show();
    }

    public static void a(Context context, String s, String s1)
    {
        s = new SpannableString(s);
        Linkify.addLinks(s, 1);
        context = (new android.app.AlertDialog.Builder(context)).setMessage(s).setCancelable(false).setNegativeButton(s1, new android.content.DialogInterface.OnClickListener() {

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
            }

        }).show();
        try
        {
            ((TextView)context.findViewById(0x102000b)).setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void a(Context context, String s, String s1, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        context = new android.app.AlertDialog.Builder(context);
        context.setMessage(s1);
        context.setTitle(s);
        context.setCancelable(false);
        context.setNegativeButton(0x7f0801bc, new android.content.DialogInterface.OnClickListener(onclicklistener) {

            final android.content.DialogInterface.OnClickListener val$onClickListener;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (onClickListener != null)
                {
                    onClickListener.onClick(dialoginterface, i);
                }
                dialoginterface.cancel();
            }

            
            {
                onClickListener = onclicklistener;
                super();
            }
        });
        context.show();
    }

    public static void a(Context context, String s, String s1, a a1)
    {
        context = new android.app.AlertDialog.Builder(context);
        context.setTitle(s).setMessage(s1).setPositiveButton(0x7f080323, new android.content.DialogInterface.OnClickListener(a1) {

            final a val$listener;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                listener.a(YesNoOption.YES);
            }

            
            {
                listener = a1;
                super();
            }
        }).setNegativeButton(0x7f080196, new android.content.DialogInterface.OnClickListener(a1) {

            final a val$listener;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                listener.a(YesNoOption.NO);
            }

            
            {
                listener = a1;
                super();
            }
        });
        context.create().show();
    }

    public static void a(Context context, String s, String s1, String s2)
    {
        context = new Gc(context);
        context.h = s1;
        context.g = s;
        context.k = false;
        context.a(s2, new Gc.a() {

            public final void a(Gc gc)
            {
                gc.dismiss();
            }

        }).b();
    }

    public static void a(Context context, String s, String s1, String s2, String s3, a a1)
    {
        context = new Gc(context);
        context.h = s1;
        context.g = s;
        context.a(s2, new Gc.a(a1) {

            final a val$listener;

            public final void a(Gc gc)
            {
                listener.a(YesNoOption.YES);
            }

            
            {
                listener = a1;
                super();
            }
        }).b(s3, new Gc.a(a1) {

            final a val$listener;

            public final void a(Gc gc)
            {
                listener.a(YesNoOption.NO);
            }

            
            {
                listener = a1;
                super();
            }
        }).b();
    }

    public static void a(Context context, String s, String s1, boolean flag, a a1)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        context = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f040113, null);
        if (context == null)
        {
            throw new NullPointerException();
        } else
        {
            CheckBox checkbox = (CheckBox)context.findViewById(0x7f0d01bf);
            checkbox.setText(0x7f080324);
            ((TextView)context.findViewById(0x7f0d01be)).setText(s1);
            builder.setTitle(s).setView(context).setPositiveButton(0x7f080323, new android.content.DialogInterface.OnClickListener(checkbox, a1) {

                final CheckBox val$dontAskAgainCheckBox;
                final a val$listener;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    if (dontAskAgainCheckBox.isChecked())
                    {
                        listener.a(YesNoOption.YES_DONT_ASK_AGAIN);
                        return;
                    } else
                    {
                        listener.a(YesNoOption.YES);
                        return;
                    }
                }

            
            {
                dontAskAgainCheckBox = checkbox;
                listener = a1;
                super();
            }
            }).setNegativeButton(0x7f080196, new android.content.DialogInterface.OnClickListener(a1) {

                final a val$listener;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    listener.a(YesNoOption.NO);
                }

            
            {
                listener = a1;
                super();
            }
            });
            builder.setCancelable(flag);
            builder.create().show();
            return;
        }
    }

    public static void a(String s, Context context)
    {
        a(s, context, 0);
    }

    public static void a(String s, Context context, int i)
    {
        PG.a(new Runnable(i, s, context) {

            final Context val$context;
            final int val$length;
            final String val$string;

            public final void run()
            {
                int j = AlertDialogUtils.a(length);
                try
                {
                    if (AlertDialogUtils.a(string))
                    {
                        AlertDialogUtils.a(Toast.makeText(context, string, j));
                        AlertDialogUtils.b().show();
                        return;
                    }
                }
                catch (IllegalStateException illegalstateexception)
                {
                    Timber.c("AlertDialogUtils", "Well, this is awkward.", new Object[0]);
                    Timber.a("AlertDialogUtils", illegalstateexception);
                    return;
                }
                Timber.d("AlertDialogUtils", (new StringBuilder("Toasting wayyy too many times ")).append(string).toString(), new Object[0]);
                return;
            }

            
            {
                length = i;
                string = s;
                context = context1;
                super();
            }
        });
    }

    static boolean a(String s)
    {
        if (sToastRateLimiter == null)
        {
            sToastRateLimiter = new ConcurrentHashMap();
        }
        if (sToastRateLimiter.containsKey(s))
        {
            return false;
        } else
        {
            CountDownTimer countdowntimer = new CountDownTimer(s) {

                final String val$stringResToToast;

                public final void onFinish()
                {
                    AlertDialogUtils.c().remove(stringResToToast);
                }

                public final void onTick(long l)
                {
                }

            
            {
                stringResToToast = s;
                super(2000L, 1L);
            }
            };
            sToastRateLimiter.put(s, countdowntimer);
            countdowntimer.start();
            return true;
        }
    }

    static Toast b()
    {
        return sLastToast;
    }

    public static void b(Context context)
    {
        SharedPreferences sharedpreferences;
        if (ReleaseManager.g() && !ReleaseManager.f())
        {
            if ((sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context)).getBoolean("firstTimeUsingBeta", true))
            {
                AlertDialog alertdialog = new AlertDialog(context) {

                };
                alertdialog.setTitle(0x7f08029b);
                alertdialog.setMessage(context.getString(0x7f080069));
                alertdialog.setCancelable(false);
                alertdialog.setButton(-1, context.getString(0x7f0801bc), new android.content.DialogInterface.OnClickListener(sharedpreferences) {

                    final SharedPreferences val$prefs;

                    public final void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface = prefs.edit();
                        dialoginterface.putBoolean("firstTimeUsingBeta", false);
                        dialoginterface.apply();
                    }

            
            {
                prefs = sharedpreferences;
                super();
            }
                });
                alertdialog.show();
                return;
            }
        }
    }

    public static void b(Context context, String s, String s1)
    {
        context = new android.app.AlertDialog.Builder(context);
        context.setMessage(s1);
        context.setTitle(s);
        context.setCancelable(false);
        context.setNegativeButton(0x7f0801bc, new android.content.DialogInterface.OnClickListener() {

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
            }

        });
        context.show();
    }

    static Map c()
    {
        return sToastRateLimiter;
    }

}
