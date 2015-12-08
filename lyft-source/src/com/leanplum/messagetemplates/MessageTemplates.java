// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.leanplum.ActionArgs;
import com.leanplum.Leanplum;

// Referenced classes of package com.leanplum.messagetemplates:
//            u, b, n, CenterPopup, 
//            Interstitial, WebInterstitial

public class MessageTemplates
{

    private static Boolean a = Boolean.valueOf(false);

    public MessageTemplates()
    {
    }

    static String a(Context context)
    {
        int i = context.getApplicationInfo().labelRes;
        if (i == 0)
        {
            return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        } else
        {
            return context.getString(i);
        }
    }

    public static void register(Context context)
    {
        com/leanplum/messagetemplates/MessageTemplates;
        JVM INSTR monitorenter ;
        boolean flag = a.booleanValue();
        if (!flag) goto _L2; else goto _L1
_L1:
        com/leanplum/messagetemplates/MessageTemplates;
        JVM INSTR monitorexit ;
        return;
_L2:
        a = Boolean.valueOf(true);
        Leanplum.defineAction("Open URL", Leanplum.ACTION_KIND_ACTION, (new ActionArgs()).with("URL", "http://www.example.com"), new u());
        Leanplum.defineAction("Alert", Leanplum.ACTION_KIND_MESSAGE | Leanplum.ACTION_KIND_ACTION, (new ActionArgs()).with("Title", a(context)).with("Message", "Alert message goes here.").with("Dismiss text", "OK").withAction("Dismiss action", null), new b());
        Leanplum.defineAction("Confirm", Leanplum.ACTION_KIND_MESSAGE | Leanplum.ACTION_KIND_ACTION, (new ActionArgs()).with("Title", a(context)).with("Message", "Confirmation message goes here.").with("Accept text", "Yes").with("Cancel text", "No").withAction("Accept action", null).withAction("Cancel action", null), new n());
        CenterPopup.register(context);
        Interstitial.register(context);
        WebInterstitial.register(context);
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

}
