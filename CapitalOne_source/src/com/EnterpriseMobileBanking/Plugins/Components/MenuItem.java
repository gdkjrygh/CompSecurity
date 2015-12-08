// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import org.json.JSONException;
import org.json.JSONObject;

public class MenuItem
{

    private String action;
    private String id;
    private String imageUrl;
    private boolean selected;
    private String text;

    public MenuItem(String s, String s1, String s2, String s3)
    {
        id = "";
        action = "";
        text = "";
        imageUrl = null;
        selected = false;
        id = s;
        action = s1;
        text = s2;
        imageUrl = s3;
    }

    public MenuItem(JSONObject jsonobject)
    {
        id = "";
        action = "";
        text = "";
        imageUrl = null;
        selected = false;
        String s;
        jsonobject = jsonobject.getJSONObject("menuItem");
        id = jsonobject.optString("MenuItemId", "");
        text = jsonobject.optString("MenuItemName", "");
        if (jsonobject.optJSONObject("Menu") != null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        imageUrl = jsonobject.optString("MenuItemIconName");
        if (imageUrl == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        imageUrl = imageUrl.toLowerCase();
        s = jsonobject.optString("MenuItemAction", "");
        if (s.trim().startsWith("{"))
        {
            action = (new StringBuilder()).append("navOverlay.menuClicked( ").append(jsonobject.toString()).append(");").toString();
            return;
        }
        try
        {
            action = s;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
        }
    }

    public String getAction()
    {
        return action;
    }

    public String getId()
    {
        return id;
    }

    public String getImage()
    {
        return imageUrl;
    }

    public String getText()
    {
        return text;
    }

    public boolean isSelected()
    {
        return selected;
    }

    public void setSelected(boolean flag)
    {
        selected = flag;
    }

    public void setText(String s)
    {
        text = s;
    }

    public String toString()
    {
        return text;
    }
}
