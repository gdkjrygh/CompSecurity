// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dynamicupsell;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import de;
import dms;
import dmz;
import gqs;
import gro;
import grr;
import grt;
import grv;
import java.io.IOException;

// Referenced classes of package com.spotify.mobile.android.ui.activity.dynamicupsell:
//            DynamicUpsellDataStoreControlService

public class DynamicUpsellLoggerService extends IntentService
{

    public DynamicUpsellLoggerService()
    {
        super("DynamicUpsellLoggerService");
    }

    public static void a(Context context, Action action, String s)
    {
        Intent intent = new Intent(context, com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellLoggerService);
        s = Uri.parse(s);
        intent.putExtra("action", action);
        intent.setData(s);
        context.startService(intent);
    }

    private void a(Action action)
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Action.values().length];
                try
                {
                    a[Action.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Action.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Action.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[action.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            DynamicUpsellDataStoreControlService.a(de.a(this), com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup.a);
            break;
        }
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if ((obj = intent.getData()) == null || !((intent = intent.getSerializableExtra("action")) instanceof Action)) goto _L1; else goto _L3
_L3:
        Action action;
        action = (Action)intent;
        intent = ((dms)dmz.a(dms)).a;
        obj = ((Uri) (obj)).toString();
        obj = (new grr()).a(((String) (obj))).a().b();
        obj = intent.a(((grq) (obj))).a();
        if (((grt) (obj)).a() == 200)
        {
            intent = "OK";
        } else
        {
            intent = "NOT OK";
        }
        try
        {
            ((grt) (obj)).e().close();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            a(action);
            return;
        }
        finally
        {
            a(action);
        }
        a(action);
        return;
        throw intent;
    }

    private class Action extends Enum
    {

        public static final Action a;
        public static final Action b;
        public static final Action c;
        private static final Action d[];

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellLoggerService$Action, s);
        }

        public static Action[] values()
        {
            return (Action[])d.clone();
        }

        static 
        {
            a = new Action("TRACK_IMPRESSION", 0);
            b = new Action("TRACK_ACTION_CLICK", 1);
            c = new Action("EXECUTE_CALLBACK", 2);
            d = (new Action[] {
                a, b, c
            });
        }

        private Action(String s, int i)
        {
            super(s, i);
        }
    }

}
