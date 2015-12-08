// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.android;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import com.netflix.mediaclient.media.PlayerType;
import org.json.JSONException;
import org.json.JSONObject;

public final class ChangePlayer extends BaseInvoke
{

    private static final String METHOD = "changePlayer";
    private static final String PROPERTY_BITRATE_CAP = "bitrateCap";
    private static final String PROPERTY_PLAYER_TYPE = "playerType";
    private static final String TARGET = "android";

    public ChangePlayer(PlayerType playertype, int i)
    {
        super("android", "changePlayer");
        setArguments(playertype, i);
    }

    private void setArguments(PlayerType playertype, int i)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("playerType", playertype.getValue());
            jsonobject.put("bitrateCap", i);
            arguments = jsonobject.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PlayerType playertype) { }
        break MISSING_BLOCK_LABEL_37;
        playertype;
        Log.e("nf_invoke", "Failed to create JSON object", playertype);
        return;
    }
}
