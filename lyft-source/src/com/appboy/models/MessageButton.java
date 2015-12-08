// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models;

import android.net.Uri;
import bo.app.eu;
import bo.app.ev;
import com.appboy.Constants;
import com.appboy.enums.inappmessage.ClickAction;
import com.appboy.support.AppboyLogger;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models:
//            IPutIntoJson

public class MessageButton
    implements IPutIntoJson
{

    private static final String a;
    private JSONObject b;
    private int c;
    private ClickAction d;
    private Uri e;
    private String f;
    private int g;
    private int h;

    public MessageButton()
    {
        c = -1;
        d = ClickAction.NONE;
        g = 0;
        h = 0;
    }

    public MessageButton(JSONObject jsonobject)
    {
        this(jsonobject, jsonobject.optInt("id", -1), (ClickAction)eu.a(jsonobject, "click_action", com/appboy/enums/inappmessage/ClickAction, ClickAction.NEWS_FEED), jsonobject.optString("uri"), jsonobject.optString("text"), jsonobject.optInt("bg_color"), jsonobject.optInt("text_color"));
    }

    private MessageButton(JSONObject jsonobject, int i, ClickAction clickaction, String s, String s1, int j, int k)
    {
        c = -1;
        d = ClickAction.NONE;
        g = 0;
        h = 0;
        b = jsonobject;
        c = i;
        d = clickaction;
        if (d == ClickAction.URI && !ev.c(s))
        {
            e = Uri.parse(s);
        }
        f = s1;
        g = j;
        h = k;
    }

    public volatile Object forJsonPut()
    {
        return forJsonPut();
    }

    public JSONObject forJsonPut()
    {
        return b;
    }

    public int getBackgroundColor()
    {
        return g;
    }

    public ClickAction getClickAction()
    {
        return d;
    }

    public int getId()
    {
        return c;
    }

    public String getText()
    {
        return f;
    }

    public int getTextColor()
    {
        return h;
    }

    public Uri getUri()
    {
        return e;
    }

    public void setBackgroundColor(int i)
    {
        g = i;
    }

    public boolean setClickAction(ClickAction clickaction)
    {
        if (clickaction != ClickAction.URI)
        {
            d = clickaction;
            e = null;
            return true;
        } else
        {
            AppboyLogger.e(a, "A non-null URI is required in order to set the button ClickAction to URI.");
            return false;
        }
    }

    public boolean setClickAction(ClickAction clickaction, Uri uri)
    {
        if (uri == null && clickaction == ClickAction.URI)
        {
            AppboyLogger.e(a, "A non-null URI is required in order to set the button ClickAction to URI.");
            return false;
        }
        if (uri != null && clickaction == ClickAction.URI)
        {
            d = clickaction;
            e = uri;
            return true;
        } else
        {
            return setClickAction(clickaction);
        }
    }

    public void setText(String s)
    {
        f = s;
    }

    public void setTextColor(int i)
    {
        h = i;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/models/MessageButton.getName()
        });
    }
}
