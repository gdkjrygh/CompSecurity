// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.mobile.android.connect.model.DiscoveredDevice;
import com.spotify.mobile.android.connect.model.Message;
import com.spotify.mobile.android.connect.model.UserData;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;

public final class dlr
{

    private static final ObjectMapper a;

    public static Message a(String s)
    {
        try
        {
            s = (Message)a.readValue(s, com/spotify/mobile/android/connect/model/Message);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.b(s, "Couldn't parse message", new Object[0]);
            return new Message(com.spotify.mobile.android.connect.model.Message.Type.UNKNOWN, null);
        }
        return s;
    }

    public static Object a(JsonNode jsonnode, Class class1)
    {
        try
        {
            jsonnode = ((JsonNode) (a.convertValue(jsonnode, class1)));
        }
        // Misplaced declaration of an exception variable
        catch (JsonNode jsonnode)
        {
            Logger.b(jsonnode, "Couldn't parse payload", new Object[0]);
            return null;
        }
        return jsonnode;
    }

    public static String a(DiscoveredDevice discovereddevice)
    {
        return a(com.spotify.mobile.android.connect.model.Message.Type.GET_INFO, ((JacksonModel) (discovereddevice)));
    }

    private static String a(com.spotify.mobile.android.connect.model.Message.Type type, JacksonModel jacksonmodel)
    {
        type = new Message(type, (JsonNode)a.convertValue(jacksonmodel, com/fasterxml/jackson/databind/JsonNode));
        type = a.writeValueAsString(type);
        return type;
        type;
_L2:
        Logger.b(type, "Couldn't generate message", new Object[0]);
        return null;
        type;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String a(String s, String s1, String s2)
    {
        UserData userdata = new UserData();
        userdata.userName = s;
        userdata.blob = s1;
        userdata.clientKey = s2;
        return a(com.spotify.mobile.android.connect.model.Message.Type.ADD_USER, ((JacksonModel) (userdata)));
    }

    static 
    {
        a = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a();
    }
}
