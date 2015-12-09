// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            UserActionLogging

public static final class mValue extends Enum
{

    private static final _4 $VALUES[];
    public static final _4 _1;
    public static final _4 _2;
    public static final _4 _3;
    public static final _4 _4;
    private String mValue;

    public static mValue find(String s)
    {
        if (!StringUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        mValue mvalue = null;
_L4:
        return mvalue;
_L2:
        mValue amvalue[] = values();
        int j = amvalue.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                mValue mvalue1 = amvalue[i];
                mvalue = mvalue1;
                if (mvalue1.getValue().equals(s))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    public static getValue valueOf(String s)
    {
        return (getValue)Enum.valueOf(com/netflix/mediaclient/servicemgr/UserActionLogging$Streams, s);
    }

    public static getValue[] values()
    {
        return (getValue[])$VALUES.clone();
    }

    public String getValue()
    {
        return mValue;
    }

    static 
    {
        _1 = new <init>("_1", 0, "1");
        _2 = new <init>("_2", 1, "2");
        _3 = new <init>("_3", 2, "3");
        _4 = new <init>("_4", 3, "4");
        $VALUES = (new .VALUES[] {
            _1, _2, _3, _4
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        mValue = s1;
    }
}
