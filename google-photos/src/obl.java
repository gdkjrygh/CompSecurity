// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

public final class obl
{

    private final Context a;

    public obl(Context context)
    {
        a = context;
    }

    private static Intent a(Context context, Throwable throwable, String s)
    {
        StackTraceElement astacktraceelement[] = throwable.getStackTrace();
        if (throwable.getStackTrace().length == 0)
        {
            return null;
        }
        Object obj;
        ServiceInfo aserviceinfo[];
        int i;
        int j;
        try
        {
            obj = context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 4);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("SilentFeedback", "Could not find our own package. This should never happen. Not sending crash info.", ((Throwable) (obj)));
            obj = null;
        }
        aserviceinfo = ((PackageInfo) (obj)).services;
        j = aserviceinfo.length;
        i = 0;
        obj = null;
        for (; i < j; i++)
        {
            ServiceInfo serviceinfo = aserviceinfo[i];
            if (serviceinfo.name.matches("com\\.google\\.android\\.libraries\\.social\\.silentfeedback\\.\\w*\\.SilentFeedbackService"))
            {
                obj = serviceinfo.name;
            }
        }

        if (obj == null)
        {
            Log.e("SilentFeedback", "Could not find SilentFeedbackService, not sending crash info.");
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context.getApplicationContext(), ((String) (obj))));
        intent.setPackage(context.getApplicationContext().getPackageName());
        obj = new StringBuilder();
        a(throwable, ((StringBuilder) (obj)), ((Set) (new HashSet())), null);
        StackTraceElement stacktraceelement = astacktraceelement[0];
        if (stacktraceelement.getFileName() != null)
        {
            context = stacktraceelement.getFileName();
        } else
        {
            context = "Unknown Source";
        }
        intent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.exceptionClass", throwable.getClass().getName());
        intent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.stackTrace", ((StringBuilder) (obj)).toString());
        intent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingClass", stacktraceelement.getClassName());
        intent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingFile", context);
        intent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingLine", stacktraceelement.getLineNumber());
        intent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingMethod", stacktraceelement.getMethodName());
        if (s != null)
        {
            intent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.categoryTag", s);
        }
        return intent;
    }

    private static void a(Throwable throwable, StringBuilder stringbuilder, Set set, String s)
    {
        do
        {
            if (throwable == null || set.contains(throwable))
            {
                break;
            }
            set.add(throwable);
            if (s != null)
            {
                stringbuilder.append(s);
            }
            stringbuilder.append(throwable.getClass().getName());
            stringbuilder.append(':');
            s = throwable.getStackTrace();
            int k = s.length;
            for (int i = 0; i < k; i++)
            {
                Object obj = s[i];
                stringbuilder.append("\n\tat ");
                stringbuilder.append(obj);
            }

            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                s = throwable.getSuppressed();
                int l = s.length;
                for (int j = 0; j < l; j++)
                {
                    a(s[j], stringbuilder, set, "\nSuppressed: ");
                }

            }
            if (throwable.getCause() == null)
            {
                break;
            }
            throwable = throwable.getCause();
            s = "\nCaused by: ";
        } while (true);
    }

    public final void a(Throwable throwable, String s)
    {
        Context context = a;
        throwable = a(context, throwable, s);
        if (throwable != null)
        {
            context.startService(throwable);
        }
    }
}
