// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2;

import Rn;
import Ro;
import oD;
import oO;
import pn;

public final class IpRoutingErrorTask extends oD
{
    public static final class ErrorType extends Enum
    {

        private static final ErrorType $VALUES[];
        public static final ErrorType JSON_ERROR;
        public static final ErrorType NETWORK_ERROR;

        public static ErrorType valueOf(String s)
        {
            return (ErrorType)Enum.valueOf(com/snapchat/android/api2/IpRoutingErrorTask$ErrorType, s);
        }

        public static ErrorType[] values()
        {
            return (ErrorType[])$VALUES.clone();
        }

        static 
        {
            NETWORK_ERROR = new ErrorType("NETWORK_ERROR", 0);
            JSON_ERROR = new ErrorType("JSON_ERROR", 1);
            $VALUES = (new ErrorType[] {
                NETWORK_ERROR, JSON_ERROR
            });
        }

        private ErrorType(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String PATH = "/bq/ip_routing_error";
    private final Rn mIpRoutingErrorMessage = new Rn();

    public IpRoutingErrorTask(ErrorType errortype, String s)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$snapchat$android$api2$IpRoutingErrorTask$ErrorType[];

            static 
            {
                $SwitchMap$com$snapchat$android$api2$IpRoutingErrorTask$ErrorType = new int[ErrorType.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$api2$IpRoutingErrorTask$ErrorType[ErrorType.NETWORK_ERROR.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$api2$IpRoutingErrorTask$ErrorType[ErrorType.JSON_ERROR.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.snapchat.android.api2.IpRoutingErrorTask.ErrorType[errortype.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Invalid error type: ")).append(errortype).toString());

        case 1: // '\001'
            mIpRoutingErrorMessage.a(s);
            return;

        case 2: // '\002'
            mIpRoutingErrorMessage.b(s);
            break;
        }
    }

    public final String getPath()
    {
        return "/bq/ip_routing_error";
    }

    public final pn getRequestPayload()
    {
        return new oO(buildAuthPayload((new Ro()).a(mIpRoutingErrorMessage)));
    }
}
