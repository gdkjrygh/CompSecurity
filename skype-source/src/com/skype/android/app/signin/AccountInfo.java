// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import org.json.JSONException;
import org.json.JSONObject;

public class AccountInfo
{

    private static final String JSON_PARAM_AVATARURL = "avatarUrl";
    private static final String JSON_PARAM_DISPLAYNAME = "displayname";
    private static final String JSON_PARAM_TYPE = "type";
    private static final String JSON_PARAM_USERNAME = "username";
    private String avatarUrl;
    private String displayName;
    private SignInConstants.AccountType type;
    private String username;

    AccountInfo(String s, SignInConstants.AccountType accounttype)
    {
        username = s;
        type = accounttype;
        displayName = "";
        avatarUrl = "";
    }

    AccountInfo(String s, SignInConstants.AccountType accounttype, String s1, String s2)
    {
        username = s;
        type = accounttype;
        displayName = s1;
        avatarUrl = s2;
    }

    AccountInfo(JSONObject jsonobject)
        throws JSONException
    {
        type = SignInConstants.AccountType.valueOf(jsonobject.getString("type"));
        username = jsonobject.getString("username");
        displayName = jsonobject.getString("displayname");
        if (jsonobject.isNull("avatarUrl"))
        {
            avatarUrl = null;
            return;
        } else
        {
            avatarUrl = jsonobject.optString("avatarUrl", null);
            return;
        }
    }

    public String getAvatarUrl()
    {
        return avatarUrl;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public SignInConstants.AccountType getType()
    {
        return type;
    }

    public String getUsername()
    {
        return username;
    }

    public JSONObject toJson()
    {
        Object obj = new JSONObject();
        try
        {
            ((JSONObject) (obj)).put("type", type);
            ((JSONObject) (obj)).put("username", username);
            ((JSONObject) (obj)).put("displayname", displayName);
            ((JSONObject) (obj)).put("avatarUrl", avatarUrl);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return ((JSONObject) (obj));
        }
        return ((JSONObject) (obj));
    }
}
