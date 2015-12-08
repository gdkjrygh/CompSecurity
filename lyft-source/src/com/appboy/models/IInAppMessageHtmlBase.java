// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models;

import bo.app.cd;
import bo.app.cz;
import bo.app.ev;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models:
//            InAppMessageBase, IInAppMessageHtml

public abstract class IInAppMessageHtmlBase extends InAppMessageBase
    implements IInAppMessageHtml
{

    private String e;
    private String f;
    private boolean g;

    protected IInAppMessageHtmlBase()
    {
        g = false;
    }

    public IInAppMessageHtmlBase(JSONObject jsonobject, cd cd1)
    {
        super(jsonobject, cd1);
        g = false;
        if (!ev.c(jsonobject.optString("zipped_assets_url")))
        {
            e = jsonobject.optString("zipped_assets_url");
        }
    }

    public String getAssetsZipRemoteUrl()
    {
        return e;
    }

    public String getLocalAssetsDirectoryUrl()
    {
        return f;
    }

    public boolean logButtonClick(String s)
    {
        if (ev.b(b) && ev.b(c))
        {
            s = a;
            return false;
        }
        if (g)
        {
            AppboyLogger.i(a, "Button click already logged for this message. Ignoring.");
            return false;
        }
        if (d == null)
        {
            AppboyLogger.e(a, "Cannot log a button click because the AppboyManager is null.");
            return false;
        }
        try
        {
            s = cz.a(b, c, s);
            d.a(s);
            g = true;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            d.a(s);
            return false;
        }
        return true;
    }

    public void setAssetsZipRemoteUrl(String s)
    {
        e = s;
    }

    public void setLocalAssetsDirectoryUrl(String s)
    {
        f = s;
    }
}
