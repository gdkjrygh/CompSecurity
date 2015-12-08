// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui;

import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.javabridge.ui:
//            IMedia

public static final class mNccpCode extends Enum
{

    private static final ENHANCED $VALUES[];
    public static final ENHANCED ENHANCED;
    public static final ENHANCED SIMPLE;
    private String mNccpCode;
    private int mValue;

    public static mNccpCode fromNccpCode(String s)
    {
        if (!StringUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = SIMPLE;
_L4:
        return s;
_L2:
        String s1 = s.trim();
        mNccpCode amnccpcode[] = values();
        int j = amnccpcode.length;
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
                mNccpCode mnccpcode = amnccpcode[i];
                s = mnccpcode;
                if (mnccpcode.getNccpCode().equalsIgnoreCase(s1))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return SIMPLE;
    }

    public static SIMPLE valueOf(String s)
    {
        return (SIMPLE)Enum.valueOf(com/netflix/mediaclient/javabridge/ui/IMedia$SubtitleProfile, s);
    }

    public static SIMPLE[] values()
    {
        return (SIMPLE[])$VALUES.clone();
    }

    public String getNccpCode()
    {
        return mNccpCode;
    }

    public final int getValue()
    {
        return mValue;
    }

    static 
    {
        SIMPLE = new <init>("SIMPLE", 0, 0, "simplesdh");
        ENHANCED = new <init>("ENHANCED", 1, 1, "dfxp-ls-sdh");
        $VALUES = (new .VALUES[] {
            SIMPLE, ENHANCED
        });
    }

    private (String s, int i, int j, String s1)
    {
        super(s, i);
        mValue = j;
        mNccpCode = s1;
    }
}
