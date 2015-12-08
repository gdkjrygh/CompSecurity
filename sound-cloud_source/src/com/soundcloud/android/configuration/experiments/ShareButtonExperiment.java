// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration.experiments;


// Referenced classes of package com.soundcloud.android.configuration.experiments:
//            ExperimentOperations

public class ShareButtonExperiment
{

    public static final String NAME = "player_share_button";
    private static final String VARIATION_ALWAYS = "show_always";
    private static final String VARIATION_LIKED = "show_liked";
    private static final String VARIATION_NEVER = "show_never";
    private final ExperimentOperations experimentOperations;

    public ShareButtonExperiment(ExperimentOperations experimentoperations)
    {
        experimentOperations = experimentoperations;
    }

    public boolean isVisibleOnLoad(boolean flag)
    {
        String s;
        byte byte0;
        s = experimentOperations.getExperimentVariant("player_share_button");
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 52
    //                   17419665: 94
    //                   1118998507: 80
    //                   1120736970: 108;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_108;
_L5:
        switch (byte0)
        {
        default:
            flag = false;
            // fall through

        case 0: // '\0'
            return flag;

        case 1: // '\001'
            return true;
        }
_L3:
        if (s.equals("show_liked"))
        {
            byte0 = 0;
        }
          goto _L5
_L2:
        if (s.equals("show_always"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s.equals("show_never"))
        {
            byte0 = 2;
        }
          goto _L5
    }
}
