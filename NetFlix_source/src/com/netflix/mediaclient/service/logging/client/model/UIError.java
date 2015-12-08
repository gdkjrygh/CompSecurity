// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;

import com.netflix.mediaclient.util.JsonUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.client.model:
//            Error, ActionOnUIError, RootCause

public class UIError extends Error
{

    public static final String DISPLAYED_MESSAGE = "displayedMessage";
    public static final String UI_ACTION = "uiAction";
    private String displayedMessage;
    private ActionOnUIError uiAction;

    public UIError()
    {
    }

    public UIError(RootCause rootcause, ActionOnUIError actiononuierror, String s, List list)
    {
        super(rootcause, list);
        displayedMessage = s;
        uiAction = actiononuierror;
    }

    public UIError(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        displayedMessage = JsonUtils.getString(jsonobject, "displayedMessage", null);
        jsonobject = JsonUtils.getString(jsonobject, "uiAction", null);
        if (jsonobject != null)
        {
            uiAction = ActionOnUIError.valueOf(jsonobject);
        }
    }

    public static UIError createInstance(String s)
        throws JSONException
    {
        if (s == null)
        {
            return null;
        } else
        {
            return new UIError(new JSONObject(s));
        }
    }

    public static UIError createInstance(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            return null;
        } else
        {
            return new UIError(jsonobject);
        }
    }

    public String getDisplayedMessage()
    {
        return displayedMessage;
    }

    public ActionOnUIError getUiAction()
    {
        return uiAction;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = super.toJSONObject();
        if (uiAction != null)
        {
            jsonobject.put("uiAction", uiAction.name());
        }
        if (displayedMessage != null)
        {
            jsonobject.put("displayedMessage", displayedMessage);
        }
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("UIError [uiAction=").append(uiAction).append(", displayedMessage=").append(displayedMessage).append("]").toString();
    }
}
