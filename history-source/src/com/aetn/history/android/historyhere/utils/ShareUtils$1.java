// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.Html;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.model.Configuration;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.model.ShareIntentListAdapter;

// Referenced classes of package com.aetn.history.android.historyhere.utils:
//            ShareUtils, Utils

static final class val.context
    implements android.content.ce.OnClickListener
{

    final ShareIntentListAdapter val$adapter;
    final Context val$context;
    final POIDetail val$detail;
    final String val$shareBody;
    final String val$shareSubject;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = HistoryHereApplication.getConfiguration();
        Object obj = (ResolveInfo)val$adapter.getItem(i);
        Utils.logger("ShareUtils", (new StringBuilder()).append("nfo.activityInfo.packageName:").append(((ResolveInfo) (obj)).activityInfo.packageName).toString());
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setClassName(((ResolveInfo) (obj)).activityInfo.packageName, ((ResolveInfo) (obj)).activityInfo.name);
        if (((ResolveInfo) (obj)).activityInfo.packageName.contains("twitter"))
        {
            Utils.logger("ShareUtils", "its twitter");
            intent.putExtra("android.intent.extra.TEXT", ((Configuration) (dialoginterface)).shareTemplates.twitter.replace("[title]", val$detail.getTitle()));
        } else
        if (((ResolveInfo) (obj)).activityInfo.packageName.contains("com.google.android.gm") || ((ResolveInfo) (obj)).activityInfo.packageName.contains("com.google.android.apps.inbox") || ((ResolveInfo) (obj)).activityInfo.packageName.contains("android.email"))
        {
            obj = ((Configuration) (dialoginterface)).shareTemplates.email.subject;
            dialoginterface = ((Configuration) (dialoginterface)).shareTemplates.email.body;
            obj = ((String) (obj)).replace("[title]", val$detail.getTitle());
            dialoginterface = dialoginterface.replace("[title]", val$detail.getTitle()).replace("[imageHTML]", "").replace("[address]", val$detail.getFormattedAddress());
            if (val$detail.getDescription() != null)
            {
                dialoginterface = dialoginterface.replace("[body]", val$detail.getDescription());
            } else
            {
                dialoginterface = dialoginterface.replace("[body]", val$detail.getShortDescription());
            }
            intent.setType("text/html");
            intent.putExtra("android.intent.extra.SUBJECT", ((String) (obj)));
            intent.putExtra("android.intent.extra.TEXT", Html.fromHtml(dialoginterface));
        } else
        if (((ResolveInfo) (obj)).activityInfo.packageName.contains("com.google.android.apps.plus"))
        {
            dialoginterface = ((Configuration) (dialoginterface)).shareTemplates.googleplus.replace("[title]", val$detail.getTitle()).replace("[imageHTML]", "").replace("[address]", val$detail.getFormattedAddress());
            if (val$detail.getDescription() != null)
            {
                dialoginterface = dialoginterface.replace("[body]", val$detail.getDescription());
            } else
            {
                dialoginterface = dialoginterface.replace("[body]", val$detail.getShortDescription());
            }
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", dialoginterface);
        } else
        {
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", val$shareSubject);
            intent.putExtra("android.intent.extra.TEXT", val$shareBody);
        }
        val$context.startActivity(intent);
    }

    stAdapter(ShareIntentListAdapter shareintentlistadapter, POIDetail poidetail, String s, String s1, Context context1)
    {
        val$adapter = shareintentlistadapter;
        val$detail = poidetail;
        val$shareSubject = s;
        val$shareBody = s1;
        val$context = context1;
        super();
    }
}
