// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.Looper;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.urbanairship.actions:
//            Action, ActionArguments, Situation, ActionResult

public class ShareAction extends Action
{

    public static final String DEFAULT_REGISTRY_NAME = "share_action";
    public static final String DEFAULT_REGISTRY_SHORT_NAME = "^s";
    private static final List ignoredPackages = new ArrayList() {

            
            {
                add("com.android.bluetooth");
                add("com.android.nfc");
                add("com.google.android.apps.docs");
            }
    };

    public ShareAction()
    {
    }

    public boolean acceptsArguments(ActionArguments actionarguments)
    {
        if (super.acceptsArguments(actionarguments))
        {
            static class _cls3
            {

                static final int $SwitchMap$com$urbanairship$actions$Situation[];

                static 
                {
                    $SwitchMap$com$urbanairship$actions$Situation = new int[Situation.values().length];
                    try
                    {
                        $SwitchMap$com$urbanairship$actions$Situation[Situation.PUSH_OPENED.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$urbanairship$actions$Situation[Situation.WEB_VIEW_INVOCATION.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$urbanairship$actions$Situation[Situation.MANUAL_INVOCATION.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$urbanairship$actions$Situation[Situation.FOREGROUND_NOTIFICATION_ACTION_BUTTON.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls3..SwitchMap.com.urbanairship.actions.Situation[actionarguments.getSituation().ordinal()])
            {
            default:
                return false;

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                break;
            }
            if (actionarguments.getValue() != null && (actionarguments.getValue() instanceof String))
            {
                return true;
            }
        }
        return false;
    }

    protected boolean excludePackage(String s)
    {
        return ignoredPackages.contains(s);
    }

    public ActionResult perform(final String chooserIntent, ActionArguments actionarguments)
    {
        Logger.info((new StringBuilder()).append("Running share action: ").append(actionarguments).toString());
        final Context context = UAirship.getApplicationContext();
        chooserIntent = (new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", (String)actionarguments.getValue());
        actionarguments = new ArrayList();
        List list = UAirship.getPackageManager().queryIntentActivities(chooserIntent, 0);
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            String s = ((ResolveInfo)list.get(i)).activityInfo.packageName;
            if (!excludePackage(s) && !arraylist.contains(s))
            {
                arraylist.add(s);
                Intent intent = new Intent(chooserIntent);
                intent.setPackage(s);
                actionarguments.add(intent);
            }
        }

        if (actionarguments.isEmpty())
        {
            chooserIntent = Intent.createChooser(chooserIntent.setPackage(""), context.getString(com.urbanairship.R.string.ua_share_dialog_title)).setFlags(0x10000000);
        } else
        {
            chooserIntent = Intent.createChooser((Intent)actionarguments.remove(0), context.getString(com.urbanairship.R.string.ua_share_dialog_title)).putExtra("android.intent.extra.INITIAL_INTENTS", (android.os.Parcelable[])actionarguments.toArray(new Intent[actionarguments.size()])).setFlags(0x10000000);
        }
        (new Handler(Looper.getMainLooper())).post(new Runnable() {

            final ShareAction this$0;
            final Intent val$chooserIntent;
            final Context val$context;

            public void run()
            {
                context.startActivity(chooserIntent);
            }

            
            {
                this$0 = ShareAction.this;
                context = context1;
                chooserIntent = intent;
                super();
            }
        });
        return ActionResult.newEmptyResult();
    }

}
