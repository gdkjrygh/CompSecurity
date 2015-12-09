// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.uiview.model;

import com.netflix.mediaclient.service.logging.client.model.DeviceUniqueId;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.uiview.model:
//            BaseUIViewSessionEndedEvent

public class CommandEndedEvent extends BaseUIViewSessionEndedEvent
{
    private static final class InputMethod extends Enum
    {

        private static final InputMethod $VALUES[];
        public static final InputMethod gesture;
        public static final InputMethod key;
        public static final InputMethod pointer;
        public static final InputMethod voice;

        public static InputMethod valueOf(String s)
        {
            return (InputMethod)Enum.valueOf(com/netflix/mediaclient/service/logging/uiview/model/CommandEndedEvent$InputMethod, s);
        }

        public static InputMethod[] values()
        {
            return (InputMethod[])$VALUES.clone();
        }

        static 
        {
            key = new InputMethod("key", 0);
            voice = new InputMethod("voice", 1);
            gesture = new InputMethod("gesture", 2);
            pointer = new InputMethod("pointer", 3);
            $VALUES = (new InputMethod[] {
                key, voice, gesture, pointer
            });
        }

        private InputMethod(String s, int i)
        {
            super(s, i);
        }
    }

    private static final class InputValue extends Enum
    {

        private static final InputValue $VALUES[];
        public static final InputValue touch;

        public static InputValue valueOf(String s)
        {
            return (InputValue)Enum.valueOf(com/netflix/mediaclient/service/logging/uiview/model/CommandEndedEvent$InputValue, s);
        }

        public static InputValue[] values()
        {
            return (InputValue[])$VALUES.clone();
        }

        static 
        {
            touch = new InputValue("touch", 0);
            $VALUES = (new InputValue[] {
                touch
            });
        }

        private InputValue(String s, int i)
        {
            super(s, i);
        }
    }


    private static final Integer DEF_VALUE_CONFIDENCE = Integer.valueOf(1);
    private static final String DEF_VALUE_IS_HOT_BOTTON = "false";
    public static final String KEY_CONFIDENCE = "confidence";
    public static final String KEY_INPUT_METHOD = "inputMethod";
    public static final String KEY_INPUT_VALUE = "inputValue";
    public static final String KEY_IS_HOT_BUTTON = "isHotKey";
    public static final String KEY_NAME = "name";
    public static final String UIVIEW_SESSION_NAME = "command";
    private com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName mCommandName;

    public CommandEndedEvent(DeviceUniqueId deviceuniqueid, long l, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName uiviewcommandname)
    {
        super("command", deviceuniqueid, l);
        mCommandName = uiviewcommandname;
    }

    protected JSONObject getData()
        throws JSONException
    {
        JSONObject jsonobject1 = super.getData();
        JSONObject jsonobject = jsonobject1;
        if (jsonobject1 == null)
        {
            jsonobject = new JSONObject();
        }
        if (mCommandName != null)
        {
            jsonobject.put("name", mCommandName.name());
            jsonobject.put("inputMethod", InputMethod.gesture.name());
            jsonobject.put("inputValue", InputValue.touch.name());
            jsonobject.put("isHotKey", "false");
            jsonobject.put("confidence", DEF_VALUE_CONFIDENCE);
        }
        return jsonobject;
    }

}
