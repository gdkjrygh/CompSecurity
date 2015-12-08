// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.info;


// Referenced classes of package com.adobe.mediacore.info:
//            Track

public class ClosedCaptionsTrack extends Track
{
    public static final class DefaultCCTypes extends Enum
    {

        private static final DefaultCCTypes $VALUES[];
        public static final DefaultCCTypes CC1;
        public static final DefaultCCTypes CC2;
        public static final DefaultCCTypes CC3;
        public static final DefaultCCTypes CC4;
        public static final DefaultCCTypes CS1;
        public static final DefaultCCTypes CS2;
        public static final DefaultCCTypes CS3;
        public static final DefaultCCTypes CS4;
        public static final DefaultCCTypes CS5;
        public static final DefaultCCTypes CS6;
        private final int value;

        public static DefaultCCTypes valueOf(String s)
        {
            return (DefaultCCTypes)Enum.valueOf(com/adobe/mediacore/info/ClosedCaptionsTrack$DefaultCCTypes, s);
        }

        public static DefaultCCTypes[] values()
        {
            return (DefaultCCTypes[])$VALUES.clone();
        }

        final int getValue()
        {
            return value;
        }

        static 
        {
            CC1 = new DefaultCCTypes("CC1", 0, 0);
            CC2 = new DefaultCCTypes("CC2", 1, 1);
            CC3 = new DefaultCCTypes("CC3", 2, 2);
            CC4 = new DefaultCCTypes("CC4", 3, 3);
            CS1 = new DefaultCCTypes("CS1", 4, 4);
            CS2 = new DefaultCCTypes("CS2", 5, 5);
            CS3 = new DefaultCCTypes("CS3", 6, 6);
            CS4 = new DefaultCCTypes("CS4", 7, 7);
            CS5 = new DefaultCCTypes("CS5", 8, 8);
            CS6 = new DefaultCCTypes("CS6", 9, 9);
            $VALUES = (new DefaultCCTypes[] {
                CC1, CC2, CC3, CC4, CS1, CS2, CS3, CS4, CS5, CS6
            });
        }

        private DefaultCCTypes(String s, int i, int j)
        {
            super(s, i);
            value = j;
        }
    }


    private boolean _isActive;
    private int _serviceType;

    public ClosedCaptionsTrack(String s, int i, String s1, boolean flag, boolean flag1)
    {
        super(s, s1, flag);
        _serviceType = i;
        _isActive = flag1;
    }

    public int getServiceType()
    {
        return _serviceType;
    }

    public boolean isActive()
    {
        return _isActive;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ClosedCaptionsTrack { name: ").append(getName()).append(" serviceType: ").append(getServiceType()).append(" }").toString();
    }
}
