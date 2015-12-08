// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            ac

public class InstallReferrerReceiver extends BroadcastReceiver
{

    private final Pattern a = Pattern.compile("(^|&)utm_source=([^&#=]*)([#&]|$)");
    private final Pattern b = Pattern.compile("(^|&)utm_medium=([^&#=]*)([#&]|$)");
    private final Pattern c = Pattern.compile("(^|&)utm_campaign=([^&#=]*)([#&]|$)");
    private final Pattern d = Pattern.compile("(^|&)utm_content=([^&#=]*)([#&]|$)");
    private final Pattern e = Pattern.compile("(^|&)utm_term=([^&#=]*)([#&]|$)");

    public InstallReferrerReceiver()
    {
    }

    private static String a(Matcher matcher)
    {
        if (!matcher.find())
        {
            break MISSING_BLOCK_LABEL_35;
        }
        matcher = matcher.group(2);
        if (matcher == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        matcher = URLDecoder.decode(matcher, "UTF-8");
        return matcher;
        matcher;
        Log.e("Mixpanel InstallReferrer", "Could not decode a parameter into UTF-8");
        return null;
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = intent.getExtras();
        String s;
        if (intent != null)
        {
            if ((s = intent.getString("referrer")) != null)
            {
                intent = new HashMap();
                intent.put("referrer", s);
                String s1 = a(a.matcher(s));
                if (s1 != null)
                {
                    intent.put("utm_source", s1);
                }
                s1 = a(b.matcher(s));
                if (s1 != null)
                {
                    intent.put("utm_medium", s1);
                }
                s1 = a(c.matcher(s));
                if (s1 != null)
                {
                    intent.put("utm_campaign", s1);
                }
                s1 = a(d.matcher(s));
                if (s1 != null)
                {
                    intent.put("utm_content", s1);
                }
                s = a(e.matcher(s));
                if (s != null)
                {
                    intent.put("utm_term", s);
                }
                ac.a(context, "com.mixpanel.android.mpmetrics.ReferralInfo", intent);
                return;
            }
        }
    }
}
