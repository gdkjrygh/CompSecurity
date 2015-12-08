// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm.model;


// Referenced classes of package com.netflix.mediaclient.service.logging.apm.model:
//            Display

public static final class desc extends Enum
{

    private static final _4x3 $VALUES[];
    public static final _4x3 _16x9;
    public static final _4x3 _4x3;
    private String desc;

    public static desc find(String s)
    {
        if (_16x9.desc.equals(s))
        {
            return _16x9;
        }
        if (_4x3.desc.equals(s))
        {
            return _4x3;
        } else
        {
            return null;
        }
    }

    public static _4x3 valueOf(String s)
    {
        return (_4x3)Enum.valueOf(com/netflix/mediaclient/service/logging/apm/model/Display$AspectRatio, s);
    }

    public static _4x3[] values()
    {
        return (_4x3[])$VALUES.clone();
    }

    public String getDesc()
    {
        return desc;
    }

    static 
    {
        _16x9 = new <init>("_16x9", 0, "16x9");
        _4x3 = new <init>("_4x3", 1, "4x3");
        $VALUES = (new .VALUES[] {
            _16x9, _4x3
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        desc = s1;
    }
}
