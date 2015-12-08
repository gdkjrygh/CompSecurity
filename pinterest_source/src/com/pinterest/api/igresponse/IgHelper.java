// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igresponse;

import com.pinterest.api.ApiResponse;
import com.pinterest.reporting.CrashReporting;
import java.io.IOException;

// Referenced classes of package com.pinterest.api.igresponse:
//            IgResponse, IgPinFeedResponse__JsonHelper

public class IgHelper
{

    public static ApiResponse a(ResponseType responsetype, String s)
    {
        Object obj = null;
        int i = _cls1.a[responsetype.ordinal()];
        i;
        JVM INSTR tableswitch 1 1: default 32
    //                   1 55;
           goto _L1 _L2
_L1:
        responsetype = null;
_L4:
        s = obj;
        if (responsetype != null)
        {
            responsetype.a();
            responsetype.b();
            s = responsetype.c();
        }
        return s;
_L2:
        responsetype = IgPinFeedResponse__JsonHelper.a(s);
        if (true) goto _L4; else goto _L3
_L3:
        responsetype;
        CrashReporting.a(responsetype);
        if (true) goto _L1; else goto _L5
_L5:
    }

    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[ResponseType.values().length];
            try
            {
                a[ResponseType.b.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror) { }
        }
    }


    private class ResponseType extends Enum
    {

        public static final ResponseType a;
        public static final ResponseType b;
        private static final ResponseType c[];

        public static ResponseType valueOf(String s)
        {
            return (ResponseType)Enum.valueOf(com/pinterest/api/igresponse/IgHelper$ResponseType, s);
        }

        public static ResponseType[] values()
        {
            return (ResponseType[])c.clone();
        }

        static 
        {
            a = new ResponseType("NONE", 0);
            b = new ResponseType("PIN_FEED", 1);
            c = (new ResponseType[] {
                a, b
            });
        }

        private ResponseType(String s, int i)
        {
            super(s, i);
        }
    }

}
