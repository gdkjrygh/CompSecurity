// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.partner;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.skype.Account;
import com.skype.android.SkypeApplication;
import com.skype.android.SkypeBroadcastReceiver;
import com.skype.android.SkypeBroadcastReceiverComponent;
import com.skype.android.app.signin.SharedGlobalPreferences;
import java.net.URLDecoder;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.config.partner:
//            SharedPrefsCobrandIDRetriever, SharedPrefsTrackingIDRetriever

public class CampaignReceiver extends SkypeBroadcastReceiver
{

    private static final String CAMPAIGN = "utm_campaign";
    private static final String CONTENT = "utm_content";
    private static final String GCLID = "gclid";
    private static final String INVITE_SOURCE = "invite";
    private static final String MEDIUM = "utm_medium";
    private static final String SOURCE = "utm_source";
    private static final String TERM = "utm_term";
    public static String campaign;
    public static String content;
    public static String gclid;
    public static String medium;
    public static String source;
    public static String term;
    Provider accountProvider;
    String referrer;

    public CampaignReceiver()
    {
        referrer = "";
    }

    private static boolean isInteger(String s)
    {
        try
        {
            Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    private String parseReferrer(String s)
    {
        String as[] = referrer.split("&");
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = as[i];
            if (!s1.contains(s))
            {
                continue;
            }
            s1 = s1.substring(s1.indexOf("=") + 1).trim();
            if (isInteger(s1))
            {
                return s1;
            }
        }

        return null;
    }

    public String getCampaign()
    {
        return parseReferrer("utm_campaign");
    }

    public String getContent()
    {
        return parseReferrer("utm_content");
    }

    public String getGclid()
    {
        return parseReferrer("gclid");
    }

    public String getMedium()
    {
        return parseReferrer("utm_medium");
    }

    public String getSource()
    {
        return parseReferrer("utm_source");
    }

    public String getTerm()
    {
        return parseReferrer("utm_term");
    }

    public void onReceive(Context context, Intent intent)
    {
        getComponent(context).inject(this);
        intent = intent.getStringExtra("referrer");
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_268;
        }
        SkypeApplication skypeapplication;
        boolean flag;
        boolean flag1;
        try
        {
            source = null;
            campaign = null;
            term = null;
            content = null;
            medium = null;
            gclid = null;
            referrer = URLDecoder.decode(intent, "UTF-8");
            source = getSource();
            campaign = getCampaign();
            term = getTerm();
            content = getContent();
            medium = getMedium();
            gclid = getGclid();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        flag1 = false;
        flag = flag1;
        if (TextUtils.isEmpty(source))
        {
            break MISSING_BLOCK_LABEL_149;
        }
        flag = flag1;
        if (source.equals("0"))
        {
            break MISSING_BLOCK_LABEL_149;
        }
        (new SharedPrefsCobrandIDRetriever(context.getApplicationContext())).onInquiryResult(source);
        flag = true;
        flag1 = flag;
        if (TextUtils.isEmpty(campaign))
        {
            break MISSING_BLOCK_LABEL_197;
        }
        flag1 = flag;
        if (campaign.equals("0"))
        {
            break MISSING_BLOCK_LABEL_197;
        }
        (new SharedPrefsTrackingIDRetriever(context.getApplicationContext())).onInquiryResult(campaign);
        flag1 = true;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        intent = (Account)accountProvider.get();
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        skypeapplication = (SkypeApplication)context.getApplicationContext();
        if (skypeapplication == null)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        intent.setUIVersion(skypeapplication.c());
        if ("invite".equalsIgnoreCase(getSource()))
        {
            (new SharedGlobalPreferences(context)).addInvitation(getContent());
        }
    }
}
