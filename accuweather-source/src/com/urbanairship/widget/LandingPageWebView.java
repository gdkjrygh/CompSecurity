// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.UAirship;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.auth.BasicScheme;

// Referenced classes of package com.urbanairship.widget:
//            UAWebView

public class LandingPageWebView extends UAWebView
{

    public LandingPageWebView(Context context)
    {
        super(context);
    }

    public LandingPageWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public LandingPageWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void setClientAuthRequest(String s)
    {
        AirshipConfigOptions airshipconfigoptions = UAirship.shared().getAirshipConfigOptions();
        setClientAuthRequest(s, airshipconfigoptions.getAppKey(), airshipconfigoptions.getAppSecret());
    }

    public void loadUrl(String s)
    {
        if (s == null || !s.startsWith(UAirship.shared().getAirshipConfigOptions().landingPageContentURL))
        {
            super.loadUrl(s);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            Object obj = UAirship.shared().getAirshipConfigOptions();
            obj = BasicScheme.authenticate(new UsernamePasswordCredentials(((AirshipConfigOptions) (obj)).getAppKey(), ((AirshipConfigOptions) (obj)).getAppSecret()), "UTF-8", false);
            HashMap hashmap = new HashMap();
            hashmap.put(((Header) (obj)).getName(), ((Header) (obj)).getValue());
            super.loadUrl(s, hashmap);
        } else
        {
            super.loadUrl(s);
        }
        setClientAuthRequest(s);
    }

    public void loadUrl(String s, Map map)
    {
        super.loadUrl(s, map);
        if (s != null && s.startsWith(UAirship.shared().getAirshipConfigOptions().landingPageContentURL))
        {
            setClientAuthRequest(s);
        }
    }
}
