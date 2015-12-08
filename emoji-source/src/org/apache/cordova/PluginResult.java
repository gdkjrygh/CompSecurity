// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.util.Base64;
import org.json.JSONArray;
import org.json.JSONObject;

public class PluginResult
{
    public static final class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status CLASS_NOT_FOUND_EXCEPTION;
        public static final Status ERROR;
        public static final Status ILLEGAL_ACCESS_EXCEPTION;
        public static final Status INSTANTIATION_EXCEPTION;
        public static final Status INVALID_ACTION;
        public static final Status IO_EXCEPTION;
        public static final Status JSON_EXCEPTION;
        public static final Status MALFORMED_URL_EXCEPTION;
        public static final Status NO_RESULT;
        public static final Status OK;

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(org/apache/cordova/PluginResult$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            NO_RESULT = new Status("NO_RESULT", 0);
            OK = new Status("OK", 1);
            CLASS_NOT_FOUND_EXCEPTION = new Status("CLASS_NOT_FOUND_EXCEPTION", 2);
            ILLEGAL_ACCESS_EXCEPTION = new Status("ILLEGAL_ACCESS_EXCEPTION", 3);
            INSTANTIATION_EXCEPTION = new Status("INSTANTIATION_EXCEPTION", 4);
            MALFORMED_URL_EXCEPTION = new Status("MALFORMED_URL_EXCEPTION", 5);
            IO_EXCEPTION = new Status("IO_EXCEPTION", 6);
            INVALID_ACTION = new Status("INVALID_ACTION", 7);
            JSON_EXCEPTION = new Status("JSON_EXCEPTION", 8);
            ERROR = new Status("ERROR", 9);
            $VALUES = (new Status[] {
                NO_RESULT, OK, CLASS_NOT_FOUND_EXCEPTION, ILLEGAL_ACCESS_EXCEPTION, INSTANTIATION_EXCEPTION, MALFORMED_URL_EXCEPTION, IO_EXCEPTION, INVALID_ACTION, JSON_EXCEPTION, ERROR
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int MESSAGE_TYPE_ARRAYBUFFER = 6;
    public static final int MESSAGE_TYPE_BINARYSTRING = 7;
    public static final int MESSAGE_TYPE_BOOLEAN = 4;
    public static final int MESSAGE_TYPE_JSON = 2;
    public static final int MESSAGE_TYPE_NULL = 5;
    public static final int MESSAGE_TYPE_NUMBER = 3;
    public static final int MESSAGE_TYPE_STRING = 1;
    public static String StatusMessages[] = {
        "No result", "OK", "Class not found", "Illegal access", "Instantiation error", "Malformed url", "IO error", "Invalid action", "JSON error", "Error"
    };
    private String encodedMessage;
    private boolean keepCallback;
    private final int messageType;
    private final int status;
    private String strMessage;

    public PluginResult(Status status1)
    {
        this(status1, StatusMessages[status1.ordinal()]);
    }

    public PluginResult(Status status1, float f)
    {
        keepCallback = false;
        status = status1.ordinal();
        messageType = 3;
        encodedMessage = (new StringBuilder()).append("").append(f).toString();
    }

    public PluginResult(Status status1, int i)
    {
        keepCallback = false;
        status = status1.ordinal();
        messageType = 3;
        encodedMessage = (new StringBuilder()).append("").append(i).toString();
    }

    public PluginResult(Status status1, String s)
    {
        keepCallback = false;
        status = status1.ordinal();
        int i;
        if (s == null)
        {
            i = 5;
        } else
        {
            i = 1;
        }
        messageType = i;
        strMessage = s;
    }

    public PluginResult(Status status1, JSONArray jsonarray)
    {
        keepCallback = false;
        status = status1.ordinal();
        messageType = 2;
        encodedMessage = jsonarray.toString();
    }

    public PluginResult(Status status1, JSONObject jsonobject)
    {
        keepCallback = false;
        status = status1.ordinal();
        messageType = 2;
        encodedMessage = jsonobject.toString();
    }

    public PluginResult(Status status1, boolean flag)
    {
        keepCallback = false;
        status = status1.ordinal();
        messageType = 4;
        encodedMessage = Boolean.toString(flag);
    }

    public PluginResult(Status status1, byte abyte0[])
    {
        this(status1, abyte0, false);
    }

    public PluginResult(Status status1, byte abyte0[], boolean flag)
    {
        keepCallback = false;
        status = status1.ordinal();
        int i;
        if (flag)
        {
            i = 7;
        } else
        {
            i = 6;
        }
        messageType = i;
        encodedMessage = Base64.encodeToString(abyte0, 2);
    }

    public String getJSONString()
    {
        return (new StringBuilder()).append("{\"status\":").append(status).append(",\"message\":").append(getMessage()).append(",\"keepCallback\":").append(keepCallback).append("}").toString();
    }

    public boolean getKeepCallback()
    {
        return keepCallback;
    }

    public String getMessage()
    {
        if (encodedMessage == null)
        {
            encodedMessage = JSONObject.quote(strMessage);
        }
        return encodedMessage;
    }

    public int getMessageType()
    {
        return messageType;
    }

    public int getStatus()
    {
        return status;
    }

    public String getStrMessage()
    {
        return strMessage;
    }

    public void setKeepCallback(boolean flag)
    {
        keepCallback = flag;
    }

    public String toCallbackString(String s)
    {
        if (status == Status.NO_RESULT.ordinal() && keepCallback)
        {
            return null;
        }
        if (status == Status.OK.ordinal() || status == Status.NO_RESULT.ordinal())
        {
            return toSuccessCallbackString(s);
        } else
        {
            return toErrorCallbackString(s);
        }
    }

    public String toErrorCallbackString(String s)
    {
        return (new StringBuilder()).append("cordova.callbackError('").append(s).append("', ").append(getJSONString()).append(");").toString();
    }

    public String toSuccessCallbackString(String s)
    {
        return (new StringBuilder()).append("cordova.callbackSuccess('").append(s).append("',").append(getJSONString()).append(");").toString();
    }

}
