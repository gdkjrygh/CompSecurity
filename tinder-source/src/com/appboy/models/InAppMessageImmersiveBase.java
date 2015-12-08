// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models;

import bo.app.bx;
import bo.app.ct;
import bo.app.ep;
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

    public InAppMessageImmersiveBase(JSONObject jsonobject, bx bx1)
    {
        this(jsonobject, bx1, jsonobject.optString("header"), jsonobject.optInt("header_text_color"), jsonobject.optInt("close_btn_color"));
        if (jsonobject.optJSONArray("btns") != null)
        {
            bx1 = new ArrayList();
            jsonobject = jsonobject.optJSONArray("btns");
            for (int j = 0; j < jsonobject.length(); j++)
            {
                bx1.add(new MessageButton(jsonobject.optJSONObject(j)));
            }

            setMessageButtons(bx1);
        }
    }

    private InAppMessageImmersiveBase(JSONObject jsonobject, bx bx1, String s, int j, int k)
    {
        super(jsonobject, bx1);
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
        if (ep.b(b) && ep.b(c))
        {
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
            messagebutton = ct.a(b, c, messagebutton);
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
