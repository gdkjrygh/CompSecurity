// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;


// Referenced classes of package org.apache.cordova:
//            NativeToJsMessageQueue, PluginResult

private static class pluginResult
{

    final String jsPayloadOrCallbackId;
    final PluginResult pluginResult;

    int calculateEncodedLength()
    {
        if (pluginResult == null)
        {
            return jsPayloadOrCallbackId.length() + 1;
        }
        int i = String.valueOf(pluginResult.getStatus()).length() + 2 + 1 + jsPayloadOrCallbackId.length() + 1;
        switch (pluginResult.getMessageType())
        {
        case 2: // '\002'
        default:
            return i + pluginResult.getMessage().length();

        case 4: // '\004'
        case 5: // '\005'
            return i + 1;

        case 3: // '\003'
            return i + (pluginResult.getMessage().length() + 1);

        case 1: // '\001'
            return i + (pluginResult.getStrMessage().length() + 1);

        case 7: // '\007'
            return i + (pluginResult.getMessage().length() + 1);

        case 6: // '\006'
            return i + (pluginResult.getMessage().length() + 1);
        }
    }

    void encodeAsJsMessage(StringBuilder stringbuilder)
    {
        if (pluginResult == null)
        {
            stringbuilder.append(jsPayloadOrCallbackId);
            return;
        }
        int i = pluginResult.getStatus();
        boolean flag;
        if (i == pluginResult.pluginResult() || i == pluginResult.pluginResult())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stringbuilder.append("cordova.callbackFromNative('").append(jsPayloadOrCallbackId).append("',").append(flag).append(",").append(i).append(",[");
        pluginResult.getMessageType();
        JVM INSTR tableswitch 6 7: default 112
    //                   6 177
    //                   7 152;
           goto _L1 _L2 _L3
_L1:
        stringbuilder.append(pluginResult.getMessage());
_L5:
        stringbuilder.append("],").append(pluginResult.getKeepCallback()).append(");");
        return;
_L3:
        stringbuilder.append("atob('").append(pluginResult.getMessage()).append("')");
        continue; /* Loop/switch isn't completed */
_L2:
        stringbuilder.append("cordova.require('cordova/base64').toArrayBuffer('").append(pluginResult.getMessage()).append("')");
        if (true) goto _L5; else goto _L4
_L4:
    }

    void encodeAsMessage(StringBuilder stringbuilder)
    {
        if (pluginResult == null)
        {
            stringbuilder.append('J').append(jsPayloadOrCallbackId);
            return;
        }
        int i = pluginResult.getStatus();
        char c;
        StringBuilder stringbuilder1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (i == pluginResult.pluginResult())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i == pluginResult.pluginResult())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = pluginResult.getKeepCallback();
        if (flag || flag1)
        {
            c = 'S';
        } else
        {
            c = 'F';
        }
        stringbuilder1 = stringbuilder.append(c);
        if (flag2)
        {
            c = '1';
        } else
        {
            c = '0';
        }
        stringbuilder1.append(c).append(i).append(' ').append(jsPayloadOrCallbackId).append(' ');
        switch (pluginResult.getMessageType())
        {
        case 2: // '\002'
        default:
            stringbuilder.append(pluginResult.getMessage());
            return;

        case 4: // '\004'
            stringbuilder.append(pluginResult.getMessage().charAt(0));
            return;

        case 5: // '\005'
            stringbuilder.append('N');
            return;

        case 3: // '\003'
            stringbuilder.append('n').append(pluginResult.getMessage());
            return;

        case 1: // '\001'
            stringbuilder.append('s');
            stringbuilder.append(pluginResult.getStrMessage());
            return;

        case 7: // '\007'
            stringbuilder.append('S');
            stringbuilder.append(pluginResult.getMessage());
            return;

        case 6: // '\006'
            stringbuilder.append('A');
            stringbuilder.append(pluginResult.getMessage());
            return;
        }
    }

    _cls9(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            jsPayloadOrCallbackId = s;
            pluginResult = null;
            return;
        }
    }

    pluginResult(PluginResult pluginresult, String s)
    {
        if (s == null || pluginresult == null)
        {
            throw new NullPointerException();
        } else
        {
            jsPayloadOrCallbackId = s;
            pluginResult = pluginresult;
            return;
        }
    }
}
