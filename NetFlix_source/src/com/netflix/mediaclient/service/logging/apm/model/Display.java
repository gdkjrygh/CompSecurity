// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm.model;

import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class Display
{
    public static final class AspectRatio extends Enum
    {

        private static final AspectRatio $VALUES[];
        public static final AspectRatio _16x9;
        public static final AspectRatio _4x3;
        private String desc;

        public static AspectRatio find(String s)
        {
            if (_16x9.desc.equals(s))
            {
                return _16x9;
            }
            if (_4x3.desc.equals(s))
            {
                return _4x3;
            } else
            {
                return null;
            }
        }

        public static AspectRatio valueOf(String s)
        {
            return (AspectRatio)Enum.valueOf(com/netflix/mediaclient/service/logging/apm/model/Display$AspectRatio, s);
        }

        public static AspectRatio[] values()
        {
            return (AspectRatio[])$VALUES.clone();
        }

        public String getDesc()
        {
            return desc;
        }

        static 
        {
            _16x9 = new AspectRatio("_16x9", 0, "16x9");
            _4x3 = new AspectRatio("_4x3", 1, "4x3");
            $VALUES = (new AspectRatio[] {
                _16x9, _4x3
            });
        }

        private AspectRatio(String s, int i, String s1)
        {
            super(s, i);
            desc = s1;
        }
    }

    public static final class Connector extends Enum
    {

        private static final Connector $VALUES[];
        public static final Connector component;
        public static final Connector composite;
        public static final Connector hdmi;
        public static final Connector internal;

        public static Connector valueOf(String s)
        {
            return (Connector)Enum.valueOf(com/netflix/mediaclient/service/logging/apm/model/Display$Connector, s);
        }

        public static Connector[] values()
        {
            return (Connector[])$VALUES.clone();
        }

        static 
        {
            internal = new Connector("internal", 0);
            component = new Connector("component", 1);
            composite = new Connector("composite", 2);
            hdmi = new Connector("hdmi", 3);
            $VALUES = (new Connector[] {
                internal, component, composite, hdmi
            });
        }

        private Connector(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class ScanMode extends Enum
    {

        private static final ScanMode $VALUES[];
        public static final ScanMode interlaced;
        public static final ScanMode progressive;

        public static ScanMode valueOf(String s)
        {
            return (ScanMode)Enum.valueOf(com/netflix/mediaclient/service/logging/apm/model/Display$ScanMode, s);
        }

        public static ScanMode[] values()
        {
            return (ScanMode[])$VALUES.clone();
        }

        static 
        {
            progressive = new ScanMode("progressive", 0);
            interlaced = new ScanMode("interlaced", 1);
            $VALUES = (new ScanMode[] {
                progressive, interlaced
            });
        }

        private ScanMode(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String ASPECT_RATIO = "aspectRatio";
    public static final String CONNECTOR = "connector";
    public static final String HEIGHT = "height";
    public static final String REFRESH_RATE = "refreshRate";
    public static final String RESOLUTION = "resolution";
    public static final String SCAN_MODE = "scanMode";
    public static final String WIDTH = "width";
    private AspectRatio aspectRatio;
    private Connector connector;
    private Integer height;
    private Integer refreshRate;
    private ScanMode scanMode;
    private Integer width;

    private Display()
    {
    }

    public Display(Connector connector1, AspectRatio aspectratio, Integer integer, Integer integer1, Integer integer2, ScanMode scanmode)
    {
        connector = connector1;
        aspectRatio = aspectratio;
        width = integer;
        height = integer1;
        refreshRate = integer2;
        scanMode = scanmode;
    }

    public static Display createInstance(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            jsonobject = null;
        } else
        {
            Display display = new Display();
            display.refreshRate = JsonUtils.getIntegerObject(jsonobject, "refreshRate", null);
            display.aspectRatio = AspectRatio.find(JsonUtils.getString(jsonobject, "aspectRatio", null));
            Object obj = JsonUtils.getJSONObject(jsonobject, "resolution", null);
            if (obj != null)
            {
                display.width = JsonUtils.getIntegerObject(((JSONObject) (obj)), "width", null);
                display.height = JsonUtils.getIntegerObject(((JSONObject) (obj)), "height", null);
            }
            obj = JsonUtils.getString(jsonobject, "connector", null);
            jsonobject = display;
            if (obj != null)
            {
                display.connector = Connector.valueOf(((String) (obj)));
                return display;
            }
        }
        return jsonobject;
    }

    public Connector getConnector()
    {
        return connector;
    }

    public Integer getHeight()
    {
        return height;
    }

    public Integer getRefreshRate()
    {
        return refreshRate;
    }

    public ScanMode getScanMode()
    {
        return scanMode;
    }

    public Integer getWidth()
    {
        return width;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        if (connector != null)
        {
            jsonobject.put("connector", connector.name());
        }
        if (aspectRatio != null)
        {
            jsonobject.put("aspectRatio", aspectRatio.getDesc());
        }
        if (scanMode != null)
        {
            jsonobject.put("scanMode", scanMode.name());
        }
        if (width != null && height != null)
        {
            JSONObject jsonobject1 = new JSONObject();
            jsonobject.put("resolution", jsonobject1);
            jsonobject1.put("height", height.intValue());
            jsonobject1.put("width", width.intValue());
        }
        if (refreshRate != null)
        {
            jsonobject.put("refreshRate", refreshRate.intValue());
        }
        return jsonobject;
    }
}
