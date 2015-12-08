// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.text.Html;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.model.Configuration;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.model.ShareIntentListAdapter;
import java.util.List;

// Referenced classes of package com.aetn.history.android.historyhere.utils:
//            Utils

public class ShareUtils
{

    private static final String TAG = "ShareUtils";

    public ShareUtils()
    {
    }

    public static void shareDetail(Context context, POIDetail poidetail)
    {
        String s = context.getResources().getString(0x7f0d006d);
        String s1 = context.getResources().getString(0x7f0d006b);
        String s2 = HistoryHereApplication.getConfiguration().shareURL;
        shareWithCustomCallbacks(context, s, String.format(s1, new Object[] {
            poidetail.getTitle(), s2
        }), poidetail);
    }

    private static void shareWithCustomCallbacks(Context context, String s, String s1, POIDetail poidetail)
    {
        Object obj = new Intent("android.intent.action.SEND");
        ((Intent) (obj)).setType("text/plain");
        Object obj1 = context.getPackageManager().queryIntentActivities(((Intent) (obj)), 0);
        obj = new android.app.AlertDialog.Builder(context);
        ((android.app.AlertDialog.Builder) (obj)).setTitle("Share with...");
        obj1 = new ShareIntentListAdapter((Activity)context, 0x7f030049, ((List) (obj1)).toArray());
        ((android.app.AlertDialog.Builder) (obj)).setAdapter(((android.widget.ListAdapter) (obj1)), new android.content.DialogInterface.OnClickListener(((ShareIntentListAdapter) (obj1)), poidetail, s, s1, context) {

            final ShareIntentListAdapter val$adapter;
            final Context val$context;
            final POIDetail val$detail;
            final String val$shareBody;
            final String val$shareSubject;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = HistoryHereApplication.getConfiguration();
                Object obj2 = (ResolveInfo)adapter.getItem(i);
                Utils.logger("ShareUtils", (new StringBuilder()).append("nfo.activityInfo.packageName:").append(((ResolveInfo) (obj2)).activityInfo.packageName).toString());
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setClassName(((ResolveInfo) (obj2)).activityInfo.packageName, ((ResolveInfo) (obj2)).activityInfo.name);
                if (((ResolveInfo) (obj2)).activityInfo.packageName.contains("twitter"))
                {
                    Utils.logger("ShareUtils", "its twitter");
                    intent.putExtra("android.intent.extra.TEXT", ((Configuration) (dialoginterface)).shareTemplates.twitter.replace("[title]", detail.getTitle()));
                } else
                if (((ResolveInfo) (obj2)).activityInfo.packageName.contains("com.google.android.gm") || ((ResolveInfo) (obj2)).activityInfo.packageName.contains("com.google.android.apps.inbox") || ((ResolveInfo) (obj2)).activityInfo.packageName.contains("android.email"))
                {
                    obj2 = ((Configuration) (dialoginterface)).shareTemplates.email.subject;
                    dialoginterface = ((Configuration) (dialoginterface)).shareTemplates.email.body;
                    obj2 = ((String) (obj2)).replace("[title]", detail.getTitle());
                    dialoginterface = dialoginterface.replace("[title]", detail.getTitle()).replace("[imageHTML]", "").replace("[address]", detail.getFormattedAddress());
                    if (detail.getDescription() != null)
                    {
                        dialoginterface = dialoginterface.replace("[body]", detail.getDescription());
                    } else
                    {
                        dialoginterface = dialoginterface.replace("[body]", detail.getShortDescription());
                    }
                    intent.setType("text/html");
                    intent.putExtra("android.intent.extra.SUBJECT", ((String) (obj2)));
                    intent.putExtra("android.intent.extra.TEXT", Html.fromHtml(dialoginterface));
                } else
                if (((ResolveInfo) (obj2)).activityInfo.packageName.contains("com.google.android.apps.plus"))
                {
                    dialoginterface = ((Configuration) (dialoginterface)).shareTemplates.googleplus.replace("[title]", detail.getTitle()).replace("[imageHTML]", "").replace("[address]", detail.getFormattedAddress());
                    if (detail.getDescription() != null)
                    {
                        dialoginterface = dialoginterface.replace("[body]", detail.getDescription());
                    } else
                    {
                        dialoginterface = dialoginterface.replace("[body]", detail.getShortDescription());
                    }
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", dialoginterface);
                } else
                {
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.SUBJECT", shareSubject);
                    intent.putExtra("android.intent.extra.TEXT", shareBody);
                }
                context.startActivity(intent);
            }

            
            {
                adapter = shareintentlistadapter;
                detail = poidetail;
                shareSubject = s;
                shareBody = s1;
                context = context1;
                super();
            }
        });
        ((android.app.AlertDialog.Builder) (obj)).create().show();
    }
}
