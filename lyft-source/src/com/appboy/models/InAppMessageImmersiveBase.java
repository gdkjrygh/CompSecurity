// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models;

import bo.app.cd;
import bo.app.cz;
import bo.app.ev;
import com.appboy.support.AppboyLogger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models:
//            InAppMessageBase, IInAppMessageImmersive, MessageButton

public abstract class InAppMessageImmersiveBase extends InAppMessageBase
    implements IInAppMessageImmersive
{

    private String e;
    private int f;
    private int g;
    private boolean h;
    private List i;

    protected InAppMessageImmersiveBase()
    {
        f = 0;
        g = 0;
    }

    public InAppMessageImmersiveBase(JSONObject jsonobject, cd cd1)
    {
        this(jsonobject, cd1, jsonobject.optString("header"), jsonobject.optInt("header_text_color"), jsonobject.optInt("close_btn_color"));
        if (jsonobject.optJSONArray("btns") != null)
        {
            cd1 = new ArrayList();
            jsonobject = jsonobject.optJSONArray("btns");
            for (int j = 0; j < jsonobject.length(); j++)
            {
                cd1.add(new MessageButton(jsonobject.optJSONObject(j)));
            }

            setMessageButtons(cd1);
        }
    }

    private InAppMessageImmersiveBase(JSONObject jsonobject, cd cd1, String s, int j, int k)
    {
        super(jsonobject, cd1);
        f = 0;
        g = 0;
        e = s;
        f = j;
        g = k;
    }

    public int getCloseButtonColor()
    {
        return g;
    }

    public String getHeader()
    {
        return e;
    }

    public int getHeaderTextColor()
    {
        return f;
    }

    public List getMessageButtons()
    {
        return i;
    }

    public boolean logButtonClick(MessageButton messagebutton)
    {
        if (ev.b(b) && ev.b(c))
        {
            messagebutton = a;
            return false;
        }
        if (messagebutton == null)
        {
            AppboyLogger.w(a, "Message button was null. Ignoring button click.");
            return false;
        }
        if (h)
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
            messagebutton = cz.a(b, c, messagebutton);
            d.a(messagebutton);
            h = true;
        }
        // Misplaced declaration of an exception variable
        catch (MessageButton messagebutton)
        {
            d.a(messagebutton);
            return false;
        }
        return true;
    }

    public void setCloseButtonColor(int j)
    {
        g = j;
    }

    public void setHeader(String s)
    {
        e = s;
    }

    public void setHeaderTextColor(int j)
    {
        f = j;
    }

    public void setMessageButtons(List list)
    {
        i = list;
    }
}
