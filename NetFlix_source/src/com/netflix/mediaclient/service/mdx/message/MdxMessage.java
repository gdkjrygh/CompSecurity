// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

public abstract class MdxMessage
{

    private static final Set MESSAGE_IS_USER_COMMAND = new HashSet() {

            
            {
                add("DIALOG_RESPONSE");
                add("PLAYER_PAUSE");
                add("PLAYER_PLAY");
                add("PLAYER_RESUME");
                add("PLAYER_SET_AUTO_ADVANCE");
                add("PLAYER_SET_CURRENT_TIME");
                add("PLAYER_SKIP");
                add("PLAYER_STOP");
                add("SET_AUDIO_SUBTITLES");
            }
    };
    protected static final String PROPERTY_xid = "xid";
    protected static final String TAG = "nf_mdx";
    public static final String TYPE_AUDIO_SUBTITLES_CHANGED = "AUDIO_SUBTITLES_CHANGED";
    public static final String TYPE_AUDIO_SUBTITLES_SETTINGS = "AUDIO_SUBTITLES_SETTINGS";
    public static final String TYPE_DIALOG_CANCEL = "DIALOG_CANCEL";
    public static final String TYPE_DIALOG_RESPONSE = "DIALOG_RESPONSE";
    public static final String TYPE_DIALOG_SHOW = "DIALOG_SHOW";
    public static final String TYPE_GET_AUDIO_SUBTITLES = "GET_AUDIO_SUBTITLES";
    public static final String TYPE_HANDSHAKE = "HANDSHAKE";
    public static final String TYPE_HANDSHAKE_ACCEPTED = "HANDSHAKE_ACCEPTED";
    public static final String TYPE_MESSAGE_IGNORED = "MESSAGE_IGNORED";
    public static final String TYPE_META_DATA_CHANGED = "META_DATA_CHANGED";
    public static final String TYPE_PIN_VERIFICATION_CANCEL = "PIN_VERIFICATION_CANCEL";
    public static final String TYPE_PIN_VERIFICATION_NOT_REQUIRED = "PIN_VERIFICATION_NOT_REQUIRED";
    public static final String TYPE_PIN_VERIFICATION_RESPONSE = "PIN_VERIFICATION_RESPONSE";
    public static final String TYPE_PIN_VERIFICATION_SHOW = "PIN_VERIFICATION_SHOW";
    public static final String TYPE_PLAYER_CAPABILITIES = "PLAYER_CAPABILITIES";
    public static final String TYPE_PLAYER_CURRENT_STATE = "PLAYER_CURRENT_STATE";
    public static final String TYPE_PLAYER_GET_CAPABILITIES = "PLAYER_GET_CAPABILITIES";
    public static final String TYPE_PLAYER_GET_CURRENT_STATE = "PLAYER_GET_CURRENT_STATE";
    public static final String TYPE_PLAYER_PAUSE = "PLAYER_PAUSE";
    public static final String TYPE_PLAYER_PLAY = "PLAYER_PLAY";
    public static final String TYPE_PLAYER_RESUME = "PLAYER_RESUME";
    public static final String TYPE_PLAYER_SET_AUTO_ADVANCE = "PLAYER_SET_AUTO_ADVANCE";
    public static final String TYPE_PLAYER_SET_CURRENT_TIME = "PLAYER_SET_CURRENT_TIME";
    public static final String TYPE_PLAYER_SET_VOLUME = "PLAYER_SET_VOLUME";
    public static final String TYPE_PLAYER_SKIP = "PLAYER_SKIP";
    public static final String TYPE_PLAYER_STATE_CHANGED = "PLAYER_STATE_CHANGED";
    public static final String TYPE_PLAYER_STOP = "PLAYER_STOP";
    public static final String TYPE_SET_AUDIO_SUBTITLES = "SET_AUDIO_SUBTITLES";
    protected JSONObject mJson;
    private String mName;

    protected MdxMessage(String s)
    {
        mJson = new JSONObject();
        mName = s;
    }

    public static boolean isUserCommand(String s)
    {
        return MESSAGE_IS_USER_COMMAND.contains(s);
    }

    public String messageName()
    {
        return mName;
    }

    public JSONObject messageObject()
    {
        return mJson;
    }

}
