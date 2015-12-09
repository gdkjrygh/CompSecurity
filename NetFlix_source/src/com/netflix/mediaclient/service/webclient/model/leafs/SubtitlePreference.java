// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.leafs;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.JsonUtils;
import com.netflix.mediaclient.util.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class SubtitlePreference
{

    private static final String FIELD_BACK_COLOR = "backgroundColor";
    private static final String FIELD_BACK_OPACITY = "backgroundOpacity";
    private static final String FIELD_CHAR_COLOR = "charColor";
    private static final String FIELD_CHAR_OPACITY = "charOpacity";
    private static final String FIELD_CHAR_SIZE = "charSize";
    private static final String FIELD_CHAR_STLE = "charStyle";
    private static final String FIELD_EDGE_ATTRS = "charEdgeAttrs";
    private static final String FIELD_EDGE_COLOR = "charEdgeColor";
    public static final String FIELD_SUBTITLE_DEFAULT = "subtitleDefault";
    public static final String FIELD_SUBTITLE_OVERRIDE = "subtitleOverride";
    private static final String FIELD_WIN_COLOR = "windowColor";
    private static final String FIELD_WIN_OPACITY = "windowOpacity";
    private static final String TAG = "nf_subtitlePreference";
    private String backgroundColor;
    private String backgroundOpacity;
    private String charColor;
    private String charEdgeAttrs;
    private String charEdgeColor;
    private String charOpacity;
    private String charSize;
    private String charStyle;
    private String windowColor;
    private String windowOpacity;

    public SubtitlePreference(String s)
    {
        JSONObject jsonobject;
        if (!StringUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_130;
        }
        jsonobject = new JSONObject();
_L1:
        setCharOpacity(JsonUtils.getString(jsonobject, "charOpacity", null));
        setBackgroundOpacity(JsonUtils.getString(jsonobject, "backgroundOpacity", null));
        setWindowOpacity(JsonUtils.getString(jsonobject, "windowOpacity", null));
        setCharColor(JsonUtils.getString(jsonobject, "charColor", null));
        setBackgroundColor(JsonUtils.getString(jsonobject, "backgroundColor", null));
        setWindowColor(JsonUtils.getString(jsonobject, "windowColor", null));
        setCharEdgeColor(JsonUtils.getString(jsonobject, "charEdgeColor", null));
        setCharEdgeAttrs(JsonUtils.getString(jsonobject, "charEdgeAttrs", null));
        setCharSize(JsonUtils.getString(jsonobject, "charSize", null));
        setCharStyle(JsonUtils.getString(jsonobject, "charStyle", null));
        return;
        try
        {
            jsonobject = new JSONObject(s);
        }
        catch (JSONException jsonexception)
        {
            Log.d("nf_subtitlePreference", (new StringBuilder()).append("failed to create json string=").append(s).append(" exception =").append(jsonexception).toString());
            return;
        }
          goto _L1
    }

    public String getBackgroundColor()
    {
        return backgroundColor;
    }

    public String getBackgroundOpacity()
    {
        return backgroundOpacity;
    }

    public String getCharColor()
    {
        return charColor;
    }

    public String getCharEdgeAttrs()
    {
        return charEdgeAttrs;
    }

    public String getCharEdgeColor()
    {
        return charEdgeColor;
    }

    public String getCharOpacity()
    {
        return charOpacity;
    }

    public String getCharSize()
    {
        return charSize;
    }

    public String getCharStyle()
    {
        return charStyle;
    }

    public String getWindowColor()
    {
        return windowColor;
    }

    public String getWindowOpacity()
    {
        return windowOpacity;
    }

    public void setBackgroundColor(String s)
    {
        backgroundColor = s;
    }

    public void setBackgroundOpacity(String s)
    {
        backgroundOpacity = s;
    }

    public void setCharColor(String s)
    {
        charColor = s;
    }

    public void setCharEdgeAttrs(String s)
    {
        charEdgeAttrs = s;
    }

    public void setCharEdgeColor(String s)
    {
        charEdgeColor = s;
    }

    public void setCharOpacity(String s)
    {
        charOpacity = s;
    }

    public void setCharSize(String s)
    {
        charSize = s;
    }

    public void setCharStyle(String s)
    {
        charStyle = s;
    }

    public void setWindowColor(String s)
    {
        windowColor = s;
    }

    public void setWindowOpacity(String s)
    {
        windowOpacity = s;
    }

    public String toString()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("charOpacity", getCharOpacity());
            jsonobject.put("backgroundOpacity", getBackgroundOpacity());
            jsonobject.put("windowOpacity", getWindowOpacity());
            jsonobject.put("charColor", getCharColor());
            jsonobject.put("backgroundColor", getBackgroundColor());
            jsonobject.put("windowColor", getWindowColor());
            jsonobject.put("charEdgeColor", getCharEdgeColor());
            jsonobject.put("charEdgeAttrs", getCharEdgeAttrs());
            jsonobject.put("charSize", getCharSize());
            jsonobject.put("charStyle", getCharStyle());
        }
        catch (JSONException jsonexception)
        {
            Log.d("nf_subtitlePreference", (new StringBuilder()).append("failed in json string ").append(jsonexception).toString());
        }
        Log.d("nf_subtitlePreference", (new StringBuilder()).append("user string=").append(jsonobject.toString()).toString());
        return jsonobject.toString();
    }
}
