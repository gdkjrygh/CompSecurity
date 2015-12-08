// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.js.UAJavascriptInterface;
import com.urbanairship.richpush.RichPushManager;
import com.urbanairship.richpush.RichPushMessage;
import com.urbanairship.richpush.RichPushUser;
import java.util.HashMap;
import org.apache.http.Header;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.auth.BasicScheme;

// Referenced classes of package com.urbanairship.widget:
//            UAWebView

public class RichPushMessageWebView extends UAWebView
{

    private RichPushMessage currentMessage;

    public RichPushMessageWebView(Context context)
    {
        super(context);
    }

    public RichPushMessageWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public RichPushMessageWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public RichPushMessage getCurrentMessage()
    {
        return currentMessage;
    }

    public void loadRichPushMessage(RichPushMessage richpushmessage)
    {
        if (richpushmessage == null)
        {
            Logger.warn("Unable to load null message into RichPushMessageWebView");
            return;
        }
        currentMessage = richpushmessage;
        RichPushUser richpushuser = UAirship.shared().getRichPushManager().getRichPushUser();
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            Header header = BasicScheme.authenticate(new UsernamePasswordCredentials(richpushuser.getId(), richpushuser.getPassword()), "UTF-8", false);
            HashMap hashmap = new HashMap();
            hashmap.put(header.getName(), header.getValue());
            loadUrl(richpushmessage.getMessageBodyUrl(), hashmap);
        } else
        {
            loadUrl(richpushmessage.getMessageBodyUrl());
        }
        setClientAuthRequest(richpushmessage.getMessageBodyUrl(), richpushuser.getId(), richpushuser.getPassword());
    }

    void loadUrbanAirshipJavascriptInterface()
    {
        loadUrbanAirshipJavascriptInterface(currentMessage);
    }

    protected void loadUrbanAirshipJavascriptInterface(RichPushMessage richpushmessage)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            richpushmessage = new UAJavascriptInterface(this, richpushmessage);
            removeJavascriptInterface("_UAirship");
            addJavascriptInterface(richpushmessage, "_UAirship");
        }
    }
}
