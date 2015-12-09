// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.media;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import com.netflix.mediaclient.media.Display;
import org.json.JSONException;
import org.json.JSONObject;

public class SetVideoWindow extends BaseInvoke
{

    private static final String METHOD = "setVideoWindow";
    private static final String PROPERTY_HEIGHT = "height";
    private static final String PROPERTY_TRANSITION_DURATION = "transitionDuration";
    private static final String PROPERTY_WIDTH = "width";
    private static final String PROPERTY_X = "x";
    private static final String PROPERTY_Y = "y";
    private static final String TARGET = "media";
    private Display display;

    public SetVideoWindow(Display display1, int i)
    {
        super("media", "setVideoWindow");
        setArguments(display1, i);
        display = display1;
    }

    private void setArguments(Display display1, int i)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("width", display1.getWidth());
            jsonobject.put("height", display1.getHeight());
            jsonobject.put("x", display1.getX());
            jsonobject.put("y", display1.getY());
            jsonobject.put("transitionDuration", i);
            arguments = jsonobject.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Display display1) { }
        break MISSING_BLOCK_LABEL_70;
        display1;
        Log.e("nf_invoke", "Failed to create JSON object", display1);
        return;
    }

    public Display getDisplay()
    {
        return display;
    }
}
